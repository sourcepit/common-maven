/*
 * Copyright 2014 Bernd Vogt and others.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sourcepit.common.maven.testing;

import java.io.File;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.io.FileUtils;
import org.apache.maven.Maven;
import org.apache.maven.artifact.Artifact;
import org.apache.maven.artifact.InvalidRepositoryException;
import org.apache.maven.artifact.repository.ArtifactRepository;
import org.apache.maven.artifact.resolver.filter.CumulativeScopeArtifactFilter;
import org.apache.maven.cli.event.ExecutionEventLogger;
import org.apache.maven.cli.transfer.BatchModeMavenTransferListener;
import org.apache.maven.eventspy.internal.EventSpyDispatcher;
import org.apache.maven.execution.DefaultMavenExecutionRequest;
import org.apache.maven.execution.ExecutionEvent;
import org.apache.maven.execution.MavenExecutionRequest;
import org.apache.maven.execution.MavenExecutionRequestPopulationException;
import org.apache.maven.execution.MavenExecutionRequestPopulator;
import org.apache.maven.execution.MavenExecutionResult;
import org.apache.maven.execution.MavenSession;
import org.apache.maven.lifecycle.LifecycleExecutionException;
import org.apache.maven.lifecycle.internal.LifecycleDependencyResolver;
import org.apache.maven.model.Model;
import org.apache.maven.model.io.DefaultModelWriter;
import org.apache.maven.plugin.LegacySupport;
import org.apache.maven.project.MavenProject;
import org.apache.maven.repository.RepositorySystem;
import org.apache.maven.settings.building.DefaultSettingsBuildingRequest;
import org.apache.maven.settings.building.SettingsBuilder;
import org.apache.maven.settings.building.SettingsBuildingRequest;
import org.apache.maven.settings.building.SettingsBuildingResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sourcepit.common.maven.core.MavenProjectUtils;

@Named
public class EmbeddedMaven {

   private static final Logger logger = LoggerFactory.getLogger(EmbeddedMaven.class);

   private final Maven maven;

   private final EventSpyDispatcher eventSpyDispatcher;

   private final LifecycleDependencyResolver resolver;

   private final MavenExecutionRequestPopulator executionRequestPopulator;

   private final SettingsBuilder settingsBuilder;

   private final LegacySupport buildContext;

   private final RepositorySystem repositorySystem;

   private File userHome, userSettings, localRepo, remoteRepo;

   @Inject
   public EmbeddedMaven(Maven maven, EventSpyDispatcher eventSpyDispatcher, LifecycleDependencyResolver resolver,
      MavenExecutionRequestPopulator executionRequestPopulator, SettingsBuilder settingsBuilder,
      LegacySupport buildContext, RepositorySystem repositorySystem) {
      this.maven = maven;
      this.eventSpyDispatcher = eventSpyDispatcher;
      this.resolver = resolver;
      this.executionRequestPopulator = executionRequestPopulator;
      this.settingsBuilder = settingsBuilder;
      this.buildContext = buildContext;
      this.repositorySystem = repositorySystem;
   }

   public void dispose() {
      eventSpyDispatcher.close();
   }

   public File getUserHome() {
      return userHome;
   }

   public void setUserHome(File userHome) {
      this.userHome = userHome;
   }

   public File getUserSettings() {
      return userSettings;
   }

   public void setUserSettings(File userSettings) {
      this.userSettings = userSettings;
   }

   public File getLocalRepo() {
      return localRepo;
   }

   public void setLocalRepo(File localRepo) {
      this.localRepo = localRepo;
   }

   public File getRemoteRepo() {
      return remoteRepo;
   }

   public void setRemoteRepo(File remoteRepo) {
      this.remoteRepo = remoteRepo;
   }

   public ArtifactRepository getLocalRepository() {
      try {
         return repositorySystem.createLocalRepository(getLocalRepo());
      }
      catch (InvalidRepositoryException e) {
         throw new IllegalStateException(e);
      }
   }

   public ArtifactRepository getRemoteRepository() {
      final File remoteRepo = getRemoteRepo();
      final String id = remoteRepo.getName();
      final String url;
      try {
         url = remoteRepo.toURI().toURL().toString();
      }
      catch (MalformedURLException e) {
         throw new IllegalStateException(e);
      }
      return repositorySystem.createArtifactRepository(id, url, null, null, null);
   }

   public Artifact createProjectArtifact(Model pom) {
      return repositorySystem.createProjectArtifact(pom.getGroupId(), pom.getArtifactId(), pom.getVersion());
   }

   public Artifact createArtifact(Model pom) {
      return repositorySystem.createArtifact(pom.getGroupId(), pom.getArtifactId(), pom.getVersion(),
         pom.getPackaging());
   }

   public MavenExecutionRequest newMavenExecutionRequest(File pom) throws Exception {
      return newMavenExecutionRequest(pom, "validate");
   }

   public MavenExecutionRequest newMavenExecutionRequest(File pom, String... goals) throws Exception {
      return newMavenExecutionRequest(pom, newSystemProperties(), null, goals);
   }

   public MavenExecutionRequest newMavenExecutionRequest(File pom, Properties systemProperties,
      Properties userProperties, String... goals) throws Exception {
      final MavenExecutionRequest request = new DefaultMavenExecutionRequest();
      if (pom != null) {
         request.setBaseDirectory(pom.getParentFile());
         request.setPom(pom);
      }
      request.setSystemProperties(systemProperties == null ? new Properties() : systemProperties);
      request.setUserProperties(userProperties == null ? new Properties() : userProperties);

      request.setUserSettingsFile(userSettings);

      if (goals != null) {
         request.setGoals(Arrays.asList(goals));
      }

      populateDefaults(request);

      return request;
   }

   public void populateDefaults(final MavenExecutionRequest request)
      throws Exception, MavenExecutionRequestPopulationException {
      request.setExecutionListener(eventSpyDispatcher.chainListener(new ExecutionEventLogger(logger)));
      request.setTransferListener(new BatchModeMavenTransferListener(System.out));

      final SettingsBuildingResult settingsResult = buildSettings(null, request.getUserSettingsFile(),
         request.getSystemProperties(), request.getUserProperties());
      executionRequestPopulator.populateFromSettings(request, settingsResult.getEffectiveSettings());

      if (localRepo != null) {
         request.setLocalRepositoryPath(localRepo);
      }

      if (remoteRepo != null) {
         request.getRemoteRepositories().add(getRemoteRepository());
      }

      executionRequestPopulator.populateDefaults(request);
   }

   public Properties newSystemProperties() {
      Properties properties = new Properties();
      properties.putAll(System.getProperties());
      if (userHome != null && userHome.exists()) {
         properties.put("user.home", userHome.getAbsolutePath());
      }
      return properties;
   }

   public SettingsBuildingResult buildSettings(File globalSettingsFile, File userSettingsFile,
      Properties systemProperties, Properties userProperties) throws Exception {
      final SettingsBuildingRequest settingsRequest = new DefaultSettingsBuildingRequest();
      settingsRequest.setGlobalSettingsFile(globalSettingsFile);
      settingsRequest.setUserSettingsFile(userSettingsFile);
      settingsRequest.setSystemProperties(systemProperties);
      settingsRequest.setUserProperties(userProperties);

      return settingsBuilder.build(settingsRequest);
   }

   public MavenExecutionResult2 buildStubProject(File projectDir) {
      final Model pom = new Model();
      pom.setModelVersion("4.0.0");
      pom.setGroupId("org.sourcepit");
      pom.setArtifactId("stub-project");
      pom.setVersion("1");

      try {
         final File projectPom = File.createTempFile("pom", ".xml", projectDir);
         try {
            new DefaultModelWriter().write(projectPom, null, pom);
            return buildProject(projectPom);
         }
         finally {
            FileUtils.forceDelete(projectPom);
         }
      }
      catch (Exception e) {
         throw new IllegalStateException(e);
      }
   }

   public MavenExecutionResult2 buildProject(File pom) throws Exception {
      return buildProject(pom, null, false);
   }

   public MavenExecutionResult2 buildProject(File pom, boolean resolveDependencies) throws Exception {
      return buildProject(pom, null, resolveDependencies);
   }

   public MavenExecutionResult2 buildProject(File pom, Properties userProperties, boolean resolveDependencies)
      throws Exception {
      final MavenExecutionRequest request = newMavenExecutionRequest(pom, newSystemProperties(), userProperties,
         "compile");
      request.getProjectBuildingRequest().setProcessPlugins(false);
      request.getProjectBuildingRequest().setResolveDependencies(resolveDependencies);

      final MavenSession[] session = new MavenSession[1];
      request.setExecutionListener(new ChainedExecutionListener(request.getExecutionListener()) {
         @Override
         public void sessionStarted(ExecutionEvent event) {
            super.sessionStarted(event);
            session[0] = event.getSession();
            throw new IllegalStateException();
         }
      });

      final MavenExecutionResult2 tmpResult = execute(request);
      if (session[0] == null) {
         if (tmpResult.hasExceptions()) {
            throw new IllegalStateException(tmpResult.getExceptions().get(0));
         }
      }

      final MavenExecutionResult2 result = new MavenExecutionResult2Impl(session[0], session[0].getResult());
      if (request.getProjectBuildingRequest().isResolveDependencies()) {
         Set<Artifact> projectArtifacts = new HashSet<Artifact>();

         for (MavenProject mavenProject : result.getTopologicallySortedProjects()) {
            File artifactFile = MavenProjectUtils.getOutputDir(mavenProject);
            if (artifactFile == null) {
               artifactFile = mavenProject.getBasedir();
            }
            mavenProject.getArtifact().setFile(artifactFile);
            mavenProject.getArtifact().setResolved(true);

            projectArtifacts.add(mavenProject.getArtifact());

            mavenProject.addLifecyclePhase("clean");
            mavenProject.addLifecyclePhase("process-resources");
            mavenProject.addLifecyclePhase("compile");

            ArrayList<String> scopesToCollect = new ArrayList<String>();
            Collections.addAll(scopesToCollect, "system", "compile", "provided", "runtime", "test");

            try {
               resolver.resolveProjectDependencies(mavenProject, scopesToCollect, scopesToCollect, result.getSession(),
                  true, Collections.<Artifact> emptySet());
            }
            catch (LifecycleExecutionException e) {
               result.addException(e);
            }

            mavenProject.setArtifactFilter(new CumulativeScopeArtifactFilter(scopesToCollect));
         }
      }
      if (result.hasExceptions()) {
         throw new IllegalStateException(result.getExceptions().get(0));
      }

      return result;
   }

   public MavenExecutionResult2 execute(MavenExecutionRequest request) {
      final MavenSession[] session = new MavenSession[1];
      request.setExecutionListener(new ChainedExecutionListener(request.getExecutionListener()) {
         @Override
         public void sessionStarted(ExecutionEvent event) {
            super.sessionStarted(event);
            session[0] = event.getSession();
         }
      });

      final MavenSession currentSession = buildContext.getSession();
      final MavenExecutionResult result;
      try {
         eventSpyDispatcher.onEvent(request);
         result = maven.execute(request);
         eventSpyDispatcher.onEvent(result);
      }
      finally {
         buildContext.setSession(currentSession);
      }

      return new MavenExecutionResult2Impl(session[0], result);
   }
}

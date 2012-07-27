/**
 * Copyright (c) 2012 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.testing;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import javax.inject.Inject;

import org.apache.maven.Maven;
import org.apache.maven.artifact.Artifact;
import org.apache.maven.artifact.resolver.filter.CumulativeScopeArtifactFilter;
import org.apache.maven.cli.BatchModeMavenTransferListener;
import org.apache.maven.cli.ExecutionEventLogger;
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
import org.apache.maven.project.MavenProject;
import org.apache.maven.settings.building.DefaultSettingsBuildingRequest;
import org.apache.maven.settings.building.SettingsBuilder;
import org.apache.maven.settings.building.SettingsBuildingRequest;
import org.apache.maven.settings.building.SettingsBuildingResult;
import org.codehaus.plexus.ContainerConfiguration;
import org.codehaus.plexus.classworlds.ClassWorld;
import org.codehaus.plexus.logging.Logger;
import org.junit.After;
import org.sourcepit.common.maven.util.MavenProjectUtils;
import org.sourcepit.guplex.test.GuplexTest;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public abstract class EmbeddedMavenTest extends GuplexTest
{
   @Inject
   protected Maven maven;

   @Inject
   protected EventSpyDispatcher eventSpyDispatcher;

   @Inject
   protected Logger logger;

   @Inject
   protected LifecycleDependencyResolver resolver;

   @Inject
   protected MavenExecutionRequestPopulator executionRequestPopulator;

   @Inject
   protected SettingsBuilder settingsBuilder;

   @Override
   protected boolean isUseIndex()
   {
      return true;
   }

   @Override
   protected void customizeContainerConfiguration(ContainerConfiguration containerConfiguration)
   {
      super.customizeContainerConfiguration(containerConfiguration);
      containerConfiguration.setClassWorld(new ClassWorld("plexus.core", getClassLoader()));
   }

   protected File getTestEnvironmentSnapshotFile()
   {
      return null;
   }

   @After
   public void tearDown() throws Exception
   {
      eventSpyDispatcher.close();
      super.tearDown();
   }

   protected MavenExecutionRequest newMavenExecutionRequest(File pom) throws Exception
   {
      return newMavenExecutionRequest(pom, "validate");
   }

   protected MavenExecutionRequest newMavenExecutionRequest(File pom, String... goals) throws Exception
   {
      return newMavenExecutionRequest(pom, newSystemProperties(), null, goals);
   }

   protected MavenExecutionRequest newMavenExecutionRequest(File pom, Properties systemProperties,
      Properties userProperties, String... goals) throws Exception
   {
      final MavenExecutionRequest request = new DefaultMavenExecutionRequest();
      if (pom != null)
      {
         request.setBaseDirectory(pom.getParentFile());
         request.setPom(pom);
      }
      request.setSystemProperties(systemProperties == null ? new Properties() : systemProperties);
      request.setUserProperties(userProperties == null ? new Properties() : userProperties);

      request.setUserSettingsFile(getUserSettingsFile());

      if (goals != null)
      {
         request.setGoals(Arrays.asList(goals));
      }

      populateDefaults(request);

      return request;
   }

   protected void populateDefaults(final MavenExecutionRequest request) throws Exception,
      MavenExecutionRequestPopulationException
   {
      request.setExecutionListener(eventSpyDispatcher.chainListener(new ExecutionEventLogger(logger)));
      request.setTransferListener(new BatchModeMavenTransferListener(System.out));

      final SettingsBuildingResult settingsResult = buildSettings(null, request.getUserSettingsFile(),
         request.getSystemProperties(), request.getUserProperties());
      executionRequestPopulator.populateFromSettings(request, settingsResult.getEffectiveSettings());

      File localRepositoryDir = getLocalRepositoryPath();
      if (localRepositoryDir != null)
      {
         request.setLocalRepositoryPath(localRepositoryDir);
      }

      executionRequestPopulator.populateDefaults(request);
   }

   protected Properties newSystemProperties()
   {
      Properties properties = new Properties();
      properties.putAll(System.getProperties());
      File userHome = getUserHome();
      if (userHome != null && userHome.exists())
      {
         properties.put("user.home", userHome.getAbsolutePath());
      }
      return properties;
   }

   protected File getUserHome()
   {
      return null;
   }

   protected File getUserSettingsFile()
   {
      File userHome = getUserHome();
      if (userHome != null && userHome.exists())
      {
         return new File(userHome, ".m2/settings.xml");
      }
      return null;
   }

   protected File getLocalRepositoryPath()
   {
      final File userHome = getUserHome();
      if (userHome != null && userHome.exists())
      {
         final File userSettingsFile = getUserSettingsFile();
         if (userSettingsFile == null || !userSettingsFile.exists())
         {
            return new File(userHome, ".m2/repository");
         }
      }
      return null;
   }

   protected SettingsBuildingResult buildSettings(File globalSettingsFile, File userSettingsFile,
      Properties systemProperties, Properties userProperties) throws Exception
   {
      final SettingsBuildingRequest settingsRequest = new DefaultSettingsBuildingRequest();
      settingsRequest.setGlobalSettingsFile(globalSettingsFile);
      settingsRequest.setUserSettingsFile(userSettingsFile);
      settingsRequest.setSystemProperties(systemProperties);
      settingsRequest.setUserProperties(userProperties);

      return settingsBuilder.build(settingsRequest);
   }

   protected MavenExecutionResult2 buildProject(File pom) throws Exception
   {
      return buildProject(pom, null, false);
   }

   protected MavenExecutionResult2 buildProject(File pom, boolean resolveDependencies) throws Exception
   {
      return buildProject(pom, null, resolveDependencies);
   }

   protected MavenExecutionResult2 buildProject(File pom, Properties userProperties, boolean resolveDependencies)
      throws Exception
   {
      final MavenExecutionRequest request = newMavenExecutionRequest(pom, newSystemProperties(), userProperties,
         "compile");
      request.getProjectBuildingRequest().setProcessPlugins(false);
      request.getProjectBuildingRequest().setResolveDependencies(resolveDependencies);

      final MavenSession[] session = new MavenSession[1];
      request.setExecutionListener(new ChainedExecutionListener(request.getExecutionListener())
      {
         @Override
         public void sessionStarted(ExecutionEvent event)
         {
            super.sessionStarted(event);
            session[0] = event.getSession();
            throw new IllegalStateException();
         }
      });

      execute(request);

      final MavenExecutionResult2 result = new MavenExecutionResult2Impl(session[0], session[0].getResult());
      if (request.getProjectBuildingRequest().isResolveDependencies())
      {
         Set<Artifact> projectArtifacts = new HashSet<Artifact>();

         for (MavenProject mavenProject : result.getTopologicallySortedProjects())
         {
            File artifactFile = MavenProjectUtils.getOutputDir(mavenProject);
            if (artifactFile == null)
            {
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

            try
            {
               resolver.resolveProjectDependencies(mavenProject, scopesToCollect, scopesToCollect, result.getSession(),
                  true, Collections.<Artifact> emptySet());
            }
            catch (LifecycleExecutionException e)
            {
               result.addException(e);
            }

            mavenProject.setArtifactFilter(new CumulativeScopeArtifactFilter(scopesToCollect));
         }
      }
      if (result.hasExceptions())
      {
         throw new IllegalStateException(result.getExceptions().get(0));
      }

      return result;
   }

   protected File getPomFile(File projectDir)
   {
      return new File(projectDir, "pom.xml");
   }

   protected MavenExecutionResult2 execute(MavenExecutionRequest request)
   {
      final MavenSession[] session = new MavenSession[1];
      request.setExecutionListener(new ChainedExecutionListener(request.getExecutionListener())
      {
         @Override
         public void sessionStarted(ExecutionEvent event)
         {
            super.sessionStarted(event);
            session[0] = event.getSession();
         }
      });
      eventSpyDispatcher.onEvent(request);
      final MavenExecutionResult result = maven.execute(request);
      eventSpyDispatcher.onEvent(result);
      return new MavenExecutionResult2Impl(session[0], result);
   }

   protected MavenProject getProject(List<MavenProject> projects, String artifactId)
   {
      for (MavenProject project : projects)
      {
         if (artifactId.equals(project.getArtifactId()))
         {
            return project;
         }
      }
      return null;
   }
}
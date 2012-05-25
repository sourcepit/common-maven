/**
 * Copyright (c) 2012 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.testing;

import static org.sourcepit.common.utils.io.IOResources.buffIn;
import static org.sourcepit.common.utils.io.IOResources.fileIn;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;
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
import org.codehaus.plexus.DefaultPlexusContainer;
import org.codehaus.plexus.PlexusContainerException;
import org.codehaus.plexus.classworlds.ClassWorld;
import org.codehaus.plexus.classworlds.ClassWorldListener;
import org.codehaus.plexus.classworlds.realm.ClassRealm;
import org.codehaus.plexus.classworlds.realm.NoSuchRealmException;
import org.codehaus.plexus.logging.Logger;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.junit.After;
import org.sonatype.guice.bean.binders.SpaceModule;
import org.sonatype.guice.bean.reflect.URLClassSpace;
import org.sonatype.inject.BeanScanning;
import org.sourcepit.common.maven.environment.EnvironmentPackage;
import org.sourcepit.common.maven.environment.EnvironmentSnapshot;
import org.sourcepit.common.maven.environment.EnvironmentWorkspaceReader;
import org.sourcepit.common.maven.util.MavenProjectUtils;
import org.sourcepit.common.utils.io.IOOperation;
import org.sourcepit.common.utils.lang.Exceptions;
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

   private ClassLoader classLoader;

   private EnvironmentWorkspaceReader workspaceReader;

   private EnvironmentSnapshot envSnapshot;

   @Override
   protected boolean isUseIndex()
   {
      return true;
   }

   @Override
   public void setUp() throws Exception
   {
      envSnapshot = newTestEnvironmentSnapshot();
      if (envSnapshot != null)
      {
         final List<URL> classpath = envSnapshot.getClasspath();
         if (!classpath.isEmpty())
         {
            classLoader = new URLClassLoader(classpath.toArray(new URL[classpath.size()]), super.getClassLoader());
         }

         workspaceReader = new EnvironmentWorkspaceReader(envSnapshot);
      }
      super.setUp();
   }

   @Override
   protected ClassLoader getClassLoader()
   {
      if (classLoader != null)
      {
         return classLoader;
      }
      return super.getClassLoader();
   }

   protected EnvironmentSnapshot newTestEnvironmentSnapshot()
   {
      final File file = getTestEnvironmentSnapshotFile();
      if (file == null)
      {
         return null;
      }

      EnvironmentPackage.eINSTANCE.getClass();

      final Resource eResource = new XMIResourceImpl();
      new IOOperation<InputStream>(buffIn(fileIn(file)))
      {
         @Override
         protected void run(InputStream inputStream) throws IOException
         {
            eResource.load(inputStream, null);
         }
      }.run();
      return (EnvironmentSnapshot) eResource.getContents().get(0);
   }

   @Override
   protected DefaultPlexusContainer newPlexusContainer(final ContainerConfiguration containerConfiguration)
      throws PlexusContainerException
   {
      final BeanScanning beanScanning = isUseIndex() ? BeanScanning.INDEX : BeanScanning.ON;
      final SpaceModule globalSpaceModule = new SpaceModule(new URLClassSpace(getClass().getClassLoader()),
         beanScanning);
      containerConfiguration.setAutoWiring(true);
      return new DefaultPlexusContainer(containerConfiguration, globalSpaceModule);
   }

   @Override
   protected void customizeContainerConfiguration(ContainerConfiguration containerConfiguration)
   {
      super.customizeContainerConfiguration(containerConfiguration);
      containerConfiguration.setClassWorld(new ClassWorld("plexus.core", getClassLoader()));
      if (envSnapshot != null)
      {
         containerConfiguration.getClassWorld().addListener(new ClassWorldListener()
         {
            public void realmDisposed(ClassRealm realm)
            {
            }

            public void realmCreated(ClassRealm newRealm)
            {
               final String id = newRealm.getId();
               if (!id.equals("plexus.core"))
               {
                  final ClassRealm realm;
                  try
                  {
                     realm = newRealm.getWorld().getRealm("plexus.core");
                  }
                  catch (NoSuchRealmException e)
                  {
                     throw Exceptions.pipe(e);
                  }

                  for (String string : envSnapshot.getPackages())
                  {
                     newRealm.importFrom(realm, string + ".*");
                  }
               }
            }
         });
      }
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
      request.setBaseDirectory(pom.getParentFile());
      request.setPom(pom);
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

      if (workspaceReader != null)
      {
         request.setWorkspaceReader(workspaceReader);
      }

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
/**
 * Copyright (c) 2012 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.testing;

import java.io.File;
import java.util.List;
import java.util.Properties;

import javax.inject.Inject;

import org.apache.maven.execution.MavenExecutionRequest;
import org.apache.maven.project.MavenProject;
import org.apache.maven.settings.building.SettingsBuildingResult;
import org.codehaus.plexus.ContainerConfiguration;
import org.codehaus.plexus.classworlds.ClassWorld;
import org.junit.After;
import org.junit.Before;
import org.sourcepit.guplex.test.GuplexTest;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public abstract class EmbeddedMavenTest extends GuplexTest
{
   @Inject
   protected EmbeddedMaven embeddedMaven;

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

   @Override
   @Before
   public void setUp() throws Exception
   {
      super.setUp();
      configure(embeddedMaven);
   }

   protected void configure(EmbeddedMaven embeddedMaven)
   {
      embeddedMaven.setUserHome(getUserHome());
      embeddedMaven.setUserSettings(getUserSettingsFile());
      embeddedMaven.setLocalRepo(getLocalRepositoryPath());
      embeddedMaven.setRemoteRepo(getRemoteRepositoryPath());
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
   
   protected File getRemoteRepositoryPath()
   {
      return null;
   }

   public EmbeddedMaven getEmbeddedMaven()
   {
      return embeddedMaven;
   }

   @After
   public void tearDown() throws Exception
   {
      embeddedMaven.dispose();
      super.tearDown();
   }

   protected MavenExecutionRequest newMavenExecutionRequest(File pom) throws Exception
   {
      return embeddedMaven.newMavenExecutionRequest(pom);
   }

   protected MavenExecutionRequest newMavenExecutionRequest(File pom, String... goals) throws Exception
   {
      return embeddedMaven.newMavenExecutionRequest(pom, goals);
   }

   protected MavenExecutionRequest newMavenExecutionRequest(File pom, Properties systemProperties,
      Properties userProperties, String... goals) throws Exception
   {
      return embeddedMaven.newMavenExecutionRequest(pom, systemProperties, userProperties, goals);
   }

   protected SettingsBuildingResult buildSettings(File globalSettingsFile, File userSettingsFile,
      Properties systemProperties, Properties userProperties) throws Exception
   {
      return embeddedMaven.buildSettings(globalSettingsFile, userSettingsFile, systemProperties, userProperties);
   }
   
   protected MavenExecutionResult2 buildStubProject(File projectDir)
   {
      return embeddedMaven.buildStubProject(projectDir);
   }

   protected MavenExecutionResult2 buildProject(File pom) throws Exception
   {
      return embeddedMaven.buildProject(pom);
   }

   protected MavenExecutionResult2 buildProject(File pom, boolean resolveDependencies) throws Exception
   {
      return embeddedMaven.buildProject(pom, resolveDependencies);
   }

   protected MavenExecutionResult2 buildProject(File pom, Properties userProperties, boolean resolveDependencies)
      throws Exception
   {
      return embeddedMaven.buildProject(pom, userProperties, resolveDependencies);
   }

   protected MavenExecutionResult2 execute(MavenExecutionRequest request)
   {
      return embeddedMaven.execute(request);
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
/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.model.util;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.File;

import javax.validation.ConstraintViolationException;

import org.apache.maven.artifact.Artifact;
import org.apache.maven.artifact.versioning.VersionRange;
import org.apache.maven.model.Build;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.junit.Test;
import org.sourcepit.common.maven.model.MavenArtifact;
import org.sourcepit.common.maven.model.MavenDependency;
import org.sourcepit.common.maven.model.MavenModelPackage;
import org.sourcepit.common.maven.model.MavenProject;
import org.sourcepit.common.maven.model.util.MavenModelUtils;

public class MavenModelUtilsTest
{
   @Test
   public void testToMavenArtifact()
   {
      try
      {
         MavenModelUtils.toMavenArtifact(null);
         fail();
      }
      catch (ConstraintViolationException e)
      {
      }

      Artifact artifact = mock(Artifact.class);
      when(artifact.getFile()).thenReturn(new File(""));
      when(artifact.getGroupId()).thenReturn("groupId");
      when(artifact.getArtifactId()).thenReturn("artifactId");
      when(artifact.getVersion()).thenReturn("1.0");
      when(artifact.getClassifier()).thenReturn("classifier");
      when(artifact.getType()).thenReturn("jar");

      MavenArtifact mavenArtifact = MavenModelUtils.toMavenArtifact(artifact);
      assertThat(mavenArtifact.getFile(), IsEqual.equalTo(artifact.getFile()));
      assertThat(mavenArtifact.getGroupId(), IsEqual.equalTo(artifact.getGroupId()));
      assertThat(mavenArtifact.getArtifactId(), IsEqual.equalTo(artifact.getArtifactId()));
      assertThat(mavenArtifact.getVersion(), IsEqual.equalTo(artifact.getVersion()));
      assertThat(mavenArtifact.getClassifier(), IsEqual.equalTo(artifact.getClassifier()));
      // jar is default
      assertThat(mavenArtifact.eIsSet(MavenModelPackage.eINSTANCE.getClassified_Type()), Is.is(false));
      assertThat(mavenArtifact.getType(), IsEqual.equalTo(artifact.getType()));

      when(artifact.getType()).thenReturn("war");

      mavenArtifact = MavenModelUtils.toMavenArtifact(artifact);
      assertThat(mavenArtifact.eIsSet(MavenModelPackage.eINSTANCE.getClassified_Type()), Is.is(true));
      assertThat(mavenArtifact.getType(), IsEqual.equalTo(artifact.getType()));
   }

   @Test
   public void testToMavenDependency() throws Exception
   {
      try
      {
         MavenModelUtils.toMavenDependecy(null);
         fail();
      }
      catch (ConstraintViolationException e)
      {
      }

      Artifact artifact = mock(Artifact.class);
      when(artifact.getFile()).thenReturn(new File(""));
      when(artifact.getGroupId()).thenReturn("groupId");
      when(artifact.getArtifactId()).thenReturn("artifactId");
      when(artifact.getVersion()).thenReturn("1.0");
      when(artifact.getVersionRange()).thenReturn(VersionRange.createFromVersionSpec("[1,2)"));
      when(artifact.getClassifier()).thenReturn("classifier");
      when(artifact.getType()).thenReturn("jar");
      when(artifact.getScope()).thenReturn("compile");

      MavenDependency mavenDependecy = MavenModelUtils.toMavenDependecy(artifact);
      assertThat(mavenDependecy.getGroupId(), IsEqual.equalTo(artifact.getGroupId()));
      assertThat(mavenDependecy.getArtifactId(), IsEqual.equalTo(artifact.getArtifactId()));
      assertThat(mavenDependecy.getVersionRange(), IsEqual.equalTo(artifact.getVersionRange().toString()));
      assertThat(mavenDependecy.getClassifier(), IsEqual.equalTo(artifact.getClassifier()));

      // jar is default
      assertThat(mavenDependecy.eIsSet(MavenModelPackage.eINSTANCE.getClassified_Type()), Is.is(false));
      assertThat(mavenDependecy.getType(), IsEqual.equalTo(artifact.getType()));
      // compile is default
      assertThat(mavenDependecy.eIsSet(MavenModelPackage.eINSTANCE.getMavenDependency_Scope()), Is.is(false));
      assertThat(mavenDependecy.getScope(), IsEqual.equalTo(artifact.getScope()));

      when(artifact.getType()).thenReturn(null);
      when(artifact.getScope()).thenReturn(null);

      mavenDependecy = MavenModelUtils.toMavenDependecy(artifact);
      assertThat(mavenDependecy.getType(), IsEqual.equalTo("jar"));
      assertThat(mavenDependecy.getScope(), IsEqual.equalTo("compile"));

      when(artifact.getType()).thenReturn("war");
      when(artifact.getScope()).thenReturn("test");

      mavenDependecy = MavenModelUtils.toMavenDependecy(artifact);
      assertThat(mavenDependecy.getType(), IsEqual.equalTo("war"));
      assertThat(mavenDependecy.getScope(), IsEqual.equalTo("test"));
   }

   @Test
   public void testToMavenProject()
   {
      try
      {
         MavenModelUtils.toMavenProject(null);
         fail();
      }
      catch (ConstraintViolationException e)
      {
      }

      org.apache.maven.project.MavenProject project = mock(org.apache.maven.project.MavenProject.class);
      when(project.getBasedir()).thenReturn(new File("projectDir"));
      when(project.getFile()).thenReturn(new File(new File("projectDir"), "pom.xml"));
      when(project.getGroupId()).thenReturn("groupId");
      when(project.getArtifactId()).thenReturn("artifactId");
      when(project.getVersion()).thenReturn("1.0");
      when(project.getPackaging()).thenReturn("jar");
      Build build = mock(Build.class);
      when(project.getBuild()).thenReturn(build);
      when(build.getOutputDirectory()).thenReturn("outputDirectory");
      when(build.getTestOutputDirectory()).thenReturn("testOutputDirectory");

      MavenProject mProject = MavenModelUtils.toMavenProject(project);
      assertThat(mProject.getGroupId(), IsEqual.equalTo(project.getGroupId()));
      assertThat(mProject.getArtifactId(), IsEqual.equalTo(project.getArtifactId()));
      assertThat(mProject.getVersion(), IsEqual.equalTo(project.getVersion()));
      assertThat(mProject.getProjectDirectory(), IsEqual.equalTo(project.getBasedir()));
      assertThat(mProject.getPomFile(), IsEqual.equalTo(project.getFile()));

      assertThat(mProject.getOutputDirectory().getName(), IsEqual.equalTo(project.getBuild().getOutputDirectory()));
      assertThat(mProject.getTestOutputDirectory().getName(), IsEqual.equalTo(project.getBuild().getTestOutputDirectory()));

      // jar is default
      assertThat(mProject.eIsSet(MavenModelPackage.eINSTANCE.getMavenProject_Packaging()), Is.is(false));
      assertThat(mProject.getPackaging(), IsEqual.equalTo(project.getPackaging()));
   }
}

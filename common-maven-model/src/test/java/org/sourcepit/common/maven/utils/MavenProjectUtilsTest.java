/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.utils;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.List;

import java.lang.IllegalArgumentException;

import org.apache.commons.lang.SystemUtils;
import org.apache.maven.artifact.Artifact;
import org.apache.maven.artifact.repository.ArtifactRepository;
import org.apache.maven.project.MavenProject;
import org.junit.Test;
import org.sourcepit.common.maven.AbstractCommonMavenTest;
import org.sourcepit.common.maven.util.MavenProjectUtils;

public class MavenProjectUtilsTest extends AbstractCommonMavenTest
{
   @Test
   public void testGetOutputDir()
   {
      try
      {
         MavenProjectUtils.getOutputDir(null);
         fail();
      }
      catch (IllegalArgumentException e)
      {
      }

      MavenProject project = new MavenProject();

      File outputDir = MavenProjectUtils.getOutputDir(project);
      assertThat(outputDir, nullValue());

      project.getBuild().setOutputDirectory("target/classes");
      try
      {
         MavenProjectUtils.getOutputDir(project);
         fail();
      }
      catch (IllegalStateException e)
      {
      }

      final File pomFile = new File("pom.xml").getAbsoluteFile();
      project.setFile(pomFile);

      outputDir = MavenProjectUtils.getOutputDir(project);
      assertThat(outputDir, notNullValue());
      assertThat(outputDir, equalTo(new File(pomFile.getParentFile(), "target/classes")));

      String absolutePath = SystemUtils.IS_OS_UNIX ? "/target/classes" : "c:/target/classes";
      project.getBuild().setOutputDirectory(absolutePath);
      outputDir = MavenProjectUtils.getOutputDir(project);
      assertThat(outputDir, equalTo(new File(absolutePath)));
   }

   @Test
   public void testGetTestOutputDir()
   {
      try
      {
         MavenProjectUtils.getTestOutputDir(null);
         fail();
      }
      catch (IllegalArgumentException e)
      {
      }

      MavenProject project = new MavenProject();

      File outputDir = MavenProjectUtils.getTestOutputDir(project);
      assertThat(outputDir, nullValue());

      project.getBuild().setTestOutputDirectory("target/classes");
      try
      {
         MavenProjectUtils.getTestOutputDir(project);
         fail();
      }
      catch (IllegalStateException e)
      {
      }

      final File pomFile = new File("pom.xml").getAbsoluteFile();
      project.setFile(pomFile);

      outputDir = MavenProjectUtils.getTestOutputDir(project);
      assertThat(outputDir, notNullValue());
      assertThat(outputDir, equalTo(new File(pomFile.getParentFile(), "target/classes")));

      String absolutePath = SystemUtils.IS_OS_UNIX ? "/target/classes" : "c:/target/classes";
      project.getBuild().setTestOutputDirectory(absolutePath);
      outputDir = MavenProjectUtils.getTestOutputDir(project);
      assertThat(outputDir, equalTo(new File(absolutePath)));
   }

   @Test
   public void testFindReferencedProject() throws Exception
   {
      try
      {
         MavenProjectUtils.findReferencedProject(null, null);
         fail();
      }
      catch (IllegalArgumentException e)
      { // noop
      }

      final File projectDir = getResource("reactor-project");

      final List<MavenProject> projects = buildProject(new File(projectDir, "pom.xml"), true)
         .getTopologicallySortedProjects();
      assertThat(projects.size(), is(3));

      MavenProject projectB = projects.get(1);
      assertThat(projectB.getArtifactId(), equalTo("module-b"));
      MavenProject projectA = projects.get(2);
      assertThat(projectA.getArtifactId(), equalTo("module-a"));

      try
      {
         MavenProjectUtils.findReferencedProject(projectA, null);
         fail();
      }
      catch (IllegalArgumentException e)
      { // noop
      }

      Artifact artifactB = projectA.getArtifacts().iterator().next();
      assertThat(artifactB.getArtifactId(), equalTo("module-b"));

      MavenProject referencedProject = MavenProjectUtils.findReferencedProject(projectA, artifactB);
      assertThat(referencedProject, sameInstance(projectB));
   }

   @Test
   public void testGetSnapshotArtifactRepository() throws Exception
   {
      final File projectDir = getResource("reactor-project");
      final List<MavenProject> projects = buildProject(new File(projectDir, "pom.xml"), true)
         .getTopologicallySortedProjects();
      assertThat(projects.size(), is(3));

      MavenProject reactor = projects.get(0);
      assertThat(reactor.getArtifactId(), equalTo("reactor-project"));
      MavenProject projectB = projects.get(1);
      assertThat(projectB.getArtifactId(), equalTo("module-b"));
      MavenProject projectA = projects.get(2);
      assertThat(projectA.getArtifactId(), equalTo("module-a"));

      ArtifactRepository snapshotRepository = MavenProjectUtils.getSnapshotArtifactRepository(reactor);
      assertNotNull(snapshotRepository);
      assertThat(snapshotRepository.getId(), equalTo("snapshots"));

      ArtifactRepository releaseRepository = MavenProjectUtils.getReleaseArtifactRepository(reactor);
      assertNotNull(releaseRepository);
      assertThat(releaseRepository.getId(), equalTo("releases"));
   }
}

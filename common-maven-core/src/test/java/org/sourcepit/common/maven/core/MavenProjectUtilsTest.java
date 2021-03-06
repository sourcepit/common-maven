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

package org.sourcepit.common.maven.core;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.File;
import java.util.List;

import org.apache.commons.lang.SystemUtils;
import org.apache.maven.artifact.Artifact;
import org.apache.maven.artifact.repository.ArtifactRepository;
import org.apache.maven.model.Build;
import org.apache.maven.project.MavenProject;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.junit.Test;
import org.sourcepit.common.maven.model.MavenModelPackage;

public class MavenProjectUtilsTest extends AbstractCommonMavenTest {
   @Test
   public void testGetOutputDir() {
      try {
         MavenProjectUtils.getOutputDir(null);
         fail();
      }
      catch (IllegalArgumentException e) {
      }

      MavenProject project = new MavenProject();

      File outputDir = MavenProjectUtils.getOutputDir(project);
      assertThat(outputDir, nullValue());

      project.getBuild().setOutputDirectory("target/classes");
      try {
         MavenProjectUtils.getOutputDir(project);
         fail();
      }
      catch (IllegalStateException e) {
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
   public void testGetTestOutputDir() {
      try {
         MavenProjectUtils.getTestOutputDir(null);
         fail();
      }
      catch (IllegalArgumentException e) {
      }

      MavenProject project = new MavenProject();

      File outputDir = MavenProjectUtils.getTestOutputDir(project);
      assertThat(outputDir, nullValue());

      project.getBuild().setTestOutputDirectory("target/classes");
      try {
         MavenProjectUtils.getTestOutputDir(project);
         fail();
      }
      catch (IllegalStateException e) {
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
   public void testFindReferencedProject() throws Exception {
      try {
         MavenProjectUtils.findReferencedProject(null, null);
         fail();
      }
      catch (IllegalArgumentException e) { // noop
      }

      final File projectDir = getResource("reactor-project");

      final List<MavenProject> projects = buildProject(new File(projectDir, "pom.xml"), true).getTopologicallySortedProjects();
      assertThat(projects.size(), is(3));

      MavenProject projectB = projects.get(1);
      assertThat(projectB.getArtifactId(), equalTo("module-b"));
      MavenProject projectA = projects.get(2);
      assertThat(projectA.getArtifactId(), equalTo("module-a"));

      try {
         MavenProjectUtils.findReferencedProject(projectA, null);
         fail();
      }
      catch (IllegalArgumentException e) { // noop
      }

      Artifact artifactB = projectA.getArtifacts().iterator().next();
      assertThat(artifactB.getArtifactId(), equalTo("module-b"));

      MavenProject referencedProject = MavenProjectUtils.findReferencedProject(projectA, artifactB);
      assertThat(referencedProject, sameInstance(projectB));
   }

   @Test
   public void testGetSnapshotArtifactRepository() throws Exception {
      final File projectDir = getResource("reactor-project");
      final List<MavenProject> projects = buildProject(new File(projectDir, "pom.xml"), true).getTopologicallySortedProjects();
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

   @Test
   public void testToMavenProject() {
      try {
         MavenProjectUtils.toMavenProject(null);
         fail();
      }
      catch (IllegalArgumentException e) {
      }

      MavenProject project = mock(MavenProject.class);
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

      org.sourcepit.common.maven.model.MavenProject mProject = MavenProjectUtils.toMavenProject(project);
      assertThat(mProject.getGroupId(), IsEqual.equalTo(project.getGroupId()));
      assertThat(mProject.getArtifactId(), IsEqual.equalTo(project.getArtifactId()));
      assertThat(mProject.getVersion(), IsEqual.equalTo(project.getVersion()));
      assertThat(mProject.getProjectDirectory(), IsEqual.equalTo(project.getBasedir()));
      assertThat(mProject.getPomFile(), IsEqual.equalTo(project.getFile()));

      assertThat(mProject.getOutputDirectory().getName(), IsEqual.equalTo(project.getBuild().getOutputDirectory()));
      assertThat(mProject.getTestOutputDirectory().getName(),
         IsEqual.equalTo(project.getBuild().getTestOutputDirectory()));

      // jar is default
      assertThat(mProject.eIsSet(MavenModelPackage.eINSTANCE.getMavenProject_Packaging()), Is.is(false));
      assertThat(mProject.getPackaging(), IsEqual.equalTo(project.getPackaging()));
   }
}

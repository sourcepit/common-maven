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

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.apache.maven.artifact.Artifact;
import org.apache.maven.project.MavenProject;
import org.junit.Test;
import org.sourcepit.common.maven.core.AbstractCommonMavenTest;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class EmbeddedMavenTestTest extends AbstractCommonMavenTest {


   @Test
   public void testBuildProjectWithDependencies() throws Exception {
      File projectDir = getResource("reactor-project");
      assertTrue(projectDir.exists());

      MavenExecutionResult2 result = buildProject(new File(projectDir, "pom.xml"), true);
      assertNotNull(result.getSession());

      List<MavenProject> projects = result.getTopologicallySortedProjects();
      assertThat(projects.size(), is(3));

      MavenProject reactor = projects.get(0);
      assertThat(reactor.getArtifactId(), equalTo("reactor-project"));
      MavenProject moduleB = projects.get(1);
      assertThat(moduleB.getArtifactId(), equalTo("module-b"));
      MavenProject moduleA = projects.get(2);
      assertThat(moduleA.getArtifactId(), equalTo("module-a"));

      Set<Artifact> dependencyArtifacts = moduleA.getDependencyArtifacts();
      assertNotNull(dependencyArtifacts);
      assertThat(dependencyArtifacts.size(), is(1));
      assertThat(dependencyArtifacts.iterator().next(), equalTo(moduleB.getArtifact()));

      Set<Artifact> artifacts = moduleA.getArtifacts();
      assertNotNull(artifacts);
      assertThat(artifacts.size(), is(1));
      assertThat(artifacts.iterator().next(), equalTo(moduleB.getArtifact()));
   }
}
/**
 * Copyright (c) 2012 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
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
import org.sourcepit.common.maven.AbstractCommonMavenTest;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class EmbeddedMavenTestTest extends AbstractCommonMavenTest
{
   @Test
   public void testBuildProjectWithDependencies() throws Exception
   {
      File projectDir = getResource("reactor-project");
      assertTrue(projectDir.exists());

      MavenExecutionResult2 result = buildProject(projectDir, true);
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
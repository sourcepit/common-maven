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

package org.sourcepit.common.maven.artifact;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.File;

import org.apache.maven.artifact.Artifact;
import org.apache.maven.artifact.versioning.VersionRange;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.junit.Test;
import org.sourcepit.common.maven.artifact.ArtifactHandlerImpl;
import org.sourcepit.common.maven.artifact.MavenArtifactUtils;
import org.sourcepit.common.maven.model.MavenArtifact;
import org.sourcepit.common.maven.model.MavenDependency;
import org.sourcepit.common.maven.model.MavenModelPackage;
import org.sourcepit.common.maven.model.Scope;
import org.sourcepit.common.maven.model.util.MavenModelUtils;

public class MavenArtifactUtilsTest
{
   @Test
   public void testToMavenArtifact()
   {
      try
      {
         MavenArtifactUtils.toMavenArtifact((Artifact) null);
         fail();
      }
      catch (IllegalArgumentException e)
      {
      }

      Artifact artifact = mock(Artifact.class);
      when(artifact.getFile()).thenReturn(new File(""));
      when(artifact.getGroupId()).thenReturn("groupId");
      when(artifact.getArtifactId()).thenReturn("artifactId");
      when(artifact.getVersion()).thenReturn("1.0");
      when(artifact.getClassifier()).thenReturn("classifier");
      when(artifact.getType()).thenReturn("jar");
      when(artifact.getArtifactHandler()).thenReturn(new ArtifactHandlerImpl("jar"));

      MavenArtifact mavenArtifact = MavenArtifactUtils.toMavenArtifact(artifact);
      assertThat(mavenArtifact.getFile(), IsEqual.equalTo(artifact.getFile()));
      assertThat(mavenArtifact.getGroupId(), IsEqual.equalTo(artifact.getGroupId()));
      assertThat(mavenArtifact.getArtifactId(), IsEqual.equalTo(artifact.getArtifactId()));
      assertThat(mavenArtifact.getVersion(), IsEqual.equalTo(artifact.getVersion()));
      assertThat(mavenArtifact.getClassifier(), IsEqual.equalTo(artifact.getClassifier()));
      // jar is default
      assertThat(mavenArtifact.eIsSet(MavenModelPackage.eINSTANCE.getMavenClassified_Type()), Is.is(false));
      assertThat(mavenArtifact.getType(), IsEqual.equalTo(artifact.getType()));

      when(artifact.getType()).thenReturn("war");

      mavenArtifact = MavenArtifactUtils.toMavenArtifact(artifact);
      assertThat(mavenArtifact.eIsSet(MavenModelPackage.eINSTANCE.getMavenClassified_Type()), Is.is(true));
      assertThat(mavenArtifact.getType(), IsEqual.equalTo(artifact.getType()));
   }

   @Test
   public void testToArtifactKey()
   {
      Artifact artifact = mock(Artifact.class);
      when(artifact.getFile()).thenReturn(new File(""));
      when(artifact.getGroupId()).thenReturn("groupId");
      when(artifact.getArtifactId()).thenReturn("artifactId");
      when(artifact.getVersion()).thenReturn("1.0");
      when(artifact.getClassifier()).thenReturn("classifier");
      when(artifact.getType()).thenReturn("test-jar");
      ArtifactHandlerImpl artifactHandler = new ArtifactHandlerImpl("test-jar");
      artifactHandler.setExtension("jar");
      when(artifact.getArtifactHandler()).thenReturn(artifactHandler);

      String key = MavenArtifactUtils.toArtifactKey(artifact).toString();
      assertEquals("groupId:artifactId:test-jar:classifier:1.0", key);

      key = MavenArtifactUtils.toArtifactKey(MavenArtifactUtils.toArtifact(artifact)).toString();
      assertEquals("groupId:artifactId:test-jar:classifier:1.0", key);
   }

   @Test
   public void testToMavenDependency() throws Exception
   {
      try
      {
         MavenArtifactUtils.toMavenDependecy((Artifact) null);
         fail();
      }
      catch (IllegalArgumentException e)
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

      MavenDependency mavenDependecy = MavenArtifactUtils.toMavenDependecy(artifact);
      assertThat(mavenDependecy.getGroupId(), IsEqual.equalTo(artifact.getGroupId()));
      assertThat(mavenDependecy.getArtifactId(), IsEqual.equalTo(artifact.getArtifactId()));
      assertThat(mavenDependecy.getVersionConstraint(), IsEqual.equalTo(artifact.getVersionRange().toString()));
      assertThat(mavenDependecy.getClassifier(), IsEqual.equalTo(artifact.getClassifier()));

      // jar is default
      assertThat(mavenDependecy.eIsSet(MavenModelPackage.eINSTANCE.getMavenClassified_Type()), Is.is(false));
      assertThat(mavenDependecy.getType(), IsEqual.equalTo(artifact.getType()));
      // compile is default
      assertThat(mavenDependecy.eIsSet(MavenModelPackage.eINSTANCE.getDependencyDeclaration_Scope()), Is.is(false));
      assertThat(mavenDependecy.getScope(), IsEqual.equalTo(MavenModelUtils.toScope(artifact.getScope())));

      when(artifact.getType()).thenReturn(null);
      when(artifact.getScope()).thenReturn(null);

      mavenDependecy = MavenArtifactUtils.toMavenDependecy(artifact);
      assertThat(mavenDependecy.getType(), IsEqual.equalTo("jar"));
      assertThat(mavenDependecy.getScope(), IsEqual.equalTo(Scope.COMPILE));

      when(artifact.getType()).thenReturn("war");
      when(artifact.getScope()).thenReturn("test");

      mavenDependecy = MavenArtifactUtils.toMavenDependecy(artifact);
      assertThat(mavenDependecy.getType(), IsEqual.equalTo("war"));
      assertThat(mavenDependecy.getScope(), IsEqual.equalTo(Scope.TEST));
   }
}

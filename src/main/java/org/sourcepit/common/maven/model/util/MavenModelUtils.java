/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.model.util;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang.ObjectUtils;
import org.apache.maven.RepositoryUtils;
import org.apache.maven.artifact.Artifact;
import org.apache.maven.model.Plugin;
import org.sourcepit.common.maven.model.MavenArtifact;
import org.sourcepit.common.maven.model.MavenDependency;
import org.sourcepit.common.maven.model.MavenModelFactory;
import org.sourcepit.common.maven.model.MavenProject;
import org.sourcepit.common.maven.util.MavenProjectUtils;

public final class MavenModelUtils
{
   @NotNull
   public static MavenDependency toMavenDependecy(@NotNull org.sonatype.aether.artifact.Artifact artifact)
   {
      return toMavenDependecy(RepositoryUtils.toArtifact(artifact));
   }

   @NotNull
   public static MavenDependency toMavenDependecy(@NotNull Artifact artifact)
   {
      final MavenDependency dependency = MavenModelFactory.eINSTANCE.createMavenDependency();
      dependency.setGroupId(artifact.getGroupId());
      dependency.setArtifactId(artifact.getArtifactId());
      dependency.setVersionRange(artifact.getVersionRange() == null ? artifact.getVersion() : artifact
         .getVersionRange().toString());
      if (artifact.getClassifier() != null && !ObjectUtils.equals(dependency.getClassifier(), artifact.getClassifier()))
      {
         dependency.setClassifier(artifact.getClassifier());
      }
      if (artifact.getType() != null && !ObjectUtils.equals(dependency.getType(), artifact.getType()))
      {
         dependency.setType(artifact.getType());
      }
      if (artifact.getScope() != null && !ObjectUtils.equals(dependency.getScope(), artifact.getScope()))
      {
         dependency.setScope(artifact.getScope());
      }
      dependency.setOptional(artifact.isOptional());
      return dependency;
   }

   @NotNull
   public static MavenArtifact toMavenArtifact(@NotNull org.sonatype.aether.artifact.Artifact artifact)
   {
      return toMavenArtifact(RepositoryUtils.toArtifact(artifact));
   }

   @NotNull
   public static MavenArtifact toMavenArtifact(@NotNull Artifact artifact)
   {
      final MavenArtifact mArtifact = MavenModelFactory.eINSTANCE.createMavenArtifact();
      mArtifact.setGroupId(artifact.getGroupId());
      mArtifact.setArtifactId(artifact.getArtifactId());
      mArtifact.setVersion(artifact.getVersion());
      if (artifact.getClassifier() != null && !ObjectUtils.equals(mArtifact.getClassifier(), artifact.getClassifier()))
      {
         mArtifact.setClassifier(artifact.getClassifier());
      }
      if (artifact.getType() != null && !ObjectUtils.equals(mArtifact.getType(), artifact.getType()))
      {
         mArtifact.setType(artifact.getType());
      }
      mArtifact.setFile(artifact.getFile());
      return mArtifact;
   }

   public static MavenProject toMavenProject(@NotNull org.apache.maven.project.MavenProject mavenProject)
   {
      final MavenProject mProject = MavenModelFactory.eINSTANCE.createMavenProject();
      mProject.setGroupId(mavenProject.getGroupId());
      mProject.setArtifactId(mavenProject.getArtifactId());
      mProject.setVersion(mavenProject.getVersion());
      if (mavenProject.getPackaging() != null
         && !ObjectUtils.equals(mProject.getPackaging(), mavenProject.getPackaging()))
      {
         mProject.setPackaging(mavenProject.getPackaging());
      }
      mProject.setPomFile(mavenProject.getFile());
      mProject.setOutputDirectory(MavenProjectUtils.getOutputDir(mavenProject));
      mProject.setTestOutputDirectory(MavenProjectUtils.getTestOutputDir(mavenProject));
      return mProject;
   }

   @NotNull
   public static MavenArtifact parseArtifactKey(final String artifactKey)
   {
      final String[] segments = artifactKey.split(":");
      if (segments.length > 3 && segments.length < 6)
      {
         final MavenArtifact artifact = MavenModelFactory.eINSTANCE.createMavenArtifact();
         artifact.setGroupId(segments[0]);
         artifact.setArtifactId(segments[1]);
         final String type = segments[2];
         if (!"jar".equals(type))
         {
            artifact.setType(type);
         }
         if (segments.length > 4) // has classifier
         {
            artifact.setClassifier(segments[3]);
            artifact.setVersion(segments[4]);
         }
         else
         {
            artifact.setVersion(segments[3]);
         }
         return artifact;
      }
      else
      {
         throw new IllegalArgumentException("Invalid artifact key: " + artifactKey);
      }
   }

   @NotNull
   public static String toArtifactKey(@NotNull MavenArtifact artifact)
   {
      return toArtifactKey(artifact.getGroupId(), artifact.getArtifactId(), artifact.getType(),
         artifact.getClassifier(), artifact.getVersion());
   }

   @NotNull
   public static String toArtifactKey(@NotNull String groupId, @NotNull String artifactId, @NotNull String type,
      String classifier, @NotNull String version)
   {
      final StringBuilder sb = new StringBuilder();
      sb.append(groupId);
      sb.append(':');
      sb.append(artifactId);
      sb.append(':');
      sb.append(type);
      if (classifier != null)
      {
         sb.append(':');
         sb.append(classifier);
      }
      sb.append(':');
      sb.append(version);
      return sb.toString();
   }

   @NotNull
   public static Plugin createPlugin(String groupId, @NotNull String artifactId, String version)
   {
      final Plugin plugin = new Plugin();
      plugin.setGroupId(groupId);
      plugin.setArtifactId(artifactId);
      plugin.setVersion(version);
      return plugin;
   }
}

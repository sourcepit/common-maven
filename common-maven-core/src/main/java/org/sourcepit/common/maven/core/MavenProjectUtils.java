/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.core;

import java.io.File;

import org.sourcepit.common.constraints.NotNull;
import org.sourcepit.common.maven.model.MavenModelFactory;
import org.apache.commons.lang.ObjectUtils;
import org.apache.maven.artifact.Artifact;
import org.apache.maven.artifact.repository.ArtifactRepository;
import org.apache.maven.project.MavenProject;

public final class MavenProjectUtils
{
   private MavenProjectUtils()
   {
      super();
   }

   public static File getOutputDir(@NotNull MavenProject project)
   {
      final String path = project.getBuild().getOutputDirectory(); // getBuild never returns null
      return getDirInProject(project, path);
   }

   public static File getTestOutputDir(@NotNull MavenProject project)
   {
      final String path = project.getBuild().getTestOutputDirectory(); // getBuild never returns null
      return getDirInProject(project, path);
   }

   private static File getDirInProject(MavenProject project, String path)
   {
      if (path != null)
      {
         final File file = new File(path);
         if (!file.isAbsolute())
         {
            return new File(getProjectBaseDir(project), path);
         }
         return file;
      }
      return null;
   }

   @NotNull
   private static File getProjectBaseDir(MavenProject project)
   {
      return project.getBasedir();
   }

   public static MavenProject findReferencedProject(@NotNull MavenProject project, @NotNull Artifact artifact)
   {
      final String referenceId = getProjectReferenceId(artifact);
      return project.getProjectReferences().get(referenceId);
   }

   public static String getProjectReferenceId(@NotNull MavenProject project)
   {
      return getProjectReferenceId(project.getGroupId(), project.getArtifactId(), project.getVersion());
   }

   public static String getProjectReferenceId(@NotNull Artifact artifact)
   {
      return getProjectReferenceId(artifact.getGroupId(), artifact.getArtifactId(), artifact.getBaseVersion());
   }

   public static String getProjectReferenceId(@NotNull String groupId, @NotNull String artifactId,
      @NotNull String version)
   {
      StringBuilder buffer = new StringBuilder(128);
      buffer.append(groupId).append(':').append(artifactId).append(':').append(version);
      return buffer.toString();
   }

   public static ArtifactRepository getSnapshotArtifactRepository(@NotNull MavenProject project)
   {
      return getDistributionManagementRepository(project, "1-SNAPSHOT");
   }

   public static ArtifactRepository getReleaseArtifactRepository(@NotNull MavenProject project)
   {
      return getDistributionManagementRepository(project, "1");
   }

   private static ArtifactRepository getDistributionManagementRepository(MavenProject project, String version)
   {
      final MavenProject clone = project.clone();
      clone.setVersion(version);
      clone.getModel().setVersion(version);
      clone.getArtifact().setVersion(version);
      return clone.getDistributionManagementArtifactRepository();
   }
   
   public static org.sourcepit.common.maven.model.MavenProject toMavenProject(@NotNull org.apache.maven.project.MavenProject mavenProject)
   {
      final org.sourcepit.common.maven.model.MavenProject mProject = MavenModelFactory.eINSTANCE.createMavenProject();
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

}
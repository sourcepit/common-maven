/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.util;

import java.io.File;

import javax.validation.constraints.NotNull;

import org.apache.maven.artifact.Artifact;
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


   private static String getProjectReferenceId(Artifact artifact)
   {
      return getProjectReferenceId(artifact.getGroupId(), artifact.getArtifactId(), artifact.getBaseVersion());
   }

   private static String getProjectReferenceId(String groupId, String artifactId, String version)
   {
      StringBuilder buffer = new StringBuilder(128);
      buffer.append(groupId).append(':').append(artifactId).append(':').append(version);
      return buffer.toString();
   }

}

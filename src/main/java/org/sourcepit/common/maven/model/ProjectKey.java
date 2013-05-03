/**
 * Copyright (c) 2013 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.model;

import java.util.regex.Matcher;

import javax.validation.constraints.NotNull;

import org.apache.maven.artifact.Artifact;

public class ProjectKey
{
   private final String version;

   private final ArtifactConflictKey artifactConflictKey;

   public ProjectKey(@NotNull String groupId, @NotNull String artifactId, @NotNull String version)
   {
      this.artifactConflictKey = new ArtifactConflictKey(groupId, artifactId);
      this.version = normalizeSnapshotVersion(version);
   }

   private static String normalizeSnapshotVersion(String version)
   {
      Matcher matcher = Artifact.VERSION_FILE_PATTERN.matcher(version);
      if (matcher.matches())
      {
         return matcher.group(1) + "-SNAPSHOT";
      }
      return version;
   }

   public ArtifactConflictKey getArtifactConflictKey()
   {
      return artifactConflictKey;
   }

   public String getGroupId()
   {
      return artifactConflictKey.getGroupId();
   }

   public String getArtifactId()
   {
      return artifactConflictKey.getArtifactId();
   }

   public String getVersion()
   {
      return version;
   }

   @Override
   public int hashCode()
   {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((artifactConflictKey == null) ? 0 : artifactConflictKey.hashCode());
      result = prime * result + ((version == null) ? 0 : version.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj)
   {
      if (this == obj)
      {
         return true;
      }
      if (obj == null)
      {
         return false;
      }
      if (getClass() != obj.getClass())
      {
         return false;
      }
      ProjectKey other = (ProjectKey) obj;
      if (artifactConflictKey == null)
      {
         if (other.artifactConflictKey != null)
         {
            return false;
         }
      }
      else if (!artifactConflictKey.equals(other.artifactConflictKey))
      {
         return false;
      }
      if (version == null)
      {
         if (other.version != null)
         {
            return false;
         }
      }
      else if (!version.equals(other.version))
      {
         return false;
      }
      return true;
   }

   @Override
   public String toString()
   {
      final StringBuilder sb = new StringBuilder();
      sb.append(getGroupId());
      sb.append(':');
      sb.append(getArtifactId());
      sb.append(':');
      sb.append(version);
      return sb.toString();
   }
}

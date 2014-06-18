/**
 * Copyright (c) 2013 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.model;

import static com.google.common.base.Strings.isNullOrEmpty;

import org.sourcepit.common.constraints.NotNull;

public class ArtifactKey
{
   private final ProjectKey projectKey;

   private final VersionConflictKey versionConflictKey;

   public ArtifactKey(@NotNull String groupId, @NotNull String artifactId, @NotNull String version,
      @NotNull String type, String classifier)
   {
      this.projectKey = new ProjectKey(groupId, artifactId, version);
      this.versionConflictKey = new VersionConflictKey(groupId, artifactId, type, classifier);
   }

   public ArtifactConflictKey getArtifactConflictKey()
   {
      return projectKey.getArtifactConflictKey();
   }

   public VersionConflictKey getVersionConflictKey()
   {
      return versionConflictKey;
   }

   public ProjectKey getProjectKey()
   {
      return projectKey;
   }

   public String getGroupId()
   {
      return projectKey.getGroupId();
   }

   public String getArtifactId()
   {
      return projectKey.getArtifactId();
   }

   public String getVersion()
   {
      return projectKey.getVersion();
   }

   public String getType()
   {
      return versionConflictKey.getType();
   }

   public String getClassifier()
   {
      return versionConflictKey.getClassifier();
   }

   @Override
   public int hashCode()
   {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((projectKey == null) ? 0 : projectKey.hashCode());
      result = prime * result + ((versionConflictKey == null) ? 0 : versionConflictKey.hashCode());
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
      ArtifactKey other = (ArtifactKey) obj;
      if (projectKey == null)
      {
         if (other.projectKey != null)
         {
            return false;
         }
      }
      else if (!projectKey.equals(other.projectKey))
      {
         return false;
      }
      if (versionConflictKey == null)
      {
         if (other.versionConflictKey != null)
         {
            return false;
         }
      }
      else if (!versionConflictKey.equals(other.versionConflictKey))
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
      sb.append(getType());
      if (!isNullOrEmpty(getClassifier()))
      {
         sb.append(':');
         sb.append(getClassifier());
      }
      sb.append(':');
      sb.append(getVersion());
      return sb.toString();
   }
}

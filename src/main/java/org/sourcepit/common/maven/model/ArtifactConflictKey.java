/**
 * Copyright (c) 2013 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.model;

import javax.validation.constraints.NotNull;

public final class ArtifactConflictKey
{
   private final String groupId, artifactId;

   public ArtifactConflictKey(@NotNull String groupId, @NotNull String artifactId)
   {
      this.groupId = groupId;
      this.artifactId = artifactId;
   }

   public String getGroupId()
   {
      return groupId;
   }

   public String getArtifactId()
   {
      return artifactId;
   }

   @Override
   public int hashCode()
   {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((artifactId == null) ? 0 : artifactId.hashCode());
      result = prime * result + ((groupId == null) ? 0 : groupId.hashCode());
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
      ArtifactConflictKey other = (ArtifactConflictKey) obj;
      if (artifactId == null)
      {
         if (other.artifactId != null)
         {
            return false;
         }
      }
      else if (!artifactId.equals(other.artifactId))
      {
         return false;
      }
      if (groupId == null)
      {
         if (other.groupId != null)
         {
            return false;
         }
      }
      else if (!groupId.equals(other.groupId))
      {
         return false;
      }
      return true;
   }

   @Override
   public String toString()
   {
      final StringBuilder sb = new StringBuilder();
      sb.append(groupId);
      sb.append(':');
      sb.append(artifactId);
      return sb.toString();
   }
}

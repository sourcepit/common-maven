/**
 * Copyright (c) 2013 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.model;

import static com.google.common.base.Strings.isNullOrEmpty;

import javax.validation.constraints.NotNull;

public class VersionConflictKey
{
   private final ArtifactConflictKey artifactConflictKey;

   private final String type, classifier;

   public VersionConflictKey(@NotNull String groupId, @NotNull String artifactId, @NotNull String type,
      String classifier)
   {
      this.artifactConflictKey = new ArtifactConflictKey(groupId, artifactId);
      this.type = type;
      this.classifier = "".equals(classifier) ? null : classifier;
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

   public String getType()
   {
      return type;
   }

   public String getClassifier()
   {
      return classifier;
   }

   @Override
   public int hashCode()
   {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((artifactConflictKey == null) ? 0 : artifactConflictKey.hashCode());
      result = prime * result + ((classifier == null) ? 0 : classifier.hashCode());
      result = prime * result + ((type == null) ? 0 : type.hashCode());
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
      VersionConflictKey other = (VersionConflictKey) obj;
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
      if (classifier == null)
      {
         if (other.classifier != null)
         {
            return false;
         }
      }
      else if (!classifier.equals(other.classifier))
      {
         return false;
      }
      if (type == null)
      {
         if (other.type != null)
         {
            return false;
         }
      }
      else if (!type.equals(other.type))
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
      sb.append(type);
      if (!isNullOrEmpty(classifier))
      {
         sb.append(':');
         sb.append(classifier);
      }
      return sb.toString();
   }
}

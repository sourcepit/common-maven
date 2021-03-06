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

package org.sourcepit.common.maven.model;

import org.sourcepit.common.constraints.NotNull;

public final class ArtifactConflictKey {
   private final String groupId, artifactId;

   public ArtifactConflictKey(@NotNull String groupId, @NotNull String artifactId) {
      this.groupId = groupId;
      this.artifactId = artifactId;
   }

   public String getGroupId() {
      return groupId;
   }

   public String getArtifactId() {
      return artifactId;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((artifactId == null) ? 0 : artifactId.hashCode());
      result = prime * result + ((groupId == null) ? 0 : groupId.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      ArtifactConflictKey other = (ArtifactConflictKey) obj;
      if (artifactId == null) {
         if (other.artifactId != null) {
            return false;
         }
      }
      else if (!artifactId.equals(other.artifactId)) {
         return false;
      }
      if (groupId == null) {
         if (other.groupId != null) {
            return false;
         }
      }
      else if (!groupId.equals(other.groupId)) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      final StringBuilder sb = new StringBuilder();
      sb.append(groupId);
      sb.append(':');
      sb.append(artifactId);
      return sb.toString();
   }
}

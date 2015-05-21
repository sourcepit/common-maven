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
import org.sourcepit.common.maven.model.util.MavenModelUtils;

public class ProjectKey {
   private final String version;

   private final ArtifactConflictKey artifactConflictKey;

   public ProjectKey(@NotNull String groupId, @NotNull String artifactId, @NotNull String version) {
      this.artifactConflictKey = new ArtifactConflictKey(groupId, artifactId);
      this.version = MavenModelUtils.normalizeSnapshotVersion(version);
   }

   public ArtifactConflictKey getArtifactConflictKey() {
      return artifactConflictKey;
   }

   public String getGroupId() {
      return artifactConflictKey.getGroupId();
   }

   public String getArtifactId() {
      return artifactConflictKey.getArtifactId();
   }

   public String getVersion() {
      return version;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((artifactConflictKey == null) ? 0 : artifactConflictKey.hashCode());
      result = prime * result + ((version == null) ? 0 : version.hashCode());
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
      ProjectKey other = (ProjectKey) obj;
      if (artifactConflictKey == null) {
         if (other.artifactConflictKey != null) {
            return false;
         }
      }
      else if (!artifactConflictKey.equals(other.artifactConflictKey)) {
         return false;
      }
      if (version == null) {
         if (other.version != null) {
            return false;
         }
      }
      else if (!version.equals(other.version)) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      final StringBuilder sb = new StringBuilder();
      sb.append(getGroupId());
      sb.append(':');
      sb.append(getArtifactId());
      sb.append(':');
      sb.append(version);
      return sb.toString();
   }
}

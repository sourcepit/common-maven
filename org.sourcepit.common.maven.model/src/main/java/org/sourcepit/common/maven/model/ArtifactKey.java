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

import static com.google.common.base.Strings.isNullOrEmpty;

import org.sourcepit.common.constraints.NotNull;

public class ArtifactKey {
   private final ProjectKey projectKey;

   private final VersionConflictKey versionConflictKey;

   public ArtifactKey(@NotNull String groupId, @NotNull String artifactId, @NotNull String version,
      @NotNull String type, String classifier) {
      this.projectKey = new ProjectKey(groupId, artifactId, version);
      this.versionConflictKey = new VersionConflictKey(groupId, artifactId, type, classifier);
   }

   public ArtifactConflictKey getArtifactConflictKey() {
      return projectKey.getArtifactConflictKey();
   }

   public VersionConflictKey getVersionConflictKey() {
      return versionConflictKey;
   }

   public ProjectKey getProjectKey() {
      return projectKey;
   }

   public String getGroupId() {
      return projectKey.getGroupId();
   }

   public String getArtifactId() {
      return projectKey.getArtifactId();
   }

   public String getVersion() {
      return projectKey.getVersion();
   }

   public String getType() {
      return versionConflictKey.getType();
   }

   public String getClassifier() {
      return versionConflictKey.getClassifier();
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((projectKey == null) ? 0 : projectKey.hashCode());
      result = prime * result + ((versionConflictKey == null) ? 0 : versionConflictKey.hashCode());
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
      ArtifactKey other = (ArtifactKey) obj;
      if (projectKey == null) {
         if (other.projectKey != null) {
            return false;
         }
      }
      else if (!projectKey.equals(other.projectKey)) {
         return false;
      }
      if (versionConflictKey == null) {
         if (other.versionConflictKey != null) {
            return false;
         }
      }
      else if (!versionConflictKey.equals(other.versionConflictKey)) {
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
      sb.append(getType());
      if (!isNullOrEmpty(getClassifier())) {
         sb.append(':');
         sb.append(getClassifier());
      }
      sb.append(':');
      sb.append(getVersion());
      return sb.toString();
   }
}

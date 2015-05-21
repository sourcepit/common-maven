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

public class VersionConflictKey {
   private final ArtifactConflictKey artifactConflictKey;

   private final String type, classifier;

   public VersionConflictKey(@NotNull String groupId, @NotNull String artifactId, @NotNull String type,
      String classifier) {
      this.artifactConflictKey = new ArtifactConflictKey(groupId, artifactId);
      this.type = type;
      this.classifier = "".equals(classifier) ? null : classifier;
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

   public String getType() {
      return type;
   }

   public String getClassifier() {
      return classifier;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((artifactConflictKey == null) ? 0 : artifactConflictKey.hashCode());
      result = prime * result + ((classifier == null) ? 0 : classifier.hashCode());
      result = prime * result + ((type == null) ? 0 : type.hashCode());
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
      VersionConflictKey other = (VersionConflictKey) obj;
      if (artifactConflictKey == null) {
         if (other.artifactConflictKey != null) {
            return false;
         }
      }
      else if (!artifactConflictKey.equals(other.artifactConflictKey)) {
         return false;
      }
      if (classifier == null) {
         if (other.classifier != null) {
            return false;
         }
      }
      else if (!classifier.equals(other.classifier)) {
         return false;
      }
      if (type == null) {
         if (other.type != null) {
            return false;
         }
      }
      else if (!type.equals(other.type)) {
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
      sb.append(type);
      if (!isNullOrEmpty(classifier)) {
         sb.append(':');
         sb.append(classifier);
      }
      return sb.toString();
   }
}

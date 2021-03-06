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

package org.sourcepit.common.maven.model.impl;

import org.sourcepit.common.constraints.NotNull;
import org.sourcepit.common.maven.model.ArtifactKey;
import org.sourcepit.common.maven.model.MavenArtifactCoordinates;

public final class MavenArtifactCoordinatesOperations {
   private MavenArtifactCoordinatesOperations() {
      super();
   }

   public static ArtifactKey getArtifactKey(@NotNull MavenArtifactCoordinates o) {
      return new ArtifactKey(o.getGroupId(), o.getArtifactId(), o.getVersion(), o.getType(), o.getClassifier());
   }

}

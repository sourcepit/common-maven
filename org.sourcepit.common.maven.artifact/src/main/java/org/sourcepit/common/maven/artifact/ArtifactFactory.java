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

package org.sourcepit.common.maven.artifact;

import static com.google.common.base.Strings.isNullOrEmpty;
import static org.sourcepit.common.maven.artifact.MavenArtifactUtils.toArtifact;

import java.io.File;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.maven.artifact.DefaultArtifact;
import org.apache.maven.artifact.handler.ArtifactHandler;
import org.eclipse.aether.artifact.Artifact;
import org.sourcepit.common.maven.model.ArtifactKey;

@Named
public class ArtifactFactory {
   private final Map<String, ArtifactHandler> artifactHandlers;

   @Inject
   public ArtifactFactory(Map<String, ArtifactHandler> artifactHandlers) {
      this.artifactHandlers = artifactHandlers;
   }

   public Artifact createArtifact(final Artifact artifact, String classifier, String type) {
      return createArtifact(artifact, classifier, type, null);
   }

   public Artifact createArtifact(final Artifact artifact, String classifier, String type, String localPath) {
      classifier = isNullOrEmpty(classifier) ? null : classifier;

      final String scope = localPath == null ? null : org.apache.maven.artifact.Artifact.SCOPE_SYSTEM;

      final ArtifactHandler handler = artifactHandlers.get(type);

      final DefaultArtifact legacyArtifact = new DefaultArtifact(artifact.getGroupId(), artifact.getArtifactId(),
         artifact.getVersion(), scope, type, classifier, handler);

      if (localPath != null) {
         legacyArtifact.setFile(new File(localPath));
      }

      return toArtifact(legacyArtifact);
   }

   public Artifact createArtifact(ArtifactKey artifactKey) {
      return createArtifact(artifactKey, null);
   }

   public Artifact createArtifact(ArtifactKey artifactKey, String localPath) {
      final ArtifactHandler handler = artifactHandlers.get(artifactKey.getType());

      final String scope = localPath == null ? null : org.apache.maven.artifact.Artifact.SCOPE_SYSTEM;

      final DefaultArtifact legacyArtifact = new DefaultArtifact(artifactKey.getGroupId(), artifactKey.getArtifactId(),
         artifactKey.getVersion(), scope, artifactKey.getType(), artifactKey.getClassifier(), handler);

      if (localPath != null) {
         legacyArtifact.setFile(new File(localPath));
      }

      return toArtifact(legacyArtifact);
   }

}

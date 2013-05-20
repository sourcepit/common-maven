/**
 * Copyright (c) 2013 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.aether;

import static com.google.common.base.Strings.isNullOrEmpty;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.maven.RepositoryUtils;
import org.apache.maven.artifact.DefaultArtifact;
import org.apache.maven.artifact.handler.ArtifactHandler;
import org.sonatype.aether.artifact.Artifact;
import org.sourcepit.common.maven.model.ArtifactKey;

@Named
public class ArtifactFactory
{
   private final Map<String, ArtifactHandler> artifactHandlers;

   @Inject
   public ArtifactFactory(Map<String, ArtifactHandler> artifactHandlers)
   {
      this.artifactHandlers = artifactHandlers;
   }

   public Artifact createArtifact(final Artifact artifact, String classifier, String type)
   {
      classifier = isNullOrEmpty(classifier) ? null : classifier;

      final ArtifactHandler handler = artifactHandlers.get(type);

      final DefaultArtifact legacyArtifact = new DefaultArtifact(artifact.getGroupId(), artifact.getArtifactId(),
         artifact.getVersion(), null, type, classifier, handler);

      return RepositoryUtils.toArtifact(legacyArtifact);
   }

   public Artifact createArtifact(ArtifactKey artifactKey)
   {
      final ArtifactHandler handler = artifactHandlers.get(artifactKey.getType());

      final DefaultArtifact legacyArtifact = new DefaultArtifact(artifactKey.getGroupId(), artifactKey.getArtifactId(),
         artifactKey.getVersion(), null, artifactKey.getType(), artifactKey.getClassifier(), handler);

      return RepositoryUtils.toArtifact(legacyArtifact);
   }
}

/**
 * Copyright (c) 2013 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
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
      return createArtifact(artifact, classifier, type, null);
   }

   public Artifact createArtifact(final Artifact artifact, String classifier, String type, String localPath)
   {
      classifier = isNullOrEmpty(classifier) ? null : classifier;

      final String scope = localPath == null ? null : org.apache.maven.artifact.Artifact.SCOPE_SYSTEM;

      final ArtifactHandler handler = artifactHandlers.get(type);

      final DefaultArtifact legacyArtifact = new DefaultArtifact(artifact.getGroupId(), artifact.getArtifactId(),
         artifact.getVersion(), scope, type, classifier, handler);

      if (localPath != null)
      {
         legacyArtifact.setFile(new File(localPath));
      }

      return toArtifact(legacyArtifact);
   }

   public Artifact createArtifact(ArtifactKey artifactKey)
   {
      return createArtifact(artifactKey, null);
   }

   public Artifact createArtifact(ArtifactKey artifactKey, String localPath)
   {
      final ArtifactHandler handler = artifactHandlers.get(artifactKey.getType());

      final String scope = localPath == null ? null : org.apache.maven.artifact.Artifact.SCOPE_SYSTEM;

      final DefaultArtifact legacyArtifact = new DefaultArtifact(artifactKey.getGroupId(), artifactKey.getArtifactId(),
         artifactKey.getVersion(), scope, artifactKey.getType(), artifactKey.getClassifier(), handler);

      if (localPath != null)
      {
         legacyArtifact.setFile(new File(localPath));
      }

      return toArtifact(legacyArtifact);
   }

}

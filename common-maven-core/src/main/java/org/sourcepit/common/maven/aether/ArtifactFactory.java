/**
 * Copyright (c) 2013 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.aether;

import static com.google.common.base.Strings.isNullOrEmpty;

import java.io.File;
import java.util.Collections;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.maven.artifact.DefaultArtifact;
import org.apache.maven.artifact.handler.ArtifactHandler;
import org.eclipse.aether.artifact.Artifact;
import org.eclipse.aether.artifact.ArtifactProperties;
import org.eclipse.aether.artifact.ArtifactType;
import org.eclipse.aether.artifact.DefaultArtifactType;
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

   private static Artifact toArtifact(org.apache.maven.artifact.Artifact artifact)
   {
      final String groupId = artifact.getGroupId();
      final String artifactId = artifact.getArtifactId();
      final String version = getVersion(artifact);
      final String classifier = artifact.getClassifier();
      final ArtifactHandler artifactHandler = artifact.getArtifactHandler();
      final String extension = artifactHandler.getExtension();
      final Map<String, String> properties = getProperties(artifact);
      final String type = artifact.getType();
      final ArtifactType artifactType = newArtifactType(type, artifactHandler);
      final File file = artifact.getFile();
      return newArtifact(groupId, artifactId, version, classifier, extension, properties, artifactType, file);
   }

   private static Artifact newArtifact(final String groupId, final String artifactId, final String version,
      final String classifier, final String extension, final Map<String, String> properties,
      final ArtifactType artifactType, final File file)
   {
      return new org.eclipse.aether.artifact.DefaultArtifact(groupId, artifactId, classifier, extension, version,
         properties, artifactType).setFile(file);
   }

   private static Map<String, String> getProperties(org.apache.maven.artifact.Artifact artifact)
   {
      final String scope = artifact.getScope();
      if (org.apache.maven.artifact.Artifact.SCOPE_SYSTEM.equals(scope))
      {
         String localPath = (artifact.getFile() != null) ? artifact.getFile().getPath() : "";
         return Collections.singletonMap(ArtifactProperties.LOCAL_PATH, localPath);
      }
      return null;
   }

   private static String getVersion(org.apache.maven.artifact.Artifact artifact)
   {
      String version = artifact.getVersion();
      if (version == null && artifact.getVersionRange() != null)
      {
         version = artifact.getVersionRange().toString();
      }
      return version;
   }

   private static ArtifactType newArtifactType(String id, ArtifactHandler handler)
   {
      return new DefaultArtifactType(id, handler.getExtension(), handler.getClassifier(), handler.getLanguage(),
         handler.isAddedToClasspath(), handler.isIncludesDependencies());
   }
}

/**
 * Copyright (c) 2013 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.model;

import org.sourcepit.common.maven.model.util.MavenModelUtils;

public class ArtifactKeyBuilder
{
   private String groupId, artifactId, type, classifier;

   private String version;

   public ArtifactKeyBuilder setGroupId(String groupId)
   {
      this.groupId = groupId;
      return this;
   }

   public ArtifactKeyBuilder setArtifactId(String artifactId)
   {
      this.artifactId = artifactId;
      return this;
   }

   public ArtifactKeyBuilder setType(String type)
   {
      this.type = type;
      return this;
   }

   public ArtifactKeyBuilder setClassifier(String classifier)
   {
      this.classifier = classifier;
      return this;
   }

   public ArtifactKeyBuilder setVersion(String version)
   {
      this.version = version;
      return this;
   }

   public ArtifactKey toArtifactKey()
   {
      return MavenModelUtils.toArtifactKey(groupId, artifactId, type, classifier, version);
   }

}

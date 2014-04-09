/**
 * Copyright (c) 2013 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.model.impl;

import org.sourcepit.common.constraints.NotNull;

import org.sourcepit.common.maven.model.ArtifactKey;
import org.sourcepit.common.maven.model.MavenArtifactCoordinates;

public final class MavenArtifactCoordinatesOperations
{
   private MavenArtifactCoordinatesOperations()
   {
      super();
   }

   public static ArtifactKey getArtifactKey(@NotNull MavenArtifactCoordinates o)
   {
      return new ArtifactKey(o.getGroupId(), o.getArtifactId(), o.getVersion(), o.getType(), o.getClassifier());
   }

}

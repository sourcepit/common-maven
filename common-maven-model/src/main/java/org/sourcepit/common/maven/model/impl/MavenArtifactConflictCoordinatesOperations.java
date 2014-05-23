/**
 * Copyright (c) 2013 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.model.impl;

import org.sourcepit.common.constraints.NotNull;

import org.sourcepit.common.maven.model.ArtifactConflictKey;
import org.sourcepit.common.maven.model.MavenArtifactConflictCoordinates;

public final class MavenArtifactConflictCoordinatesOperations
{
   private MavenArtifactConflictCoordinatesOperations()
   {
      super();
   }

   public static ArtifactConflictKey getArtifactConflictKey(@NotNull MavenArtifactConflictCoordinates o)
   {
      return new ArtifactConflictKey(o.getGroupId(), o.getArtifactId());
   }
}
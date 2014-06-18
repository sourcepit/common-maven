/**
 * Copyright (c) 2013 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.model;

import org.sourcepit.common.maven.model.impl.MavenArtifactCoordinatesOperations;

public aspect MavenArtifactCoordinatesAspects
{
   pointcut getArtifactKey(MavenArtifactCoordinates o): target(o) && args() && execution(ArtifactKey getArtifactKey());

   ArtifactKey around(MavenArtifactCoordinates o) : getArtifactKey(o){
      return MavenArtifactCoordinatesOperations.getArtifactKey(o);
   }
}

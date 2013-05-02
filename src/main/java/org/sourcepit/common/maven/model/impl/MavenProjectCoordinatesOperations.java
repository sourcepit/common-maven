/**
 * Copyright (c) 2013 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.model.impl;

import javax.validation.constraints.NotNull;

import org.sourcepit.common.maven.model.MavenProjectCoordinates;
import org.sourcepit.common.maven.model.ProjectKey;

public final class MavenProjectCoordinatesOperations
{
   private MavenProjectCoordinatesOperations()
   {
      super();
   }

   public static ProjectKey getProjectKey(@NotNull MavenProjectCoordinates o)
   {
      return new ProjectKey(o.getGroupId(), o.getArtifactId(), o.getVersion());
   }

}

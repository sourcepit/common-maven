/**
 * Copyright (c) 2012 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.model.impl;

import java.io.File;

import javax.validation.constraints.NotNull;

import org.sourcepit.common.maven.model.MavenProject;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class MavenProjectOperations
{
   @NotNull
   public static File getProjectDirectory(@NotNull MavenProject p)
   {
      return p.getPomFile().getParentFile();
   }
}

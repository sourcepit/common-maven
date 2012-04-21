/**
 * Copyright (c) 2012 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.model;

import java.io.File;

import org.sourcepit.common.maven.model.impl.MavenProjectOperations;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public aspect MavenProjectAspects
{
   pointcut getProjectDirectory(MavenProject p): target(p) && args() && execution(File getProjectDirectory());

   File around(MavenProject p) : getProjectDirectory(p){
      return MavenProjectOperations.getProjectDirectory(p);
   }
}

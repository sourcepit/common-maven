/**
 * Copyright (c) 2012 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.testing;

import org.apache.maven.execution.MavenExecutionResult;
import org.apache.maven.execution.MavenSession;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public interface MavenExecutionResult2 extends MavenExecutionResult
{
   MavenSession getSession();
}

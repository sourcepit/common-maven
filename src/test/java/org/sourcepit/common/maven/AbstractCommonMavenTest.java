/**
 * Copyright (c) 2012 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven;

import org.sourcepit.common.maven.testing.EmbeddedMavenEnvironmentTest;
import org.sourcepit.common.testing.Environment;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class AbstractCommonMavenTest extends EmbeddedMavenEnvironmentTest
{
   @Override
   protected Environment newEnvironment()
   {
      return Environment.get("env-test.properties");
   }
}

/**
 * Copyright (c) 2012 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.sourcepit.common.maven.testing.EmbeddedMavenTest;
import org.sourcepit.common.testing.Environment;
import org.sourcepit.common.testing.Workspace;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class AbstractCommonMavenTest extends EmbeddedMavenTest
{
   private final Environment env = Environment.get("env-test.properties");

   private File userHome;

   @Rule
   public Workspace ws = new Workspace(getUserHome(), false);

   @Override
   protected File getUserHome()
   {
      if (userHome == null)
      {
         userHome = new File(env.getBuildDir(), "test-ws");
      }
      return userHome;
   }
   
   protected File getResource(String path) throws IOException
   {
      File resources = env.getPropertyAsFile("test.resources", true);
      File resource = new File(resources, path).getCanonicalFile();
      return ws.importDir(resource);
   }
}

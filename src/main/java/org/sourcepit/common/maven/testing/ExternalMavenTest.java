/**
 * Copyright (c) 2012 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.testing;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import junit.framework.AssertionFailedError;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.OS;
import org.junit.Rule;
import org.sourcepit.common.testing.Environment;
import org.sourcepit.common.testing.ExternalProcess;
import org.sourcepit.common.testing.Workspace;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public abstract class ExternalMavenTest
{
   private final Environment env = newEnvironment();

   @Rule
   public ExternalProcess process = new ExternalProcess();

   @Rule
   public Workspace ws = new Workspace(getBaseDir(), false);

   protected File getBaseDir()
   {
      return getEnvironment().getBuildDir();
   }

   protected abstract Environment newEnvironment();

   protected Environment getEnvironment()
   {
      return env;
   }

   protected Workspace getWs()
   {
      return ws;
   }

   protected int build(final File projectDir, String... args) throws IOException
   {
      final Map<String, String> envs = getEnvironment().newEnvs();
      final CommandLine cmd = newMavenCmd(args);
      return process.execute(envs, projectDir, cmd);
   }

   protected CommandLine newCmd(File binDir, String bat, String sh, String... arguments)
   {
      final CommandLine cmd;
      if (OS.isFamilyWindows() || OS.isFamilyWin9x())
      {
         cmd = process.newCommandLine(new File(binDir, bat));
      }
      else if (OS.isFamilyUnix() || OS.isFamilyMac())
      {
         cmd = process.newCommandLine("sh", new File(binDir, sh).getAbsolutePath());
      }
      else
      {
         throw new AssertionFailedError("Os family");
      }
      cmd.addArguments(arguments);
      return cmd;
   }

   protected CommandLine newMavenCmd(String... arguments)
   {
      final String sh = getEnvironment().isDebugAllowed() && isDebug() ? "mvnDebug" : "mvn";
      final String bat = sh + ".bat";
      final File binDir = new File(getEnvironment().getMavenHome(), "/bin");
      return newCmd(binDir, bat, sh, arguments);
   }

   protected abstract boolean isDebug();

   protected File getResource(String path) throws IOException
   {
      File resources = getResourcesDir();
      assertTrue(resources.exists());
      File resource = new File(resources, path).getCanonicalFile();
      assertTrue(resource.exists());
      return ws.importDir(resource);
   }

   protected File getResourcesDir()
   {
      return getEnvironment().getResourcesDir();
   }
}

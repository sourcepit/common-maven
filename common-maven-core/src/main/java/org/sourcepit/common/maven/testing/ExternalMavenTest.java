/*
 * Copyright 2014 Bernd Vogt and others.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
public abstract class ExternalMavenTest {
   private final Environment env = newEnvironment();

   @Rule
   public ExternalProcess process = new ExternalProcess();

   @Rule
   public Workspace ws = new Workspace(getBaseDir(), false);

   protected File getBaseDir() {
      return getEnvironment().getBuildDir();
   }

   protected abstract Environment newEnvironment();

   protected Environment getEnvironment() {
      return env;
   }

   protected Workspace getWs() {
      return ws;
   }

   protected int build(final File projectDir, String... args) throws IOException {
      final Map<String, String> envs = getEnvironment().newEnvs();
      final CommandLine cmd = newMavenCmd(args);
      return process.execute(envs, projectDir, cmd);
   }

   protected CommandLine newCmd(File binDir, String bat, String sh, String... arguments) {
      final CommandLine cmd;
      if (OS.isFamilyWindows() || OS.isFamilyWin9x()) {
         cmd = process.newCommandLine(new File(binDir, bat));
      }
      else if (OS.isFamilyUnix() || OS.isFamilyMac()) {
         cmd = process.newCommandLine("sh", new File(binDir, sh).getAbsolutePath());
      }
      else {
         throw new AssertionFailedError("Os family");
      }
      cmd.addArguments(arguments);
      return cmd;
   }

   protected CommandLine newMavenCmd(String... arguments) {
      final String sh = getEnvironment().isDebugAllowed() && isDebug() ? "mvnDebug" : "mvn";
      final String bat = sh + ".bat";
      final File binDir = new File(getEnvironment().getMavenHome(), "/bin");
      return newCmd(binDir, bat, sh, arguments);
   }

   protected abstract boolean isDebug();

   protected File getResource(String path) throws IOException {
      File resources = getResourcesDir();
      assertTrue(resources.exists());
      File resource = new File(resources, path).getCanonicalFile();
      assertTrue(resource.exists());
      return ws.importDir(resource);
   }

   protected File getResourcesDir() {
      return getEnvironment().getResourcesDir();
   }
}

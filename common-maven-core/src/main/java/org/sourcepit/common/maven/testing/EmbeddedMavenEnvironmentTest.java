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

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.sourcepit.common.testing.Environment;
import org.sourcepit.common.testing.Workspace;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public abstract class EmbeddedMavenEnvironmentTest extends EmbeddedMavenTest {
   private final Environment env = newEnvironment();

   protected abstract Environment newEnvironment();

   @Rule
   public Workspace ws = newWorkspace();

   protected Workspace newWorkspace() {
      return new Workspace(new File(env.getBuildDir(), "ws"), false);
   }

   public Environment getEnvironment() {
      return env;
   }

   protected Workspace getWs() {
      return ws;
   }

   @Override
   protected File getUserHome() {
      return env.getUserHome();
   }

   protected File getResource(String path) throws IOException {
      File resources = getResourcesDir();
      File resource = new File(resources, path).getCanonicalFile();
      return ws.importFileOrDir(resource);
   }

   protected File getResourcesDir() {
      return getEnvironment().getResourcesDir();
   }
}

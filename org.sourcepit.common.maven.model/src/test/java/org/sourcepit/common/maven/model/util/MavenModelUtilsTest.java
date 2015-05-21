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

package org.sourcepit.common.maven.model.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;
import static org.sourcepit.common.maven.model.util.MavenModelUtils.createPlugin;
import static org.sourcepit.common.maven.model.util.MavenModelUtils.getBuild;

import org.apache.maven.model.Build;
import org.apache.maven.model.Model;
import org.apache.maven.model.Plugin;
import org.codehaus.plexus.util.xml.Xpp3Dom;
import org.junit.Test;

public class MavenModelUtilsTest {

   @Test
   public void testCreatePlugin() throws Exception {
      try {
         MavenModelUtils.createPlugin("", null, "");
         fail();
      }
      catch (IllegalArgumentException e) {
      }

      Plugin plugin = MavenModelUtils.createPlugin("org.sourcepit", "foo-maven-plugin", "1.0.0");
      assertNotNull(plugin);
      assertEquals("org.sourcepit", plugin.getGroupId());
      assertEquals("foo-maven-plugin", plugin.getArtifactId());
      assertEquals("1.0.0", plugin.getVersion());

      plugin = MavenModelUtils.createPlugin(null, "foo-maven-plugin", null);
      assertNotNull(plugin);
      assertEquals("org.apache.maven.plugins", plugin.getGroupId());
      assertEquals("foo-maven-plugin", plugin.getArtifactId());
      assertNull(plugin.getVersion());
   }

   @Test
   public void testGetBuild() {
      try {
         MavenModelUtils.getBuild(null, false);
         fail();
      }
      catch (IllegalArgumentException e) {
      }

      Build build = MavenModelUtils.getBuild(new Model(), false);
      assertNull(build);

      Model model = new Model();
      model.setBuild(new Build());

      build = MavenModelUtils.getBuild(model, false);
      assertNotNull(build);
      assertSame(model.getBuild(), build);

      model = new Model();
      assertNull(model.getBuild());

      build = MavenModelUtils.getBuild(model, true);
      assertNotNull(build);
      assertSame(model.getBuild(), build);
   }

   @Test
   public void testGetPlugin() {
      try {
         MavenModelUtils.getPlugin((Model) null, null, null, false);
         fail();
      }
      catch (IllegalArgumentException e) {
      }

      try {
         MavenModelUtils.getPlugin((Build) null, null, null, false);
         fail();
      }
      catch (IllegalArgumentException e) {
      }

      try {
         MavenModelUtils.getPlugin(new Model(), null, null, false);
         fail();
      }
      catch (IllegalArgumentException e) {
      }

      Plugin plugin = MavenModelUtils.getPlugin(new Model(), null, "foo", false);
      assertNull(plugin);

      Model model = new Model();
      plugin = createPlugin(null, "foo", "1.0.0");
      getBuild(model, true).addPlugin(plugin);

      assertSame(plugin, MavenModelUtils.getPlugin(model, null, "foo", false));

      model = new Model();
      plugin = createPlugin("org.sourcepit", "foo", "1.0.0");
      getBuild(model, true).addPlugin(plugin);

      assertNull(MavenModelUtils.getPlugin(model, null, "foo", false));
      assertSame(plugin, MavenModelUtils.getPlugin(model, "org.sourcepit", "foo", false));

      model = new Model();
      plugin = MavenModelUtils.getPlugin(model, null, "foo", true);
      assertNotNull(plugin);
      assertEquals("org.apache.maven.plugins:foo", plugin.getKey());
      assertNull(plugin.getVersion());

      model = new Model();
      plugin = MavenModelUtils.getPlugin(model, "org.sourcepit", "foo", true);
      assertNotNull(plugin);
      assertEquals("org.sourcepit:foo", plugin.getKey());
      assertNull(plugin.getVersion());
   }

   @Test
   public void testGetConfiguration() {
      try {
         MavenModelUtils.getConfiguration(null, false);
         fail();
      }
      catch (IllegalArgumentException e) {
      }

      Xpp3Dom configuration = MavenModelUtils.getConfiguration(new Plugin(), false);
      assertNull(configuration);

      Plugin model = new Plugin();
      configuration = new Xpp3Dom("configuration");
      model.setConfiguration(configuration);

      Xpp3Dom actualConfiguration = MavenModelUtils.getConfiguration(model, false);
      assertNotNull(actualConfiguration);
      assertSame(model.getConfiguration(), actualConfiguration);
      assertSame(configuration, actualConfiguration);

      model = new Plugin();
      assertNull(model.getConfiguration());

      actualConfiguration = MavenModelUtils.getConfiguration(model, true);
      assertNotNull(actualConfiguration);
      assertSame(model.getConfiguration(), actualConfiguration);
      assertEquals("configuration", actualConfiguration.getName());
      assertNull(actualConfiguration.getValue());
      assertEquals(0, actualConfiguration.getChildCount());
   }
}

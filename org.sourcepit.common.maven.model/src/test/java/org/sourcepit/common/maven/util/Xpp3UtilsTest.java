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

package org.sourcepit.common.maven.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import org.apache.maven.model.Dependency;
import org.codehaus.plexus.util.xml.Xpp3Dom;
import org.junit.Test;

public class Xpp3UtilsTest {

   @Test
   public void testClearChildren() {
      try {
         Xpp3Utils.clearChildren(null);
         fail();
      }
      catch (IllegalArgumentException e) {
      }

      Xpp3Dom node = new Xpp3Dom("node");
      Xpp3Utils.clearChildren(node);
      assertEquals(0, node.getChildCount());

      node.addChild(new Xpp3Dom("child1"));
      assertEquals(1, node.getChildCount());

      Xpp3Utils.clearChildren(node);
      assertEquals(0, node.getChildCount());

      node.addChild(new Xpp3Dom("child1"));
      node.addChild(new Xpp3Dom("child2"));
      assertEquals(2, node.getChildCount());

      Xpp3Utils.clearChildren(node);
      assertEquals(0, node.getChildCount());
   }

   @Test
   public void testNewValueNode() {
      try {
         Xpp3Utils.newValueNode(null, "");
         fail();
      }
      catch (IllegalArgumentException e) {
      }

      Xpp3Dom node = Xpp3Utils.newValueNode("foo", null);
      assertNotNull(node);
      assertEquals(0, node.getChildCount());
      assertNull(node.getValue());

      node = Xpp3Utils.newValueNode("foo", "bar");
      assertNotNull(node);
      assertEquals(0, node.getChildCount());
      assertEquals("bar", node.getValue());
   }

   @Test
   public void testAddValueNode() {
      try {
         Xpp3Utils.addValueNode(null, "foo", "bar");
         fail();
      }
      catch (IllegalArgumentException e) {
      }

      Xpp3Dom parent = new Xpp3Dom("parent");
      assertEquals(0, parent.getChildCount());

      try {
         Xpp3Utils.addValueNode(parent, null, "bar");
         fail();
      }
      catch (IllegalArgumentException e) {
      }

      Xpp3Utils.addValueNode(parent, "foo", null);
      assertEquals(1, parent.getChildCount());

      Xpp3Dom child = parent.getChild(0);
      assertNotNull(child);
      assertEquals("foo", child.getName());
      assertNull(child.getValue());

      Xpp3Utils.addValueNode(parent, "foo2", "bar");
      assertEquals(2, parent.getChildCount());

      assertSame(child, parent.getChild(0));

      child = parent.getChild(1);
      assertNotNull(child);
      assertEquals("foo2", child.getName());
      assertEquals("bar", child.getValue());
   }

   @Test
   public void testNewDependencyNode() {
      try {
         Xpp3Utils.toDependencyNode(null);
         fail();
      }
      catch (IllegalArgumentException e) {
      }

      Xpp3Dom node = Xpp3Utils.toDependencyNode(new Dependency());
      assertNotNull(node);
      assertEquals("dependency", node.getName());
      assertEquals(0, node.getChildCount());

      Dependency dependency = new Dependency();
      dependency.setGroupId("groupId");
      dependency.setArtifactId("artifactId");
      dependency.setVersion("version");
      dependency.setScope("scope");
      dependency.setClassifier("classifier");
      dependency.setType("type");
      dependency.setOptional(true);
      dependency.setSystemPath("/tmp/foo.jar");

      node = Xpp3Utils.toDependencyNode(dependency);
      assertNotNull(node);
      assertEquals("dependency", node.getName());
      assertEquals(8, node.getChildCount());
      assertEquals("groupId", node.getChild(0).getValue());
      assertEquals("artifactId", node.getChild(1).getValue());
      assertEquals("version", node.getChild(2).getValue());
      assertEquals("type", node.getChild(3).getValue());
      assertEquals("classifier", node.getChild(4).getValue());
      assertEquals("scope", node.getChild(5).getValue());
      assertEquals("/tmp/foo.jar", node.getChild(6).getValue());
      assertEquals("true", node.getChild(7).getValue());

      dependency = new Dependency();
      dependency.setGroupId("groupId");
      dependency.setArtifactId("artifactId");
      dependency.setVersion("version");
      dependency.setScope("compile");
      dependency.setClassifier("");
      dependency.setType("jar");
      dependency.setOptional(false);
      dependency.setSystemPath("");

      node = Xpp3Utils.toDependencyNode(dependency);
      assertNotNull(node);
      assertEquals("dependency", node.getName());
      assertEquals(3, node.getChildCount());
   }

}

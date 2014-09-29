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

import org.apache.maven.model.Dependency;
import org.codehaus.plexus.util.xml.Xpp3Dom;
import org.sourcepit.common.constraints.NotNull;

import com.google.common.base.Strings;

public final class Xpp3Utils
{
   private Xpp3Utils()
   {
      super();
   }

   public static void clearChildren(@NotNull Xpp3Dom parent)
   {
      for (int i = parent.getChildCount() - 1; i >= 0; i--)
      {
         parent.removeChild(i);
      }
   }

   public static Xpp3Dom toDependencyNode(@NotNull Dependency dependency)
   {
      final Xpp3Dom dependencyNode = new Xpp3Dom("dependency");
      addDependencyValues(dependencyNode, dependency);
      return dependencyNode;
   }

   public static void addDependencyValues(@NotNull final Xpp3Dom dependencyNode, @NotNull Dependency dependency)
   {
      String value = dependency.getGroupId();
      if (!Strings.isNullOrEmpty(value))
      {
         addValueNode(dependencyNode, "groupId", value);
      }

      value = dependency.getArtifactId();
      if (!Strings.isNullOrEmpty(value))
      {
         addValueNode(dependencyNode, "artifactId", value);
      }

      value = dependency.getVersion();
      if (!Strings.isNullOrEmpty(value))
      {
         addValueNode(dependencyNode, "version", value);
      }

      value = dependency.getType();
      if (!Strings.isNullOrEmpty(value) && !"jar".equals(value))
      {
         addValueNode(dependencyNode, "type", value);
      }

      value = dependency.getClassifier();
      if (!Strings.isNullOrEmpty(value))
      {
         addValueNode(dependencyNode, "classifier", value);
      }

      value = dependency.getScope();
      if (!Strings.isNullOrEmpty(value) && !"compile".equals(value))
      {
         addValueNode(dependencyNode, "scope", value);
      }

      value = dependency.getSystemPath();
      if (!Strings.isNullOrEmpty(value))
      {
         addValueNode(dependencyNode, "systemPath", value);
      }

      value = dependency.getOptional();
      if (!Strings.isNullOrEmpty(value) && !"false".equals(value))
      {
         addValueNode(dependencyNode, "optional", value);
      }
   }

   public static void setValueNode(@NotNull Xpp3Dom parent, @NotNull String name, String value)
   {
      final Xpp3Dom child = parent.getChild(name);
      if (child == null)
      {
         parent.addChild(newValueNode(name, value));
      }
      else
      {
         child.setValue(value);
      }
   }

   public static void addValueNode(@NotNull Xpp3Dom parent, @NotNull String name, String value)
   {
      parent.addChild(newValueNode(name, value));
   }

   public static Xpp3Dom newValueNode(@NotNull String name, String value)
   {
      final Xpp3Dom node = new Xpp3Dom(name);
      node.setValue(value);
      return node;
   }
}

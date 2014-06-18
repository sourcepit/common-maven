/**
 * Copyright (c) 2012 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
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

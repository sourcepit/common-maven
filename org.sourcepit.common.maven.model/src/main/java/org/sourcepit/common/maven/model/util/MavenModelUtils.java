/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.model.util;

import static com.google.common.base.Preconditions.checkState;
import static org.apache.maven.model.Plugin.constructKey;

import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.ObjectUtils;
import org.apache.maven.model.Build;
import org.apache.maven.model.Dependency;
import org.apache.maven.model.Model;
import org.apache.maven.model.Plugin;
import org.apache.maven.model.PluginContainer;
import org.apache.maven.model.PluginExecution;
import org.apache.maven.model.PluginManagement;
import org.codehaus.plexus.util.xml.Xpp3Dom;
import org.sourcepit.common.constraints.NotNull;
import org.sourcepit.common.maven.model.ArtifactKey;
import org.sourcepit.common.maven.model.MavenArtifact;
import org.sourcepit.common.maven.model.MavenDependency;
import org.sourcepit.common.maven.model.MavenModelFactory;
import org.sourcepit.common.maven.model.Scope;
import org.sourcepit.common.maven.model.VersionConflictKey;

public final class MavenModelUtils
{
   

   @NotNull
   public static MavenDependency toMavenDependecy(@NotNull Dependency dependency)
   {
      final MavenDependency mavenDep = MavenModelFactory.eINSTANCE.createMavenDependency();
      mavenDep.setGroupId(dependency.getGroupId());
      mavenDep.setArtifactId(dependency.getArtifactId());
      mavenDep.setVersionConstraint(dependency.getVersion());

      if (mavenDep.isOptional() != dependency.isOptional())
      {
         mavenDep.setOptional(dependency.isOptional());
      }

      if (dependency.getClassifier() != null
         && !ObjectUtils.equals(mavenDep.getClassifier(), dependency.getClassifier()))
      {
         mavenDep.setClassifier(dependency.getClassifier());
      }

      if (dependency.getType() != null && !ObjectUtils.equals(mavenDep.getType(), dependency.getType()))
      {
         mavenDep.setType(dependency.getType());
      }

      if (dependency.getScope() != null)
      {
         final Scope artifactScope = toScope(dependency.getScope());
         if (!ObjectUtils.equals(mavenDep.getScope(), artifactScope))
         {
            mavenDep.setScope(artifactScope);
         }
      }

      return mavenDep;
   }

   public static Scope toScope(@NotNull String scope)
   {
      final Scope result = Scope.get(scope);
      checkState(result != null, "%s is not a valid maven scope", scope);
      return result;
   }


   @NotNull
   public static MavenArtifact parseArtifactKey(final String artifactKey)
   {
      final String[] segments = artifactKey.split(":");
      if (segments.length > 3 && segments.length < 6)
      {
         final MavenArtifact artifact = MavenModelFactory.eINSTANCE.createMavenArtifact();
         artifact.setGroupId(segments[0]);
         artifact.setArtifactId(segments[1]);
         final String type = segments[2];
         if (!"jar".equals(type))
         {
            artifact.setType(type);
         }
         if (segments.length > 4) // has classifier
         {
            artifact.setClassifier(segments[3]);
            artifact.setVersion(segments[4]);
         }
         else
         {
            artifact.setVersion(segments[3]);
         }
         return artifact;
      }
      else
      {
         throw new IllegalArgumentException("Invalid artifact key: " + artifactKey);
      }
   }

   @NotNull
   public static ArtifactKey toArtifactKey(@NotNull MavenArtifact artifact)
   {
      return toArtifactKey(artifact.getGroupId(), artifact.getArtifactId(), artifact.getType(),
         artifact.getClassifier(), artifact.getVersion());
   }


   @NotNull
   public static ArtifactKey toArtifactKey(@NotNull String groupId, @NotNull String artifactId, @NotNull String type,
      String classifier, @NotNull String version)
   {
      return new ArtifactKey(groupId, artifactId, version, type, classifier);
   }

   @NotNull
   public static VersionConflictKey toVersionConflictKey(@NotNull String groupId, @NotNull String artifactId,
      @NotNull String type, String classifier)
   {
      return new VersionConflictKey(groupId, artifactId, type, classifier);
   }

   @NotNull
   public static Plugin createPlugin(String groupId, @NotNull String artifactId, String version)
   {
      final Plugin plugin = new Plugin();
      if (groupId != null)
      {
         plugin.setGroupId(groupId);
      }
      plugin.setArtifactId(artifactId);
      plugin.setVersion(version);
      return plugin;
   }

   public static Build getBuild(@NotNull Model model, boolean createOnDemand)
   {
      Build build = model.getBuild();
      if (build == null && createOnDemand)
      {
         build = new Build();
         model.setBuild(build);
      }
      return build;
   }

   public static PluginManagement getPluginManagement(@NotNull Build build, boolean createOnDemand)
   {
      PluginManagement pluginManagement = build.getPluginManagement();
      if (pluginManagement == null && createOnDemand)
      {
         pluginManagement = new PluginManagement();
         build.setPluginManagement(pluginManagement);
      }
      return pluginManagement;
   }

   public static Plugin getPlugin(@NotNull Model model, String groupId, @NotNull String artifactId,
      boolean createOnDemand)
   {
      final Build build = getBuild(model, createOnDemand);
      if (build != null)
      {
         return getPlugin(build, groupId, artifactId, createOnDemand);
      }
      return null;
   }

   private final static String DEFAULT_GROUP_ID = new Plugin().getGroupId();

   public static Plugin getPlugin(@NotNull PluginContainer build, String groupId, @NotNull String artifactId,
      boolean createOnDemand)
   {
      final String pluginKey = createPluginKey(groupId, artifactId);
      Plugin plugin = build.getPluginsAsMap().get(pluginKey);
      if (plugin == null && createOnDemand)
      {
         plugin = createPlugin(groupId, artifactId, null);
         build.getPlugins().add(plugin);
         build.flushPluginMap();
      }
      return plugin;
   }

   private static String createPluginKey(String groupId, @NotNull String artifactId)
   {
      return Plugin.constructKey(groupId == null ? DEFAULT_GROUP_ID : groupId, artifactId);
   }

   public static Xpp3Dom getConfiguration(@NotNull Plugin plugin, boolean createOnDemand)
   {
      Xpp3Dom configuration = (Xpp3Dom) plugin.getConfiguration();
      if (configuration == null && createOnDemand)
      {
         configuration = new Xpp3Dom("configuration");
         plugin.setConfiguration(configuration);
      }
      return configuration;
   }

   public static PluginExecution getPluginExecution(@NotNull Plugin plugin, boolean createOnDemand,
      @NotNull final String id)
   {
      PluginExecution pluginExecution = plugin.getExecutionsAsMap().get(id);
      if (pluginExecution == null && createOnDemand)
      {
         pluginExecution = new PluginExecution();
         pluginExecution.setId(id);
         plugin.getExecutions().add(pluginExecution);
         plugin.flushExecutionMap();
      }
      return pluginExecution;
   }

   public static Plugin getPlugin(@NotNull PluginContainer build, boolean createOnDemand,
      @NotNull final String groupId, @NotNull final String artifactId, final String version)
   {
      Plugin plugin = build.getPluginsAsMap().get(constructKey(groupId, artifactId));
      if (plugin == null && createOnDemand)
      {
         plugin = new Plugin();
         plugin.setGroupId(groupId);
         plugin.setArtifactId(artifactId);
         plugin.setVersion(version);
         build.getPlugins().add(plugin);
         build.flushPluginMap();
      }
      return plugin;
   }

   public static Dependency getDependency(@NotNull Collection<Dependency> dependencies, @NotNull String groupId,
      @NotNull String artifactId)
   {
      for (Dependency dependency : dependencies)
      {
         if (!groupId.equals(dependency.getGroupId()))
         {
            continue;
         }
         if (!artifactId.equals(dependency.getArtifactId()))
         {
            continue;
         }
         return dependency;
      }
      return null;
   }
   
   private static final Pattern VERSION_FILE_PATTERN = Pattern.compile( "^(.*)-([0-9]{8}.[0-9]{6})-([0-9]+)$" );

   public static String normalizeSnapshotVersion(@NotNull String version)
   {
      Matcher matcher = VERSION_FILE_PATTERN.matcher(version);
      if (matcher.matches())
      {
         return matcher.group(1) + "-SNAPSHOT";
      }
      return version;
   }
}

/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.model.util;

import static com.google.common.base.Preconditions.checkState;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang.ObjectUtils;
import org.apache.maven.RepositoryUtils;
import org.apache.maven.artifact.Artifact;
import org.apache.maven.artifact.handler.ArtifactHandler;
import org.apache.maven.model.Build;
import org.apache.maven.model.Dependency;
import org.apache.maven.model.Model;
import org.apache.maven.model.Plugin;
import org.codehaus.plexus.util.xml.Xpp3Dom;
import org.sourcepit.common.maven.model.ArtifactKey;
import org.sourcepit.common.maven.model.MavenArtifact;
import org.sourcepit.common.maven.model.MavenDependency;
import org.sourcepit.common.maven.model.MavenModelFactory;
import org.sourcepit.common.maven.model.MavenProject;
import org.sourcepit.common.maven.model.Scope;
import org.sourcepit.common.maven.model.VersionConflictKey;
import org.sourcepit.common.maven.util.MavenProjectUtils;
import org.sourcepit.common.modeling.Annotation;

public final class MavenModelUtils
{
   @NotNull
   public static MavenDependency toMavenDependecy(@NotNull org.sonatype.aether.artifact.Artifact artifact)
   {
      return toMavenDependecy(RepositoryUtils.toArtifact(artifact));
   }

   @NotNull
   public static MavenDependency toMavenDependecy(@NotNull Artifact artifact)
   {
      final MavenDependency dependency = MavenModelFactory.eINSTANCE.createMavenDependency();
      dependency.setGroupId(artifact.getGroupId());
      dependency.setArtifactId(artifact.getArtifactId());
      dependency.setVersionConstraint(artifact.getVersionRange() == null ? artifact.getVersion() : artifact
         .getVersionRange().toString());

      if (dependency.isOptional() != artifact.isOptional())
      {
         dependency.setOptional(artifact.isOptional());
      }

      if (artifact.getClassifier() != null && !ObjectUtils.equals(dependency.getClassifier(), artifact.getClassifier()))
      {
         dependency.setClassifier(artifact.getClassifier());
      }

      if (artifact.getType() != null && !ObjectUtils.equals(dependency.getType(), artifact.getType()))
      {
         dependency.setType(artifact.getType());
      }

      if (artifact.getScope() != null)
      {
         final Scope artifactScope = toScope(artifact.getScope());
         if (!ObjectUtils.equals(dependency.getScope(), artifactScope))
         {
            dependency.setScope(artifactScope);
         }
      }

      return dependency;
   }

   @NotNull
   public static MavenDependency toMavenDependecy(@NotNull org.sonatype.aether.graph.Dependency dependency)
   {
      final Artifact artifact = RepositoryUtils.toArtifact(dependency.getArtifact());

      final MavenDependency mavenDep = MavenModelFactory.eINSTANCE.createMavenDependency();
      mavenDep.setGroupId(artifact.getGroupId());
      mavenDep.setArtifactId(artifact.getArtifactId());
      mavenDep.setVersionConstraint(artifact.getVersion());

      if (mavenDep.isOptional() != dependency.isOptional())
      {
         mavenDep.setOptional(dependency.isOptional());
      }

      if (artifact.getClassifier() != null && !ObjectUtils.equals(mavenDep.getClassifier(), artifact.getClassifier()))
      {
         mavenDep.setClassifier(artifact.getClassifier());
      }

      if (artifact.getType() != null && !ObjectUtils.equals(mavenDep.getType(), artifact.getType()))
      {
         mavenDep.setType(artifact.getType());
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
   public static MavenArtifact toMavenArtifact(@NotNull org.sonatype.aether.artifact.Artifact artifact)
   {
      return toMavenArtifact(RepositoryUtils.toArtifact(artifact));
   }

   @NotNull
   public static MavenArtifact toMavenArtifact(@NotNull Artifact artifact)
   {
      final MavenArtifact mavenArtifact = MavenModelFactory.eINSTANCE.createMavenArtifact();
      mavenArtifact.setGroupId(artifact.getGroupId());
      mavenArtifact.setArtifactId(artifact.getArtifactId());
      mavenArtifact.setVersion(artifact.getVersion());
      if (artifact.getClassifier() != null
         && !ObjectUtils.equals(mavenArtifact.getClassifier(), artifact.getClassifier()))
      {
         mavenArtifact.setClassifier(artifact.getClassifier());
      }
      if (artifact.getType() != null && !ObjectUtils.equals(mavenArtifact.getType(), artifact.getType()))
      {
         mavenArtifact.setType(artifact.getType());
      }
      mavenArtifact.setFile(artifact.getFile());

      final ArtifactHandler artifactHandler = artifact.getArtifactHandler();

      final Annotation annotation = mavenArtifact.getAnnotation(ArtifactHandler.class.getName(), true);
      annotation.setData("packaging", artifactHandler.getPackaging());
      annotation.setData("directory", artifactHandler.getDirectory());
      annotation.setData("extension", artifactHandler.getExtension());
      annotation.setData("language", artifactHandler.getLanguage());
      annotation.setData("classifier", artifactHandler.getClassifier());
      annotation.setData("includesDependencies", artifactHandler.isIncludesDependencies());
      annotation.setData("addedToClasspath", artifactHandler.isAddedToClasspath());
      return mavenArtifact;
   }

   public static MavenProject toMavenProject(@NotNull org.apache.maven.project.MavenProject mavenProject)
   {
      final MavenProject mProject = MavenModelFactory.eINSTANCE.createMavenProject();
      mProject.setGroupId(mavenProject.getGroupId());
      mProject.setArtifactId(mavenProject.getArtifactId());
      mProject.setVersion(mavenProject.getVersion());
      if (mavenProject.getPackaging() != null
         && !ObjectUtils.equals(mProject.getPackaging(), mavenProject.getPackaging()))
      {
         mProject.setPackaging(mavenProject.getPackaging());
      }
      mProject.setPomFile(mavenProject.getFile());
      mProject.setOutputDirectory(MavenProjectUtils.getOutputDir(mavenProject));
      mProject.setTestOutputDirectory(MavenProjectUtils.getTestOutputDir(mavenProject));
      return mProject;
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
   public static ArtifactKey toArtifactKey(@NotNull Artifact artifact)
   {
      return toArtifactKey(artifact.getGroupId(), artifact.getArtifactId(), artifact.getType(),
         artifact.getClassifier(), artifact.getVersion());
   }

   @NotNull
   public static ArtifactKey toArtifactKey(@NotNull org.sonatype.aether.artifact.Artifact artifact)
   {
      return toArtifactKey(RepositoryUtils.toArtifact(artifact));
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

   public static Plugin getPlugin(@NotNull Build build, String groupId, @NotNull String artifactId,
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
}

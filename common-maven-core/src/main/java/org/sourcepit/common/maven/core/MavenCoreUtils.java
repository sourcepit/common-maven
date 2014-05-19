/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.core;

import org.apache.commons.lang.ObjectUtils;
import org.apache.maven.RepositoryUtils;
import org.apache.maven.artifact.Artifact;
import org.apache.maven.artifact.handler.ArtifactHandler;
import org.sourcepit.common.constraints.NotNull;
import org.sourcepit.common.maven.model.ArtifactKey;
import org.sourcepit.common.maven.model.MavenArtifact;
import org.sourcepit.common.maven.model.MavenDependency;
import org.sourcepit.common.maven.model.MavenModelFactory;
import org.sourcepit.common.maven.model.Scope;
import org.sourcepit.common.maven.model.util.MavenModelUtils;
import org.sourcepit.common.modeling.Annotation;

public final class MavenCoreUtils
{
   @NotNull
   public static MavenDependency toMavenDependecy(@NotNull org.eclipse.aether.artifact.Artifact artifact)
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
         final Scope artifactScope = MavenModelUtils.toScope(artifact.getScope());
         if (!ObjectUtils.equals(dependency.getScope(), artifactScope))
         {
            dependency.setScope(artifactScope);
         }
      }

      return dependency;
   }

   @NotNull
   public static MavenDependency toMavenDependecy(@NotNull org.eclipse.aether.graph.Dependency dependency)
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
         final Scope artifactScope = MavenModelUtils.toScope(dependency.getScope());
         if (!ObjectUtils.equals(mavenDep.getScope(), artifactScope))
         {
            mavenDep.setScope(artifactScope);
         }
      }

      return mavenDep;
   }


   @NotNull
   public static MavenArtifact toMavenArtifact(@NotNull org.eclipse.aether.artifact.Artifact artifact)
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


   @NotNull
   public static ArtifactKey toArtifactKey(@NotNull Artifact artifact)
   {
      return MavenModelUtils.toArtifactKey(artifact.getGroupId(), artifact.getArtifactId(), artifact.getType(),
         artifact.getClassifier(), artifact.getVersion());
   }

   @NotNull
   public static ArtifactKey toArtifactKey(@NotNull org.eclipse.aether.artifact.Artifact artifact)
   {
      return toArtifactKey(RepositoryUtils.toArtifact(artifact));
   }

}

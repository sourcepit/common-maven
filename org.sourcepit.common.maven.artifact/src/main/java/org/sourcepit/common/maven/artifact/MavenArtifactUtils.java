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

package org.sourcepit.common.maven.artifact;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.ObjectUtils;
import org.apache.maven.artifact.Artifact;
import org.apache.maven.artifact.handler.ArtifactHandler;
import org.eclipse.aether.artifact.ArtifactProperties;
import org.eclipse.aether.artifact.ArtifactType;
import org.eclipse.aether.artifact.DefaultArtifactType;
import org.sourcepit.common.constraints.NotNull;
import org.sourcepit.common.maven.model.ArtifactKey;
import org.sourcepit.common.maven.model.MavenArtifact;
import org.sourcepit.common.maven.model.MavenDependency;
import org.sourcepit.common.maven.model.MavenModelFactory;
import org.sourcepit.common.maven.model.Scope;
import org.sourcepit.common.maven.model.util.MavenModelUtils;
import org.sourcepit.common.modeling.Annotation;

public final class MavenArtifactUtils
{
   private MavenArtifactUtils()
   {
      super();
   }

   @NotNull
   public static MavenDependency toMavenDependecy(@NotNull org.eclipse.aether.artifact.Artifact artifact)
   {
      return toMavenDependecy(toArtifact(artifact));
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
      final Artifact artifact = toArtifact(dependency.getArtifact());

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
      return toMavenArtifact(toArtifact(artifact));
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
      return toArtifactKey(toArtifact(artifact));
   }

   public static Artifact toArtifact(org.eclipse.aether.artifact.Artifact artifact)
   {
      if (artifact == null)
      {
         return null;
      }

      ArtifactHandler handler = newHandler(artifact);

      /*
       * NOTE: From Artifact.hasClassifier(), an empty string and a null both denote "no classifier". However, some
       * plugins only check for null, so be sure to nullify an empty classifier.
       */
      org.apache.maven.artifact.Artifact result = new org.apache.maven.artifact.DefaultArtifact(artifact.getGroupId(),
         artifact.getArtifactId(), artifact.getVersion(), null, artifact.getProperty(ArtifactProperties.TYPE,
            artifact.getExtension()), nullify(artifact.getClassifier()), handler);

      result.setFile(artifact.getFile());
      result.setResolved(artifact.getFile() != null);

      List<String> trail = new ArrayList<String>(1);
      trail.add(result.getId());
      result.setDependencyTrail(trail);

      return result;
   }

   private static String nullify(String string)
   {
      return (string == null || string.length() <= 0) ? null : string;
   }

   private static ArtifactHandler newHandler(org.eclipse.aether.artifact.Artifact artifact)
   {
      String type = artifact.getProperty(ArtifactProperties.TYPE, artifact.getExtension());
      ArtifactHandlerImpl handler = new ArtifactHandlerImpl();
      handler.setType(type);
      handler.setExtension(artifact.getExtension());
      handler.setLanguage(artifact.getProperty(ArtifactProperties.LANGUAGE, null));
      handler.setAddedToClasspath(Boolean.parseBoolean(artifact.getProperty(ArtifactProperties.CONSTITUTES_BUILD_PATH,
         "")));
      handler.setIncludesDependencies(Boolean.parseBoolean(artifact.getProperty(
         ArtifactProperties.INCLUDES_DEPENDENCIES, "")));
      return handler;
   }

   public static org.eclipse.aether.artifact.Artifact toArtifact(Artifact artifact)
   {
      final String groupId = artifact.getGroupId();
      final String artifactId = artifact.getArtifactId();
      final String version = getVersion(artifact);
      final String classifier = artifact.getClassifier();
      final ArtifactHandler artifactHandler = artifact.getArtifactHandler();
      final String extension = artifactHandler.getExtension();
      final Map<String, String> properties = getProperties(artifact);
      final String type = artifact.getType();
      final ArtifactType artifactType = newArtifactType(type, artifactHandler);
      final File file = artifact.getFile();
      return newArtifact(groupId, artifactId, version, classifier, extension, properties, artifactType, file);
   }

   private static org.eclipse.aether.artifact.Artifact newArtifact(final String groupId, final String artifactId,
      final String version, final String classifier, final String extension, final Map<String, String> properties,
      final ArtifactType artifactType, final File file)
   {
      return new org.eclipse.aether.artifact.DefaultArtifact(groupId, artifactId, classifier, extension, version,
         properties, artifactType).setFile(file);
   }

   private static Map<String, String> getProperties(org.apache.maven.artifact.Artifact artifact)
   {
      final String scope = artifact.getScope();
      if (org.apache.maven.artifact.Artifact.SCOPE_SYSTEM.equals(scope))
      {
         String localPath = (artifact.getFile() != null) ? artifact.getFile().getPath() : "";
         return Collections.singletonMap(ArtifactProperties.LOCAL_PATH, localPath);
      }
      return null;
   }

   private static String getVersion(org.apache.maven.artifact.Artifact artifact)
   {
      String version = artifact.getVersion();
      if (version == null && artifact.getVersionRange() != null)
      {
         version = artifact.getVersionRange().toString();
      }
      return version;
   }

   private static ArtifactType newArtifactType(String id, ArtifactHandler handler)
   {
      return new DefaultArtifactType(id, handler.getExtension(), handler.getClassifier(), handler.getLanguage(),
         handler.isAddedToClasspath(), handler.isIncludesDependencies());
   }
}

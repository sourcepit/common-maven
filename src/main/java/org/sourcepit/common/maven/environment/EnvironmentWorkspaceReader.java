/**
 * Copyright (c) 2012 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.environment;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.sonatype.aether.artifact.Artifact;
import org.sonatype.aether.repository.WorkspaceReader;
import org.sonatype.aether.repository.WorkspaceRepository;
import org.sourcepit.common.maven.model.MavenArtifact;

public class EnvironmentWorkspaceReader implements WorkspaceReader
{
   private final EnvironmentSnapshot environment;

   private final WorkspaceRepository repository = new WorkspaceRepository(
      EnvironmentWorkspaceReader.class.getSimpleName());

   public EnvironmentWorkspaceReader(EnvironmentSnapshot environment)
   {
      this.environment = environment;
   }

   public WorkspaceRepository getRepository()
   {
      return repository;
   }

   public File findArtifact(Artifact artifact)
   {
      EList<MavenArtifact> artifacts = environment.getArtifacts();
      for (MavenArtifact mavenArtifact : artifacts)
      {
         if (isMatch(artifact, mavenArtifact, true))
         {
            return mavenArtifact.getFile();
         }
      }
      return null;
   }

   public List<String> findVersions(Artifact artifact)
   {
      final List<String> versions = new ArrayList<String>();
      final EList<MavenArtifact> artifacts = environment.getArtifacts();
      for (MavenArtifact mavenArtifact : artifacts)
      {
         if (isMatch(artifact, mavenArtifact, false))
         {
            versions.add(mavenArtifact.getVersion());
         }
      }
      return versions;
   }


   private boolean isMatch(Artifact artifact, MavenArtifact mavenArtifact, boolean compareVersion)
   {
      if (!equals(artifact.getGroupId(), mavenArtifact.getGroupId()))
      {
         return false;
      }
      if (!equals(artifact.getArtifactId(), mavenArtifact.getArtifactId()))
      {
         return false;
      }
      if (compareVersion && !equals(artifact.getVersion(), mavenArtifact.getVersion()))
      {
         return false;
      }
      final String c1 = artifact.getClassifier() == null ? "" : artifact.getClassifier();
      final String c2 = mavenArtifact.getClassifier() == null ? "" : mavenArtifact.getClassifier();
      if (!equals(c1, c2))
      {
         return false;
      }
      final String t1 = artifact.getExtension() == null ? "jar" : artifact.getExtension();
      final String t2 = mavenArtifact.getType() == null ? "jar" : mavenArtifact.getType();
      if (!equals(t1, t2))
      {
         return false;
      }
      return true;
   }

   private boolean equals(Object o1, Object o2)
   {
      if (o1 == null)
      {
         return o2 == null;
      }
      return o1.equals(o2);
   }

}

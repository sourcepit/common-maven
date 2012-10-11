/**
 * Copyright (c) 2012 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.testing;

import java.util.List;

import org.apache.maven.execution.BuildSummary;
import org.apache.maven.execution.MavenExecutionResult;
import org.apache.maven.execution.MavenSession;
import org.apache.maven.project.DependencyResolutionResult;
import org.apache.maven.project.MavenProject;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class MavenExecutionResult2Impl implements MavenExecutionResult2
{
   private final MavenExecutionResult origin;
   private final MavenSession session;

   public MavenExecutionResult2Impl(MavenSession session, MavenExecutionResult origin)
   {
      this.session = session;
      this.origin = origin;
   }

   public MavenSession getSession()
   {
      return session;
   }

   public MavenExecutionResult setProject(MavenProject project)
   {
      return origin.setProject(project);
   }

   public MavenProject getProject()
   {
      return origin.getProject();
   }

   public MavenExecutionResult setTopologicallySortedProjects(List<MavenProject> projects)
   {
      return origin.setTopologicallySortedProjects(projects);
   }

   public List<MavenProject> getTopologicallySortedProjects()
   {
      return origin.getTopologicallySortedProjects();
   }

   public MavenExecutionResult setDependencyResolutionResult(DependencyResolutionResult result)
   {
      return origin.setDependencyResolutionResult(result);
   }

   public DependencyResolutionResult getDependencyResolutionResult()
   {
      return origin.getDependencyResolutionResult();
   }

   public List<Throwable> getExceptions()
   {
      return origin.getExceptions();
   }

   public MavenExecutionResult addException(Throwable e)
   {
      return origin.addException(e);
   }

   public boolean hasExceptions()
   {
      return origin.hasExceptions();
   }

   public BuildSummary getBuildSummary(MavenProject project)
   {
      return origin.getBuildSummary(project);
   }

   public void addBuildSummary(BuildSummary summary)
   {
      origin.addBuildSummary(summary);
   }
}

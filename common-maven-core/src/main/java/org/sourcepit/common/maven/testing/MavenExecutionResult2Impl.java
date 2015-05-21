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
public class MavenExecutionResult2Impl implements MavenExecutionResult2 {
   private final MavenExecutionResult origin;
   private final MavenSession session;

   public MavenExecutionResult2Impl(MavenSession session, MavenExecutionResult origin) {
      this.session = session;
      this.origin = origin;
   }

   public MavenSession getSession() {
      return session;
   }

   public MavenExecutionResult setProject(MavenProject project) {
      return origin.setProject(project);
   }

   public MavenProject getProject() {
      return origin.getProject();
   }

   public MavenExecutionResult setTopologicallySortedProjects(List<MavenProject> projects) {
      return origin.setTopologicallySortedProjects(projects);
   }

   public List<MavenProject> getTopologicallySortedProjects() {
      return origin.getTopologicallySortedProjects();
   }

   public MavenExecutionResult setDependencyResolutionResult(DependencyResolutionResult result) {
      return origin.setDependencyResolutionResult(result);
   }

   public DependencyResolutionResult getDependencyResolutionResult() {
      return origin.getDependencyResolutionResult();
   }

   public List<Throwable> getExceptions() {
      return origin.getExceptions();
   }

   public MavenExecutionResult addException(Throwable e) {
      return origin.addException(e);
   }

   public boolean hasExceptions() {
      return origin.hasExceptions();
   }

   public BuildSummary getBuildSummary(MavenProject project) {
      return origin.getBuildSummary(project);
   }

   public void addBuildSummary(BuildSummary summary) {
      origin.addBuildSummary(summary);
   }
}

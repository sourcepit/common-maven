/**
 * Copyright (c) 2012 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.testing;

import org.apache.maven.execution.AbstractExecutionListener;
import org.apache.maven.execution.ExecutionEvent;
import org.apache.maven.execution.ExecutionListener;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class ChainedExecutionListener implements ExecutionListener
{
   private final ExecutionListener next;

   public ChainedExecutionListener(ExecutionListener next)
   {
      this.next = next == null ? new AbstractExecutionListener()
      {
      } : next;
   }

   public void projectDiscoveryStarted(ExecutionEvent event)
   {
      next.projectDiscoveryStarted(event);
   }

   public void sessionStarted(ExecutionEvent event)
   {
      next.sessionStarted(event);
   }

   public void sessionEnded(ExecutionEvent event)
   {
      next.sessionEnded(event);
   }

   public void projectSkipped(ExecutionEvent event)
   {
      next.projectSkipped(event);
   }

   public void projectStarted(ExecutionEvent event)
   {
      next.projectStarted(event);
   }

   public void projectSucceeded(ExecutionEvent event)
   {
      next.projectSucceeded(event);
   }

   public void projectFailed(ExecutionEvent event)
   {
      next.projectFailed(event);
   }

   public void mojoSkipped(ExecutionEvent event)
   {
      next.mojoSkipped(event);
   }

   public void mojoStarted(ExecutionEvent event)
   {
      next.mojoStarted(event);
   }

   public void mojoSucceeded(ExecutionEvent event)
   {
      next.mojoSucceeded(event);
   }

   public void mojoFailed(ExecutionEvent event)
   {
      next.mojoFailed(event);
   }

   public void forkStarted(ExecutionEvent event)
   {
      next.forkStarted(event);
   }

   public void forkSucceeded(ExecutionEvent event)
   {
      next.forkSucceeded(event);
   }

   public void forkFailed(ExecutionEvent event)
   {
      next.forkFailed(event);
   }

   public void forkedProjectStarted(ExecutionEvent event)
   {
      next.forkedProjectStarted(event);
   }

   public void forkedProjectSucceeded(ExecutionEvent event)
   {
      next.forkedProjectSucceeded(event);
   }

   public void forkedProjectFailed(ExecutionEvent event)
   {
      next.forkedProjectFailed(event);
   }
}

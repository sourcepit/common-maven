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

import org.apache.maven.artifact.handler.ArtifactHandler;

public class ArtifactHandlerImpl implements ArtifactHandler
{
   private String type;

   private String extension;

   private String directory;

   private String classifier;

   private String packaging;

   private boolean includesDependencies;

   private String language;

   private boolean addedToClasspath;

   public ArtifactHandlerImpl()
   {
      this(null);
   }

   public ArtifactHandlerImpl(String type)
   {
      this.type = type;
   }

   public void setType(String type)
   {
      this.type = type;
   }

   public String getType()
   {
      return type;
   }

   public void setExtension(String extension)
   {
      this.extension = extension;
   }

   @Override
   public String getExtension()
   {
      if (extension == null)
      {
         extension = type;
      }
      return extension;
   }

   public void setClassifier(String classifier)
   {
      this.classifier = classifier;
   }

   @Override
   public String getClassifier()
   {
      return classifier;
   }

   public void setDirectory(String directory)
   {
      this.directory = directory;
   }

   @Override
   public String getDirectory()
   {
      if (directory == null)
      {
         directory = getPackaging() + "s";
      }
      return directory;
   }

   public void setPackaging(String packaging)
   {
      this.packaging = packaging;
   }

   @Override
   public String getPackaging()
   {
      if (packaging == null)
      {
         packaging = type;
      }
      return packaging;
   }

   @Override
   public boolean isIncludesDependencies()
   {
      return includesDependencies;
   }

   public void setIncludesDependencies(boolean includesDependencies)
   {
      this.includesDependencies = includesDependencies;
   }

   public void setLanguage(String language)
   {
      this.language = language;
   }

   @Override
   public String getLanguage()
   {
      if (language == null)
      {
         language = "none";
      }
      return language;
   }

   public void setAddedToClasspath(boolean addedToClasspath)
   {
      this.addedToClasspath = addedToClasspath;
   }

   @Override
   public boolean isAddedToClasspath()
   {
      return addedToClasspath;
   }
}
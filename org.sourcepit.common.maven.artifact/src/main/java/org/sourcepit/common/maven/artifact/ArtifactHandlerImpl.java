/*
 * Copyright (C) 2014 Bosch Software Innovations GmbH. All rights reserved.
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
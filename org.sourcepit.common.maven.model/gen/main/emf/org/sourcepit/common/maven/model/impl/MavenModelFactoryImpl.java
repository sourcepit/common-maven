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

package org.sourcepit.common.maven.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.sourcepit.common.maven.model.ArtifactConflictKey;
import org.sourcepit.common.maven.model.ArtifactKey;
import org.sourcepit.common.maven.model.MavenArtifact;
import org.sourcepit.common.maven.model.MavenDependency;
import org.sourcepit.common.maven.model.MavenModelFactory;
import org.sourcepit.common.maven.model.MavenModelPackage;
import org.sourcepit.common.maven.model.MavenProject;
import org.sourcepit.common.maven.model.ProjectKey;
import org.sourcepit.common.maven.model.Scope;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class MavenModelFactoryImpl extends EFactoryImpl implements MavenModelFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public static MavenModelFactory init() {
      try {
         MavenModelFactory theMavenModelFactory = (MavenModelFactory) EPackage.Registry.INSTANCE.getEFactory("http://www.sourcepit.org/common/maven/0.1");
         if (theMavenModelFactory != null) {
            return theMavenModelFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new MavenModelFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public MavenModelFactoryImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public EObject create(EClass eClass) {
      switch (eClass.getClassifierID()) {
         case MavenModelPackage.MAVEN_ARTIFACT :
            return createMavenArtifact();
         case MavenModelPackage.MAVEN_DEPENDENCY :
            return createMavenDependency();
         case MavenModelPackage.MAVEN_PROJECT :
            return createMavenProject();
         default :
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public Object createFromString(EDataType eDataType, String initialValue) {
      switch (eDataType.getClassifierID()) {
         case MavenModelPackage.SCOPE :
            return createScopeFromString(eDataType, initialValue);
         case MavenModelPackage.NULLABLE_SCOPE :
            return createNullableScopeFromString(eDataType, initialValue);
         case MavenModelPackage.ARTIFACT_CONFLICT_KEY :
            return createArtifactConflictKeyFromString(eDataType, initialValue);
         case MavenModelPackage.PROJECT_KEY :
            return createProjectKeyFromString(eDataType, initialValue);
         case MavenModelPackage.ARTIFACT_KEY :
            return createArtifactKeyFromString(eDataType, initialValue);
         default :
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public String convertToString(EDataType eDataType, Object instanceValue) {
      switch (eDataType.getClassifierID()) {
         case MavenModelPackage.SCOPE :
            return convertScopeToString(eDataType, instanceValue);
         case MavenModelPackage.NULLABLE_SCOPE :
            return convertNullableScopeToString(eDataType, instanceValue);
         case MavenModelPackage.ARTIFACT_CONFLICT_KEY :
            return convertArtifactConflictKeyToString(eDataType, instanceValue);
         case MavenModelPackage.PROJECT_KEY :
            return convertProjectKeyToString(eDataType, instanceValue);
         case MavenModelPackage.ARTIFACT_KEY :
            return convertArtifactKeyToString(eDataType, instanceValue);
         default :
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public MavenArtifact createMavenArtifact() {
      MavenArtifactImpl mavenArtifact = new MavenArtifactImpl();
      return mavenArtifact;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public MavenDependency createMavenDependency() {
      MavenDependencyImpl mavenDependency = new MavenDependencyImpl();
      return mavenDependency;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public MavenProject createMavenProject() {
      MavenProjectImpl mavenProject = new MavenProjectImpl();
      return mavenProject;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public Scope createScopeFromString(EDataType eDataType, String initialValue) {
      Scope result = Scope.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
            + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String convertScopeToString(EDataType eDataType, Object instanceValue) {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public Scope createNullableScopeFromString(EDataType eDataType, String initialValue) {
      return (Scope) super.createFromString(eDataType, initialValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String convertNullableScopeToString(EDataType eDataType, Object instanceValue) {
      return super.convertToString(eDataType, instanceValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public ArtifactConflictKey createArtifactConflictKeyFromString(EDataType eDataType, String initialValue) {
      return (ArtifactConflictKey) super.createFromString(eDataType, initialValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String convertArtifactConflictKeyToString(EDataType eDataType, Object instanceValue) {
      return super.convertToString(eDataType, instanceValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public ProjectKey createProjectKeyFromString(EDataType eDataType, String initialValue) {
      return (ProjectKey) super.createFromString(eDataType, initialValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String convertProjectKeyToString(EDataType eDataType, Object instanceValue) {
      return super.convertToString(eDataType, instanceValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public ArtifactKey createArtifactKeyFromString(EDataType eDataType, String initialValue) {
      return (ArtifactKey) super.createFromString(eDataType, initialValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String convertArtifactKeyToString(EDataType eDataType, Object instanceValue) {
      return super.convertToString(eDataType, instanceValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public MavenModelPackage getMavenModelPackage() {
      return (MavenModelPackage) getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @deprecated
    * @generated
    */
   @Deprecated
   public static MavenModelPackage getPackage() {
      return MavenModelPackage.eINSTANCE;
   }

} // MavenModelFactoryImpl

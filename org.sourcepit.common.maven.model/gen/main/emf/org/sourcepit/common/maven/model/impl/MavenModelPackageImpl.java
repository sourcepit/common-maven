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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.sourcepit.common.maven.model.ArtifactConflictKey;
import org.sourcepit.common.maven.model.ArtifactKey;
import org.sourcepit.common.maven.model.DependencyDeclaration;
import org.sourcepit.common.maven.model.MavenArtifact;
import org.sourcepit.common.maven.model.MavenArtifactConflictCoordinates;
import org.sourcepit.common.maven.model.MavenArtifactCoordinates;
import org.sourcepit.common.maven.model.MavenClassified;
import org.sourcepit.common.maven.model.MavenDependency;
import org.sourcepit.common.maven.model.MavenModelFactory;
import org.sourcepit.common.maven.model.MavenModelPackage;
import org.sourcepit.common.maven.model.MavenProject;
import org.sourcepit.common.maven.model.MavenProjectCoordinates;
import org.sourcepit.common.maven.model.ProjectKey;
import org.sourcepit.common.maven.model.Scope;
import org.sourcepit.common.modeling.CommonModelingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class MavenModelPackageImpl extends EPackageImpl implements MavenModelPackage {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass mavenArtifactEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass mavenDependencyEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass mavenArtifactConflictCoordinatesEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass mavenProjectCoordinatesEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass mavenClassifiedEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass mavenProjectEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass dependencyDeclarationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass mavenArtifactCoordinatesEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EEnum scopeEEnum = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EDataType nullableScopeEDataType = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EDataType artifactConflictKeyEDataType = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EDataType projectKeyEDataType = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EDataType artifactKeyEDataType = null;

   /**
    * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
    * EPackage.Registry} by the package
    * package URI value.
    * <p>
    * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
    * performs initialization of the package, or returns the registered package, if one already exists. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see org.eclipse.emf.ecore.EPackage.Registry
    * @see org.sourcepit.common.maven.model.MavenModelPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private MavenModelPackageImpl() {
      super(eNS_URI, MavenModelFactory.eINSTANCE);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private static boolean isInited = false;

   /**
    * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
    * 
    * <p>
    * This method is used to initialize {@link MavenModelPackage#eINSTANCE} when that field is accessed. Clients should
    * not invoke it directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc
    * --> <!-- end-user-doc -->
    * 
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static MavenModelPackage init() {
      if (isInited)
         return (MavenModelPackage) EPackage.Registry.INSTANCE.getEPackage(MavenModelPackage.eNS_URI);

      // Obtain or create and register package
      MavenModelPackageImpl theMavenModelPackage = (MavenModelPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MavenModelPackageImpl
         ? EPackage.Registry.INSTANCE.get(eNS_URI)
         : new MavenModelPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      CommonModelingPackage.eINSTANCE.eClass();

      // Create package meta-data objects
      theMavenModelPackage.createPackageContents();

      // Initialize created meta-data
      theMavenModelPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theMavenModelPackage.freeze();


      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(MavenModelPackage.eNS_URI, theMavenModelPackage);
      return theMavenModelPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getMavenArtifact() {
      return mavenArtifactEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getMavenArtifact_File() {
      return (EAttribute) mavenArtifactEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getMavenDependency() {
      return mavenDependencyEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getMavenArtifactConflictCoordinates() {
      return mavenArtifactConflictCoordinatesEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getMavenArtifactConflictCoordinates_GroupId() {
      return (EAttribute) mavenArtifactConflictCoordinatesEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getMavenArtifactConflictCoordinates_ArtifactId() {
      return (EAttribute) mavenArtifactConflictCoordinatesEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getMavenProjectCoordinates() {
      return mavenProjectCoordinatesEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getMavenProjectCoordinates_Version() {
      return (EAttribute) mavenProjectCoordinatesEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getMavenClassified() {
      return mavenClassifiedEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getMavenClassified_Classifier() {
      return (EAttribute) mavenClassifiedEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getMavenClassified_Type() {
      return (EAttribute) mavenClassifiedEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getMavenProject() {
      return mavenProjectEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getMavenProject_Packaging() {
      return (EAttribute) mavenProjectEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getMavenProject_PomFile() {
      return (EAttribute) mavenProjectEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getMavenProject_OutputDirectory() {
      return (EAttribute) mavenProjectEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getMavenProject_TestOutputDirectory() {
      return (EAttribute) mavenProjectEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getDependencyDeclaration() {
      return dependencyDeclarationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getDependencyDeclaration_VersionConstraint() {
      return (EAttribute) dependencyDeclarationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getDependencyDeclaration_Scope() {
      return (EAttribute) dependencyDeclarationEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getDependencyDeclaration_Optional() {
      return (EAttribute) dependencyDeclarationEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getMavenArtifactCoordinates() {
      return mavenArtifactCoordinatesEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EEnum getScope() {
      return scopeEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EDataType getNullableScope() {
      return nullableScopeEDataType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EDataType getArtifactConflictKey() {
      return artifactConflictKeyEDataType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EDataType getProjectKey() {
      return projectKeyEDataType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EDataType getArtifactKey() {
      return artifactKeyEDataType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public MavenModelFactory getMavenModelFactory() {
      return (MavenModelFactory) getEFactoryInstance();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private boolean isCreated = false;

   /**
    * Creates the meta-model objects for the package. This method is
    * guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void createPackageContents() {
      if (isCreated)
         return;
      isCreated = true;

      // Create classes and their features
      mavenArtifactEClass = createEClass(MAVEN_ARTIFACT);
      createEAttribute(mavenArtifactEClass, MAVEN_ARTIFACT__FILE);

      mavenDependencyEClass = createEClass(MAVEN_DEPENDENCY);

      mavenArtifactConflictCoordinatesEClass = createEClass(MAVEN_ARTIFACT_CONFLICT_COORDINATES);
      createEAttribute(mavenArtifactConflictCoordinatesEClass, MAVEN_ARTIFACT_CONFLICT_COORDINATES__GROUP_ID);
      createEAttribute(mavenArtifactConflictCoordinatesEClass, MAVEN_ARTIFACT_CONFLICT_COORDINATES__ARTIFACT_ID);

      mavenProjectCoordinatesEClass = createEClass(MAVEN_PROJECT_COORDINATES);
      createEAttribute(mavenProjectCoordinatesEClass, MAVEN_PROJECT_COORDINATES__VERSION);

      mavenClassifiedEClass = createEClass(MAVEN_CLASSIFIED);
      createEAttribute(mavenClassifiedEClass, MAVEN_CLASSIFIED__CLASSIFIER);
      createEAttribute(mavenClassifiedEClass, MAVEN_CLASSIFIED__TYPE);

      mavenProjectEClass = createEClass(MAVEN_PROJECT);
      createEAttribute(mavenProjectEClass, MAVEN_PROJECT__PACKAGING);
      createEAttribute(mavenProjectEClass, MAVEN_PROJECT__POM_FILE);
      createEAttribute(mavenProjectEClass, MAVEN_PROJECT__OUTPUT_DIRECTORY);
      createEAttribute(mavenProjectEClass, MAVEN_PROJECT__TEST_OUTPUT_DIRECTORY);

      dependencyDeclarationEClass = createEClass(DEPENDENCY_DECLARATION);
      createEAttribute(dependencyDeclarationEClass, DEPENDENCY_DECLARATION__VERSION_CONSTRAINT);
      createEAttribute(dependencyDeclarationEClass, DEPENDENCY_DECLARATION__SCOPE);
      createEAttribute(dependencyDeclarationEClass, DEPENDENCY_DECLARATION__OPTIONAL);

      mavenArtifactCoordinatesEClass = createEClass(MAVEN_ARTIFACT_COORDINATES);

      // Create enums
      scopeEEnum = createEEnum(SCOPE);

      // Create data types
      nullableScopeEDataType = createEDataType(NULLABLE_SCOPE);
      artifactConflictKeyEDataType = createEDataType(ARTIFACT_CONFLICT_KEY);
      projectKeyEDataType = createEDataType(PROJECT_KEY);
      artifactKeyEDataType = createEDataType(ARTIFACT_KEY);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private boolean isInitialized = false;

   /**
    * Complete the initialization of the package and its meta-model. This
    * method is guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void initializePackageContents() {
      if (isInitialized)
         return;
      isInitialized = true;

      // Initialize package
      setName(eNAME);
      setNsPrefix(eNS_PREFIX);
      setNsURI(eNS_URI);

      // Obtain other dependent packages
      CommonModelingPackage theCommonModelingPackage = (CommonModelingPackage) EPackage.Registry.INSTANCE.getEPackage(CommonModelingPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      mavenArtifactEClass.getESuperTypes().add(theCommonModelingPackage.getXAnnotatable());
      mavenArtifactEClass.getESuperTypes().add(this.getMavenArtifactCoordinates());
      mavenDependencyEClass.getESuperTypes().add(this.getDependencyDeclaration());
      mavenDependencyEClass.getESuperTypes().add(theCommonModelingPackage.getXAnnotatable());
      mavenProjectCoordinatesEClass.getESuperTypes().add(this.getMavenArtifactConflictCoordinates());
      mavenProjectEClass.getESuperTypes().add(this.getMavenProjectCoordinates());
      mavenProjectEClass.getESuperTypes().add(theCommonModelingPackage.getXAnnotatable());
      dependencyDeclarationEClass.getESuperTypes().add(this.getMavenArtifactConflictCoordinates());
      dependencyDeclarationEClass.getESuperTypes().add(this.getMavenClassified());
      mavenArtifactCoordinatesEClass.getESuperTypes().add(this.getMavenProjectCoordinates());
      mavenArtifactCoordinatesEClass.getESuperTypes().add(this.getMavenClassified());

      // Initialize classes and features; add operations and parameters
      initEClass(mavenArtifactEClass, MavenArtifact.class, "MavenArtifact", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getMavenArtifact_File(), theCommonModelingPackage.getEFile(), "file", null, 0, 1,
         MavenArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      initEClass(mavenDependencyEClass, MavenDependency.class, "MavenDependency", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      initEClass(mavenArtifactConflictCoordinatesEClass, MavenArtifactConflictCoordinates.class,
         "MavenArtifactConflictCoordinates", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getMavenArtifactConflictCoordinates_GroupId(), ecorePackage.getEString(), "groupId", null, 1, 1,
         MavenArtifactConflictCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
         IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getMavenArtifactConflictCoordinates_ArtifactId(), ecorePackage.getEString(), "artifactId", null,
         1, 1, MavenArtifactConflictCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
         !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      addEOperation(mavenArtifactConflictCoordinatesEClass, this.getArtifactConflictKey(), "getArtifactConflictKey", 1,
         1, IS_UNIQUE, IS_ORDERED);

      initEClass(mavenProjectCoordinatesEClass, MavenProjectCoordinates.class, "MavenProjectCoordinates", IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getMavenProjectCoordinates_Version(), ecorePackage.getEString(), "version", null, 1, 1,
         MavenProjectCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      addEOperation(mavenProjectCoordinatesEClass, this.getProjectKey(), "getProjectKey", 1, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(mavenClassifiedEClass, MavenClassified.class, "MavenClassified", IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getMavenClassified_Classifier(), ecorePackage.getEString(), "classifier", null, 0, 1,
         MavenClassified.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);
      initEAttribute(getMavenClassified_Type(), ecorePackage.getEString(), "type", "jar", 0, 1, MavenClassified.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(mavenProjectEClass, MavenProject.class, "MavenProject", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getMavenProject_Packaging(), ecorePackage.getEString(), "packaging", "jar", 0, 1,
         MavenProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);
      initEAttribute(getMavenProject_PomFile(), theCommonModelingPackage.getEFile(), "pomFile", null, 0, 1,
         MavenProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);
      initEAttribute(getMavenProject_OutputDirectory(), theCommonModelingPackage.getEFile(), "outputDirectory", null,
         0, 1, MavenProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);
      initEAttribute(getMavenProject_TestOutputDirectory(), theCommonModelingPackage.getEFile(), "testOutputDirectory",
         null, 0, 1, MavenProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      addEOperation(mavenProjectEClass, theCommonModelingPackage.getEFile(), "getProjectDirectory", 0, 1, IS_UNIQUE,
         IS_ORDERED);

      initEClass(dependencyDeclarationEClass, DependencyDeclaration.class, "DependencyDeclaration", IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getDependencyDeclaration_VersionConstraint(), ecorePackage.getEString(), "versionConstraint",
         null, 1, 1, DependencyDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
         IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getDependencyDeclaration_Scope(), this.getScope(), "scope", "compile", 1, 1,
         DependencyDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);
      initEAttribute(getDependencyDeclaration_Optional(), ecorePackage.getEBoolean(), "optional", null, 0, 1,
         DependencyDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      initEClass(mavenArtifactCoordinatesEClass, MavenArtifactCoordinates.class, "MavenArtifactCoordinates",
         IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      addEOperation(mavenArtifactCoordinatesEClass, this.getArtifactKey(), "getArtifactKey", 1, 1, IS_UNIQUE,
         IS_ORDERED);

      // Initialize enums and add enum literals
      initEEnum(scopeEEnum, Scope.class, "Scope");
      addEEnumLiteral(scopeEEnum, Scope.COMPILE);
      addEEnumLiteral(scopeEEnum, Scope.PROVIDED);
      addEEnumLiteral(scopeEEnum, Scope.RUNTIME);
      addEEnumLiteral(scopeEEnum, Scope.TEST);
      addEEnumLiteral(scopeEEnum, Scope.SYSTEM);
      addEEnumLiteral(scopeEEnum, Scope.IMPORT);

      // Initialize data types
      initEDataType(nullableScopeEDataType, Scope.class, "NullableScope", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
      initEDataType(artifactConflictKeyEDataType, ArtifactConflictKey.class, "ArtifactConflictKey", IS_SERIALIZABLE,
         !IS_GENERATED_INSTANCE_CLASS);
      initEDataType(projectKeyEDataType, ProjectKey.class, "ProjectKey", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
      initEDataType(artifactKeyEDataType, ArtifactKey.class, "ArtifactKey", IS_SERIALIZABLE,
         !IS_GENERATED_INSTANCE_CLASS);

      // Create resource
      createResource(eNS_URI);
   }

} // MavenModelPackageImpl

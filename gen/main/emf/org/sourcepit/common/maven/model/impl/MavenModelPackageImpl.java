/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.model.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.sourcepit.common.maven.model.Classified;
import org.sourcepit.common.maven.model.Identifiable;
import org.sourcepit.common.maven.model.MavenArtifact;
import org.sourcepit.common.maven.model.MavenDependency;
import org.sourcepit.common.maven.model.MavenModelFactory;
import org.sourcepit.common.maven.model.MavenModelPackage;
import org.sourcepit.common.maven.model.MavenProject;
import org.sourcepit.common.maven.model.VersionedIdentifiable;
import org.sourcepit.modeling.common.CommonModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class MavenModelPackageImpl extends EPackageImpl implements MavenModelPackage
{
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
   private EClass identifiableEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass versionedIdentifiableEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass classifiedEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass mavenProjectEClass = null;

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
   private MavenModelPackageImpl()
   {
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
   public static MavenModelPackage init()
   {
      if (isInited)
         return (MavenModelPackage) EPackage.Registry.INSTANCE.getEPackage(MavenModelPackage.eNS_URI);

      // Obtain or create and register package
      MavenModelPackageImpl theMavenModelPackage = (MavenModelPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MavenModelPackageImpl
         ? EPackage.Registry.INSTANCE.get(eNS_URI)
         : new MavenModelPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      CommonModelPackage.eINSTANCE.eClass();

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
   public EClass getMavenArtifact()
   {
      return mavenArtifactEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getMavenArtifact_File()
   {
      return (EAttribute) mavenArtifactEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getMavenDependency()
   {
      return mavenDependencyEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getMavenDependency_VersionRange()
   {
      return (EAttribute) mavenDependencyEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getMavenDependency_Scope()
   {
      return (EAttribute) mavenDependencyEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getMavenDependency_Optional()
   {
      return (EAttribute) mavenDependencyEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getIdentifiable()
   {
      return identifiableEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getIdentifiable_GroupId()
   {
      return (EAttribute) identifiableEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getIdentifiable_ArtifactId()
   {
      return (EAttribute) identifiableEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getVersionedIdentifiable()
   {
      return versionedIdentifiableEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getVersionedIdentifiable_Version()
   {
      return (EAttribute) versionedIdentifiableEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getClassified()
   {
      return classifiedEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getClassified_Classifier()
   {
      return (EAttribute) classifiedEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getClassified_Type()
   {
      return (EAttribute) classifiedEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getMavenProject()
   {
      return mavenProjectEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getMavenProject_Packaging()
   {
      return (EAttribute) mavenProjectEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getMavenProject_PomFile()
   {
      return (EAttribute) mavenProjectEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getMavenProject_OutputDirectory()
   {
      return (EAttribute) mavenProjectEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getMavenProject_TestOutputDirectory()
   {
      return (EAttribute) mavenProjectEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public MavenModelFactory getMavenModelFactory()
   {
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
   public void createPackageContents()
   {
      if (isCreated)
         return;
      isCreated = true;

      // Create classes and their features
      mavenArtifactEClass = createEClass(MAVEN_ARTIFACT);
      createEAttribute(mavenArtifactEClass, MAVEN_ARTIFACT__FILE);

      mavenDependencyEClass = createEClass(MAVEN_DEPENDENCY);
      createEAttribute(mavenDependencyEClass, MAVEN_DEPENDENCY__VERSION_RANGE);
      createEAttribute(mavenDependencyEClass, MAVEN_DEPENDENCY__SCOPE);
      createEAttribute(mavenDependencyEClass, MAVEN_DEPENDENCY__OPTIONAL);

      identifiableEClass = createEClass(IDENTIFIABLE);
      createEAttribute(identifiableEClass, IDENTIFIABLE__GROUP_ID);
      createEAttribute(identifiableEClass, IDENTIFIABLE__ARTIFACT_ID);

      versionedIdentifiableEClass = createEClass(VERSIONED_IDENTIFIABLE);
      createEAttribute(versionedIdentifiableEClass, VERSIONED_IDENTIFIABLE__VERSION);

      classifiedEClass = createEClass(CLASSIFIED);
      createEAttribute(classifiedEClass, CLASSIFIED__CLASSIFIER);
      createEAttribute(classifiedEClass, CLASSIFIED__TYPE);

      mavenProjectEClass = createEClass(MAVEN_PROJECT);
      createEAttribute(mavenProjectEClass, MAVEN_PROJECT__PACKAGING);
      createEAttribute(mavenProjectEClass, MAVEN_PROJECT__POM_FILE);
      createEAttribute(mavenProjectEClass, MAVEN_PROJECT__OUTPUT_DIRECTORY);
      createEAttribute(mavenProjectEClass, MAVEN_PROJECT__TEST_OUTPUT_DIRECTORY);
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
   public void initializePackageContents()
   {
      if (isInitialized)
         return;
      isInitialized = true;

      // Initialize package
      setName(eNAME);
      setNsPrefix(eNS_PREFIX);
      setNsURI(eNS_URI);

      // Obtain other dependent packages
      CommonModelPackage theCommonModelPackage = (CommonModelPackage) EPackage.Registry.INSTANCE
         .getEPackage(CommonModelPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      mavenArtifactEClass.getESuperTypes().add(this.getVersionedIdentifiable());
      mavenArtifactEClass.getESuperTypes().add(this.getClassified());
      mavenDependencyEClass.getESuperTypes().add(this.getIdentifiable());
      mavenDependencyEClass.getESuperTypes().add(this.getClassified());
      versionedIdentifiableEClass.getESuperTypes().add(this.getIdentifiable());
      mavenProjectEClass.getESuperTypes().add(this.getVersionedIdentifiable());

      // Initialize classes and features; add operations and parameters
      initEClass(mavenArtifactEClass, MavenArtifact.class, "MavenArtifact", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getMavenArtifact_File(), theCommonModelPackage.getEJavaFile(), "file", null, 0, 1,
         MavenArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      initEClass(mavenDependencyEClass, MavenDependency.class, "MavenDependency", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getMavenDependency_VersionRange(), ecorePackage.getEString(), "versionRange", null, 0, 1,
         MavenDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);
      initEAttribute(getMavenDependency_Scope(), ecorePackage.getEString(), "scope", "compile", 0, 1,
         MavenDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);
      initEAttribute(getMavenDependency_Optional(), ecorePackage.getEBoolean(), "optional", null, 0, 1,
         MavenDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      initEClass(identifiableEClass, Identifiable.class, "Identifiable", IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getIdentifiable_GroupId(), ecorePackage.getEString(), "groupId", null, 1, 1, Identifiable.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getIdentifiable_ArtifactId(), ecorePackage.getEString(), "artifactId", null, 1, 1,
         Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      initEClass(versionedIdentifiableEClass, VersionedIdentifiable.class, "VersionedIdentifiable", IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getVersionedIdentifiable_Version(), ecorePackage.getEString(), "version", null, 1, 1,
         VersionedIdentifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      initEClass(classifiedEClass, Classified.class, "Classified", IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getClassified_Classifier(), ecorePackage.getEString(), "classifier", null, 0, 1, Classified.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getClassified_Type(), ecorePackage.getEString(), "type", "jar", 0, 1, Classified.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(mavenProjectEClass, MavenProject.class, "MavenProject", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getMavenProject_Packaging(), ecorePackage.getEString(), "packaging", "jar", 0, 1,
         MavenProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);
      initEAttribute(getMavenProject_PomFile(), theCommonModelPackage.getEJavaFile(), "pomFile", null, 0, 1,
         MavenProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);
      initEAttribute(getMavenProject_OutputDirectory(), theCommonModelPackage.getEJavaFile(), "outputDirectory", null,
         0, 1, MavenProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);
      initEAttribute(getMavenProject_TestOutputDirectory(), theCommonModelPackage.getEJavaFile(),
         "testOutputDirectory", null, 0, 1, MavenProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
         !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      addEOperation(mavenProjectEClass, theCommonModelPackage.getEJavaFile(), "getProjectDirectory", 0, 1, IS_UNIQUE,
         IS_ORDERED);

      // Create resource
      createResource(eNS_URI);
   }

} // MavenModelPackageImpl

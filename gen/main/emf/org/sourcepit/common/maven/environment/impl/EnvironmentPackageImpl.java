/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.environment.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.sourcepit.common.maven.environment.EnvironmentFactory;
import org.sourcepit.common.maven.environment.EnvironmentPackage;
import org.sourcepit.common.maven.environment.EnvironmentSnapshot;
import org.sourcepit.common.maven.model.MavenModelPackage;
import org.sourcepit.common.maven.model.impl.MavenModelPackageImpl;
import org.sourcepit.modeling.common.CommonModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class EnvironmentPackageImpl extends EPackageImpl implements EnvironmentPackage
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass environmentSnapshotEClass = null;

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
    * @see org.sourcepit.common.maven.environment.EnvironmentPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private EnvironmentPackageImpl()
   {
      super(eNS_URI, EnvironmentFactory.eINSTANCE);
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
    * This method is used to initialize {@link EnvironmentPackage#eINSTANCE} when that field is accessed. Clients should
    * not invoke it directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc
    * --> <!-- end-user-doc -->
    * 
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static EnvironmentPackage init()
   {
      if (isInited)
         return (EnvironmentPackage) EPackage.Registry.INSTANCE.getEPackage(EnvironmentPackage.eNS_URI);

      // Obtain or create and register package
      EnvironmentPackageImpl theEnvironmentPackage = (EnvironmentPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EnvironmentPackageImpl
         ? EPackage.Registry.INSTANCE.get(eNS_URI)
         : new EnvironmentPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      CommonModelPackage.eINSTANCE.eClass();

      // Obtain or create and register interdependencies
      MavenModelPackageImpl theMavenModelPackage = (MavenModelPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(MavenModelPackage.eNS_URI) instanceof MavenModelPackageImpl ? EPackage.Registry.INSTANCE
         .getEPackage(MavenModelPackage.eNS_URI) : MavenModelPackage.eINSTANCE);

      // Create package meta-data objects
      theEnvironmentPackage.createPackageContents();
      theMavenModelPackage.createPackageContents();

      // Initialize created meta-data
      theEnvironmentPackage.initializePackageContents();
      theMavenModelPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theEnvironmentPackage.freeze();


      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(EnvironmentPackage.eNS_URI, theEnvironmentPackage);
      return theEnvironmentPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getEnvironmentSnapshot()
   {
      return environmentSnapshotEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getEnvironmentSnapshot_Classpath()
   {
      return (EAttribute) environmentSnapshotEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getEnvironmentSnapshot_Artifacts()
   {
      return (EReference) environmentSnapshotEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EnvironmentFactory getEnvironmentFactory()
   {
      return (EnvironmentFactory) getEFactoryInstance();
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
      environmentSnapshotEClass = createEClass(ENVIRONMENT_SNAPSHOT);
      createEAttribute(environmentSnapshotEClass, ENVIRONMENT_SNAPSHOT__CLASSPATH);
      createEReference(environmentSnapshotEClass, ENVIRONMENT_SNAPSHOT__ARTIFACTS);
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
      MavenModelPackage theMavenModelPackage = (MavenModelPackage) EPackage.Registry.INSTANCE
         .getEPackage(MavenModelPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      environmentSnapshotEClass.getESuperTypes().add(theCommonModelPackage.getXAnnotatable());

      // Initialize classes and features; add operations and parameters
      initEClass(environmentSnapshotEClass, EnvironmentSnapshot.class, "EnvironmentSnapshot", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getEnvironmentSnapshot_Classpath(), theCommonModelPackage.getEURL(), "classpath", null, 0, -1,
         EnvironmentSnapshot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);
      initEReference(getEnvironmentSnapshot_Artifacts(), theMavenModelPackage.getMavenArtifact(), null, "artifacts",
         null, 0, -1, EnvironmentSnapshot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
   }

} // EnvironmentPackageImpl

/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.environment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.sourcepit.modeling.common.CommonModelPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.sourcepit.common.maven.environment.EnvironmentFactory
 * @model kind="package"
 * @generated
 */
public interface EnvironmentPackage extends EPackage
{
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNAME = "environment";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_URI = "http://www.sourcepit.org/common/maven/environment/0.1";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_PREFIX = "maven-environment";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   EnvironmentPackage eINSTANCE = org.sourcepit.common.maven.environment.impl.EnvironmentPackageImpl.init();

   /**
    * The meta object id for the '{@link org.sourcepit.common.maven.environment.impl.EnvironmentSnapshotImpl
    * <em>Snapshot</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.maven.environment.impl.EnvironmentSnapshotImpl
    * @see org.sourcepit.common.maven.environment.impl.EnvironmentPackageImpl#getEnvironmentSnapshot()
    * @generated
    */
   int ENVIRONMENT_SNAPSHOT = 0;

   /**
    * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ENVIRONMENT_SNAPSHOT__EXTENSIONS = CommonModelPackage.XANNOTATABLE__EXTENSIONS;

   /**
    * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ENVIRONMENT_SNAPSHOT__ANNOTATIONS = CommonModelPackage.XANNOTATABLE__ANNOTATIONS;

   /**
    * The feature id for the '<em><b>Classpath</b></em>' attribute list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ENVIRONMENT_SNAPSHOT__CLASSPATH = CommonModelPackage.XANNOTATABLE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ENVIRONMENT_SNAPSHOT__ARTIFACTS = CommonModelPackage.XANNOTATABLE_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Snapshot</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ENVIRONMENT_SNAPSHOT_FEATURE_COUNT = CommonModelPackage.XANNOTATABLE_FEATURE_COUNT + 2;


   /**
    * Returns the meta object for class '{@link org.sourcepit.common.maven.environment.EnvironmentSnapshot
    * <em>Snapshot</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Snapshot</em>'.
    * @see org.sourcepit.common.maven.environment.EnvironmentSnapshot
    * @generated
    */
   EClass getEnvironmentSnapshot();

   /**
    * Returns the meta object for the attribute list '
    * {@link org.sourcepit.common.maven.environment.EnvironmentSnapshot#getClasspath <em>Classpath</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute list '<em>Classpath</em>'.
    * @see org.sourcepit.common.maven.environment.EnvironmentSnapshot#getClasspath()
    * @see #getEnvironmentSnapshot()
    * @generated
    */
   EAttribute getEnvironmentSnapshot_Classpath();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.common.maven.environment.EnvironmentSnapshot#getArtifacts <em>Artifacts</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Artifacts</em>'.
    * @see org.sourcepit.common.maven.environment.EnvironmentSnapshot#getArtifacts()
    * @see #getEnvironmentSnapshot()
    * @generated
    */
   EReference getEnvironmentSnapshot_Artifacts();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the factory that creates the instances of the model.
    * @generated
    */
   EnvironmentFactory getEnvironmentFactory();

   /**
    * <!-- begin-user-doc -->
    * Defines literals for the meta objects that represent
    * <ul>
    * <li>each class,</li>
    * <li>each feature of each class,</li>
    * <li>each enum,</li>
    * <li>and each data type</li>
    * </ul>
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   interface Literals
   {
      /**
       * The meta object literal for the '{@link org.sourcepit.common.maven.environment.impl.EnvironmentSnapshotImpl
       * <em>Snapshot</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.maven.environment.impl.EnvironmentSnapshotImpl
       * @see org.sourcepit.common.maven.environment.impl.EnvironmentPackageImpl#getEnvironmentSnapshot()
       * @generated
       */
      EClass ENVIRONMENT_SNAPSHOT = eINSTANCE.getEnvironmentSnapshot();

      /**
       * The meta object literal for the '<em><b>Classpath</b></em>' attribute list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute ENVIRONMENT_SNAPSHOT__CLASSPATH = eINSTANCE.getEnvironmentSnapshot_Classpath();

      /**
       * The meta object literal for the '<em><b>Artifacts</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ENVIRONMENT_SNAPSHOT__ARTIFACTS = eINSTANCE.getEnvironmentSnapshot_Artifacts();

   }

} // EnvironmentPackage

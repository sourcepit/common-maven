/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.environment.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.sourcepit.common.maven.environment.EnvironmentFactory;
import org.sourcepit.common.maven.environment.EnvironmentPackage;
import org.sourcepit.common.maven.environment.EnvironmentSnapshot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class EnvironmentFactoryImpl extends EFactoryImpl implements EnvironmentFactory
{
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public static EnvironmentFactory init()
   {
      try
      {
         EnvironmentFactory theEnvironmentFactory = (EnvironmentFactory) EPackage.Registry.INSTANCE
            .getEFactory("http://www.sourcepit.org/common/maven/environment/0.1");
         if (theEnvironmentFactory != null)
         {
            return theEnvironmentFactory;
         }
      }
      catch (Exception exception)
      {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new EnvironmentFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EnvironmentFactoryImpl()
   {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public EObject create(EClass eClass)
   {
      switch (eClass.getClassifierID())
      {
         case EnvironmentPackage.ENVIRONMENT_SNAPSHOT :
            return createEnvironmentSnapshot();
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
   public EnvironmentSnapshot createEnvironmentSnapshot()
   {
      EnvironmentSnapshotImpl environmentSnapshot = new EnvironmentSnapshotImpl();
      return environmentSnapshot;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EnvironmentPackage getEnvironmentPackage()
   {
      return (EnvironmentPackage) getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @deprecated
    * @generated
    */
   @Deprecated
   public static EnvironmentPackage getPackage()
   {
      return EnvironmentPackage.eINSTANCE;
   }

} // EnvironmentFactoryImpl

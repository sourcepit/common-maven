/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * 
 * @see org.sourcepit.common.maven.model.MavenModelPackage
 * @generated
 */
public interface MavenModelFactory extends EFactory
{
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   MavenModelFactory eINSTANCE = org.sourcepit.common.maven.model.impl.MavenModelFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Maven Artifact</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Maven Artifact</em>'.
    * @generated
    */
   MavenArtifact createMavenArtifact();

   /**
    * Returns a new object of class '<em>Maven Dependency</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Maven Dependency</em>'.
    * @generated
    */
   MavenDependency createMavenDependency();

   /**
    * Returns a new object of class '<em>Maven Project</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Maven Project</em>'.
    * @generated
    */
   MavenProject createMavenProject();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the package supported by this factory.
    * @generated
    */
   MavenModelPackage getMavenModelPackage();

} // MavenModelFactory

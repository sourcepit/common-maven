/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maven Dependency</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.common.maven.model.MavenDependency#getVersionRange <em>Version Range</em>}</li>
 * <li>{@link org.sourcepit.common.maven.model.MavenDependency#getScope <em>Scope</em>}</li>
 * <li>{@link org.sourcepit.common.maven.model.MavenDependency#isOptional <em>Optional</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.sourcepit.common.maven.model.MavenModelPackage#getMavenDependency()
 * @model
 * @generated
 */
public interface MavenDependency extends Identifiable, Classified
{
   /**
    * Returns the value of the '<em><b>Version Range</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Version Range</em>' attribute isn't clear, there really should be more of a description
    * here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Version Range</em>' attribute.
    * @see #setVersionRange(String)
    * @see org.sourcepit.common.maven.model.MavenModelPackage#getMavenDependency_VersionRange()
    * @model
    * @generated
    */
   String getVersionRange();

   /**
    * Sets the value of the '{@link org.sourcepit.common.maven.model.MavenDependency#getVersionRange
    * <em>Version Range</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Version Range</em>' attribute.
    * @see #getVersionRange()
    * @generated
    */
   void setVersionRange(String value);

   /**
    * Returns the value of the '<em><b>Scope</b></em>' attribute.
    * The default value is <code>"compile"</code>.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Scope</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Scope</em>' attribute.
    * @see #setScope(String)
    * @see org.sourcepit.common.maven.model.MavenModelPackage#getMavenDependency_Scope()
    * @model default="compile"
    * @generated
    */
   String getScope();

   /**
    * Sets the value of the '{@link org.sourcepit.common.maven.model.MavenDependency#getScope <em>Scope</em>}'
    * attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Scope</em>' attribute.
    * @see #getScope()
    * @generated
    */
   void setScope(String value);

   /**
    * Returns the value of the '<em><b>Optional</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Optional</em>' attribute isn't clear, there really should be more of a description
    * here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Optional</em>' attribute.
    * @see #setOptional(boolean)
    * @see org.sourcepit.common.maven.model.MavenModelPackage#getMavenDependency_Optional()
    * @model
    * @generated
    */
   boolean isOptional();

   /**
    * Sets the value of the '{@link org.sourcepit.common.maven.model.MavenDependency#isOptional <em>Optional</em>}'
    * attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Optional</em>' attribute.
    * @see #isOptional()
    * @generated
    */
   void setOptional(boolean value);

} // MavenDependency

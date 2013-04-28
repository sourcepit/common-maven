/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency Declaration</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.common.maven.model.DependencyDeclaration#getVersionConstraint <em>Version Constraint</em>}</li>
 * <li>{@link org.sourcepit.common.maven.model.DependencyDeclaration#getScope <em>Scope</em>}</li>
 * <li>{@link org.sourcepit.common.maven.model.DependencyDeclaration#isOptional <em>Optional</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.sourcepit.common.maven.model.MavenModelPackage#getDependencyDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface DependencyDeclaration extends Identifiable, Classified
{
   /**
    * Returns the value of the '<em><b>Version Constraint</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Version Constraint</em>' attribute isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Version Constraint</em>' attribute.
    * @see #setVersionConstraint(String)
    * @see org.sourcepit.common.maven.model.MavenModelPackage#getDependencyDeclaration_VersionConstraint()
    * @model required="true"
    * @generated
    */
   String getVersionConstraint();

   /**
    * Sets the value of the '{@link org.sourcepit.common.maven.model.DependencyDeclaration#getVersionConstraint
    * <em>Version Constraint</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Version Constraint</em>' attribute.
    * @see #getVersionConstraint()
    * @generated
    */
   void setVersionConstraint(String value);

   /**
    * Returns the value of the '<em><b>Scope</b></em>' attribute.
    * The default value is <code>"compile"</code>.
    * The literals are from the enumeration {@link org.sourcepit.common.maven.model.Scope}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Scope</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Scope</em>' attribute.
    * @see org.sourcepit.common.maven.model.Scope
    * @see #setScope(Scope)
    * @see org.sourcepit.common.maven.model.MavenModelPackage#getDependencyDeclaration_Scope()
    * @model default="compile" required="true"
    * @generated
    */
   Scope getScope();

   /**
    * Sets the value of the '{@link org.sourcepit.common.maven.model.DependencyDeclaration#getScope <em>Scope</em>}'
    * attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Scope</em>' attribute.
    * @see org.sourcepit.common.maven.model.Scope
    * @see #getScope()
    * @generated
    */
   void setScope(Scope value);

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
    * @see org.sourcepit.common.maven.model.MavenModelPackage#getDependencyDeclaration_Optional()
    * @model
    * @generated
    */
   boolean isOptional();

   /**
    * Sets the value of the '{@link org.sourcepit.common.maven.model.DependencyDeclaration#isOptional <em>Optional</em>}
    * ' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Optional</em>' attribute.
    * @see #isOptional()
    * @generated
    */
   void setOptional(boolean value);

} // DependencyDeclaration

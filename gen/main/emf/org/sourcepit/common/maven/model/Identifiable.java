/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifiable</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.common.maven.model.Identifiable#getGroupId <em>Group Id</em>}</li>
 * <li>{@link org.sourcepit.common.maven.model.Identifiable#getArtifactId <em>Artifact Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.sourcepit.common.maven.model.MavenModelPackage#getIdentifiable()
 * @model abstract="true"
 * @generated
 */
public interface Identifiable extends EObject
{
   /**
    * Returns the value of the '<em><b>Group Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Group Id</em>' attribute isn't clear, there really should be more of a description
    * here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Group Id</em>' attribute.
    * @see #setGroupId(String)
    * @see org.sourcepit.common.maven.model.MavenModelPackage#getIdentifiable_GroupId()
    * @model required="true"
    * @generated
    */
   String getGroupId();

   /**
    * Sets the value of the '{@link org.sourcepit.common.maven.model.Identifiable#getGroupId <em>Group Id</em>}'
    * attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Group Id</em>' attribute.
    * @see #getGroupId()
    * @generated
    */
   void setGroupId(String value);

   /**
    * Returns the value of the '<em><b>Artifact Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Artifact Id</em>' attribute isn't clear, there really should be more of a description
    * here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Artifact Id</em>' attribute.
    * @see #setArtifactId(String)
    * @see org.sourcepit.common.maven.model.MavenModelPackage#getIdentifiable_ArtifactId()
    * @model required="true"
    * @generated
    */
   String getArtifactId();

   /**
    * Sets the value of the '{@link org.sourcepit.common.maven.model.Identifiable#getArtifactId <em>Artifact Id</em>}'
    * attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Artifact Id</em>' attribute.
    * @see #getArtifactId()
    * @generated
    */
   void setArtifactId(String value);

} // Identifiable

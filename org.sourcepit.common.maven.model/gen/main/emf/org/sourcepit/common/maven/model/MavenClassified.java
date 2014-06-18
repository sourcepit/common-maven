/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maven Classified</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.common.maven.model.MavenClassified#getClassifier <em>Classifier</em>}</li>
 * <li>{@link org.sourcepit.common.maven.model.MavenClassified#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.sourcepit.common.maven.model.MavenModelPackage#getMavenClassified()
 * @model abstract="true"
 * @generated
 */
public interface MavenClassified extends EObject
{
   /**
    * Returns the value of the '<em><b>Classifier</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Classifier</em>' attribute isn't clear, there really should be more of a description
    * here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Classifier</em>' attribute.
    * @see #setClassifier(String)
    * @see org.sourcepit.common.maven.model.MavenModelPackage#getMavenClassified_Classifier()
    * @model
    * @generated
    */
   String getClassifier();

   /**
    * Sets the value of the '{@link org.sourcepit.common.maven.model.MavenClassified#getClassifier <em>Classifier</em>}'
    * attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Classifier</em>' attribute.
    * @see #getClassifier()
    * @generated
    */
   void setClassifier(String value);

   /**
    * Returns the value of the '<em><b>Type</b></em>' attribute.
    * The default value is <code>"jar"</code>.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Type</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Type</em>' attribute.
    * @see #setType(String)
    * @see org.sourcepit.common.maven.model.MavenModelPackage#getMavenClassified_Type()
    * @model default="jar"
    * @generated
    */
   String getType();

   /**
    * Sets the value of the '{@link org.sourcepit.common.maven.model.MavenClassified#getType <em>Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Type</em>' attribute.
    * @see #getType()
    * @generated
    */
   void setType(String value);

} // MavenClassified

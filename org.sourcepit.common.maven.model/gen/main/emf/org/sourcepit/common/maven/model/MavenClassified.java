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
public interface MavenClassified extends EObject {
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

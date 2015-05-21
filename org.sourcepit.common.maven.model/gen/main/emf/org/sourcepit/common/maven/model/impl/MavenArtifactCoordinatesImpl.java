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

package org.sourcepit.common.maven.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.sourcepit.common.maven.model.ArtifactKey;
import org.sourcepit.common.maven.model.MavenArtifactCoordinates;
import org.sourcepit.common.maven.model.MavenClassified;
import org.sourcepit.common.maven.model.MavenModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maven Artifact Coordinates</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.common.maven.model.impl.MavenArtifactCoordinatesImpl#getClassifier <em>Classifier</em>}</li>
 * <li>{@link org.sourcepit.common.maven.model.impl.MavenArtifactCoordinatesImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class MavenArtifactCoordinatesImpl extends MavenProjectCoordinatesImpl
   implements
      MavenArtifactCoordinates {
   /**
    * The default value of the '{@link #getClassifier() <em>Classifier</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getClassifier()
    * @generated
    * @ordered
    */
   protected static final String CLASSIFIER_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getClassifier()
    * @generated
    * @ordered
    */
   protected String classifier = CLASSIFIER_EDEFAULT;

   /**
    * The default value of the '{@link #getType() <em>Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getType()
    * @generated
    * @ordered
    */
   protected static final String TYPE_EDEFAULT = "jar";

   /**
    * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getType()
    * @generated
    * @ordered
    */
   protected String type = TYPE_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected MavenArtifactCoordinatesImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return MavenModelPackage.Literals.MAVEN_ARTIFACT_COORDINATES;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getClassifier() {
      return classifier;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setClassifier(String newClassifier) {
      String oldClassifier = classifier;
      classifier = newClassifier;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            MavenModelPackage.MAVEN_ARTIFACT_COORDINATES__CLASSIFIER, oldClassifier, classifier));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getType() {
      return type;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setType(String newType) {
      String oldType = type;
      type = newType;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, MavenModelPackage.MAVEN_ARTIFACT_COORDINATES__TYPE,
            oldType, type));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public ArtifactKey getArtifactKey() {
      // TODO: implement this method
      // Ensure that you remove @generated or mark it @generated NOT
      throw new UnsupportedOperationException();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case MavenModelPackage.MAVEN_ARTIFACT_COORDINATES__CLASSIFIER :
            return getClassifier();
         case MavenModelPackage.MAVEN_ARTIFACT_COORDINATES__TYPE :
            return getType();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public void eSet(int featureID, Object newValue) {
      switch (featureID) {
         case MavenModelPackage.MAVEN_ARTIFACT_COORDINATES__CLASSIFIER :
            setClassifier((String) newValue);
            return;
         case MavenModelPackage.MAVEN_ARTIFACT_COORDINATES__TYPE :
            setType((String) newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public void eUnset(int featureID) {
      switch (featureID) {
         case MavenModelPackage.MAVEN_ARTIFACT_COORDINATES__CLASSIFIER :
            setClassifier(CLASSIFIER_EDEFAULT);
            return;
         case MavenModelPackage.MAVEN_ARTIFACT_COORDINATES__TYPE :
            setType(TYPE_EDEFAULT);
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public boolean eIsSet(int featureID) {
      switch (featureID) {
         case MavenModelPackage.MAVEN_ARTIFACT_COORDINATES__CLASSIFIER :
            return CLASSIFIER_EDEFAULT == null ? classifier != null : !CLASSIFIER_EDEFAULT.equals(classifier);
         case MavenModelPackage.MAVEN_ARTIFACT_COORDINATES__TYPE :
            return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
      if (baseClass == MavenClassified.class) {
         switch (derivedFeatureID) {
            case MavenModelPackage.MAVEN_ARTIFACT_COORDINATES__CLASSIFIER :
               return MavenModelPackage.MAVEN_CLASSIFIED__CLASSIFIER;
            case MavenModelPackage.MAVEN_ARTIFACT_COORDINATES__TYPE :
               return MavenModelPackage.MAVEN_CLASSIFIED__TYPE;
            default :
               return -1;
         }
      }
      return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
      if (baseClass == MavenClassified.class) {
         switch (baseFeatureID) {
            case MavenModelPackage.MAVEN_CLASSIFIED__CLASSIFIER :
               return MavenModelPackage.MAVEN_ARTIFACT_COORDINATES__CLASSIFIER;
            case MavenModelPackage.MAVEN_CLASSIFIED__TYPE :
               return MavenModelPackage.MAVEN_ARTIFACT_COORDINATES__TYPE;
            default :
               return -1;
         }
      }
      return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public String toString() {
      if (eIsProxy())
         return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (classifier: ");
      result.append(classifier);
      result.append(", type: ");
      result.append(type);
      result.append(')');
      return result.toString();
   }

} // MavenArtifactCoordinatesImpl

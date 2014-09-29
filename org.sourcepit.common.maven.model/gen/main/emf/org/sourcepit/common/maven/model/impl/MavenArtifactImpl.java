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

import java.io.File;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.sourcepit.common.maven.model.ArtifactConflictKey;
import org.sourcepit.common.maven.model.ArtifactKey;
import org.sourcepit.common.maven.model.MavenArtifact;
import org.sourcepit.common.maven.model.MavenArtifactConflictCoordinates;
import org.sourcepit.common.maven.model.MavenArtifactCoordinates;
import org.sourcepit.common.maven.model.MavenClassified;
import org.sourcepit.common.maven.model.MavenModelPackage;
import org.sourcepit.common.maven.model.MavenProjectCoordinates;
import org.sourcepit.common.maven.model.ProjectKey;
import org.sourcepit.common.modeling.impl.XAnnotatableImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maven Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.common.maven.model.impl.MavenArtifactImpl#getGroupId <em>Group Id</em>}</li>
 * <li>{@link org.sourcepit.common.maven.model.impl.MavenArtifactImpl#getArtifactId <em>Artifact Id</em>}</li>
 * <li>{@link org.sourcepit.common.maven.model.impl.MavenArtifactImpl#getVersion <em>Version</em>}</li>
 * <li>{@link org.sourcepit.common.maven.model.impl.MavenArtifactImpl#getClassifier <em>Classifier</em>}</li>
 * <li>{@link org.sourcepit.common.maven.model.impl.MavenArtifactImpl#getType <em>Type</em>}</li>
 * <li>{@link org.sourcepit.common.maven.model.impl.MavenArtifactImpl#getFile <em>File</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MavenArtifactImpl extends XAnnotatableImpl implements MavenArtifact
{
   /**
    * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getGroupId()
    * @generated
    * @ordered
    */
   protected static final String GROUP_ID_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getGroupId()
    * @generated
    * @ordered
    */
   protected String groupId = GROUP_ID_EDEFAULT;

   /**
    * The default value of the '{@link #getArtifactId() <em>Artifact Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getArtifactId()
    * @generated
    * @ordered
    */
   protected static final String ARTIFACT_ID_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getArtifactId() <em>Artifact Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getArtifactId()
    * @generated
    * @ordered
    */
   protected String artifactId = ARTIFACT_ID_EDEFAULT;

   /**
    * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getVersion()
    * @generated
    * @ordered
    */
   protected static final String VERSION_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getVersion()
    * @generated
    * @ordered
    */
   protected String version = VERSION_EDEFAULT;

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
    * The default value of the '{@link #getFile() <em>File</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getFile()
    * @generated
    * @ordered
    */
   protected static final File FILE_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getFile()
    * @generated
    * @ordered
    */
   protected File file = FILE_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected MavenArtifactImpl()
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
   protected EClass eStaticClass()
   {
      return MavenModelPackage.Literals.MAVEN_ARTIFACT;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getGroupId()
   {
      return groupId;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setGroupId(String newGroupId)
   {
      String oldGroupId = groupId;
      groupId = newGroupId;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, MavenModelPackage.MAVEN_ARTIFACT__GROUP_ID, oldGroupId,
            groupId));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getArtifactId()
   {
      return artifactId;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setArtifactId(String newArtifactId)
   {
      String oldArtifactId = artifactId;
      artifactId = newArtifactId;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, MavenModelPackage.MAVEN_ARTIFACT__ARTIFACT_ID,
            oldArtifactId, artifactId));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getVersion()
   {
      return version;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setVersion(String newVersion)
   {
      String oldVersion = version;
      version = newVersion;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, MavenModelPackage.MAVEN_ARTIFACT__VERSION, oldVersion,
            version));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getClassifier()
   {
      return classifier;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setClassifier(String newClassifier)
   {
      String oldClassifier = classifier;
      classifier = newClassifier;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, MavenModelPackage.MAVEN_ARTIFACT__CLASSIFIER,
            oldClassifier, classifier));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getType()
   {
      return type;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setType(String newType)
   {
      String oldType = type;
      type = newType;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, MavenModelPackage.MAVEN_ARTIFACT__TYPE, oldType, type));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public File getFile()
   {
      return file;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setFile(File newFile)
   {
      File oldFile = file;
      file = newFile;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, MavenModelPackage.MAVEN_ARTIFACT__FILE, oldFile, file));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public ArtifactKey getArtifactKey()
   {
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
   public ProjectKey getProjectKey()
   {
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
   public ArtifactConflictKey getArtifactConflictKey()
   {
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
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
         case MavenModelPackage.MAVEN_ARTIFACT__GROUP_ID :
            return getGroupId();
         case MavenModelPackage.MAVEN_ARTIFACT__ARTIFACT_ID :
            return getArtifactId();
         case MavenModelPackage.MAVEN_ARTIFACT__VERSION :
            return getVersion();
         case MavenModelPackage.MAVEN_ARTIFACT__CLASSIFIER :
            return getClassifier();
         case MavenModelPackage.MAVEN_ARTIFACT__TYPE :
            return getType();
         case MavenModelPackage.MAVEN_ARTIFACT__FILE :
            return getFile();
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
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
         case MavenModelPackage.MAVEN_ARTIFACT__GROUP_ID :
            setGroupId((String) newValue);
            return;
         case MavenModelPackage.MAVEN_ARTIFACT__ARTIFACT_ID :
            setArtifactId((String) newValue);
            return;
         case MavenModelPackage.MAVEN_ARTIFACT__VERSION :
            setVersion((String) newValue);
            return;
         case MavenModelPackage.MAVEN_ARTIFACT__CLASSIFIER :
            setClassifier((String) newValue);
            return;
         case MavenModelPackage.MAVEN_ARTIFACT__TYPE :
            setType((String) newValue);
            return;
         case MavenModelPackage.MAVEN_ARTIFACT__FILE :
            setFile((File) newValue);
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
   public void eUnset(int featureID)
   {
      switch (featureID)
      {
         case MavenModelPackage.MAVEN_ARTIFACT__GROUP_ID :
            setGroupId(GROUP_ID_EDEFAULT);
            return;
         case MavenModelPackage.MAVEN_ARTIFACT__ARTIFACT_ID :
            setArtifactId(ARTIFACT_ID_EDEFAULT);
            return;
         case MavenModelPackage.MAVEN_ARTIFACT__VERSION :
            setVersion(VERSION_EDEFAULT);
            return;
         case MavenModelPackage.MAVEN_ARTIFACT__CLASSIFIER :
            setClassifier(CLASSIFIER_EDEFAULT);
            return;
         case MavenModelPackage.MAVEN_ARTIFACT__TYPE :
            setType(TYPE_EDEFAULT);
            return;
         case MavenModelPackage.MAVEN_ARTIFACT__FILE :
            setFile(FILE_EDEFAULT);
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
   public boolean eIsSet(int featureID)
   {
      switch (featureID)
      {
         case MavenModelPackage.MAVEN_ARTIFACT__GROUP_ID :
            return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
         case MavenModelPackage.MAVEN_ARTIFACT__ARTIFACT_ID :
            return ARTIFACT_ID_EDEFAULT == null ? artifactId != null : !ARTIFACT_ID_EDEFAULT.equals(artifactId);
         case MavenModelPackage.MAVEN_ARTIFACT__VERSION :
            return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
         case MavenModelPackage.MAVEN_ARTIFACT__CLASSIFIER :
            return CLASSIFIER_EDEFAULT == null ? classifier != null : !CLASSIFIER_EDEFAULT.equals(classifier);
         case MavenModelPackage.MAVEN_ARTIFACT__TYPE :
            return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
         case MavenModelPackage.MAVEN_ARTIFACT__FILE :
            return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
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
   public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
   {
      if (baseClass == MavenArtifactConflictCoordinates.class)
      {
         switch (derivedFeatureID)
         {
            case MavenModelPackage.MAVEN_ARTIFACT__GROUP_ID :
               return MavenModelPackage.MAVEN_ARTIFACT_CONFLICT_COORDINATES__GROUP_ID;
            case MavenModelPackage.MAVEN_ARTIFACT__ARTIFACT_ID :
               return MavenModelPackage.MAVEN_ARTIFACT_CONFLICT_COORDINATES__ARTIFACT_ID;
            default :
               return -1;
         }
      }
      if (baseClass == MavenProjectCoordinates.class)
      {
         switch (derivedFeatureID)
         {
            case MavenModelPackage.MAVEN_ARTIFACT__VERSION :
               return MavenModelPackage.MAVEN_PROJECT_COORDINATES__VERSION;
            default :
               return -1;
         }
      }
      if (baseClass == MavenClassified.class)
      {
         switch (derivedFeatureID)
         {
            case MavenModelPackage.MAVEN_ARTIFACT__CLASSIFIER :
               return MavenModelPackage.MAVEN_CLASSIFIED__CLASSIFIER;
            case MavenModelPackage.MAVEN_ARTIFACT__TYPE :
               return MavenModelPackage.MAVEN_CLASSIFIED__TYPE;
            default :
               return -1;
         }
      }
      if (baseClass == MavenArtifactCoordinates.class)
      {
         switch (derivedFeatureID)
         {
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
   public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
   {
      if (baseClass == MavenArtifactConflictCoordinates.class)
      {
         switch (baseFeatureID)
         {
            case MavenModelPackage.MAVEN_ARTIFACT_CONFLICT_COORDINATES__GROUP_ID :
               return MavenModelPackage.MAVEN_ARTIFACT__GROUP_ID;
            case MavenModelPackage.MAVEN_ARTIFACT_CONFLICT_COORDINATES__ARTIFACT_ID :
               return MavenModelPackage.MAVEN_ARTIFACT__ARTIFACT_ID;
            default :
               return -1;
         }
      }
      if (baseClass == MavenProjectCoordinates.class)
      {
         switch (baseFeatureID)
         {
            case MavenModelPackage.MAVEN_PROJECT_COORDINATES__VERSION :
               return MavenModelPackage.MAVEN_ARTIFACT__VERSION;
            default :
               return -1;
         }
      }
      if (baseClass == MavenClassified.class)
      {
         switch (baseFeatureID)
         {
            case MavenModelPackage.MAVEN_CLASSIFIED__CLASSIFIER :
               return MavenModelPackage.MAVEN_ARTIFACT__CLASSIFIER;
            case MavenModelPackage.MAVEN_CLASSIFIED__TYPE :
               return MavenModelPackage.MAVEN_ARTIFACT__TYPE;
            default :
               return -1;
         }
      }
      if (baseClass == MavenArtifactCoordinates.class)
      {
         switch (baseFeatureID)
         {
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
   public String toString()
   {
      if (eIsProxy())
         return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (groupId: ");
      result.append(groupId);
      result.append(", artifactId: ");
      result.append(artifactId);
      result.append(", version: ");
      result.append(version);
      result.append(", classifier: ");
      result.append(classifier);
      result.append(", type: ");
      result.append(type);
      result.append(", file: ");
      result.append(file);
      result.append(')');
      return result.toString();
   }

} // MavenArtifactImpl

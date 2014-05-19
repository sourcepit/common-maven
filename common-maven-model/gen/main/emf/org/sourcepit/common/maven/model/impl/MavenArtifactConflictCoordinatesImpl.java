/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.sourcepit.common.maven.model.ArtifactConflictKey;
import org.sourcepit.common.maven.model.MavenArtifactConflictCoordinates;
import org.sourcepit.common.maven.model.MavenModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maven Artifact Conflict Coordinates</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.common.maven.model.impl.MavenArtifactConflictCoordinatesImpl#getGroupId <em>Group Id</em>}</li>
 * <li>{@link org.sourcepit.common.maven.model.impl.MavenArtifactConflictCoordinatesImpl#getArtifactId <em>Artifact Id
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class MavenArtifactConflictCoordinatesImpl extends EObjectImpl
   implements
      MavenArtifactConflictCoordinates
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
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected MavenArtifactConflictCoordinatesImpl()
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
      return MavenModelPackage.Literals.MAVEN_ARTIFACT_CONFLICT_COORDINATES;
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
         eNotify(new ENotificationImpl(this, Notification.SET,
            MavenModelPackage.MAVEN_ARTIFACT_CONFLICT_COORDINATES__GROUP_ID, oldGroupId, groupId));
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
         eNotify(new ENotificationImpl(this, Notification.SET,
            MavenModelPackage.MAVEN_ARTIFACT_CONFLICT_COORDINATES__ARTIFACT_ID, oldArtifactId, artifactId));
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
         case MavenModelPackage.MAVEN_ARTIFACT_CONFLICT_COORDINATES__GROUP_ID :
            return getGroupId();
         case MavenModelPackage.MAVEN_ARTIFACT_CONFLICT_COORDINATES__ARTIFACT_ID :
            return getArtifactId();
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
         case MavenModelPackage.MAVEN_ARTIFACT_CONFLICT_COORDINATES__GROUP_ID :
            setGroupId((String) newValue);
            return;
         case MavenModelPackage.MAVEN_ARTIFACT_CONFLICT_COORDINATES__ARTIFACT_ID :
            setArtifactId((String) newValue);
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
         case MavenModelPackage.MAVEN_ARTIFACT_CONFLICT_COORDINATES__GROUP_ID :
            setGroupId(GROUP_ID_EDEFAULT);
            return;
         case MavenModelPackage.MAVEN_ARTIFACT_CONFLICT_COORDINATES__ARTIFACT_ID :
            setArtifactId(ARTIFACT_ID_EDEFAULT);
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
         case MavenModelPackage.MAVEN_ARTIFACT_CONFLICT_COORDINATES__GROUP_ID :
            return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
         case MavenModelPackage.MAVEN_ARTIFACT_CONFLICT_COORDINATES__ARTIFACT_ID :
            return ARTIFACT_ID_EDEFAULT == null ? artifactId != null : !ARTIFACT_ID_EDEFAULT.equals(artifactId);
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
   public String toString()
   {
      if (eIsProxy())
         return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (groupId: ");
      result.append(groupId);
      result.append(", artifactId: ");
      result.append(artifactId);
      result.append(')');
      return result.toString();
   }

} // MavenArtifactConflictCoordinatesImpl

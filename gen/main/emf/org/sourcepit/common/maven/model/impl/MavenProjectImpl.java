/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.model.impl;

import java.io.File;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.sourcepit.common.maven.model.MavenModelPackage;
import org.sourcepit.common.maven.model.MavenProject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maven Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.common.maven.model.impl.MavenProjectImpl#getPackaging <em>Packaging</em>}</li>
 * <li>{@link org.sourcepit.common.maven.model.impl.MavenProjectImpl#getPomFile <em>Pom File</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MavenProjectImpl extends VersionedIdentifiableImpl implements MavenProject
{
   /**
    * The default value of the '{@link #getPackaging() <em>Packaging</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getPackaging()
    * @generated
    * @ordered
    */
   protected static final String PACKAGING_EDEFAULT = "jar";

   /**
    * The cached value of the '{@link #getPackaging() <em>Packaging</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getPackaging()
    * @generated
    * @ordered
    */
   protected String packaging = PACKAGING_EDEFAULT;

   /**
    * The default value of the '{@link #getPomFile() <em>Pom File</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getPomFile()
    * @generated
    * @ordered
    */
   protected static final File POM_FILE_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getPomFile() <em>Pom File</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getPomFile()
    * @generated
    * @ordered
    */
   protected File pomFile = POM_FILE_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected MavenProjectImpl()
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
      return MavenModelPackage.Literals.MAVEN_PROJECT;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getPackaging()
   {
      return packaging;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setPackaging(String newPackaging)
   {
      String oldPackaging = packaging;
      packaging = newPackaging;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, MavenModelPackage.MAVEN_PROJECT__PACKAGING,
            oldPackaging, packaging));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public File getPomFile()
   {
      return pomFile;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setPomFile(File newPomFile)
   {
      File oldPomFile = pomFile;
      pomFile = newPomFile;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, MavenModelPackage.MAVEN_PROJECT__POM_FILE, oldPomFile,
            pomFile));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public File getProjectDir()
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
         case MavenModelPackage.MAVEN_PROJECT__PACKAGING :
            return getPackaging();
         case MavenModelPackage.MAVEN_PROJECT__POM_FILE :
            return getPomFile();
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
         case MavenModelPackage.MAVEN_PROJECT__PACKAGING :
            setPackaging((String) newValue);
            return;
         case MavenModelPackage.MAVEN_PROJECT__POM_FILE :
            setPomFile((File) newValue);
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
         case MavenModelPackage.MAVEN_PROJECT__PACKAGING :
            setPackaging(PACKAGING_EDEFAULT);
            return;
         case MavenModelPackage.MAVEN_PROJECT__POM_FILE :
            setPomFile(POM_FILE_EDEFAULT);
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
         case MavenModelPackage.MAVEN_PROJECT__PACKAGING :
            return PACKAGING_EDEFAULT == null ? packaging != null : !PACKAGING_EDEFAULT.equals(packaging);
         case MavenModelPackage.MAVEN_PROJECT__POM_FILE :
            return POM_FILE_EDEFAULT == null ? pomFile != null : !POM_FILE_EDEFAULT.equals(pomFile);
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
      result.append(" (packaging: ");
      result.append(packaging);
      result.append(", pomFile: ");
      result.append(pomFile);
      result.append(')');
      return result.toString();
   }

} // MavenProjectImpl

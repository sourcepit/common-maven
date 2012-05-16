/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.environment.impl;

import java.net.URL;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.sourcepit.common.maven.environment.EnvironmentPackage;
import org.sourcepit.common.maven.environment.EnvironmentSnapshot;
import org.sourcepit.common.maven.model.MavenArtifact;
import org.sourcepit.modeling.common.impl.XAnnotatableImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Snapshot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.common.maven.environment.impl.EnvironmentSnapshotImpl#getClasspath <em>Classpath</em>}</li>
 * <li>{@link org.sourcepit.common.maven.environment.impl.EnvironmentSnapshotImpl#getArtifacts <em>Artifacts</em>}</li>
 * <li>{@link org.sourcepit.common.maven.environment.impl.EnvironmentSnapshotImpl#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class EnvironmentSnapshotImpl extends XAnnotatableImpl implements EnvironmentSnapshot
{
   /**
    * The cached value of the '{@link #getClasspath() <em>Classpath</em>}' attribute list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getClasspath()
    * @generated
    * @ordered
    */
   protected EList<URL> classpath;

   /**
    * The cached value of the '{@link #getArtifacts() <em>Artifacts</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getArtifacts()
    * @generated
    * @ordered
    */
   protected EList<MavenArtifact> artifacts;

   /**
    * The cached value of the '{@link #getPackages() <em>Packages</em>}' attribute list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getPackages()
    * @generated
    * @ordered
    */
   protected EList<String> packages;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected EnvironmentSnapshotImpl()
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
      return EnvironmentPackage.Literals.ENVIRONMENT_SNAPSHOT;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<URL> getClasspath()
   {
      if (classpath == null)
      {
         classpath = new EDataTypeUniqueEList<URL>(URL.class, this, EnvironmentPackage.ENVIRONMENT_SNAPSHOT__CLASSPATH);
      }
      return classpath;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<MavenArtifact> getArtifacts()
   {
      if (artifacts == null)
      {
         artifacts = new EObjectContainmentEList<MavenArtifact>(MavenArtifact.class, this,
            EnvironmentPackage.ENVIRONMENT_SNAPSHOT__ARTIFACTS);
      }
      return artifacts;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<String> getPackages()
   {
      if (packages == null)
      {
         packages = new EDataTypeUniqueEList<String>(String.class, this,
            EnvironmentPackage.ENVIRONMENT_SNAPSHOT__PACKAGES);
      }
      return packages;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case EnvironmentPackage.ENVIRONMENT_SNAPSHOT__ARTIFACTS :
            return ((InternalEList<?>) getArtifacts()).basicRemove(otherEnd, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
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
         case EnvironmentPackage.ENVIRONMENT_SNAPSHOT__CLASSPATH :
            return getClasspath();
         case EnvironmentPackage.ENVIRONMENT_SNAPSHOT__ARTIFACTS :
            return getArtifacts();
         case EnvironmentPackage.ENVIRONMENT_SNAPSHOT__PACKAGES :
            return getPackages();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
         case EnvironmentPackage.ENVIRONMENT_SNAPSHOT__CLASSPATH :
            getClasspath().clear();
            getClasspath().addAll((Collection<? extends URL>) newValue);
            return;
         case EnvironmentPackage.ENVIRONMENT_SNAPSHOT__ARTIFACTS :
            getArtifacts().clear();
            getArtifacts().addAll((Collection<? extends MavenArtifact>) newValue);
            return;
         case EnvironmentPackage.ENVIRONMENT_SNAPSHOT__PACKAGES :
            getPackages().clear();
            getPackages().addAll((Collection<? extends String>) newValue);
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
         case EnvironmentPackage.ENVIRONMENT_SNAPSHOT__CLASSPATH :
            getClasspath().clear();
            return;
         case EnvironmentPackage.ENVIRONMENT_SNAPSHOT__ARTIFACTS :
            getArtifacts().clear();
            return;
         case EnvironmentPackage.ENVIRONMENT_SNAPSHOT__PACKAGES :
            getPackages().clear();
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
         case EnvironmentPackage.ENVIRONMENT_SNAPSHOT__CLASSPATH :
            return classpath != null && !classpath.isEmpty();
         case EnvironmentPackage.ENVIRONMENT_SNAPSHOT__ARTIFACTS :
            return artifacts != null && !artifacts.isEmpty();
         case EnvironmentPackage.ENVIRONMENT_SNAPSHOT__PACKAGES :
            return packages != null && !packages.isEmpty();
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
      result.append(" (classpath: ");
      result.append(classpath);
      result.append(", packages: ");
      result.append(packages);
      result.append(')');
      return result.toString();
   }

} // EnvironmentSnapshotImpl

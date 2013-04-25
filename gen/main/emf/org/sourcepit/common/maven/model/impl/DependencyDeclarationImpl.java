/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.sourcepit.common.maven.model.Classified;
import org.sourcepit.common.maven.model.DependencyDeclaration;
import org.sourcepit.common.maven.model.MavenModelPackage;
import org.sourcepit.common.maven.model.Scope;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.common.maven.model.impl.DependencyDeclarationImpl#getClassifier <em>Classifier</em>}</li>
 * <li>{@link org.sourcepit.common.maven.model.impl.DependencyDeclarationImpl#getType <em>Type</em>}</li>
 * <li>{@link org.sourcepit.common.maven.model.impl.DependencyDeclarationImpl#getVersionConstraint <em>Version
 * Constraint</em>}</li>
 * <li>{@link org.sourcepit.common.maven.model.impl.DependencyDeclarationImpl#getScope <em>Scope</em>}</li>
 * <li>{@link org.sourcepit.common.maven.model.impl.DependencyDeclarationImpl#isOptional <em>Optional</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class DependencyDeclarationImpl extends IdentifiableImpl implements DependencyDeclaration
{
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
    * The default value of the '{@link #getVersionConstraint() <em>Version Constraint</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getVersionConstraint()
    * @generated
    * @ordered
    */
   protected static final String VERSION_CONSTRAINT_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getVersionConstraint() <em>Version Constraint</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getVersionConstraint()
    * @generated
    * @ordered
    */
   protected String versionConstraint = VERSION_CONSTRAINT_EDEFAULT;

   /**
    * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getScope()
    * @generated
    * @ordered
    */
   protected static final Scope SCOPE_EDEFAULT = Scope.COMPILE;

   /**
    * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getScope()
    * @generated
    * @ordered
    */
   protected Scope scope = SCOPE_EDEFAULT;

   /**
    * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #isOptional()
    * @generated
    * @ordered
    */
   protected static final boolean OPTIONAL_EDEFAULT = false;

   /**
    * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #isOptional()
    * @generated
    * @ordered
    */
   protected boolean optional = OPTIONAL_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected DependencyDeclarationImpl()
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
      return MavenModelPackage.Literals.DEPENDENCY_DECLARATION;
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
         eNotify(new ENotificationImpl(this, Notification.SET, MavenModelPackage.DEPENDENCY_DECLARATION__CLASSIFIER,
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
         eNotify(new ENotificationImpl(this, Notification.SET, MavenModelPackage.DEPENDENCY_DECLARATION__TYPE, oldType,
            type));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getVersionConstraint()
   {
      return versionConstraint;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setVersionConstraint(String newVersionConstraint)
   {
      String oldVersionConstraint = versionConstraint;
      versionConstraint = newVersionConstraint;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            MavenModelPackage.DEPENDENCY_DECLARATION__VERSION_CONSTRAINT, oldVersionConstraint, versionConstraint));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public Scope getScope()
   {
      return scope;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setScope(Scope newScope)
   {
      Scope oldScope = scope;
      scope = newScope == null ? SCOPE_EDEFAULT : newScope;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, MavenModelPackage.DEPENDENCY_DECLARATION__SCOPE,
            oldScope, scope));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public boolean isOptional()
   {
      return optional;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setOptional(boolean newOptional)
   {
      boolean oldOptional = optional;
      optional = newOptional;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, MavenModelPackage.DEPENDENCY_DECLARATION__OPTIONAL,
            oldOptional, optional));
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
         case MavenModelPackage.DEPENDENCY_DECLARATION__CLASSIFIER :
            return getClassifier();
         case MavenModelPackage.DEPENDENCY_DECLARATION__TYPE :
            return getType();
         case MavenModelPackage.DEPENDENCY_DECLARATION__VERSION_CONSTRAINT :
            return getVersionConstraint();
         case MavenModelPackage.DEPENDENCY_DECLARATION__SCOPE :
            return getScope();
         case MavenModelPackage.DEPENDENCY_DECLARATION__OPTIONAL :
            return isOptional();
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
         case MavenModelPackage.DEPENDENCY_DECLARATION__CLASSIFIER :
            setClassifier((String) newValue);
            return;
         case MavenModelPackage.DEPENDENCY_DECLARATION__TYPE :
            setType((String) newValue);
            return;
         case MavenModelPackage.DEPENDENCY_DECLARATION__VERSION_CONSTRAINT :
            setVersionConstraint((String) newValue);
            return;
         case MavenModelPackage.DEPENDENCY_DECLARATION__SCOPE :
            setScope((Scope) newValue);
            return;
         case MavenModelPackage.DEPENDENCY_DECLARATION__OPTIONAL :
            setOptional((Boolean) newValue);
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
         case MavenModelPackage.DEPENDENCY_DECLARATION__CLASSIFIER :
            setClassifier(CLASSIFIER_EDEFAULT);
            return;
         case MavenModelPackage.DEPENDENCY_DECLARATION__TYPE :
            setType(TYPE_EDEFAULT);
            return;
         case MavenModelPackage.DEPENDENCY_DECLARATION__VERSION_CONSTRAINT :
            setVersionConstraint(VERSION_CONSTRAINT_EDEFAULT);
            return;
         case MavenModelPackage.DEPENDENCY_DECLARATION__SCOPE :
            setScope(SCOPE_EDEFAULT);
            return;
         case MavenModelPackage.DEPENDENCY_DECLARATION__OPTIONAL :
            setOptional(OPTIONAL_EDEFAULT);
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
         case MavenModelPackage.DEPENDENCY_DECLARATION__CLASSIFIER :
            return CLASSIFIER_EDEFAULT == null ? classifier != null : !CLASSIFIER_EDEFAULT.equals(classifier);
         case MavenModelPackage.DEPENDENCY_DECLARATION__TYPE :
            return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
         case MavenModelPackage.DEPENDENCY_DECLARATION__VERSION_CONSTRAINT :
            return VERSION_CONSTRAINT_EDEFAULT == null ? versionConstraint != null : !VERSION_CONSTRAINT_EDEFAULT
               .equals(versionConstraint);
         case MavenModelPackage.DEPENDENCY_DECLARATION__SCOPE :
            return scope != SCOPE_EDEFAULT;
         case MavenModelPackage.DEPENDENCY_DECLARATION__OPTIONAL :
            return optional != OPTIONAL_EDEFAULT;
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
      if (baseClass == Classified.class)
      {
         switch (derivedFeatureID)
         {
            case MavenModelPackage.DEPENDENCY_DECLARATION__CLASSIFIER :
               return MavenModelPackage.CLASSIFIED__CLASSIFIER;
            case MavenModelPackage.DEPENDENCY_DECLARATION__TYPE :
               return MavenModelPackage.CLASSIFIED__TYPE;
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
      if (baseClass == Classified.class)
      {
         switch (baseFeatureID)
         {
            case MavenModelPackage.CLASSIFIED__CLASSIFIER :
               return MavenModelPackage.DEPENDENCY_DECLARATION__CLASSIFIER;
            case MavenModelPackage.CLASSIFIED__TYPE :
               return MavenModelPackage.DEPENDENCY_DECLARATION__TYPE;
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
      result.append(" (classifier: ");
      result.append(classifier);
      result.append(", type: ");
      result.append(type);
      result.append(", versionConstraint: ");
      result.append(versionConstraint);
      result.append(", scope: ");
      result.append(scope);
      result.append(", optional: ");
      result.append(optional);
      result.append(')');
      return result.toString();
   }

} // DependencyDeclarationImpl

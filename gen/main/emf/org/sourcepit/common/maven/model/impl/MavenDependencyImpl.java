/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.sourcepit.common.maven.model.Classified;
import org.sourcepit.common.maven.model.MavenDependency;
import org.sourcepit.common.maven.model.MavenModelPackage;
import org.sourcepit.modeling.common.Annotatable;
import org.sourcepit.modeling.common.Annotation;
import org.sourcepit.modeling.common.CommonModelPackage;
import org.sourcepit.modeling.common.Extendable;
import org.sourcepit.modeling.common.XAnnotatable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maven Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.common.maven.model.impl.MavenDependencyImpl#getClassifier <em>Classifier</em>}</li>
 * <li>{@link org.sourcepit.common.maven.model.impl.MavenDependencyImpl#getType <em>Type</em>}</li>
 * <li>{@link org.sourcepit.common.maven.model.impl.MavenDependencyImpl#getExtensions <em>Extensions</em>}</li>
 * <li>{@link org.sourcepit.common.maven.model.impl.MavenDependencyImpl#getAnnotations <em>Annotations</em>}</li>
 * <li>{@link org.sourcepit.common.maven.model.impl.MavenDependencyImpl#getVersionRange <em>Version Range</em>}</li>
 * <li>{@link org.sourcepit.common.maven.model.impl.MavenDependencyImpl#getScope <em>Scope</em>}</li>
 * <li>{@link org.sourcepit.common.maven.model.impl.MavenDependencyImpl#isOptional <em>Optional</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MavenDependencyImpl extends IdentifiableImpl implements MavenDependency
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
    * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getExtensions()
    * @generated
    * @ordered
    */
   protected EList<EObject> extensions;

   /**
    * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getAnnotations()
    * @generated
    * @ordered
    */
   protected EList<Annotation> annotations;

   /**
    * The default value of the '{@link #getVersionRange() <em>Version Range</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getVersionRange()
    * @generated
    * @ordered
    */
   protected static final String VERSION_RANGE_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getVersionRange() <em>Version Range</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getVersionRange()
    * @generated
    * @ordered
    */
   protected String versionRange = VERSION_RANGE_EDEFAULT;

   /**
    * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getScope()
    * @generated
    * @ordered
    */
   protected static final String SCOPE_EDEFAULT = "compile";

   /**
    * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getScope()
    * @generated
    * @ordered
    */
   protected String scope = SCOPE_EDEFAULT;

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
   protected MavenDependencyImpl()
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
      return MavenModelPackage.Literals.MAVEN_DEPENDENCY;
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
         eNotify(new ENotificationImpl(this, Notification.SET, MavenModelPackage.MAVEN_DEPENDENCY__CLASSIFIER,
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
         eNotify(new ENotificationImpl(this, Notification.SET, MavenModelPackage.MAVEN_DEPENDENCY__TYPE, oldType, type));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<EObject> getExtensions()
   {
      if (extensions == null)
      {
         extensions = new EObjectContainmentEList<EObject>(EObject.class, this,
            MavenModelPackage.MAVEN_DEPENDENCY__EXTENSIONS);
      }
      return extensions;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<Annotation> getAnnotations()
   {
      if (annotations == null)
      {
         annotations = new EObjectContainmentWithInverseEList<Annotation>(Annotation.class, this,
            MavenModelPackage.MAVEN_DEPENDENCY__ANNOTATIONS, CommonModelPackage.ANNOTATION__TARGET);
      }
      return annotations;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getVersionRange()
   {
      return versionRange;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setVersionRange(String newVersionRange)
   {
      String oldVersionRange = versionRange;
      versionRange = newVersionRange;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, MavenModelPackage.MAVEN_DEPENDENCY__VERSION_RANGE,
            oldVersionRange, versionRange));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getScope()
   {
      return scope;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setScope(String newScope)
   {
      String oldScope = scope;
      scope = newScope;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, MavenModelPackage.MAVEN_DEPENDENCY__SCOPE, oldScope,
            scope));
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
         eNotify(new ENotificationImpl(this, Notification.SET, MavenModelPackage.MAVEN_DEPENDENCY__OPTIONAL,
            oldOptional, optional));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public Annotation getAnnotation(String source)
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
   public Annotation getAnnotation(String source, boolean createOnDemand)
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
   public String getAnnotationData(String source, String key)
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
   public <T extends EObject> T getExtension(Class<T> extensionType)
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
   public <T extends EObject> EList<T> getExtensions(Class<T> extensionType)
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
   public <T extends EObject> void addExtension(T extension)
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
   public <T extends EObject> void removeExtension(T extension)
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
   public <T extends EObject> void removeExtensions(Class<T> extentionType)
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
   @SuppressWarnings("unchecked")
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case MavenModelPackage.MAVEN_DEPENDENCY__ANNOTATIONS :
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getAnnotations()).basicAdd(otherEnd, msgs);
      }
      return super.eInverseAdd(otherEnd, featureID, msgs);
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
         case MavenModelPackage.MAVEN_DEPENDENCY__EXTENSIONS :
            return ((InternalEList<?>) getExtensions()).basicRemove(otherEnd, msgs);
         case MavenModelPackage.MAVEN_DEPENDENCY__ANNOTATIONS :
            return ((InternalEList<?>) getAnnotations()).basicRemove(otherEnd, msgs);
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
         case MavenModelPackage.MAVEN_DEPENDENCY__CLASSIFIER :
            return getClassifier();
         case MavenModelPackage.MAVEN_DEPENDENCY__TYPE :
            return getType();
         case MavenModelPackage.MAVEN_DEPENDENCY__EXTENSIONS :
            return getExtensions();
         case MavenModelPackage.MAVEN_DEPENDENCY__ANNOTATIONS :
            return getAnnotations();
         case MavenModelPackage.MAVEN_DEPENDENCY__VERSION_RANGE :
            return getVersionRange();
         case MavenModelPackage.MAVEN_DEPENDENCY__SCOPE :
            return getScope();
         case MavenModelPackage.MAVEN_DEPENDENCY__OPTIONAL :
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
   @SuppressWarnings("unchecked")
   @Override
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
         case MavenModelPackage.MAVEN_DEPENDENCY__CLASSIFIER :
            setClassifier((String) newValue);
            return;
         case MavenModelPackage.MAVEN_DEPENDENCY__TYPE :
            setType((String) newValue);
            return;
         case MavenModelPackage.MAVEN_DEPENDENCY__EXTENSIONS :
            getExtensions().clear();
            getExtensions().addAll((Collection<? extends EObject>) newValue);
            return;
         case MavenModelPackage.MAVEN_DEPENDENCY__ANNOTATIONS :
            getAnnotations().clear();
            getAnnotations().addAll((Collection<? extends Annotation>) newValue);
            return;
         case MavenModelPackage.MAVEN_DEPENDENCY__VERSION_RANGE :
            setVersionRange((String) newValue);
            return;
         case MavenModelPackage.MAVEN_DEPENDENCY__SCOPE :
            setScope((String) newValue);
            return;
         case MavenModelPackage.MAVEN_DEPENDENCY__OPTIONAL :
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
         case MavenModelPackage.MAVEN_DEPENDENCY__CLASSIFIER :
            setClassifier(CLASSIFIER_EDEFAULT);
            return;
         case MavenModelPackage.MAVEN_DEPENDENCY__TYPE :
            setType(TYPE_EDEFAULT);
            return;
         case MavenModelPackage.MAVEN_DEPENDENCY__EXTENSIONS :
            getExtensions().clear();
            return;
         case MavenModelPackage.MAVEN_DEPENDENCY__ANNOTATIONS :
            getAnnotations().clear();
            return;
         case MavenModelPackage.MAVEN_DEPENDENCY__VERSION_RANGE :
            setVersionRange(VERSION_RANGE_EDEFAULT);
            return;
         case MavenModelPackage.MAVEN_DEPENDENCY__SCOPE :
            setScope(SCOPE_EDEFAULT);
            return;
         case MavenModelPackage.MAVEN_DEPENDENCY__OPTIONAL :
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
         case MavenModelPackage.MAVEN_DEPENDENCY__CLASSIFIER :
            return CLASSIFIER_EDEFAULT == null ? classifier != null : !CLASSIFIER_EDEFAULT.equals(classifier);
         case MavenModelPackage.MAVEN_DEPENDENCY__TYPE :
            return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
         case MavenModelPackage.MAVEN_DEPENDENCY__EXTENSIONS :
            return extensions != null && !extensions.isEmpty();
         case MavenModelPackage.MAVEN_DEPENDENCY__ANNOTATIONS :
            return annotations != null && !annotations.isEmpty();
         case MavenModelPackage.MAVEN_DEPENDENCY__VERSION_RANGE :
            return VERSION_RANGE_EDEFAULT == null ? versionRange != null : !VERSION_RANGE_EDEFAULT.equals(versionRange);
         case MavenModelPackage.MAVEN_DEPENDENCY__SCOPE :
            return SCOPE_EDEFAULT == null ? scope != null : !SCOPE_EDEFAULT.equals(scope);
         case MavenModelPackage.MAVEN_DEPENDENCY__OPTIONAL :
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
            case MavenModelPackage.MAVEN_DEPENDENCY__CLASSIFIER :
               return MavenModelPackage.CLASSIFIED__CLASSIFIER;
            case MavenModelPackage.MAVEN_DEPENDENCY__TYPE :
               return MavenModelPackage.CLASSIFIED__TYPE;
            default :
               return -1;
         }
      }
      if (baseClass == Extendable.class)
      {
         switch (derivedFeatureID)
         {
            case MavenModelPackage.MAVEN_DEPENDENCY__EXTENSIONS :
               return CommonModelPackage.EXTENDABLE__EXTENSIONS;
            default :
               return -1;
         }
      }
      if (baseClass == Annotatable.class)
      {
         switch (derivedFeatureID)
         {
            case MavenModelPackage.MAVEN_DEPENDENCY__ANNOTATIONS :
               return CommonModelPackage.ANNOTATABLE__ANNOTATIONS;
            default :
               return -1;
         }
      }
      if (baseClass == XAnnotatable.class)
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
      if (baseClass == Classified.class)
      {
         switch (baseFeatureID)
         {
            case MavenModelPackage.CLASSIFIED__CLASSIFIER :
               return MavenModelPackage.MAVEN_DEPENDENCY__CLASSIFIER;
            case MavenModelPackage.CLASSIFIED__TYPE :
               return MavenModelPackage.MAVEN_DEPENDENCY__TYPE;
            default :
               return -1;
         }
      }
      if (baseClass == Extendable.class)
      {
         switch (baseFeatureID)
         {
            case CommonModelPackage.EXTENDABLE__EXTENSIONS :
               return MavenModelPackage.MAVEN_DEPENDENCY__EXTENSIONS;
            default :
               return -1;
         }
      }
      if (baseClass == Annotatable.class)
      {
         switch (baseFeatureID)
         {
            case CommonModelPackage.ANNOTATABLE__ANNOTATIONS :
               return MavenModelPackage.MAVEN_DEPENDENCY__ANNOTATIONS;
            default :
               return -1;
         }
      }
      if (baseClass == XAnnotatable.class)
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
      result.append(" (classifier: ");
      result.append(classifier);
      result.append(", type: ");
      result.append(type);
      result.append(", versionRange: ");
      result.append(versionRange);
      result.append(", scope: ");
      result.append(scope);
      result.append(", optional: ");
      result.append(optional);
      result.append(')');
      return result.toString();
   }

} // MavenDependencyImpl

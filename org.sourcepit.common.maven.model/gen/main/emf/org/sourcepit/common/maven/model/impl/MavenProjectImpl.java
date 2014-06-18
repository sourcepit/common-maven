/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.model.impl;

import java.io.File;
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
import org.sourcepit.common.maven.model.MavenModelPackage;
import org.sourcepit.common.maven.model.MavenProject;
import org.sourcepit.common.modeling.Annotatable;
import org.sourcepit.common.modeling.Annotation;
import org.sourcepit.common.modeling.CommonModelingPackage;
import org.sourcepit.common.modeling.Extendable;
import org.sourcepit.common.modeling.XAnnotatable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maven Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.common.maven.model.impl.MavenProjectImpl#getExtensions <em>Extensions</em>}</li>
 * <li>{@link org.sourcepit.common.maven.model.impl.MavenProjectImpl#getAnnotations <em>Annotations</em>}</li>
 * <li>{@link org.sourcepit.common.maven.model.impl.MavenProjectImpl#getPackaging <em>Packaging</em>}</li>
 * <li>{@link org.sourcepit.common.maven.model.impl.MavenProjectImpl#getPomFile <em>Pom File</em>}</li>
 * <li>{@link org.sourcepit.common.maven.model.impl.MavenProjectImpl#getOutputDirectory <em>Output Directory</em>}</li>
 * <li>{@link org.sourcepit.common.maven.model.impl.MavenProjectImpl#getTestOutputDirectory <em>Test Output Directory
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MavenProjectImpl extends MavenProjectCoordinatesImpl implements MavenProject
{
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
    * The default value of the '{@link #getOutputDirectory() <em>Output Directory</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getOutputDirectory()
    * @generated
    * @ordered
    */
   protected static final File OUTPUT_DIRECTORY_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getOutputDirectory() <em>Output Directory</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getOutputDirectory()
    * @generated
    * @ordered
    */
   protected File outputDirectory = OUTPUT_DIRECTORY_EDEFAULT;

   /**
    * The default value of the '{@link #getTestOutputDirectory() <em>Test Output Directory</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getTestOutputDirectory()
    * @generated
    * @ordered
    */
   protected static final File TEST_OUTPUT_DIRECTORY_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getTestOutputDirectory() <em>Test Output Directory</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getTestOutputDirectory()
    * @generated
    * @ordered
    */
   protected File testOutputDirectory = TEST_OUTPUT_DIRECTORY_EDEFAULT;

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
   public EList<EObject> getExtensions()
   {
      if (extensions == null)
      {
         extensions = new EObjectContainmentEList<EObject>(EObject.class, this,
            MavenModelPackage.MAVEN_PROJECT__EXTENSIONS);
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
            MavenModelPackage.MAVEN_PROJECT__ANNOTATIONS, CommonModelingPackage.ANNOTATION__TARGET);
      }
      return annotations;
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
   public File getOutputDirectory()
   {
      return outputDirectory;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setOutputDirectory(File newOutputDirectory)
   {
      File oldOutputDirectory = outputDirectory;
      outputDirectory = newOutputDirectory;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, MavenModelPackage.MAVEN_PROJECT__OUTPUT_DIRECTORY,
            oldOutputDirectory, outputDirectory));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public File getTestOutputDirectory()
   {
      return testOutputDirectory;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setTestOutputDirectory(File newTestOutputDirectory)
   {
      File oldTestOutputDirectory = testOutputDirectory;
      testOutputDirectory = newTestOutputDirectory;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, MavenModelPackage.MAVEN_PROJECT__TEST_OUTPUT_DIRECTORY,
            oldTestOutputDirectory, testOutputDirectory));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public File getProjectDirectory()
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
   public String setAnnotationData(String source, String key, String value)
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
         case MavenModelPackage.MAVEN_PROJECT__ANNOTATIONS :
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
         case MavenModelPackage.MAVEN_PROJECT__EXTENSIONS :
            return ((InternalEList<?>) getExtensions()).basicRemove(otherEnd, msgs);
         case MavenModelPackage.MAVEN_PROJECT__ANNOTATIONS :
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
         case MavenModelPackage.MAVEN_PROJECT__EXTENSIONS :
            return getExtensions();
         case MavenModelPackage.MAVEN_PROJECT__ANNOTATIONS :
            return getAnnotations();
         case MavenModelPackage.MAVEN_PROJECT__PACKAGING :
            return getPackaging();
         case MavenModelPackage.MAVEN_PROJECT__POM_FILE :
            return getPomFile();
         case MavenModelPackage.MAVEN_PROJECT__OUTPUT_DIRECTORY :
            return getOutputDirectory();
         case MavenModelPackage.MAVEN_PROJECT__TEST_OUTPUT_DIRECTORY :
            return getTestOutputDirectory();
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
         case MavenModelPackage.MAVEN_PROJECT__EXTENSIONS :
            getExtensions().clear();
            getExtensions().addAll((Collection<? extends EObject>) newValue);
            return;
         case MavenModelPackage.MAVEN_PROJECT__ANNOTATIONS :
            getAnnotations().clear();
            getAnnotations().addAll((Collection<? extends Annotation>) newValue);
            return;
         case MavenModelPackage.MAVEN_PROJECT__PACKAGING :
            setPackaging((String) newValue);
            return;
         case MavenModelPackage.MAVEN_PROJECT__POM_FILE :
            setPomFile((File) newValue);
            return;
         case MavenModelPackage.MAVEN_PROJECT__OUTPUT_DIRECTORY :
            setOutputDirectory((File) newValue);
            return;
         case MavenModelPackage.MAVEN_PROJECT__TEST_OUTPUT_DIRECTORY :
            setTestOutputDirectory((File) newValue);
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
         case MavenModelPackage.MAVEN_PROJECT__EXTENSIONS :
            getExtensions().clear();
            return;
         case MavenModelPackage.MAVEN_PROJECT__ANNOTATIONS :
            getAnnotations().clear();
            return;
         case MavenModelPackage.MAVEN_PROJECT__PACKAGING :
            setPackaging(PACKAGING_EDEFAULT);
            return;
         case MavenModelPackage.MAVEN_PROJECT__POM_FILE :
            setPomFile(POM_FILE_EDEFAULT);
            return;
         case MavenModelPackage.MAVEN_PROJECT__OUTPUT_DIRECTORY :
            setOutputDirectory(OUTPUT_DIRECTORY_EDEFAULT);
            return;
         case MavenModelPackage.MAVEN_PROJECT__TEST_OUTPUT_DIRECTORY :
            setTestOutputDirectory(TEST_OUTPUT_DIRECTORY_EDEFAULT);
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
         case MavenModelPackage.MAVEN_PROJECT__EXTENSIONS :
            return extensions != null && !extensions.isEmpty();
         case MavenModelPackage.MAVEN_PROJECT__ANNOTATIONS :
            return annotations != null && !annotations.isEmpty();
         case MavenModelPackage.MAVEN_PROJECT__PACKAGING :
            return PACKAGING_EDEFAULT == null ? packaging != null : !PACKAGING_EDEFAULT.equals(packaging);
         case MavenModelPackage.MAVEN_PROJECT__POM_FILE :
            return POM_FILE_EDEFAULT == null ? pomFile != null : !POM_FILE_EDEFAULT.equals(pomFile);
         case MavenModelPackage.MAVEN_PROJECT__OUTPUT_DIRECTORY :
            return OUTPUT_DIRECTORY_EDEFAULT == null ? outputDirectory != null : !OUTPUT_DIRECTORY_EDEFAULT
               .equals(outputDirectory);
         case MavenModelPackage.MAVEN_PROJECT__TEST_OUTPUT_DIRECTORY :
            return TEST_OUTPUT_DIRECTORY_EDEFAULT == null
               ? testOutputDirectory != null
               : !TEST_OUTPUT_DIRECTORY_EDEFAULT.equals(testOutputDirectory);
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
      if (baseClass == Extendable.class)
      {
         switch (derivedFeatureID)
         {
            case MavenModelPackage.MAVEN_PROJECT__EXTENSIONS :
               return CommonModelingPackage.EXTENDABLE__EXTENSIONS;
            default :
               return -1;
         }
      }
      if (baseClass == Annotatable.class)
      {
         switch (derivedFeatureID)
         {
            case MavenModelPackage.MAVEN_PROJECT__ANNOTATIONS :
               return CommonModelingPackage.ANNOTATABLE__ANNOTATIONS;
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
      if (baseClass == Extendable.class)
      {
         switch (baseFeatureID)
         {
            case CommonModelingPackage.EXTENDABLE__EXTENSIONS :
               return MavenModelPackage.MAVEN_PROJECT__EXTENSIONS;
            default :
               return -1;
         }
      }
      if (baseClass == Annotatable.class)
      {
         switch (baseFeatureID)
         {
            case CommonModelingPackage.ANNOTATABLE__ANNOTATIONS :
               return MavenModelPackage.MAVEN_PROJECT__ANNOTATIONS;
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
      result.append(" (packaging: ");
      result.append(packaging);
      result.append(", pomFile: ");
      result.append(pomFile);
      result.append(", outputDirectory: ");
      result.append(outputDirectory);
      result.append(", testOutputDirectory: ");
      result.append(testOutputDirectory);
      result.append(')');
      return result.toString();
   }

} // MavenProjectImpl

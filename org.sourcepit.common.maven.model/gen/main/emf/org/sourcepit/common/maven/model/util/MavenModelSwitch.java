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

package org.sourcepit.common.maven.model.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.sourcepit.common.maven.model.DependencyDeclaration;
import org.sourcepit.common.maven.model.MavenArtifact;
import org.sourcepit.common.maven.model.MavenArtifactConflictCoordinates;
import org.sourcepit.common.maven.model.MavenArtifactCoordinates;
import org.sourcepit.common.maven.model.MavenClassified;
import org.sourcepit.common.maven.model.MavenDependency;
import org.sourcepit.common.maven.model.MavenModelPackage;
import org.sourcepit.common.maven.model.MavenProject;
import org.sourcepit.common.maven.model.MavenProjectCoordinates;
import org.sourcepit.common.modeling.Annotatable;
import org.sourcepit.common.modeling.Extendable;
import org.sourcepit.common.modeling.XAnnotatable;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each
 * class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * 
 * @see org.sourcepit.common.maven.model.MavenModelPackage
 * @generated
 */
public class MavenModelSwitch<T> extends Switch<T> {
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected static MavenModelPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public MavenModelSwitch() {
      if (modelPackage == null) {
         modelPackage = MavenModelPackage.eINSTANCE;
      }
   }

   /**
    * Checks whether this is a switch for the given package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @parameter ePackage the package in question.
    * @return whether this is a switch for the given package.
    * @generated
    */
   @Override
   protected boolean isSwitchFor(EPackage ePackage) {
      return ePackage == modelPackage;
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   @Override
   protected T doSwitch(int classifierID, EObject theEObject) {
      switch (classifierID) {
         case MavenModelPackage.MAVEN_ARTIFACT : {
            MavenArtifact mavenArtifact = (MavenArtifact) theEObject;
            T result = caseMavenArtifact(mavenArtifact);
            if (result == null)
               result = caseXAnnotatable(mavenArtifact);
            if (result == null)
               result = caseMavenArtifactCoordinates(mavenArtifact);
            if (result == null)
               result = caseExtendable(mavenArtifact);
            if (result == null)
               result = caseAnnotatable(mavenArtifact);
            if (result == null)
               result = caseMavenProjectCoordinates(mavenArtifact);
            if (result == null)
               result = caseMavenClassified(mavenArtifact);
            if (result == null)
               result = caseMavenArtifactConflictCoordinates(mavenArtifact);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case MavenModelPackage.MAVEN_DEPENDENCY : {
            MavenDependency mavenDependency = (MavenDependency) theEObject;
            T result = caseMavenDependency(mavenDependency);
            if (result == null)
               result = caseDependencyDeclaration(mavenDependency);
            if (result == null)
               result = caseXAnnotatable(mavenDependency);
            if (result == null)
               result = caseMavenArtifactConflictCoordinates(mavenDependency);
            if (result == null)
               result = caseMavenClassified(mavenDependency);
            if (result == null)
               result = caseExtendable(mavenDependency);
            if (result == null)
               result = caseAnnotatable(mavenDependency);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case MavenModelPackage.MAVEN_ARTIFACT_CONFLICT_COORDINATES : {
            MavenArtifactConflictCoordinates mavenArtifactConflictCoordinates = (MavenArtifactConflictCoordinates) theEObject;
            T result = caseMavenArtifactConflictCoordinates(mavenArtifactConflictCoordinates);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case MavenModelPackage.MAVEN_PROJECT_COORDINATES : {
            MavenProjectCoordinates mavenProjectCoordinates = (MavenProjectCoordinates) theEObject;
            T result = caseMavenProjectCoordinates(mavenProjectCoordinates);
            if (result == null)
               result = caseMavenArtifactConflictCoordinates(mavenProjectCoordinates);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case MavenModelPackage.MAVEN_CLASSIFIED : {
            MavenClassified mavenClassified = (MavenClassified) theEObject;
            T result = caseMavenClassified(mavenClassified);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case MavenModelPackage.MAVEN_PROJECT : {
            MavenProject mavenProject = (MavenProject) theEObject;
            T result = caseMavenProject(mavenProject);
            if (result == null)
               result = caseMavenProjectCoordinates(mavenProject);
            if (result == null)
               result = caseXAnnotatable(mavenProject);
            if (result == null)
               result = caseMavenArtifactConflictCoordinates(mavenProject);
            if (result == null)
               result = caseExtendable(mavenProject);
            if (result == null)
               result = caseAnnotatable(mavenProject);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case MavenModelPackage.DEPENDENCY_DECLARATION : {
            DependencyDeclaration dependencyDeclaration = (DependencyDeclaration) theEObject;
            T result = caseDependencyDeclaration(dependencyDeclaration);
            if (result == null)
               result = caseMavenArtifactConflictCoordinates(dependencyDeclaration);
            if (result == null)
               result = caseMavenClassified(dependencyDeclaration);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case MavenModelPackage.MAVEN_ARTIFACT_COORDINATES : {
            MavenArtifactCoordinates mavenArtifactCoordinates = (MavenArtifactCoordinates) theEObject;
            T result = caseMavenArtifactCoordinates(mavenArtifactCoordinates);
            if (result == null)
               result = caseMavenProjectCoordinates(mavenArtifactCoordinates);
            if (result == null)
               result = caseMavenClassified(mavenArtifactCoordinates);
            if (result == null)
               result = caseMavenArtifactConflictCoordinates(mavenArtifactCoordinates);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         default :
            return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Maven Artifact</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Maven Artifact</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseMavenArtifact(MavenArtifact object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Maven Dependency</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Maven Dependency</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseMavenDependency(MavenDependency object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Maven Artifact Conflict Coordinates</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Maven Artifact Conflict Coordinates</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseMavenArtifactConflictCoordinates(MavenArtifactConflictCoordinates object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Maven Project Coordinates</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Maven Project Coordinates</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseMavenProjectCoordinates(MavenProjectCoordinates object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Maven Classified</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Maven Classified</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseMavenClassified(MavenClassified object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Maven Project</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Maven Project</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseMavenProject(MavenProject object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Dependency Declaration</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Dependency Declaration</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseDependencyDeclaration(DependencyDeclaration object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Maven Artifact Coordinates</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Maven Artifact Coordinates</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseMavenArtifactCoordinates(MavenArtifactCoordinates object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Extendable</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Extendable</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseExtendable(Extendable object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Annotatable</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Annotatable</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseAnnotatable(Annotatable object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>XAnnotatable</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>XAnnotatable</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseXAnnotatable(XAnnotatable object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch, but this is the last case anyway.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject)
    * @generated
    */
   @Override
   public T defaultCase(EObject object) {
      return null;
   }

} // MavenModelSwitch

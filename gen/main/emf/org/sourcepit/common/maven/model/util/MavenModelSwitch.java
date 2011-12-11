/**
 * <copyright>
 * </copyright>
 * 
 * $Id$
 */

package org.sourcepit.common.maven.model.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.sourcepit.common.maven.model.Classified;
import org.sourcepit.common.maven.model.Identifiable;
import org.sourcepit.common.maven.model.MavenArtifact;
import org.sourcepit.common.maven.model.MavenDependency;
import org.sourcepit.common.maven.model.MavenModelPackage;
import org.sourcepit.common.maven.model.MavenProject;
import org.sourcepit.common.maven.model.VersionedIdentifiable;

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
public class MavenModelSwitch<T> extends Switch<T>
{
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
   public MavenModelSwitch()
   {
      if (modelPackage == null)
      {
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
   protected boolean isSwitchFor(EPackage ePackage)
   {
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
   protected T doSwitch(int classifierID, EObject theEObject)
   {
      switch (classifierID)
      {
         case MavenModelPackage.MAVEN_ARTIFACT :
         {
            MavenArtifact mavenArtifact = (MavenArtifact) theEObject;
            T result = caseMavenArtifact(mavenArtifact);
            if (result == null)
               result = caseVersionedIdentifiable(mavenArtifact);
            if (result == null)
               result = caseClassified(mavenArtifact);
            if (result == null)
               result = caseIdentifiable(mavenArtifact);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case MavenModelPackage.MAVEN_DEPENDENCY :
         {
            MavenDependency mavenDependency = (MavenDependency) theEObject;
            T result = caseMavenDependency(mavenDependency);
            if (result == null)
               result = caseIdentifiable(mavenDependency);
            if (result == null)
               result = caseClassified(mavenDependency);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case MavenModelPackage.IDENTIFIABLE :
         {
            Identifiable identifiable = (Identifiable) theEObject;
            T result = caseIdentifiable(identifiable);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case MavenModelPackage.VERSIONED_IDENTIFIABLE :
         {
            VersionedIdentifiable versionedIdentifiable = (VersionedIdentifiable) theEObject;
            T result = caseVersionedIdentifiable(versionedIdentifiable);
            if (result == null)
               result = caseIdentifiable(versionedIdentifiable);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case MavenModelPackage.CLASSIFIED :
         {
            Classified classified = (Classified) theEObject;
            T result = caseClassified(classified);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case MavenModelPackage.MAVEN_PROJECT :
         {
            MavenProject mavenProject = (MavenProject) theEObject;
            T result = caseMavenProject(mavenProject);
            if (result == null)
               result = caseVersionedIdentifiable(mavenProject);
            if (result == null)
               result = caseIdentifiable(mavenProject);
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
   public T caseMavenArtifact(MavenArtifact object)
   {
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
   public T caseMavenDependency(MavenDependency object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseIdentifiable(Identifiable object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Versioned Identifiable</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Versioned Identifiable</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseVersionedIdentifiable(VersionedIdentifiable object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Classified</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Classified</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseClassified(Classified object)
   {
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
   public T caseMavenProject(MavenProject object)
   {
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
   public T defaultCase(EObject object)
   {
      return null;
   }

} // MavenModelSwitch

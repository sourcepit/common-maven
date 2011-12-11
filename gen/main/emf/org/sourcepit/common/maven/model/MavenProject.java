/**
 * <copyright>
 * </copyright>
 * 
 * $Id$
 */

package org.sourcepit.common.maven.model;

import java.io.File;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maven Project</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.common.maven.model.MavenProject#getPackaging <em>Packaging</em>}</li>
 * <li>{@link org.sourcepit.common.maven.model.MavenProject#getPomFile <em>Pom File</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.sourcepit.common.maven.model.MavenModelPackage#getMavenProject()
 * @model
 * @generated
 */
public interface MavenProject extends VersionedIdentifiable
{
   /**
    * Returns the value of the '<em><b>Packaging</b></em>' attribute.
    * The default value is <code>"jar"</code>.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Packaging</em>' attribute isn't clear, there really should be more of a description
    * here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Packaging</em>' attribute.
    * @see #setPackaging(String)
    * @see org.sourcepit.common.maven.model.MavenModelPackage#getMavenProject_Packaging()
    * @model default="jar"
    * @generated
    */
   String getPackaging();

   /**
    * Sets the value of the '{@link org.sourcepit.common.maven.model.MavenProject#getPackaging <em>Packaging</em>}'
    * attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Packaging</em>' attribute.
    * @see #getPackaging()
    * @generated
    */
   void setPackaging(String value);

   /**
    * Returns the value of the '<em><b>Pom File</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Pom File</em>' attribute isn't clear, there really should be more of a description
    * here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Pom File</em>' attribute.
    * @see #setPomFile(File)
    * @see org.sourcepit.common.maven.model.MavenModelPackage#getMavenProject_PomFile()
    * @model dataType="org.sourcepit.modeling.common.EJavaFile"
    * @generated
    */
   File getPomFile();

   /**
    * Sets the value of the '{@link org.sourcepit.common.maven.model.MavenProject#getPomFile <em>Pom File</em>}'
    * attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Pom File</em>' attribute.
    * @see #getPomFile()
    * @generated
    */
   void setPomFile(File value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model kind="operation" dataType="org.sourcepit.modeling.common.EJavaFile"
    * @generated
    */
   File getProjectDir();

} // MavenProject

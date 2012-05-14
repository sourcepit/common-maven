/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.environment;

import java.net.URL;

import org.eclipse.emf.common.util.EList;
import org.sourcepit.common.maven.model.MavenArtifact;
import org.sourcepit.modeling.common.XAnnotatable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Snapshot</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.common.maven.environment.EnvironmentSnapshot#getClasspath <em>Classpath</em>}</li>
 * <li>{@link org.sourcepit.common.maven.environment.EnvironmentSnapshot#getArtifacts <em>Artifacts</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.sourcepit.common.maven.environment.EnvironmentPackage#getEnvironmentSnapshot()
 * @model
 * @generated
 */
public interface EnvironmentSnapshot extends XAnnotatable
{
   /**
    * Returns the value of the '<em><b>Classpath</b></em>' attribute list.
    * The list contents are of type {@link java.net.URL}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Classpath</em>' attribute list isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Classpath</em>' attribute list.
    * @see org.sourcepit.common.maven.environment.EnvironmentPackage#getEnvironmentSnapshot_Classpath()
    * @model dataType="org.sourcepit.modeling.common.EURL"
    * @generated
    */
   EList<URL> getClasspath();

   /**
    * Returns the value of the '<em><b>Artifacts</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.common.maven.model.MavenArtifact}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Artifacts</em>' containment reference list isn't clear, there really should be more of
    * a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Artifacts</em>' containment reference list.
    * @see org.sourcepit.common.maven.environment.EnvironmentPackage#getEnvironmentSnapshot_Artifacts()
    * @model containment="true"
    * @generated
    */
   EList<MavenArtifact> getArtifacts();

} // EnvironmentSnapshot

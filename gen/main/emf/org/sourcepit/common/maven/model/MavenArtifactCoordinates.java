/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maven Artifact Coordinates</b></em>'.
 * <!-- end-user-doc -->
 * 
 * 
 * @see org.sourcepit.common.maven.model.MavenModelPackage#getMavenArtifactCoordinates()
 * @model abstract="true"
 * @generated
 */
public interface MavenArtifactCoordinates extends MavenProjectCoordinates, MavenClassified
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model kind="operation" dataType="org.sourcepit.common.maven.model.ArtifactKey" required="true"
    * @generated
    */
   ArtifactKey getArtifactKey();

} // MavenArtifactCoordinates

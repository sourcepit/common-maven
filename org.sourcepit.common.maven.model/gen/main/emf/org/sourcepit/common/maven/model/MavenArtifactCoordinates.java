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

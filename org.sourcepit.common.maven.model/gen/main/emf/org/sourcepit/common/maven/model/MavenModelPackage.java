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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.sourcepit.common.modeling.CommonModelingPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.sourcepit.common.maven.model.MavenModelFactory
 * @model kind="package"
 * @generated
 */
public interface MavenModelPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNAME = "maven";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_URI = "http://www.sourcepit.org/common/maven/0.1";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_PREFIX = "common-maven";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   MavenModelPackage eINSTANCE = org.sourcepit.common.maven.model.impl.MavenModelPackageImpl.init();

   /**
    * The meta object id for the '{@link org.sourcepit.common.maven.model.impl.MavenArtifactImpl
    * <em>Maven Artifact</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.maven.model.impl.MavenArtifactImpl
    * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getMavenArtifact()
    * @generated
    */
   int MAVEN_ARTIFACT = 0;

   /**
    * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_ARTIFACT__EXTENSIONS = CommonModelingPackage.XANNOTATABLE__EXTENSIONS;

   /**
    * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_ARTIFACT__ANNOTATIONS = CommonModelingPackage.XANNOTATABLE__ANNOTATIONS;

   /**
    * The feature id for the '<em><b>Group Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_ARTIFACT__GROUP_ID = CommonModelingPackage.XANNOTATABLE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_ARTIFACT__ARTIFACT_ID = CommonModelingPackage.XANNOTATABLE_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Version</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_ARTIFACT__VERSION = CommonModelingPackage.XANNOTATABLE_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Classifier</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_ARTIFACT__CLASSIFIER = CommonModelingPackage.XANNOTATABLE_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>Type</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_ARTIFACT__TYPE = CommonModelingPackage.XANNOTATABLE_FEATURE_COUNT + 4;

   /**
    * The feature id for the '<em><b>File</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_ARTIFACT__FILE = CommonModelingPackage.XANNOTATABLE_FEATURE_COUNT + 5;

   /**
    * The number of structural features of the '<em>Maven Artifact</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_ARTIFACT_FEATURE_COUNT = CommonModelingPackage.XANNOTATABLE_FEATURE_COUNT + 6;

   /**
    * The meta object id for the '{@link org.sourcepit.common.maven.model.impl.MavenArtifactConflictCoordinatesImpl
    * <em>Maven Artifact Conflict Coordinates</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.maven.model.impl.MavenArtifactConflictCoordinatesImpl
    * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getMavenArtifactConflictCoordinates()
    * @generated
    */
   int MAVEN_ARTIFACT_CONFLICT_COORDINATES = 2;

   /**
    * The feature id for the '<em><b>Group Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_ARTIFACT_CONFLICT_COORDINATES__GROUP_ID = 0;

   /**
    * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_ARTIFACT_CONFLICT_COORDINATES__ARTIFACT_ID = 1;

   /**
    * The number of structural features of the '<em>Maven Artifact Conflict Coordinates</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_ARTIFACT_CONFLICT_COORDINATES_FEATURE_COUNT = 2;

   /**
    * The meta object id for the '{@link org.sourcepit.common.maven.model.impl.DependencyDeclarationImpl
    * <em>Dependency Declaration</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.maven.model.impl.DependencyDeclarationImpl
    * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getDependencyDeclaration()
    * @generated
    */
   int DEPENDENCY_DECLARATION = 6;

   /**
    * The feature id for the '<em><b>Group Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int DEPENDENCY_DECLARATION__GROUP_ID = MAVEN_ARTIFACT_CONFLICT_COORDINATES__GROUP_ID;

   /**
    * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int DEPENDENCY_DECLARATION__ARTIFACT_ID = MAVEN_ARTIFACT_CONFLICT_COORDINATES__ARTIFACT_ID;

   /**
    * The feature id for the '<em><b>Classifier</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int DEPENDENCY_DECLARATION__CLASSIFIER = MAVEN_ARTIFACT_CONFLICT_COORDINATES_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Type</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int DEPENDENCY_DECLARATION__TYPE = MAVEN_ARTIFACT_CONFLICT_COORDINATES_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Version Constraint</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int DEPENDENCY_DECLARATION__VERSION_CONSTRAINT = MAVEN_ARTIFACT_CONFLICT_COORDINATES_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Scope</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int DEPENDENCY_DECLARATION__SCOPE = MAVEN_ARTIFACT_CONFLICT_COORDINATES_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>Optional</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int DEPENDENCY_DECLARATION__OPTIONAL = MAVEN_ARTIFACT_CONFLICT_COORDINATES_FEATURE_COUNT + 4;

   /**
    * The number of structural features of the '<em>Dependency Declaration</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int DEPENDENCY_DECLARATION_FEATURE_COUNT = MAVEN_ARTIFACT_CONFLICT_COORDINATES_FEATURE_COUNT + 5;

   /**
    * The meta object id for the '{@link org.sourcepit.common.maven.model.impl.MavenDependencyImpl
    * <em>Maven Dependency</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.maven.model.impl.MavenDependencyImpl
    * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getMavenDependency()
    * @generated
    */
   int MAVEN_DEPENDENCY = 1;

   /**
    * The feature id for the '<em><b>Group Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_DEPENDENCY__GROUP_ID = DEPENDENCY_DECLARATION__GROUP_ID;

   /**
    * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_DEPENDENCY__ARTIFACT_ID = DEPENDENCY_DECLARATION__ARTIFACT_ID;

   /**
    * The feature id for the '<em><b>Classifier</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_DEPENDENCY__CLASSIFIER = DEPENDENCY_DECLARATION__CLASSIFIER;

   /**
    * The feature id for the '<em><b>Type</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_DEPENDENCY__TYPE = DEPENDENCY_DECLARATION__TYPE;

   /**
    * The feature id for the '<em><b>Version Constraint</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_DEPENDENCY__VERSION_CONSTRAINT = DEPENDENCY_DECLARATION__VERSION_CONSTRAINT;

   /**
    * The feature id for the '<em><b>Scope</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_DEPENDENCY__SCOPE = DEPENDENCY_DECLARATION__SCOPE;

   /**
    * The feature id for the '<em><b>Optional</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_DEPENDENCY__OPTIONAL = DEPENDENCY_DECLARATION__OPTIONAL;

   /**
    * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_DEPENDENCY__EXTENSIONS = DEPENDENCY_DECLARATION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_DEPENDENCY__ANNOTATIONS = DEPENDENCY_DECLARATION_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Maven Dependency</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_DECLARATION_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link org.sourcepit.common.maven.model.impl.MavenProjectCoordinatesImpl
    * <em>Maven Project Coordinates</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.maven.model.impl.MavenProjectCoordinatesImpl
    * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getMavenProjectCoordinates()
    * @generated
    */
   int MAVEN_PROJECT_COORDINATES = 3;

   /**
    * The feature id for the '<em><b>Group Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_PROJECT_COORDINATES__GROUP_ID = MAVEN_ARTIFACT_CONFLICT_COORDINATES__GROUP_ID;

   /**
    * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_PROJECT_COORDINATES__ARTIFACT_ID = MAVEN_ARTIFACT_CONFLICT_COORDINATES__ARTIFACT_ID;

   /**
    * The feature id for the '<em><b>Version</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_PROJECT_COORDINATES__VERSION = MAVEN_ARTIFACT_CONFLICT_COORDINATES_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Maven Project Coordinates</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_PROJECT_COORDINATES_FEATURE_COUNT = MAVEN_ARTIFACT_CONFLICT_COORDINATES_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.common.maven.model.impl.MavenClassifiedImpl
    * <em>Maven Classified</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.maven.model.impl.MavenClassifiedImpl
    * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getMavenClassified()
    * @generated
    */
   int MAVEN_CLASSIFIED = 4;

   /**
    * The feature id for the '<em><b>Classifier</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_CLASSIFIED__CLASSIFIER = 0;

   /**
    * The feature id for the '<em><b>Type</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_CLASSIFIED__TYPE = 1;

   /**
    * The number of structural features of the '<em>Maven Classified</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_CLASSIFIED_FEATURE_COUNT = 2;

   /**
    * The meta object id for the '{@link org.sourcepit.common.maven.model.impl.MavenProjectImpl <em>Maven Project</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.maven.model.impl.MavenProjectImpl
    * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getMavenProject()
    * @generated
    */
   int MAVEN_PROJECT = 5;

   /**
    * The feature id for the '<em><b>Group Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_PROJECT__GROUP_ID = MAVEN_PROJECT_COORDINATES__GROUP_ID;

   /**
    * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_PROJECT__ARTIFACT_ID = MAVEN_PROJECT_COORDINATES__ARTIFACT_ID;

   /**
    * The feature id for the '<em><b>Version</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_PROJECT__VERSION = MAVEN_PROJECT_COORDINATES__VERSION;

   /**
    * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_PROJECT__EXTENSIONS = MAVEN_PROJECT_COORDINATES_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_PROJECT__ANNOTATIONS = MAVEN_PROJECT_COORDINATES_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Packaging</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_PROJECT__PACKAGING = MAVEN_PROJECT_COORDINATES_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Pom File</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_PROJECT__POM_FILE = MAVEN_PROJECT_COORDINATES_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>Output Directory</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_PROJECT__OUTPUT_DIRECTORY = MAVEN_PROJECT_COORDINATES_FEATURE_COUNT + 4;

   /**
    * The feature id for the '<em><b>Test Output Directory</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_PROJECT__TEST_OUTPUT_DIRECTORY = MAVEN_PROJECT_COORDINATES_FEATURE_COUNT + 5;

   /**
    * The number of structural features of the '<em>Maven Project</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_PROJECT_FEATURE_COUNT = MAVEN_PROJECT_COORDINATES_FEATURE_COUNT + 6;

   /**
    * The meta object id for the '{@link org.sourcepit.common.maven.model.impl.MavenArtifactCoordinatesImpl
    * <em>Maven Artifact Coordinates</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.maven.model.impl.MavenArtifactCoordinatesImpl
    * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getMavenArtifactCoordinates()
    * @generated
    */
   int MAVEN_ARTIFACT_COORDINATES = 7;

   /**
    * The feature id for the '<em><b>Group Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_ARTIFACT_COORDINATES__GROUP_ID = MAVEN_PROJECT_COORDINATES__GROUP_ID;

   /**
    * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_ARTIFACT_COORDINATES__ARTIFACT_ID = MAVEN_PROJECT_COORDINATES__ARTIFACT_ID;

   /**
    * The feature id for the '<em><b>Version</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_ARTIFACT_COORDINATES__VERSION = MAVEN_PROJECT_COORDINATES__VERSION;

   /**
    * The feature id for the '<em><b>Classifier</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_ARTIFACT_COORDINATES__CLASSIFIER = MAVEN_PROJECT_COORDINATES_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Type</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_ARTIFACT_COORDINATES__TYPE = MAVEN_PROJECT_COORDINATES_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Maven Artifact Coordinates</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_ARTIFACT_COORDINATES_FEATURE_COUNT = MAVEN_PROJECT_COORDINATES_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link org.sourcepit.common.maven.model.Scope <em>Scope</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.maven.model.Scope
    * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getScope()
    * @generated
    */
   int SCOPE = 8;

   /**
    * The meta object id for the '<em>Nullable Scope</em>' data type.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.maven.model.Scope
    * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getNullableScope()
    * @generated
    */
   int NULLABLE_SCOPE = 9;

   /**
    * The meta object id for the '<em>Artifact Conflict Key</em>' data type.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.maven.model.ArtifactConflictKey
    * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getArtifactConflictKey()
    * @generated
    */
   int ARTIFACT_CONFLICT_KEY = 10;

   /**
    * The meta object id for the '<em>Project Key</em>' data type.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.maven.model.ProjectKey
    * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getProjectKey()
    * @generated
    */
   int PROJECT_KEY = 11;

   /**
    * The meta object id for the '<em>Artifact Key</em>' data type.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.maven.model.ArtifactKey
    * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getArtifactKey()
    * @generated
    */
   int ARTIFACT_KEY = 12;


   /**
    * Returns the meta object for class '{@link org.sourcepit.common.maven.model.MavenArtifact <em>Maven Artifact</em>}
    * '.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Maven Artifact</em>'.
    * @see org.sourcepit.common.maven.model.MavenArtifact
    * @generated
    */
   EClass getMavenArtifact();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.common.maven.model.MavenArtifact#getFile
    * <em>File</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>File</em>'.
    * @see org.sourcepit.common.maven.model.MavenArtifact#getFile()
    * @see #getMavenArtifact()
    * @generated
    */
   EAttribute getMavenArtifact_File();

   /**
    * Returns the meta object for class '{@link org.sourcepit.common.maven.model.MavenDependency
    * <em>Maven Dependency</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Maven Dependency</em>'.
    * @see org.sourcepit.common.maven.model.MavenDependency
    * @generated
    */
   EClass getMavenDependency();

   /**
    * Returns the meta object for class '{@link org.sourcepit.common.maven.model.MavenArtifactConflictCoordinates
    * <em>Maven Artifact Conflict Coordinates</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Maven Artifact Conflict Coordinates</em>'.
    * @see org.sourcepit.common.maven.model.MavenArtifactConflictCoordinates
    * @generated
    */
   EClass getMavenArtifactConflictCoordinates();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.common.maven.model.MavenArtifactConflictCoordinates#getGroupId <em>Group Id</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Group Id</em>'.
    * @see org.sourcepit.common.maven.model.MavenArtifactConflictCoordinates#getGroupId()
    * @see #getMavenArtifactConflictCoordinates()
    * @generated
    */
   EAttribute getMavenArtifactConflictCoordinates_GroupId();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.common.maven.model.MavenArtifactConflictCoordinates#getArtifactId <em>Artifact Id</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Artifact Id</em>'.
    * @see org.sourcepit.common.maven.model.MavenArtifactConflictCoordinates#getArtifactId()
    * @see #getMavenArtifactConflictCoordinates()
    * @generated
    */
   EAttribute getMavenArtifactConflictCoordinates_ArtifactId();

   /**
    * Returns the meta object for class '{@link org.sourcepit.common.maven.model.MavenProjectCoordinates
    * <em>Maven Project Coordinates</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Maven Project Coordinates</em>'.
    * @see org.sourcepit.common.maven.model.MavenProjectCoordinates
    * @generated
    */
   EClass getMavenProjectCoordinates();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.common.maven.model.MavenProjectCoordinates#getVersion <em>Version</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Version</em>'.
    * @see org.sourcepit.common.maven.model.MavenProjectCoordinates#getVersion()
    * @see #getMavenProjectCoordinates()
    * @generated
    */
   EAttribute getMavenProjectCoordinates_Version();

   /**
    * Returns the meta object for class '{@link org.sourcepit.common.maven.model.MavenClassified
    * <em>Maven Classified</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Maven Classified</em>'.
    * @see org.sourcepit.common.maven.model.MavenClassified
    * @generated
    */
   EClass getMavenClassified();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.common.maven.model.MavenClassified#getClassifier
    * <em>Classifier</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Classifier</em>'.
    * @see org.sourcepit.common.maven.model.MavenClassified#getClassifier()
    * @see #getMavenClassified()
    * @generated
    */
   EAttribute getMavenClassified_Classifier();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.common.maven.model.MavenClassified#getType
    * <em>Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Type</em>'.
    * @see org.sourcepit.common.maven.model.MavenClassified#getType()
    * @see #getMavenClassified()
    * @generated
    */
   EAttribute getMavenClassified_Type();

   /**
    * Returns the meta object for class '{@link org.sourcepit.common.maven.model.MavenProject <em>Maven Project</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Maven Project</em>'.
    * @see org.sourcepit.common.maven.model.MavenProject
    * @generated
    */
   EClass getMavenProject();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.common.maven.model.MavenProject#getPackaging
    * <em>Packaging</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Packaging</em>'.
    * @see org.sourcepit.common.maven.model.MavenProject#getPackaging()
    * @see #getMavenProject()
    * @generated
    */
   EAttribute getMavenProject_Packaging();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.common.maven.model.MavenProject#getPomFile
    * <em>Pom File</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Pom File</em>'.
    * @see org.sourcepit.common.maven.model.MavenProject#getPomFile()
    * @see #getMavenProject()
    * @generated
    */
   EAttribute getMavenProject_PomFile();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.common.maven.model.MavenProject#getOutputDirectory <em>Output Directory</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Output Directory</em>'.
    * @see org.sourcepit.common.maven.model.MavenProject#getOutputDirectory()
    * @see #getMavenProject()
    * @generated
    */
   EAttribute getMavenProject_OutputDirectory();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.common.maven.model.MavenProject#getTestOutputDirectory <em>Test Output Directory</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Test Output Directory</em>'.
    * @see org.sourcepit.common.maven.model.MavenProject#getTestOutputDirectory()
    * @see #getMavenProject()
    * @generated
    */
   EAttribute getMavenProject_TestOutputDirectory();

   /**
    * Returns the meta object for class '{@link org.sourcepit.common.maven.model.DependencyDeclaration
    * <em>Dependency Declaration</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Dependency Declaration</em>'.
    * @see org.sourcepit.common.maven.model.DependencyDeclaration
    * @generated
    */
   EClass getDependencyDeclaration();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.common.maven.model.DependencyDeclaration#getVersionConstraint <em>Version Constraint</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Version Constraint</em>'.
    * @see org.sourcepit.common.maven.model.DependencyDeclaration#getVersionConstraint()
    * @see #getDependencyDeclaration()
    * @generated
    */
   EAttribute getDependencyDeclaration_VersionConstraint();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.common.maven.model.DependencyDeclaration#getScope
    * <em>Scope</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Scope</em>'.
    * @see org.sourcepit.common.maven.model.DependencyDeclaration#getScope()
    * @see #getDependencyDeclaration()
    * @generated
    */
   EAttribute getDependencyDeclaration_Scope();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.common.maven.model.DependencyDeclaration#isOptional <em>Optional</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Optional</em>'.
    * @see org.sourcepit.common.maven.model.DependencyDeclaration#isOptional()
    * @see #getDependencyDeclaration()
    * @generated
    */
   EAttribute getDependencyDeclaration_Optional();

   /**
    * Returns the meta object for class '{@link org.sourcepit.common.maven.model.MavenArtifactCoordinates
    * <em>Maven Artifact Coordinates</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Maven Artifact Coordinates</em>'.
    * @see org.sourcepit.common.maven.model.MavenArtifactCoordinates
    * @generated
    */
   EClass getMavenArtifactCoordinates();

   /**
    * Returns the meta object for enum '{@link org.sourcepit.common.maven.model.Scope <em>Scope</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for enum '<em>Scope</em>'.
    * @see org.sourcepit.common.maven.model.Scope
    * @generated
    */
   EEnum getScope();

   /**
    * Returns the meta object for data type '{@link org.sourcepit.common.maven.model.Scope <em>Nullable Scope</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for data type '<em>Nullable Scope</em>'.
    * @see org.sourcepit.common.maven.model.Scope
    * @model instanceClass="org.sourcepit.common.maven.model.Scope"
    * @generated
    */
   EDataType getNullableScope();

   /**
    * Returns the meta object for data type '{@link org.sourcepit.common.maven.model.ArtifactConflictKey
    * <em>Artifact Conflict Key</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for data type '<em>Artifact Conflict Key</em>'.
    * @see org.sourcepit.common.maven.model.ArtifactConflictKey
    * @model instanceClass="org.sourcepit.common.maven.model.ArtifactConflictKey"
    * @generated
    */
   EDataType getArtifactConflictKey();

   /**
    * Returns the meta object for data type '{@link org.sourcepit.common.maven.model.ProjectKey <em>Project Key</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for data type '<em>Project Key</em>'.
    * @see org.sourcepit.common.maven.model.ProjectKey
    * @model instanceClass="org.sourcepit.common.maven.model.ProjectKey"
    * @generated
    */
   EDataType getProjectKey();

   /**
    * Returns the meta object for data type '{@link org.sourcepit.common.maven.model.ArtifactKey <em>Artifact Key</em>}
    * '.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for data type '<em>Artifact Key</em>'.
    * @see org.sourcepit.common.maven.model.ArtifactKey
    * @model instanceClass="org.sourcepit.common.maven.model.ArtifactKey"
    * @generated
    */
   EDataType getArtifactKey();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the factory that creates the instances of the model.
    * @generated
    */
   MavenModelFactory getMavenModelFactory();

   /**
    * <!-- begin-user-doc -->
    * Defines literals for the meta objects that represent
    * <ul>
    * <li>each class,</li>
    * <li>each feature of each class,</li>
    * <li>each enum,</li>
    * <li>and each data type</li>
    * </ul>
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   interface Literals {
      /**
       * The meta object literal for the '{@link org.sourcepit.common.maven.model.impl.MavenArtifactImpl
       * <em>Maven Artifact</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.maven.model.impl.MavenArtifactImpl
       * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getMavenArtifact()
       * @generated
       */
      EClass MAVEN_ARTIFACT = eINSTANCE.getMavenArtifact();

      /**
       * The meta object literal for the '<em><b>File</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute MAVEN_ARTIFACT__FILE = eINSTANCE.getMavenArtifact_File();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.maven.model.impl.MavenDependencyImpl
       * <em>Maven Dependency</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.maven.model.impl.MavenDependencyImpl
       * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getMavenDependency()
       * @generated
       */
      EClass MAVEN_DEPENDENCY = eINSTANCE.getMavenDependency();

      /**
       * The meta object literal for the '
       * {@link org.sourcepit.common.maven.model.impl.MavenArtifactConflictCoordinatesImpl
       * <em>Maven Artifact Conflict Coordinates</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.maven.model.impl.MavenArtifactConflictCoordinatesImpl
       * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getMavenArtifactConflictCoordinates()
       * @generated
       */
      EClass MAVEN_ARTIFACT_CONFLICT_COORDINATES = eINSTANCE.getMavenArtifactConflictCoordinates();

      /**
       * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute MAVEN_ARTIFACT_CONFLICT_COORDINATES__GROUP_ID = eINSTANCE.getMavenArtifactConflictCoordinates_GroupId();

      /**
       * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute MAVEN_ARTIFACT_CONFLICT_COORDINATES__ARTIFACT_ID = eINSTANCE.getMavenArtifactConflictCoordinates_ArtifactId();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.maven.model.impl.MavenProjectCoordinatesImpl
       * <em>Maven Project Coordinates</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.maven.model.impl.MavenProjectCoordinatesImpl
       * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getMavenProjectCoordinates()
       * @generated
       */
      EClass MAVEN_PROJECT_COORDINATES = eINSTANCE.getMavenProjectCoordinates();

      /**
       * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute MAVEN_PROJECT_COORDINATES__VERSION = eINSTANCE.getMavenProjectCoordinates_Version();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.maven.model.impl.MavenClassifiedImpl
       * <em>Maven Classified</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.maven.model.impl.MavenClassifiedImpl
       * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getMavenClassified()
       * @generated
       */
      EClass MAVEN_CLASSIFIED = eINSTANCE.getMavenClassified();

      /**
       * The meta object literal for the '<em><b>Classifier</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute MAVEN_CLASSIFIED__CLASSIFIER = eINSTANCE.getMavenClassified_Classifier();

      /**
       * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute MAVEN_CLASSIFIED__TYPE = eINSTANCE.getMavenClassified_Type();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.maven.model.impl.MavenProjectImpl
       * <em>Maven Project</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.maven.model.impl.MavenProjectImpl
       * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getMavenProject()
       * @generated
       */
      EClass MAVEN_PROJECT = eINSTANCE.getMavenProject();

      /**
       * The meta object literal for the '<em><b>Packaging</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute MAVEN_PROJECT__PACKAGING = eINSTANCE.getMavenProject_Packaging();

      /**
       * The meta object literal for the '<em><b>Pom File</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute MAVEN_PROJECT__POM_FILE = eINSTANCE.getMavenProject_PomFile();

      /**
       * The meta object literal for the '<em><b>Output Directory</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute MAVEN_PROJECT__OUTPUT_DIRECTORY = eINSTANCE.getMavenProject_OutputDirectory();

      /**
       * The meta object literal for the '<em><b>Test Output Directory</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute MAVEN_PROJECT__TEST_OUTPUT_DIRECTORY = eINSTANCE.getMavenProject_TestOutputDirectory();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.maven.model.impl.DependencyDeclarationImpl
       * <em>Dependency Declaration</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.maven.model.impl.DependencyDeclarationImpl
       * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getDependencyDeclaration()
       * @generated
       */
      EClass DEPENDENCY_DECLARATION = eINSTANCE.getDependencyDeclaration();

      /**
       * The meta object literal for the '<em><b>Version Constraint</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute DEPENDENCY_DECLARATION__VERSION_CONSTRAINT = eINSTANCE.getDependencyDeclaration_VersionConstraint();

      /**
       * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute DEPENDENCY_DECLARATION__SCOPE = eINSTANCE.getDependencyDeclaration_Scope();

      /**
       * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute DEPENDENCY_DECLARATION__OPTIONAL = eINSTANCE.getDependencyDeclaration_Optional();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.maven.model.impl.MavenArtifactCoordinatesImpl
       * <em>Maven Artifact Coordinates</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.maven.model.impl.MavenArtifactCoordinatesImpl
       * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getMavenArtifactCoordinates()
       * @generated
       */
      EClass MAVEN_ARTIFACT_COORDINATES = eINSTANCE.getMavenArtifactCoordinates();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.maven.model.Scope <em>Scope</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.maven.model.Scope
       * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getScope()
       * @generated
       */
      EEnum SCOPE = eINSTANCE.getScope();

      /**
       * The meta object literal for the '<em>Nullable Scope</em>' data type.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.maven.model.Scope
       * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getNullableScope()
       * @generated
       */
      EDataType NULLABLE_SCOPE = eINSTANCE.getNullableScope();

      /**
       * The meta object literal for the '<em>Artifact Conflict Key</em>' data type.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.maven.model.ArtifactConflictKey
       * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getArtifactConflictKey()
       * @generated
       */
      EDataType ARTIFACT_CONFLICT_KEY = eINSTANCE.getArtifactConflictKey();

      /**
       * The meta object literal for the '<em>Project Key</em>' data type.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.maven.model.ProjectKey
       * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getProjectKey()
       * @generated
       */
      EDataType PROJECT_KEY = eINSTANCE.getProjectKey();

      /**
       * The meta object literal for the '<em>Artifact Key</em>' data type.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.maven.model.ArtifactKey
       * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getArtifactKey()
       * @generated
       */
      EDataType ARTIFACT_KEY = eINSTANCE.getArtifactKey();

   }

} // MavenModelPackage

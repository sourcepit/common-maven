/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
public interface MavenModelPackage extends EPackage
{
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
    * The meta object id for the '{@link org.sourcepit.common.maven.model.impl.IdentifiableImpl <em>Identifiable</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.maven.model.impl.IdentifiableImpl
    * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getIdentifiable()
    * @generated
    */
   int IDENTIFIABLE = 2;

   /**
    * The feature id for the '<em><b>Group Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int IDENTIFIABLE__GROUP_ID = 0;

   /**
    * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int IDENTIFIABLE__ARTIFACT_ID = 1;

   /**
    * The number of structural features of the '<em>Identifiable</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int IDENTIFIABLE_FEATURE_COUNT = 2;

   /**
    * The meta object id for the '{@link org.sourcepit.common.maven.model.impl.VersionedIdentifiableImpl
    * <em>Versioned Identifiable</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.maven.model.impl.VersionedIdentifiableImpl
    * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getVersionedIdentifiable()
    * @generated
    */
   int VERSIONED_IDENTIFIABLE = 3;

   /**
    * The feature id for the '<em><b>Group Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int VERSIONED_IDENTIFIABLE__GROUP_ID = IDENTIFIABLE__GROUP_ID;

   /**
    * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int VERSIONED_IDENTIFIABLE__ARTIFACT_ID = IDENTIFIABLE__ARTIFACT_ID;

   /**
    * The feature id for the '<em><b>Version</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int VERSIONED_IDENTIFIABLE__VERSION = IDENTIFIABLE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Versioned Identifiable</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int VERSIONED_IDENTIFIABLE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 1;

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
    * The feature id for the '<em><b>Group Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_ARTIFACT__GROUP_ID = VERSIONED_IDENTIFIABLE__GROUP_ID;

   /**
    * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_ARTIFACT__ARTIFACT_ID = VERSIONED_IDENTIFIABLE__ARTIFACT_ID;

   /**
    * The feature id for the '<em><b>Version</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_ARTIFACT__VERSION = VERSIONED_IDENTIFIABLE__VERSION;

   /**
    * The feature id for the '<em><b>Classifier</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_ARTIFACT__CLASSIFIER = VERSIONED_IDENTIFIABLE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Type</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_ARTIFACT__TYPE = VERSIONED_IDENTIFIABLE_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_ARTIFACT__EXTENSIONS = VERSIONED_IDENTIFIABLE_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_ARTIFACT__ANNOTATIONS = VERSIONED_IDENTIFIABLE_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>File</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_ARTIFACT__FILE = VERSIONED_IDENTIFIABLE_FEATURE_COUNT + 4;

   /**
    * The number of structural features of the '<em>Maven Artifact</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_ARTIFACT_FEATURE_COUNT = VERSIONED_IDENTIFIABLE_FEATURE_COUNT + 5;

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
   int MAVEN_DEPENDENCY__GROUP_ID = IDENTIFIABLE__GROUP_ID;

   /**
    * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_DEPENDENCY__ARTIFACT_ID = IDENTIFIABLE__ARTIFACT_ID;

   /**
    * The feature id for the '<em><b>Classifier</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_DEPENDENCY__CLASSIFIER = IDENTIFIABLE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Type</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_DEPENDENCY__TYPE = IDENTIFIABLE_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_DEPENDENCY__EXTENSIONS = IDENTIFIABLE_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_DEPENDENCY__ANNOTATIONS = IDENTIFIABLE_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>Version Range</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_DEPENDENCY__VERSION_RANGE = IDENTIFIABLE_FEATURE_COUNT + 4;

   /**
    * The feature id for the '<em><b>Scope</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_DEPENDENCY__SCOPE = IDENTIFIABLE_FEATURE_COUNT + 5;

   /**
    * The feature id for the '<em><b>Optional</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_DEPENDENCY__OPTIONAL = IDENTIFIABLE_FEATURE_COUNT + 6;

   /**
    * The number of structural features of the '<em>Maven Dependency</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_DEPENDENCY_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 7;

   /**
    * The meta object id for the '{@link org.sourcepit.common.maven.model.impl.ClassifiedImpl <em>Classified</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.maven.model.impl.ClassifiedImpl
    * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getClassified()
    * @generated
    */
   int CLASSIFIED = 4;

   /**
    * The feature id for the '<em><b>Classifier</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASSIFIED__CLASSIFIER = 0;

   /**
    * The feature id for the '<em><b>Type</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASSIFIED__TYPE = 1;

   /**
    * The number of structural features of the '<em>Classified</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASSIFIED_FEATURE_COUNT = 2;

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
   int MAVEN_PROJECT__GROUP_ID = VERSIONED_IDENTIFIABLE__GROUP_ID;

   /**
    * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_PROJECT__ARTIFACT_ID = VERSIONED_IDENTIFIABLE__ARTIFACT_ID;

   /**
    * The feature id for the '<em><b>Version</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_PROJECT__VERSION = VERSIONED_IDENTIFIABLE__VERSION;

   /**
    * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_PROJECT__EXTENSIONS = VERSIONED_IDENTIFIABLE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_PROJECT__ANNOTATIONS = VERSIONED_IDENTIFIABLE_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Packaging</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_PROJECT__PACKAGING = VERSIONED_IDENTIFIABLE_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Pom File</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_PROJECT__POM_FILE = VERSIONED_IDENTIFIABLE_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>Output Directory</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_PROJECT__OUTPUT_DIRECTORY = VERSIONED_IDENTIFIABLE_FEATURE_COUNT + 4;

   /**
    * The feature id for the '<em><b>Test Output Directory</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_PROJECT__TEST_OUTPUT_DIRECTORY = VERSIONED_IDENTIFIABLE_FEATURE_COUNT + 5;

   /**
    * The number of structural features of the '<em>Maven Project</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MAVEN_PROJECT_FEATURE_COUNT = VERSIONED_IDENTIFIABLE_FEATURE_COUNT + 6;


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
   int DEPENDENCY_DECLARATION__GROUP_ID = IDENTIFIABLE__GROUP_ID;

   /**
    * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int DEPENDENCY_DECLARATION__ARTIFACT_ID = IDENTIFIABLE__ARTIFACT_ID;

   /**
    * The feature id for the '<em><b>Classifier</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int DEPENDENCY_DECLARATION__CLASSIFIER = IDENTIFIABLE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Type</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int DEPENDENCY_DECLARATION__TYPE = IDENTIFIABLE_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Version Constraint</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int DEPENDENCY_DECLARATION__VERSION_CONSTRAINT = IDENTIFIABLE_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Scope</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int DEPENDENCY_DECLARATION__SCOPE = IDENTIFIABLE_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>Optional</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int DEPENDENCY_DECLARATION__OPTIONAL = IDENTIFIABLE_FEATURE_COUNT + 4;

   /**
    * The number of structural features of the '<em>Dependency Declaration</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int DEPENDENCY_DECLARATION_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 5;

   /**
    * The meta object id for the '{@link org.sourcepit.common.maven.model.Scope <em>Scope</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.maven.model.Scope
    * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getScope()
    * @generated
    */
   int SCOPE = 7;


   /**
    * The meta object id for the '<em>Nullable Scope</em>' data type.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.maven.model.Scope
    * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getNullableScope()
    * @generated
    */
   int NULLABLE_SCOPE = 8;

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
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.common.maven.model.MavenDependency#getVersionRange <em>Version Range</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Version Range</em>'.
    * @see org.sourcepit.common.maven.model.MavenDependency#getVersionRange()
    * @see #getMavenDependency()
    * @generated
    */
   EAttribute getMavenDependency_VersionRange();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.common.maven.model.MavenDependency#getScope
    * <em>Scope</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Scope</em>'.
    * @see org.sourcepit.common.maven.model.MavenDependency#getScope()
    * @see #getMavenDependency()
    * @generated
    */
   EAttribute getMavenDependency_Scope();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.common.maven.model.MavenDependency#isOptional
    * <em>Optional</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Optional</em>'.
    * @see org.sourcepit.common.maven.model.MavenDependency#isOptional()
    * @see #getMavenDependency()
    * @generated
    */
   EAttribute getMavenDependency_Optional();

   /**
    * Returns the meta object for class '{@link org.sourcepit.common.maven.model.Identifiable <em>Identifiable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Identifiable</em>'.
    * @see org.sourcepit.common.maven.model.Identifiable
    * @generated
    */
   EClass getIdentifiable();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.common.maven.model.Identifiable#getGroupId
    * <em>Group Id</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Group Id</em>'.
    * @see org.sourcepit.common.maven.model.Identifiable#getGroupId()
    * @see #getIdentifiable()
    * @generated
    */
   EAttribute getIdentifiable_GroupId();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.common.maven.model.Identifiable#getArtifactId
    * <em>Artifact Id</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Artifact Id</em>'.
    * @see org.sourcepit.common.maven.model.Identifiable#getArtifactId()
    * @see #getIdentifiable()
    * @generated
    */
   EAttribute getIdentifiable_ArtifactId();

   /**
    * Returns the meta object for class '{@link org.sourcepit.common.maven.model.VersionedIdentifiable
    * <em>Versioned Identifiable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Versioned Identifiable</em>'.
    * @see org.sourcepit.common.maven.model.VersionedIdentifiable
    * @generated
    */
   EClass getVersionedIdentifiable();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.common.maven.model.VersionedIdentifiable#getVersion <em>Version</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Version</em>'.
    * @see org.sourcepit.common.maven.model.VersionedIdentifiable#getVersion()
    * @see #getVersionedIdentifiable()
    * @generated
    */
   EAttribute getVersionedIdentifiable_Version();

   /**
    * Returns the meta object for class '{@link org.sourcepit.common.maven.model.Classified <em>Classified</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Classified</em>'.
    * @see org.sourcepit.common.maven.model.Classified
    * @generated
    */
   EClass getClassified();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.common.maven.model.Classified#getClassifier
    * <em>Classifier</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Classifier</em>'.
    * @see org.sourcepit.common.maven.model.Classified#getClassifier()
    * @see #getClassified()
    * @generated
    */
   EAttribute getClassified_Classifier();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.common.maven.model.Classified#getType
    * <em>Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Type</em>'.
    * @see org.sourcepit.common.maven.model.Classified#getType()
    * @see #getClassified()
    * @generated
    */
   EAttribute getClassified_Type();

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
   interface Literals
   {
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
       * The meta object literal for the '<em><b>Version Range</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute MAVEN_DEPENDENCY__VERSION_RANGE = eINSTANCE.getMavenDependency_VersionRange();

      /**
       * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute MAVEN_DEPENDENCY__SCOPE = eINSTANCE.getMavenDependency_Scope();

      /**
       * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute MAVEN_DEPENDENCY__OPTIONAL = eINSTANCE.getMavenDependency_Optional();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.maven.model.impl.IdentifiableImpl
       * <em>Identifiable</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.maven.model.impl.IdentifiableImpl
       * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getIdentifiable()
       * @generated
       */
      EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

      /**
       * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute IDENTIFIABLE__GROUP_ID = eINSTANCE.getIdentifiable_GroupId();

      /**
       * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute IDENTIFIABLE__ARTIFACT_ID = eINSTANCE.getIdentifiable_ArtifactId();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.maven.model.impl.VersionedIdentifiableImpl
       * <em>Versioned Identifiable</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.maven.model.impl.VersionedIdentifiableImpl
       * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getVersionedIdentifiable()
       * @generated
       */
      EClass VERSIONED_IDENTIFIABLE = eINSTANCE.getVersionedIdentifiable();

      /**
       * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute VERSIONED_IDENTIFIABLE__VERSION = eINSTANCE.getVersionedIdentifiable_Version();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.maven.model.impl.ClassifiedImpl
       * <em>Classified</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.maven.model.impl.ClassifiedImpl
       * @see org.sourcepit.common.maven.model.impl.MavenModelPackageImpl#getClassified()
       * @generated
       */
      EClass CLASSIFIED = eINSTANCE.getClassified();

      /**
       * The meta object literal for the '<em><b>Classifier</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute CLASSIFIED__CLASSIFIER = eINSTANCE.getClassified_Classifier();

      /**
       * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute CLASSIFIED__TYPE = eINSTANCE.getClassified_Type();

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

   }

} // MavenModelPackage

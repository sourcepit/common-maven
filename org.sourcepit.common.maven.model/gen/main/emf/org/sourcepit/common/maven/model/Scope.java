/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.maven.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Scope</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * 
 * @see org.sourcepit.common.maven.model.MavenModelPackage#getScope()
 * @model
 * @generated
 */
public enum Scope implements Enumerator
{
   /**
    * The '<em><b>Compile</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #COMPILE_VALUE
    * @generated
    * @ordered
    */
   COMPILE(0, "compile", "compile"),

   /**
    * The '<em><b>Provided</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #PROVIDED_VALUE
    * @generated
    * @ordered
    */
   PROVIDED(1, "provided", "provided"),

   /**
    * The '<em><b>Runtime</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #RUNTIME_VALUE
    * @generated
    * @ordered
    */
   RUNTIME(2, "runtime", "runtime"),

   /**
    * The '<em><b>Test</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #TEST_VALUE
    * @generated
    * @ordered
    */
   TEST(3, "test", "test"),

   /**
    * The '<em><b>System</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #SYSTEM_VALUE
    * @generated
    * @ordered
    */
   SYSTEM(4, "system", "system"),

   /**
    * The '<em><b>Import</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #IMPORT_VALUE
    * @generated
    * @ordered
    */
   IMPORT(5, "import", "import");

   /**
    * The '<em><b>Compile</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>Compile</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #COMPILE
    * @model name="compile"
    * @generated
    * @ordered
    */
   public static final int COMPILE_VALUE = 0;

   /**
    * The '<em><b>Provided</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>Provided</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #PROVIDED
    * @model name="provided"
    * @generated
    * @ordered
    */
   public static final int PROVIDED_VALUE = 1;

   /**
    * The '<em><b>Runtime</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>Runtime</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #RUNTIME
    * @model name="runtime"
    * @generated
    * @ordered
    */
   public static final int RUNTIME_VALUE = 2;

   /**
    * The '<em><b>Test</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>Test</b></em>' literal object isn't clear, there really should be more of a description
    * here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #TEST
    * @model name="test"
    * @generated
    * @ordered
    */
   public static final int TEST_VALUE = 3;

   /**
    * The '<em><b>System</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>System</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #SYSTEM
    * @model name="system"
    * @generated
    * @ordered
    */
   public static final int SYSTEM_VALUE = 4;

   /**
    * The '<em><b>Import</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>Import</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #IMPORT
    * @model name="import"
    * @generated
    * @ordered
    */
   public static final int IMPORT_VALUE = 5;

   /**
    * An array of all the '<em><b>Scope</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private static final Scope[] VALUES_ARRAY = new Scope[] { COMPILE, PROVIDED, RUNTIME, TEST, SYSTEM, IMPORT, };

   /**
    * A public read-only list of all the '<em><b>Scope</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public static final List<Scope> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

   /**
    * Returns the '<em><b>Scope</b></em>' literal with the specified literal value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public static Scope get(String literal)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         Scope result = VALUES_ARRAY[i];
         if (result.toString().equals(literal))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Scope</b></em>' literal with the specified name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public static Scope getByName(String name)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         Scope result = VALUES_ARRAY[i];
         if (result.getName().equals(name))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Scope</b></em>' literal with the specified integer value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public static Scope get(int value)
   {
      switch (value)
      {
         case COMPILE_VALUE :
            return COMPILE;
         case PROVIDED_VALUE :
            return PROVIDED;
         case RUNTIME_VALUE :
            return RUNTIME;
         case TEST_VALUE :
            return TEST;
         case SYSTEM_VALUE :
            return SYSTEM;
         case IMPORT_VALUE :
            return IMPORT;
      }
      return null;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private final int value;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private final String name;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private final String literal;

   /**
    * Only this class can construct instances.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private Scope(int value, String name, String literal)
   {
      this.value = value;
      this.name = name;
      this.literal = literal;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public int getValue()
   {
      return value;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getName()
   {
      return name;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getLiteral()
   {
      return literal;
   }

   /**
    * Returns the literal value of the enumerator, which is its string representation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public String toString()
   {
      return literal;
   }

} // Scope

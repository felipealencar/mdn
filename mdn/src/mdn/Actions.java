/**
 */
package mdn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Actions</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mdn.MdnPackage#getActions()
 * @model
 * @generated
 */
public enum Actions implements Enumerator
{
  /**
   * The '<em><b>FORWARD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FORWARD_VALUE
   * @generated
   * @ordered
   */
  FORWARD(0, "FORWARD", "FORWARD"),

  /**
   * The '<em><b>DROP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DROP_VALUE
   * @generated
   * @ordered
   */
  DROP(1, "DROP", "DROP"),

  /**
   * The '<em><b>MODIFY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MODIFY_VALUE
   * @generated
   * @ordered
   */
  MODIFY(2, "MODIFY", "MODIFY"), /**
   * The '<em><b>MONITOR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MONITOR_VALUE
   * @generated
   * @ordered
   */
  MONITOR(0, "MONITOR", "MONITOR"), /**
   * The '<em><b>LOAD BALANCE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LOAD_BALANCE_VALUE
   * @generated
   * @ordered
   */
  LOAD_BALANCE(0, "LOAD_BALANCE", "LOAD_BALANCE");

  /**
   * The '<em><b>FORWARD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FORWARD</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FORWARD
   * @model
   * @generated
   * @ordered
   */
  public static final int FORWARD_VALUE = 0;

  /**
   * The '<em><b>DROP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DROP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DROP
   * @model
   * @generated
   * @ordered
   */
  public static final int DROP_VALUE = 1;

  /**
   * The '<em><b>MODIFY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MODIFY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MODIFY
   * @model
   * @generated
   * @ordered
   */
  public static final int MODIFY_VALUE = 2;

  /**
   * The '<em><b>MONITOR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MONITOR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MONITOR
   * @model
   * @generated
   * @ordered
   */
  public static final int MONITOR_VALUE = 0;

  /**
   * The '<em><b>LOAD BALANCE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LOAD BALANCE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LOAD_BALANCE
   * @model
   * @generated
   * @ordered
   */
  public static final int LOAD_BALANCE_VALUE = 0;

  /**
   * An array of all the '<em><b>Actions</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Actions[] VALUES_ARRAY =
    new Actions[]
    {
      FORWARD,
      DROP,
      MODIFY,
      MONITOR,
      LOAD_BALANCE,
    };

  /**
   * A public read-only list of all the '<em><b>Actions</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Actions> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Actions</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Actions get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Actions result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Actions</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Actions getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Actions result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Actions</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Actions get(int value)
  {
    switch (value)
    {
      case FORWARD_VALUE: return FORWARD;
      case DROP_VALUE: return DROP;
      case MODIFY_VALUE: return MODIFY;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Actions(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
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
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Actions

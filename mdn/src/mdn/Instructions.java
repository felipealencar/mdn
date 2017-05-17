/**
 */
package mdn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Instructions</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mdn.MdnPackage#getInstructions()
 * @model
 * @generated
 */
public enum Instructions implements Enumerator {
	/**
	 * The '<em><b>WRITE ACTIONS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITE_ACTIONS_VALUE
	 * @generated
	 * @ordered
	 */
	WRITE_ACTIONS(0, "WRITE_ACTIONS", "WRITE_ACTIONS"),

	/**
	 * The '<em><b>GOTO TABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOTO_TABLE_VALUE
	 * @generated
	 * @ordered
	 */
	GOTO_TABLE(0, "GOTO_TABLE", "GOTO_TABLE");

	/**
	 * The '<em><b>WRITE ACTIONS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WRITE ACTIONS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WRITE_ACTIONS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WRITE_ACTIONS_VALUE = 0;

	/**
	 * The '<em><b>GOTO TABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GOTO TABLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GOTO_TABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GOTO_TABLE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Instructions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Instructions[] VALUES_ARRAY =
		new Instructions[] {
			WRITE_ACTIONS,
			GOTO_TABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Instructions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Instructions> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Instructions</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Instructions get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Instructions result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Instructions</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Instructions getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Instructions result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Instructions</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Instructions get(int value) {
		switch (value) {
			case WRITE_ACTIONS_VALUE: return WRITE_ACTIONS;
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
	private Instructions(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Instructions

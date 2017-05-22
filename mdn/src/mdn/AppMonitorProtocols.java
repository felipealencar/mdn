/**
 */
package mdn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>App Monitor Protocols</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mdn.MdnPackage#getAppMonitorProtocols()
 * @model
 * @generated
 */
public enum AppMonitorProtocols implements Enumerator {
	/**
	 * The '<em><b>SFLOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SFLOW_VALUE
	 * @generated
	 * @ordered
	 */
	SFLOW(0, "SFLOW", "SFLOW"),

	/**
	 * The '<em><b>NETFLOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETFLOW_VALUE
	 * @generated
	 * @ordered
	 */
	NETFLOW(0, "NETFLOW", "NETFLOW"),

	/**
	 * The '<em><b>FLOWMETERS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOWMETERS_VALUE
	 * @generated
	 * @ordered
	 */
	FLOWMETERS(0, "FLOWMETERS", "FLOWMETERS");

	/**
	 * The '<em><b>SFLOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SFLOW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SFLOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SFLOW_VALUE = 0;

	/**
	 * The '<em><b>NETFLOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NETFLOW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NETFLOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NETFLOW_VALUE = 0;

	/**
	 * The '<em><b>FLOWMETERS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FLOWMETERS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOWMETERS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLOWMETERS_VALUE = 0;

	/**
	 * An array of all the '<em><b>App Monitor Protocols</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AppMonitorProtocols[] VALUES_ARRAY =
		new AppMonitorProtocols[] {
			SFLOW,
			NETFLOW,
			FLOWMETERS,
		};

	/**
	 * A public read-only list of all the '<em><b>App Monitor Protocols</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AppMonitorProtocols> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>App Monitor Protocols</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AppMonitorProtocols get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AppMonitorProtocols result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>App Monitor Protocols</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AppMonitorProtocols getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AppMonitorProtocols result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>App Monitor Protocols</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AppMonitorProtocols get(int value) {
		switch (value) {
			case SFLOW_VALUE: return SFLOW;
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
	private AppMonitorProtocols(int value, String name, String literal) {
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
	
} //AppMonitorProtocols

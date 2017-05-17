/**
 */
package mdn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mdn.Flow#getMatchFields <em>Match Fields</em>}</li>
 *   <li>{@link mdn.Flow#getMatchValues <em>Match Values</em>}</li>
 *   <li>{@link mdn.Flow#getFlowSourceHost <em>Flow Source Host</em>}</li>
 *   <li>{@link mdn.Flow#getFlowDestinationHost <em>Flow Destination Host</em>}</li>
 *   <li>{@link mdn.Flow#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see mdn.MdnPackage#getFlow()
 * @model
 * @generated
 */
public interface Flow extends EObject {
	/**
	 * Returns the value of the '<em><b>Match Fields</b></em>' attribute.
	 * The literals are from the enumeration {@link mdn.PacketHeaders}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Match Fields</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Fields</em>' attribute.
	 * @see mdn.PacketHeaders
	 * @see #setMatchFields(PacketHeaders)
	 * @see mdn.MdnPackage#getFlow_MatchFields()
	 * @model unique="false"
	 * @generated
	 */
	PacketHeaders getMatchFields();

	/**
	 * Sets the value of the '{@link mdn.Flow#getMatchFields <em>Match Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Fields</em>' attribute.
	 * @see mdn.PacketHeaders
	 * @see #getMatchFields()
	 * @generated
	 */
	void setMatchFields(PacketHeaders value);

	/**
	 * Returns the value of the '<em><b>Match Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Match Values</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Values</em>' attribute.
	 * @see #setMatchValues(String)
	 * @see mdn.MdnPackage#getFlow_MatchValues()
	 * @model
	 * @generated
	 */
	String getMatchValues();

	/**
	 * Sets the value of the '{@link mdn.Flow#getMatchValues <em>Match Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Values</em>' attribute.
	 * @see #getMatchValues()
	 * @generated
	 */
	void setMatchValues(String value);

	/**
	 * Returns the value of the '<em><b>Flow Source Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Source Host</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Source Host</em>' reference.
	 * @see #setFlowSourceHost(Host)
	 * @see mdn.MdnPackage#getFlow_FlowSourceHost()
	 * @model
	 * @generated
	 */
	Host getFlowSourceHost();

	/**
	 * Sets the value of the '{@link mdn.Flow#getFlowSourceHost <em>Flow Source Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Source Host</em>' reference.
	 * @see #getFlowSourceHost()
	 * @generated
	 */
	void setFlowSourceHost(Host value);

	/**
	 * Returns the value of the '<em><b>Flow Destination Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Destination Host</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Destination Host</em>' reference.
	 * @see #setFlowDestinationHost(Host)
	 * @see mdn.MdnPackage#getFlow_FlowDestinationHost()
	 * @model
	 * @generated
	 */
	Host getFlowDestinationHost();

	/**
	 * Sets the value of the '{@link mdn.Flow#getFlowDestinationHost <em>Flow Destination Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Destination Host</em>' reference.
	 * @see #getFlowDestinationHost()
	 * @generated
	 */
	void setFlowDestinationHost(Host value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see mdn.MdnPackage#getFlow_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link mdn.Flow#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

} // Flow

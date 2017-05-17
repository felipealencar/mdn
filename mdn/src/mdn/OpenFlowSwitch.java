/**
 */
package mdn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Flow Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mdn.OpenFlowSwitch#getTableSpace <em>Table Space</em>}</li>
 *   <li>{@link mdn.OpenFlowSwitch#getSwitchIsOpenFlow <em>Switch Is Open Flow</em>}</li>
 *   <li>{@link mdn.OpenFlowSwitch#getRequiredHeaders <em>Required Headers</em>}</li>
 *   <li>{@link mdn.OpenFlowSwitch#getVersion <em>Version</em>}</li>
 *   <li>{@link mdn.OpenFlowSwitch#getSupportedProtocols <em>Supported Protocols</em>}</li>
 *   <li>{@link mdn.OpenFlowSwitch#getOptionalHeaders <em>Optional Headers</em>}</li>
 *   <li>{@link mdn.OpenFlowSwitch#getAvailableTableSpace <em>Available Table Space</em>}</li>
 * </ul>
 * </p>
 *
 * @see mdn.MdnPackage#getOpenFlowSwitch()
 * @model
 * @generated
 */
public interface OpenFlowSwitch extends EObject {
	/**
	 * Returns the value of the '<em><b>Table Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Space</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Space</em>' attribute.
	 * @see #setTableSpace(float)
	 * @see mdn.MdnPackage#getOpenFlowSwitch_TableSpace()
	 * @model
	 * @generated
	 */
	float getTableSpace();

	/**
	 * Sets the value of the '{@link mdn.OpenFlowSwitch#getTableSpace <em>Table Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Space</em>' attribute.
	 * @see #getTableSpace()
	 * @generated
	 */
	void setTableSpace(float value);

	/**
	 * Returns the value of the '<em><b>Switch Is Open Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch Is Open Flow</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch Is Open Flow</em>' reference.
	 * @see #setSwitchIsOpenFlow(Switch)
	 * @see mdn.MdnPackage#getOpenFlowSwitch_SwitchIsOpenFlow()
	 * @model
	 * @generated
	 */
	Switch getSwitchIsOpenFlow();

	/**
	 * Sets the value of the '{@link mdn.OpenFlowSwitch#getSwitchIsOpenFlow <em>Switch Is Open Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch Is Open Flow</em>' reference.
	 * @see #getSwitchIsOpenFlow()
	 * @generated
	 */
	void setSwitchIsOpenFlow(Switch value);

	/**
	 * Returns the value of the '<em><b>Required Headers</b></em>' attribute list.
	 * The list contents are of type {@link mdn.PacketHeaders}.
	 * The literals are from the enumeration {@link mdn.PacketHeaders}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Headers</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Headers</em>' attribute list.
	 * @see mdn.PacketHeaders
	 * @see mdn.MdnPackage#getOpenFlowSwitch_RequiredHeaders()
	 * @model unique="false" required="true"
	 * @generated
	 */
	EList<PacketHeaders> getRequiredHeaders();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see mdn.MdnPackage#getOpenFlowSwitch_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link mdn.OpenFlowSwitch#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Supported Protocols</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Protocols</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Protocols</em>' attribute.
	 * @see #setSupportedProtocols(String)
	 * @see mdn.MdnPackage#getOpenFlowSwitch_SupportedProtocols()
	 * @model
	 * @generated
	 */
	String getSupportedProtocols();

	/**
	 * Sets the value of the '{@link mdn.OpenFlowSwitch#getSupportedProtocols <em>Supported Protocols</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supported Protocols</em>' attribute.
	 * @see #getSupportedProtocols()
	 * @generated
	 */
	void setSupportedProtocols(String value);

	/**
	 * Returns the value of the '<em><b>Optional Headers</b></em>' attribute list.
	 * The list contents are of type {@link mdn.PacketHeaders}.
	 * The literals are from the enumeration {@link mdn.PacketHeaders}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional Headers</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Headers</em>' attribute list.
	 * @see mdn.PacketHeaders
	 * @see mdn.MdnPackage#getOpenFlowSwitch_OptionalHeaders()
	 * @model unique="false"
	 * @generated
	 */
	EList<PacketHeaders> getOptionalHeaders();

	/**
	 * Returns the value of the '<em><b>Available Table Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Table Space</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Table Space</em>' attribute.
	 * @see #setAvailableTableSpace(float)
	 * @see mdn.MdnPackage#getOpenFlowSwitch_AvailableTableSpace()
	 * @model
	 * @generated
	 */
	float getAvailableTableSpace();

	/**
	 * Sets the value of the '{@link mdn.OpenFlowSwitch#getAvailableTableSpace <em>Available Table Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Table Space</em>' attribute.
	 * @see #getAvailableTableSpace()
	 * @generated
	 */
	void setAvailableTableSpace(float value);

} // OpenFlowSwitch

/**
 */
package mdn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App Monitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mdn.AppMonitor#getType <em>Type</em>}</li>
 *   <li>{@link mdn.AppMonitor#getServerAddress <em>Server Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see mdn.MdnPackage#getAppMonitor()
 * @model
 * @generated
 */
public interface AppMonitor extends App {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"NETFLOW"</code>.
	 * The literals are from the enumeration {@link mdn.AppMonitorTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mdn.AppMonitorTypes
	 * @see #setType(AppMonitorTypes)
	 * @see mdn.MdnPackage#getAppMonitor_Type()
	 * @model default="NETFLOW"
	 * @generated
	 */
	AppMonitorTypes getType();

	/**
	 * Sets the value of the '{@link mdn.AppMonitor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mdn.AppMonitorTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(AppMonitorTypes value);

	/**
	 * Returns the value of the '<em><b>Server Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Address</em>' attribute.
	 * @see #setServerAddress(String)
	 * @see mdn.MdnPackage#getAppMonitor_ServerAddress()
	 * @model
	 * @generated
	 */
	String getServerAddress();

	/**
	 * Sets the value of the '{@link mdn.AppMonitor#getServerAddress <em>Server Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Address</em>' attribute.
	 * @see #getServerAddress()
	 * @generated
	 */
	void setServerAddress(String value);

} // AppMonitor

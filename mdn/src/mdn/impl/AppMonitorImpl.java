/**
 */
package mdn.impl;

import java.util.Collection;
import mdn.AppMonitor;
import mdn.AppMonitorProtocols;
import mdn.AppMonitorTypes;
import mdn.Flow;
import mdn.MdnPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App Monitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mdn.impl.AppMonitorImpl#getType <em>Type</em>}</li>
 *   <li>{@link mdn.impl.AppMonitorImpl#getServerAddress <em>Server Address</em>}</li>
 *   <li>{@link mdn.impl.AppMonitorImpl#getFlowToMonitor <em>Flow To Monitor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AppMonitorImpl extends AppImpl implements AppMonitor {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final AppMonitorProtocols TYPE_EDEFAULT = AppMonitorProtocols.NETFLOW;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AppMonitorProtocols type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerAddress() <em>Server Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerAddress() <em>Server Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerAddress()
	 * @generated
	 * @ordered
	 */
	protected String serverAddress = SERVER_ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFlowToMonitor() <em>Flow To Monitor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowToMonitor()
	 * @generated
	 * @ordered
	 */
	protected EList<Flow> flowToMonitor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppMonitorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdnPackage.Literals.APP_MONITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppMonitorProtocols getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(AppMonitorProtocols newType) {
		AppMonitorProtocols oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.APP_MONITOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServerAddress() {
		return serverAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerAddress(String newServerAddress) {
		String oldServerAddress = serverAddress;
		serverAddress = newServerAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.APP_MONITOR__SERVER_ADDRESS, oldServerAddress, serverAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Flow> getFlowToMonitor() {
		if (flowToMonitor == null) {
			flowToMonitor = new EObjectResolvingEList<Flow>(Flow.class, this, MdnPackage.APP_MONITOR__FLOW_TO_MONITOR);
		}
		return flowToMonitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MdnPackage.APP_MONITOR__TYPE:
				return getType();
			case MdnPackage.APP_MONITOR__SERVER_ADDRESS:
				return getServerAddress();
			case MdnPackage.APP_MONITOR__FLOW_TO_MONITOR:
				return getFlowToMonitor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MdnPackage.APP_MONITOR__TYPE:
				setType((AppMonitorProtocols)newValue);
				return;
			case MdnPackage.APP_MONITOR__SERVER_ADDRESS:
				setServerAddress((String)newValue);
				return;
			case MdnPackage.APP_MONITOR__FLOW_TO_MONITOR:
				getFlowToMonitor().clear();
				getFlowToMonitor().addAll((Collection<? extends Flow>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MdnPackage.APP_MONITOR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case MdnPackage.APP_MONITOR__SERVER_ADDRESS:
				setServerAddress(SERVER_ADDRESS_EDEFAULT);
				return;
			case MdnPackage.APP_MONITOR__FLOW_TO_MONITOR:
				getFlowToMonitor().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MdnPackage.APP_MONITOR__TYPE:
				return type != TYPE_EDEFAULT;
			case MdnPackage.APP_MONITOR__SERVER_ADDRESS:
				return SERVER_ADDRESS_EDEFAULT == null ? serverAddress != null : !SERVER_ADDRESS_EDEFAULT.equals(serverAddress);
			case MdnPackage.APP_MONITOR__FLOW_TO_MONITOR:
				return flowToMonitor != null && !flowToMonitor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", serverAddress: ");
		result.append(serverAddress);
		result.append(')');
		return result.toString();
	}

} //AppMonitorImpl

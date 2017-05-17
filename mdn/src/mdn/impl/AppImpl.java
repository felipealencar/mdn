/**
 */
package mdn.impl;

import java.util.Collection;

import mdn.App;
import mdn.Controller;
import mdn.MdnPackage;
import mdn.NetworkNode;
import mdn.PacketHeader;
import mdn.Rule;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mdn.impl.AppImpl#getActionPacketHeader <em>Action Packet Header</em>}</li>
 *   <li>{@link mdn.impl.AppImpl#getAppToNetworkNode <em>App To Network Node</em>}</li>
 *   <li>{@link mdn.impl.AppImpl#getControllerApp <em>Controller App</em>}</li>
 *   <li>{@link mdn.impl.AppImpl#getAppRule <em>App Rule</em>}</li>
 *   <li>{@link mdn.impl.AppImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AppImpl extends EObjectImpl implements App {
	/**
	 * The cached value of the '{@link #getActionPacketHeader() <em>Action Packet Header</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionPacketHeader()
	 * @generated
	 * @ordered
	 */
	protected EList<PacketHeader> actionPacketHeader;

	/**
	 * The cached value of the '{@link #getAppToNetworkNode() <em>App To Network Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppToNetworkNode()
	 * @generated
	 * @ordered
	 */
	protected NetworkNode appToNetworkNode;

	/**
	 * The cached value of the '{@link #getControllerApp() <em>Controller App</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerApp()
	 * @generated
	 * @ordered
	 */
	protected EList<Controller> controllerApp;

	/**
	 * The cached value of the '{@link #getAppRule() <em>App Rule</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppRule()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> appRule;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "App";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdnPackage.Literals.APP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PacketHeader> getActionPacketHeader() {
		if (actionPacketHeader == null) {
			actionPacketHeader = new EObjectResolvingEList<PacketHeader>(PacketHeader.class, this, MdnPackage.APP__ACTION_PACKET_HEADER);
		}
		return actionPacketHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkNode getAppToNetworkNode() {
		if (appToNetworkNode != null && appToNetworkNode.eIsProxy()) {
			InternalEObject oldAppToNetworkNode = (InternalEObject)appToNetworkNode;
			appToNetworkNode = (NetworkNode)eResolveProxy(oldAppToNetworkNode);
			if (appToNetworkNode != oldAppToNetworkNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MdnPackage.APP__APP_TO_NETWORK_NODE, oldAppToNetworkNode, appToNetworkNode));
			}
		}
		return appToNetworkNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkNode basicGetAppToNetworkNode() {
		return appToNetworkNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppToNetworkNode(NetworkNode newAppToNetworkNode) {
		NetworkNode oldAppToNetworkNode = appToNetworkNode;
		appToNetworkNode = newAppToNetworkNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.APP__APP_TO_NETWORK_NODE, oldAppToNetworkNode, appToNetworkNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Controller> getControllerApp() {
		if (controllerApp == null) {
			controllerApp = new EObjectResolvingEList<Controller>(Controller.class, this, MdnPackage.APP__CONTROLLER_APP);
		}
		return controllerApp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getAppRule() {
		if (appRule == null) {
			appRule = new EObjectResolvingEList<Rule>(Rule.class, this, MdnPackage.APP__APP_RULE);
		}
		return appRule;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.APP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MdnPackage.APP__ACTION_PACKET_HEADER:
				return getActionPacketHeader();
			case MdnPackage.APP__APP_TO_NETWORK_NODE:
				if (resolve) return getAppToNetworkNode();
				return basicGetAppToNetworkNode();
			case MdnPackage.APP__CONTROLLER_APP:
				return getControllerApp();
			case MdnPackage.APP__APP_RULE:
				return getAppRule();
			case MdnPackage.APP__NAME:
				return getName();
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
			case MdnPackage.APP__ACTION_PACKET_HEADER:
				getActionPacketHeader().clear();
				getActionPacketHeader().addAll((Collection<? extends PacketHeader>)newValue);
				return;
			case MdnPackage.APP__APP_TO_NETWORK_NODE:
				setAppToNetworkNode((NetworkNode)newValue);
				return;
			case MdnPackage.APP__CONTROLLER_APP:
				getControllerApp().clear();
				getControllerApp().addAll((Collection<? extends Controller>)newValue);
				return;
			case MdnPackage.APP__APP_RULE:
				getAppRule().clear();
				getAppRule().addAll((Collection<? extends Rule>)newValue);
				return;
			case MdnPackage.APP__NAME:
				setName((String)newValue);
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
			case MdnPackage.APP__ACTION_PACKET_HEADER:
				getActionPacketHeader().clear();
				return;
			case MdnPackage.APP__APP_TO_NETWORK_NODE:
				setAppToNetworkNode((NetworkNode)null);
				return;
			case MdnPackage.APP__CONTROLLER_APP:
				getControllerApp().clear();
				return;
			case MdnPackage.APP__APP_RULE:
				getAppRule().clear();
				return;
			case MdnPackage.APP__NAME:
				setName(NAME_EDEFAULT);
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
			case MdnPackage.APP__ACTION_PACKET_HEADER:
				return actionPacketHeader != null && !actionPacketHeader.isEmpty();
			case MdnPackage.APP__APP_TO_NETWORK_NODE:
				return appToNetworkNode != null;
			case MdnPackage.APP__CONTROLLER_APP:
				return controllerApp != null && !controllerApp.isEmpty();
			case MdnPackage.APP__APP_RULE:
				return appRule != null && !appRule.isEmpty();
			case MdnPackage.APP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AppImpl

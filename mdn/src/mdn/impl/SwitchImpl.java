/**
 */
package mdn.impl;

import java.util.Collection;

import mdn.Controller;
import mdn.MdnPackage;
import mdn.Switch;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mdn.impl.SwitchImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link mdn.impl.SwitchImpl#getSwitchController <em>Switch Controller</em>}</li>
 *   <li>{@link mdn.impl.SwitchImpl#getSwitches <em>Switches</em>}</li>
 *   <li>{@link mdn.impl.SwitchImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwitchImpl extends NetworkNodeImpl implements Switch {
	/**
	 * The default value of the '{@link #getPorts() <em>Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected static final int PORTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected int ports = PORTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSwitchController() <em>Switch Controller</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchController()
	 * @generated
	 * @ordered
	 */
	protected EList<Controller> switchController;

	/**
	 * The cached value of the '{@link #getSwitches() <em>Switches</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitches()
	 * @generated
	 * @ordered
	 */
	protected EList<Switch> switches;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdnPackage.Literals.SWITCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPorts() {
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorts(int newPorts) {
		int oldPorts = ports;
		ports = newPorts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.SWITCH__PORTS, oldPorts, ports));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Controller> getSwitchController() {
		if (switchController == null) {
			switchController = new EObjectResolvingEList<Controller>(Controller.class, this, MdnPackage.SWITCH__SWITCH_CONTROLLER);
		}
		return switchController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Switch> getSwitches() {
		if (switches == null) {
			switches = new EObjectResolvingEList<Switch>(Switch.class, this, MdnPackage.SWITCH__SWITCHES);
		}
		return switches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.SWITCH__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MdnPackage.SWITCH__PORTS:
				return getPorts();
			case MdnPackage.SWITCH__SWITCH_CONTROLLER:
				return getSwitchController();
			case MdnPackage.SWITCH__SWITCHES:
				return getSwitches();
			case MdnPackage.SWITCH__ID:
				return getId();
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
			case MdnPackage.SWITCH__PORTS:
				setPorts((Integer)newValue);
				return;
			case MdnPackage.SWITCH__SWITCH_CONTROLLER:
				getSwitchController().clear();
				getSwitchController().addAll((Collection<? extends Controller>)newValue);
				return;
			case MdnPackage.SWITCH__SWITCHES:
				getSwitches().clear();
				getSwitches().addAll((Collection<? extends Switch>)newValue);
				return;
			case MdnPackage.SWITCH__ID:
				setId((Integer)newValue);
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
			case MdnPackage.SWITCH__PORTS:
				setPorts(PORTS_EDEFAULT);
				return;
			case MdnPackage.SWITCH__SWITCH_CONTROLLER:
				getSwitchController().clear();
				return;
			case MdnPackage.SWITCH__SWITCHES:
				getSwitches().clear();
				return;
			case MdnPackage.SWITCH__ID:
				setId(ID_EDEFAULT);
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
			case MdnPackage.SWITCH__PORTS:
				return ports != PORTS_EDEFAULT;
			case MdnPackage.SWITCH__SWITCH_CONTROLLER:
				return switchController != null && !switchController.isEmpty();
			case MdnPackage.SWITCH__SWITCHES:
				return switches != null && !switches.isEmpty();
			case MdnPackage.SWITCH__ID:
				return id != ID_EDEFAULT;
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
		result.append(" (ports: ");
		result.append(ports);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //SwitchImpl

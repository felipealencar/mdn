/**
 */
package mdn.impl;

import mdn.Host;
import mdn.MdnPackage;
import mdn.Switch;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Host</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mdn.impl.HostImpl#getHostSwitch <em>Host Switch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HostImpl extends NetworkNodeImpl implements Host {
	/**
	 * The cached value of the '{@link #getHostSwitch() <em>Host Switch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostSwitch()
	 * @generated
	 * @ordered
	 */
	protected Switch hostSwitch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdnPackage.Literals.HOST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch getHostSwitch() {
		if (hostSwitch != null && hostSwitch.eIsProxy()) {
			InternalEObject oldHostSwitch = (InternalEObject)hostSwitch;
			hostSwitch = (Switch)eResolveProxy(oldHostSwitch);
			if (hostSwitch != oldHostSwitch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MdnPackage.HOST__HOST_SWITCH, oldHostSwitch, hostSwitch));
			}
		}
		return hostSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch basicGetHostSwitch() {
		return hostSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSwitch(Switch newHostSwitch) {
		Switch oldHostSwitch = hostSwitch;
		hostSwitch = newHostSwitch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.HOST__HOST_SWITCH, oldHostSwitch, hostSwitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MdnPackage.HOST__HOST_SWITCH:
				if (resolve) return getHostSwitch();
				return basicGetHostSwitch();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MdnPackage.HOST__HOST_SWITCH:
				setHostSwitch((Switch)newValue);
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
			case MdnPackage.HOST__HOST_SWITCH:
				setHostSwitch((Switch)null);
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
			case MdnPackage.HOST__HOST_SWITCH:
				return hostSwitch != null;
		}
		return super.eIsSet(featureID);
	}

} //HostImpl

/**
 */
package mdn.impl;

import java.util.Collection;

import mdn.Group;
import mdn.Host;
import mdn.MdnPackage;
import mdn.Switch;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mdn.impl.GroupImpl#getHostsGroup <em>Hosts Group</em>}</li>
 *   <li>{@link mdn.impl.GroupImpl#getIp <em>Ip</em>}</li>
 *   <li>{@link mdn.impl.GroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link mdn.impl.GroupImpl#getSwitchesGroup <em>Switches Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupImpl extends EObjectImpl implements Group {
	/**
	 * The cached value of the '{@link #getHostsGroup() <em>Hosts Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostsGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<Host> hostsGroup;

	/**
	 * The default value of the '{@link #getIp() <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIp() <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
	protected String ip = IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The cached value of the '{@link #getSwitchesGroup() <em>Switches Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchesGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<Switch> switchesGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdnPackage.Literals.GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Host> getHostsGroup() {
		if (hostsGroup == null) {
			hostsGroup = new EObjectContainmentEList<Host>(Host.class, this, MdnPackage.GROUP__HOSTS_GROUP);
		}
		return hostsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIp(String newIp) {
		String oldIp = ip;
		ip = newIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.GROUP__IP, oldIp, ip));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Switch> getSwitchesGroup() {
		if (switchesGroup == null) {
			switchesGroup = new EObjectContainmentEList<Switch>(Switch.class, this, MdnPackage.GROUP__SWITCHES_GROUP);
		}
		return switchesGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MdnPackage.GROUP__HOSTS_GROUP:
				return ((InternalEList<?>)getHostsGroup()).basicRemove(otherEnd, msgs);
			case MdnPackage.GROUP__SWITCHES_GROUP:
				return ((InternalEList<?>)getSwitchesGroup()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MdnPackage.GROUP__HOSTS_GROUP:
				return getHostsGroup();
			case MdnPackage.GROUP__IP:
				return getIp();
			case MdnPackage.GROUP__NAME:
				return getName();
			case MdnPackage.GROUP__SWITCHES_GROUP:
				return getSwitchesGroup();
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
			case MdnPackage.GROUP__HOSTS_GROUP:
				getHostsGroup().clear();
				getHostsGroup().addAll((Collection<? extends Host>)newValue);
				return;
			case MdnPackage.GROUP__IP:
				setIp((String)newValue);
				return;
			case MdnPackage.GROUP__NAME:
				setName((String)newValue);
				return;
			case MdnPackage.GROUP__SWITCHES_GROUP:
				getSwitchesGroup().clear();
				getSwitchesGroup().addAll((Collection<? extends Switch>)newValue);
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
			case MdnPackage.GROUP__HOSTS_GROUP:
				getHostsGroup().clear();
				return;
			case MdnPackage.GROUP__IP:
				setIp(IP_EDEFAULT);
				return;
			case MdnPackage.GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MdnPackage.GROUP__SWITCHES_GROUP:
				getSwitchesGroup().clear();
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
			case MdnPackage.GROUP__HOSTS_GROUP:
				return hostsGroup != null && !hostsGroup.isEmpty();
			case MdnPackage.GROUP__IP:
				return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
			case MdnPackage.GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MdnPackage.GROUP__SWITCHES_GROUP:
				return switchesGroup != null && !switchesGroup.isEmpty();
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
		result.append(" (ip: ");
		result.append(ip);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //GroupImpl

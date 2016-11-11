/**
 */
package mdn.impl;

import mdn.MdnPackage;
import mdn.NetworkNode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mdn.impl.NetworkNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link mdn.impl.NetworkNodeImpl#getMac <em>Mac</em>}</li>
 *   <li>{@link mdn.impl.NetworkNodeImpl#getIp <em>Ip</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NetworkNodeImpl extends EObjectImpl implements NetworkNode
{
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
	 * The default value of the '{@link #getMac() <em>Mac</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMac()
	 * @generated
	 * @ordered
	 */
  protected static final String MAC_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getMac() <em>Mac</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMac()
	 * @generated
	 * @ordered
	 */
  protected String mac = MAC_EDEFAULT;

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
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected NetworkNodeImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return MdnPackage.Literals.NETWORK_NODE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
		return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setName(String newName)
  {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.NETWORK_NODE__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getMac()
  {
		return mac;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMac(String newMac)
  {
		String oldMac = mac;
		mac = newMac;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.NETWORK_NODE__MAC, oldMac, mac));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getIp()
  {
		return ip;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setIp(String newIp)
  {
		String oldIp = ip;
		ip = newIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.NETWORK_NODE__IP, oldIp, ip));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case MdnPackage.NETWORK_NODE__NAME:
				return getName();
			case MdnPackage.NETWORK_NODE__MAC:
				return getMac();
			case MdnPackage.NETWORK_NODE__IP:
				return getIp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case MdnPackage.NETWORK_NODE__NAME:
				setName((String)newValue);
				return;
			case MdnPackage.NETWORK_NODE__MAC:
				setMac((String)newValue);
				return;
			case MdnPackage.NETWORK_NODE__IP:
				setIp((String)newValue);
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
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case MdnPackage.NETWORK_NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MdnPackage.NETWORK_NODE__MAC:
				setMac(MAC_EDEFAULT);
				return;
			case MdnPackage.NETWORK_NODE__IP:
				setIp(IP_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case MdnPackage.NETWORK_NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MdnPackage.NETWORK_NODE__MAC:
				return MAC_EDEFAULT == null ? mac != null : !MAC_EDEFAULT.equals(mac);
			case MdnPackage.NETWORK_NODE__IP:
				return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", mac: ");
		result.append(mac);
		result.append(", ip: ");
		result.append(ip);
		result.append(')');
		return result.toString();
	}

} //NetworkNodeImpl

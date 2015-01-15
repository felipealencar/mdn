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
 *   <li>{@link mdn.impl.SwitchImpl#getSwitch <em>Switch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwitchImpl extends NetworkNodeImpl implements Switch
{
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
   * The cached value of the '{@link #getSwitch() <em>Switch</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSwitch()
   * @generated
   * @ordered
   */
  protected EList<Switch> switch_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SwitchImpl()
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
    return MdnPackage.Literals.SWITCH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPorts()
  {
    return ports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPorts(int newPorts)
  {
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
  public EList<Controller> getSwitchController()
  {
    if (switchController == null)
    {
      switchController = new EObjectResolvingEList<Controller>(Controller.class, this, MdnPackage.SWITCH__SWITCH_CONTROLLER);
    }
    return switchController;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Switch> getSwitch()
  {
    if (switch_ == null)
    {
      switch_ = new EObjectResolvingEList<Switch>(Switch.class, this, MdnPackage.SWITCH__SWITCH);
    }
    return switch_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MdnPackage.SWITCH__PORTS:
        return getPorts();
      case MdnPackage.SWITCH__SWITCH_CONTROLLER:
        return getSwitchController();
      case MdnPackage.SWITCH__SWITCH:
        return getSwitch();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MdnPackage.SWITCH__PORTS:
        setPorts((Integer)newValue);
        return;
      case MdnPackage.SWITCH__SWITCH_CONTROLLER:
        getSwitchController().clear();
        getSwitchController().addAll((Collection<? extends Controller>)newValue);
        return;
      case MdnPackage.SWITCH__SWITCH:
        getSwitch().clear();
        getSwitch().addAll((Collection<? extends Switch>)newValue);
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
    switch (featureID)
    {
      case MdnPackage.SWITCH__PORTS:
        setPorts(PORTS_EDEFAULT);
        return;
      case MdnPackage.SWITCH__SWITCH_CONTROLLER:
        getSwitchController().clear();
        return;
      case MdnPackage.SWITCH__SWITCH:
        getSwitch().clear();
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
    switch (featureID)
    {
      case MdnPackage.SWITCH__PORTS:
        return ports != PORTS_EDEFAULT;
      case MdnPackage.SWITCH__SWITCH_CONTROLLER:
        return switchController != null && !switchController.isEmpty();
      case MdnPackage.SWITCH__SWITCH:
        return switch_ != null && !switch_.isEmpty();
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
    result.append(" (ports: ");
    result.append(ports);
    result.append(')');
    return result.toString();
  }

} //SwitchImpl

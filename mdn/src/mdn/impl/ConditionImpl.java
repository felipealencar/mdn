/**
 */
package mdn.impl;

import mdn.Condition;
import mdn.Conditions;
import mdn.MdnPackage;

import mdn.PacketHeader;
import mdn.Time;
import mdn.Traffic;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mdn.impl.ConditionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link mdn.impl.ConditionImpl#getConditionTime <em>Condition Time</em>}</li>
 *   <li>{@link mdn.impl.ConditionImpl#getConditionTraffic <em>Condition Traffic</em>}</li>
 *   <li>{@link mdn.impl.ConditionImpl#getConditionPacket <em>Condition Packet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionImpl extends RuleObjectImpl implements Condition
{
  /**
   * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected static final Conditions CONDITION_EDEFAULT = Conditions.WHERE;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Conditions condition = CONDITION_EDEFAULT;

  /**
   * The cached value of the '{@link #getConditionTime() <em>Condition Time</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionTime()
   * @generated
   * @ordered
   */
  protected Time conditionTime;

  /**
   * The cached value of the '{@link #getConditionTraffic() <em>Condition Traffic</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionTraffic()
   * @generated
   * @ordered
   */
  protected Traffic conditionTraffic;

  /**
   * The cached value of the '{@link #getConditionPacket() <em>Condition Packet</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionPacket()
   * @generated
   * @ordered
   */
  protected PacketHeader conditionPacket;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionImpl()
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
    return MdnPackage.Literals.CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Conditions getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(Conditions newCondition)
  {
    Conditions oldCondition = condition;
    condition = newCondition == null ? CONDITION_EDEFAULT : newCondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.CONDITION__CONDITION, oldCondition, condition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Time getConditionTime()
  {
    if (conditionTime != null && conditionTime.eIsProxy())
    {
      InternalEObject oldConditionTime = (InternalEObject)conditionTime;
      conditionTime = (Time)eResolveProxy(oldConditionTime);
      if (conditionTime != oldConditionTime)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MdnPackage.CONDITION__CONDITION_TIME, oldConditionTime, conditionTime));
      }
    }
    return conditionTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Time basicGetConditionTime()
  {
    return conditionTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConditionTime(Time newConditionTime)
  {
    Time oldConditionTime = conditionTime;
    conditionTime = newConditionTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.CONDITION__CONDITION_TIME, oldConditionTime, conditionTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Traffic getConditionTraffic()
  {
    if (conditionTraffic != null && conditionTraffic.eIsProxy())
    {
      InternalEObject oldConditionTraffic = (InternalEObject)conditionTraffic;
      conditionTraffic = (Traffic)eResolveProxy(oldConditionTraffic);
      if (conditionTraffic != oldConditionTraffic)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MdnPackage.CONDITION__CONDITION_TRAFFIC, oldConditionTraffic, conditionTraffic));
      }
    }
    return conditionTraffic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Traffic basicGetConditionTraffic()
  {
    return conditionTraffic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConditionTraffic(Traffic newConditionTraffic)
  {
    Traffic oldConditionTraffic = conditionTraffic;
    conditionTraffic = newConditionTraffic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.CONDITION__CONDITION_TRAFFIC, oldConditionTraffic, conditionTraffic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PacketHeader getConditionPacket()
  {
    if (conditionPacket != null && conditionPacket.eIsProxy())
    {
      InternalEObject oldConditionPacket = (InternalEObject)conditionPacket;
      conditionPacket = (PacketHeader)eResolveProxy(oldConditionPacket);
      if (conditionPacket != oldConditionPacket)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MdnPackage.CONDITION__CONDITION_PACKET, oldConditionPacket, conditionPacket));
      }
    }
    return conditionPacket;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PacketHeader basicGetConditionPacket()
  {
    return conditionPacket;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConditionPacket(PacketHeader newConditionPacket)
  {
    PacketHeader oldConditionPacket = conditionPacket;
    conditionPacket = newConditionPacket;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.CONDITION__CONDITION_PACKET, oldConditionPacket, conditionPacket));
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
      case MdnPackage.CONDITION__CONDITION:
        return getCondition();
      case MdnPackage.CONDITION__CONDITION_TIME:
        if (resolve) return getConditionTime();
        return basicGetConditionTime();
      case MdnPackage.CONDITION__CONDITION_TRAFFIC:
        if (resolve) return getConditionTraffic();
        return basicGetConditionTraffic();
      case MdnPackage.CONDITION__CONDITION_PACKET:
        if (resolve) return getConditionPacket();
        return basicGetConditionPacket();
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
    switch (featureID)
    {
      case MdnPackage.CONDITION__CONDITION:
        setCondition((Conditions)newValue);
        return;
      case MdnPackage.CONDITION__CONDITION_TIME:
        setConditionTime((Time)newValue);
        return;
      case MdnPackage.CONDITION__CONDITION_TRAFFIC:
        setConditionTraffic((Traffic)newValue);
        return;
      case MdnPackage.CONDITION__CONDITION_PACKET:
        setConditionPacket((PacketHeader)newValue);
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
      case MdnPackage.CONDITION__CONDITION:
        setCondition(CONDITION_EDEFAULT);
        return;
      case MdnPackage.CONDITION__CONDITION_TIME:
        setConditionTime((Time)null);
        return;
      case MdnPackage.CONDITION__CONDITION_TRAFFIC:
        setConditionTraffic((Traffic)null);
        return;
      case MdnPackage.CONDITION__CONDITION_PACKET:
        setConditionPacket((PacketHeader)null);
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
      case MdnPackage.CONDITION__CONDITION:
        return condition != CONDITION_EDEFAULT;
      case MdnPackage.CONDITION__CONDITION_TIME:
        return conditionTime != null;
      case MdnPackage.CONDITION__CONDITION_TRAFFIC:
        return conditionTraffic != null;
      case MdnPackage.CONDITION__CONDITION_PACKET:
        return conditionPacket != null;
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
    result.append(" (condition: ");
    result.append(condition);
    result.append(')');
    return result.toString();
  }

} //ConditionImpl

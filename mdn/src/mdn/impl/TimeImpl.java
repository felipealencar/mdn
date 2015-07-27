/**
 */
package mdn.impl;

import java.util.Date;

import mdn.MdnPackage;
import mdn.RelationalOperators;
import mdn.Time;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mdn.impl.TimeImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link mdn.impl.TimeImpl#getBeginDate <em>Begin Date</em>}</li>
 *   <li>{@link mdn.impl.TimeImpl#getEndDate <em>End Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeImpl extends RuleObjectImpl implements Time
{
  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final RelationalOperators OPERATOR_EDEFAULT = RelationalOperators.EQUAL_TO;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected RelationalOperators operator = OPERATOR_EDEFAULT;

  /**
   * The default value of the '{@link #getBeginDate() <em>Begin Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBeginDate()
   * @generated
   * @ordered
   */
  protected static final Date BEGIN_DATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBeginDate() <em>Begin Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBeginDate()
   * @generated
   * @ordered
   */
  protected Date beginDate = BEGIN_DATE_EDEFAULT;

  /**
   * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndDate()
   * @generated
   * @ordered
   */
  protected static final Date END_DATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndDate()
   * @generated
   * @ordered
   */
  protected Date endDate = END_DATE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimeImpl()
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
    return MdnPackage.Literals.TIME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Date getBeginDate()
  {
    return beginDate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBeginDate(Date newBeginDate)
  {
    Date oldBeginDate = beginDate;
    beginDate = newBeginDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.TIME__BEGIN_DATE, oldBeginDate, beginDate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Date getEndDate()
  {
    return endDate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndDate(Date newEndDate)
  {
    Date oldEndDate = endDate;
    endDate = newEndDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.TIME__END_DATE, oldEndDate, endDate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationalOperators getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(RelationalOperators newOperator)
  {
    RelationalOperators oldOperator = operator;
    operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.TIME__OPERATOR, oldOperator, operator));
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
      case MdnPackage.TIME__OPERATOR:
        return getOperator();
      case MdnPackage.TIME__BEGIN_DATE:
        return getBeginDate();
      case MdnPackage.TIME__END_DATE:
        return getEndDate();
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
      case MdnPackage.TIME__OPERATOR:
        setOperator((RelationalOperators)newValue);
        return;
      case MdnPackage.TIME__BEGIN_DATE:
        setBeginDate((Date)newValue);
        return;
      case MdnPackage.TIME__END_DATE:
        setEndDate((Date)newValue);
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
      case MdnPackage.TIME__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case MdnPackage.TIME__BEGIN_DATE:
        setBeginDate(BEGIN_DATE_EDEFAULT);
        return;
      case MdnPackage.TIME__END_DATE:
        setEndDate(END_DATE_EDEFAULT);
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
      case MdnPackage.TIME__OPERATOR:
        return operator != OPERATOR_EDEFAULT;
      case MdnPackage.TIME__BEGIN_DATE:
        return BEGIN_DATE_EDEFAULT == null ? beginDate != null : !BEGIN_DATE_EDEFAULT.equals(beginDate);
      case MdnPackage.TIME__END_DATE:
        return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
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
    result.append(" (operator: ");
    result.append(operator);
    result.append(", beginDate: ");
    result.append(beginDate);
    result.append(", endDate: ");
    result.append(endDate);
    result.append(')');
    return result.toString();
  }

} //TimeImpl

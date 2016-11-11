/**
 */
package mdn.impl;

import mdn.MdnPackage;
import mdn.RelationalOperators;
import mdn.Traffic;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traffic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mdn.impl.TrafficImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link mdn.impl.TrafficImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link mdn.impl.TrafficImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrafficImpl extends RuleObjectImpl implements Traffic
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
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
  protected static final String UNIT_EDEFAULT = "MB";

  /**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
  protected String unit = UNIT_EDEFAULT;

  /**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
  protected static final int VALUE_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
  protected int value = VALUE_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TrafficImpl()
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
		return MdnPackage.Literals.TRAFFIC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.TRAFFIC__OPERATOR, oldOperator, operator));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getUnit()
  {
		return unit;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setUnit(String newUnit)
  {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.TRAFFIC__UNIT, oldUnit, unit));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getValue()
  {
		return value;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setValue(int newValue)
  {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.TRAFFIC__VALUE, oldValue, value));
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
			case MdnPackage.TRAFFIC__OPERATOR:
				return getOperator();
			case MdnPackage.TRAFFIC__UNIT:
				return getUnit();
			case MdnPackage.TRAFFIC__VALUE:
				return getValue();
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
			case MdnPackage.TRAFFIC__OPERATOR:
				setOperator((RelationalOperators)newValue);
				return;
			case MdnPackage.TRAFFIC__UNIT:
				setUnit((String)newValue);
				return;
			case MdnPackage.TRAFFIC__VALUE:
				setValue((Integer)newValue);
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
			case MdnPackage.TRAFFIC__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case MdnPackage.TRAFFIC__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case MdnPackage.TRAFFIC__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case MdnPackage.TRAFFIC__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case MdnPackage.TRAFFIC__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
			case MdnPackage.TRAFFIC__VALUE:
				return value != VALUE_EDEFAULT;
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
		result.append(", unit: ");
		result.append(unit);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //TrafficImpl

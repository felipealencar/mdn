/**
 */
package mdn.impl;

import java.util.Collection;

import mdn.MdnPackage;
import mdn.PacketHeader;
import mdn.PacketHeaders;

import mdn.RelationalOperators;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Packet Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mdn.impl.PacketHeaderImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link mdn.impl.PacketHeaderImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link mdn.impl.PacketHeaderImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PacketHeaderImpl extends RuleObjectImpl implements PacketHeader
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
   * The default value of the '{@link #getHeader() <em>Header</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeader()
   * @generated
   * @ordered
   */
  protected static final PacketHeaders HEADER_EDEFAULT = PacketHeaders.IN_PORT;

  /**
   * The cached value of the '{@link #getHeader() <em>Header</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeader()
   * @generated
   * @ordered
   */
  protected PacketHeaders header = HEADER_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PacketHeaderImpl()
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
    return MdnPackage.Literals.PACKET_HEADER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.PACKET_HEADER__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PacketHeaders getHeader()
  {
    return header;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeader(PacketHeaders newHeader)
  {
    PacketHeaders oldHeader = header;
    header = newHeader == null ? HEADER_EDEFAULT : newHeader;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.PACKET_HEADER__HEADER, oldHeader, header));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.PACKET_HEADER__VALUE, oldValue, value));
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
      case MdnPackage.PACKET_HEADER__OPERATOR:
        return getOperator();
      case MdnPackage.PACKET_HEADER__HEADER:
        return getHeader();
      case MdnPackage.PACKET_HEADER__VALUE:
        return getValue();
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
      case MdnPackage.PACKET_HEADER__OPERATOR:
        setOperator((RelationalOperators)newValue);
        return;
      case MdnPackage.PACKET_HEADER__HEADER:
        setHeader((PacketHeaders)newValue);
        return;
      case MdnPackage.PACKET_HEADER__VALUE:
        setValue((String)newValue);
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
      case MdnPackage.PACKET_HEADER__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case MdnPackage.PACKET_HEADER__HEADER:
        setHeader(HEADER_EDEFAULT);
        return;
      case MdnPackage.PACKET_HEADER__VALUE:
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
    switch (featureID)
    {
      case MdnPackage.PACKET_HEADER__OPERATOR:
        return operator != OPERATOR_EDEFAULT;
      case MdnPackage.PACKET_HEADER__HEADER:
        return header != HEADER_EDEFAULT;
      case MdnPackage.PACKET_HEADER__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
    result.append(", header: ");
    result.append(header);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //PacketHeaderImpl

/**
 */
package mdn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traffic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mdn.Traffic#getOperator <em>Operator</em>}</li>
 *   <li>{@link mdn.Traffic#getUnit <em>Unit</em>}</li>
 *   <li>{@link mdn.Traffic#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see mdn.MdnPackage#getTraffic()
 * @model annotation="gmf.node figure='figures.TrafficFigure' label='operator,value,unit' label.pattern='{0}: {2}{1}' label.icon='false' tool.small.bundle='mdn.edit' tool.small.path='/icons/full/obj16/traffic.gif' label.placement='external'"
 * @generated
 */
public interface Traffic extends RuleObject
{
  /**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link mdn.RelationalOperators}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see mdn.RelationalOperators
	 * @see #setOperator(RelationalOperators)
	 * @see mdn.MdnPackage#getTraffic_Operator()
	 * @model
	 * @generated
	 */
  RelationalOperators getOperator();

  /**
	 * Sets the value of the '{@link mdn.Traffic#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see mdn.RelationalOperators
	 * @see #getOperator()
	 * @generated
	 */
  void setOperator(RelationalOperators value);

  /**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The default value is <code>"MB"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see mdn.MdnPackage#getTraffic_Unit()
	 * @model default="MB"
	 * @generated
	 */
  String getUnit();

  /**
	 * Sets the value of the '{@link mdn.Traffic#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
  void setUnit(String value);

  /**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see mdn.MdnPackage#getTraffic_Value()
	 * @model
	 * @generated
	 */
  int getValue();

  /**
	 * Sets the value of the '{@link mdn.Traffic#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
  void setValue(int value);

} // Traffic

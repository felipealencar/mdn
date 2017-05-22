/**
 */
package mdn;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mdn.Time#getOperator <em>Operator</em>}</li>
 *   <li>{@link mdn.Time#getBeginDate <em>Begin Date</em>}</li>
 *   <li>{@link mdn.Time#getEndDate <em>End Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see mdn.MdnPackage#getTime()
 * @model annotation="gmf.node figure='TimeFigure' label.icon='false' tool.small.bundle='mdn.edit' tool.small.path='/icons/full/obj16/time.gif' label.placement='external' label='operator,beginDate,endDate' label.pattern='{0}: {1} - {2}'"
 * @generated
 */
public interface Time extends AppObject {
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
	 * @see mdn.MdnPackage#getTime_Operator()
	 * @model
	 * @generated
	 */
	RelationalOperators getOperator();

	/**
	 * Sets the value of the '{@link mdn.Time#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see mdn.RelationalOperators
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(RelationalOperators value);

	/**
	 * Returns the value of the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Begin Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin Date</em>' attribute.
	 * @see #setBeginDate(Date)
	 * @see mdn.MdnPackage#getTime_BeginDate()
	 * @model
	 * @generated
	 */
	Date getBeginDate();

	/**
	 * Sets the value of the '{@link mdn.Time#getBeginDate <em>Begin Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin Date</em>' attribute.
	 * @see #getBeginDate()
	 * @generated
	 */
	void setBeginDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see mdn.MdnPackage#getTime_EndDate()
	 * @model
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link mdn.Time#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

} // Time

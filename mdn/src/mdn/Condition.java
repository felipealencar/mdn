/**
 */
package mdn;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mdn.Condition#getCondition <em>Condition</em>}</li>
 *   <li>{@link mdn.Condition#getConditionTime <em>Condition Time</em>}</li>
 *   <li>{@link mdn.Condition#getConditionTraffic <em>Condition Traffic</em>}</li>
 *   <li>{@link mdn.Condition#getConditionPacket <em>Condition Packet</em>}</li>
 * </ul>
 * </p>
 *
 * @see mdn.MdnPackage#getCondition()
 * @model annotation="gmf.node label='condition' label.icon='false' tool.small.bundle='mdn.edit' tool.small.path='/icons/full/obj16/condition.gif' label.placement='external' figure='figures.ConditionFigure'"
 * @generated
 */
public interface Condition extends RuleObject
{
  /**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * The default value is <code>"WHERE"</code>.
	 * The literals are from the enumeration {@link mdn.Conditions}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see mdn.Conditions
	 * @see #setCondition(Conditions)
	 * @see mdn.MdnPackage#getCondition_Condition()
	 * @model default="WHERE"
	 * @generated
	 */
  Conditions getCondition();

  /**
	 * Sets the value of the '{@link mdn.Condition#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see mdn.Conditions
	 * @see #getCondition()
	 * @generated
	 */
  void setCondition(Conditions value);

  /**
	 * Returns the value of the '<em><b>Condition Time</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition Time</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Time</em>' reference.
	 * @see #setConditionTime(Time)
	 * @see mdn.MdnPackage#getCondition_ConditionTime()
	 * @model annotation="gmf.link target.decoration='none' source.decoration='none' style='dash' color='0,0,0'"
	 * @generated
	 */
  Time getConditionTime();

  /**
	 * Sets the value of the '{@link mdn.Condition#getConditionTime <em>Condition Time</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Time</em>' reference.
	 * @see #getConditionTime()
	 * @generated
	 */
  void setConditionTime(Time value);

  /**
	 * Returns the value of the '<em><b>Condition Traffic</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition Traffic</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Traffic</em>' reference.
	 * @see #setConditionTraffic(Traffic)
	 * @see mdn.MdnPackage#getCondition_ConditionTraffic()
	 * @model annotation="gmf.link target.decoration='none' source.decoration='none' style='dash' color='0,0,0'"
	 * @generated
	 */
  Traffic getConditionTraffic();

  /**
	 * Sets the value of the '{@link mdn.Condition#getConditionTraffic <em>Condition Traffic</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Traffic</em>' reference.
	 * @see #getConditionTraffic()
	 * @generated
	 */
  void setConditionTraffic(Traffic value);

  /**
	 * Returns the value of the '<em><b>Condition Packet</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition Packet</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Packet</em>' reference.
	 * @see #setConditionPacket(PacketHeader)
	 * @see mdn.MdnPackage#getCondition_ConditionPacket()
	 * @model annotation="gmf.link target.decoration='none' source.decoration='none' style='dash' color='0,0,0'"
	 * @generated
	 */
  PacketHeader getConditionPacket();

  /**
	 * Sets the value of the '{@link mdn.Condition#getConditionPacket <em>Condition Packet</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Packet</em>' reference.
	 * @see #getConditionPacket()
	 * @generated
	 */
  void setConditionPacket(PacketHeader value);

} // Condition

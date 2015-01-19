/**
 */
package mdn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packet Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mdn.PacketHeader#getOperator <em>Operator</em>}</li>
 *   <li>{@link mdn.PacketHeader#getHeader <em>Header</em>}</li>
 *   <li>{@link mdn.PacketHeader#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see mdn.MdnPackage#getPacketHeader()
 * @model annotation="gmf.node figure='figures.PacketHeaderFigure' label.icon='false' tool.small.bundle='mdn.edit' tool.small.path='/icons/full/obj16/packetheader.gif' label.placement='external' label='operator,header,value' label.pattern='{0}: [{1}] {2}'"
 * @generated
 */
public interface PacketHeader extends PolicyObject
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
   * @see mdn.MdnPackage#getPacketHeader_Operator()
   * @model
   * @generated
   */
  RelationalOperators getOperator();

  /**
   * Sets the value of the '{@link mdn.PacketHeader#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see mdn.RelationalOperators
   * @see #getOperator()
   * @generated
   */
  void setOperator(RelationalOperators value);

  /**
   * Returns the value of the '<em><b>Header</b></em>' attribute.
   * The default value is <code>""</code>.
   * The literals are from the enumeration {@link mdn.PacketHeaders}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Header</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Header</em>' attribute.
   * @see mdn.PacketHeaders
   * @see #setHeader(PacketHeaders)
   * @see mdn.MdnPackage#getPacketHeader_Header()
   * @model default=""
   * @generated
   */
  PacketHeaders getHeader();

  /**
   * Sets the value of the '{@link mdn.PacketHeader#getHeader <em>Header</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Header</em>' attribute.
   * @see mdn.PacketHeaders
   * @see #getHeader()
   * @generated
   */
  void setHeader(PacketHeaders value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see mdn.MdnPackage#getPacketHeader_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link mdn.PacketHeader#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // PacketHeader

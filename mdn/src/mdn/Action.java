/**
 */
package mdn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mdn.Action#getType <em>Type</em>}</li>
 *   <li>{@link mdn.Action#getActionPacketHeader <em>Action Packet Header</em>}</li>
 *   <li>{@link mdn.Action#getActionForwardToNode <em>Action Forward To Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see mdn.MdnPackage#getAction()
 * @model annotation="gmf.node figure='figures.ActionFigure' label='type' label.icon='false' tool.small.bundle='mdn.edit' tool.small.path='/icons/full/obj16/action.gif' label.placement='external'"
 * @generated
 */
public interface Action extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link mdn.Actions}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see mdn.Actions
   * @see #setType(Actions)
   * @see mdn.MdnPackage#getAction_Type()
   * @model
   * @generated
   */
  Actions getType();

  /**
   * Sets the value of the '{@link mdn.Action#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see mdn.Actions
   * @see #getType()
   * @generated
   */
  void setType(Actions value);

  /**
   * Returns the value of the '<em><b>Action Packet Header</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action Packet Header</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action Packet Header</em>' reference.
   * @see #setActionPacketHeader(PacketHeader)
   * @see mdn.MdnPackage#getAction_ActionPacketHeader()
   * @model annotation="gmf.link target.decoration='arrow' source.decoration='none' style='dash' color='0,0,0'"
   * @generated
   */
  PacketHeader getActionPacketHeader();

  /**
   * Sets the value of the '{@link mdn.Action#getActionPacketHeader <em>Action Packet Header</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action Packet Header</em>' reference.
   * @see #getActionPacketHeader()
   * @generated
   */
  void setActionPacketHeader(PacketHeader value);

  /**
   * Returns the value of the '<em><b>Action Forward To Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action Forward To Node</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action Forward To Node</em>' reference.
   * @see #setActionForwardToNode(NetworkNode)
   * @see mdn.MdnPackage#getAction_ActionForwardToNode()
   * @model annotation="gmf.link target.decoration='arrow' source.decoration='none' style='dash' color='0,0,0'"
   * @generated
   */
  NetworkNode getActionForwardToNode();

  /**
   * Sets the value of the '{@link mdn.Action#getActionForwardToNode <em>Action Forward To Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action Forward To Node</em>' reference.
   * @see #getActionForwardToNode()
   * @generated
   */
  void setActionForwardToNode(NetworkNode value);

} // Action

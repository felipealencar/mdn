/**
 */
package mdn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mdn.Switch#getPorts <em>Ports</em>}</li>
 *   <li>{@link mdn.Switch#getSwitchController <em>Switch Controller</em>}</li>
 *   <li>{@link mdn.Switch#getSwitch <em>Switch</em>}</li>
 * </ul>
 * </p>
 *
 * @see mdn.MdnPackage#getSwitch()
 * @model annotation="gmf.node label='name' label.icon='false' tool.small.bundle='mdn.edit' tool.small.path='/icons/full/obj16/switch.gif' figure='figures.SwitchFigure' label.placement='external'"
 * @generated
 */
public interface Switch extends NetworkNode
{
  /**
   * Returns the value of the '<em><b>Ports</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ports</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ports</em>' attribute.
   * @see #setPorts(int)
   * @see mdn.MdnPackage#getSwitch_Ports()
   * @model
   * @generated
   */
  int getPorts();

  /**
   * Sets the value of the '{@link mdn.Switch#getPorts <em>Ports</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ports</em>' attribute.
   * @see #getPorts()
   * @generated
   */
  void setPorts(int value);

  /**
   * Returns the value of the '<em><b>Switch Controller</b></em>' reference list.
   * The list contents are of type {@link mdn.Controller}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Switch Controller</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Switch Controller</em>' reference list.
   * @see mdn.MdnPackage#getSwitch_SwitchController()
   * @model annotation="gmf.link target.decoration='none' source.decoration='none' style='solid' color='0,0,0'"
   * @generated
   */
  EList<Controller> getSwitchController();

  /**
   * Returns the value of the '<em><b>Switch</b></em>' reference list.
   * The list contents are of type {@link mdn.Switch}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Switch</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Switch</em>' reference list.
   * @see mdn.MdnPackage#getSwitch_Switch()
   * @model annotation="gmf.link target.decoration='none' source.decoration='none' style='solid' color='0,0,0'"
   * @generated
   */
  EList<Switch> getSwitch();

} // Switch

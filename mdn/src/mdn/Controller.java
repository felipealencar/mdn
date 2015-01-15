/**
 */
package mdn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mdn.Controller#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see mdn.MdnPackage#getController()
 * @model annotation="gmf.node figure='figures.ControllerFigure' label='name' label.icon='false' tool.small.bundle='mdn.edit' tool.small.path='/icons/full/obj16/controller.gif' label.placement='external'"
 * @generated
 */
public interface Controller extends NetworkNode
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see mdn.MdnPackage#getController_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link mdn.Controller#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

} // Controller

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
 *   <li>{@link mdn.Switch#getSwitches <em>Switches</em>}</li>
 *   <li>{@link mdn.Switch#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see mdn.MdnPackage#getSwitch()
 * @model annotation="gmf.node label='name' label.icon='false' tool.small.bundle='mdn.edit' tool.small.path='/icons/full/obj16/switch.gif' figure='SwitchFigure' label.placement='external'"
 * @generated
 */
public interface Switch extends NetworkNode {
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
	 * Returns the value of the '<em><b>Switches</b></em>' reference list.
	 * The list contents are of type {@link mdn.Switch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switches</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switches</em>' reference list.
	 * @see mdn.MdnPackage#getSwitch_Switches()
	 * @model annotation="gmf.link target.decoration='none' source.decoration='none' style='solid' color='0,0,0' switches.constraint='self <> oppositeEnd' source.constraint='self <> oppositeEnd'"
	 * @generated
	 */
	EList<Switch> getSwitches();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see mdn.MdnPackage#getSwitch_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link mdn.Switch#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // Switch

/**
 */
package mdn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Host</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mdn.Host#getHostSwitch <em>Host Switch</em>}</li>
 * </ul>
 * </p>
 *
 * @see mdn.MdnPackage#getHost()
 * @model annotation="gmf.node label='name' label.icon='false' tool.small.bundle='mdn.edit' tool.small.path='/icons/full/obj16/host.gif' figure='figures.HostFigure' label.placement='external'"
 * @generated
 */
public interface Host extends NetworkNode
{
  /**
	 * Returns the value of the '<em><b>Host Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Host Switch</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Switch</em>' reference.
	 * @see #setHostSwitch(Switch)
	 * @see mdn.MdnPackage#getHost_HostSwitch()
	 * @model annotation="gmf.link target.decoration='none' source.decoration='none' style='solid' color='0,0,0'"
	 * @generated
	 */
  Switch getHostSwitch();

  /**
	 * Sets the value of the '{@link mdn.Host#getHostSwitch <em>Host Switch</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Switch</em>' reference.
	 * @see #getHostSwitch()
	 * @generated
	 */
  void setHostSwitch(Switch value);

} // Host

/**
 */
package mdn;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mdn.App#getActionPacketHeader <em>Action Packet Header</em>}</li>
 *   <li>{@link mdn.App#getAppToNetworkNode <em>App To Network Node</em>}</li>
 *   <li>{@link mdn.App#getControllerApp <em>Controller App</em>}</li>
 *   <li>{@link mdn.App#getAppRule <em>App Rule</em>}</li>
 *   <li>{@link mdn.App#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see mdn.MdnPackage#getApp()
 * @model annotation="gmf.node figure='ActionFigure' label='name' label.icon='false' tool.small.bundle='mdn.edit' tool.small.path='/icons/full/obj16/action.gif' label.placement='external'"
 * @generated
 */
public interface App extends EObject {
	/**
	 * Returns the value of the '<em><b>Action Packet Header</b></em>' reference list.
	 * The list contents are of type {@link mdn.PacketHeader}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Packet Header</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Packet Header</em>' reference list.
	 * @see mdn.MdnPackage#getApp_ActionPacketHeader()
	 * @model annotation="gmf.link target.decoration='arrow' source.decoration='none' style='dash' color='0,0,0'"
	 * @generated
	 */
	EList<PacketHeader> getActionPacketHeader();

	/**
	 * Returns the value of the '<em><b>App To Network Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App To Network Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App To Network Node</em>' reference.
	 * @see #setAppToNetworkNode(NetworkNode)
	 * @see mdn.MdnPackage#getApp_AppToNetworkNode()
	 * @model annotation="gmf.link target.decoration='arrow' source.decoration='none' style='dash' color='0,0,0'"
	 * @generated
	 */
	NetworkNode getAppToNetworkNode();

	/**
	 * Sets the value of the '{@link mdn.App#getAppToNetworkNode <em>App To Network Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App To Network Node</em>' reference.
	 * @see #getAppToNetworkNode()
	 * @generated
	 */
	void setAppToNetworkNode(NetworkNode value);

	/**
	 * Returns the value of the '<em><b>Controller App</b></em>' reference list.
	 * The list contents are of type {@link mdn.Controller}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller App</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller App</em>' reference list.
	 * @see mdn.MdnPackage#getApp_ControllerApp()
	 * @model annotation="gmf.link target.decoration='arrow' source.decoration='none' style='dash' color='0,0,0'"
	 * @generated
	 */
	EList<Controller> getControllerApp();

	/**
	 * Returns the value of the '<em><b>App Rule</b></em>' reference list.
	 * The list contents are of type {@link mdn.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App Rule</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App Rule</em>' reference list.
	 * @see mdn.MdnPackage#getApp_AppRule()
	 * @model transient="true"
	 *        annotation="gmf.link target.decoration='arrow' source.decoration='none' style='dash' color='0,0,0'"
	 * @generated
	 */
	EList<Rule> getAppRule();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"App"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mdn.MdnPackage#getApp_Name()
	 * @model default="App"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mdn.App#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // App

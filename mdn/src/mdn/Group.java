/**
 */
package mdn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mdn.Group#getHostsGroup <em>Hosts Group</em>}</li>
 *   <li>{@link mdn.Group#getIp <em>Ip</em>}</li>
 *   <li>{@link mdn.Group#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see mdn.MdnPackage#getGroup()
 * @model annotation="gmf.node label='name' label.icon='false' tool.small.bundle='mdn.edit' label.placement='external'"
 * @generated
 */
public interface Group extends EObject
{
  /**
	 * Returns the value of the '<em><b>Hosts Group</b></em>' containment reference list.
	 * The list contents are of type {@link mdn.Host}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hosts Group</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosts Group</em>' containment reference list.
	 * @see mdn.MdnPackage#getGroup_HostsGroup()
	 * @model containment="true"
	 * @generated
	 */
  EList<Host> getHostsGroup();

  /**
	 * Returns the value of the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ip</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip</em>' attribute.
	 * @see #setIp(String)
	 * @see mdn.MdnPackage#getGroup_Ip()
	 * @model
	 * @generated
	 */
  String getIp();

  /**
	 * Sets the value of the '{@link mdn.Group#getIp <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip</em>' attribute.
	 * @see #getIp()
	 * @generated
	 */
  void setIp(String value);

  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mdn.MdnPackage#getGroup_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link mdn.Group#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

} // Group

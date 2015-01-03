/**
 */
package mdn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sdn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mdn.Sdn#getNodes <em>Nodes</em>}</li>
 *   <li>{@link mdn.Sdn#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see mdn.MdnPackage#getSdn()
 * @model
 * @generated
 */
public interface Sdn extends EObject
{
  /**
   * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
   * The list contents are of type {@link mdn.NetworkNode}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nodes</em>' containment reference list.
   * @see mdn.MdnPackage#getSdn_Nodes()
   * @model containment="true"
   * @generated
   */
  EList<NetworkNode> getNodes();

  /**
   * Returns the value of the '<em><b>Links</b></em>' containment reference list.
   * The list contents are of type {@link mdn.NetworkLink}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Links</em>' containment reference list.
   * @see mdn.MdnPackage#getSdn_Links()
   * @model containment="true"
   * @generated
   */
  EList<NetworkLink> getLinks();

} // Sdn

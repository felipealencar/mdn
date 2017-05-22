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
 *   <li>{@link mdn.Sdn#getApps <em>Apps</em>}</li>
 *   <li>{@link mdn.Sdn#getRuleObjects <em>Rule Objects</em>}</li>
 *   <li>{@link mdn.Sdn#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see mdn.MdnPackage#getSdn()
 * @model annotation="gmf.diagram foo='bar' onefile='true' rcp='true' diagram.extension='mdn'"
 * @generated
 */
public interface Sdn extends EObject {
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
	 * Returns the value of the '<em><b>Apps</b></em>' containment reference list.
	 * The list contents are of type {@link mdn.App}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apps</em>' containment reference list.
	 * @see mdn.MdnPackage#getSdn_Apps()
	 * @model containment="true"
	 * @generated
	 */
	EList<App> getApps();

	/**
	 * Returns the value of the '<em><b>Rule Objects</b></em>' containment reference list.
	 * The list contents are of type {@link mdn.AppObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Objects</em>' containment reference list.
	 * @see mdn.MdnPackage#getSdn_RuleObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<AppObject> getRuleObjects();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link mdn.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see mdn.MdnPackage#getSdn_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroups();

} // Sdn

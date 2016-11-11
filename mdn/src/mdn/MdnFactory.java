/**
 */
package mdn;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mdn.MdnPackage
 * @generated
 */
public interface MdnFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  MdnFactory eINSTANCE = mdn.impl.MdnFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Sdn</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sdn</em>'.
	 * @generated
	 */
  Sdn createSdn();

  /**
	 * Returns a new object of class '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Controller</em>'.
	 * @generated
	 */
  Controller createController();

  /**
	 * Returns a new object of class '<em>Host</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Host</em>'.
	 * @generated
	 */
  Host createHost();

  /**
	 * Returns a new object of class '<em>Switch</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch</em>'.
	 * @generated
	 */
  Switch createSwitch();

  /**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
  Rule createRule();

  /**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
  Action createAction();

  /**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
  Condition createCondition();

  /**
	 * Returns a new object of class '<em>Traffic</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traffic</em>'.
	 * @generated
	 */
  Traffic createTraffic();

  /**
	 * Returns a new object of class '<em>Time</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time</em>'.
	 * @generated
	 */
  Time createTime();

  /**
	 * Returns a new object of class '<em>Packet Header</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Packet Header</em>'.
	 * @generated
	 */
  PacketHeader createPacketHeader();

  /**
	 * Returns a new object of class '<em>Group</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group</em>'.
	 * @generated
	 */
  Group createGroup();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  MdnPackage getMdnPackage();

} //MdnFactory

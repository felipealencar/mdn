/**
 */
package mdn.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mdn.MdnFactory;
import mdn.NetworkLink;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Network Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkLinkTest extends TestCase
{

  /**
   * The fixture for this Network Link test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NetworkLink fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(NetworkLinkTest.class);
  }

  /**
   * Constructs a new Network Link test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetworkLinkTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Network Link test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(NetworkLink fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Network Link test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NetworkLink getFixture()
  {
    return fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception
  {
    setFixture(MdnFactory.eINSTANCE.createNetworkLink());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#tearDown()
   * @generated
   */
  @Override
  protected void tearDown() throws Exception
  {
    setFixture(null);
  }

} //NetworkLinkTest

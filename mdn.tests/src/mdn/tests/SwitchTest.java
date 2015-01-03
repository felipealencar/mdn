/**
 */
package mdn.tests;

import junit.textui.TestRunner;

import mdn.MdnFactory;
import mdn.Switch;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SwitchTest extends NetworkNodeTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(SwitchTest.class);
  }

  /**
   * Constructs a new Switch test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Switch test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Switch getFixture()
  {
    return (Switch)fixture;
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
    setFixture(MdnFactory.eINSTANCE.createSwitch());
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

} //SwitchTest

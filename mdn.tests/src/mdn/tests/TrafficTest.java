/**
 */
package mdn.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mdn.MdnFactory;
import mdn.Traffic;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Traffic</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrafficTest extends PolicyObjectTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(TrafficTest.class);
  }

  /**
   * Constructs a new Traffic test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrafficTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Traffic test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Traffic getFixture()
  {
    return (Traffic)fixture;
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
    setFixture(MdnFactory.eINSTANCE.createTraffic());
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

} //TrafficTest

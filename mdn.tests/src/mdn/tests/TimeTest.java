/**
 */
package mdn.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mdn.MdnFactory;
import mdn.Time;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeTest extends RuleObjectTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(TimeTest.class);
  }

  /**
   * Constructs a new Time test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Time test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Time getFixture()
  {
    return (Time)fixture;
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
    setFixture(MdnFactory.eINSTANCE.createTime());
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

} //TimeTest

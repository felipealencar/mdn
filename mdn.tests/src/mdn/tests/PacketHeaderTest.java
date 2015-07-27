/**
 */
package mdn.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mdn.MdnFactory;
import mdn.PacketHeader;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Packet Header</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PacketHeaderTest extends RuleObjectTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(PacketHeaderTest.class);
  }

  /**
   * Constructs a new Packet Header test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PacketHeaderTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Packet Header test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected PacketHeader getFixture()
  {
    return (PacketHeader)fixture;
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
    setFixture(MdnFactory.eINSTANCE.createPacketHeader());
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

} //PacketHeaderTest

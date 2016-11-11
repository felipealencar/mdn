/**
 */
package mdn.tests;

import junit.textui.TestRunner;

import mdn.Controller;
import mdn.MdnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ControllerTest extends NetworkNodeTest
{

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(ControllerTest.class);
	}

  /**
	 * Constructs a new Controller test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ControllerTest(String name)
  {
		super(name);
	}

  /**
	 * Returns the fixture for this Controller test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected Controller getFixture()
  {
		return (Controller)fixture;
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
		setFixture(MdnFactory.eINSTANCE.createController());
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

} //ControllerTest

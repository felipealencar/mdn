/**
 */
package mdn.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mdn.MdnFactory;
import mdn.OpenFlowSwitch;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Open Flow Switch</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenFlowSwitchTest extends TestCase {

	/**
	 * The fixture for this Open Flow Switch test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenFlowSwitch fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OpenFlowSwitchTest.class);
	}

	/**
	 * Constructs a new Open Flow Switch test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenFlowSwitchTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Open Flow Switch test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(OpenFlowSwitch fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Open Flow Switch test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenFlowSwitch getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MdnFactory.eINSTANCE.createOpenFlowSwitch());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //OpenFlowSwitchTest

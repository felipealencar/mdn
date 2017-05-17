/**
 */
package mdn.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mdn.Flow;
import mdn.MdnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlowTest extends TestCase {

	/**
	 * The fixture for this Flow test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Flow fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FlowTest.class);
	}

	/**
	 * Constructs a new Flow test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Flow test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Flow fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Flow test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Flow getFixture() {
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
		setFixture(MdnFactory.eINSTANCE.createFlow());
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

} //FlowTest

/**
 */
package mdn.tests;

import junit.textui.TestRunner;

import mdn.MdnFactory;
import mdn.Rule;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RuleTest extends AppObjectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RuleTest.class);
	}

	/**
	 * Constructs a new Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Rule getFixture() {
		return (Rule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MdnFactory.eINSTANCE.createRule());
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

} //RuleTest

/**
 */
package mdn.tests;

import junit.textui.TestRunner;

import mdn.Condition;
import mdn.MdnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConditionTest extends AppObjectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConditionTest.class);
	}

	/**
	 * Constructs a new Condition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Condition getFixture() {
		return (Condition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MdnFactory.eINSTANCE.createCondition());
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

} //ConditionTest

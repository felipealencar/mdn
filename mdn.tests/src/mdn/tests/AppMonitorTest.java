/**
 */
package mdn.tests;

import junit.textui.TestRunner;

import mdn.AppMonitor;
import mdn.MdnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>App Monitor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AppMonitorTest extends AppTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AppMonitorTest.class);
	}

	/**
	 * Constructs a new App Monitor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppMonitorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this App Monitor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AppMonitor getFixture() {
		return (AppMonitor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MdnFactory.eINSTANCE.createAppMonitor());
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

} //AppMonitorTest

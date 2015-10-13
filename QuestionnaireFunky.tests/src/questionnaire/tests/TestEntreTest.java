/**
 */
package questionnaire.tests;

import junit.textui.TestRunner;

import questionnaire.QuestionnaireFactory;
import questionnaire.TestEntre;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Test Entre</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestEntreTest extends TestTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TestEntreTest.class);
	}

	/**
	 * Constructs a new Test Entre test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestEntreTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Test Entre test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TestEntre getFixture() {
		return (TestEntre)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuestionnaireFactory.eINSTANCE.createTestEntre());
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

} //TestEntreTest

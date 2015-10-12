/**
 */
package questionnaire.tests;

import junit.textui.TestRunner;

import questionnaire.QuestionnaireFactory;
import questionnaire.TestSuperieur;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Test Superieur</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestSuperieurTest extends TestTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TestSuperieurTest.class);
	}

	/**
	 * Constructs a new Test Superieur test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestSuperieurTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Test Superieur test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TestSuperieur getFixture() {
		return (TestSuperieur)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuestionnaireFactory.eINSTANCE.createTestSuperieur());
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

} //TestSuperieurTest

/**
 */
package questionnaire.tests;

import junit.textui.TestRunner;

import questionnaire.Fin;
import questionnaire.QuestionnaireFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fin</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FinTest extends NextTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FinTest.class);
	}

	/**
	 * Constructs a new Fin test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Fin test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Fin getFixture() {
		return (Fin)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuestionnaireFactory.eINSTANCE.createFin());
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

} //FinTest

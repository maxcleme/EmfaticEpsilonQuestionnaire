/**
 */
package questionnaire.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import questionnaire.Questionnaire;
import questionnaire.QuestionnaireFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuestionnaireTest extends TestCase {

	/**
	 * The fixture for this Questionnaire test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Questionnaire fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QuestionnaireTest.class);
	}

	/**
	 * Constructs a new Questionnaire test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Questionnaire test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Questionnaire fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Questionnaire test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Questionnaire getFixture() {
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
		setFixture(QuestionnaireFactory.eINSTANCE.createQuestionnaire());
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

} //QuestionnaireTest

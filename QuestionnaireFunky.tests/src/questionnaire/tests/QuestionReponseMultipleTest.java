/**
 */
package questionnaire.tests;

import junit.textui.TestRunner;

import questionnaire.QuestionReponseMultiple;
import questionnaire.QuestionnaireFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Question Reponse Multiple</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuestionReponseMultipleTest extends QuestionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QuestionReponseMultipleTest.class);
	}

	/**
	 * Constructs a new Question Reponse Multiple test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionReponseMultipleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Question Reponse Multiple test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected QuestionReponseMultiple getFixture() {
		return (QuestionReponseMultiple)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuestionnaireFactory.eINSTANCE.createQuestionReponseMultiple());
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

} //QuestionReponseMultipleTest

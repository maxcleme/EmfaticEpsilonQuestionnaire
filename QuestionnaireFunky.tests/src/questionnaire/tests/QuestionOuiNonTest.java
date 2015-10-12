/**
 */
package questionnaire.tests;

import junit.textui.TestRunner;

import questionnaire.QuestionOuiNon;
import questionnaire.QuestionnaireFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Question Oui Non</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuestionOuiNonTest extends QuestionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QuestionOuiNonTest.class);
	}

	/**
	 * Constructs a new Question Oui Non test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionOuiNonTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Question Oui Non test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected QuestionOuiNon getFixture() {
		return (QuestionOuiNon)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuestionnaireFactory.eINSTANCE.createQuestionOuiNon());
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

} //QuestionOuiNonTest

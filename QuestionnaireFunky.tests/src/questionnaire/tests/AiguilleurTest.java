/**
 */
package questionnaire.tests;

import junit.textui.TestRunner;

import questionnaire.Aiguilleur;
import questionnaire.QuestionnaireFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Aiguilleur</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AiguilleurTest extends NextTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AiguilleurTest.class);
	}

	/**
	 * Constructs a new Aiguilleur test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AiguilleurTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Aiguilleur test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Aiguilleur getFixture() {
		return (Aiguilleur)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuestionnaireFactory.eINSTANCE.createAiguilleur());
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

} //AiguilleurTest

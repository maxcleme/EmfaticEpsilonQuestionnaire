/**
 */
package questionnaire.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import questionnaire.Debut;
import questionnaire.QuestionnaireFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Debut</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DebutTest extends TestCase {

	/**
	 * The fixture for this Debut test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Debut fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DebutTest.class);
	}

	/**
	 * Constructs a new Debut test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DebutTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Debut test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Debut fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Debut test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Debut getFixture() {
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
		setFixture(QuestionnaireFactory.eINSTANCE.createDebut());
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

} //DebutTest

/**
 */
package questionnaire.tests;

import junit.textui.TestRunner;

import questionnaire.QuestionnaireFactory;
import questionnaire.TypeSaisieAlphaNumerique;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Type Saisie Alpha Numerique</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeSaisieAlphaNumeriqueTest extends TypeSaisieTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TypeSaisieAlphaNumeriqueTest.class);
	}

	/**
	 * Constructs a new Type Saisie Alpha Numerique test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSaisieAlphaNumeriqueTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Type Saisie Alpha Numerique test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TypeSaisieAlphaNumerique getFixture() {
		return (TypeSaisieAlphaNumerique)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuestionnaireFactory.eINSTANCE.createTypeSaisieAlphaNumerique());
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

} //TypeSaisieAlphaNumeriqueTest

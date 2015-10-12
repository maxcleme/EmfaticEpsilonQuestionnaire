/**
 */
package questionnaire.tests;

import junit.textui.TestRunner;

import questionnaire.QuestionnaireFactory;
import questionnaire.TypeSaisieNumerique;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Type Saisie Numerique</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeSaisieNumeriqueTest extends TypeSaisieTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TypeSaisieNumeriqueTest.class);
	}

	/**
	 * Constructs a new Type Saisie Numerique test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSaisieNumeriqueTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Type Saisie Numerique test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TypeSaisieNumerique getFixture() {
		return (TypeSaisieNumerique)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuestionnaireFactory.eINSTANCE.createTypeSaisieNumerique());
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

} //TypeSaisieNumeriqueTest

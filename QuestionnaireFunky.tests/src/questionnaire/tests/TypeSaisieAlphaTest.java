/**
 */
package questionnaire.tests;

import junit.textui.TestRunner;

import questionnaire.QuestionnaireFactory;
import questionnaire.TypeSaisieAlpha;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Type Saisie Alpha</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeSaisieAlphaTest extends TypeSaisieTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TypeSaisieAlphaTest.class);
	}

	/**
	 * Constructs a new Type Saisie Alpha test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSaisieAlphaTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Type Saisie Alpha test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TypeSaisieAlpha getFixture() {
		return (TypeSaisieAlpha)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuestionnaireFactory.eINSTANCE.createTypeSaisieAlpha());
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

} //TypeSaisieAlphaTest

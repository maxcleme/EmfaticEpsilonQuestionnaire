/**
 */
package questionnaire.tests;

import junit.textui.TestRunner;

import questionnaire.QuestionnaireFactory;
import questionnaire.TypeSaisieAll;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Type Saisie All</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeSaisieAllTest extends TypeSaisieTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TypeSaisieAllTest.class);
	}

	/**
	 * Constructs a new Type Saisie All test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSaisieAllTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Type Saisie All test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TypeSaisieAll getFixture() {
		return (TypeSaisieAll)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuestionnaireFactory.eINSTANCE.createTypeSaisieAll());
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

} //TypeSaisieAllTest

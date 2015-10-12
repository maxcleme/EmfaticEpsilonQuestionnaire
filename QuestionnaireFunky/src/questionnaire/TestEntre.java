/**
 */
package questionnaire;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Entre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link questionnaire.TestEntre#getBorneMinIncluse <em>Borne Min Incluse</em>}</li>
 *   <li>{@link questionnaire.TestEntre#getBorneMaxExcluse <em>Borne Max Excluse</em>}</li>
 * </ul>
 * </p>
 *
 * @see questionnaire.QuestionnairePackage#getTestEntre()
 * @model annotation="gmf.node figure='svg' svg.uri='platform:/plugin/QuestionnaireFunky/model/img/brackets.svg' label='borneMinIncluse, borneMaxExcluse'"
 * @generated
 */
public interface TestEntre extends Test {
	/**
	 * Returns the value of the '<em><b>Borne Min Incluse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Borne Min Incluse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Borne Min Incluse</em>' attribute.
	 * @see #setBorneMinIncluse(int)
	 * @see questionnaire.QuestionnairePackage#getTestEntre_BorneMinIncluse()
	 * @model
	 * @generated
	 */
	int getBorneMinIncluse();

	/**
	 * Sets the value of the '{@link questionnaire.TestEntre#getBorneMinIncluse <em>Borne Min Incluse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Borne Min Incluse</em>' attribute.
	 * @see #getBorneMinIncluse()
	 * @generated
	 */
	void setBorneMinIncluse(int value);

	/**
	 * Returns the value of the '<em><b>Borne Max Excluse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Borne Max Excluse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Borne Max Excluse</em>' attribute.
	 * @see #setBorneMaxExcluse(int)
	 * @see questionnaire.QuestionnairePackage#getTestEntre_BorneMaxExcluse()
	 * @model
	 * @generated
	 */
	int getBorneMaxExcluse();

	/**
	 * Sets the value of the '{@link questionnaire.TestEntre#getBorneMaxExcluse <em>Borne Max Excluse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Borne Max Excluse</em>' attribute.
	 * @see #getBorneMaxExcluse()
	 * @generated
	 */
	void setBorneMaxExcluse(int value);

} // TestEntre

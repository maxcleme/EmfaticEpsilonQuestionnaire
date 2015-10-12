/**
 */
package questionnaire;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Inferieur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link questionnaire.TestInferieur#getValeur <em>Valeur</em>}</li>
 * </ul>
 * </p>
 *
 * @see questionnaire.QuestionnairePackage#getTestInferieur()
 * @model annotation="gmf.node figure='svg' svg.uri='platform:/plugin/QuestionnaireFunky/model/img/lessThan.svg' label='valeur'"
 * @generated
 */
public interface TestInferieur extends Test {
	/**
	 * Returns the value of the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valeur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur</em>' attribute.
	 * @see #setValeur(int)
	 * @see questionnaire.QuestionnairePackage#getTestInferieur_Valeur()
	 * @model
	 * @generated
	 */
	int getValeur();

	/**
	 * Sets the value of the '{@link questionnaire.TestInferieur#getValeur <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur</em>' attribute.
	 * @see #getValeur()
	 * @generated
	 */
	void setValeur(int value);

} // TestInferieur

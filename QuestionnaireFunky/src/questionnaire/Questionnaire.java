/**
 */
package questionnaire;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link questionnaire.Questionnaire#getQuestions <em>Questions</em>}</li>
 *   <li>{@link questionnaire.Questionnaire#getTypesSaisies <em>Types Saisies</em>}</li>
 *   <li>{@link questionnaire.Questionnaire#getAiguilleurs <em>Aiguilleurs</em>}</li>
 *   <li>{@link questionnaire.Questionnaire#getTests <em>Tests</em>}</li>
 *   <li>{@link questionnaire.Questionnaire#getFin <em>Fin</em>}</li>
 *   <li>{@link questionnaire.Questionnaire#getDebut <em>Debut</em>}</li>
 * </ul>
 * </p>
 *
 * @see questionnaire.QuestionnairePackage#getQuestionnaire()
 * @model
 * @generated
 */
public interface Questionnaire extends EObject {
	/**
	 * Returns the value of the '<em><b>Questions</b></em>' containment reference list.
	 * The list contents are of type {@link questionnaire.Question}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Questions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questions</em>' containment reference list.
	 * @see questionnaire.QuestionnairePackage#getQuestionnaire_Questions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Question> getQuestions();

	/**
	 * Returns the value of the '<em><b>Types Saisies</b></em>' containment reference list.
	 * The list contents are of type {@link questionnaire.TypeSaisie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types Saisies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types Saisies</em>' containment reference list.
	 * @see questionnaire.QuestionnairePackage#getQuestionnaire_TypesSaisies()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeSaisie> getTypesSaisies();

	/**
	 * Returns the value of the '<em><b>Aiguilleurs</b></em>' containment reference list.
	 * The list contents are of type {@link questionnaire.Aiguilleur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aiguilleurs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aiguilleurs</em>' containment reference list.
	 * @see questionnaire.QuestionnairePackage#getQuestionnaire_Aiguilleurs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Aiguilleur> getAiguilleurs();

	/**
	 * Returns the value of the '<em><b>Tests</b></em>' containment reference list.
	 * The list contents are of type {@link questionnaire.Test}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tests</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests</em>' containment reference list.
	 * @see questionnaire.QuestionnairePackage#getQuestionnaire_Tests()
	 * @model containment="true"
	 * @generated
	 */
	EList<Test> getTests();

	/**
	 * Returns the value of the '<em><b>Fin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin</em>' containment reference.
	 * @see #setFin(Fin)
	 * @see questionnaire.QuestionnairePackage#getQuestionnaire_Fin()
	 * @model containment="true"
	 * @generated
	 */
	Fin getFin();

	/**
	 * Sets the value of the '{@link questionnaire.Questionnaire#getFin <em>Fin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin</em>' containment reference.
	 * @see #getFin()
	 * @generated
	 */
	void setFin(Fin value);

	/**
	 * Returns the value of the '<em><b>Debut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debut</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut</em>' containment reference.
	 * @see #setDebut(Debut)
	 * @see questionnaire.QuestionnairePackage#getQuestionnaire_Debut()
	 * @model containment="true"
	 * @generated
	 */
	Debut getDebut();

	/**
	 * Sets the value of the '{@link questionnaire.Questionnaire#getDebut <em>Debut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut</em>' containment reference.
	 * @see #getDebut()
	 * @generated
	 */
	void setDebut(Debut value);

} // Questionnaire

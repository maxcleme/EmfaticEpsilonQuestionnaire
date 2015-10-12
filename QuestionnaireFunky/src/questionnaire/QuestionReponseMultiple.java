/**
 */
package questionnaire;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question Reponse Multiple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link questionnaire.QuestionReponseMultiple#getReponsesPossible <em>Reponses Possible</em>}</li>
 * </ul>
 * </p>
 *
 * @see questionnaire.QuestionnairePackage#getQuestionReponseMultiple()
 * @model
 * @generated
 */
public interface QuestionReponseMultiple extends Question {
	/**
	 * Returns the value of the '<em><b>Reponses Possible</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reponses Possible</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reponses Possible</em>' attribute list.
	 * @see questionnaire.QuestionnairePackage#getQuestionReponseMultiple_ReponsesPossible()
	 * @model
	 * @generated
	 */
	EList<String> getReponsesPossible();

} // QuestionReponseMultiple

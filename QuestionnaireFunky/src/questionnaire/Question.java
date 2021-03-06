/**
 */
package questionnaire;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link questionnaire.Question#getQuestion <em>Question</em>}</li>
 *   <li>{@link questionnaire.Question#getTypeSaisie <em>Type Saisie</em>}</li>
 *   <li>{@link questionnaire.Question#getSuite <em>Suite</em>}</li>
 * </ul>
 * </p>
 *
 * @see questionnaire.QuestionnairePackage#getQuestion()
 * @model abstract="true"
 *        annotation="gmf.node figure='rectangle' label='question'"
 * @generated
 */
public interface Question extends Next {
	/**
	 * Returns the value of the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' attribute.
	 * @see #setQuestion(String)
	 * @see questionnaire.QuestionnairePackage#getQuestion_Question()
	 * @model
	 * @generated
	 */
	String getQuestion();

	/**
	 * Sets the value of the '{@link questionnaire.Question#getQuestion <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' attribute.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(String value);

	/**
	 * Returns the value of the '<em><b>Type Saisie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Saisie</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Saisie</em>' containment reference.
	 * @see #setTypeSaisie(TypeSaisie)
	 * @see questionnaire.QuestionnairePackage#getQuestion_TypeSaisie()
	 * @model containment="true"
	 * @generated
	 */
	TypeSaisie getTypeSaisie();

	/**
	 * Sets the value of the '{@link questionnaire.Question#getTypeSaisie <em>Type Saisie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Saisie</em>' containment reference.
	 * @see #getTypeSaisie()
	 * @generated
	 */
	void setTypeSaisie(TypeSaisie value);

	/**
	 * Returns the value of the '<em><b>Suite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suite</em>' reference.
	 * @see #setSuite(Next)
	 * @see questionnaire.QuestionnairePackage#getQuestion_Suite()
	 * @model annotation="gmf.link target.decoration='arrow'"
	 * @generated
	 */
	Next getSuite();

	/**
	 * Sets the value of the '{@link questionnaire.Question#getSuite <em>Suite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suite</em>' reference.
	 * @see #getSuite()
	 * @generated
	 */
	void setSuite(Next value);

} // Question

/**
 */
package questionnaire;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aiguilleur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link questionnaire.Aiguilleur#getNom <em>Nom</em>}</li>
 *   <li>{@link questionnaire.Aiguilleur#getTests <em>Tests</em>}</li>
 *   <li>{@link questionnaire.Aiguilleur#getElseDestination <em>Else Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @see questionnaire.QuestionnairePackage#getAiguilleur()
 * @model annotation="gmf.node figure='rectangle' label='nom' label.text='Si' label.readOnly='true'"
 * @generated
 */
public interface Aiguilleur extends Next {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see questionnaire.QuestionnairePackage#getAiguilleur_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link questionnaire.Aiguilleur#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

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
	 * @see questionnaire.QuestionnairePackage#getAiguilleur_Tests()
	 * @model containment="true"
	 * @generated
	 */
	EList<Test> getTests();

	/**
	 * Returns the value of the '<em><b>Else Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Destination</em>' reference.
	 * @see #setElseDestination(Next)
	 * @see questionnaire.QuestionnairePackage#getAiguilleur_ElseDestination()
	 * @model annotation="gmf.link target.decoration='arrow' label.text='Sinon'"
	 * @generated
	 */
	Next getElseDestination();

	/**
	 * Sets the value of the '{@link questionnaire.Aiguilleur#getElseDestination <em>Else Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Destination</em>' reference.
	 * @see #getElseDestination()
	 * @generated
	 */
	void setElseDestination(Next value);

} // Aiguilleur

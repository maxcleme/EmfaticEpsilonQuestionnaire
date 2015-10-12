/**
 */
package questionnaire;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Debut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link questionnaire.Debut#getNom <em>Nom</em>}</li>
 *   <li>{@link questionnaire.Debut#getPremiereQuestion <em>Premiere Question</em>}</li>
 * </ul>
 * </p>
 *
 * @see questionnaire.QuestionnairePackage#getDebut()
 * @model annotation="gmf.node figure='svg' svg.uri='platform:/plugin/QuestionnaireFunky/model/img/start.svg' label='nom' label.text='debut' label.readOnly='true'"
 * @generated
 */
public interface Debut extends EObject {
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
	 * @see questionnaire.QuestionnairePackage#getDebut_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link questionnaire.Debut#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Premiere Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Premiere Question</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Premiere Question</em>' reference.
	 * @see #setPremiereQuestion(Question)
	 * @see questionnaire.QuestionnairePackage#getDebut_PremiereQuestion()
	 * @model annotation="gmf.link target.decoration='arrow'"
	 * @generated
	 */
	Question getPremiereQuestion();

	/**
	 * Sets the value of the '{@link questionnaire.Debut#getPremiereQuestion <em>Premiere Question</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Premiere Question</em>' reference.
	 * @see #getPremiereQuestion()
	 * @generated
	 */
	void setPremiereQuestion(Question value);

} // Debut

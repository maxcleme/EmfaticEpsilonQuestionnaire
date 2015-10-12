/**
 */
package questionnaire;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Saisie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link questionnaire.TypeSaisie#getRegex <em>Regex</em>}</li>
 *   <li>{@link questionnaire.TypeSaisie#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see questionnaire.QuestionnairePackage#getTypeSaisie()
 * @model abstract="true"
 * @generated
 */
public interface TypeSaisie extends EObject {
	/**
	 * Returns the value of the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regex</em>' attribute.
	 * @see #setRegex(String)
	 * @see questionnaire.QuestionnairePackage#getTypeSaisie_Regex()
	 * @model
	 * @generated
	 */
	String getRegex();

	/**
	 * Sets the value of the '{@link questionnaire.TypeSaisie#getRegex <em>Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regex</em>' attribute.
	 * @see #getRegex()
	 * @generated
	 */
	void setRegex(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see questionnaire.QuestionnairePackage#getTypeSaisie_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link questionnaire.TypeSaisie#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

} // TypeSaisie

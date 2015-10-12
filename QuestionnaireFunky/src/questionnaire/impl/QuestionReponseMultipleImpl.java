/**
 */
package questionnaire.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import questionnaire.QuestionReponseMultiple;
import questionnaire.QuestionnairePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question Reponse Multiple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link questionnaire.impl.QuestionReponseMultipleImpl#getReponsesPossible <em>Reponses Possible</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionReponseMultipleImpl extends QuestionImpl implements QuestionReponseMultiple {
	/**
	 * The cached value of the '{@link #getReponsesPossible() <em>Reponses Possible</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReponsesPossible()
	 * @generated
	 * @ordered
	 */
	protected EList<String> reponsesPossible;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionReponseMultipleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionnairePackage.Literals.QUESTION_REPONSE_MULTIPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getReponsesPossible() {
		if (reponsesPossible == null) {
			reponsesPossible = new EDataTypeUniqueEList<String>(String.class, this, QuestionnairePackage.QUESTION_REPONSE_MULTIPLE__REPONSES_POSSIBLE);
		}
		return reponsesPossible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuestionnairePackage.QUESTION_REPONSE_MULTIPLE__REPONSES_POSSIBLE:
				return getReponsesPossible();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QuestionnairePackage.QUESTION_REPONSE_MULTIPLE__REPONSES_POSSIBLE:
				getReponsesPossible().clear();
				getReponsesPossible().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QuestionnairePackage.QUESTION_REPONSE_MULTIPLE__REPONSES_POSSIBLE:
				getReponsesPossible().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QuestionnairePackage.QUESTION_REPONSE_MULTIPLE__REPONSES_POSSIBLE:
				return reponsesPossible != null && !reponsesPossible.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (reponsesPossible: ");
		result.append(reponsesPossible);
		result.append(')');
		return result.toString();
	}

} //QuestionReponseMultipleImpl

/**
 */
package questionnaire.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import questionnaire.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see questionnaire.QuestionnairePackage
 * @generated
 */
public class QuestionnaireSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QuestionnairePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireSwitch() {
		if (modelPackage == null) {
			modelPackage = QuestionnairePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case QuestionnairePackage.QUESTIONNAIRE: {
				Questionnaire questionnaire = (Questionnaire)theEObject;
				T result = caseQuestionnaire(questionnaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.DEBUT: {
				Debut debut = (Debut)theEObject;
				T result = caseDebut(debut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.FIN: {
				Fin fin = (Fin)theEObject;
				T result = caseFin(fin);
				if (result == null) result = caseNext(fin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.TEXTE: {
				Texte texte = (Texte)theEObject;
				T result = caseTexte(texte);
				if (result == null) result = caseQuestion(texte);
				if (result == null) result = caseNext(texte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.QUESTION_OUVERTE: {
				QuestionOuverte questionOuverte = (QuestionOuverte)theEObject;
				T result = caseQuestionOuverte(questionOuverte);
				if (result == null) result = caseQuestion(questionOuverte);
				if (result == null) result = caseNext(questionOuverte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.QUESTION_OUI_NON: {
				QuestionOuiNon questionOuiNon = (QuestionOuiNon)theEObject;
				T result = caseQuestionOuiNon(questionOuiNon);
				if (result == null) result = caseQuestion(questionOuiNon);
				if (result == null) result = caseNext(questionOuiNon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.QUESTION_REPONSE_MULTIPLE: {
				QuestionReponseMultiple questionReponseMultiple = (QuestionReponseMultiple)theEObject;
				T result = caseQuestionReponseMultiple(questionReponseMultiple);
				if (result == null) result = caseQuestion(questionReponseMultiple);
				if (result == null) result = caseNext(questionReponseMultiple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.AIGUILLEUR: {
				Aiguilleur aiguilleur = (Aiguilleur)theEObject;
				T result = caseAiguilleur(aiguilleur);
				if (result == null) result = caseNext(aiguilleur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.TEST_ENTRE: {
				TestEntre testEntre = (TestEntre)theEObject;
				T result = caseTestEntre(testEntre);
				if (result == null) result = caseTest(testEntre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.TEST_INFERIEUR: {
				TestInferieur testInferieur = (TestInferieur)theEObject;
				T result = caseTestInferieur(testInferieur);
				if (result == null) result = caseTest(testInferieur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.TEST_SUPERIEUR: {
				TestSuperieur testSuperieur = (TestSuperieur)theEObject;
				T result = caseTestSuperieur(testSuperieur);
				if (result == null) result = caseTest(testSuperieur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.TEST_EGALITE: {
				TestEgalite testEgalite = (TestEgalite)theEObject;
				T result = caseTestEgalite(testEgalite);
				if (result == null) result = caseTest(testEgalite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.TYPE_SAISIE_NUMERIQUE: {
				TypeSaisieNumerique typeSaisieNumerique = (TypeSaisieNumerique)theEObject;
				T result = caseTypeSaisieNumerique(typeSaisieNumerique);
				if (result == null) result = caseTypeSaisie(typeSaisieNumerique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.TYPE_SAISIE_ALPHA_NUMERIQUE: {
				TypeSaisieAlphaNumerique typeSaisieAlphaNumerique = (TypeSaisieAlphaNumerique)theEObject;
				T result = caseTypeSaisieAlphaNumerique(typeSaisieAlphaNumerique);
				if (result == null) result = caseTypeSaisie(typeSaisieAlphaNumerique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.TYPE_SAISIE_ALPHA: {
				TypeSaisieAlpha typeSaisieAlpha = (TypeSaisieAlpha)theEObject;
				T result = caseTypeSaisieAlpha(typeSaisieAlpha);
				if (result == null) result = caseTypeSaisie(typeSaisieAlpha);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.TYPE_SAISIE_ALL: {
				TypeSaisieAll typeSaisieAll = (TypeSaisieAll)theEObject;
				T result = caseTypeSaisieAll(typeSaisieAll);
				if (result == null) result = caseTypeSaisie(typeSaisieAll);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.TYPE_SAISIE: {
				TypeSaisie typeSaisie = (TypeSaisie)theEObject;
				T result = caseTypeSaisie(typeSaisie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.QUESTION: {
				Question question = (Question)theEObject;
				T result = caseQuestion(question);
				if (result == null) result = caseNext(question);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.TEST: {
				Test test = (Test)theEObject;
				T result = caseTest(test);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.NEXT: {
				Next next = (Next)theEObject;
				T result = caseNext(next);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaire(Questionnaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Debut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Debut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDebut(Debut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFin(Fin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Texte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Texte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTexte(Texte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question Ouverte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question Ouverte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionOuverte(QuestionOuverte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question Oui Non</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question Oui Non</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionOuiNon(QuestionOuiNon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question Reponse Multiple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question Reponse Multiple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionReponseMultiple(QuestionReponseMultiple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aiguilleur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aiguilleur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAiguilleur(Aiguilleur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Entre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Entre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestEntre(TestEntre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Inferieur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Inferieur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestInferieur(TestInferieur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Superieur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Superieur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestSuperieur(TestSuperieur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Egalite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Egalite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestEgalite(TestEgalite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Saisie Numerique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Saisie Numerique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSaisieNumerique(TypeSaisieNumerique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Saisie Alpha Numerique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Saisie Alpha Numerique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSaisieAlphaNumerique(TypeSaisieAlphaNumerique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Saisie Alpha</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Saisie Alpha</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSaisieAlpha(TypeSaisieAlpha object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Saisie All</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Saisie All</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSaisieAll(TypeSaisieAll object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Saisie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Saisie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSaisie(TypeSaisie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestion(Question object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTest(Test object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Next</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Next</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNext(Next object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //QuestionnaireSwitch

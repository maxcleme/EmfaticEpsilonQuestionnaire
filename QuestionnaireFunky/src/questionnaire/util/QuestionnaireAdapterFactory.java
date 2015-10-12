/**
 */
package questionnaire.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import questionnaire.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see questionnaire.QuestionnairePackage
 * @generated
 */
public class QuestionnaireAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QuestionnairePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QuestionnairePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireSwitch<Adapter> modelSwitch =
		new QuestionnaireSwitch<Adapter>() {
			@Override
			public Adapter caseQuestionnaire(Questionnaire object) {
				return createQuestionnaireAdapter();
			}
			@Override
			public Adapter caseDebut(Debut object) {
				return createDebutAdapter();
			}
			@Override
			public Adapter caseFin(Fin object) {
				return createFinAdapter();
			}
			@Override
			public Adapter caseTexte(Texte object) {
				return createTexteAdapter();
			}
			@Override
			public Adapter caseQuestionOuverte(QuestionOuverte object) {
				return createQuestionOuverteAdapter();
			}
			@Override
			public Adapter caseQuestionOuiNon(QuestionOuiNon object) {
				return createQuestionOuiNonAdapter();
			}
			@Override
			public Adapter caseQuestionReponseMultiple(QuestionReponseMultiple object) {
				return createQuestionReponseMultipleAdapter();
			}
			@Override
			public Adapter caseAiguilleur(Aiguilleur object) {
				return createAiguilleurAdapter();
			}
			@Override
			public Adapter caseTestEntre(TestEntre object) {
				return createTestEntreAdapter();
			}
			@Override
			public Adapter caseTestInferieur(TestInferieur object) {
				return createTestInferieurAdapter();
			}
			@Override
			public Adapter caseTestSuperieur(TestSuperieur object) {
				return createTestSuperieurAdapter();
			}
			@Override
			public Adapter caseTestEgalite(TestEgalite object) {
				return createTestEgaliteAdapter();
			}
			@Override
			public Adapter caseTypeSaisieNumerique(TypeSaisieNumerique object) {
				return createTypeSaisieNumeriqueAdapter();
			}
			@Override
			public Adapter caseTypeSaisieAlphaNumerique(TypeSaisieAlphaNumerique object) {
				return createTypeSaisieAlphaNumeriqueAdapter();
			}
			@Override
			public Adapter caseTypeSaisieAlpha(TypeSaisieAlpha object) {
				return createTypeSaisieAlphaAdapter();
			}
			@Override
			public Adapter caseTypeSaisieAll(TypeSaisieAll object) {
				return createTypeSaisieAllAdapter();
			}
			@Override
			public Adapter caseTypeSaisie(TypeSaisie object) {
				return createTypeSaisieAdapter();
			}
			@Override
			public Adapter caseQuestion(Question object) {
				return createQuestionAdapter();
			}
			@Override
			public Adapter caseTest(Test object) {
				return createTestAdapter();
			}
			@Override
			public Adapter caseNext(Next object) {
				return createNextAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.Questionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.Questionnaire
	 * @generated
	 */
	public Adapter createQuestionnaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.Debut <em>Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.Debut
	 * @generated
	 */
	public Adapter createDebutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.Fin <em>Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.Fin
	 * @generated
	 */
	public Adapter createFinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.Texte <em>Texte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.Texte
	 * @generated
	 */
	public Adapter createTexteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.QuestionOuverte <em>Question Ouverte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.QuestionOuverte
	 * @generated
	 */
	public Adapter createQuestionOuverteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.QuestionOuiNon <em>Question Oui Non</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.QuestionOuiNon
	 * @generated
	 */
	public Adapter createQuestionOuiNonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.QuestionReponseMultiple <em>Question Reponse Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.QuestionReponseMultiple
	 * @generated
	 */
	public Adapter createQuestionReponseMultipleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.Aiguilleur <em>Aiguilleur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.Aiguilleur
	 * @generated
	 */
	public Adapter createAiguilleurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.TestEntre <em>Test Entre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.TestEntre
	 * @generated
	 */
	public Adapter createTestEntreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.TestInferieur <em>Test Inferieur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.TestInferieur
	 * @generated
	 */
	public Adapter createTestInferieurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.TestSuperieur <em>Test Superieur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.TestSuperieur
	 * @generated
	 */
	public Adapter createTestSuperieurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.TestEgalite <em>Test Egalite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.TestEgalite
	 * @generated
	 */
	public Adapter createTestEgaliteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.TypeSaisieNumerique <em>Type Saisie Numerique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.TypeSaisieNumerique
	 * @generated
	 */
	public Adapter createTypeSaisieNumeriqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.TypeSaisieAlphaNumerique <em>Type Saisie Alpha Numerique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.TypeSaisieAlphaNumerique
	 * @generated
	 */
	public Adapter createTypeSaisieAlphaNumeriqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.TypeSaisieAlpha <em>Type Saisie Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.TypeSaisieAlpha
	 * @generated
	 */
	public Adapter createTypeSaisieAlphaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.TypeSaisieAll <em>Type Saisie All</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.TypeSaisieAll
	 * @generated
	 */
	public Adapter createTypeSaisieAllAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.TypeSaisie <em>Type Saisie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.TypeSaisie
	 * @generated
	 */
	public Adapter createTypeSaisieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.Question
	 * @generated
	 */
	public Adapter createQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.Test
	 * @generated
	 */
	public Adapter createTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionnaire.Next <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionnaire.Next
	 * @generated
	 */
	public Adapter createNextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //QuestionnaireAdapterFactory

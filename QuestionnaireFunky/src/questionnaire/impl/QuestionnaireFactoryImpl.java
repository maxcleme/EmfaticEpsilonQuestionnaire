/**
 */
package questionnaire.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import questionnaire.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuestionnaireFactoryImpl extends EFactoryImpl implements QuestionnaireFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QuestionnaireFactory init() {
		try {
			QuestionnaireFactory theQuestionnaireFactory = (QuestionnaireFactory)EPackage.Registry.INSTANCE.getEFactory(QuestionnairePackage.eNS_URI);
			if (theQuestionnaireFactory != null) {
				return theQuestionnaireFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QuestionnaireFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QuestionnairePackage.QUESTIONNAIRE: return createQuestionnaire();
			case QuestionnairePackage.DEBUT: return createDebut();
			case QuestionnairePackage.FIN: return createFin();
			case QuestionnairePackage.TEXTE: return createTexte();
			case QuestionnairePackage.QUESTION_OUVERTE: return createQuestionOuverte();
			case QuestionnairePackage.QUESTION_OUI_NON: return createQuestionOuiNon();
			case QuestionnairePackage.QUESTION_REPONSE_MULTIPLE: return createQuestionReponseMultiple();
			case QuestionnairePackage.AIGUILLEUR: return createAiguilleur();
			case QuestionnairePackage.TEST_ENTRE: return createTestEntre();
			case QuestionnairePackage.TEST_INFERIEUR: return createTestInferieur();
			case QuestionnairePackage.TEST_SUPERIEUR: return createTestSuperieur();
			case QuestionnairePackage.TEST_EGALITE: return createTestEgalite();
			case QuestionnairePackage.TYPE_SAISIE_NUMERIQUE: return createTypeSaisieNumerique();
			case QuestionnairePackage.TYPE_SAISIE_ALPHA_NUMERIQUE: return createTypeSaisieAlphaNumerique();
			case QuestionnairePackage.TYPE_SAISIE_ALPHA: return createTypeSaisieAlpha();
			case QuestionnairePackage.TYPE_SAISIE_ALL: return createTypeSaisieAll();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questionnaire createQuestionnaire() {
		QuestionnaireImpl questionnaire = new QuestionnaireImpl();
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Debut createDebut() {
		DebutImpl debut = new DebutImpl();
		return debut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fin createFin() {
		FinImpl fin = new FinImpl();
		return fin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Texte createTexte() {
		TexteImpl texte = new TexteImpl();
		return texte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionOuverte createQuestionOuverte() {
		QuestionOuverteImpl questionOuverte = new QuestionOuverteImpl();
		return questionOuverte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionOuiNon createQuestionOuiNon() {
		QuestionOuiNonImpl questionOuiNon = new QuestionOuiNonImpl();
		return questionOuiNon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionReponseMultiple createQuestionReponseMultiple() {
		QuestionReponseMultipleImpl questionReponseMultiple = new QuestionReponseMultipleImpl();
		return questionReponseMultiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aiguilleur createAiguilleur() {
		AiguilleurImpl aiguilleur = new AiguilleurImpl();
		return aiguilleur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestEntre createTestEntre() {
		TestEntreImpl testEntre = new TestEntreImpl();
		return testEntre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestInferieur createTestInferieur() {
		TestInferieurImpl testInferieur = new TestInferieurImpl();
		return testInferieur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestSuperieur createTestSuperieur() {
		TestSuperieurImpl testSuperieur = new TestSuperieurImpl();
		return testSuperieur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestEgalite createTestEgalite() {
		TestEgaliteImpl testEgalite = new TestEgaliteImpl();
		return testEgalite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSaisieNumerique createTypeSaisieNumerique() {
		TypeSaisieNumeriqueImpl typeSaisieNumerique = new TypeSaisieNumeriqueImpl();
		return typeSaisieNumerique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSaisieAlphaNumerique createTypeSaisieAlphaNumerique() {
		TypeSaisieAlphaNumeriqueImpl typeSaisieAlphaNumerique = new TypeSaisieAlphaNumeriqueImpl();
		return typeSaisieAlphaNumerique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSaisieAlpha createTypeSaisieAlpha() {
		TypeSaisieAlphaImpl typeSaisieAlpha = new TypeSaisieAlphaImpl();
		return typeSaisieAlpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSaisieAll createTypeSaisieAll() {
		TypeSaisieAllImpl typeSaisieAll = new TypeSaisieAllImpl();
		return typeSaisieAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnairePackage getQuestionnairePackage() {
		return (QuestionnairePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QuestionnairePackage getPackage() {
		return QuestionnairePackage.eINSTANCE;
	}

} //QuestionnaireFactoryImpl

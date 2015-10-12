/**
 */
package questionnaire;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see questionnaire.QuestionnaireFactory
 * @model kind="package"
 * @generated
 */
public interface QuestionnairePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "questionnaire";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "questionnaire";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "questionnaire";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QuestionnairePackage eINSTANCE = questionnaire.impl.QuestionnairePackageImpl.init();

	/**
	 * The meta object id for the '{@link questionnaire.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.QuestionnaireImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getQuestionnaire()
	 * @generated
	 */
	int QUESTIONNAIRE = 0;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__QUESTIONS = 0;

	/**
	 * The feature id for the '<em><b>Types Saisies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__TYPES_SAISIES = 1;

	/**
	 * The feature id for the '<em><b>Aiguilleurs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__AIGUILLEURS = 2;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__TESTS = 3;

	/**
	 * The feature id for the '<em><b>Fin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__FIN = 4;

	/**
	 * The feature id for the '<em><b>Debut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__DEBUT = 5;

	/**
	 * The number of structural features of the '<em>Questionnaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link questionnaire.impl.DebutImpl <em>Debut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.DebutImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getDebut()
	 * @generated
	 */
	int DEBUT = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUT__NOM = 0;

	/**
	 * The feature id for the '<em><b>Premiere Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUT__PREMIERE_QUESTION = 1;

	/**
	 * The number of structural features of the '<em>Debut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link questionnaire.impl.NextImpl <em>Next</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.NextImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getNext()
	 * @generated
	 */
	int NEXT = 19;

	/**
	 * The number of structural features of the '<em>Next</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link questionnaire.impl.FinImpl <em>Fin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.FinImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getFin()
	 * @generated
	 */
	int FIN = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN__NOM = NEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_FEATURE_COUNT = NEXT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link questionnaire.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.QuestionImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 17;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__QUESTION = NEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Saisie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__TYPE_SAISIE = NEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Suite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__SUITE = NEXT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = NEXT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link questionnaire.impl.TexteImpl <em>Texte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.TexteImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getTexte()
	 * @generated
	 */
	int TEXTE = 3;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTE__QUESTION = QUESTION__QUESTION;

	/**
	 * The feature id for the '<em><b>Type Saisie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTE__TYPE_SAISIE = QUESTION__TYPE_SAISIE;

	/**
	 * The feature id for the '<em><b>Suite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTE__SUITE = QUESTION__SUITE;

	/**
	 * The number of structural features of the '<em>Texte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTE_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link questionnaire.impl.QuestionOuverteImpl <em>Question Ouverte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.QuestionOuverteImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getQuestionOuverte()
	 * @generated
	 */
	int QUESTION_OUVERTE = 4;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OUVERTE__QUESTION = QUESTION__QUESTION;

	/**
	 * The feature id for the '<em><b>Type Saisie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OUVERTE__TYPE_SAISIE = QUESTION__TYPE_SAISIE;

	/**
	 * The feature id for the '<em><b>Suite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OUVERTE__SUITE = QUESTION__SUITE;

	/**
	 * The number of structural features of the '<em>Question Ouverte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OUVERTE_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link questionnaire.impl.QuestionOuiNonImpl <em>Question Oui Non</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.QuestionOuiNonImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getQuestionOuiNon()
	 * @generated
	 */
	int QUESTION_OUI_NON = 5;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OUI_NON__QUESTION = QUESTION__QUESTION;

	/**
	 * The feature id for the '<em><b>Type Saisie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OUI_NON__TYPE_SAISIE = QUESTION__TYPE_SAISIE;

	/**
	 * The feature id for the '<em><b>Suite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OUI_NON__SUITE = QUESTION__SUITE;

	/**
	 * The number of structural features of the '<em>Question Oui Non</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OUI_NON_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link questionnaire.impl.QuestionReponseMultipleImpl <em>Question Reponse Multiple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.QuestionReponseMultipleImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getQuestionReponseMultiple()
	 * @generated
	 */
	int QUESTION_REPONSE_MULTIPLE = 6;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_REPONSE_MULTIPLE__QUESTION = QUESTION__QUESTION;

	/**
	 * The feature id for the '<em><b>Type Saisie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_REPONSE_MULTIPLE__TYPE_SAISIE = QUESTION__TYPE_SAISIE;

	/**
	 * The feature id for the '<em><b>Suite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_REPONSE_MULTIPLE__SUITE = QUESTION__SUITE;

	/**
	 * The feature id for the '<em><b>Reponses Possible</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_REPONSE_MULTIPLE__REPONSES_POSSIBLE = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Question Reponse Multiple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_REPONSE_MULTIPLE_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link questionnaire.impl.AiguilleurImpl <em>Aiguilleur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.AiguilleurImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getAiguilleur()
	 * @generated
	 */
	int AIGUILLEUR = 7;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIGUILLEUR__NOM = NEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIGUILLEUR__TESTS = NEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIGUILLEUR__ELSE_DESTINATION = NEXT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Aiguilleur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIGUILLEUR_FEATURE_COUNT = NEXT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link questionnaire.impl.TestImpl <em>Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.TestImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getTest()
	 * @generated
	 */
	int TEST = 18;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__DESTINATION = 0;

	/**
	 * The number of structural features of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link questionnaire.impl.TestEntreImpl <em>Test Entre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.TestEntreImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getTestEntre()
	 * @generated
	 */
	int TEST_ENTRE = 8;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTRE__DESTINATION = TEST__DESTINATION;

	/**
	 * The feature id for the '<em><b>Borne Min Incluse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTRE__BORNE_MIN_INCLUSE = TEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Borne Max Excluse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTRE__BORNE_MAX_EXCLUSE = TEST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Test Entre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ENTRE_FEATURE_COUNT = TEST_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link questionnaire.impl.TestInferieurImpl <em>Test Inferieur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.TestInferieurImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getTestInferieur()
	 * @generated
	 */
	int TEST_INFERIEUR = 9;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INFERIEUR__DESTINATION = TEST__DESTINATION;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INFERIEUR__VALEUR = TEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test Inferieur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_INFERIEUR_FEATURE_COUNT = TEST_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link questionnaire.impl.TestSuperieurImpl <em>Test Superieur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.TestSuperieurImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getTestSuperieur()
	 * @generated
	 */
	int TEST_SUPERIEUR = 10;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUPERIEUR__DESTINATION = TEST__DESTINATION;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUPERIEUR__VALEUR = TEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test Superieur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUPERIEUR_FEATURE_COUNT = TEST_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link questionnaire.impl.TestEgaliteImpl <em>Test Egalite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.TestEgaliteImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getTestEgalite()
	 * @generated
	 */
	int TEST_EGALITE = 11;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_EGALITE__DESTINATION = TEST__DESTINATION;

	/**
	 * The feature id for the '<em><b>Egal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_EGALITE__EGAL = TEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test Egalite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_EGALITE_FEATURE_COUNT = TEST_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link questionnaire.impl.TypeSaisieImpl <em>Type Saisie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.TypeSaisieImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getTypeSaisie()
	 * @generated
	 */
	int TYPE_SAISIE = 16;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SAISIE__REGEX = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SAISIE__MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Type Saisie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SAISIE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link questionnaire.impl.TypeSaisieNumeriqueImpl <em>Type Saisie Numerique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.TypeSaisieNumeriqueImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getTypeSaisieNumerique()
	 * @generated
	 */
	int TYPE_SAISIE_NUMERIQUE = 12;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SAISIE_NUMERIQUE__REGEX = TYPE_SAISIE__REGEX;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SAISIE_NUMERIQUE__MESSAGE = TYPE_SAISIE__MESSAGE;

	/**
	 * The number of structural features of the '<em>Type Saisie Numerique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SAISIE_NUMERIQUE_FEATURE_COUNT = TYPE_SAISIE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link questionnaire.impl.TypeSaisieAlphaNumeriqueImpl <em>Type Saisie Alpha Numerique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.TypeSaisieAlphaNumeriqueImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getTypeSaisieAlphaNumerique()
	 * @generated
	 */
	int TYPE_SAISIE_ALPHA_NUMERIQUE = 13;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SAISIE_ALPHA_NUMERIQUE__REGEX = TYPE_SAISIE__REGEX;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SAISIE_ALPHA_NUMERIQUE__MESSAGE = TYPE_SAISIE__MESSAGE;

	/**
	 * The number of structural features of the '<em>Type Saisie Alpha Numerique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SAISIE_ALPHA_NUMERIQUE_FEATURE_COUNT = TYPE_SAISIE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link questionnaire.impl.TypeSaisieAlphaImpl <em>Type Saisie Alpha</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.TypeSaisieAlphaImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getTypeSaisieAlpha()
	 * @generated
	 */
	int TYPE_SAISIE_ALPHA = 14;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SAISIE_ALPHA__REGEX = TYPE_SAISIE__REGEX;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SAISIE_ALPHA__MESSAGE = TYPE_SAISIE__MESSAGE;

	/**
	 * The number of structural features of the '<em>Type Saisie Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SAISIE_ALPHA_FEATURE_COUNT = TYPE_SAISIE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link questionnaire.impl.TypeSaisieAllImpl <em>Type Saisie All</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.TypeSaisieAllImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getTypeSaisieAll()
	 * @generated
	 */
	int TYPE_SAISIE_ALL = 15;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SAISIE_ALL__REGEX = TYPE_SAISIE__REGEX;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SAISIE_ALL__MESSAGE = TYPE_SAISIE__MESSAGE;

	/**
	 * The number of structural features of the '<em>Type Saisie All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SAISIE_ALL_FEATURE_COUNT = TYPE_SAISIE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link questionnaire.Questionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Questionnaire</em>'.
	 * @see questionnaire.Questionnaire
	 * @generated
	 */
	EClass getQuestionnaire();

	/**
	 * Returns the meta object for the containment reference list '{@link questionnaire.Questionnaire#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questions</em>'.
	 * @see questionnaire.Questionnaire#getQuestions()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EReference getQuestionnaire_Questions();

	/**
	 * Returns the meta object for the containment reference list '{@link questionnaire.Questionnaire#getTypesSaisies <em>Types Saisies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types Saisies</em>'.
	 * @see questionnaire.Questionnaire#getTypesSaisies()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EReference getQuestionnaire_TypesSaisies();

	/**
	 * Returns the meta object for the containment reference list '{@link questionnaire.Questionnaire#getAiguilleurs <em>Aiguilleurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aiguilleurs</em>'.
	 * @see questionnaire.Questionnaire#getAiguilleurs()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EReference getQuestionnaire_Aiguilleurs();

	/**
	 * Returns the meta object for the containment reference list '{@link questionnaire.Questionnaire#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tests</em>'.
	 * @see questionnaire.Questionnaire#getTests()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EReference getQuestionnaire_Tests();

	/**
	 * Returns the meta object for the containment reference '{@link questionnaire.Questionnaire#getFin <em>Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fin</em>'.
	 * @see questionnaire.Questionnaire#getFin()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EReference getQuestionnaire_Fin();

	/**
	 * Returns the meta object for the containment reference '{@link questionnaire.Questionnaire#getDebut <em>Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Debut</em>'.
	 * @see questionnaire.Questionnaire#getDebut()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EReference getQuestionnaire_Debut();

	/**
	 * Returns the meta object for class '{@link questionnaire.Debut <em>Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Debut</em>'.
	 * @see questionnaire.Debut
	 * @generated
	 */
	EClass getDebut();

	/**
	 * Returns the meta object for the attribute '{@link questionnaire.Debut#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see questionnaire.Debut#getNom()
	 * @see #getDebut()
	 * @generated
	 */
	EAttribute getDebut_Nom();

	/**
	 * Returns the meta object for the reference '{@link questionnaire.Debut#getPremiereQuestion <em>Premiere Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Premiere Question</em>'.
	 * @see questionnaire.Debut#getPremiereQuestion()
	 * @see #getDebut()
	 * @generated
	 */
	EReference getDebut_PremiereQuestion();

	/**
	 * Returns the meta object for class '{@link questionnaire.Fin <em>Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin</em>'.
	 * @see questionnaire.Fin
	 * @generated
	 */
	EClass getFin();

	/**
	 * Returns the meta object for the attribute '{@link questionnaire.Fin#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see questionnaire.Fin#getNom()
	 * @see #getFin()
	 * @generated
	 */
	EAttribute getFin_Nom();

	/**
	 * Returns the meta object for class '{@link questionnaire.Texte <em>Texte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Texte</em>'.
	 * @see questionnaire.Texte
	 * @generated
	 */
	EClass getTexte();

	/**
	 * Returns the meta object for class '{@link questionnaire.QuestionOuverte <em>Question Ouverte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Ouverte</em>'.
	 * @see questionnaire.QuestionOuverte
	 * @generated
	 */
	EClass getQuestionOuverte();

	/**
	 * Returns the meta object for class '{@link questionnaire.QuestionOuiNon <em>Question Oui Non</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Oui Non</em>'.
	 * @see questionnaire.QuestionOuiNon
	 * @generated
	 */
	EClass getQuestionOuiNon();

	/**
	 * Returns the meta object for class '{@link questionnaire.QuestionReponseMultiple <em>Question Reponse Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Reponse Multiple</em>'.
	 * @see questionnaire.QuestionReponseMultiple
	 * @generated
	 */
	EClass getQuestionReponseMultiple();

	/**
	 * Returns the meta object for the attribute list '{@link questionnaire.QuestionReponseMultiple#getReponsesPossible <em>Reponses Possible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Reponses Possible</em>'.
	 * @see questionnaire.QuestionReponseMultiple#getReponsesPossible()
	 * @see #getQuestionReponseMultiple()
	 * @generated
	 */
	EAttribute getQuestionReponseMultiple_ReponsesPossible();

	/**
	 * Returns the meta object for class '{@link questionnaire.Aiguilleur <em>Aiguilleur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aiguilleur</em>'.
	 * @see questionnaire.Aiguilleur
	 * @generated
	 */
	EClass getAiguilleur();

	/**
	 * Returns the meta object for the attribute '{@link questionnaire.Aiguilleur#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see questionnaire.Aiguilleur#getNom()
	 * @see #getAiguilleur()
	 * @generated
	 */
	EAttribute getAiguilleur_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link questionnaire.Aiguilleur#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tests</em>'.
	 * @see questionnaire.Aiguilleur#getTests()
	 * @see #getAiguilleur()
	 * @generated
	 */
	EReference getAiguilleur_Tests();

	/**
	 * Returns the meta object for the reference '{@link questionnaire.Aiguilleur#getElseDestination <em>Else Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Else Destination</em>'.
	 * @see questionnaire.Aiguilleur#getElseDestination()
	 * @see #getAiguilleur()
	 * @generated
	 */
	EReference getAiguilleur_ElseDestination();

	/**
	 * Returns the meta object for class '{@link questionnaire.TestEntre <em>Test Entre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Entre</em>'.
	 * @see questionnaire.TestEntre
	 * @generated
	 */
	EClass getTestEntre();

	/**
	 * Returns the meta object for the attribute '{@link questionnaire.TestEntre#getBorneMinIncluse <em>Borne Min Incluse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Borne Min Incluse</em>'.
	 * @see questionnaire.TestEntre#getBorneMinIncluse()
	 * @see #getTestEntre()
	 * @generated
	 */
	EAttribute getTestEntre_BorneMinIncluse();

	/**
	 * Returns the meta object for the attribute '{@link questionnaire.TestEntre#getBorneMaxExcluse <em>Borne Max Excluse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Borne Max Excluse</em>'.
	 * @see questionnaire.TestEntre#getBorneMaxExcluse()
	 * @see #getTestEntre()
	 * @generated
	 */
	EAttribute getTestEntre_BorneMaxExcluse();

	/**
	 * Returns the meta object for class '{@link questionnaire.TestInferieur <em>Test Inferieur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Inferieur</em>'.
	 * @see questionnaire.TestInferieur
	 * @generated
	 */
	EClass getTestInferieur();

	/**
	 * Returns the meta object for the attribute '{@link questionnaire.TestInferieur#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur</em>'.
	 * @see questionnaire.TestInferieur#getValeur()
	 * @see #getTestInferieur()
	 * @generated
	 */
	EAttribute getTestInferieur_Valeur();

	/**
	 * Returns the meta object for class '{@link questionnaire.TestSuperieur <em>Test Superieur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Superieur</em>'.
	 * @see questionnaire.TestSuperieur
	 * @generated
	 */
	EClass getTestSuperieur();

	/**
	 * Returns the meta object for the attribute '{@link questionnaire.TestSuperieur#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur</em>'.
	 * @see questionnaire.TestSuperieur#getValeur()
	 * @see #getTestSuperieur()
	 * @generated
	 */
	EAttribute getTestSuperieur_Valeur();

	/**
	 * Returns the meta object for class '{@link questionnaire.TestEgalite <em>Test Egalite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Egalite</em>'.
	 * @see questionnaire.TestEgalite
	 * @generated
	 */
	EClass getTestEgalite();

	/**
	 * Returns the meta object for the attribute '{@link questionnaire.TestEgalite#getEgal <em>Egal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Egal</em>'.
	 * @see questionnaire.TestEgalite#getEgal()
	 * @see #getTestEgalite()
	 * @generated
	 */
	EAttribute getTestEgalite_Egal();

	/**
	 * Returns the meta object for class '{@link questionnaire.TypeSaisieNumerique <em>Type Saisie Numerique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Saisie Numerique</em>'.
	 * @see questionnaire.TypeSaisieNumerique
	 * @generated
	 */
	EClass getTypeSaisieNumerique();

	/**
	 * Returns the meta object for class '{@link questionnaire.TypeSaisieAlphaNumerique <em>Type Saisie Alpha Numerique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Saisie Alpha Numerique</em>'.
	 * @see questionnaire.TypeSaisieAlphaNumerique
	 * @generated
	 */
	EClass getTypeSaisieAlphaNumerique();

	/**
	 * Returns the meta object for class '{@link questionnaire.TypeSaisieAlpha <em>Type Saisie Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Saisie Alpha</em>'.
	 * @see questionnaire.TypeSaisieAlpha
	 * @generated
	 */
	EClass getTypeSaisieAlpha();

	/**
	 * Returns the meta object for class '{@link questionnaire.TypeSaisieAll <em>Type Saisie All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Saisie All</em>'.
	 * @see questionnaire.TypeSaisieAll
	 * @generated
	 */
	EClass getTypeSaisieAll();

	/**
	 * Returns the meta object for class '{@link questionnaire.TypeSaisie <em>Type Saisie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Saisie</em>'.
	 * @see questionnaire.TypeSaisie
	 * @generated
	 */
	EClass getTypeSaisie();

	/**
	 * Returns the meta object for the attribute '{@link questionnaire.TypeSaisie#getRegex <em>Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regex</em>'.
	 * @see questionnaire.TypeSaisie#getRegex()
	 * @see #getTypeSaisie()
	 * @generated
	 */
	EAttribute getTypeSaisie_Regex();

	/**
	 * Returns the meta object for the attribute '{@link questionnaire.TypeSaisie#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see questionnaire.TypeSaisie#getMessage()
	 * @see #getTypeSaisie()
	 * @generated
	 */
	EAttribute getTypeSaisie_Message();

	/**
	 * Returns the meta object for class '{@link questionnaire.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see questionnaire.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the attribute '{@link questionnaire.Question#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question</em>'.
	 * @see questionnaire.Question#getQuestion()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Question();

	/**
	 * Returns the meta object for the containment reference '{@link questionnaire.Question#getTypeSaisie <em>Type Saisie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Saisie</em>'.
	 * @see questionnaire.Question#getTypeSaisie()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_TypeSaisie();

	/**
	 * Returns the meta object for the reference '{@link questionnaire.Question#getSuite <em>Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Suite</em>'.
	 * @see questionnaire.Question#getSuite()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Suite();

	/**
	 * Returns the meta object for class '{@link questionnaire.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test</em>'.
	 * @see questionnaire.Test
	 * @generated
	 */
	EClass getTest();

	/**
	 * Returns the meta object for the reference '{@link questionnaire.Test#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see questionnaire.Test#getDestination()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_Destination();

	/**
	 * Returns the meta object for class '{@link questionnaire.Next <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Next</em>'.
	 * @see questionnaire.Next
	 * @generated
	 */
	EClass getNext();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QuestionnaireFactory getQuestionnaireFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link questionnaire.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.QuestionnaireImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getQuestionnaire()
		 * @generated
		 */
		EClass QUESTIONNAIRE = eINSTANCE.getQuestionnaire();

		/**
		 * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE__QUESTIONS = eINSTANCE.getQuestionnaire_Questions();

		/**
		 * The meta object literal for the '<em><b>Types Saisies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE__TYPES_SAISIES = eINSTANCE.getQuestionnaire_TypesSaisies();

		/**
		 * The meta object literal for the '<em><b>Aiguilleurs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE__AIGUILLEURS = eINSTANCE.getQuestionnaire_Aiguilleurs();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE__TESTS = eINSTANCE.getQuestionnaire_Tests();

		/**
		 * The meta object literal for the '<em><b>Fin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE__FIN = eINSTANCE.getQuestionnaire_Fin();

		/**
		 * The meta object literal for the '<em><b>Debut</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE__DEBUT = eINSTANCE.getQuestionnaire_Debut();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.DebutImpl <em>Debut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.DebutImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getDebut()
		 * @generated
		 */
		EClass DEBUT = eINSTANCE.getDebut();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEBUT__NOM = eINSTANCE.getDebut_Nom();

		/**
		 * The meta object literal for the '<em><b>Premiere Question</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEBUT__PREMIERE_QUESTION = eINSTANCE.getDebut_PremiereQuestion();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.FinImpl <em>Fin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.FinImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getFin()
		 * @generated
		 */
		EClass FIN = eINSTANCE.getFin();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN__NOM = eINSTANCE.getFin_Nom();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.TexteImpl <em>Texte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.TexteImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getTexte()
		 * @generated
		 */
		EClass TEXTE = eINSTANCE.getTexte();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.QuestionOuverteImpl <em>Question Ouverte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.QuestionOuverteImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getQuestionOuverte()
		 * @generated
		 */
		EClass QUESTION_OUVERTE = eINSTANCE.getQuestionOuverte();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.QuestionOuiNonImpl <em>Question Oui Non</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.QuestionOuiNonImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getQuestionOuiNon()
		 * @generated
		 */
		EClass QUESTION_OUI_NON = eINSTANCE.getQuestionOuiNon();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.QuestionReponseMultipleImpl <em>Question Reponse Multiple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.QuestionReponseMultipleImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getQuestionReponseMultiple()
		 * @generated
		 */
		EClass QUESTION_REPONSE_MULTIPLE = eINSTANCE.getQuestionReponseMultiple();

		/**
		 * The meta object literal for the '<em><b>Reponses Possible</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION_REPONSE_MULTIPLE__REPONSES_POSSIBLE = eINSTANCE.getQuestionReponseMultiple_ReponsesPossible();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.AiguilleurImpl <em>Aiguilleur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.AiguilleurImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getAiguilleur()
		 * @generated
		 */
		EClass AIGUILLEUR = eINSTANCE.getAiguilleur();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIGUILLEUR__NOM = eINSTANCE.getAiguilleur_Nom();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AIGUILLEUR__TESTS = eINSTANCE.getAiguilleur_Tests();

		/**
		 * The meta object literal for the '<em><b>Else Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AIGUILLEUR__ELSE_DESTINATION = eINSTANCE.getAiguilleur_ElseDestination();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.TestEntreImpl <em>Test Entre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.TestEntreImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getTestEntre()
		 * @generated
		 */
		EClass TEST_ENTRE = eINSTANCE.getTestEntre();

		/**
		 * The meta object literal for the '<em><b>Borne Min Incluse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ENTRE__BORNE_MIN_INCLUSE = eINSTANCE.getTestEntre_BorneMinIncluse();

		/**
		 * The meta object literal for the '<em><b>Borne Max Excluse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_ENTRE__BORNE_MAX_EXCLUSE = eINSTANCE.getTestEntre_BorneMaxExcluse();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.TestInferieurImpl <em>Test Inferieur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.TestInferieurImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getTestInferieur()
		 * @generated
		 */
		EClass TEST_INFERIEUR = eINSTANCE.getTestInferieur();

		/**
		 * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_INFERIEUR__VALEUR = eINSTANCE.getTestInferieur_Valeur();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.TestSuperieurImpl <em>Test Superieur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.TestSuperieurImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getTestSuperieur()
		 * @generated
		 */
		EClass TEST_SUPERIEUR = eINSTANCE.getTestSuperieur();

		/**
		 * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_SUPERIEUR__VALEUR = eINSTANCE.getTestSuperieur_Valeur();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.TestEgaliteImpl <em>Test Egalite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.TestEgaliteImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getTestEgalite()
		 * @generated
		 */
		EClass TEST_EGALITE = eINSTANCE.getTestEgalite();

		/**
		 * The meta object literal for the '<em><b>Egal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_EGALITE__EGAL = eINSTANCE.getTestEgalite_Egal();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.TypeSaisieNumeriqueImpl <em>Type Saisie Numerique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.TypeSaisieNumeriqueImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getTypeSaisieNumerique()
		 * @generated
		 */
		EClass TYPE_SAISIE_NUMERIQUE = eINSTANCE.getTypeSaisieNumerique();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.TypeSaisieAlphaNumeriqueImpl <em>Type Saisie Alpha Numerique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.TypeSaisieAlphaNumeriqueImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getTypeSaisieAlphaNumerique()
		 * @generated
		 */
		EClass TYPE_SAISIE_ALPHA_NUMERIQUE = eINSTANCE.getTypeSaisieAlphaNumerique();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.TypeSaisieAlphaImpl <em>Type Saisie Alpha</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.TypeSaisieAlphaImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getTypeSaisieAlpha()
		 * @generated
		 */
		EClass TYPE_SAISIE_ALPHA = eINSTANCE.getTypeSaisieAlpha();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.TypeSaisieAllImpl <em>Type Saisie All</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.TypeSaisieAllImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getTypeSaisieAll()
		 * @generated
		 */
		EClass TYPE_SAISIE_ALL = eINSTANCE.getTypeSaisieAll();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.TypeSaisieImpl <em>Type Saisie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.TypeSaisieImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getTypeSaisie()
		 * @generated
		 */
		EClass TYPE_SAISIE = eINSTANCE.getTypeSaisie();

		/**
		 * The meta object literal for the '<em><b>Regex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_SAISIE__REGEX = eINSTANCE.getTypeSaisie_Regex();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_SAISIE__MESSAGE = eINSTANCE.getTypeSaisie_Message();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.QuestionImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__QUESTION = eINSTANCE.getQuestion_Question();

		/**
		 * The meta object literal for the '<em><b>Type Saisie</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__TYPE_SAISIE = eINSTANCE.getQuestion_TypeSaisie();

		/**
		 * The meta object literal for the '<em><b>Suite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__SUITE = eINSTANCE.getQuestion_Suite();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.TestImpl <em>Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.TestImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getTest()
		 * @generated
		 */
		EClass TEST = eINSTANCE.getTest();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__DESTINATION = eINSTANCE.getTest_Destination();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.NextImpl <em>Next</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.NextImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getNext()
		 * @generated
		 */
		EClass NEXT = eINSTANCE.getNext();

	}

} //QuestionnairePackage

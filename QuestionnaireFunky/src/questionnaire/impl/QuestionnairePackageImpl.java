/**
 */
package questionnaire.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import questionnaire.Aiguilleur;
import questionnaire.Debut;
import questionnaire.Fin;
import questionnaire.Next;
import questionnaire.Question;
import questionnaire.QuestionOuiNon;
import questionnaire.QuestionOuverte;
import questionnaire.QuestionReponseMultiple;
import questionnaire.Questionnaire;
import questionnaire.QuestionnaireFactory;
import questionnaire.QuestionnairePackage;
import questionnaire.Test;
import questionnaire.TestEgalite;
import questionnaire.TestEntre;
import questionnaire.TestInferieur;
import questionnaire.TestSuperieur;
import questionnaire.Texte;
import questionnaire.TypeSaisie;
import questionnaire.TypeSaisieAll;
import questionnaire.TypeSaisieAlpha;
import questionnaire.TypeSaisieAlphaNumerique;
import questionnaire.TypeSaisieNumerique;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuestionnairePackageImpl extends EPackageImpl implements QuestionnairePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass debutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass texteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionOuverteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionOuiNonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionReponseMultipleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aiguilleurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testEntreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testInferieurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testSuperieurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testEgaliteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeSaisieNumeriqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeSaisieAlphaNumeriqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeSaisieAlphaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeSaisieAllEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeSaisieEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nextEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see questionnaire.QuestionnairePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QuestionnairePackageImpl() {
		super(eNS_URI, QuestionnaireFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QuestionnairePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QuestionnairePackage init() {
		if (isInited) return (QuestionnairePackage)EPackage.Registry.INSTANCE.getEPackage(QuestionnairePackage.eNS_URI);

		// Obtain or create and register package
		QuestionnairePackageImpl theQuestionnairePackage = (QuestionnairePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QuestionnairePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QuestionnairePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theQuestionnairePackage.createPackageContents();

		// Initialize created meta-data
		theQuestionnairePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQuestionnairePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QuestionnairePackage.eNS_URI, theQuestionnairePackage);
		return theQuestionnairePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionnaire() {
		return questionnaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Questions() {
		return (EReference)questionnaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_TypesSaisies() {
		return (EReference)questionnaireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Aiguilleurs() {
		return (EReference)questionnaireEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Tests() {
		return (EReference)questionnaireEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Fin() {
		return (EReference)questionnaireEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Debut() {
		return (EReference)questionnaireEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDebut() {
		return debutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDebut_Nom() {
		return (EAttribute)debutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDebut_PremiereQuestion() {
		return (EReference)debutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFin() {
		return finEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFin_Nom() {
		return (EAttribute)finEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTexte() {
		return texteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionOuverte() {
		return questionOuverteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionOuiNon() {
		return questionOuiNonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionReponseMultiple() {
		return questionReponseMultipleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestionReponseMultiple_ReponsesPossible() {
		return (EAttribute)questionReponseMultipleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAiguilleur() {
		return aiguilleurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAiguilleur_Nom() {
		return (EAttribute)aiguilleurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAiguilleur_Tests() {
		return (EReference)aiguilleurEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAiguilleur_ElseDestination() {
		return (EReference)aiguilleurEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestEntre() {
		return testEntreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestEntre_BorneMinIncluse() {
		return (EAttribute)testEntreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestEntre_BorneMaxExcluse() {
		return (EAttribute)testEntreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestInferieur() {
		return testInferieurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestInferieur_Valeur() {
		return (EAttribute)testInferieurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestSuperieur() {
		return testSuperieurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestSuperieur_Valeur() {
		return (EAttribute)testSuperieurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestEgalite() {
		return testEgaliteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestEgalite_Egal() {
		return (EAttribute)testEgaliteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeSaisieNumerique() {
		return typeSaisieNumeriqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeSaisieAlphaNumerique() {
		return typeSaisieAlphaNumeriqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeSaisieAlpha() {
		return typeSaisieAlphaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeSaisieAll() {
		return typeSaisieAllEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeSaisie() {
		return typeSaisieEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeSaisie_Regex() {
		return (EAttribute)typeSaisieEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeSaisie_Message() {
		return (EAttribute)typeSaisieEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestion() {
		return questionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Question() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Nom() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestion_Suite() {
		return (EReference)questionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestion_TypeSaisie() {
		return (EReference)questionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTest() {
		return testEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTest_Destination() {
		return (EReference)testEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNext() {
		return nextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireFactory getQuestionnaireFactory() {
		return (QuestionnaireFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		questionnaireEClass = createEClass(QUESTIONNAIRE);
		createEReference(questionnaireEClass, QUESTIONNAIRE__QUESTIONS);
		createEReference(questionnaireEClass, QUESTIONNAIRE__TYPES_SAISIES);
		createEReference(questionnaireEClass, QUESTIONNAIRE__AIGUILLEURS);
		createEReference(questionnaireEClass, QUESTIONNAIRE__TESTS);
		createEReference(questionnaireEClass, QUESTIONNAIRE__FIN);
		createEReference(questionnaireEClass, QUESTIONNAIRE__DEBUT);

		debutEClass = createEClass(DEBUT);
		createEAttribute(debutEClass, DEBUT__NOM);
		createEReference(debutEClass, DEBUT__PREMIERE_QUESTION);

		finEClass = createEClass(FIN);
		createEAttribute(finEClass, FIN__NOM);

		texteEClass = createEClass(TEXTE);

		questionOuverteEClass = createEClass(QUESTION_OUVERTE);

		questionOuiNonEClass = createEClass(QUESTION_OUI_NON);

		questionReponseMultipleEClass = createEClass(QUESTION_REPONSE_MULTIPLE);
		createEAttribute(questionReponseMultipleEClass, QUESTION_REPONSE_MULTIPLE__REPONSES_POSSIBLE);

		aiguilleurEClass = createEClass(AIGUILLEUR);
		createEAttribute(aiguilleurEClass, AIGUILLEUR__NOM);
		createEReference(aiguilleurEClass, AIGUILLEUR__TESTS);
		createEReference(aiguilleurEClass, AIGUILLEUR__ELSE_DESTINATION);

		testEntreEClass = createEClass(TEST_ENTRE);
		createEAttribute(testEntreEClass, TEST_ENTRE__BORNE_MIN_INCLUSE);
		createEAttribute(testEntreEClass, TEST_ENTRE__BORNE_MAX_EXCLUSE);

		testInferieurEClass = createEClass(TEST_INFERIEUR);
		createEAttribute(testInferieurEClass, TEST_INFERIEUR__VALEUR);

		testSuperieurEClass = createEClass(TEST_SUPERIEUR);
		createEAttribute(testSuperieurEClass, TEST_SUPERIEUR__VALEUR);

		testEgaliteEClass = createEClass(TEST_EGALITE);
		createEAttribute(testEgaliteEClass, TEST_EGALITE__EGAL);

		typeSaisieNumeriqueEClass = createEClass(TYPE_SAISIE_NUMERIQUE);

		typeSaisieAlphaNumeriqueEClass = createEClass(TYPE_SAISIE_ALPHA_NUMERIQUE);

		typeSaisieAlphaEClass = createEClass(TYPE_SAISIE_ALPHA);

		typeSaisieAllEClass = createEClass(TYPE_SAISIE_ALL);

		typeSaisieEClass = createEClass(TYPE_SAISIE);
		createEAttribute(typeSaisieEClass, TYPE_SAISIE__REGEX);
		createEAttribute(typeSaisieEClass, TYPE_SAISIE__MESSAGE);

		questionEClass = createEClass(QUESTION);
		createEAttribute(questionEClass, QUESTION__QUESTION);
		createEAttribute(questionEClass, QUESTION__NOM);
		createEReference(questionEClass, QUESTION__SUITE);
		createEReference(questionEClass, QUESTION__TYPE_SAISIE);

		testEClass = createEClass(TEST);
		createEReference(testEClass, TEST__DESTINATION);

		nextEClass = createEClass(NEXT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		finEClass.getESuperTypes().add(this.getNext());
		texteEClass.getESuperTypes().add(this.getQuestion());
		questionOuverteEClass.getESuperTypes().add(this.getQuestion());
		questionOuiNonEClass.getESuperTypes().add(this.getQuestion());
		questionReponseMultipleEClass.getESuperTypes().add(this.getQuestion());
		aiguilleurEClass.getESuperTypes().add(this.getNext());
		testEntreEClass.getESuperTypes().add(this.getTest());
		testInferieurEClass.getESuperTypes().add(this.getTest());
		testSuperieurEClass.getESuperTypes().add(this.getTest());
		testEgaliteEClass.getESuperTypes().add(this.getTest());
		typeSaisieNumeriqueEClass.getESuperTypes().add(this.getTypeSaisie());
		typeSaisieAlphaNumeriqueEClass.getESuperTypes().add(this.getTypeSaisie());
		typeSaisieAlphaEClass.getESuperTypes().add(this.getTypeSaisie());
		typeSaisieAllEClass.getESuperTypes().add(this.getTypeSaisie());
		questionEClass.getESuperTypes().add(this.getNext());

		// Initialize classes and features; add operations and parameters
		initEClass(questionnaireEClass, Questionnaire.class, "Questionnaire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuestionnaire_Questions(), this.getQuestion(), null, "questions", null, 0, -1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionnaire_TypesSaisies(), this.getTypeSaisie(), null, "typesSaisies", null, 0, -1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionnaire_Aiguilleurs(), this.getAiguilleur(), null, "aiguilleurs", null, 0, -1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionnaire_Tests(), this.getTest(), null, "tests", null, 0, -1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionnaire_Fin(), this.getFin(), null, "fin", null, 0, 1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionnaire_Debut(), this.getDebut(), null, "debut", null, 0, 1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(debutEClass, Debut.class, "Debut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDebut_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Debut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDebut_PremiereQuestion(), this.getQuestion(), null, "premiereQuestion", null, 0, 1, Debut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(finEClass, Fin.class, "Fin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFin_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Fin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(texteEClass, Texte.class, "Texte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(questionOuverteEClass, QuestionOuverte.class, "QuestionOuverte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(questionOuiNonEClass, QuestionOuiNon.class, "QuestionOuiNon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(questionReponseMultipleEClass, QuestionReponseMultiple.class, "QuestionReponseMultiple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestionReponseMultiple_ReponsesPossible(), ecorePackage.getEString(), "reponsesPossible", null, 0, -1, QuestionReponseMultiple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aiguilleurEClass, Aiguilleur.class, "Aiguilleur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAiguilleur_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Aiguilleur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAiguilleur_Tests(), this.getTest(), null, "tests", null, 0, -1, Aiguilleur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAiguilleur_ElseDestination(), this.getNext(), null, "elseDestination", null, 0, 1, Aiguilleur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testEntreEClass, TestEntre.class, "TestEntre", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestEntre_BorneMinIncluse(), ecorePackage.getEInt(), "borneMinIncluse", null, 0, 1, TestEntre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestEntre_BorneMaxExcluse(), ecorePackage.getEInt(), "borneMaxExcluse", null, 0, 1, TestEntre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testInferieurEClass, TestInferieur.class, "TestInferieur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestInferieur_Valeur(), ecorePackage.getEInt(), "valeur", null, 0, 1, TestInferieur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testSuperieurEClass, TestSuperieur.class, "TestSuperieur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestSuperieur_Valeur(), ecorePackage.getEInt(), "valeur", null, 0, 1, TestSuperieur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testEgaliteEClass, TestEgalite.class, "TestEgalite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestEgalite_Egal(), ecorePackage.getEString(), "egal", null, 0, 1, TestEgalite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeSaisieNumeriqueEClass, TypeSaisieNumerique.class, "TypeSaisieNumerique", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeSaisieAlphaNumeriqueEClass, TypeSaisieAlphaNumerique.class, "TypeSaisieAlphaNumerique", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeSaisieAlphaEClass, TypeSaisieAlpha.class, "TypeSaisieAlpha", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeSaisieAllEClass, TypeSaisieAll.class, "TypeSaisieAll", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeSaisieEClass, TypeSaisie.class, "TypeSaisie", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeSaisie_Regex(), ecorePackage.getEString(), "regex", null, 0, 1, TypeSaisie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeSaisie_Message(), ecorePackage.getEString(), "message", null, 0, 1, TypeSaisie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionEClass, Question.class, "Question", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestion_Question(), ecorePackage.getEString(), "question", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestion_Suite(), this.getNext(), null, "suite", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestion_TypeSaisie(), this.getTypeSaisie(), null, "typeSaisie", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testEClass, Test.class, "Test", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTest_Destination(), this.getNext(), null, "destination", null, 0, 1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nextEClass, Next.class, "Next", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.link
		createGmf_3Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (questionnaireEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (debutEClass, 
		   source, 
		   new String[] {
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/QuestionnaireFunky/model/img/start.svg",
			 "label", "nom",
			 "label.text", "debut",
			 "label.readOnly", "true"
		   });	
		addAnnotation
		  (finEClass, 
		   source, 
		   new String[] {
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/QuestionnaireFunky/model/img/end.svg",
			 "label", "nom",
			 "label.text", "fin",
			 "label.readOnly", "true"
		   });	
		addAnnotation
		  (texteEClass, 
		   source, 
		   new String[] {
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/QuestionnaireFunky/model/img/text.svg"
		   });	
		addAnnotation
		  (aiguilleurEClass, 
		   source, 
		   new String[] {
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/QuestionnaireFunky/model/img/switch.svg",
			 "label", "nom",
			 "label.text", "si",
			 "label.readOnly", "true"
		   });	
		addAnnotation
		  (testEntreEClass, 
		   source, 
		   new String[] {
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/QuestionnaireFunky/model/img/brackets.svg",
			 "label", "borneMinIncluse, borneMaxExcluse"
		   });	
		addAnnotation
		  (testInferieurEClass, 
		   source, 
		   new String[] {
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/QuestionnaireFunky/model/img/lessThan.svg",
			 "label", "valeur"
		   });	
		addAnnotation
		  (testSuperieurEClass, 
		   source, 
		   new String[] {
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/QuestionnaireFunky/model/img/greaterThanOrEqual.svg",
			 "label", "valeur"
		   });	
		addAnnotation
		  (testEgaliteEClass, 
		   source, 
		   new String[] {
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/QuestionnaireFunky/model/img/equal.svg",
			 "label", "egal"
		   });	
		addAnnotation
		  (typeSaisieNumeriqueEClass, 
		   source, 
		   new String[] {
			 "label", "regex",
			 "label.text", "[0-9]",
			 "label.readOnly", "true"
		   });	
		addAnnotation
		  (typeSaisieAlphaNumeriqueEClass, 
		   source, 
		   new String[] {
			 "label", "regex",
			 "label.text", "[a-zA-Z0-9]",
			 "label.readOnly", "true"
		   });	
		addAnnotation
		  (typeSaisieAlphaEClass, 
		   source, 
		   new String[] {
			 "label", "regex",
			 "label.text", "[a-zA-Z]",
			 "label.readOnly", "true"
		   });	
		addAnnotation
		  (typeSaisieAllEClass, 
		   source, 
		   new String[] {
			 "label", "regex",
			 "label.text", "[*]",
			 "label.readOnly", "true"
		   });	
		addAnnotation
		  (questionEClass, 
		   source, 
		   new String[] {
			 "figure", "svg",
			 "svg.uri", "platform:/plugin/QuestionnaireFunky/model/img/questionMark.svg",
			 "label", "question"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (getDebut_PremiereQuestion(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow"
		   });	
		addAnnotation
		  (getAiguilleur_Tests(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow"
		   });	
		addAnnotation
		  (getAiguilleur_ElseDestination(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow"
		   });	
		addAnnotation
		  (getQuestion_Suite(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow"
		   });	
		addAnnotation
		  (getQuestion_TypeSaisie(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow"
		   });	
		addAnnotation
		  (getTest_Destination(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow"
		   });
	}

} //QuestionnairePackageImpl

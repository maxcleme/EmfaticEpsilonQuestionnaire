/**
 */
package questionnaire;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see questionnaire.QuestionnairePackage
 * @generated
 */
public interface QuestionnaireFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QuestionnaireFactory eINSTANCE = questionnaire.impl.QuestionnaireFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Questionnaire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire</em>'.
	 * @generated
	 */
	Questionnaire createQuestionnaire();

	/**
	 * Returns a new object of class '<em>Debut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Debut</em>'.
	 * @generated
	 */
	Debut createDebut();

	/**
	 * Returns a new object of class '<em>Fin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fin</em>'.
	 * @generated
	 */
	Fin createFin();

	/**
	 * Returns a new object of class '<em>Texte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Texte</em>'.
	 * @generated
	 */
	Texte createTexte();

	/**
	 * Returns a new object of class '<em>Question Ouverte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question Ouverte</em>'.
	 * @generated
	 */
	QuestionOuverte createQuestionOuverte();

	/**
	 * Returns a new object of class '<em>Question Oui Non</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question Oui Non</em>'.
	 * @generated
	 */
	QuestionOuiNon createQuestionOuiNon();

	/**
	 * Returns a new object of class '<em>Question Reponse Multiple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question Reponse Multiple</em>'.
	 * @generated
	 */
	QuestionReponseMultiple createQuestionReponseMultiple();

	/**
	 * Returns a new object of class '<em>Aiguilleur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aiguilleur</em>'.
	 * @generated
	 */
	Aiguilleur createAiguilleur();

	/**
	 * Returns a new object of class '<em>Test Entre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Entre</em>'.
	 * @generated
	 */
	TestEntre createTestEntre();

	/**
	 * Returns a new object of class '<em>Test Inferieur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Inferieur</em>'.
	 * @generated
	 */
	TestInferieur createTestInferieur();

	/**
	 * Returns a new object of class '<em>Test Superieur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Superieur</em>'.
	 * @generated
	 */
	TestSuperieur createTestSuperieur();

	/**
	 * Returns a new object of class '<em>Test Egalite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Egalite</em>'.
	 * @generated
	 */
	TestEgalite createTestEgalite();

	/**
	 * Returns a new object of class '<em>Type Saisie Numerique</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Saisie Numerique</em>'.
	 * @generated
	 */
	TypeSaisieNumerique createTypeSaisieNumerique();

	/**
	 * Returns a new object of class '<em>Type Saisie Alpha Numerique</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Saisie Alpha Numerique</em>'.
	 * @generated
	 */
	TypeSaisieAlphaNumerique createTypeSaisieAlphaNumerique();

	/**
	 * Returns a new object of class '<em>Type Saisie Alpha</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Saisie Alpha</em>'.
	 * @generated
	 */
	TypeSaisieAlpha createTypeSaisieAlpha();

	/**
	 * Returns a new object of class '<em>Type Saisie All</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Saisie All</em>'.
	 * @generated
	 */
	TypeSaisieAll createTypeSaisieAll();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QuestionnairePackage getQuestionnairePackage();

} //QuestionnaireFactory

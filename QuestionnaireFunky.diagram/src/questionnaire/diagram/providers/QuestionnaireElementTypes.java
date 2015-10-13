/*
 * 
 */
package questionnaire.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import questionnaire.QuestionnairePackage;
import questionnaire.diagram.edit.parts.AiguilleurEditPart;
import questionnaire.diagram.edit.parts.AiguilleurElseDestinationEditPart;
import questionnaire.diagram.edit.parts.AiguilleurTestsEditPart;
import questionnaire.diagram.edit.parts.DebutEditPart;
import questionnaire.diagram.edit.parts.DebutPremiereQuestionEditPart;
import questionnaire.diagram.edit.parts.FinEditPart;
import questionnaire.diagram.edit.parts.QuestionOuiNonEditPart;
import questionnaire.diagram.edit.parts.QuestionOuverteEditPart;
import questionnaire.diagram.edit.parts.QuestionReponseMultipleEditPart;
import questionnaire.diagram.edit.parts.QuestionSuiteEditPart;
import questionnaire.diagram.edit.parts.QuestionTypeSaisieEditPart;
import questionnaire.diagram.edit.parts.QuestionnaireEditPart;
import questionnaire.diagram.edit.parts.TestDestinationEditPart;
import questionnaire.diagram.edit.parts.TestEgaliteEditPart;
import questionnaire.diagram.edit.parts.TestEntreEditPart;
import questionnaire.diagram.edit.parts.TestInferieurEditPart;
import questionnaire.diagram.edit.parts.TestSuperieurEditPart;
import questionnaire.diagram.edit.parts.TexteEditPart;
import questionnaire.diagram.edit.parts.TypeSaisieAllEditPart;
import questionnaire.diagram.edit.parts.TypeSaisieAlphaEditPart;
import questionnaire.diagram.edit.parts.TypeSaisieAlphaNumeriqueEditPart;
import questionnaire.diagram.edit.parts.TypeSaisieNumeriqueEditPart;
import questionnaire.diagram.part.QuestionnaireDiagramEditorPlugin;

/**
 * @generated
 */
public class QuestionnaireElementTypes {

	/**
	 * @generated
	 */
	private QuestionnaireElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			QuestionnaireDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Questionnaire_1000 = getElementType("QuestionnaireFunky.diagram.Questionnaire_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Texte_2001 = getElementType("QuestionnaireFunky.diagram.Texte_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType QuestionOuverte_2002 = getElementType("QuestionnaireFunky.diagram.QuestionOuverte_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType QuestionOuiNon_2003 = getElementType("QuestionnaireFunky.diagram.QuestionOuiNon_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType QuestionReponseMultiple_2004 = getElementType("QuestionnaireFunky.diagram.QuestionReponseMultiple_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TypeSaisieNumerique_2005 = getElementType("QuestionnaireFunky.diagram.TypeSaisieNumerique_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TypeSaisieAlphaNumerique_2006 = getElementType("QuestionnaireFunky.diagram.TypeSaisieAlphaNumerique_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TypeSaisieAlpha_2007 = getElementType("QuestionnaireFunky.diagram.TypeSaisieAlpha_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TypeSaisieAll_2008 = getElementType("QuestionnaireFunky.diagram.TypeSaisieAll_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Aiguilleur_2009 = getElementType("QuestionnaireFunky.diagram.Aiguilleur_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TestEntre_2010 = getElementType("QuestionnaireFunky.diagram.TestEntre_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TestInferieur_2011 = getElementType("QuestionnaireFunky.diagram.TestInferieur_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TestSuperieur_2012 = getElementType("QuestionnaireFunky.diagram.TestSuperieur_2012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TestEgalite_2013 = getElementType("QuestionnaireFunky.diagram.TestEgalite_2013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Fin_2014 = getElementType("QuestionnaireFunky.diagram.Fin_2014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Debut_2015 = getElementType("QuestionnaireFunky.diagram.Debut_2015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DebutPremiereQuestion_4001 = getElementType("QuestionnaireFunky.diagram.DebutPremiereQuestion_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AiguilleurTests_4002 = getElementType("QuestionnaireFunky.diagram.AiguilleurTests_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AiguilleurElseDestination_4003 = getElementType("QuestionnaireFunky.diagram.AiguilleurElseDestination_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType QuestionSuite_4004 = getElementType("QuestionnaireFunky.diagram.QuestionSuite_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType QuestionTypeSaisie_4005 = getElementType("QuestionnaireFunky.diagram.QuestionTypeSaisie_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TestDestination_4006 = getElementType("QuestionnaireFunky.diagram.TestDestination_4006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Questionnaire_1000,
					QuestionnairePackage.eINSTANCE.getQuestionnaire());

			elements.put(Texte_2001, QuestionnairePackage.eINSTANCE.getTexte());

			elements.put(QuestionOuverte_2002,
					QuestionnairePackage.eINSTANCE.getQuestionOuverte());

			elements.put(QuestionOuiNon_2003,
					QuestionnairePackage.eINSTANCE.getQuestionOuiNon());

			elements.put(QuestionReponseMultiple_2004,
					QuestionnairePackage.eINSTANCE.getQuestionReponseMultiple());

			elements.put(TypeSaisieNumerique_2005,
					QuestionnairePackage.eINSTANCE.getTypeSaisieNumerique());

			elements.put(TypeSaisieAlphaNumerique_2006,
					QuestionnairePackage.eINSTANCE
							.getTypeSaisieAlphaNumerique());

			elements.put(TypeSaisieAlpha_2007,
					QuestionnairePackage.eINSTANCE.getTypeSaisieAlpha());

			elements.put(TypeSaisieAll_2008,
					QuestionnairePackage.eINSTANCE.getTypeSaisieAll());

			elements.put(Aiguilleur_2009,
					QuestionnairePackage.eINSTANCE.getAiguilleur());

			elements.put(TestEntre_2010,
					QuestionnairePackage.eINSTANCE.getTestEntre());

			elements.put(TestInferieur_2011,
					QuestionnairePackage.eINSTANCE.getTestInferieur());

			elements.put(TestSuperieur_2012,
					QuestionnairePackage.eINSTANCE.getTestSuperieur());

			elements.put(TestEgalite_2013,
					QuestionnairePackage.eINSTANCE.getTestEgalite());

			elements.put(Fin_2014, QuestionnairePackage.eINSTANCE.getFin());

			elements.put(Debut_2015, QuestionnairePackage.eINSTANCE.getDebut());

			elements.put(DebutPremiereQuestion_4001,
					QuestionnairePackage.eINSTANCE.getDebut_PremiereQuestion());

			elements.put(AiguilleurTests_4002,
					QuestionnairePackage.eINSTANCE.getAiguilleur_Tests());

			elements.put(AiguilleurElseDestination_4003,
					QuestionnairePackage.eINSTANCE
							.getAiguilleur_ElseDestination());

			elements.put(QuestionSuite_4004,
					QuestionnairePackage.eINSTANCE.getQuestion_Suite());

			elements.put(QuestionTypeSaisie_4005,
					QuestionnairePackage.eINSTANCE.getQuestion_TypeSaisie());

			elements.put(TestDestination_4006,
					QuestionnairePackage.eINSTANCE.getTest_Destination());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Questionnaire_1000);
			KNOWN_ELEMENT_TYPES.add(Texte_2001);
			KNOWN_ELEMENT_TYPES.add(QuestionOuverte_2002);
			KNOWN_ELEMENT_TYPES.add(QuestionOuiNon_2003);
			KNOWN_ELEMENT_TYPES.add(QuestionReponseMultiple_2004);
			KNOWN_ELEMENT_TYPES.add(TypeSaisieNumerique_2005);
			KNOWN_ELEMENT_TYPES.add(TypeSaisieAlphaNumerique_2006);
			KNOWN_ELEMENT_TYPES.add(TypeSaisieAlpha_2007);
			KNOWN_ELEMENT_TYPES.add(TypeSaisieAll_2008);
			KNOWN_ELEMENT_TYPES.add(Aiguilleur_2009);
			KNOWN_ELEMENT_TYPES.add(TestEntre_2010);
			KNOWN_ELEMENT_TYPES.add(TestInferieur_2011);
			KNOWN_ELEMENT_TYPES.add(TestSuperieur_2012);
			KNOWN_ELEMENT_TYPES.add(TestEgalite_2013);
			KNOWN_ELEMENT_TYPES.add(Fin_2014);
			KNOWN_ELEMENT_TYPES.add(Debut_2015);
			KNOWN_ELEMENT_TYPES.add(DebutPremiereQuestion_4001);
			KNOWN_ELEMENT_TYPES.add(AiguilleurTests_4002);
			KNOWN_ELEMENT_TYPES.add(AiguilleurElseDestination_4003);
			KNOWN_ELEMENT_TYPES.add(QuestionSuite_4004);
			KNOWN_ELEMENT_TYPES.add(QuestionTypeSaisie_4005);
			KNOWN_ELEMENT_TYPES.add(TestDestination_4006);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case QuestionnaireEditPart.VISUAL_ID:
			return Questionnaire_1000;
		case TexteEditPart.VISUAL_ID:
			return Texte_2001;
		case QuestionOuverteEditPart.VISUAL_ID:
			return QuestionOuverte_2002;
		case QuestionOuiNonEditPart.VISUAL_ID:
			return QuestionOuiNon_2003;
		case QuestionReponseMultipleEditPart.VISUAL_ID:
			return QuestionReponseMultiple_2004;
		case TypeSaisieNumeriqueEditPart.VISUAL_ID:
			return TypeSaisieNumerique_2005;
		case TypeSaisieAlphaNumeriqueEditPart.VISUAL_ID:
			return TypeSaisieAlphaNumerique_2006;
		case TypeSaisieAlphaEditPart.VISUAL_ID:
			return TypeSaisieAlpha_2007;
		case TypeSaisieAllEditPart.VISUAL_ID:
			return TypeSaisieAll_2008;
		case AiguilleurEditPart.VISUAL_ID:
			return Aiguilleur_2009;
		case TestEntreEditPart.VISUAL_ID:
			return TestEntre_2010;
		case TestInferieurEditPart.VISUAL_ID:
			return TestInferieur_2011;
		case TestSuperieurEditPart.VISUAL_ID:
			return TestSuperieur_2012;
		case TestEgaliteEditPart.VISUAL_ID:
			return TestEgalite_2013;
		case FinEditPart.VISUAL_ID:
			return Fin_2014;
		case DebutEditPart.VISUAL_ID:
			return Debut_2015;
		case DebutPremiereQuestionEditPart.VISUAL_ID:
			return DebutPremiereQuestion_4001;
		case AiguilleurTestsEditPart.VISUAL_ID:
			return AiguilleurTests_4002;
		case AiguilleurElseDestinationEditPart.VISUAL_ID:
			return AiguilleurElseDestination_4003;
		case QuestionSuiteEditPart.VISUAL_ID:
			return QuestionSuite_4004;
		case QuestionTypeSaisieEditPart.VISUAL_ID:
			return QuestionTypeSaisie_4005;
		case TestDestinationEditPart.VISUAL_ID:
			return TestDestination_4006;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return questionnaire.diagram.providers.QuestionnaireElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return questionnaire.diagram.providers.QuestionnaireElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return questionnaire.diagram.providers.QuestionnaireElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}

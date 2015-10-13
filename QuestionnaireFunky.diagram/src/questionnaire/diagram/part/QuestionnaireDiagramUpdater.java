/*
 * 
 */
package questionnaire.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import questionnaire.Aiguilleur;
import questionnaire.Debut;
import questionnaire.Fin;
import questionnaire.Next;
import questionnaire.Question;
import questionnaire.QuestionOuiNon;
import questionnaire.QuestionOuverte;
import questionnaire.QuestionReponseMultiple;
import questionnaire.Questionnaire;
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
import questionnaire.diagram.providers.QuestionnaireElementTypes;

/**
 * @generated
 */
public class QuestionnaireDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireNodeDescriptor> getSemanticChildren(
			View view) {
		switch (QuestionnaireVisualIDRegistry.getVisualID(view)) {
		case QuestionnaireEditPart.VISUAL_ID:
			return getQuestionnaire_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireNodeDescriptor> getQuestionnaire_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Questionnaire modelElement = (Questionnaire) view.getElement();
		LinkedList<QuestionnaireNodeDescriptor> result = new LinkedList<QuestionnaireNodeDescriptor>();
		for (Iterator<?> it = modelElement.getQuestions().iterator(); it
				.hasNext();) {
			Question childElement = (Question) it.next();
			int visualID = QuestionnaireVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TexteEditPart.VISUAL_ID) {
				result.add(new QuestionnaireNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == QuestionOuverteEditPart.VISUAL_ID) {
				result.add(new QuestionnaireNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == QuestionOuiNonEditPart.VISUAL_ID) {
				result.add(new QuestionnaireNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == QuestionReponseMultipleEditPart.VISUAL_ID) {
				result.add(new QuestionnaireNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTypesSaisies().iterator(); it
				.hasNext();) {
			TypeSaisie childElement = (TypeSaisie) it.next();
			int visualID = QuestionnaireVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TypeSaisieNumeriqueEditPart.VISUAL_ID) {
				result.add(new QuestionnaireNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == TypeSaisieAlphaNumeriqueEditPart.VISUAL_ID) {
				result.add(new QuestionnaireNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == TypeSaisieAlphaEditPart.VISUAL_ID) {
				result.add(new QuestionnaireNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == TypeSaisieAllEditPart.VISUAL_ID) {
				result.add(new QuestionnaireNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getAiguilleurs().iterator(); it
				.hasNext();) {
			Aiguilleur childElement = (Aiguilleur) it.next();
			int visualID = QuestionnaireVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AiguilleurEditPart.VISUAL_ID) {
				result.add(new QuestionnaireNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTests().iterator(); it.hasNext();) {
			Test childElement = (Test) it.next();
			int visualID = QuestionnaireVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TestEntreEditPart.VISUAL_ID) {
				result.add(new QuestionnaireNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == TestInferieurEditPart.VISUAL_ID) {
				result.add(new QuestionnaireNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == TestSuperieurEditPart.VISUAL_ID) {
				result.add(new QuestionnaireNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == TestEgaliteEditPart.VISUAL_ID) {
				result.add(new QuestionnaireNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		{
			Fin childElement = modelElement.getFin();
			int visualID = QuestionnaireVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FinEditPart.VISUAL_ID) {
				result.add(new QuestionnaireNodeDescriptor(childElement,
						visualID));
			}
		}
		{
			Debut childElement = modelElement.getDebut();
			int visualID = QuestionnaireVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DebutEditPart.VISUAL_ID) {
				result.add(new QuestionnaireNodeDescriptor(childElement,
						visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getContainedLinks(View view) {
		switch (QuestionnaireVisualIDRegistry.getVisualID(view)) {
		case QuestionnaireEditPart.VISUAL_ID:
			return getQuestionnaire_1000ContainedLinks(view);
		case TexteEditPart.VISUAL_ID:
			return getTexte_2001ContainedLinks(view);
		case QuestionOuverteEditPart.VISUAL_ID:
			return getQuestionOuverte_2002ContainedLinks(view);
		case QuestionOuiNonEditPart.VISUAL_ID:
			return getQuestionOuiNon_2003ContainedLinks(view);
		case QuestionReponseMultipleEditPart.VISUAL_ID:
			return getQuestionReponseMultiple_2004ContainedLinks(view);
		case TypeSaisieNumeriqueEditPart.VISUAL_ID:
			return getTypeSaisieNumerique_2005ContainedLinks(view);
		case TypeSaisieAlphaNumeriqueEditPart.VISUAL_ID:
			return getTypeSaisieAlphaNumerique_2006ContainedLinks(view);
		case TypeSaisieAlphaEditPart.VISUAL_ID:
			return getTypeSaisieAlpha_2007ContainedLinks(view);
		case TypeSaisieAllEditPart.VISUAL_ID:
			return getTypeSaisieAll_2008ContainedLinks(view);
		case AiguilleurEditPart.VISUAL_ID:
			return getAiguilleur_2009ContainedLinks(view);
		case TestEntreEditPart.VISUAL_ID:
			return getTestEntre_2010ContainedLinks(view);
		case TestInferieurEditPart.VISUAL_ID:
			return getTestInferieur_2011ContainedLinks(view);
		case TestSuperieurEditPart.VISUAL_ID:
			return getTestSuperieur_2012ContainedLinks(view);
		case TestEgaliteEditPart.VISUAL_ID:
			return getTestEgalite_2013ContainedLinks(view);
		case FinEditPart.VISUAL_ID:
			return getFin_2014ContainedLinks(view);
		case DebutEditPart.VISUAL_ID:
			return getDebut_2015ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getIncomingLinks(View view) {
		switch (QuestionnaireVisualIDRegistry.getVisualID(view)) {
		case TexteEditPart.VISUAL_ID:
			return getTexte_2001IncomingLinks(view);
		case QuestionOuverteEditPart.VISUAL_ID:
			return getQuestionOuverte_2002IncomingLinks(view);
		case QuestionOuiNonEditPart.VISUAL_ID:
			return getQuestionOuiNon_2003IncomingLinks(view);
		case QuestionReponseMultipleEditPart.VISUAL_ID:
			return getQuestionReponseMultiple_2004IncomingLinks(view);
		case TypeSaisieNumeriqueEditPart.VISUAL_ID:
			return getTypeSaisieNumerique_2005IncomingLinks(view);
		case TypeSaisieAlphaNumeriqueEditPart.VISUAL_ID:
			return getTypeSaisieAlphaNumerique_2006IncomingLinks(view);
		case TypeSaisieAlphaEditPart.VISUAL_ID:
			return getTypeSaisieAlpha_2007IncomingLinks(view);
		case TypeSaisieAllEditPart.VISUAL_ID:
			return getTypeSaisieAll_2008IncomingLinks(view);
		case AiguilleurEditPart.VISUAL_ID:
			return getAiguilleur_2009IncomingLinks(view);
		case TestEntreEditPart.VISUAL_ID:
			return getTestEntre_2010IncomingLinks(view);
		case TestInferieurEditPart.VISUAL_ID:
			return getTestInferieur_2011IncomingLinks(view);
		case TestSuperieurEditPart.VISUAL_ID:
			return getTestSuperieur_2012IncomingLinks(view);
		case TestEgaliteEditPart.VISUAL_ID:
			return getTestEgalite_2013IncomingLinks(view);
		case FinEditPart.VISUAL_ID:
			return getFin_2014IncomingLinks(view);
		case DebutEditPart.VISUAL_ID:
			return getDebut_2015IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getOutgoingLinks(View view) {
		switch (QuestionnaireVisualIDRegistry.getVisualID(view)) {
		case TexteEditPart.VISUAL_ID:
			return getTexte_2001OutgoingLinks(view);
		case QuestionOuverteEditPart.VISUAL_ID:
			return getQuestionOuverte_2002OutgoingLinks(view);
		case QuestionOuiNonEditPart.VISUAL_ID:
			return getQuestionOuiNon_2003OutgoingLinks(view);
		case QuestionReponseMultipleEditPart.VISUAL_ID:
			return getQuestionReponseMultiple_2004OutgoingLinks(view);
		case TypeSaisieNumeriqueEditPart.VISUAL_ID:
			return getTypeSaisieNumerique_2005OutgoingLinks(view);
		case TypeSaisieAlphaNumeriqueEditPart.VISUAL_ID:
			return getTypeSaisieAlphaNumerique_2006OutgoingLinks(view);
		case TypeSaisieAlphaEditPart.VISUAL_ID:
			return getTypeSaisieAlpha_2007OutgoingLinks(view);
		case TypeSaisieAllEditPart.VISUAL_ID:
			return getTypeSaisieAll_2008OutgoingLinks(view);
		case AiguilleurEditPart.VISUAL_ID:
			return getAiguilleur_2009OutgoingLinks(view);
		case TestEntreEditPart.VISUAL_ID:
			return getTestEntre_2010OutgoingLinks(view);
		case TestInferieurEditPart.VISUAL_ID:
			return getTestInferieur_2011OutgoingLinks(view);
		case TestSuperieurEditPart.VISUAL_ID:
			return getTestSuperieur_2012OutgoingLinks(view);
		case TestEgaliteEditPart.VISUAL_ID:
			return getTestEgalite_2013OutgoingLinks(view);
		case FinEditPart.VISUAL_ID:
			return getFin_2014OutgoingLinks(view);
		case DebutEditPart.VISUAL_ID:
			return getDebut_2015OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getQuestionnaire_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getTexte_2001ContainedLinks(
			View view) {
		Texte modelElement = (Texte) view.getElement();
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Question_Suite_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Question_TypeSaisie_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getQuestionOuverte_2002ContainedLinks(
			View view) {
		QuestionOuverte modelElement = (QuestionOuverte) view.getElement();
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Question_Suite_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Question_TypeSaisie_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getQuestionOuiNon_2003ContainedLinks(
			View view) {
		QuestionOuiNon modelElement = (QuestionOuiNon) view.getElement();
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Question_Suite_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Question_TypeSaisie_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getQuestionReponseMultiple_2004ContainedLinks(
			View view) {
		QuestionReponseMultiple modelElement = (QuestionReponseMultiple) view
				.getElement();
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Question_Suite_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Question_TypeSaisie_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getTypeSaisieNumerique_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getTypeSaisieAlphaNumerique_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getTypeSaisieAlpha_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getTypeSaisieAll_2008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getAiguilleur_2009ContainedLinks(
			View view) {
		Aiguilleur modelElement = (Aiguilleur) view.getElement();
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Aiguilleur_Tests_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Aiguilleur_ElseDestination_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getTestEntre_2010ContainedLinks(
			View view) {
		TestEntre modelElement = (TestEntre) view.getElement();
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Test_Destination_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getTestInferieur_2011ContainedLinks(
			View view) {
		TestInferieur modelElement = (TestInferieur) view.getElement();
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Test_Destination_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getTestSuperieur_2012ContainedLinks(
			View view) {
		TestSuperieur modelElement = (TestSuperieur) view.getElement();
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Test_Destination_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getTestEgalite_2013ContainedLinks(
			View view) {
		TestEgalite modelElement = (TestEgalite) view.getElement();
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Test_Destination_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getFin_2014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getDebut_2015ContainedLinks(
			View view) {
		Debut modelElement = (Debut) view.getElement();
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Debut_PremiereQuestion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getTexte_2001IncomingLinks(
			View view) {
		Texte modelElement = (Texte) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Debut_PremiereQuestion_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Aiguilleur_ElseDestination_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Question_Suite_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Test_Destination_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getQuestionOuverte_2002IncomingLinks(
			View view) {
		QuestionOuverte modelElement = (QuestionOuverte) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Debut_PremiereQuestion_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Aiguilleur_ElseDestination_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Question_Suite_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Test_Destination_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getQuestionOuiNon_2003IncomingLinks(
			View view) {
		QuestionOuiNon modelElement = (QuestionOuiNon) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Debut_PremiereQuestion_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Aiguilleur_ElseDestination_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Question_Suite_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Test_Destination_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getQuestionReponseMultiple_2004IncomingLinks(
			View view) {
		QuestionReponseMultiple modelElement = (QuestionReponseMultiple) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Debut_PremiereQuestion_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Aiguilleur_ElseDestination_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Question_Suite_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Test_Destination_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getTypeSaisieNumerique_2005IncomingLinks(
			View view) {
		TypeSaisieNumerique modelElement = (TypeSaisieNumerique) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Question_TypeSaisie_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getTypeSaisieAlphaNumerique_2006IncomingLinks(
			View view) {
		TypeSaisieAlphaNumerique modelElement = (TypeSaisieAlphaNumerique) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Question_TypeSaisie_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getTypeSaisieAlpha_2007IncomingLinks(
			View view) {
		TypeSaisieAlpha modelElement = (TypeSaisieAlpha) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Question_TypeSaisie_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getTypeSaisieAll_2008IncomingLinks(
			View view) {
		TypeSaisieAll modelElement = (TypeSaisieAll) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Question_TypeSaisie_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getAiguilleur_2009IncomingLinks(
			View view) {
		Aiguilleur modelElement = (Aiguilleur) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Aiguilleur_ElseDestination_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Question_Suite_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Test_Destination_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getTestEntre_2010IncomingLinks(
			View view) {
		TestEntre modelElement = (TestEntre) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Aiguilleur_Tests_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getTestInferieur_2011IncomingLinks(
			View view) {
		TestInferieur modelElement = (TestInferieur) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Aiguilleur_Tests_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getTestSuperieur_2012IncomingLinks(
			View view) {
		TestSuperieur modelElement = (TestSuperieur) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Aiguilleur_Tests_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getTestEgalite_2013IncomingLinks(
			View view) {
		TestEgalite modelElement = (TestEgalite) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Aiguilleur_Tests_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getFin_2014IncomingLinks(
			View view) {
		Fin modelElement = (Fin) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Aiguilleur_ElseDestination_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Question_Suite_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Test_Destination_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getDebut_2015IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getTexte_2001OutgoingLinks(
			View view) {
		Texte modelElement = (Texte) view.getElement();
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Question_Suite_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Question_TypeSaisie_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getQuestionOuverte_2002OutgoingLinks(
			View view) {
		QuestionOuverte modelElement = (QuestionOuverte) view.getElement();
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Question_Suite_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Question_TypeSaisie_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getQuestionOuiNon_2003OutgoingLinks(
			View view) {
		QuestionOuiNon modelElement = (QuestionOuiNon) view.getElement();
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Question_Suite_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Question_TypeSaisie_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getQuestionReponseMultiple_2004OutgoingLinks(
			View view) {
		QuestionReponseMultiple modelElement = (QuestionReponseMultiple) view
				.getElement();
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Question_Suite_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Question_TypeSaisie_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getTypeSaisieNumerique_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getTypeSaisieAlphaNumerique_2006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getTypeSaisieAlpha_2007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getTypeSaisieAll_2008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getAiguilleur_2009OutgoingLinks(
			View view) {
		Aiguilleur modelElement = (Aiguilleur) view.getElement();
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Aiguilleur_Tests_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Aiguilleur_ElseDestination_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getTestEntre_2010OutgoingLinks(
			View view) {
		TestEntre modelElement = (TestEntre) view.getElement();
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Test_Destination_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getTestInferieur_2011OutgoingLinks(
			View view) {
		TestInferieur modelElement = (TestInferieur) view.getElement();
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Test_Destination_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getTestSuperieur_2012OutgoingLinks(
			View view) {
		TestSuperieur modelElement = (TestSuperieur) view.getElement();
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Test_Destination_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getTestEgalite_2013OutgoingLinks(
			View view) {
		TestEgalite modelElement = (TestEgalite) view.getElement();
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Test_Destination_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getFin_2014OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QuestionnaireLinkDescriptor> getDebut_2015OutgoingLinks(
			View view) {
		Debut modelElement = (Debut) view.getElement();
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Debut_PremiereQuestion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<QuestionnaireLinkDescriptor> getIncomingFeatureModelFacetLinks_Debut_PremiereQuestion_4001(
			Question target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == QuestionnairePackage.eINSTANCE
					.getDebut_PremiereQuestion()) {
				result.add(new QuestionnaireLinkDescriptor(
						setting.getEObject(), target,
						QuestionnaireElementTypes.DebutPremiereQuestion_4001,
						DebutPremiereQuestionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<QuestionnaireLinkDescriptor> getIncomingFeatureModelFacetLinks_Aiguilleur_Tests_4002(
			Test target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == QuestionnairePackage.eINSTANCE
					.getAiguilleur_Tests()) {
				result.add(new QuestionnaireLinkDescriptor(
						setting.getEObject(), target,
						QuestionnaireElementTypes.AiguilleurTests_4002,
						AiguilleurTestsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<QuestionnaireLinkDescriptor> getIncomingFeatureModelFacetLinks_Aiguilleur_ElseDestination_4003(
			Next target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == QuestionnairePackage.eINSTANCE
					.getAiguilleur_ElseDestination()) {
				result.add(new QuestionnaireLinkDescriptor(
						setting.getEObject(),
						target,
						QuestionnaireElementTypes.AiguilleurElseDestination_4003,
						AiguilleurElseDestinationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<QuestionnaireLinkDescriptor> getIncomingFeatureModelFacetLinks_Question_Suite_4004(
			Next target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == QuestionnairePackage.eINSTANCE
					.getQuestion_Suite()) {
				result.add(new QuestionnaireLinkDescriptor(
						setting.getEObject(), target,
						QuestionnaireElementTypes.QuestionSuite_4004,
						QuestionSuiteEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<QuestionnaireLinkDescriptor> getIncomingFeatureModelFacetLinks_Question_TypeSaisie_4005(
			TypeSaisie target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == QuestionnairePackage.eINSTANCE
					.getQuestion_TypeSaisie()) {
				result.add(new QuestionnaireLinkDescriptor(
						setting.getEObject(), target,
						QuestionnaireElementTypes.QuestionTypeSaisie_4005,
						QuestionTypeSaisieEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<QuestionnaireLinkDescriptor> getIncomingFeatureModelFacetLinks_Test_Destination_4006(
			Next target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == QuestionnairePackage.eINSTANCE
					.getTest_Destination()) {
				result.add(new QuestionnaireLinkDescriptor(
						setting.getEObject(), target,
						QuestionnaireElementTypes.TestDestination_4006,
						TestDestinationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<QuestionnaireLinkDescriptor> getOutgoingFeatureModelFacetLinks_Debut_PremiereQuestion_4001(
			Debut source) {
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		Question destination = source.getPremiereQuestion();
		if (destination == null) {
			return result;
		}
		result.add(new QuestionnaireLinkDescriptor(source, destination,
				QuestionnaireElementTypes.DebutPremiereQuestion_4001,
				DebutPremiereQuestionEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<QuestionnaireLinkDescriptor> getOutgoingFeatureModelFacetLinks_Aiguilleur_Tests_4002(
			Aiguilleur source) {
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		for (Iterator<?> destinations = source.getTests().iterator(); destinations
				.hasNext();) {
			Test destination = (Test) destinations.next();
			result.add(new QuestionnaireLinkDescriptor(source, destination,
					QuestionnaireElementTypes.AiguilleurTests_4002,
					AiguilleurTestsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<QuestionnaireLinkDescriptor> getOutgoingFeatureModelFacetLinks_Aiguilleur_ElseDestination_4003(
			Aiguilleur source) {
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		Next destination = source.getElseDestination();
		if (destination == null) {
			return result;
		}
		result.add(new QuestionnaireLinkDescriptor(source, destination,
				QuestionnaireElementTypes.AiguilleurElseDestination_4003,
				AiguilleurElseDestinationEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<QuestionnaireLinkDescriptor> getOutgoingFeatureModelFacetLinks_Question_Suite_4004(
			Question source) {
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		Next destination = source.getSuite();
		if (destination == null) {
			return result;
		}
		result.add(new QuestionnaireLinkDescriptor(source, destination,
				QuestionnaireElementTypes.QuestionSuite_4004,
				QuestionSuiteEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<QuestionnaireLinkDescriptor> getOutgoingFeatureModelFacetLinks_Question_TypeSaisie_4005(
			Question source) {
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		TypeSaisie destination = source.getTypeSaisie();
		if (destination == null) {
			return result;
		}
		result.add(new QuestionnaireLinkDescriptor(source, destination,
				QuestionnaireElementTypes.QuestionTypeSaisie_4005,
				QuestionTypeSaisieEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<QuestionnaireLinkDescriptor> getOutgoingFeatureModelFacetLinks_Test_Destination_4006(
			Test source) {
		LinkedList<QuestionnaireLinkDescriptor> result = new LinkedList<QuestionnaireLinkDescriptor>();
		Next destination = source.getDestination();
		if (destination == null) {
			return result;
		}
		result.add(new QuestionnaireLinkDescriptor(source, destination,
				QuestionnaireElementTypes.TestDestination_4006,
				TestDestinationEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<QuestionnaireNodeDescriptor> getSemanticChildren(View view) {
			return QuestionnaireDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<QuestionnaireLinkDescriptor> getContainedLinks(View view) {
			return QuestionnaireDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<QuestionnaireLinkDescriptor> getIncomingLinks(View view) {
			return QuestionnaireDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<QuestionnaireLinkDescriptor> getOutgoingLinks(View view) {
			return QuestionnaireDiagramUpdater.getOutgoingLinks(view);
		}
	};

}

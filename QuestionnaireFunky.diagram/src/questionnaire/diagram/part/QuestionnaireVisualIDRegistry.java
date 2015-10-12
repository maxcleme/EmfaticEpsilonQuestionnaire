/*
 * 
 */
package questionnaire.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import questionnaire.Questionnaire;
import questionnaire.QuestionnairePackage;
import questionnaire.diagram.edit.parts.AiguilleurEditPart;
import questionnaire.diagram.edit.parts.AiguilleurElseDestinationEditPart;
import questionnaire.diagram.edit.parts.AiguilleurNomEditPart;
import questionnaire.diagram.edit.parts.AiguilleurTestsEditPart;
import questionnaire.diagram.edit.parts.DebutEditPart;
import questionnaire.diagram.edit.parts.DebutNomEditPart;
import questionnaire.diagram.edit.parts.DebutPremiereQuestionEditPart;
import questionnaire.diagram.edit.parts.FinEditPart;
import questionnaire.diagram.edit.parts.FinNomEditPart;
import questionnaire.diagram.edit.parts.QuestionOuiNonEditPart;
import questionnaire.diagram.edit.parts.QuestionOuiNonQuestionEditPart;
import questionnaire.diagram.edit.parts.QuestionOuverteEditPart;
import questionnaire.diagram.edit.parts.QuestionOuverteQuestionEditPart;
import questionnaire.diagram.edit.parts.QuestionReponseMultipleEditPart;
import questionnaire.diagram.edit.parts.QuestionReponseMultipleQuestionEditPart;
import questionnaire.diagram.edit.parts.QuestionSuiteEditPart;
import questionnaire.diagram.edit.parts.QuestionTypeSaisieEditPart;
import questionnaire.diagram.edit.parts.QuestionnaireEditPart;
import questionnaire.diagram.edit.parts.TestDestinationEditPart;
import questionnaire.diagram.edit.parts.TestEgaliteEditPart;
import questionnaire.diagram.edit.parts.TestEgaliteEgalEditPart;
import questionnaire.diagram.edit.parts.TestEntreBorneMinIncluseBorneMaxEditPart;
import questionnaire.diagram.edit.parts.TestEntreEditPart;
import questionnaire.diagram.edit.parts.TestInferieurEditPart;
import questionnaire.diagram.edit.parts.TestInferieurValeurEditPart;
import questionnaire.diagram.edit.parts.TestSuperieurEditPart;
import questionnaire.diagram.edit.parts.TestSuperieurValeurEditPart;
import questionnaire.diagram.edit.parts.TexteEditPart;
import questionnaire.diagram.edit.parts.TexteQuestionEditPart;
import questionnaire.diagram.edit.parts.TypeSaisieAllEditPart;
import questionnaire.diagram.edit.parts.TypeSaisieAllRegexEditPart;
import questionnaire.diagram.edit.parts.TypeSaisieAlphaEditPart;
import questionnaire.diagram.edit.parts.TypeSaisieAlphaNumeriqueEditPart;
import questionnaire.diagram.edit.parts.TypeSaisieAlphaNumeriqueRegexEditPart;
import questionnaire.diagram.edit.parts.TypeSaisieAlphaRegexEditPart;
import questionnaire.diagram.edit.parts.TypeSaisieNumeriqueEditPart;
import questionnaire.diagram.edit.parts.TypeSaisieNumeriqueRegexEditPart;
import questionnaire.diagram.edit.parts.WrappingLabel2EditPart;
import questionnaire.diagram.edit.parts.WrappingLabel3EditPart;
import questionnaire.diagram.edit.parts.WrappingLabel4EditPart;
import questionnaire.diagram.edit.parts.WrappingLabel5EditPart;
import questionnaire.diagram.edit.parts.WrappingLabel6EditPart;
import questionnaire.diagram.edit.parts.WrappingLabelEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class QuestionnaireVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "QuestionnaireFunky.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (QuestionnaireEditPart.MODEL_ID.equals(view.getType())) {
				return QuestionnaireEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return questionnaire.diagram.part.QuestionnaireVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				QuestionnaireDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (QuestionnairePackage.eINSTANCE.getQuestionnaire().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Questionnaire) domainElement)) {
			return QuestionnaireEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = questionnaire.diagram.part.QuestionnaireVisualIDRegistry
				.getModelID(containerView);
		if (!QuestionnaireEditPart.MODEL_ID.equals(containerModelID)
				&& !"questionnaire".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (QuestionnaireEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = questionnaire.diagram.part.QuestionnaireVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = QuestionnaireEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case QuestionnaireEditPart.VISUAL_ID:
			if (QuestionnairePackage.eINSTANCE.getTexte().isSuperTypeOf(
					domainElement.eClass())) {
				return TexteEditPart.VISUAL_ID;
			}
			if (QuestionnairePackage.eINSTANCE.getQuestionOuverte()
					.isSuperTypeOf(domainElement.eClass())) {
				return QuestionOuverteEditPart.VISUAL_ID;
			}
			if (QuestionnairePackage.eINSTANCE.getQuestionOuiNon()
					.isSuperTypeOf(domainElement.eClass())) {
				return QuestionOuiNonEditPart.VISUAL_ID;
			}
			if (QuestionnairePackage.eINSTANCE.getQuestionReponseMultiple()
					.isSuperTypeOf(domainElement.eClass())) {
				return QuestionReponseMultipleEditPart.VISUAL_ID;
			}
			if (QuestionnairePackage.eINSTANCE.getTypeSaisieNumerique()
					.isSuperTypeOf(domainElement.eClass())) {
				return TypeSaisieNumeriqueEditPart.VISUAL_ID;
			}
			if (QuestionnairePackage.eINSTANCE.getTypeSaisieAlphaNumerique()
					.isSuperTypeOf(domainElement.eClass())) {
				return TypeSaisieAlphaNumeriqueEditPart.VISUAL_ID;
			}
			if (QuestionnairePackage.eINSTANCE.getTypeSaisieAlpha()
					.isSuperTypeOf(domainElement.eClass())) {
				return TypeSaisieAlphaEditPart.VISUAL_ID;
			}
			if (QuestionnairePackage.eINSTANCE.getTypeSaisieAll()
					.isSuperTypeOf(domainElement.eClass())) {
				return TypeSaisieAllEditPart.VISUAL_ID;
			}
			if (QuestionnairePackage.eINSTANCE.getAiguilleur().isSuperTypeOf(
					domainElement.eClass())) {
				return AiguilleurEditPart.VISUAL_ID;
			}
			if (QuestionnairePackage.eINSTANCE.getTestEntre().isSuperTypeOf(
					domainElement.eClass())) {
				return TestEntreEditPart.VISUAL_ID;
			}
			if (QuestionnairePackage.eINSTANCE.getTestInferieur()
					.isSuperTypeOf(domainElement.eClass())) {
				return TestInferieurEditPart.VISUAL_ID;
			}
			if (QuestionnairePackage.eINSTANCE.getTestSuperieur()
					.isSuperTypeOf(domainElement.eClass())) {
				return TestSuperieurEditPart.VISUAL_ID;
			}
			if (QuestionnairePackage.eINSTANCE.getTestEgalite().isSuperTypeOf(
					domainElement.eClass())) {
				return TestEgaliteEditPart.VISUAL_ID;
			}
			if (QuestionnairePackage.eINSTANCE.getFin().isSuperTypeOf(
					domainElement.eClass())) {
				return FinEditPart.VISUAL_ID;
			}
			if (QuestionnairePackage.eINSTANCE.getDebut().isSuperTypeOf(
					domainElement.eClass())) {
				return DebutEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = questionnaire.diagram.part.QuestionnaireVisualIDRegistry
				.getModelID(containerView);
		if (!QuestionnaireEditPart.MODEL_ID.equals(containerModelID)
				&& !"questionnaire".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (QuestionnaireEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = questionnaire.diagram.part.QuestionnaireVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = QuestionnaireEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case QuestionnaireEditPart.VISUAL_ID:
			if (TexteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (QuestionOuverteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (QuestionOuiNonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (QuestionReponseMultipleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TypeSaisieNumeriqueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TypeSaisieAlphaNumeriqueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TypeSaisieAlphaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TypeSaisieAllEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AiguilleurEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TestEntreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TestInferieurEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TestSuperieurEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TestEgaliteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DebutEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TexteEditPart.VISUAL_ID:
			if (TexteQuestionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case QuestionOuverteEditPart.VISUAL_ID:
			if (QuestionOuverteQuestionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case QuestionOuiNonEditPart.VISUAL_ID:
			if (QuestionOuiNonQuestionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case QuestionReponseMultipleEditPart.VISUAL_ID:
			if (QuestionReponseMultipleQuestionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TypeSaisieNumeriqueEditPart.VISUAL_ID:
			if (TypeSaisieNumeriqueRegexEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TypeSaisieAlphaNumeriqueEditPart.VISUAL_ID:
			if (TypeSaisieAlphaNumeriqueRegexEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TypeSaisieAlphaEditPart.VISUAL_ID:
			if (TypeSaisieAlphaRegexEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TypeSaisieAllEditPart.VISUAL_ID:
			if (TypeSaisieAllRegexEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AiguilleurEditPart.VISUAL_ID:
			if (AiguilleurNomEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TestEntreEditPart.VISUAL_ID:
			if (TestEntreBorneMinIncluseBorneMaxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TestInferieurEditPart.VISUAL_ID:
			if (TestInferieurValeurEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TestSuperieurEditPart.VISUAL_ID:
			if (TestSuperieurValeurEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TestEgaliteEditPart.VISUAL_ID:
			if (TestEgaliteEgalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FinEditPart.VISUAL_ID:
			if (FinNomEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DebutEditPart.VISUAL_ID:
			if (DebutNomEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DebutPremiereQuestionEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AiguilleurTestsEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AiguilleurElseDestinationEditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case QuestionSuiteEditPart.VISUAL_ID:
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case QuestionTypeSaisieEditPart.VISUAL_ID:
			if (WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TestDestinationEditPart.VISUAL_ID:
			if (WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Questionnaire element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case QuestionnaireEditPart.VISUAL_ID:
			return false;
		case TexteEditPart.VISUAL_ID:
		case QuestionOuverteEditPart.VISUAL_ID:
		case QuestionOuiNonEditPart.VISUAL_ID:
		case QuestionReponseMultipleEditPart.VISUAL_ID:
		case TypeSaisieNumeriqueEditPart.VISUAL_ID:
		case TypeSaisieAlphaNumeriqueEditPart.VISUAL_ID:
		case TypeSaisieAlphaEditPart.VISUAL_ID:
		case TypeSaisieAllEditPart.VISUAL_ID:
		case AiguilleurEditPart.VISUAL_ID:
		case TestEntreEditPart.VISUAL_ID:
		case TestInferieurEditPart.VISUAL_ID:
		case TestSuperieurEditPart.VISUAL_ID:
		case TestEgaliteEditPart.VISUAL_ID:
		case FinEditPart.VISUAL_ID:
		case DebutEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return questionnaire.diagram.part.QuestionnaireVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return questionnaire.diagram.part.QuestionnaireVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return questionnaire.diagram.part.QuestionnaireVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return questionnaire.diagram.part.QuestionnaireVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return questionnaire.diagram.part.QuestionnaireVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return questionnaire.diagram.part.QuestionnaireVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}

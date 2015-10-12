/*
 * 
 */
package questionnaire.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import questionnaire.diagram.part.QuestionnaireVisualIDRegistry;

/**
 * @generated
 */
public class QuestionnaireEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (QuestionnaireVisualIDRegistry.getVisualID(view)) {

			case QuestionnaireEditPart.VISUAL_ID:
				return new QuestionnaireEditPart(view);

			case TexteEditPart.VISUAL_ID:
				return new TexteEditPart(view);

			case TexteQuestionEditPart.VISUAL_ID:
				return new TexteQuestionEditPart(view);

			case QuestionOuverteEditPart.VISUAL_ID:
				return new QuestionOuverteEditPart(view);

			case QuestionOuverteQuestionEditPart.VISUAL_ID:
				return new QuestionOuverteQuestionEditPart(view);

			case QuestionOuiNonEditPart.VISUAL_ID:
				return new QuestionOuiNonEditPart(view);

			case QuestionOuiNonQuestionEditPart.VISUAL_ID:
				return new QuestionOuiNonQuestionEditPart(view);

			case QuestionReponseMultipleEditPart.VISUAL_ID:
				return new QuestionReponseMultipleEditPart(view);

			case QuestionReponseMultipleQuestionEditPart.VISUAL_ID:
				return new QuestionReponseMultipleQuestionEditPart(view);

			case TypeSaisieNumeriqueEditPart.VISUAL_ID:
				return new TypeSaisieNumeriqueEditPart(view);

			case TypeSaisieNumeriqueRegexEditPart.VISUAL_ID:
				return new TypeSaisieNumeriqueRegexEditPart(view);

			case TypeSaisieAlphaNumeriqueEditPart.VISUAL_ID:
				return new TypeSaisieAlphaNumeriqueEditPart(view);

			case TypeSaisieAlphaNumeriqueRegexEditPart.VISUAL_ID:
				return new TypeSaisieAlphaNumeriqueRegexEditPart(view);

			case TypeSaisieAlphaEditPart.VISUAL_ID:
				return new TypeSaisieAlphaEditPart(view);

			case TypeSaisieAlphaRegexEditPart.VISUAL_ID:
				return new TypeSaisieAlphaRegexEditPart(view);

			case TypeSaisieAllEditPart.VISUAL_ID:
				return new TypeSaisieAllEditPart(view);

			case TypeSaisieAllRegexEditPart.VISUAL_ID:
				return new TypeSaisieAllRegexEditPart(view);

			case AiguilleurEditPart.VISUAL_ID:
				return new AiguilleurEditPart(view);

			case AiguilleurNomEditPart.VISUAL_ID:
				return new AiguilleurNomEditPart(view);

			case TestEntreEditPart.VISUAL_ID:
				return new TestEntreEditPart(view);

			case TestEntreBorneMinIncluseBorneMaxEditPart.VISUAL_ID:
				return new TestEntreBorneMinIncluseBorneMaxEditPart(view);

			case TestInferieurEditPart.VISUAL_ID:
				return new TestInferieurEditPart(view);

			case TestInferieurValeurEditPart.VISUAL_ID:
				return new TestInferieurValeurEditPart(view);

			case TestSuperieurEditPart.VISUAL_ID:
				return new TestSuperieurEditPart(view);

			case TestSuperieurValeurEditPart.VISUAL_ID:
				return new TestSuperieurValeurEditPart(view);

			case TestEgaliteEditPart.VISUAL_ID:
				return new TestEgaliteEditPart(view);

			case TestEgaliteEgalEditPart.VISUAL_ID:
				return new TestEgaliteEgalEditPart(view);

			case FinEditPart.VISUAL_ID:
				return new FinEditPart(view);

			case FinNomEditPart.VISUAL_ID:
				return new FinNomEditPart(view);

			case DebutEditPart.VISUAL_ID:
				return new DebutEditPart(view);

			case DebutNomEditPart.VISUAL_ID:
				return new DebutNomEditPart(view);

			case DebutPremiereQuestionEditPart.VISUAL_ID:
				return new DebutPremiereQuestionEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case AiguilleurTestsEditPart.VISUAL_ID:
				return new AiguilleurTestsEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case AiguilleurElseDestinationEditPart.VISUAL_ID:
				return new AiguilleurElseDestinationEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case QuestionSuiteEditPart.VISUAL_ID:
				return new QuestionSuiteEditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			case QuestionTypeSaisieEditPart.VISUAL_ID:
				return new QuestionTypeSaisieEditPart(view);

			case WrappingLabel5EditPart.VISUAL_ID:
				return new WrappingLabel5EditPart(view);

			case TestDestinationEditPart.VISUAL_ID:
				return new TestDestinationEditPart(view);

			case WrappingLabel6EditPart.VISUAL_ID:
				return new WrappingLabel6EditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}

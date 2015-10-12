/*
 * 
 */
package questionnaire.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import questionnaire.diagram.edit.parts.QuestionnaireEditPart;
import questionnaire.diagram.edit.parts.QuestionnaireEditPartFactory;
import questionnaire.diagram.part.QuestionnaireVisualIDRegistry;

/**
 * @generated
 */
public class QuestionnaireEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public QuestionnaireEditPartProvider() {
		super(new QuestionnaireEditPartFactory(),
				QuestionnaireVisualIDRegistry.TYPED_INSTANCE,
				QuestionnaireEditPart.MODEL_ID);
	}

}

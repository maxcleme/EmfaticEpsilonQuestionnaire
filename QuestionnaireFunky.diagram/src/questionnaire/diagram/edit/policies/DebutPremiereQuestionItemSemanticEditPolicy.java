/*
 * 
 */
package questionnaire.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import questionnaire.diagram.providers.QuestionnaireElementTypes;

/**
 * @generated
 */
public class DebutPremiereQuestionItemSemanticEditPolicy extends
		QuestionnaireBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DebutPremiereQuestionItemSemanticEditPolicy() {
		super(QuestionnaireElementTypes.DebutPremiereQuestion_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}

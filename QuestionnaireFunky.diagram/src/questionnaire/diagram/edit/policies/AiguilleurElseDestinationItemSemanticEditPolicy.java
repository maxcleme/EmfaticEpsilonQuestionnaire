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
public class AiguilleurElseDestinationItemSemanticEditPolicy extends
		QuestionnaireBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AiguilleurElseDestinationItemSemanticEditPolicy() {
		super(QuestionnaireElementTypes.AiguilleurElseDestination_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}

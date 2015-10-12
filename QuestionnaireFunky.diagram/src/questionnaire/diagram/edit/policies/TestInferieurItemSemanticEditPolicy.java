/*
 * 
 */
package questionnaire.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import questionnaire.diagram.edit.commands.AiguilleurTestsCreateCommand;
import questionnaire.diagram.edit.commands.AiguilleurTestsReorientCommand;
import questionnaire.diagram.edit.commands.TestDestinationCreateCommand;
import questionnaire.diagram.edit.commands.TestDestinationReorientCommand;
import questionnaire.diagram.edit.parts.AiguilleurTestsEditPart;
import questionnaire.diagram.edit.parts.TestDestinationEditPart;
import questionnaire.diagram.part.QuestionnaireVisualIDRegistry;
import questionnaire.diagram.providers.QuestionnaireElementTypes;

/**
 * @generated
 */
public class TestInferieurItemSemanticEditPolicy extends
		QuestionnaireBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TestInferieurItemSemanticEditPolicy() {
		super(QuestionnaireElementTypes.TestInferieur_2011);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (QuestionnaireVisualIDRegistry.getVisualID(incomingLink) == AiguilleurTestsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (QuestionnaireVisualIDRegistry.getVisualID(outgoingLink) == TestDestinationEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (QuestionnaireElementTypes.AiguilleurTests_4002 == req
				.getElementType()) {
			return null;
		}
		if (QuestionnaireElementTypes.TestDestination_4006 == req
				.getElementType()) {
			return getGEFWrapper(new TestDestinationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (QuestionnaireElementTypes.AiguilleurTests_4002 == req
				.getElementType()) {
			return getGEFWrapper(new AiguilleurTestsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (QuestionnaireElementTypes.TestDestination_4006 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case AiguilleurTestsEditPart.VISUAL_ID:
			return getGEFWrapper(new AiguilleurTestsReorientCommand(req));
		case TestDestinationEditPart.VISUAL_ID:
			return getGEFWrapper(new TestDestinationReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}

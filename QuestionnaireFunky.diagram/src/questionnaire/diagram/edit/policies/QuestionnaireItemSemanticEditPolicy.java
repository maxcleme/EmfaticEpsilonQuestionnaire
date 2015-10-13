/*
 * 
 */
package questionnaire.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import questionnaire.diagram.edit.commands.AiguilleurCreateCommand;
import questionnaire.diagram.edit.commands.DebutCreateCommand;
import questionnaire.diagram.edit.commands.FinCreateCommand;
import questionnaire.diagram.edit.commands.QuestionOuiNonCreateCommand;
import questionnaire.diagram.edit.commands.QuestionOuverteCreateCommand;
import questionnaire.diagram.edit.commands.QuestionReponseMultipleCreateCommand;
import questionnaire.diagram.edit.commands.TestEgaliteCreateCommand;
import questionnaire.diagram.edit.commands.TestEntreCreateCommand;
import questionnaire.diagram.edit.commands.TestInferieurCreateCommand;
import questionnaire.diagram.edit.commands.TestSuperieurCreateCommand;
import questionnaire.diagram.edit.commands.TexteCreateCommand;
import questionnaire.diagram.edit.commands.TypeSaisieAllCreateCommand;
import questionnaire.diagram.edit.commands.TypeSaisieAlphaCreateCommand;
import questionnaire.diagram.edit.commands.TypeSaisieAlphaNumeriqueCreateCommand;
import questionnaire.diagram.edit.commands.TypeSaisieNumeriqueCreateCommand;
import questionnaire.diagram.providers.QuestionnaireElementTypes;

/**
 * @generated
 */
public class QuestionnaireItemSemanticEditPolicy extends
		QuestionnaireBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public QuestionnaireItemSemanticEditPolicy() {
		super(QuestionnaireElementTypes.Questionnaire_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (QuestionnaireElementTypes.Texte_2001 == req.getElementType()) {
			return getGEFWrapper(new TexteCreateCommand(req));
		}
		if (QuestionnaireElementTypes.QuestionOuverte_2002 == req
				.getElementType()) {
			return getGEFWrapper(new QuestionOuverteCreateCommand(req));
		}
		if (QuestionnaireElementTypes.QuestionOuiNon_2003 == req
				.getElementType()) {
			return getGEFWrapper(new QuestionOuiNonCreateCommand(req));
		}
		if (QuestionnaireElementTypes.QuestionReponseMultiple_2004 == req
				.getElementType()) {
			return getGEFWrapper(new QuestionReponseMultipleCreateCommand(req));
		}
		if (QuestionnaireElementTypes.TypeSaisieNumerique_2005 == req
				.getElementType()) {
			return getGEFWrapper(new TypeSaisieNumeriqueCreateCommand(req));
		}
		if (QuestionnaireElementTypes.TypeSaisieAlphaNumerique_2006 == req
				.getElementType()) {
			return getGEFWrapper(new TypeSaisieAlphaNumeriqueCreateCommand(req));
		}
		if (QuestionnaireElementTypes.TypeSaisieAlpha_2007 == req
				.getElementType()) {
			return getGEFWrapper(new TypeSaisieAlphaCreateCommand(req));
		}
		if (QuestionnaireElementTypes.TypeSaisieAll_2008 == req
				.getElementType()) {
			return getGEFWrapper(new TypeSaisieAllCreateCommand(req));
		}
		if (QuestionnaireElementTypes.Aiguilleur_2009 == req.getElementType()) {
			return getGEFWrapper(new AiguilleurCreateCommand(req));
		}
		if (QuestionnaireElementTypes.TestEntre_2010 == req.getElementType()) {
			return getGEFWrapper(new TestEntreCreateCommand(req));
		}
		if (QuestionnaireElementTypes.TestInferieur_2011 == req
				.getElementType()) {
			return getGEFWrapper(new TestInferieurCreateCommand(req));
		}
		if (QuestionnaireElementTypes.TestSuperieur_2012 == req
				.getElementType()) {
			return getGEFWrapper(new TestSuperieurCreateCommand(req));
		}
		if (QuestionnaireElementTypes.TestEgalite_2013 == req.getElementType()) {
			return getGEFWrapper(new TestEgaliteCreateCommand(req));
		}
		if (QuestionnaireElementTypes.Fin_2014 == req.getElementType()) {
			return getGEFWrapper(new FinCreateCommand(req));
		}
		if (QuestionnaireElementTypes.Debut_2015 == req.getElementType()) {
			return getGEFWrapper(new DebutCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}

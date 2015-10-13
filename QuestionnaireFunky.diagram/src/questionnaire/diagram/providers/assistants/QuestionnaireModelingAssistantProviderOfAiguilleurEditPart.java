/*
 * 
 */
package questionnaire.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import questionnaire.diagram.edit.parts.AiguilleurEditPart;
import questionnaire.diagram.edit.parts.FinEditPart;
import questionnaire.diagram.edit.parts.QuestionOuiNonEditPart;
import questionnaire.diagram.edit.parts.QuestionOuverteEditPart;
import questionnaire.diagram.edit.parts.QuestionReponseMultipleEditPart;
import questionnaire.diagram.edit.parts.TestEgaliteEditPart;
import questionnaire.diagram.edit.parts.TestEntreEditPart;
import questionnaire.diagram.edit.parts.TestInferieurEditPart;
import questionnaire.diagram.edit.parts.TestSuperieurEditPart;
import questionnaire.diagram.edit.parts.TexteEditPart;
import questionnaire.diagram.providers.QuestionnaireElementTypes;
import questionnaire.diagram.providers.QuestionnaireModelingAssistantProvider;

/**
 * @generated
 */
public class QuestionnaireModelingAssistantProviderOfAiguilleurEditPart extends
		QuestionnaireModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((AiguilleurEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(AiguilleurEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(QuestionnaireElementTypes.AiguilleurTests_4002);
		types.add(QuestionnaireElementTypes.AiguilleurElseDestination_4003);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(AiguilleurEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			AiguilleurEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof TestEntreEditPart) {
			types.add(QuestionnaireElementTypes.AiguilleurTests_4002);
		}
		if (targetEditPart instanceof TestInferieurEditPart) {
			types.add(QuestionnaireElementTypes.AiguilleurTests_4002);
		}
		if (targetEditPart instanceof TestSuperieurEditPart) {
			types.add(QuestionnaireElementTypes.AiguilleurTests_4002);
		}
		if (targetEditPart instanceof TestEgaliteEditPart) {
			types.add(QuestionnaireElementTypes.AiguilleurTests_4002);
		}
		if (targetEditPart instanceof TexteEditPart) {
			types.add(QuestionnaireElementTypes.AiguilleurElseDestination_4003);
		}
		if (targetEditPart instanceof QuestionOuverteEditPart) {
			types.add(QuestionnaireElementTypes.AiguilleurElseDestination_4003);
		}
		if (targetEditPart instanceof QuestionOuiNonEditPart) {
			types.add(QuestionnaireElementTypes.AiguilleurElseDestination_4003);
		}
		if (targetEditPart instanceof QuestionReponseMultipleEditPart) {
			types.add(QuestionnaireElementTypes.AiguilleurElseDestination_4003);
		}
		if (targetEditPart instanceof AiguilleurEditPart) {
			types.add(QuestionnaireElementTypes.AiguilleurElseDestination_4003);
		}
		if (targetEditPart instanceof FinEditPart) {
			types.add(QuestionnaireElementTypes.AiguilleurElseDestination_4003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((AiguilleurEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(AiguilleurEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == QuestionnaireElementTypes.AiguilleurTests_4002) {
			types.add(QuestionnaireElementTypes.TestEntre_2010);
			types.add(QuestionnaireElementTypes.TestInferieur_2011);
			types.add(QuestionnaireElementTypes.TestSuperieur_2012);
			types.add(QuestionnaireElementTypes.TestEgalite_2013);
		} else if (relationshipType == QuestionnaireElementTypes.AiguilleurElseDestination_4003) {
			types.add(QuestionnaireElementTypes.Texte_2001);
			types.add(QuestionnaireElementTypes.QuestionOuverte_2002);
			types.add(QuestionnaireElementTypes.QuestionOuiNon_2003);
			types.add(QuestionnaireElementTypes.QuestionReponseMultiple_2004);
			types.add(QuestionnaireElementTypes.Aiguilleur_2009);
			types.add(QuestionnaireElementTypes.Fin_2014);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((AiguilleurEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(AiguilleurEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(QuestionnaireElementTypes.AiguilleurElseDestination_4003);
		types.add(QuestionnaireElementTypes.QuestionSuite_4004);
		types.add(QuestionnaireElementTypes.TestDestination_4006);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((AiguilleurEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(AiguilleurEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == QuestionnaireElementTypes.AiguilleurElseDestination_4003) {
			types.add(QuestionnaireElementTypes.Aiguilleur_2009);
		} else if (relationshipType == QuestionnaireElementTypes.QuestionSuite_4004) {
			types.add(QuestionnaireElementTypes.Texte_2001);
			types.add(QuestionnaireElementTypes.QuestionOuverte_2002);
			types.add(QuestionnaireElementTypes.QuestionOuiNon_2003);
			types.add(QuestionnaireElementTypes.QuestionReponseMultiple_2004);
		} else if (relationshipType == QuestionnaireElementTypes.TestDestination_4006) {
			types.add(QuestionnaireElementTypes.TestEntre_2010);
			types.add(QuestionnaireElementTypes.TestInferieur_2011);
			types.add(QuestionnaireElementTypes.TestSuperieur_2012);
			types.add(QuestionnaireElementTypes.TestEgalite_2013);
		}
		return types;
	}

}

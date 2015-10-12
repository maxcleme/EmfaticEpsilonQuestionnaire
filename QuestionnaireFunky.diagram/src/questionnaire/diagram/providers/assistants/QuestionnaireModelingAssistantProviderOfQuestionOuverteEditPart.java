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
import questionnaire.diagram.edit.parts.TexteEditPart;
import questionnaire.diagram.edit.parts.TypeSaisieAllEditPart;
import questionnaire.diagram.edit.parts.TypeSaisieAlphaEditPart;
import questionnaire.diagram.edit.parts.TypeSaisieAlphaNumeriqueEditPart;
import questionnaire.diagram.edit.parts.TypeSaisieNumeriqueEditPart;
import questionnaire.diagram.providers.QuestionnaireElementTypes;
import questionnaire.diagram.providers.QuestionnaireModelingAssistantProvider;

/**
 * @generated
 */
public class QuestionnaireModelingAssistantProviderOfQuestionOuverteEditPart
		extends QuestionnaireModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((QuestionOuverteEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			QuestionOuverteEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(QuestionnaireElementTypes.QuestionSuite_4004);
		types.add(QuestionnaireElementTypes.QuestionTypeSaisie_4005);
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
				(QuestionOuverteEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			QuestionOuverteEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof TexteEditPart) {
			types.add(QuestionnaireElementTypes.QuestionSuite_4004);
		}
		if (targetEditPart instanceof QuestionOuverteEditPart) {
			types.add(QuestionnaireElementTypes.QuestionSuite_4004);
		}
		if (targetEditPart instanceof QuestionOuiNonEditPart) {
			types.add(QuestionnaireElementTypes.QuestionSuite_4004);
		}
		if (targetEditPart instanceof QuestionReponseMultipleEditPart) {
			types.add(QuestionnaireElementTypes.QuestionSuite_4004);
		}
		if (targetEditPart instanceof AiguilleurEditPart) {
			types.add(QuestionnaireElementTypes.QuestionSuite_4004);
		}
		if (targetEditPart instanceof FinEditPart) {
			types.add(QuestionnaireElementTypes.QuestionSuite_4004);
		}
		if (targetEditPart instanceof TypeSaisieNumeriqueEditPart) {
			types.add(QuestionnaireElementTypes.QuestionTypeSaisie_4005);
		}
		if (targetEditPart instanceof TypeSaisieAlphaNumeriqueEditPart) {
			types.add(QuestionnaireElementTypes.QuestionTypeSaisie_4005);
		}
		if (targetEditPart instanceof TypeSaisieAlphaEditPart) {
			types.add(QuestionnaireElementTypes.QuestionTypeSaisie_4005);
		}
		if (targetEditPart instanceof TypeSaisieAllEditPart) {
			types.add(QuestionnaireElementTypes.QuestionTypeSaisie_4005);
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
		return doGetTypesForTarget((QuestionOuverteEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			QuestionOuverteEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == QuestionnaireElementTypes.QuestionSuite_4004) {
			types.add(QuestionnaireElementTypes.Texte_2001);
			types.add(QuestionnaireElementTypes.QuestionOuverte_2002);
			types.add(QuestionnaireElementTypes.QuestionOuiNon_2003);
			types.add(QuestionnaireElementTypes.QuestionReponseMultiple_2004);
			types.add(QuestionnaireElementTypes.Aiguilleur_2009);
			types.add(QuestionnaireElementTypes.Fin_2014);
		} else if (relationshipType == QuestionnaireElementTypes.QuestionTypeSaisie_4005) {
			types.add(QuestionnaireElementTypes.TypeSaisieNumerique_2005);
			types.add(QuestionnaireElementTypes.TypeSaisieAlphaNumerique_2006);
			types.add(QuestionnaireElementTypes.TypeSaisieAlpha_2007);
			types.add(QuestionnaireElementTypes.TypeSaisieAll_2008);
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
		return doGetRelTypesOnTarget((QuestionOuverteEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			QuestionOuverteEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(QuestionnaireElementTypes.DebutPremiereQuestion_4001);
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
		return doGetTypesForSource((QuestionOuverteEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			QuestionOuverteEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == QuestionnaireElementTypes.DebutPremiereQuestion_4001) {
			types.add(QuestionnaireElementTypes.Debut_2015);
		} else if (relationshipType == QuestionnaireElementTypes.AiguilleurElseDestination_4003) {
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

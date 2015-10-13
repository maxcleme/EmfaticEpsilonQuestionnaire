/*
 * 
 */
package questionnaire.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import questionnaire.diagram.edit.parts.FinEditPart;
import questionnaire.diagram.providers.QuestionnaireElementTypes;
import questionnaire.diagram.providers.QuestionnaireModelingAssistantProvider;

/**
 * @generated
 */
public class QuestionnaireModelingAssistantProviderOfFinEditPart extends
		QuestionnaireModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((FinEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(FinEditPart target) {
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
		return doGetTypesForSource((FinEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(FinEditPart target,
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

/*
 * 
 */
package questionnaire.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import questionnaire.diagram.edit.parts.TypeSaisieAlphaNumeriqueEditPart;
import questionnaire.diagram.providers.QuestionnaireElementTypes;
import questionnaire.diagram.providers.QuestionnaireModelingAssistantProvider;

/**
 * @generated
 */
public class QuestionnaireModelingAssistantProviderOfTypeSaisieAlphaNumeriqueEditPart
		extends QuestionnaireModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((TypeSaisieAlphaNumeriqueEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			TypeSaisieAlphaNumeriqueEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(QuestionnaireElementTypes.QuestionTypeSaisie_4005);
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
		return doGetTypesForSource(
				(TypeSaisieAlphaNumeriqueEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			TypeSaisieAlphaNumeriqueEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == QuestionnaireElementTypes.QuestionTypeSaisie_4005) {
			types.add(QuestionnaireElementTypes.Texte_2001);
			types.add(QuestionnaireElementTypes.QuestionOuverte_2002);
			types.add(QuestionnaireElementTypes.QuestionOuiNon_2003);
			types.add(QuestionnaireElementTypes.QuestionReponseMultiple_2004);
		}
		return types;
	}

}

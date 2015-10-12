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

import questionnaire.diagram.edit.parts.DebutEditPart;
import questionnaire.diagram.edit.parts.QuestionOuiNonEditPart;
import questionnaire.diagram.edit.parts.QuestionOuverteEditPart;
import questionnaire.diagram.edit.parts.QuestionReponseMultipleEditPart;
import questionnaire.diagram.edit.parts.TexteEditPart;
import questionnaire.diagram.providers.QuestionnaireElementTypes;
import questionnaire.diagram.providers.QuestionnaireModelingAssistantProvider;

/**
 * @generated
 */
public class QuestionnaireModelingAssistantProviderOfDebutEditPart extends
		QuestionnaireModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((DebutEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(DebutEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(QuestionnaireElementTypes.DebutPremiereQuestion_4001);
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
		return doGetRelTypesOnSourceAndTarget((DebutEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			DebutEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof TexteEditPart) {
			types.add(QuestionnaireElementTypes.DebutPremiereQuestion_4001);
		}
		if (targetEditPart instanceof QuestionOuverteEditPart) {
			types.add(QuestionnaireElementTypes.DebutPremiereQuestion_4001);
		}
		if (targetEditPart instanceof QuestionOuiNonEditPart) {
			types.add(QuestionnaireElementTypes.DebutPremiereQuestion_4001);
		}
		if (targetEditPart instanceof QuestionReponseMultipleEditPart) {
			types.add(QuestionnaireElementTypes.DebutPremiereQuestion_4001);
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
		return doGetTypesForTarget((DebutEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(DebutEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == QuestionnaireElementTypes.DebutPremiereQuestion_4001) {
			types.add(QuestionnaireElementTypes.Texte_2001);
			types.add(QuestionnaireElementTypes.QuestionOuverte_2002);
			types.add(QuestionnaireElementTypes.QuestionOuiNon_2003);
			types.add(QuestionnaireElementTypes.QuestionReponseMultiple_2004);
		}
		return types;
	}

}

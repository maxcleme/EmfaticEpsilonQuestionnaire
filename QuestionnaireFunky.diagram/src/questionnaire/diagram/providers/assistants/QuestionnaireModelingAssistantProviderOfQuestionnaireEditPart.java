/*
 * 
 */
package questionnaire.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import questionnaire.diagram.providers.QuestionnaireElementTypes;
import questionnaire.diagram.providers.QuestionnaireModelingAssistantProvider;

/**
 * @generated
 */
public class QuestionnaireModelingAssistantProviderOfQuestionnaireEditPart
		extends QuestionnaireModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(15);
		types.add(QuestionnaireElementTypes.Texte_2001);
		types.add(QuestionnaireElementTypes.QuestionOuverte_2002);
		types.add(QuestionnaireElementTypes.QuestionOuiNon_2003);
		types.add(QuestionnaireElementTypes.QuestionReponseMultiple_2004);
		types.add(QuestionnaireElementTypes.TypeSaisieNumerique_2005);
		types.add(QuestionnaireElementTypes.TypeSaisieAlphaNumerique_2006);
		types.add(QuestionnaireElementTypes.TypeSaisieAlpha_2007);
		types.add(QuestionnaireElementTypes.TypeSaisieAll_2008);
		types.add(QuestionnaireElementTypes.Aiguilleur_2009);
		types.add(QuestionnaireElementTypes.TestEntre_2010);
		types.add(QuestionnaireElementTypes.TestInferieur_2011);
		types.add(QuestionnaireElementTypes.TestSuperieur_2012);
		types.add(QuestionnaireElementTypes.TestEgalite_2013);
		types.add(QuestionnaireElementTypes.Fin_2014);
		types.add(QuestionnaireElementTypes.Debut_2015);
		return types;
	}

}

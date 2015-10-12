/*
 * 
 */
package questionnaire.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import questionnaire.diagram.edit.parts.AiguilleurEditPart;
import questionnaire.diagram.edit.parts.AiguilleurElseDestinationEditPart;
import questionnaire.diagram.edit.parts.AiguilleurNomEditPart;
import questionnaire.diagram.edit.parts.AiguilleurTestsEditPart;
import questionnaire.diagram.edit.parts.DebutEditPart;
import questionnaire.diagram.edit.parts.DebutNomEditPart;
import questionnaire.diagram.edit.parts.DebutPremiereQuestionEditPart;
import questionnaire.diagram.edit.parts.FinEditPart;
import questionnaire.diagram.edit.parts.FinNomEditPart;
import questionnaire.diagram.edit.parts.QuestionOuiNonEditPart;
import questionnaire.diagram.edit.parts.QuestionOuiNonQuestionEditPart;
import questionnaire.diagram.edit.parts.QuestionOuverteEditPart;
import questionnaire.diagram.edit.parts.QuestionOuverteQuestionEditPart;
import questionnaire.diagram.edit.parts.QuestionReponseMultipleEditPart;
import questionnaire.diagram.edit.parts.QuestionReponseMultipleQuestionEditPart;
import questionnaire.diagram.edit.parts.QuestionSuiteEditPart;
import questionnaire.diagram.edit.parts.QuestionTypeSaisieEditPart;
import questionnaire.diagram.edit.parts.QuestionnaireEditPart;
import questionnaire.diagram.edit.parts.TestDestinationEditPart;
import questionnaire.diagram.edit.parts.TestEgaliteEditPart;
import questionnaire.diagram.edit.parts.TestEgaliteEgalEditPart;
import questionnaire.diagram.edit.parts.TestEntreBorneMinIncluseBorneMaxEditPart;
import questionnaire.diagram.edit.parts.TestEntreEditPart;
import questionnaire.diagram.edit.parts.TestInferieurEditPart;
import questionnaire.diagram.edit.parts.TestInferieurValeurEditPart;
import questionnaire.diagram.edit.parts.TestSuperieurEditPart;
import questionnaire.diagram.edit.parts.TestSuperieurValeurEditPart;
import questionnaire.diagram.edit.parts.TexteEditPart;
import questionnaire.diagram.edit.parts.TexteQuestionEditPart;
import questionnaire.diagram.edit.parts.TypeSaisieAllEditPart;
import questionnaire.diagram.edit.parts.TypeSaisieAllRegexEditPart;
import questionnaire.diagram.edit.parts.TypeSaisieAlphaEditPart;
import questionnaire.diagram.edit.parts.TypeSaisieAlphaNumeriqueEditPart;
import questionnaire.diagram.edit.parts.TypeSaisieAlphaNumeriqueRegexEditPart;
import questionnaire.diagram.edit.parts.TypeSaisieAlphaRegexEditPart;
import questionnaire.diagram.edit.parts.TypeSaisieNumeriqueEditPart;
import questionnaire.diagram.edit.parts.TypeSaisieNumeriqueRegexEditPart;
import questionnaire.diagram.part.QuestionnaireDiagramEditorPlugin;
import questionnaire.diagram.part.QuestionnaireVisualIDRegistry;
import questionnaire.diagram.providers.QuestionnaireElementTypes;
import questionnaire.diagram.providers.QuestionnaireParserProvider;

/**
 * @generated
 */
public class QuestionnaireNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		QuestionnaireDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		QuestionnaireDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof QuestionnaireNavigatorItem
				&& !isOwnView(((QuestionnaireNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof QuestionnaireNavigatorGroup) {
			QuestionnaireNavigatorGroup group = (QuestionnaireNavigatorGroup) element;
			return QuestionnaireDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof QuestionnaireNavigatorItem) {
			QuestionnaireNavigatorItem navigatorItem = (QuestionnaireNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (QuestionnaireVisualIDRegistry.getVisualID(view)) {
		case QuestionnaireEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?questionnaire?Questionnaire", QuestionnaireElementTypes.Questionnaire_1000); //$NON-NLS-1$
		case TexteEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?questionnaire?Texte", QuestionnaireElementTypes.Texte_2001); //$NON-NLS-1$
		case QuestionOuverteEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?questionnaire?QuestionOuverte", QuestionnaireElementTypes.QuestionOuverte_2002); //$NON-NLS-1$
		case QuestionOuiNonEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?questionnaire?QuestionOuiNon", QuestionnaireElementTypes.QuestionOuiNon_2003); //$NON-NLS-1$
		case QuestionReponseMultipleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?questionnaire?QuestionReponseMultiple", QuestionnaireElementTypes.QuestionReponseMultiple_2004); //$NON-NLS-1$
		case TypeSaisieNumeriqueEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?questionnaire?TypeSaisieNumerique", QuestionnaireElementTypes.TypeSaisieNumerique_2005); //$NON-NLS-1$
		case TypeSaisieAlphaNumeriqueEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?questionnaire?TypeSaisieAlphaNumerique", QuestionnaireElementTypes.TypeSaisieAlphaNumerique_2006); //$NON-NLS-1$
		case TypeSaisieAlphaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?questionnaire?TypeSaisieAlpha", QuestionnaireElementTypes.TypeSaisieAlpha_2007); //$NON-NLS-1$
		case TypeSaisieAllEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?questionnaire?TypeSaisieAll", QuestionnaireElementTypes.TypeSaisieAll_2008); //$NON-NLS-1$
		case AiguilleurEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?questionnaire?Aiguilleur", QuestionnaireElementTypes.Aiguilleur_2009); //$NON-NLS-1$
		case TestEntreEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?questionnaire?TestEntre", QuestionnaireElementTypes.TestEntre_2010); //$NON-NLS-1$
		case TestInferieurEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?questionnaire?TestInferieur", QuestionnaireElementTypes.TestInferieur_2011); //$NON-NLS-1$
		case TestSuperieurEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?questionnaire?TestSuperieur", QuestionnaireElementTypes.TestSuperieur_2012); //$NON-NLS-1$
		case TestEgaliteEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?questionnaire?TestEgalite", QuestionnaireElementTypes.TestEgalite_2013); //$NON-NLS-1$
		case FinEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?questionnaire?Fin", QuestionnaireElementTypes.Fin_2014); //$NON-NLS-1$
		case DebutEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?questionnaire?Debut", QuestionnaireElementTypes.Debut_2015); //$NON-NLS-1$
		case DebutPremiereQuestionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?questionnaire?Debut?premiereQuestion", QuestionnaireElementTypes.DebutPremiereQuestion_4001); //$NON-NLS-1$
		case AiguilleurTestsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?questionnaire?Aiguilleur?tests", QuestionnaireElementTypes.AiguilleurTests_4002); //$NON-NLS-1$
		case AiguilleurElseDestinationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?questionnaire?Aiguilleur?elseDestination", QuestionnaireElementTypes.AiguilleurElseDestination_4003); //$NON-NLS-1$
		case QuestionSuiteEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?questionnaire?Question?suite", QuestionnaireElementTypes.QuestionSuite_4004); //$NON-NLS-1$
		case QuestionTypeSaisieEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?questionnaire?Question?typeSaisie", QuestionnaireElementTypes.QuestionTypeSaisie_4005); //$NON-NLS-1$
		case TestDestinationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?questionnaire?Test?destination", QuestionnaireElementTypes.TestDestination_4006); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = QuestionnaireDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& QuestionnaireElementTypes.isKnownElementType(elementType)) {
			image = QuestionnaireElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof QuestionnaireNavigatorGroup) {
			QuestionnaireNavigatorGroup group = (QuestionnaireNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof QuestionnaireNavigatorItem) {
			QuestionnaireNavigatorItem navigatorItem = (QuestionnaireNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (QuestionnaireVisualIDRegistry.getVisualID(view)) {
		case QuestionnaireEditPart.VISUAL_ID:
			return getQuestionnaire_1000Text(view);
		case TexteEditPart.VISUAL_ID:
			return getTexte_2001Text(view);
		case QuestionOuverteEditPart.VISUAL_ID:
			return getQuestionOuverte_2002Text(view);
		case QuestionOuiNonEditPart.VISUAL_ID:
			return getQuestionOuiNon_2003Text(view);
		case QuestionReponseMultipleEditPart.VISUAL_ID:
			return getQuestionReponseMultiple_2004Text(view);
		case TypeSaisieNumeriqueEditPart.VISUAL_ID:
			return getTypeSaisieNumerique_2005Text(view);
		case TypeSaisieAlphaNumeriqueEditPart.VISUAL_ID:
			return getTypeSaisieAlphaNumerique_2006Text(view);
		case TypeSaisieAlphaEditPart.VISUAL_ID:
			return getTypeSaisieAlpha_2007Text(view);
		case TypeSaisieAllEditPart.VISUAL_ID:
			return getTypeSaisieAll_2008Text(view);
		case AiguilleurEditPart.VISUAL_ID:
			return getAiguilleur_2009Text(view);
		case TestEntreEditPart.VISUAL_ID:
			return getTestEntre_2010Text(view);
		case TestInferieurEditPart.VISUAL_ID:
			return getTestInferieur_2011Text(view);
		case TestSuperieurEditPart.VISUAL_ID:
			return getTestSuperieur_2012Text(view);
		case TestEgaliteEditPart.VISUAL_ID:
			return getTestEgalite_2013Text(view);
		case FinEditPart.VISUAL_ID:
			return getFin_2014Text(view);
		case DebutEditPart.VISUAL_ID:
			return getDebut_2015Text(view);
		case DebutPremiereQuestionEditPart.VISUAL_ID:
			return getDebutPremiereQuestion_4001Text(view);
		case AiguilleurTestsEditPart.VISUAL_ID:
			return getAiguilleurTests_4002Text(view);
		case AiguilleurElseDestinationEditPart.VISUAL_ID:
			return getAiguilleurElseDestination_4003Text(view);
		case QuestionSuiteEditPart.VISUAL_ID:
			return getQuestionSuite_4004Text(view);
		case QuestionTypeSaisieEditPart.VISUAL_ID:
			return getQuestionTypeSaisie_4005Text(view);
		case TestDestinationEditPart.VISUAL_ID:
			return getTestDestination_4006Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getQuestionnaire_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTexte_2001Text(View view) {
		IParser parser = QuestionnaireParserProvider.getParser(
				QuestionnaireElementTypes.Texte_2001,
				view.getElement() != null ? view.getElement() : view,
				QuestionnaireVisualIDRegistry
						.getType(TexteQuestionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QuestionnaireDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getQuestionOuverte_2002Text(View view) {
		IParser parser = QuestionnaireParserProvider.getParser(
				QuestionnaireElementTypes.QuestionOuverte_2002, view
						.getElement() != null ? view.getElement() : view,
				QuestionnaireVisualIDRegistry
						.getType(QuestionOuverteQuestionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QuestionnaireDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getQuestionOuiNon_2003Text(View view) {
		IParser parser = QuestionnaireParserProvider.getParser(
				QuestionnaireElementTypes.QuestionOuiNon_2003, view
						.getElement() != null ? view.getElement() : view,
				QuestionnaireVisualIDRegistry
						.getType(QuestionOuiNonQuestionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QuestionnaireDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getQuestionReponseMultiple_2004Text(View view) {
		IParser parser = QuestionnaireParserProvider
				.getParser(
						QuestionnaireElementTypes.QuestionReponseMultiple_2004,
						view.getElement() != null ? view.getElement() : view,
						QuestionnaireVisualIDRegistry
								.getType(QuestionReponseMultipleQuestionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QuestionnaireDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTypeSaisieNumerique_2005Text(View view) {
		IParser parser = QuestionnaireParserProvider.getParser(
				QuestionnaireElementTypes.TypeSaisieNumerique_2005, view
						.getElement() != null ? view.getElement() : view,
				QuestionnaireVisualIDRegistry
						.getType(TypeSaisieNumeriqueRegexEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QuestionnaireDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTypeSaisieAlphaNumerique_2006Text(View view) {
		IParser parser = QuestionnaireParserProvider
				.getParser(
						QuestionnaireElementTypes.TypeSaisieAlphaNumerique_2006,
						view.getElement() != null ? view.getElement() : view,
						QuestionnaireVisualIDRegistry
								.getType(TypeSaisieAlphaNumeriqueRegexEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QuestionnaireDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTypeSaisieAlpha_2007Text(View view) {
		IParser parser = QuestionnaireParserProvider.getParser(
				QuestionnaireElementTypes.TypeSaisieAlpha_2007, view
						.getElement() != null ? view.getElement() : view,
				QuestionnaireVisualIDRegistry
						.getType(TypeSaisieAlphaRegexEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QuestionnaireDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTypeSaisieAll_2008Text(View view) {
		IParser parser = QuestionnaireParserProvider.getParser(
				QuestionnaireElementTypes.TypeSaisieAll_2008,
				view.getElement() != null ? view.getElement() : view,
				QuestionnaireVisualIDRegistry
						.getType(TypeSaisieAllRegexEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QuestionnaireDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAiguilleur_2009Text(View view) {
		IParser parser = QuestionnaireParserProvider.getParser(
				QuestionnaireElementTypes.Aiguilleur_2009,
				view.getElement() != null ? view.getElement() : view,
				QuestionnaireVisualIDRegistry
						.getType(AiguilleurNomEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QuestionnaireDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTestEntre_2010Text(View view) {
		IParser parser = QuestionnaireParserProvider
				.getParser(
						QuestionnaireElementTypes.TestEntre_2010,
						view.getElement() != null ? view.getElement() : view,
						QuestionnaireVisualIDRegistry
								.getType(TestEntreBorneMinIncluseBorneMaxEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QuestionnaireDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTestInferieur_2011Text(View view) {
		IParser parser = QuestionnaireParserProvider.getParser(
				QuestionnaireElementTypes.TestInferieur_2011,
				view.getElement() != null ? view.getElement() : view,
				QuestionnaireVisualIDRegistry
						.getType(TestInferieurValeurEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QuestionnaireDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTestSuperieur_2012Text(View view) {
		IParser parser = QuestionnaireParserProvider.getParser(
				QuestionnaireElementTypes.TestSuperieur_2012,
				view.getElement() != null ? view.getElement() : view,
				QuestionnaireVisualIDRegistry
						.getType(TestSuperieurValeurEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QuestionnaireDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTestEgalite_2013Text(View view) {
		IParser parser = QuestionnaireParserProvider.getParser(
				QuestionnaireElementTypes.TestEgalite_2013,
				view.getElement() != null ? view.getElement() : view,
				QuestionnaireVisualIDRegistry
						.getType(TestEgaliteEgalEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QuestionnaireDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFin_2014Text(View view) {
		IParser parser = QuestionnaireParserProvider
				.getParser(QuestionnaireElementTypes.Fin_2014, view
						.getElement() != null ? view.getElement() : view,
						QuestionnaireVisualIDRegistry
								.getType(FinNomEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QuestionnaireDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDebut_2015Text(View view) {
		IParser parser = QuestionnaireParserProvider.getParser(
				QuestionnaireElementTypes.Debut_2015,
				view.getElement() != null ? view.getElement() : view,
				QuestionnaireVisualIDRegistry
						.getType(DebutNomEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QuestionnaireDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDebutPremiereQuestion_4001Text(View view) {
		IParser parser = QuestionnaireParserProvider.getParser(
				QuestionnaireElementTypes.DebutPremiereQuestion_4001,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QuestionnaireDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAiguilleurTests_4002Text(View view) {
		IParser parser = QuestionnaireParserProvider.getParser(
				QuestionnaireElementTypes.AiguilleurTests_4002,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QuestionnaireDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAiguilleurElseDestination_4003Text(View view) {
		IParser parser = QuestionnaireParserProvider.getParser(
				QuestionnaireElementTypes.AiguilleurElseDestination_4003,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QuestionnaireDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getQuestionSuite_4004Text(View view) {
		IParser parser = QuestionnaireParserProvider.getParser(
				QuestionnaireElementTypes.QuestionSuite_4004,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QuestionnaireDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getQuestionTypeSaisie_4005Text(View view) {
		IParser parser = QuestionnaireParserProvider.getParser(
				QuestionnaireElementTypes.QuestionTypeSaisie_4005,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QuestionnaireDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTestDestination_4006Text(View view) {
		IParser parser = QuestionnaireParserProvider.getParser(
				QuestionnaireElementTypes.TestDestination_4006,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QuestionnaireDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return QuestionnaireEditPart.MODEL_ID
				.equals(QuestionnaireVisualIDRegistry.getModelID(view));
	}

}

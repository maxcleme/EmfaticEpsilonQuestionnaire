/*
 * 
 */
package questionnaire.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import questionnaire.QuestionnairePackage;
import questionnaire.diagram.edit.parts.AiguilleurNomEditPart;
import questionnaire.diagram.edit.parts.DebutNomEditPart;
import questionnaire.diagram.edit.parts.FinNomEditPart;
import questionnaire.diagram.edit.parts.QuestionOuiNonQuestionEditPart;
import questionnaire.diagram.edit.parts.QuestionOuverteQuestionEditPart;
import questionnaire.diagram.edit.parts.QuestionReponseMultipleQuestionEditPart;
import questionnaire.diagram.edit.parts.TestEgaliteEgalEditPart;
import questionnaire.diagram.edit.parts.TestEntreBorneMinIncluseBorneMaxEditPart;
import questionnaire.diagram.edit.parts.TestInferieurValeurEditPart;
import questionnaire.diagram.edit.parts.TestSuperieurValeurEditPart;
import questionnaire.diagram.edit.parts.TexteQuestionEditPart;
import questionnaire.diagram.edit.parts.TypeSaisieAllRegexEditPart;
import questionnaire.diagram.edit.parts.TypeSaisieAlphaNumeriqueRegexEditPart;
import questionnaire.diagram.edit.parts.TypeSaisieAlphaRegexEditPart;
import questionnaire.diagram.edit.parts.TypeSaisieNumeriqueRegexEditPart;
import questionnaire.diagram.parsers.MessageFormatParser;
import questionnaire.diagram.part.QuestionnaireVisualIDRegistry;

/**
 * @generated
 */
public class QuestionnaireParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser texteQuestion_5001Parser;

	/**
	 * @generated
	 */
	private IParser getTexteQuestion_5001Parser() {
		if (texteQuestion_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { QuestionnairePackage.eINSTANCE
					.getQuestion_Question() };
			MessageFormatParser parser = new MessageFormatParser(features);
			texteQuestion_5001Parser = parser;
		}
		return texteQuestion_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser questionOuverteQuestion_5002Parser;

	/**
	 * @generated
	 */
	private IParser getQuestionOuverteQuestion_5002Parser() {
		if (questionOuverteQuestion_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { QuestionnairePackage.eINSTANCE
					.getQuestion_Question() };
			MessageFormatParser parser = new MessageFormatParser(features);
			questionOuverteQuestion_5002Parser = parser;
		}
		return questionOuverteQuestion_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser questionOuiNonQuestion_5003Parser;

	/**
	 * @generated
	 */
	private IParser getQuestionOuiNonQuestion_5003Parser() {
		if (questionOuiNonQuestion_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { QuestionnairePackage.eINSTANCE
					.getQuestion_Question() };
			MessageFormatParser parser = new MessageFormatParser(features);
			questionOuiNonQuestion_5003Parser = parser;
		}
		return questionOuiNonQuestion_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser questionReponseMultipleQuestion_5004Parser;

	/**
	 * @generated
	 */
	private IParser getQuestionReponseMultipleQuestion_5004Parser() {
		if (questionReponseMultipleQuestion_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { QuestionnairePackage.eINSTANCE
					.getQuestion_Question() };
			MessageFormatParser parser = new MessageFormatParser(features);
			questionReponseMultipleQuestion_5004Parser = parser;
		}
		return questionReponseMultipleQuestion_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser typeSaisieNumeriqueRegex_5005Parser;

	/**
	 * @generated
	 */
	private IParser getTypeSaisieNumeriqueRegex_5005Parser() {
		if (typeSaisieNumeriqueRegex_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { QuestionnairePackage.eINSTANCE
					.getTypeSaisie_Regex() };
			MessageFormatParser parser = new MessageFormatParser(features);
			typeSaisieNumeriqueRegex_5005Parser = parser;
		}
		return typeSaisieNumeriqueRegex_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser typeSaisieAlphaNumeriqueRegex_5006Parser;

	/**
	 * @generated
	 */
	private IParser getTypeSaisieAlphaNumeriqueRegex_5006Parser() {
		if (typeSaisieAlphaNumeriqueRegex_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { QuestionnairePackage.eINSTANCE
					.getTypeSaisie_Regex() };
			MessageFormatParser parser = new MessageFormatParser(features);
			typeSaisieAlphaNumeriqueRegex_5006Parser = parser;
		}
		return typeSaisieAlphaNumeriqueRegex_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser typeSaisieAlphaRegex_5007Parser;

	/**
	 * @generated
	 */
	private IParser getTypeSaisieAlphaRegex_5007Parser() {
		if (typeSaisieAlphaRegex_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { QuestionnairePackage.eINSTANCE
					.getTypeSaisie_Regex() };
			MessageFormatParser parser = new MessageFormatParser(features);
			typeSaisieAlphaRegex_5007Parser = parser;
		}
		return typeSaisieAlphaRegex_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser typeSaisieAllRegex_5008Parser;

	/**
	 * @generated
	 */
	private IParser getTypeSaisieAllRegex_5008Parser() {
		if (typeSaisieAllRegex_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { QuestionnairePackage.eINSTANCE
					.getTypeSaisie_Regex() };
			MessageFormatParser parser = new MessageFormatParser(features);
			typeSaisieAllRegex_5008Parser = parser;
		}
		return typeSaisieAllRegex_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser aiguilleurNom_5009Parser;

	/**
	 * @generated
	 */
	private IParser getAiguilleurNom_5009Parser() {
		if (aiguilleurNom_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { QuestionnairePackage.eINSTANCE
					.getAiguilleur_Nom() };
			MessageFormatParser parser = new MessageFormatParser(features);
			aiguilleurNom_5009Parser = parser;
		}
		return aiguilleurNom_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser testEntreBorneMinIncluseBorneMaxExcluse_5010Parser;

	/**
	 * @generated
	 */
	private IParser getTestEntreBorneMinIncluseBorneMaxExcluse_5010Parser() {
		if (testEntreBorneMinIncluseBorneMaxExcluse_5010Parser == null) {
			EAttribute[] features = new EAttribute[] {
					QuestionnairePackage.eINSTANCE
							.getTestEntre_BorneMinIncluse(),
					QuestionnairePackage.eINSTANCE
							.getTestEntre_BorneMaxExcluse() };
			MessageFormatParser parser = new MessageFormatParser(features);
			testEntreBorneMinIncluseBorneMaxExcluse_5010Parser = parser;
		}
		return testEntreBorneMinIncluseBorneMaxExcluse_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser testInferieurValeur_5011Parser;

	/**
	 * @generated
	 */
	private IParser getTestInferieurValeur_5011Parser() {
		if (testInferieurValeur_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { QuestionnairePackage.eINSTANCE
					.getTestInferieur_Valeur() };
			MessageFormatParser parser = new MessageFormatParser(features);
			testInferieurValeur_5011Parser = parser;
		}
		return testInferieurValeur_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser testSuperieurValeur_5012Parser;

	/**
	 * @generated
	 */
	private IParser getTestSuperieurValeur_5012Parser() {
		if (testSuperieurValeur_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { QuestionnairePackage.eINSTANCE
					.getTestSuperieur_Valeur() };
			MessageFormatParser parser = new MessageFormatParser(features);
			testSuperieurValeur_5012Parser = parser;
		}
		return testSuperieurValeur_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser testEgaliteEgal_5013Parser;

	/**
	 * @generated
	 */
	private IParser getTestEgaliteEgal_5013Parser() {
		if (testEgaliteEgal_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { QuestionnairePackage.eINSTANCE
					.getTestEgalite_Egal() };
			MessageFormatParser parser = new MessageFormatParser(features);
			testEgaliteEgal_5013Parser = parser;
		}
		return testEgaliteEgal_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser finNom_5014Parser;

	/**
	 * @generated
	 */
	private IParser getFinNom_5014Parser() {
		if (finNom_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { QuestionnairePackage.eINSTANCE
					.getFin_Nom() };
			MessageFormatParser parser = new MessageFormatParser(features);
			finNom_5014Parser = parser;
		}
		return finNom_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser debutNom_5015Parser;

	/**
	 * @generated
	 */
	private IParser getDebutNom_5015Parser() {
		if (debutNom_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { QuestionnairePackage.eINSTANCE
					.getDebut_Nom() };
			MessageFormatParser parser = new MessageFormatParser(features);
			debutNom_5015Parser = parser;
		}
		return debutNom_5015Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case TexteQuestionEditPart.VISUAL_ID:
			return getTexteQuestion_5001Parser();
		case QuestionOuverteQuestionEditPart.VISUAL_ID:
			return getQuestionOuverteQuestion_5002Parser();
		case QuestionOuiNonQuestionEditPart.VISUAL_ID:
			return getQuestionOuiNonQuestion_5003Parser();
		case QuestionReponseMultipleQuestionEditPart.VISUAL_ID:
			return getQuestionReponseMultipleQuestion_5004Parser();
		case TypeSaisieNumeriqueRegexEditPart.VISUAL_ID:
			return getTypeSaisieNumeriqueRegex_5005Parser();
		case TypeSaisieAlphaNumeriqueRegexEditPart.VISUAL_ID:
			return getTypeSaisieAlphaNumeriqueRegex_5006Parser();
		case TypeSaisieAlphaRegexEditPart.VISUAL_ID:
			return getTypeSaisieAlphaRegex_5007Parser();
		case TypeSaisieAllRegexEditPart.VISUAL_ID:
			return getTypeSaisieAllRegex_5008Parser();
		case AiguilleurNomEditPart.VISUAL_ID:
			return getAiguilleurNom_5009Parser();
		case TestEntreBorneMinIncluseBorneMaxEditPart.VISUAL_ID:
			return getTestEntreBorneMinIncluseBorneMaxExcluse_5010Parser();
		case TestInferieurValeurEditPart.VISUAL_ID:
			return getTestInferieurValeur_5011Parser();
		case TestSuperieurValeurEditPart.VISUAL_ID:
			return getTestSuperieurValeur_5012Parser();
		case TestEgaliteEgalEditPart.VISUAL_ID:
			return getTestEgaliteEgal_5013Parser();
		case FinNomEditPart.VISUAL_ID:
			return getFinNom_5014Parser();
		case DebutNomEditPart.VISUAL_ID:
			return getDebutNom_5015Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(QuestionnaireVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(QuestionnaireVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (QuestionnaireElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}

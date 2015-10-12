/*
 * 
 */
package questionnaire.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import questionnaire.diagram.providers.QuestionnaireElementTypes;

/**
 * @generated
 */
public class QuestionnairePaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAiguilleur1CreationTool());
		paletteContainer.add(createDebut2CreationTool());
		paletteContainer.add(createFin3CreationTool());
		paletteContainer.add(createQuestionOuiNon4CreationTool());
		paletteContainer.add(createQuestionOuverte5CreationTool());
		paletteContainer.add(createQuestionReponseMultiple6CreationTool());
		paletteContainer.add(createTestEgalite7CreationTool());
		paletteContainer.add(createTestEntre8CreationTool());
		paletteContainer.add(createTestInferieur9CreationTool());
		paletteContainer.add(createTestSuperieur10CreationTool());
		paletteContainer.add(createTexte11CreationTool());
		paletteContainer.add(createTypeSaisieAll12CreationTool());
		paletteContainer.add(createTypeSaisieAlpha13CreationTool());
		paletteContainer.add(createTypeSaisieAlphaNumerique14CreationTool());
		paletteContainer.add(createTypeSaisieNumerique15CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createDestination1CreationTool());
		paletteContainer.add(createElseDestination2CreationTool());
		paletteContainer.add(createPremiereQuestion3CreationTool());
		paletteContainer.add(createSuite4CreationTool());
		paletteContainer.add(createTests5CreationTool());
		paletteContainer.add(createTypeSaisie6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAiguilleur1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Aiguilleur1CreationTool_title,
				Messages.Aiguilleur1CreationTool_desc,
				Collections
						.singletonList(QuestionnaireElementTypes.Aiguilleur_2009));
		entry.setId("createAiguilleur1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QuestionnaireElementTypes
				.getImageDescriptor(QuestionnaireElementTypes.Aiguilleur_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDebut2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Debut2CreationTool_title,
				Messages.Debut2CreationTool_desc,
				Collections.singletonList(QuestionnaireElementTypes.Debut_2015));
		entry.setId("createDebut2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QuestionnaireElementTypes
				.getImageDescriptor(QuestionnaireElementTypes.Debut_2015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFin3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Fin3CreationTool_title,
				Messages.Fin3CreationTool_desc,
				Collections.singletonList(QuestionnaireElementTypes.Fin_2014));
		entry.setId("createFin3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QuestionnaireElementTypes
				.getImageDescriptor(QuestionnaireElementTypes.Fin_2014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createQuestionOuiNon4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.QuestionOuiNon4CreationTool_title,
				Messages.QuestionOuiNon4CreationTool_desc,
				Collections
						.singletonList(QuestionnaireElementTypes.QuestionOuiNon_2003));
		entry.setId("createQuestionOuiNon4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QuestionnaireElementTypes
				.getImageDescriptor(QuestionnaireElementTypes.QuestionOuiNon_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createQuestionOuverte5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.QuestionOuverte5CreationTool_title,
				Messages.QuestionOuverte5CreationTool_desc,
				Collections
						.singletonList(QuestionnaireElementTypes.QuestionOuverte_2002));
		entry.setId("createQuestionOuverte5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QuestionnaireElementTypes
				.getImageDescriptor(QuestionnaireElementTypes.QuestionOuverte_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createQuestionReponseMultiple6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.QuestionReponseMultiple6CreationTool_title,
				Messages.QuestionReponseMultiple6CreationTool_desc,
				Collections
						.singletonList(QuestionnaireElementTypes.QuestionReponseMultiple_2004));
		entry.setId("createQuestionReponseMultiple6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QuestionnaireElementTypes
				.getImageDescriptor(QuestionnaireElementTypes.QuestionReponseMultiple_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTestEgalite7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.TestEgalite7CreationTool_title,
				Messages.TestEgalite7CreationTool_desc,
				Collections
						.singletonList(QuestionnaireElementTypes.TestEgalite_2013));
		entry.setId("createTestEgalite7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QuestionnaireElementTypes
				.getImageDescriptor(QuestionnaireElementTypes.TestEgalite_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTestEntre8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.TestEntre8CreationTool_title,
				Messages.TestEntre8CreationTool_desc,
				Collections
						.singletonList(QuestionnaireElementTypes.TestEntre_2010));
		entry.setId("createTestEntre8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QuestionnaireElementTypes
				.getImageDescriptor(QuestionnaireElementTypes.TestEntre_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTestInferieur9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.TestInferieur9CreationTool_title,
				Messages.TestInferieur9CreationTool_desc,
				Collections
						.singletonList(QuestionnaireElementTypes.TestInferieur_2011));
		entry.setId("createTestInferieur9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QuestionnaireElementTypes
				.getImageDescriptor(QuestionnaireElementTypes.TestInferieur_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTestSuperieur10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.TestSuperieur10CreationTool_title,
				Messages.TestSuperieur10CreationTool_desc,
				Collections
						.singletonList(QuestionnaireElementTypes.TestSuperieur_2012));
		entry.setId("createTestSuperieur10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QuestionnaireElementTypes
				.getImageDescriptor(QuestionnaireElementTypes.TestSuperieur_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTexte11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Texte11CreationTool_title,
				Messages.Texte11CreationTool_desc,
				Collections.singletonList(QuestionnaireElementTypes.Texte_2001));
		entry.setId("createTexte11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QuestionnaireElementTypes
				.getImageDescriptor(QuestionnaireElementTypes.Texte_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTypeSaisieAll12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.TypeSaisieAll12CreationTool_title,
				Messages.TypeSaisieAll12CreationTool_desc,
				Collections
						.singletonList(QuestionnaireElementTypes.TypeSaisieAll_2008));
		entry.setId("createTypeSaisieAll12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QuestionnaireElementTypes
				.getImageDescriptor(QuestionnaireElementTypes.TypeSaisieAll_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTypeSaisieAlpha13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.TypeSaisieAlpha13CreationTool_title,
				Messages.TypeSaisieAlpha13CreationTool_desc,
				Collections
						.singletonList(QuestionnaireElementTypes.TypeSaisieAlpha_2007));
		entry.setId("createTypeSaisieAlpha13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QuestionnaireElementTypes
				.getImageDescriptor(QuestionnaireElementTypes.TypeSaisieAlpha_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTypeSaisieAlphaNumerique14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.TypeSaisieAlphaNumerique14CreationTool_title,
				Messages.TypeSaisieAlphaNumerique14CreationTool_desc,
				Collections
						.singletonList(QuestionnaireElementTypes.TypeSaisieAlphaNumerique_2006));
		entry.setId("createTypeSaisieAlphaNumerique14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QuestionnaireElementTypes
				.getImageDescriptor(QuestionnaireElementTypes.TypeSaisieAlphaNumerique_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTypeSaisieNumerique15CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.TypeSaisieNumerique15CreationTool_title,
				Messages.TypeSaisieNumerique15CreationTool_desc,
				Collections
						.singletonList(QuestionnaireElementTypes.TypeSaisieNumerique_2005));
		entry.setId("createTypeSaisieNumerique15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QuestionnaireElementTypes
				.getImageDescriptor(QuestionnaireElementTypes.TypeSaisieNumerique_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDestination1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Destination1CreationTool_title,
				Messages.Destination1CreationTool_desc,
				Collections
						.singletonList(QuestionnaireElementTypes.TestDestination_4006));
		entry.setId("createDestination1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QuestionnaireElementTypes
				.getImageDescriptor(QuestionnaireElementTypes.TestDestination_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createElseDestination2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.ElseDestination2CreationTool_title,
				Messages.ElseDestination2CreationTool_desc,
				Collections
						.singletonList(QuestionnaireElementTypes.AiguilleurElseDestination_4003));
		entry.setId("createElseDestination2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QuestionnaireElementTypes
				.getImageDescriptor(QuestionnaireElementTypes.AiguilleurElseDestination_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPremiereQuestion3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.PremiereQuestion3CreationTool_title,
				Messages.PremiereQuestion3CreationTool_desc,
				Collections
						.singletonList(QuestionnaireElementTypes.DebutPremiereQuestion_4001));
		entry.setId("createPremiereQuestion3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QuestionnaireElementTypes
				.getImageDescriptor(QuestionnaireElementTypes.DebutPremiereQuestion_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSuite4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Suite4CreationTool_title,
				Messages.Suite4CreationTool_desc,
				Collections
						.singletonList(QuestionnaireElementTypes.QuestionSuite_4004));
		entry.setId("createSuite4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QuestionnaireElementTypes
				.getImageDescriptor(QuestionnaireElementTypes.QuestionSuite_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTests5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Tests5CreationTool_title,
				Messages.Tests5CreationTool_desc,
				Collections
						.singletonList(QuestionnaireElementTypes.AiguilleurTests_4002));
		entry.setId("createTests5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QuestionnaireElementTypes
				.getImageDescriptor(QuestionnaireElementTypes.AiguilleurTests_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTypeSaisie6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.TypeSaisie6CreationTool_title,
				Messages.TypeSaisie6CreationTool_desc,
				Collections
						.singletonList(QuestionnaireElementTypes.QuestionTypeSaisie_4005));
		entry.setId("createTypeSaisie6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QuestionnaireElementTypes
				.getImageDescriptor(QuestionnaireElementTypes.QuestionTypeSaisie_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}

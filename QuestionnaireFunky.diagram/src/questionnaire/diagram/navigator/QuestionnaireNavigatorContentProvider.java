/*
 * 
 */
package questionnaire.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import questionnaire.diagram.edit.parts.AiguilleurEditPart;
import questionnaire.diagram.edit.parts.AiguilleurElseDestinationEditPart;
import questionnaire.diagram.edit.parts.AiguilleurTestsEditPart;
import questionnaire.diagram.edit.parts.DebutEditPart;
import questionnaire.diagram.edit.parts.DebutPremiereQuestionEditPart;
import questionnaire.diagram.edit.parts.FinEditPart;
import questionnaire.diagram.edit.parts.QuestionOuiNonEditPart;
import questionnaire.diagram.edit.parts.QuestionOuverteEditPart;
import questionnaire.diagram.edit.parts.QuestionReponseMultipleEditPart;
import questionnaire.diagram.edit.parts.QuestionSuiteEditPart;
import questionnaire.diagram.edit.parts.QuestionTypeSaisieEditPart;
import questionnaire.diagram.edit.parts.QuestionnaireEditPart;
import questionnaire.diagram.edit.parts.TestDestinationEditPart;
import questionnaire.diagram.edit.parts.TestEgaliteEditPart;
import questionnaire.diagram.edit.parts.TestEntreEditPart;
import questionnaire.diagram.edit.parts.TestInferieurEditPart;
import questionnaire.diagram.edit.parts.TestSuperieurEditPart;
import questionnaire.diagram.edit.parts.TexteEditPart;
import questionnaire.diagram.edit.parts.TypeSaisieAllEditPart;
import questionnaire.diagram.edit.parts.TypeSaisieAlphaEditPart;
import questionnaire.diagram.edit.parts.TypeSaisieAlphaNumeriqueEditPart;
import questionnaire.diagram.edit.parts.TypeSaisieNumeriqueEditPart;
import questionnaire.diagram.part.Messages;
import questionnaire.diagram.part.QuestionnaireVisualIDRegistry;

/**
 * @generated
 */
public class QuestionnaireNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public QuestionnaireNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<QuestionnaireNavigatorItem> result = new ArrayList<QuestionnaireNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, QuestionnaireEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof QuestionnaireNavigatorGroup) {
			QuestionnaireNavigatorGroup group = (QuestionnaireNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof QuestionnaireNavigatorItem) {
			QuestionnaireNavigatorItem navigatorItem = (QuestionnaireNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		 * Due to plugin.xml restrictions this code will be called only for views representing
		 * shortcuts to this diagram elements created on other diagrams. 
		 */
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement)
					.getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (QuestionnaireVisualIDRegistry.getVisualID(view)) {

		case QuestionnaireEditPart.VISUAL_ID: {
			LinkedList<QuestionnaireAbstractNavigatorItem> result = new LinkedList<QuestionnaireAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			QuestionnaireNavigatorGroup links = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_Questionnaire_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TexteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionOuverteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionOuiNonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionReponseMultipleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TypeSaisieNumeriqueEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TypeSaisieAlphaNumeriqueEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TypeSaisieAlphaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TypeSaisieAllEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(AiguilleurEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TestEntreEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TestInferieurEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TestSuperieurEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TestEgaliteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(FinEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(DebutEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(DebutPremiereQuestionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(AiguilleurTestsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(AiguilleurElseDestinationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionSuiteEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionTypeSaisieEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TestDestinationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case TexteEditPart.VISUAL_ID: {
			LinkedList<QuestionnaireAbstractNavigatorItem> result = new LinkedList<QuestionnaireAbstractNavigatorItem>();
			Node sv = (Node) view;
			QuestionnaireNavigatorGroup incominglinks = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_Texte_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			QuestionnaireNavigatorGroup outgoinglinks = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_Texte_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(DebutPremiereQuestionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(AiguilleurElseDestinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionSuiteEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionSuiteEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionTypeSaisieEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TestDestinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case QuestionOuverteEditPart.VISUAL_ID: {
			LinkedList<QuestionnaireAbstractNavigatorItem> result = new LinkedList<QuestionnaireAbstractNavigatorItem>();
			Node sv = (Node) view;
			QuestionnaireNavigatorGroup incominglinks = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_QuestionOuverte_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			QuestionnaireNavigatorGroup outgoinglinks = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_QuestionOuverte_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(DebutPremiereQuestionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(AiguilleurElseDestinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionSuiteEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionSuiteEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionTypeSaisieEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TestDestinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case QuestionOuiNonEditPart.VISUAL_ID: {
			LinkedList<QuestionnaireAbstractNavigatorItem> result = new LinkedList<QuestionnaireAbstractNavigatorItem>();
			Node sv = (Node) view;
			QuestionnaireNavigatorGroup incominglinks = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_QuestionOuiNon_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			QuestionnaireNavigatorGroup outgoinglinks = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_QuestionOuiNon_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(DebutPremiereQuestionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(AiguilleurElseDestinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionSuiteEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionSuiteEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionTypeSaisieEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TestDestinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case QuestionReponseMultipleEditPart.VISUAL_ID: {
			LinkedList<QuestionnaireAbstractNavigatorItem> result = new LinkedList<QuestionnaireAbstractNavigatorItem>();
			Node sv = (Node) view;
			QuestionnaireNavigatorGroup incominglinks = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_QuestionReponseMultiple_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			QuestionnaireNavigatorGroup outgoinglinks = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_QuestionReponseMultiple_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(DebutPremiereQuestionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(AiguilleurElseDestinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionSuiteEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionSuiteEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionTypeSaisieEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TestDestinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TypeSaisieNumeriqueEditPart.VISUAL_ID: {
			LinkedList<QuestionnaireAbstractNavigatorItem> result = new LinkedList<QuestionnaireAbstractNavigatorItem>();
			Node sv = (Node) view;
			QuestionnaireNavigatorGroup incominglinks = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_TypeSaisieNumerique_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionTypeSaisieEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case TypeSaisieAlphaNumeriqueEditPart.VISUAL_ID: {
			LinkedList<QuestionnaireAbstractNavigatorItem> result = new LinkedList<QuestionnaireAbstractNavigatorItem>();
			Node sv = (Node) view;
			QuestionnaireNavigatorGroup incominglinks = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_TypeSaisieAlphaNumerique_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionTypeSaisieEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case TypeSaisieAlphaEditPart.VISUAL_ID: {
			LinkedList<QuestionnaireAbstractNavigatorItem> result = new LinkedList<QuestionnaireAbstractNavigatorItem>();
			Node sv = (Node) view;
			QuestionnaireNavigatorGroup incominglinks = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_TypeSaisieAlpha_2007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionTypeSaisieEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case TypeSaisieAllEditPart.VISUAL_ID: {
			LinkedList<QuestionnaireAbstractNavigatorItem> result = new LinkedList<QuestionnaireAbstractNavigatorItem>();
			Node sv = (Node) view;
			QuestionnaireNavigatorGroup incominglinks = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_TypeSaisieAll_2008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionTypeSaisieEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case AiguilleurEditPart.VISUAL_ID: {
			LinkedList<QuestionnaireAbstractNavigatorItem> result = new LinkedList<QuestionnaireAbstractNavigatorItem>();
			Node sv = (Node) view;
			QuestionnaireNavigatorGroup outgoinglinks = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_Aiguilleur_2009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			QuestionnaireNavigatorGroup incominglinks = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_Aiguilleur_2009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(AiguilleurTestsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(AiguilleurElseDestinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(AiguilleurElseDestinationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionSuiteEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TestDestinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case TestEntreEditPart.VISUAL_ID: {
			LinkedList<QuestionnaireAbstractNavigatorItem> result = new LinkedList<QuestionnaireAbstractNavigatorItem>();
			Node sv = (Node) view;
			QuestionnaireNavigatorGroup incominglinks = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_TestEntre_2010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			QuestionnaireNavigatorGroup outgoinglinks = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_TestEntre_2010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(AiguilleurTestsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TestDestinationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TestInferieurEditPart.VISUAL_ID: {
			LinkedList<QuestionnaireAbstractNavigatorItem> result = new LinkedList<QuestionnaireAbstractNavigatorItem>();
			Node sv = (Node) view;
			QuestionnaireNavigatorGroup incominglinks = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_TestInferieur_2011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			QuestionnaireNavigatorGroup outgoinglinks = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_TestInferieur_2011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(AiguilleurTestsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TestDestinationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TestSuperieurEditPart.VISUAL_ID: {
			LinkedList<QuestionnaireAbstractNavigatorItem> result = new LinkedList<QuestionnaireAbstractNavigatorItem>();
			Node sv = (Node) view;
			QuestionnaireNavigatorGroup incominglinks = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_TestSuperieur_2012_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			QuestionnaireNavigatorGroup outgoinglinks = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_TestSuperieur_2012_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(AiguilleurTestsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TestDestinationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TestEgaliteEditPart.VISUAL_ID: {
			LinkedList<QuestionnaireAbstractNavigatorItem> result = new LinkedList<QuestionnaireAbstractNavigatorItem>();
			Node sv = (Node) view;
			QuestionnaireNavigatorGroup incominglinks = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_TestEgalite_2013_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			QuestionnaireNavigatorGroup outgoinglinks = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_TestEgalite_2013_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(AiguilleurTestsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TestDestinationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case FinEditPart.VISUAL_ID: {
			LinkedList<QuestionnaireAbstractNavigatorItem> result = new LinkedList<QuestionnaireAbstractNavigatorItem>();
			Node sv = (Node) view;
			QuestionnaireNavigatorGroup incominglinks = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_Fin_2014_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(AiguilleurElseDestinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionSuiteEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TestDestinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case DebutEditPart.VISUAL_ID: {
			LinkedList<QuestionnaireAbstractNavigatorItem> result = new LinkedList<QuestionnaireAbstractNavigatorItem>();
			Node sv = (Node) view;
			QuestionnaireNavigatorGroup outgoinglinks = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_Debut_2015_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(DebutPremiereQuestionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DebutPremiereQuestionEditPart.VISUAL_ID: {
			LinkedList<QuestionnaireAbstractNavigatorItem> result = new LinkedList<QuestionnaireAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			QuestionnaireNavigatorGroup target = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_DebutPremiereQuestion_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			QuestionnaireNavigatorGroup source = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_DebutPremiereQuestion_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TexteEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionOuverteEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionOuiNonEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionReponseMultipleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(DebutEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case AiguilleurTestsEditPart.VISUAL_ID: {
			LinkedList<QuestionnaireAbstractNavigatorItem> result = new LinkedList<QuestionnaireAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			QuestionnaireNavigatorGroup target = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_AiguilleurTests_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			QuestionnaireNavigatorGroup source = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_AiguilleurTests_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TestEntreEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TestInferieurEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TestSuperieurEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TestEgaliteEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(AiguilleurEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case AiguilleurElseDestinationEditPart.VISUAL_ID: {
			LinkedList<QuestionnaireAbstractNavigatorItem> result = new LinkedList<QuestionnaireAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			QuestionnaireNavigatorGroup target = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_AiguilleurElseDestination_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			QuestionnaireNavigatorGroup source = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_AiguilleurElseDestination_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TexteEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionOuverteEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionOuiNonEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionReponseMultipleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(AiguilleurEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(FinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(AiguilleurEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case QuestionSuiteEditPart.VISUAL_ID: {
			LinkedList<QuestionnaireAbstractNavigatorItem> result = new LinkedList<QuestionnaireAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			QuestionnaireNavigatorGroup target = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_QuestionSuite_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			QuestionnaireNavigatorGroup source = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_QuestionSuite_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TexteEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionOuverteEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionOuiNonEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionReponseMultipleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(AiguilleurEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(FinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TexteEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionOuverteEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionOuiNonEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionReponseMultipleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case QuestionTypeSaisieEditPart.VISUAL_ID: {
			LinkedList<QuestionnaireAbstractNavigatorItem> result = new LinkedList<QuestionnaireAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			QuestionnaireNavigatorGroup target = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_QuestionTypeSaisie_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			QuestionnaireNavigatorGroup source = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_QuestionTypeSaisie_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TypeSaisieNumeriqueEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TypeSaisieAlphaNumeriqueEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TypeSaisieAlphaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TypeSaisieAllEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TexteEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionOuverteEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionOuiNonEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionReponseMultipleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case TestDestinationEditPart.VISUAL_ID: {
			LinkedList<QuestionnaireAbstractNavigatorItem> result = new LinkedList<QuestionnaireAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			QuestionnaireNavigatorGroup target = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_TestDestination_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			QuestionnaireNavigatorGroup source = new QuestionnaireNavigatorGroup(
					Messages.NavigatorGroupName_TestDestination_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TexteEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionOuverteEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionOuiNonEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(QuestionReponseMultipleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(AiguilleurEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(FinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TestEntreEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TestInferieurEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TestSuperieurEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					QuestionnaireVisualIDRegistry
							.getType(TestEgaliteEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return QuestionnaireEditPart.MODEL_ID
				.equals(QuestionnaireVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<QuestionnaireNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<QuestionnaireNavigatorItem> result = new ArrayList<QuestionnaireNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new QuestionnaireNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<QuestionnaireNavigatorItem> getForeignShortcuts(
			Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView)
					&& nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof QuestionnaireAbstractNavigatorItem) {
			QuestionnaireAbstractNavigatorItem abstractNavigatorItem = (QuestionnaireAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}

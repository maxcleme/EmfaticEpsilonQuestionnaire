/*
 * 
 */
package questionnaire.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import questionnaire.diagram.part.QuestionnaireVisualIDRegistry;

/**
 * @generated
 */
public class QuestionnaireNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4008;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 4007;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof QuestionnaireNavigatorItem) {
			QuestionnaireNavigatorItem item = (QuestionnaireNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return QuestionnaireVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}

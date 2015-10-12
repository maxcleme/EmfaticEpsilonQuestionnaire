/*
 * 
 */
package questionnaire.diagram.providers;

import questionnaire.diagram.part.QuestionnaireDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = QuestionnaireDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			QuestionnaireDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}

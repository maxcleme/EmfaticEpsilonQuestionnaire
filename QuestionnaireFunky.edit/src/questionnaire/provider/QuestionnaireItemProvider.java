/**
 */
package questionnaire.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import questionnaire.Questionnaire;
import questionnaire.QuestionnaireFactory;
import questionnaire.QuestionnairePackage;

/**
 * This is the item provider adapter for a {@link questionnaire.Questionnaire} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class QuestionnaireItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(QuestionnairePackage.Literals.QUESTIONNAIRE__QUESTIONS);
			childrenFeatures.add(QuestionnairePackage.Literals.QUESTIONNAIRE__TYPES_SAISIES);
			childrenFeatures.add(QuestionnairePackage.Literals.QUESTIONNAIRE__AIGUILLEURS);
			childrenFeatures.add(QuestionnairePackage.Literals.QUESTIONNAIRE__TESTS);
			childrenFeatures.add(QuestionnairePackage.Literals.QUESTIONNAIRE__FIN);
			childrenFeatures.add(QuestionnairePackage.Literals.QUESTIONNAIRE__DEBUT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Questionnaire.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Questionnaire"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Questionnaire_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Questionnaire.class)) {
			case QuestionnairePackage.QUESTIONNAIRE__QUESTIONS:
			case QuestionnairePackage.QUESTIONNAIRE__TYPES_SAISIES:
			case QuestionnairePackage.QUESTIONNAIRE__AIGUILLEURS:
			case QuestionnairePackage.QUESTIONNAIRE__TESTS:
			case QuestionnairePackage.QUESTIONNAIRE__FIN:
			case QuestionnairePackage.QUESTIONNAIRE__DEBUT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(QuestionnairePackage.Literals.QUESTIONNAIRE__QUESTIONS,
				 QuestionnaireFactory.eINSTANCE.createTexte()));

		newChildDescriptors.add
			(createChildParameter
				(QuestionnairePackage.Literals.QUESTIONNAIRE__QUESTIONS,
				 QuestionnaireFactory.eINSTANCE.createQuestionOuverte()));

		newChildDescriptors.add
			(createChildParameter
				(QuestionnairePackage.Literals.QUESTIONNAIRE__QUESTIONS,
				 QuestionnaireFactory.eINSTANCE.createQuestionOuiNon()));

		newChildDescriptors.add
			(createChildParameter
				(QuestionnairePackage.Literals.QUESTIONNAIRE__QUESTIONS,
				 QuestionnaireFactory.eINSTANCE.createQuestionReponseMultiple()));

		newChildDescriptors.add
			(createChildParameter
				(QuestionnairePackage.Literals.QUESTIONNAIRE__TYPES_SAISIES,
				 QuestionnaireFactory.eINSTANCE.createTypeSaisieNumerique()));

		newChildDescriptors.add
			(createChildParameter
				(QuestionnairePackage.Literals.QUESTIONNAIRE__TYPES_SAISIES,
				 QuestionnaireFactory.eINSTANCE.createTypeSaisieAlphaNumerique()));

		newChildDescriptors.add
			(createChildParameter
				(QuestionnairePackage.Literals.QUESTIONNAIRE__TYPES_SAISIES,
				 QuestionnaireFactory.eINSTANCE.createTypeSaisieAlpha()));

		newChildDescriptors.add
			(createChildParameter
				(QuestionnairePackage.Literals.QUESTIONNAIRE__TYPES_SAISIES,
				 QuestionnaireFactory.eINSTANCE.createTypeSaisieAll()));

		newChildDescriptors.add
			(createChildParameter
				(QuestionnairePackage.Literals.QUESTIONNAIRE__AIGUILLEURS,
				 QuestionnaireFactory.eINSTANCE.createAiguilleur()));

		newChildDescriptors.add
			(createChildParameter
				(QuestionnairePackage.Literals.QUESTIONNAIRE__TESTS,
				 QuestionnaireFactory.eINSTANCE.createTestEntre()));

		newChildDescriptors.add
			(createChildParameter
				(QuestionnairePackage.Literals.QUESTIONNAIRE__TESTS,
				 QuestionnaireFactory.eINSTANCE.createTestInferieur()));

		newChildDescriptors.add
			(createChildParameter
				(QuestionnairePackage.Literals.QUESTIONNAIRE__TESTS,
				 QuestionnaireFactory.eINSTANCE.createTestSuperieur()));

		newChildDescriptors.add
			(createChildParameter
				(QuestionnairePackage.Literals.QUESTIONNAIRE__TESTS,
				 QuestionnaireFactory.eINSTANCE.createTestEgalite()));

		newChildDescriptors.add
			(createChildParameter
				(QuestionnairePackage.Literals.QUESTIONNAIRE__FIN,
				 QuestionnaireFactory.eINSTANCE.createFin()));

		newChildDescriptors.add
			(createChildParameter
				(QuestionnairePackage.Literals.QUESTIONNAIRE__DEBUT,
				 QuestionnaireFactory.eINSTANCE.createDebut()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return QuestionnaireEditPlugin.INSTANCE;
	}

}

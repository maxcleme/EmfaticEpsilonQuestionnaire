/**
 */
package questionnaire.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import questionnaire.Debut;
import questionnaire.Question;
import questionnaire.QuestionnairePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Debut</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link questionnaire.impl.DebutImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link questionnaire.impl.DebutImpl#getPremiereQuestion <em>Premiere Question</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DebutImpl extends EObjectImpl implements Debut {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPremiereQuestion() <em>Premiere Question</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremiereQuestion()
	 * @generated
	 * @ordered
	 */
	protected Question premiereQuestion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DebutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionnairePackage.Literals.DEBUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.DEBUT__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question getPremiereQuestion() {
		if (premiereQuestion != null && premiereQuestion.eIsProxy()) {
			InternalEObject oldPremiereQuestion = (InternalEObject)premiereQuestion;
			premiereQuestion = (Question)eResolveProxy(oldPremiereQuestion);
			if (premiereQuestion != oldPremiereQuestion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuestionnairePackage.DEBUT__PREMIERE_QUESTION, oldPremiereQuestion, premiereQuestion));
			}
		}
		return premiereQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question basicGetPremiereQuestion() {
		return premiereQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPremiereQuestion(Question newPremiereQuestion) {
		Question oldPremiereQuestion = premiereQuestion;
		premiereQuestion = newPremiereQuestion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.DEBUT__PREMIERE_QUESTION, oldPremiereQuestion, premiereQuestion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuestionnairePackage.DEBUT__NOM:
				return getNom();
			case QuestionnairePackage.DEBUT__PREMIERE_QUESTION:
				if (resolve) return getPremiereQuestion();
				return basicGetPremiereQuestion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QuestionnairePackage.DEBUT__NOM:
				setNom((String)newValue);
				return;
			case QuestionnairePackage.DEBUT__PREMIERE_QUESTION:
				setPremiereQuestion((Question)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QuestionnairePackage.DEBUT__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case QuestionnairePackage.DEBUT__PREMIERE_QUESTION:
				setPremiereQuestion((Question)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QuestionnairePackage.DEBUT__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case QuestionnairePackage.DEBUT__PREMIERE_QUESTION:
				return premiereQuestion != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //DebutImpl

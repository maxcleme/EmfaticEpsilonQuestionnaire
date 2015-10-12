/**
 */
package questionnaire.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import questionnaire.QuestionnairePackage;
import questionnaire.TestSuperieur;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Superieur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link questionnaire.impl.TestSuperieurImpl#getValeur <em>Valeur</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestSuperieurImpl extends TestImpl implements TestSuperieur {
	/**
	 * The default value of the '{@link #getValeur() <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur()
	 * @generated
	 * @ordered
	 */
	protected static final int VALEUR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValeur() <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur()
	 * @generated
	 * @ordered
	 */
	protected int valeur = VALEUR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestSuperieurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionnairePackage.Literals.TEST_SUPERIEUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValeur() {
		return valeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValeur(int newValeur) {
		int oldValeur = valeur;
		valeur = newValeur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.TEST_SUPERIEUR__VALEUR, oldValeur, valeur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuestionnairePackage.TEST_SUPERIEUR__VALEUR:
				return getValeur();
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
			case QuestionnairePackage.TEST_SUPERIEUR__VALEUR:
				setValeur((Integer)newValue);
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
			case QuestionnairePackage.TEST_SUPERIEUR__VALEUR:
				setValeur(VALEUR_EDEFAULT);
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
			case QuestionnairePackage.TEST_SUPERIEUR__VALEUR:
				return valeur != VALEUR_EDEFAULT;
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
		result.append(" (valeur: ");
		result.append(valeur);
		result.append(')');
		return result.toString();
	}

} //TestSuperieurImpl

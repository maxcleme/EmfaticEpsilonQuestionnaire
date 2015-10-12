/**
 */
package questionnaire.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import questionnaire.QuestionnairePackage;
import questionnaire.TestEgalite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Egalite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link questionnaire.impl.TestEgaliteImpl#getEgal <em>Egal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestEgaliteImpl extends TestImpl implements TestEgalite {
	/**
	 * The default value of the '{@link #getEgal() <em>Egal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEgal()
	 * @generated
	 * @ordered
	 */
	protected static final String EGAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEgal() <em>Egal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEgal()
	 * @generated
	 * @ordered
	 */
	protected String egal = EGAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestEgaliteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionnairePackage.Literals.TEST_EGALITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEgal() {
		return egal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEgal(String newEgal) {
		String oldEgal = egal;
		egal = newEgal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.TEST_EGALITE__EGAL, oldEgal, egal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuestionnairePackage.TEST_EGALITE__EGAL:
				return getEgal();
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
			case QuestionnairePackage.TEST_EGALITE__EGAL:
				setEgal((String)newValue);
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
			case QuestionnairePackage.TEST_EGALITE__EGAL:
				setEgal(EGAL_EDEFAULT);
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
			case QuestionnairePackage.TEST_EGALITE__EGAL:
				return EGAL_EDEFAULT == null ? egal != null : !EGAL_EDEFAULT.equals(egal);
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
		result.append(" (egal: ");
		result.append(egal);
		result.append(')');
		return result.toString();
	}

} //TestEgaliteImpl

/**
 */
package questionnaire.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import questionnaire.QuestionnairePackage;
import questionnaire.TestEntre;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Entre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link questionnaire.impl.TestEntreImpl#getBorneMinIncluse <em>Borne Min Incluse</em>}</li>
 *   <li>{@link questionnaire.impl.TestEntreImpl#getBorneMaxExcluse <em>Borne Max Excluse</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestEntreImpl extends TestImpl implements TestEntre {
	/**
	 * The default value of the '{@link #getBorneMinIncluse() <em>Borne Min Incluse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorneMinIncluse()
	 * @generated
	 * @ordered
	 */
	protected static final int BORNE_MIN_INCLUSE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBorneMinIncluse() <em>Borne Min Incluse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorneMinIncluse()
	 * @generated
	 * @ordered
	 */
	protected int borneMinIncluse = BORNE_MIN_INCLUSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorneMaxExcluse() <em>Borne Max Excluse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorneMaxExcluse()
	 * @generated
	 * @ordered
	 */
	protected static final int BORNE_MAX_EXCLUSE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBorneMaxExcluse() <em>Borne Max Excluse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorneMaxExcluse()
	 * @generated
	 * @ordered
	 */
	protected int borneMaxExcluse = BORNE_MAX_EXCLUSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestEntreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionnairePackage.Literals.TEST_ENTRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBorneMinIncluse() {
		return borneMinIncluse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorneMinIncluse(int newBorneMinIncluse) {
		int oldBorneMinIncluse = borneMinIncluse;
		borneMinIncluse = newBorneMinIncluse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.TEST_ENTRE__BORNE_MIN_INCLUSE, oldBorneMinIncluse, borneMinIncluse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBorneMaxExcluse() {
		return borneMaxExcluse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorneMaxExcluse(int newBorneMaxExcluse) {
		int oldBorneMaxExcluse = borneMaxExcluse;
		borneMaxExcluse = newBorneMaxExcluse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.TEST_ENTRE__BORNE_MAX_EXCLUSE, oldBorneMaxExcluse, borneMaxExcluse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuestionnairePackage.TEST_ENTRE__BORNE_MIN_INCLUSE:
				return getBorneMinIncluse();
			case QuestionnairePackage.TEST_ENTRE__BORNE_MAX_EXCLUSE:
				return getBorneMaxExcluse();
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
			case QuestionnairePackage.TEST_ENTRE__BORNE_MIN_INCLUSE:
				setBorneMinIncluse((Integer)newValue);
				return;
			case QuestionnairePackage.TEST_ENTRE__BORNE_MAX_EXCLUSE:
				setBorneMaxExcluse((Integer)newValue);
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
			case QuestionnairePackage.TEST_ENTRE__BORNE_MIN_INCLUSE:
				setBorneMinIncluse(BORNE_MIN_INCLUSE_EDEFAULT);
				return;
			case QuestionnairePackage.TEST_ENTRE__BORNE_MAX_EXCLUSE:
				setBorneMaxExcluse(BORNE_MAX_EXCLUSE_EDEFAULT);
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
			case QuestionnairePackage.TEST_ENTRE__BORNE_MIN_INCLUSE:
				return borneMinIncluse != BORNE_MIN_INCLUSE_EDEFAULT;
			case QuestionnairePackage.TEST_ENTRE__BORNE_MAX_EXCLUSE:
				return borneMaxExcluse != BORNE_MAX_EXCLUSE_EDEFAULT;
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
		result.append(" (borneMinIncluse: ");
		result.append(borneMinIncluse);
		result.append(", borneMaxExcluse: ");
		result.append(borneMaxExcluse);
		result.append(')');
		return result.toString();
	}

} //TestEntreImpl

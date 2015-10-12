/**
 */
package questionnaire.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import questionnaire.Aiguilleur;
import questionnaire.Next;
import questionnaire.QuestionnairePackage;
import questionnaire.Test;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aiguilleur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link questionnaire.impl.AiguilleurImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link questionnaire.impl.AiguilleurImpl#getTests <em>Tests</em>}</li>
 *   <li>{@link questionnaire.impl.AiguilleurImpl#getElseDestination <em>Else Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AiguilleurImpl extends NextImpl implements Aiguilleur {
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
	 * The cached value of the '{@link #getTests() <em>Tests</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTests()
	 * @generated
	 * @ordered
	 */
	protected EList<Test> tests;

	/**
	 * The cached value of the '{@link #getElseDestination() <em>Else Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseDestination()
	 * @generated
	 * @ordered
	 */
	protected Next elseDestination;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AiguilleurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionnairePackage.Literals.AIGUILLEUR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.AIGUILLEUR__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Test> getTests() {
		if (tests == null) {
			tests = new EObjectResolvingEList<Test>(Test.class, this, QuestionnairePackage.AIGUILLEUR__TESTS);
		}
		return tests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Next getElseDestination() {
		if (elseDestination != null && elseDestination.eIsProxy()) {
			InternalEObject oldElseDestination = (InternalEObject)elseDestination;
			elseDestination = (Next)eResolveProxy(oldElseDestination);
			if (elseDestination != oldElseDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuestionnairePackage.AIGUILLEUR__ELSE_DESTINATION, oldElseDestination, elseDestination));
			}
		}
		return elseDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Next basicGetElseDestination() {
		return elseDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseDestination(Next newElseDestination) {
		Next oldElseDestination = elseDestination;
		elseDestination = newElseDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.AIGUILLEUR__ELSE_DESTINATION, oldElseDestination, elseDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuestionnairePackage.AIGUILLEUR__NOM:
				return getNom();
			case QuestionnairePackage.AIGUILLEUR__TESTS:
				return getTests();
			case QuestionnairePackage.AIGUILLEUR__ELSE_DESTINATION:
				if (resolve) return getElseDestination();
				return basicGetElseDestination();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QuestionnairePackage.AIGUILLEUR__NOM:
				setNom((String)newValue);
				return;
			case QuestionnairePackage.AIGUILLEUR__TESTS:
				getTests().clear();
				getTests().addAll((Collection<? extends Test>)newValue);
				return;
			case QuestionnairePackage.AIGUILLEUR__ELSE_DESTINATION:
				setElseDestination((Next)newValue);
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
			case QuestionnairePackage.AIGUILLEUR__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case QuestionnairePackage.AIGUILLEUR__TESTS:
				getTests().clear();
				return;
			case QuestionnairePackage.AIGUILLEUR__ELSE_DESTINATION:
				setElseDestination((Next)null);
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
			case QuestionnairePackage.AIGUILLEUR__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case QuestionnairePackage.AIGUILLEUR__TESTS:
				return tests != null && !tests.isEmpty();
			case QuestionnairePackage.AIGUILLEUR__ELSE_DESTINATION:
				return elseDestination != null;
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

} //AiguilleurImpl

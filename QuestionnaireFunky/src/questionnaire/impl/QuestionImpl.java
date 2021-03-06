/**
 */
package questionnaire.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import questionnaire.Next;
import questionnaire.Question;
import questionnaire.QuestionnairePackage;
import questionnaire.TypeSaisie;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link questionnaire.impl.QuestionImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link questionnaire.impl.QuestionImpl#getTypeSaisie <em>Type Saisie</em>}</li>
 *   <li>{@link questionnaire.impl.QuestionImpl#getSuite <em>Suite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class QuestionImpl extends NextImpl implements Question {
	/**
	 * The default value of the '{@link #getQuestion() <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected static final String QUESTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected String question = QUESTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypeSaisie() <em>Type Saisie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSaisie()
	 * @generated
	 * @ordered
	 */
	protected TypeSaisie typeSaisie;

	/**
	 * The cached value of the '{@link #getSuite() <em>Suite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuite()
	 * @generated
	 * @ordered
	 */
	protected Next suite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionnairePackage.Literals.QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestion(String newQuestion) {
		String oldQuestion = question;
		question = newQuestion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.QUESTION__QUESTION, oldQuestion, question));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSaisie getTypeSaisie() {
		return typeSaisie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeSaisie(TypeSaisie newTypeSaisie, NotificationChain msgs) {
		TypeSaisie oldTypeSaisie = typeSaisie;
		typeSaisie = newTypeSaisie;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuestionnairePackage.QUESTION__TYPE_SAISIE, oldTypeSaisie, newTypeSaisie);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeSaisie(TypeSaisie newTypeSaisie) {
		if (newTypeSaisie != typeSaisie) {
			NotificationChain msgs = null;
			if (typeSaisie != null)
				msgs = ((InternalEObject)typeSaisie).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuestionnairePackage.QUESTION__TYPE_SAISIE, null, msgs);
			if (newTypeSaisie != null)
				msgs = ((InternalEObject)newTypeSaisie).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuestionnairePackage.QUESTION__TYPE_SAISIE, null, msgs);
			msgs = basicSetTypeSaisie(newTypeSaisie, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.QUESTION__TYPE_SAISIE, newTypeSaisie, newTypeSaisie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Next getSuite() {
		if (suite != null && suite.eIsProxy()) {
			InternalEObject oldSuite = (InternalEObject)suite;
			suite = (Next)eResolveProxy(oldSuite);
			if (suite != oldSuite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuestionnairePackage.QUESTION__SUITE, oldSuite, suite));
			}
		}
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Next basicGetSuite() {
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuite(Next newSuite) {
		Next oldSuite = suite;
		suite = newSuite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.QUESTION__SUITE, oldSuite, suite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QuestionnairePackage.QUESTION__TYPE_SAISIE:
				return basicSetTypeSaisie(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuestionnairePackage.QUESTION__QUESTION:
				return getQuestion();
			case QuestionnairePackage.QUESTION__TYPE_SAISIE:
				return getTypeSaisie();
			case QuestionnairePackage.QUESTION__SUITE:
				if (resolve) return getSuite();
				return basicGetSuite();
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
			case QuestionnairePackage.QUESTION__QUESTION:
				setQuestion((String)newValue);
				return;
			case QuestionnairePackage.QUESTION__TYPE_SAISIE:
				setTypeSaisie((TypeSaisie)newValue);
				return;
			case QuestionnairePackage.QUESTION__SUITE:
				setSuite((Next)newValue);
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
			case QuestionnairePackage.QUESTION__QUESTION:
				setQuestion(QUESTION_EDEFAULT);
				return;
			case QuestionnairePackage.QUESTION__TYPE_SAISIE:
				setTypeSaisie((TypeSaisie)null);
				return;
			case QuestionnairePackage.QUESTION__SUITE:
				setSuite((Next)null);
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
			case QuestionnairePackage.QUESTION__QUESTION:
				return QUESTION_EDEFAULT == null ? question != null : !QUESTION_EDEFAULT.equals(question);
			case QuestionnairePackage.QUESTION__TYPE_SAISIE:
				return typeSaisie != null;
			case QuestionnairePackage.QUESTION__SUITE:
				return suite != null;
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
		result.append(" (question: ");
		result.append(question);
		result.append(')');
		return result.toString();
	}

} //QuestionImpl

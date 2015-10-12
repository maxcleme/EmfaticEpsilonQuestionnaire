/**
 */
package questionnaire.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import questionnaire.Aiguilleur;
import questionnaire.Debut;
import questionnaire.Fin;
import questionnaire.Question;
import questionnaire.Questionnaire;
import questionnaire.QuestionnairePackage;
import questionnaire.Test;
import questionnaire.TypeSaisie;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link questionnaire.impl.QuestionnaireImpl#getQuestions <em>Questions</em>}</li>
 *   <li>{@link questionnaire.impl.QuestionnaireImpl#getTypesSaisies <em>Types Saisies</em>}</li>
 *   <li>{@link questionnaire.impl.QuestionnaireImpl#getAiguilleurs <em>Aiguilleurs</em>}</li>
 *   <li>{@link questionnaire.impl.QuestionnaireImpl#getTests <em>Tests</em>}</li>
 *   <li>{@link questionnaire.impl.QuestionnaireImpl#getFin <em>Fin</em>}</li>
 *   <li>{@link questionnaire.impl.QuestionnaireImpl#getDebut <em>Debut</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionnaireImpl extends EObjectImpl implements Questionnaire {
	/**
	 * The cached value of the '{@link #getQuestions() <em>Questions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestions()
	 * @generated
	 * @ordered
	 */
	protected EList<Question> questions;

	/**
	 * The cached value of the '{@link #getTypesSaisies() <em>Types Saisies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypesSaisies()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeSaisie> typesSaisies;

	/**
	 * The cached value of the '{@link #getAiguilleurs() <em>Aiguilleurs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAiguilleurs()
	 * @generated
	 * @ordered
	 */
	protected EList<Aiguilleur> aiguilleurs;

	/**
	 * The cached value of the '{@link #getTests() <em>Tests</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTests()
	 * @generated
	 * @ordered
	 */
	protected EList<Test> tests;

	/**
	 * The cached value of the '{@link #getFin() <em>Fin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFin()
	 * @generated
	 * @ordered
	 */
	protected Fin fin;

	/**
	 * The cached value of the '{@link #getDebut() <em>Debut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebut()
	 * @generated
	 * @ordered
	 */
	protected Debut debut;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionnairePackage.Literals.QUESTIONNAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Question> getQuestions() {
		if (questions == null) {
			questions = new EObjectContainmentEList<Question>(Question.class, this, QuestionnairePackage.QUESTIONNAIRE__QUESTIONS);
		}
		return questions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeSaisie> getTypesSaisies() {
		if (typesSaisies == null) {
			typesSaisies = new EObjectContainmentEList<TypeSaisie>(TypeSaisie.class, this, QuestionnairePackage.QUESTIONNAIRE__TYPES_SAISIES);
		}
		return typesSaisies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Aiguilleur> getAiguilleurs() {
		if (aiguilleurs == null) {
			aiguilleurs = new EObjectContainmentEList<Aiguilleur>(Aiguilleur.class, this, QuestionnairePackage.QUESTIONNAIRE__AIGUILLEURS);
		}
		return aiguilleurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Test> getTests() {
		if (tests == null) {
			tests = new EObjectContainmentEList<Test>(Test.class, this, QuestionnairePackage.QUESTIONNAIRE__TESTS);
		}
		return tests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fin getFin() {
		return fin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFin(Fin newFin, NotificationChain msgs) {
		Fin oldFin = fin;
		fin = newFin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuestionnairePackage.QUESTIONNAIRE__FIN, oldFin, newFin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFin(Fin newFin) {
		if (newFin != fin) {
			NotificationChain msgs = null;
			if (fin != null)
				msgs = ((InternalEObject)fin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuestionnairePackage.QUESTIONNAIRE__FIN, null, msgs);
			if (newFin != null)
				msgs = ((InternalEObject)newFin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuestionnairePackage.QUESTIONNAIRE__FIN, null, msgs);
			msgs = basicSetFin(newFin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.QUESTIONNAIRE__FIN, newFin, newFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Debut getDebut() {
		return debut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDebut(Debut newDebut, NotificationChain msgs) {
		Debut oldDebut = debut;
		debut = newDebut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuestionnairePackage.QUESTIONNAIRE__DEBUT, oldDebut, newDebut);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebut(Debut newDebut) {
		if (newDebut != debut) {
			NotificationChain msgs = null;
			if (debut != null)
				msgs = ((InternalEObject)debut).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuestionnairePackage.QUESTIONNAIRE__DEBUT, null, msgs);
			if (newDebut != null)
				msgs = ((InternalEObject)newDebut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuestionnairePackage.QUESTIONNAIRE__DEBUT, null, msgs);
			msgs = basicSetDebut(newDebut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.QUESTIONNAIRE__DEBUT, newDebut, newDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QuestionnairePackage.QUESTIONNAIRE__QUESTIONS:
				return ((InternalEList<?>)getQuestions()).basicRemove(otherEnd, msgs);
			case QuestionnairePackage.QUESTIONNAIRE__TYPES_SAISIES:
				return ((InternalEList<?>)getTypesSaisies()).basicRemove(otherEnd, msgs);
			case QuestionnairePackage.QUESTIONNAIRE__AIGUILLEURS:
				return ((InternalEList<?>)getAiguilleurs()).basicRemove(otherEnd, msgs);
			case QuestionnairePackage.QUESTIONNAIRE__TESTS:
				return ((InternalEList<?>)getTests()).basicRemove(otherEnd, msgs);
			case QuestionnairePackage.QUESTIONNAIRE__FIN:
				return basicSetFin(null, msgs);
			case QuestionnairePackage.QUESTIONNAIRE__DEBUT:
				return basicSetDebut(null, msgs);
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
			case QuestionnairePackage.QUESTIONNAIRE__QUESTIONS:
				return getQuestions();
			case QuestionnairePackage.QUESTIONNAIRE__TYPES_SAISIES:
				return getTypesSaisies();
			case QuestionnairePackage.QUESTIONNAIRE__AIGUILLEURS:
				return getAiguilleurs();
			case QuestionnairePackage.QUESTIONNAIRE__TESTS:
				return getTests();
			case QuestionnairePackage.QUESTIONNAIRE__FIN:
				return getFin();
			case QuestionnairePackage.QUESTIONNAIRE__DEBUT:
				return getDebut();
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
			case QuestionnairePackage.QUESTIONNAIRE__QUESTIONS:
				getQuestions().clear();
				getQuestions().addAll((Collection<? extends Question>)newValue);
				return;
			case QuestionnairePackage.QUESTIONNAIRE__TYPES_SAISIES:
				getTypesSaisies().clear();
				getTypesSaisies().addAll((Collection<? extends TypeSaisie>)newValue);
				return;
			case QuestionnairePackage.QUESTIONNAIRE__AIGUILLEURS:
				getAiguilleurs().clear();
				getAiguilleurs().addAll((Collection<? extends Aiguilleur>)newValue);
				return;
			case QuestionnairePackage.QUESTIONNAIRE__TESTS:
				getTests().clear();
				getTests().addAll((Collection<? extends Test>)newValue);
				return;
			case QuestionnairePackage.QUESTIONNAIRE__FIN:
				setFin((Fin)newValue);
				return;
			case QuestionnairePackage.QUESTIONNAIRE__DEBUT:
				setDebut((Debut)newValue);
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
			case QuestionnairePackage.QUESTIONNAIRE__QUESTIONS:
				getQuestions().clear();
				return;
			case QuestionnairePackage.QUESTIONNAIRE__TYPES_SAISIES:
				getTypesSaisies().clear();
				return;
			case QuestionnairePackage.QUESTIONNAIRE__AIGUILLEURS:
				getAiguilleurs().clear();
				return;
			case QuestionnairePackage.QUESTIONNAIRE__TESTS:
				getTests().clear();
				return;
			case QuestionnairePackage.QUESTIONNAIRE__FIN:
				setFin((Fin)null);
				return;
			case QuestionnairePackage.QUESTIONNAIRE__DEBUT:
				setDebut((Debut)null);
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
			case QuestionnairePackage.QUESTIONNAIRE__QUESTIONS:
				return questions != null && !questions.isEmpty();
			case QuestionnairePackage.QUESTIONNAIRE__TYPES_SAISIES:
				return typesSaisies != null && !typesSaisies.isEmpty();
			case QuestionnairePackage.QUESTIONNAIRE__AIGUILLEURS:
				return aiguilleurs != null && !aiguilleurs.isEmpty();
			case QuestionnairePackage.QUESTIONNAIRE__TESTS:
				return tests != null && !tests.isEmpty();
			case QuestionnairePackage.QUESTIONNAIRE__FIN:
				return fin != null;
			case QuestionnairePackage.QUESTIONNAIRE__DEBUT:
				return debut != null;
		}
		return super.eIsSet(featureID);
	}

} //QuestionnaireImpl

/**
 */
package org.irisa.diverse.videogen.videogenl.videoGen.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.irisa.diverse.videogen.videogenl.videoGen.Transition;
import org.irisa.diverse.videogen.videogenl.videoGen.Video;
import org.irisa.diverse.videogen.videogenl.videoGen.VideoGen;
import org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Video Gen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videoGen.impl.VideoGenImpl#getMinDurationConstraint <em>Min Duration Constraint</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videoGen.impl.VideoGenImpl#getMaxDurationConstraint <em>Max Duration Constraint</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videoGen.impl.VideoGenImpl#getVariantes <em>Variantes</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videoGen.impl.VideoGenImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videoGen.impl.VideoGenImpl#getVideos <em>Videos</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videoGen.impl.VideoGenImpl#getMinUserConstraint <em>Min User Constraint</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videoGen.impl.VideoGenImpl#getMaxUserConstraint <em>Max User Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VideoGenImpl extends NamedElementImpl implements VideoGen {
	/**
	 * The default value of the '{@link #getMinDurationConstraint() <em>Min Duration Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDurationConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_DURATION_CONSTRAINT_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getMinDurationConstraint() <em>Min Duration Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDurationConstraint()
	 * @generated
	 * @ordered
	 */
	protected Integer minDurationConstraint = MIN_DURATION_CONSTRAINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxDurationConstraint() <em>Max Duration Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDurationConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_DURATION_CONSTRAINT_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getMaxDurationConstraint() <em>Max Duration Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDurationConstraint()
	 * @generated
	 * @ordered
	 */
	protected Integer maxDurationConstraint = MAX_DURATION_CONSTRAINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVariantes() <em>Variantes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariantes()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VARIANTES_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getVariantes() <em>Variantes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariantes()
	 * @generated
	 * @ordered
	 */
	protected Integer variantes = VARIANTES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getVideos() <em>Videos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideos()
	 * @generated
	 * @ordered
	 */
	protected EList<Video> videos;

	/**
	 * The default value of the '{@link #getMinUserConstraint() <em>Min User Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinUserConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_USER_CONSTRAINT_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getMinUserConstraint() <em>Min User Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinUserConstraint()
	 * @generated
	 * @ordered
	 */
	protected Integer minUserConstraint = MIN_USER_CONSTRAINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxUserConstraint() <em>Max User Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxUserConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_USER_CONSTRAINT_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getMaxUserConstraint() <em>Max User Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxUserConstraint()
	 * @generated
	 * @ordered
	 */
	protected Integer maxUserConstraint = MAX_USER_CONSTRAINT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoGenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideoGenPackage.Literals.VIDEO_GEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMinDurationConstraint() {
		return minDurationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinDurationConstraint(Integer newMinDurationConstraint) {
		Integer oldMinDurationConstraint = minDurationConstraint;
		minDurationConstraint = newMinDurationConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.VIDEO_GEN__MIN_DURATION_CONSTRAINT, oldMinDurationConstraint, minDurationConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxDurationConstraint() {
		return maxDurationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxDurationConstraint(Integer newMaxDurationConstraint) {
		Integer oldMaxDurationConstraint = maxDurationConstraint;
		maxDurationConstraint = newMaxDurationConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.VIDEO_GEN__MAX_DURATION_CONSTRAINT, oldMaxDurationConstraint, maxDurationConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getVariantes() {
		return variantes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariantes(Integer newVariantes) {
		Integer oldVariantes = variantes;
		variantes = newVariantes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.VIDEO_GEN__VARIANTES, oldVariantes, variantes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this, VideoGenPackage.VIDEO_GEN__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Video> getVideos() {
		if (videos == null) {
			videos = new EObjectContainmentEList<Video>(Video.class, this, VideoGenPackage.VIDEO_GEN__VIDEOS);
		}
		return videos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMinUserConstraint() {
		return minUserConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinUserConstraint(Integer newMinUserConstraint) {
		Integer oldMinUserConstraint = minUserConstraint;
		minUserConstraint = newMinUserConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.VIDEO_GEN__MIN_USER_CONSTRAINT, oldMinUserConstraint, minUserConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxUserConstraint() {
		return maxUserConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxUserConstraint(Integer newMaxUserConstraint) {
		Integer oldMaxUserConstraint = maxUserConstraint;
		maxUserConstraint = newMaxUserConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.VIDEO_GEN__MAX_USER_CONSTRAINT, oldMaxUserConstraint, maxUserConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void main() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map solve() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializeModel(EList<String> args) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void execute() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void compute() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VideoGenPackage.VIDEO_GEN__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case VideoGenPackage.VIDEO_GEN__VIDEOS:
				return ((InternalEList<?>)getVideos()).basicRemove(otherEnd, msgs);
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
			case VideoGenPackage.VIDEO_GEN__MIN_DURATION_CONSTRAINT:
				return getMinDurationConstraint();
			case VideoGenPackage.VIDEO_GEN__MAX_DURATION_CONSTRAINT:
				return getMaxDurationConstraint();
			case VideoGenPackage.VIDEO_GEN__VARIANTES:
				return getVariantes();
			case VideoGenPackage.VIDEO_GEN__TRANSITIONS:
				return getTransitions();
			case VideoGenPackage.VIDEO_GEN__VIDEOS:
				return getVideos();
			case VideoGenPackage.VIDEO_GEN__MIN_USER_CONSTRAINT:
				return getMinUserConstraint();
			case VideoGenPackage.VIDEO_GEN__MAX_USER_CONSTRAINT:
				return getMaxUserConstraint();
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
			case VideoGenPackage.VIDEO_GEN__MIN_DURATION_CONSTRAINT:
				setMinDurationConstraint((Integer)newValue);
				return;
			case VideoGenPackage.VIDEO_GEN__MAX_DURATION_CONSTRAINT:
				setMaxDurationConstraint((Integer)newValue);
				return;
			case VideoGenPackage.VIDEO_GEN__VARIANTES:
				setVariantes((Integer)newValue);
				return;
			case VideoGenPackage.VIDEO_GEN__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case VideoGenPackage.VIDEO_GEN__VIDEOS:
				getVideos().clear();
				getVideos().addAll((Collection<? extends Video>)newValue);
				return;
			case VideoGenPackage.VIDEO_GEN__MIN_USER_CONSTRAINT:
				setMinUserConstraint((Integer)newValue);
				return;
			case VideoGenPackage.VIDEO_GEN__MAX_USER_CONSTRAINT:
				setMaxUserConstraint((Integer)newValue);
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
			case VideoGenPackage.VIDEO_GEN__MIN_DURATION_CONSTRAINT:
				setMinDurationConstraint(MIN_DURATION_CONSTRAINT_EDEFAULT);
				return;
			case VideoGenPackage.VIDEO_GEN__MAX_DURATION_CONSTRAINT:
				setMaxDurationConstraint(MAX_DURATION_CONSTRAINT_EDEFAULT);
				return;
			case VideoGenPackage.VIDEO_GEN__VARIANTES:
				setVariantes(VARIANTES_EDEFAULT);
				return;
			case VideoGenPackage.VIDEO_GEN__TRANSITIONS:
				getTransitions().clear();
				return;
			case VideoGenPackage.VIDEO_GEN__VIDEOS:
				getVideos().clear();
				return;
			case VideoGenPackage.VIDEO_GEN__MIN_USER_CONSTRAINT:
				setMinUserConstraint(MIN_USER_CONSTRAINT_EDEFAULT);
				return;
			case VideoGenPackage.VIDEO_GEN__MAX_USER_CONSTRAINT:
				setMaxUserConstraint(MAX_USER_CONSTRAINT_EDEFAULT);
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
			case VideoGenPackage.VIDEO_GEN__MIN_DURATION_CONSTRAINT:
				return MIN_DURATION_CONSTRAINT_EDEFAULT == null ? minDurationConstraint != null : !MIN_DURATION_CONSTRAINT_EDEFAULT.equals(minDurationConstraint);
			case VideoGenPackage.VIDEO_GEN__MAX_DURATION_CONSTRAINT:
				return MAX_DURATION_CONSTRAINT_EDEFAULT == null ? maxDurationConstraint != null : !MAX_DURATION_CONSTRAINT_EDEFAULT.equals(maxDurationConstraint);
			case VideoGenPackage.VIDEO_GEN__VARIANTES:
				return VARIANTES_EDEFAULT == null ? variantes != null : !VARIANTES_EDEFAULT.equals(variantes);
			case VideoGenPackage.VIDEO_GEN__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case VideoGenPackage.VIDEO_GEN__VIDEOS:
				return videos != null && !videos.isEmpty();
			case VideoGenPackage.VIDEO_GEN__MIN_USER_CONSTRAINT:
				return MIN_USER_CONSTRAINT_EDEFAULT == null ? minUserConstraint != null : !MIN_USER_CONSTRAINT_EDEFAULT.equals(minUserConstraint);
			case VideoGenPackage.VIDEO_GEN__MAX_USER_CONSTRAINT:
				return MAX_USER_CONSTRAINT_EDEFAULT == null ? maxUserConstraint != null : !MAX_USER_CONSTRAINT_EDEFAULT.equals(maxUserConstraint);
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
		result.append(" (minDurationConstraint: ");
		result.append(minDurationConstraint);
		result.append(", maxDurationConstraint: ");
		result.append(maxDurationConstraint);
		result.append(", variantes: ");
		result.append(variantes);
		result.append(", minUserConstraint: ");
		result.append(minUserConstraint);
		result.append(", maxUserConstraint: ");
		result.append(maxUserConstraint);
		result.append(')');
		return result.toString();
	}

} //VideoGenImpl

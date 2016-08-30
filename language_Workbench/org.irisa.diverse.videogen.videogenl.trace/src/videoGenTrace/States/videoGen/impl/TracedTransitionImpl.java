/**
 */
package videoGenTrace.States.videoGen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import videoGenTrace.States.StatesPackage;
import videoGenTrace.States.Transition_callnextTransition_Value;
import videoGenTrace.States.Transition_executed_Value;
import videoGenTrace.States.Transition_videoGen_Value;

import videoGenTrace.States.videoGen.TracedTransition;
import videoGenTrace.States.videoGen.VideoGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link videoGenTrace.States.videoGen.impl.TracedTransitionImpl#getCallnextTransitionSequence <em>Callnext Transition Sequence</em>}</li>
 *   <li>{@link videoGenTrace.States.videoGen.impl.TracedTransitionImpl#getExecutedSequence <em>Executed Sequence</em>}</li>
 *   <li>{@link videoGenTrace.States.videoGen.impl.TracedTransitionImpl#getVideoGenSequence <em>Video Gen Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TracedTransitionImpl extends TracedNamedElementImpl implements TracedTransition {
	/**
	 * The cached value of the '{@link #getCallnextTransitionSequence() <em>Callnext Transition Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallnextTransitionSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition_callnextTransition_Value> callnextTransitionSequence;

	/**
	 * The cached value of the '{@link #getExecutedSequence() <em>Executed Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutedSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition_executed_Value> executedSequence;

	/**
	 * The cached value of the '{@link #getVideoGenSequence() <em>Video Gen Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoGenSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition_videoGen_Value> videoGenSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideoGenPackage.Literals.TRACED_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition_callnextTransition_Value> getCallnextTransitionSequence() {
		if (callnextTransitionSequence == null) {
			callnextTransitionSequence = new EObjectContainmentWithInverseEList<Transition_callnextTransition_Value>(Transition_callnextTransition_Value.class, this, VideoGenPackage.TRACED_TRANSITION__CALLNEXT_TRANSITION_SEQUENCE, StatesPackage.TRANSITION_CALLNEXT_TRANSITION_VALUE__PARENT);
		}
		return callnextTransitionSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition_executed_Value> getExecutedSequence() {
		if (executedSequence == null) {
			executedSequence = new EObjectContainmentWithInverseEList<Transition_executed_Value>(Transition_executed_Value.class, this, VideoGenPackage.TRACED_TRANSITION__EXECUTED_SEQUENCE, StatesPackage.TRANSITION_EXECUTED_VALUE__PARENT);
		}
		return executedSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition_videoGen_Value> getVideoGenSequence() {
		if (videoGenSequence == null) {
			videoGenSequence = new EObjectContainmentWithInverseEList<Transition_videoGen_Value>(Transition_videoGen_Value.class, this, VideoGenPackage.TRACED_TRANSITION__VIDEO_GEN_SEQUENCE, StatesPackage.TRANSITION_VIDEO_GEN_VALUE__PARENT);
		}
		return videoGenSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VideoGenPackage.TRACED_TRANSITION__CALLNEXT_TRANSITION_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCallnextTransitionSequence()).basicAdd(otherEnd, msgs);
			case VideoGenPackage.TRACED_TRANSITION__EXECUTED_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExecutedSequence()).basicAdd(otherEnd, msgs);
			case VideoGenPackage.TRACED_TRANSITION__VIDEO_GEN_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVideoGenSequence()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VideoGenPackage.TRACED_TRANSITION__CALLNEXT_TRANSITION_SEQUENCE:
				return ((InternalEList<?>)getCallnextTransitionSequence()).basicRemove(otherEnd, msgs);
			case VideoGenPackage.TRACED_TRANSITION__EXECUTED_SEQUENCE:
				return ((InternalEList<?>)getExecutedSequence()).basicRemove(otherEnd, msgs);
			case VideoGenPackage.TRACED_TRANSITION__VIDEO_GEN_SEQUENCE:
				return ((InternalEList<?>)getVideoGenSequence()).basicRemove(otherEnd, msgs);
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
			case VideoGenPackage.TRACED_TRANSITION__CALLNEXT_TRANSITION_SEQUENCE:
				return getCallnextTransitionSequence();
			case VideoGenPackage.TRACED_TRANSITION__EXECUTED_SEQUENCE:
				return getExecutedSequence();
			case VideoGenPackage.TRACED_TRANSITION__VIDEO_GEN_SEQUENCE:
				return getVideoGenSequence();
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
			case VideoGenPackage.TRACED_TRANSITION__CALLNEXT_TRANSITION_SEQUENCE:
				getCallnextTransitionSequence().clear();
				getCallnextTransitionSequence().addAll((Collection<? extends Transition_callnextTransition_Value>)newValue);
				return;
			case VideoGenPackage.TRACED_TRANSITION__EXECUTED_SEQUENCE:
				getExecutedSequence().clear();
				getExecutedSequence().addAll((Collection<? extends Transition_executed_Value>)newValue);
				return;
			case VideoGenPackage.TRACED_TRANSITION__VIDEO_GEN_SEQUENCE:
				getVideoGenSequence().clear();
				getVideoGenSequence().addAll((Collection<? extends Transition_videoGen_Value>)newValue);
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
			case VideoGenPackage.TRACED_TRANSITION__CALLNEXT_TRANSITION_SEQUENCE:
				getCallnextTransitionSequence().clear();
				return;
			case VideoGenPackage.TRACED_TRANSITION__EXECUTED_SEQUENCE:
				getExecutedSequence().clear();
				return;
			case VideoGenPackage.TRACED_TRANSITION__VIDEO_GEN_SEQUENCE:
				getVideoGenSequence().clear();
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
			case VideoGenPackage.TRACED_TRANSITION__CALLNEXT_TRANSITION_SEQUENCE:
				return callnextTransitionSequence != null && !callnextTransitionSequence.isEmpty();
			case VideoGenPackage.TRACED_TRANSITION__EXECUTED_SEQUENCE:
				return executedSequence != null && !executedSequence.isEmpty();
			case VideoGenPackage.TRACED_TRANSITION__VIDEO_GEN_SEQUENCE:
				return videoGenSequence != null && !videoGenSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedTransitionImpl

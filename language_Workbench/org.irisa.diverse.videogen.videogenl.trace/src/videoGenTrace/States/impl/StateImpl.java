/**
 */
package videoGenTrace.States.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import videoGenTrace.States.State;
import videoGenTrace.States.StatesPackage;
import videoGenTrace.States.Transition_callnextTransition_Value;
import videoGenTrace.States.Transition_executed_Value;
import videoGenTrace.States.Transition_videoGen_Value;
import videoGenTrace.States.VideoGen_initialized_Value;

import videoGenTrace.Steps.SpecificStep;
import videoGenTrace.Steps.StepsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link videoGenTrace.States.impl.StateImpl#getEndedSteps <em>Ended Steps</em>}</li>
 *   <li>{@link videoGenTrace.States.impl.StateImpl#getStartedSteps <em>Started Steps</em>}</li>
 *   <li>{@link videoGenTrace.States.impl.StateImpl#getTransition_callnextTransition_Values <em>Transition callnext Transition Values</em>}</li>
 *   <li>{@link videoGenTrace.States.impl.StateImpl#getTransition_executed_Values <em>Transition executed Values</em>}</li>
 *   <li>{@link videoGenTrace.States.impl.StateImpl#getTransition_videoGen_Values <em>Transition video Gen Values</em>}</li>
 *   <li>{@link videoGenTrace.States.impl.StateImpl#getVideoGen_initialized_Values <em>Video Gen initialized Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The cached value of the '{@link #getEndedSteps() <em>Ended Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndedSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecificStep> endedSteps;

	/**
	 * The cached value of the '{@link #getStartedSteps() <em>Started Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartedSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecificStep> startedSteps;

	/**
	 * The cached value of the '{@link #getTransition_callnextTransition_Values() <em>Transition callnext Transition Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition_callnextTransition_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition_callnextTransition_Value> transition_callnextTransition_Values;

	/**
	 * The cached value of the '{@link #getTransition_executed_Values() <em>Transition executed Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition_executed_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition_executed_Value> transition_executed_Values;

	/**
	 * The cached value of the '{@link #getTransition_videoGen_Values() <em>Transition video Gen Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition_videoGen_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition_videoGen_Value> transition_videoGen_Values;

	/**
	 * The cached value of the '{@link #getVideoGen_initialized_Values() <em>Video Gen initialized Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoGen_initialized_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<VideoGen_initialized_Value> videoGen_initialized_Values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificStep> getEndedSteps() {
		if (endedSteps == null) {
			endedSteps = new EObjectWithInverseResolvingEList<SpecificStep>(SpecificStep.class, this, StatesPackage.STATE__ENDED_STEPS, StepsPackage.SPECIFIC_STEP__ENDING_STATE);
		}
		return endedSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificStep> getStartedSteps() {
		if (startedSteps == null) {
			startedSteps = new EObjectWithInverseResolvingEList<SpecificStep>(SpecificStep.class, this, StatesPackage.STATE__STARTED_STEPS, StepsPackage.SPECIFIC_STEP__STARTING_STATE);
		}
		return startedSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition_callnextTransition_Value> getTransition_callnextTransition_Values() {
		if (transition_callnextTransition_Values == null) {
			transition_callnextTransition_Values = new EObjectWithInverseResolvingEList.ManyInverse<Transition_callnextTransition_Value>(Transition_callnextTransition_Value.class, this, StatesPackage.STATE__TRANSITION_CALLNEXT_TRANSITION_VALUES, StatesPackage.TRANSITION_CALLNEXT_TRANSITION_VALUE__STATES);
		}
		return transition_callnextTransition_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition_executed_Value> getTransition_executed_Values() {
		if (transition_executed_Values == null) {
			transition_executed_Values = new EObjectWithInverseResolvingEList.ManyInverse<Transition_executed_Value>(Transition_executed_Value.class, this, StatesPackage.STATE__TRANSITION_EXECUTED_VALUES, StatesPackage.TRANSITION_EXECUTED_VALUE__STATES);
		}
		return transition_executed_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition_videoGen_Value> getTransition_videoGen_Values() {
		if (transition_videoGen_Values == null) {
			transition_videoGen_Values = new EObjectWithInverseResolvingEList.ManyInverse<Transition_videoGen_Value>(Transition_videoGen_Value.class, this, StatesPackage.STATE__TRANSITION_VIDEO_GEN_VALUES, StatesPackage.TRANSITION_VIDEO_GEN_VALUE__STATES);
		}
		return transition_videoGen_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VideoGen_initialized_Value> getVideoGen_initialized_Values() {
		if (videoGen_initialized_Values == null) {
			videoGen_initialized_Values = new EObjectWithInverseResolvingEList.ManyInverse<VideoGen_initialized_Value>(VideoGen_initialized_Value.class, this, StatesPackage.STATE__VIDEO_GEN_INITIALIZED_VALUES, StatesPackage.VIDEO_GEN_INITIALIZED_VALUE__STATES);
		}
		return videoGen_initialized_Values;
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
			case StatesPackage.STATE__ENDED_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndedSteps()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__STARTED_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStartedSteps()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__TRANSITION_CALLNEXT_TRANSITION_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransition_callnextTransition_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__TRANSITION_EXECUTED_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransition_executed_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__TRANSITION_VIDEO_GEN_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransition_videoGen_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__VIDEO_GEN_INITIALIZED_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVideoGen_initialized_Values()).basicAdd(otherEnd, msgs);
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
			case StatesPackage.STATE__ENDED_STEPS:
				return ((InternalEList<?>)getEndedSteps()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__STARTED_STEPS:
				return ((InternalEList<?>)getStartedSteps()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__TRANSITION_CALLNEXT_TRANSITION_VALUES:
				return ((InternalEList<?>)getTransition_callnextTransition_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__TRANSITION_EXECUTED_VALUES:
				return ((InternalEList<?>)getTransition_executed_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__TRANSITION_VIDEO_GEN_VALUES:
				return ((InternalEList<?>)getTransition_videoGen_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__VIDEO_GEN_INITIALIZED_VALUES:
				return ((InternalEList<?>)getVideoGen_initialized_Values()).basicRemove(otherEnd, msgs);
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
			case StatesPackage.STATE__ENDED_STEPS:
				return getEndedSteps();
			case StatesPackage.STATE__STARTED_STEPS:
				return getStartedSteps();
			case StatesPackage.STATE__TRANSITION_CALLNEXT_TRANSITION_VALUES:
				return getTransition_callnextTransition_Values();
			case StatesPackage.STATE__TRANSITION_EXECUTED_VALUES:
				return getTransition_executed_Values();
			case StatesPackage.STATE__TRANSITION_VIDEO_GEN_VALUES:
				return getTransition_videoGen_Values();
			case StatesPackage.STATE__VIDEO_GEN_INITIALIZED_VALUES:
				return getVideoGen_initialized_Values();
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
			case StatesPackage.STATE__ENDED_STEPS:
				getEndedSteps().clear();
				getEndedSteps().addAll((Collection<? extends SpecificStep>)newValue);
				return;
			case StatesPackage.STATE__STARTED_STEPS:
				getStartedSteps().clear();
				getStartedSteps().addAll((Collection<? extends SpecificStep>)newValue);
				return;
			case StatesPackage.STATE__TRANSITION_CALLNEXT_TRANSITION_VALUES:
				getTransition_callnextTransition_Values().clear();
				getTransition_callnextTransition_Values().addAll((Collection<? extends Transition_callnextTransition_Value>)newValue);
				return;
			case StatesPackage.STATE__TRANSITION_EXECUTED_VALUES:
				getTransition_executed_Values().clear();
				getTransition_executed_Values().addAll((Collection<? extends Transition_executed_Value>)newValue);
				return;
			case StatesPackage.STATE__TRANSITION_VIDEO_GEN_VALUES:
				getTransition_videoGen_Values().clear();
				getTransition_videoGen_Values().addAll((Collection<? extends Transition_videoGen_Value>)newValue);
				return;
			case StatesPackage.STATE__VIDEO_GEN_INITIALIZED_VALUES:
				getVideoGen_initialized_Values().clear();
				getVideoGen_initialized_Values().addAll((Collection<? extends VideoGen_initialized_Value>)newValue);
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
			case StatesPackage.STATE__ENDED_STEPS:
				getEndedSteps().clear();
				return;
			case StatesPackage.STATE__STARTED_STEPS:
				getStartedSteps().clear();
				return;
			case StatesPackage.STATE__TRANSITION_CALLNEXT_TRANSITION_VALUES:
				getTransition_callnextTransition_Values().clear();
				return;
			case StatesPackage.STATE__TRANSITION_EXECUTED_VALUES:
				getTransition_executed_Values().clear();
				return;
			case StatesPackage.STATE__TRANSITION_VIDEO_GEN_VALUES:
				getTransition_videoGen_Values().clear();
				return;
			case StatesPackage.STATE__VIDEO_GEN_INITIALIZED_VALUES:
				getVideoGen_initialized_Values().clear();
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
			case StatesPackage.STATE__ENDED_STEPS:
				return endedSteps != null && !endedSteps.isEmpty();
			case StatesPackage.STATE__STARTED_STEPS:
				return startedSteps != null && !startedSteps.isEmpty();
			case StatesPackage.STATE__TRANSITION_CALLNEXT_TRANSITION_VALUES:
				return transition_callnextTransition_Values != null && !transition_callnextTransition_Values.isEmpty();
			case StatesPackage.STATE__TRANSITION_EXECUTED_VALUES:
				return transition_executed_Values != null && !transition_executed_Values.isEmpty();
			case StatesPackage.STATE__TRANSITION_VIDEO_GEN_VALUES:
				return transition_videoGen_Values != null && !transition_videoGen_Values.isEmpty();
			case StatesPackage.STATE__VIDEO_GEN_INITIALIZED_VALUES:
				return videoGen_initialized_Values != null && !videoGen_initialized_Values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateImpl

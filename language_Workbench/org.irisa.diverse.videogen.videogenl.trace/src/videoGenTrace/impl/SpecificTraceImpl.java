/**
 */
package videoGenTrace.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gemoc.executionframework.engine.mse.SequentialStep;

import org.gemoc.executionframework.engine.mse.impl.TraceImpl;

import videoGenTrace.SpecificTrace;

import videoGenTrace.States.State;

import videoGenTrace.Steps.SpecificStep;
import videoGenTrace.Steps.VideoGen_Alternatives_Execute;
import videoGenTrace.Steps.VideoGen_Delay_Execute;
import videoGenTrace.Steps.VideoGen_Generate_Compute;
import videoGenTrace.Steps.VideoGen_Generate_Execute;
import videoGenTrace.Steps.VideoGen_Initialize_Execute;
import videoGenTrace.Steps.VideoGen_Mandatory_Execute;
import videoGenTrace.Steps.VideoGen_Optional_Execute;
import videoGenTrace.Steps.VideoGen_Sequence_Execute;
import videoGenTrace.Steps.VideoGen_Transition_Execute;
import videoGenTrace.Steps.VideoGen_VideoGen_Compute;
import videoGenTrace.Steps.VideoGen_VideoGen_Execute;
import videoGenTrace.Steps.VideoGen_VideoGen_Setup;
import videoGenTrace.Steps.VideoGen_Video_Select;

import videoGenTrace.VideoGenTracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getVideoGen_Alternatives_Execute_Sequence <em>Video Gen Alternatives Execute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getVideoGen_Delay_Execute_Sequence <em>Video Gen Delay Execute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getVideoGen_Generate_Compute_Sequence <em>Video Gen Generate Compute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getVideoGen_Generate_Execute_Sequence <em>Video Gen Generate Execute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getVideoGen_Initialize_Execute_Sequence <em>Video Gen Initialize Execute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getVideoGen_Mandatory_Execute_Sequence <em>Video Gen Mandatory Execute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getVideoGen_Optional_Execute_Sequence <em>Video Gen Optional Execute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getVideoGen_Sequence_Execute_Sequence <em>Video Gen Sequence Execute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getVideoGen_Transition_Execute_Sequence <em>Video Gen Transition Execute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getVideoGen_VideoGen_Compute_Sequence <em>Video Gen Video Gen Compute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getVideoGen_VideoGen_Execute_Sequence <em>Video Gen Video Gen Execute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getVideoGen_VideoGen_Setup_Sequence <em>Video Gen Video Gen Setup Sequence</em>}</li>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getVideoGen_Video_Select_Sequence <em>Video Gen Video Select Sequence</em>}</li>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificTraceImpl extends TraceImpl<SequentialStep<SpecificStep>> implements SpecificTrace {
	/**
	 * The cached value of the '{@link #getVideoGen_Alternatives_Execute_Sequence() <em>Video Gen Alternatives Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoGen_Alternatives_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<VideoGen_Alternatives_Execute> videoGen_Alternatives_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getVideoGen_Delay_Execute_Sequence() <em>Video Gen Delay Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoGen_Delay_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<VideoGen_Delay_Execute> videoGen_Delay_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getVideoGen_Generate_Compute_Sequence() <em>Video Gen Generate Compute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoGen_Generate_Compute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<VideoGen_Generate_Compute> videoGen_Generate_Compute_Sequence;

	/**
	 * The cached value of the '{@link #getVideoGen_Generate_Execute_Sequence() <em>Video Gen Generate Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoGen_Generate_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<VideoGen_Generate_Execute> videoGen_Generate_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getVideoGen_Initialize_Execute_Sequence() <em>Video Gen Initialize Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoGen_Initialize_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<VideoGen_Initialize_Execute> videoGen_Initialize_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getVideoGen_Mandatory_Execute_Sequence() <em>Video Gen Mandatory Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoGen_Mandatory_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<VideoGen_Mandatory_Execute> videoGen_Mandatory_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getVideoGen_Optional_Execute_Sequence() <em>Video Gen Optional Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoGen_Optional_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<VideoGen_Optional_Execute> videoGen_Optional_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getVideoGen_Sequence_Execute_Sequence() <em>Video Gen Sequence Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoGen_Sequence_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<VideoGen_Sequence_Execute> videoGen_Sequence_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getVideoGen_Transition_Execute_Sequence() <em>Video Gen Transition Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoGen_Transition_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<VideoGen_Transition_Execute> videoGen_Transition_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getVideoGen_VideoGen_Compute_Sequence() <em>Video Gen Video Gen Compute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoGen_VideoGen_Compute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<VideoGen_VideoGen_Compute> videoGen_VideoGen_Compute_Sequence;

	/**
	 * The cached value of the '{@link #getVideoGen_VideoGen_Execute_Sequence() <em>Video Gen Video Gen Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoGen_VideoGen_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<VideoGen_VideoGen_Execute> videoGen_VideoGen_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getVideoGen_VideoGen_Setup_Sequence() <em>Video Gen Video Gen Setup Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoGen_VideoGen_Setup_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<VideoGen_VideoGen_Setup> videoGen_VideoGen_Setup_Sequence;

	/**
	 * The cached value of the '{@link #getVideoGen_Video_Select_Sequence() <em>Video Gen Video Select Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoGen_Video_Select_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<VideoGen_Video_Select> videoGen_Video_Select_Sequence;

	/**
	 * The cached value of the '{@link #getStatesTrace() <em>States Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatesTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<State> statesTrace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideoGenTracePackage.Literals.SPECIFIC_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetRootStep(SequentialStep<SpecificStep> newRootStep, NotificationChain msgs) {
		return super.basicSetRootStep(newRootStep, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VideoGen_Alternatives_Execute> getVideoGen_Alternatives_Execute_Sequence() {
		if (videoGen_Alternatives_Execute_Sequence == null) {
			videoGen_Alternatives_Execute_Sequence = new EObjectResolvingEList<VideoGen_Alternatives_Execute>(VideoGen_Alternatives_Execute.class, this, VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_ALTERNATIVES_EXECUTE_SEQUENCE);
		}
		return videoGen_Alternatives_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VideoGen_Delay_Execute> getVideoGen_Delay_Execute_Sequence() {
		if (videoGen_Delay_Execute_Sequence == null) {
			videoGen_Delay_Execute_Sequence = new EObjectResolvingEList<VideoGen_Delay_Execute>(VideoGen_Delay_Execute.class, this, VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_DELAY_EXECUTE_SEQUENCE);
		}
		return videoGen_Delay_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VideoGen_Generate_Compute> getVideoGen_Generate_Compute_Sequence() {
		if (videoGen_Generate_Compute_Sequence == null) {
			videoGen_Generate_Compute_Sequence = new EObjectResolvingEList<VideoGen_Generate_Compute>(VideoGen_Generate_Compute.class, this, VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_GENERATE_COMPUTE_SEQUENCE);
		}
		return videoGen_Generate_Compute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VideoGen_Generate_Execute> getVideoGen_Generate_Execute_Sequence() {
		if (videoGen_Generate_Execute_Sequence == null) {
			videoGen_Generate_Execute_Sequence = new EObjectResolvingEList<VideoGen_Generate_Execute>(VideoGen_Generate_Execute.class, this, VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_GENERATE_EXECUTE_SEQUENCE);
		}
		return videoGen_Generate_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VideoGen_Initialize_Execute> getVideoGen_Initialize_Execute_Sequence() {
		if (videoGen_Initialize_Execute_Sequence == null) {
			videoGen_Initialize_Execute_Sequence = new EObjectResolvingEList<VideoGen_Initialize_Execute>(VideoGen_Initialize_Execute.class, this, VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_INITIALIZE_EXECUTE_SEQUENCE);
		}
		return videoGen_Initialize_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VideoGen_Mandatory_Execute> getVideoGen_Mandatory_Execute_Sequence() {
		if (videoGen_Mandatory_Execute_Sequence == null) {
			videoGen_Mandatory_Execute_Sequence = new EObjectResolvingEList<VideoGen_Mandatory_Execute>(VideoGen_Mandatory_Execute.class, this, VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_MANDATORY_EXECUTE_SEQUENCE);
		}
		return videoGen_Mandatory_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VideoGen_Optional_Execute> getVideoGen_Optional_Execute_Sequence() {
		if (videoGen_Optional_Execute_Sequence == null) {
			videoGen_Optional_Execute_Sequence = new EObjectResolvingEList<VideoGen_Optional_Execute>(VideoGen_Optional_Execute.class, this, VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_OPTIONAL_EXECUTE_SEQUENCE);
		}
		return videoGen_Optional_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VideoGen_Sequence_Execute> getVideoGen_Sequence_Execute_Sequence() {
		if (videoGen_Sequence_Execute_Sequence == null) {
			videoGen_Sequence_Execute_Sequence = new EObjectResolvingEList<VideoGen_Sequence_Execute>(VideoGen_Sequence_Execute.class, this, VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_SEQUENCE_EXECUTE_SEQUENCE);
		}
		return videoGen_Sequence_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VideoGen_Transition_Execute> getVideoGen_Transition_Execute_Sequence() {
		if (videoGen_Transition_Execute_Sequence == null) {
			videoGen_Transition_Execute_Sequence = new EObjectResolvingEList<VideoGen_Transition_Execute>(VideoGen_Transition_Execute.class, this, VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRANSITION_EXECUTE_SEQUENCE);
		}
		return videoGen_Transition_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VideoGen_VideoGen_Compute> getVideoGen_VideoGen_Compute_Sequence() {
		if (videoGen_VideoGen_Compute_Sequence == null) {
			videoGen_VideoGen_Compute_Sequence = new EObjectResolvingEList<VideoGen_VideoGen_Compute>(VideoGen_VideoGen_Compute.class, this, VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_COMPUTE_SEQUENCE);
		}
		return videoGen_VideoGen_Compute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VideoGen_VideoGen_Execute> getVideoGen_VideoGen_Execute_Sequence() {
		if (videoGen_VideoGen_Execute_Sequence == null) {
			videoGen_VideoGen_Execute_Sequence = new EObjectResolvingEList<VideoGen_VideoGen_Execute>(VideoGen_VideoGen_Execute.class, this, VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_EXECUTE_SEQUENCE);
		}
		return videoGen_VideoGen_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VideoGen_VideoGen_Setup> getVideoGen_VideoGen_Setup_Sequence() {
		if (videoGen_VideoGen_Setup_Sequence == null) {
			videoGen_VideoGen_Setup_Sequence = new EObjectResolvingEList<VideoGen_VideoGen_Setup>(VideoGen_VideoGen_Setup.class, this, VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_SETUP_SEQUENCE);
		}
		return videoGen_VideoGen_Setup_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VideoGen_Video_Select> getVideoGen_Video_Select_Sequence() {
		if (videoGen_Video_Select_Sequence == null) {
			videoGen_Video_Select_Sequence = new EObjectResolvingEList<VideoGen_Video_Select>(VideoGen_Video_Select.class, this, VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_SELECT_SEQUENCE);
		}
		return videoGen_Video_Select_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesTrace() {
		if (statesTrace == null) {
			statesTrace = new EObjectContainmentEList<State>(State.class, this, VideoGenTracePackage.SPECIFIC_TRACE__STATES_TRACE);
		}
		return statesTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VideoGenTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return ((InternalEList<?>)getStatesTrace()).basicRemove(otherEnd, msgs);
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
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_ALTERNATIVES_EXECUTE_SEQUENCE:
				return getVideoGen_Alternatives_Execute_Sequence();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_DELAY_EXECUTE_SEQUENCE:
				return getVideoGen_Delay_Execute_Sequence();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_GENERATE_COMPUTE_SEQUENCE:
				return getVideoGen_Generate_Compute_Sequence();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_GENERATE_EXECUTE_SEQUENCE:
				return getVideoGen_Generate_Execute_Sequence();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_INITIALIZE_EXECUTE_SEQUENCE:
				return getVideoGen_Initialize_Execute_Sequence();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_MANDATORY_EXECUTE_SEQUENCE:
				return getVideoGen_Mandatory_Execute_Sequence();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_OPTIONAL_EXECUTE_SEQUENCE:
				return getVideoGen_Optional_Execute_Sequence();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_SEQUENCE_EXECUTE_SEQUENCE:
				return getVideoGen_Sequence_Execute_Sequence();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRANSITION_EXECUTE_SEQUENCE:
				return getVideoGen_Transition_Execute_Sequence();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_COMPUTE_SEQUENCE:
				return getVideoGen_VideoGen_Compute_Sequence();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_EXECUTE_SEQUENCE:
				return getVideoGen_VideoGen_Execute_Sequence();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_SETUP_SEQUENCE:
				return getVideoGen_VideoGen_Setup_Sequence();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_SELECT_SEQUENCE:
				return getVideoGen_Video_Select_Sequence();
			case VideoGenTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return getStatesTrace();
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
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_ALTERNATIVES_EXECUTE_SEQUENCE:
				getVideoGen_Alternatives_Execute_Sequence().clear();
				getVideoGen_Alternatives_Execute_Sequence().addAll((Collection<? extends VideoGen_Alternatives_Execute>)newValue);
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_DELAY_EXECUTE_SEQUENCE:
				getVideoGen_Delay_Execute_Sequence().clear();
				getVideoGen_Delay_Execute_Sequence().addAll((Collection<? extends VideoGen_Delay_Execute>)newValue);
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_GENERATE_COMPUTE_SEQUENCE:
				getVideoGen_Generate_Compute_Sequence().clear();
				getVideoGen_Generate_Compute_Sequence().addAll((Collection<? extends VideoGen_Generate_Compute>)newValue);
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_GENERATE_EXECUTE_SEQUENCE:
				getVideoGen_Generate_Execute_Sequence().clear();
				getVideoGen_Generate_Execute_Sequence().addAll((Collection<? extends VideoGen_Generate_Execute>)newValue);
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_INITIALIZE_EXECUTE_SEQUENCE:
				getVideoGen_Initialize_Execute_Sequence().clear();
				getVideoGen_Initialize_Execute_Sequence().addAll((Collection<? extends VideoGen_Initialize_Execute>)newValue);
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_MANDATORY_EXECUTE_SEQUENCE:
				getVideoGen_Mandatory_Execute_Sequence().clear();
				getVideoGen_Mandatory_Execute_Sequence().addAll((Collection<? extends VideoGen_Mandatory_Execute>)newValue);
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_OPTIONAL_EXECUTE_SEQUENCE:
				getVideoGen_Optional_Execute_Sequence().clear();
				getVideoGen_Optional_Execute_Sequence().addAll((Collection<? extends VideoGen_Optional_Execute>)newValue);
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_SEQUENCE_EXECUTE_SEQUENCE:
				getVideoGen_Sequence_Execute_Sequence().clear();
				getVideoGen_Sequence_Execute_Sequence().addAll((Collection<? extends VideoGen_Sequence_Execute>)newValue);
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRANSITION_EXECUTE_SEQUENCE:
				getVideoGen_Transition_Execute_Sequence().clear();
				getVideoGen_Transition_Execute_Sequence().addAll((Collection<? extends VideoGen_Transition_Execute>)newValue);
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_COMPUTE_SEQUENCE:
				getVideoGen_VideoGen_Compute_Sequence().clear();
				getVideoGen_VideoGen_Compute_Sequence().addAll((Collection<? extends VideoGen_VideoGen_Compute>)newValue);
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_EXECUTE_SEQUENCE:
				getVideoGen_VideoGen_Execute_Sequence().clear();
				getVideoGen_VideoGen_Execute_Sequence().addAll((Collection<? extends VideoGen_VideoGen_Execute>)newValue);
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_SETUP_SEQUENCE:
				getVideoGen_VideoGen_Setup_Sequence().clear();
				getVideoGen_VideoGen_Setup_Sequence().addAll((Collection<? extends VideoGen_VideoGen_Setup>)newValue);
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_SELECT_SEQUENCE:
				getVideoGen_Video_Select_Sequence().clear();
				getVideoGen_Video_Select_Sequence().addAll((Collection<? extends VideoGen_Video_Select>)newValue);
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				getStatesTrace().clear();
				getStatesTrace().addAll((Collection<? extends State>)newValue);
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
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_ALTERNATIVES_EXECUTE_SEQUENCE:
				getVideoGen_Alternatives_Execute_Sequence().clear();
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_DELAY_EXECUTE_SEQUENCE:
				getVideoGen_Delay_Execute_Sequence().clear();
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_GENERATE_COMPUTE_SEQUENCE:
				getVideoGen_Generate_Compute_Sequence().clear();
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_GENERATE_EXECUTE_SEQUENCE:
				getVideoGen_Generate_Execute_Sequence().clear();
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_INITIALIZE_EXECUTE_SEQUENCE:
				getVideoGen_Initialize_Execute_Sequence().clear();
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_MANDATORY_EXECUTE_SEQUENCE:
				getVideoGen_Mandatory_Execute_Sequence().clear();
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_OPTIONAL_EXECUTE_SEQUENCE:
				getVideoGen_Optional_Execute_Sequence().clear();
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_SEQUENCE_EXECUTE_SEQUENCE:
				getVideoGen_Sequence_Execute_Sequence().clear();
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRANSITION_EXECUTE_SEQUENCE:
				getVideoGen_Transition_Execute_Sequence().clear();
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_COMPUTE_SEQUENCE:
				getVideoGen_VideoGen_Compute_Sequence().clear();
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_EXECUTE_SEQUENCE:
				getVideoGen_VideoGen_Execute_Sequence().clear();
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_SETUP_SEQUENCE:
				getVideoGen_VideoGen_Setup_Sequence().clear();
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_SELECT_SEQUENCE:
				getVideoGen_Video_Select_Sequence().clear();
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				getStatesTrace().clear();
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
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_ALTERNATIVES_EXECUTE_SEQUENCE:
				return videoGen_Alternatives_Execute_Sequence != null && !videoGen_Alternatives_Execute_Sequence.isEmpty();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_DELAY_EXECUTE_SEQUENCE:
				return videoGen_Delay_Execute_Sequence != null && !videoGen_Delay_Execute_Sequence.isEmpty();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_GENERATE_COMPUTE_SEQUENCE:
				return videoGen_Generate_Compute_Sequence != null && !videoGen_Generate_Compute_Sequence.isEmpty();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_GENERATE_EXECUTE_SEQUENCE:
				return videoGen_Generate_Execute_Sequence != null && !videoGen_Generate_Execute_Sequence.isEmpty();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_INITIALIZE_EXECUTE_SEQUENCE:
				return videoGen_Initialize_Execute_Sequence != null && !videoGen_Initialize_Execute_Sequence.isEmpty();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_MANDATORY_EXECUTE_SEQUENCE:
				return videoGen_Mandatory_Execute_Sequence != null && !videoGen_Mandatory_Execute_Sequence.isEmpty();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_OPTIONAL_EXECUTE_SEQUENCE:
				return videoGen_Optional_Execute_Sequence != null && !videoGen_Optional_Execute_Sequence.isEmpty();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_SEQUENCE_EXECUTE_SEQUENCE:
				return videoGen_Sequence_Execute_Sequence != null && !videoGen_Sequence_Execute_Sequence.isEmpty();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRANSITION_EXECUTE_SEQUENCE:
				return videoGen_Transition_Execute_Sequence != null && !videoGen_Transition_Execute_Sequence.isEmpty();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_COMPUTE_SEQUENCE:
				return videoGen_VideoGen_Compute_Sequence != null && !videoGen_VideoGen_Compute_Sequence.isEmpty();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_EXECUTE_SEQUENCE:
				return videoGen_VideoGen_Execute_Sequence != null && !videoGen_VideoGen_Execute_Sequence.isEmpty();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_SETUP_SEQUENCE:
				return videoGen_VideoGen_Setup_Sequence != null && !videoGen_VideoGen_Setup_Sequence.isEmpty();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_SELECT_SEQUENCE:
				return videoGen_Video_Select_Sequence != null && !videoGen_Video_Select_Sequence.isEmpty();
			case VideoGenTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return statesTrace != null && !statesTrace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecificTraceImpl

/**
 */
package videoGenTrace.impl;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import fr.inria.diverse.trace.commons.model.trace.impl.TraceImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import videoGenTrace.SpecificTrace;

import videoGenTrace.States.State;

import videoGenTrace.States.videoGen.TracedAlternatives;
import videoGenTrace.States.videoGen.TracedDelay;
import videoGenTrace.States.videoGen.TracedGenerate;
import videoGenTrace.States.videoGen.TracedInitialize;
import videoGenTrace.States.videoGen.TracedMandatory;
import videoGenTrace.States.videoGen.TracedOptional;
import videoGenTrace.States.videoGen.TracedVideo;
import videoGenTrace.States.videoGen.TracedVideoGen;

import videoGenTrace.Steps.SpecificStep;
import videoGenTrace.Steps.VideoGen_Alternatives_Execute;
import videoGenTrace.Steps.VideoGen_Generate_Execute;
import videoGenTrace.Steps.VideoGen_Initialize_Execute;
import videoGenTrace.Steps.VideoGen_Mandatory_Execute;
import videoGenTrace.Steps.VideoGen_Optional_Execute;
import videoGenTrace.Steps.VideoGen_Transition_Execute;
import videoGenTrace.Steps.VideoGen_Transition_FinishExecute;
import videoGenTrace.Steps.VideoGen_VideoGen_Compute;
import videoGenTrace.Steps.VideoGen_VideoGen_Execute;
import videoGenTrace.Steps.VideoGen_VideoGen_InitializeModel;
import videoGenTrace.Steps.VideoGen_VideoGen_Setup;
import videoGenTrace.Steps.VideoGen_VideoGen_Solve;
import videoGenTrace.Steps.VideoGen_Video_Setup;

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
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getVideoGen_Generate_Execute_Sequence <em>Video Gen Generate Execute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getVideoGen_Initialize_Execute_Sequence <em>Video Gen Initialize Execute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getVideoGen_Mandatory_Execute_Sequence <em>Video Gen Mandatory Execute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getVideoGen_Optional_Execute_Sequence <em>Video Gen Optional Execute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getVideoGen_Transition_Execute_Sequence <em>Video Gen Transition Execute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getVideoGen_Transition_FinishExecute_Sequence <em>Video Gen Transition Finish Execute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getVideoGen_VideoGen_Compute_Sequence <em>Video Gen Video Gen Compute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getVideoGen_VideoGen_Execute_Sequence <em>Video Gen Video Gen Execute Sequence</em>}</li>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getVideoGen_VideoGen_InitializeModel_Sequence <em>Video Gen Video Gen Initialize Model Sequence</em>}</li>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getVideoGen_VideoGen_Setup_Sequence <em>Video Gen Video Gen Setup Sequence</em>}</li>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getVideoGen_VideoGen_Solve_Sequence <em>Video Gen Video Gen Solve Sequence</em>}</li>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getVideoGen_Video_Setup_Sequence <em>Video Gen Video Setup Sequence</em>}</li>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getStatesTrace <em>States Trace</em>}</li>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getVideoGen_tracedAlternativess <em>Video Gen traced Alternativess</em>}</li>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getVideoGen_tracedDelays <em>Video Gen traced Delays</em>}</li>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getVideoGen_tracedGenerates <em>Video Gen traced Generates</em>}</li>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getVideoGen_tracedInitializes <em>Video Gen traced Initializes</em>}</li>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getVideoGen_tracedMandatorys <em>Video Gen traced Mandatorys</em>}</li>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getVideoGen_tracedOptionals <em>Video Gen traced Optionals</em>}</li>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getVideoGen_tracedVideoGens <em>Video Gen traced Video Gens</em>}</li>
 *   <li>{@link videoGenTrace.impl.SpecificTraceImpl#getVideoGen_tracedVideos <em>Video Gen traced Videos</em>}</li>
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
	 * The cached value of the '{@link #getVideoGen_Transition_Execute_Sequence() <em>Video Gen Transition Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoGen_Transition_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<VideoGen_Transition_Execute> videoGen_Transition_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getVideoGen_Transition_FinishExecute_Sequence() <em>Video Gen Transition Finish Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoGen_Transition_FinishExecute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<VideoGen_Transition_FinishExecute> videoGen_Transition_FinishExecute_Sequence;

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
	 * The cached value of the '{@link #getVideoGen_VideoGen_InitializeModel_Sequence() <em>Video Gen Video Gen Initialize Model Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoGen_VideoGen_InitializeModel_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<VideoGen_VideoGen_InitializeModel> videoGen_VideoGen_InitializeModel_Sequence;

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
	 * The cached value of the '{@link #getVideoGen_VideoGen_Solve_Sequence() <em>Video Gen Video Gen Solve Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoGen_VideoGen_Solve_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<VideoGen_VideoGen_Solve> videoGen_VideoGen_Solve_Sequence;

	/**
	 * The cached value of the '{@link #getVideoGen_Video_Setup_Sequence() <em>Video Gen Video Setup Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoGen_Video_Setup_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<VideoGen_Video_Setup> videoGen_Video_Setup_Sequence;

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
	 * The cached value of the '{@link #getVideoGen_tracedAlternativess() <em>Video Gen traced Alternativess</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoGen_tracedAlternativess()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedAlternatives> videoGen_tracedAlternativess;

	/**
	 * The cached value of the '{@link #getVideoGen_tracedDelays() <em>Video Gen traced Delays</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoGen_tracedDelays()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedDelay> videoGen_tracedDelays;

	/**
	 * The cached value of the '{@link #getVideoGen_tracedGenerates() <em>Video Gen traced Generates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoGen_tracedGenerates()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedGenerate> videoGen_tracedGenerates;

	/**
	 * The cached value of the '{@link #getVideoGen_tracedInitializes() <em>Video Gen traced Initializes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoGen_tracedInitializes()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedInitialize> videoGen_tracedInitializes;

	/**
	 * The cached value of the '{@link #getVideoGen_tracedMandatorys() <em>Video Gen traced Mandatorys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoGen_tracedMandatorys()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedMandatory> videoGen_tracedMandatorys;

	/**
	 * The cached value of the '{@link #getVideoGen_tracedOptionals() <em>Video Gen traced Optionals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoGen_tracedOptionals()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedOptional> videoGen_tracedOptionals;

	/**
	 * The cached value of the '{@link #getVideoGen_tracedVideoGens() <em>Video Gen traced Video Gens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoGen_tracedVideoGens()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedVideoGen> videoGen_tracedVideoGens;

	/**
	 * The cached value of the '{@link #getVideoGen_tracedVideos() <em>Video Gen traced Videos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoGen_tracedVideos()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedVideo> videoGen_tracedVideos;

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
	public EList<VideoGen_Transition_FinishExecute> getVideoGen_Transition_FinishExecute_Sequence() {
		if (videoGen_Transition_FinishExecute_Sequence == null) {
			videoGen_Transition_FinishExecute_Sequence = new EObjectResolvingEList<VideoGen_Transition_FinishExecute>(VideoGen_Transition_FinishExecute.class, this, VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRANSITION_FINISH_EXECUTE_SEQUENCE);
		}
		return videoGen_Transition_FinishExecute_Sequence;
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
	public EList<VideoGen_VideoGen_InitializeModel> getVideoGen_VideoGen_InitializeModel_Sequence() {
		if (videoGen_VideoGen_InitializeModel_Sequence == null) {
			videoGen_VideoGen_InitializeModel_Sequence = new EObjectResolvingEList<VideoGen_VideoGen_InitializeModel>(VideoGen_VideoGen_InitializeModel.class, this, VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_INITIALIZE_MODEL_SEQUENCE);
		}
		return videoGen_VideoGen_InitializeModel_Sequence;
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
	public EList<VideoGen_VideoGen_Solve> getVideoGen_VideoGen_Solve_Sequence() {
		if (videoGen_VideoGen_Solve_Sequence == null) {
			videoGen_VideoGen_Solve_Sequence = new EObjectResolvingEList<VideoGen_VideoGen_Solve>(VideoGen_VideoGen_Solve.class, this, VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_SOLVE_SEQUENCE);
		}
		return videoGen_VideoGen_Solve_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VideoGen_Video_Setup> getVideoGen_Video_Setup_Sequence() {
		if (videoGen_Video_Setup_Sequence == null) {
			videoGen_Video_Setup_Sequence = new EObjectResolvingEList<VideoGen_Video_Setup>(VideoGen_Video_Setup.class, this, VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_SETUP_SEQUENCE);
		}
		return videoGen_Video_Setup_Sequence;
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
	public EList<TracedAlternatives> getVideoGen_tracedAlternativess() {
		if (videoGen_tracedAlternativess == null) {
			videoGen_tracedAlternativess = new EObjectContainmentEList<TracedAlternatives>(TracedAlternatives.class, this, VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_ALTERNATIVESS);
		}
		return videoGen_tracedAlternativess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedDelay> getVideoGen_tracedDelays() {
		if (videoGen_tracedDelays == null) {
			videoGen_tracedDelays = new EObjectContainmentEList<TracedDelay>(TracedDelay.class, this, VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_DELAYS);
		}
		return videoGen_tracedDelays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedGenerate> getVideoGen_tracedGenerates() {
		if (videoGen_tracedGenerates == null) {
			videoGen_tracedGenerates = new EObjectContainmentEList<TracedGenerate>(TracedGenerate.class, this, VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_GENERATES);
		}
		return videoGen_tracedGenerates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedInitialize> getVideoGen_tracedInitializes() {
		if (videoGen_tracedInitializes == null) {
			videoGen_tracedInitializes = new EObjectContainmentEList<TracedInitialize>(TracedInitialize.class, this, VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_INITIALIZES);
		}
		return videoGen_tracedInitializes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedMandatory> getVideoGen_tracedMandatorys() {
		if (videoGen_tracedMandatorys == null) {
			videoGen_tracedMandatorys = new EObjectContainmentEList<TracedMandatory>(TracedMandatory.class, this, VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_MANDATORYS);
		}
		return videoGen_tracedMandatorys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedOptional> getVideoGen_tracedOptionals() {
		if (videoGen_tracedOptionals == null) {
			videoGen_tracedOptionals = new EObjectContainmentEList<TracedOptional>(TracedOptional.class, this, VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_OPTIONALS);
		}
		return videoGen_tracedOptionals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedVideoGen> getVideoGen_tracedVideoGens() {
		if (videoGen_tracedVideoGens == null) {
			videoGen_tracedVideoGens = new EObjectContainmentEList<TracedVideoGen>(TracedVideoGen.class, this, VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_VIDEO_GENS);
		}
		return videoGen_tracedVideoGens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedVideo> getVideoGen_tracedVideos() {
		if (videoGen_tracedVideos == null) {
			videoGen_tracedVideos = new EObjectContainmentEList<TracedVideo>(TracedVideo.class, this, VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_VIDEOS);
		}
		return videoGen_tracedVideos;
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
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_ALTERNATIVESS:
				return ((InternalEList<?>)getVideoGen_tracedAlternativess()).basicRemove(otherEnd, msgs);
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_DELAYS:
				return ((InternalEList<?>)getVideoGen_tracedDelays()).basicRemove(otherEnd, msgs);
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_GENERATES:
				return ((InternalEList<?>)getVideoGen_tracedGenerates()).basicRemove(otherEnd, msgs);
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_INITIALIZES:
				return ((InternalEList<?>)getVideoGen_tracedInitializes()).basicRemove(otherEnd, msgs);
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_MANDATORYS:
				return ((InternalEList<?>)getVideoGen_tracedMandatorys()).basicRemove(otherEnd, msgs);
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_OPTIONALS:
				return ((InternalEList<?>)getVideoGen_tracedOptionals()).basicRemove(otherEnd, msgs);
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_VIDEO_GENS:
				return ((InternalEList<?>)getVideoGen_tracedVideoGens()).basicRemove(otherEnd, msgs);
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_VIDEOS:
				return ((InternalEList<?>)getVideoGen_tracedVideos()).basicRemove(otherEnd, msgs);
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
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_GENERATE_EXECUTE_SEQUENCE:
				return getVideoGen_Generate_Execute_Sequence();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_INITIALIZE_EXECUTE_SEQUENCE:
				return getVideoGen_Initialize_Execute_Sequence();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_MANDATORY_EXECUTE_SEQUENCE:
				return getVideoGen_Mandatory_Execute_Sequence();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_OPTIONAL_EXECUTE_SEQUENCE:
				return getVideoGen_Optional_Execute_Sequence();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRANSITION_EXECUTE_SEQUENCE:
				return getVideoGen_Transition_Execute_Sequence();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRANSITION_FINISH_EXECUTE_SEQUENCE:
				return getVideoGen_Transition_FinishExecute_Sequence();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_COMPUTE_SEQUENCE:
				return getVideoGen_VideoGen_Compute_Sequence();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_EXECUTE_SEQUENCE:
				return getVideoGen_VideoGen_Execute_Sequence();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_INITIALIZE_MODEL_SEQUENCE:
				return getVideoGen_VideoGen_InitializeModel_Sequence();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_SETUP_SEQUENCE:
				return getVideoGen_VideoGen_Setup_Sequence();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_SOLVE_SEQUENCE:
				return getVideoGen_VideoGen_Solve_Sequence();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_SETUP_SEQUENCE:
				return getVideoGen_Video_Setup_Sequence();
			case VideoGenTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return getStatesTrace();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_ALTERNATIVESS:
				return getVideoGen_tracedAlternativess();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_DELAYS:
				return getVideoGen_tracedDelays();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_GENERATES:
				return getVideoGen_tracedGenerates();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_INITIALIZES:
				return getVideoGen_tracedInitializes();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_MANDATORYS:
				return getVideoGen_tracedMandatorys();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_OPTIONALS:
				return getVideoGen_tracedOptionals();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_VIDEO_GENS:
				return getVideoGen_tracedVideoGens();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_VIDEOS:
				return getVideoGen_tracedVideos();
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
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRANSITION_EXECUTE_SEQUENCE:
				getVideoGen_Transition_Execute_Sequence().clear();
				getVideoGen_Transition_Execute_Sequence().addAll((Collection<? extends VideoGen_Transition_Execute>)newValue);
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRANSITION_FINISH_EXECUTE_SEQUENCE:
				getVideoGen_Transition_FinishExecute_Sequence().clear();
				getVideoGen_Transition_FinishExecute_Sequence().addAll((Collection<? extends VideoGen_Transition_FinishExecute>)newValue);
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_COMPUTE_SEQUENCE:
				getVideoGen_VideoGen_Compute_Sequence().clear();
				getVideoGen_VideoGen_Compute_Sequence().addAll((Collection<? extends VideoGen_VideoGen_Compute>)newValue);
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_EXECUTE_SEQUENCE:
				getVideoGen_VideoGen_Execute_Sequence().clear();
				getVideoGen_VideoGen_Execute_Sequence().addAll((Collection<? extends VideoGen_VideoGen_Execute>)newValue);
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_INITIALIZE_MODEL_SEQUENCE:
				getVideoGen_VideoGen_InitializeModel_Sequence().clear();
				getVideoGen_VideoGen_InitializeModel_Sequence().addAll((Collection<? extends VideoGen_VideoGen_InitializeModel>)newValue);
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_SETUP_SEQUENCE:
				getVideoGen_VideoGen_Setup_Sequence().clear();
				getVideoGen_VideoGen_Setup_Sequence().addAll((Collection<? extends VideoGen_VideoGen_Setup>)newValue);
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_SOLVE_SEQUENCE:
				getVideoGen_VideoGen_Solve_Sequence().clear();
				getVideoGen_VideoGen_Solve_Sequence().addAll((Collection<? extends VideoGen_VideoGen_Solve>)newValue);
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_SETUP_SEQUENCE:
				getVideoGen_Video_Setup_Sequence().clear();
				getVideoGen_Video_Setup_Sequence().addAll((Collection<? extends VideoGen_Video_Setup>)newValue);
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				getStatesTrace().clear();
				getStatesTrace().addAll((Collection<? extends State>)newValue);
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_ALTERNATIVESS:
				getVideoGen_tracedAlternativess().clear();
				getVideoGen_tracedAlternativess().addAll((Collection<? extends TracedAlternatives>)newValue);
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_DELAYS:
				getVideoGen_tracedDelays().clear();
				getVideoGen_tracedDelays().addAll((Collection<? extends TracedDelay>)newValue);
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_GENERATES:
				getVideoGen_tracedGenerates().clear();
				getVideoGen_tracedGenerates().addAll((Collection<? extends TracedGenerate>)newValue);
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_INITIALIZES:
				getVideoGen_tracedInitializes().clear();
				getVideoGen_tracedInitializes().addAll((Collection<? extends TracedInitialize>)newValue);
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_MANDATORYS:
				getVideoGen_tracedMandatorys().clear();
				getVideoGen_tracedMandatorys().addAll((Collection<? extends TracedMandatory>)newValue);
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_OPTIONALS:
				getVideoGen_tracedOptionals().clear();
				getVideoGen_tracedOptionals().addAll((Collection<? extends TracedOptional>)newValue);
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_VIDEO_GENS:
				getVideoGen_tracedVideoGens().clear();
				getVideoGen_tracedVideoGens().addAll((Collection<? extends TracedVideoGen>)newValue);
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_VIDEOS:
				getVideoGen_tracedVideos().clear();
				getVideoGen_tracedVideos().addAll((Collection<? extends TracedVideo>)newValue);
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
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRANSITION_EXECUTE_SEQUENCE:
				getVideoGen_Transition_Execute_Sequence().clear();
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRANSITION_FINISH_EXECUTE_SEQUENCE:
				getVideoGen_Transition_FinishExecute_Sequence().clear();
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_COMPUTE_SEQUENCE:
				getVideoGen_VideoGen_Compute_Sequence().clear();
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_EXECUTE_SEQUENCE:
				getVideoGen_VideoGen_Execute_Sequence().clear();
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_INITIALIZE_MODEL_SEQUENCE:
				getVideoGen_VideoGen_InitializeModel_Sequence().clear();
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_SETUP_SEQUENCE:
				getVideoGen_VideoGen_Setup_Sequence().clear();
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_SOLVE_SEQUENCE:
				getVideoGen_VideoGen_Solve_Sequence().clear();
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_SETUP_SEQUENCE:
				getVideoGen_Video_Setup_Sequence().clear();
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				getStatesTrace().clear();
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_ALTERNATIVESS:
				getVideoGen_tracedAlternativess().clear();
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_DELAYS:
				getVideoGen_tracedDelays().clear();
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_GENERATES:
				getVideoGen_tracedGenerates().clear();
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_INITIALIZES:
				getVideoGen_tracedInitializes().clear();
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_MANDATORYS:
				getVideoGen_tracedMandatorys().clear();
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_OPTIONALS:
				getVideoGen_tracedOptionals().clear();
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_VIDEO_GENS:
				getVideoGen_tracedVideoGens().clear();
				return;
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_VIDEOS:
				getVideoGen_tracedVideos().clear();
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
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_GENERATE_EXECUTE_SEQUENCE:
				return videoGen_Generate_Execute_Sequence != null && !videoGen_Generate_Execute_Sequence.isEmpty();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_INITIALIZE_EXECUTE_SEQUENCE:
				return videoGen_Initialize_Execute_Sequence != null && !videoGen_Initialize_Execute_Sequence.isEmpty();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_MANDATORY_EXECUTE_SEQUENCE:
				return videoGen_Mandatory_Execute_Sequence != null && !videoGen_Mandatory_Execute_Sequence.isEmpty();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_OPTIONAL_EXECUTE_SEQUENCE:
				return videoGen_Optional_Execute_Sequence != null && !videoGen_Optional_Execute_Sequence.isEmpty();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRANSITION_EXECUTE_SEQUENCE:
				return videoGen_Transition_Execute_Sequence != null && !videoGen_Transition_Execute_Sequence.isEmpty();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRANSITION_FINISH_EXECUTE_SEQUENCE:
				return videoGen_Transition_FinishExecute_Sequence != null && !videoGen_Transition_FinishExecute_Sequence.isEmpty();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_COMPUTE_SEQUENCE:
				return videoGen_VideoGen_Compute_Sequence != null && !videoGen_VideoGen_Compute_Sequence.isEmpty();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_EXECUTE_SEQUENCE:
				return videoGen_VideoGen_Execute_Sequence != null && !videoGen_VideoGen_Execute_Sequence.isEmpty();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_INITIALIZE_MODEL_SEQUENCE:
				return videoGen_VideoGen_InitializeModel_Sequence != null && !videoGen_VideoGen_InitializeModel_Sequence.isEmpty();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_SETUP_SEQUENCE:
				return videoGen_VideoGen_Setup_Sequence != null && !videoGen_VideoGen_Setup_Sequence.isEmpty();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_GEN_SOLVE_SEQUENCE:
				return videoGen_VideoGen_Solve_Sequence != null && !videoGen_VideoGen_Solve_Sequence.isEmpty();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_VIDEO_SETUP_SEQUENCE:
				return videoGen_Video_Setup_Sequence != null && !videoGen_Video_Setup_Sequence.isEmpty();
			case VideoGenTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return statesTrace != null && !statesTrace.isEmpty();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_ALTERNATIVESS:
				return videoGen_tracedAlternativess != null && !videoGen_tracedAlternativess.isEmpty();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_DELAYS:
				return videoGen_tracedDelays != null && !videoGen_tracedDelays.isEmpty();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_GENERATES:
				return videoGen_tracedGenerates != null && !videoGen_tracedGenerates.isEmpty();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_INITIALIZES:
				return videoGen_tracedInitializes != null && !videoGen_tracedInitializes.isEmpty();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_MANDATORYS:
				return videoGen_tracedMandatorys != null && !videoGen_tracedMandatorys.isEmpty();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_OPTIONALS:
				return videoGen_tracedOptionals != null && !videoGen_tracedOptionals.isEmpty();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_VIDEO_GENS:
				return videoGen_tracedVideoGens != null && !videoGen_tracedVideoGens.isEmpty();
			case VideoGenTracePackage.SPECIFIC_TRACE__VIDEO_GEN_TRACED_VIDEOS:
				return videoGen_tracedVideos != null && !videoGen_tracedVideos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecificTraceImpl

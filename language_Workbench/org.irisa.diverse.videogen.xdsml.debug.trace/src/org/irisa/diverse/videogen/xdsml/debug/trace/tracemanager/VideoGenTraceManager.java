package org.irisa.diverse.videogen.xdsml.debug.trace.tracemanager;

import fr.inria.diverse.trace.api.IValueTrace;
import fr.inria.diverse.trace.api.impl.GenericValueTrace;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.common.util.TreeIterator;

public class VideoGenTraceManager implements fr.inria.diverse.trace.gemoc.api.IGemocTraceManager {

	private videoGenTrace.Trace traceRoot;
	private org.gemoc.executionframework.engine.mse.MSEModel mseModel;
	private Resource executedModel;

	private Map<EObject, EObject> exeToTraced;

	private videoGenTrace.States.State lastState;
	private List<IValueTrace> traces;

	private Resource traceResource;
	private Deque<videoGenTrace.Steps.Step> context = new LinkedList<videoGenTrace.Steps.Step>();

	public VideoGenTraceManager(Resource exeModel, Resource traceResource) {
		this.traceResource = traceResource;
		this.executedModel = exeModel;
		this.traces = new ArrayList<IValueTrace>();
	}

	private void addInitialState() {
		if (lastState == null) {
			// Creation of the initial state
			Set<Resource> allResources = getAllExecutedModelResources();
			lastState = videoGenTrace.States.StatesFactory.eINSTANCE.createState();
			for (Resource r : allResources) {
				for (TreeIterator<EObject> i = r.getAllContents(); i.hasNext();) {
					EObject o = i.next();
				}
			}
			this.traceRoot.getStatesTrace().add(lastState);
		}
	}

	private videoGenTrace.States.State copyState(videoGenTrace.States.State oldState) {
		videoGenTrace.States.State newState = videoGenTrace.States.StatesFactory.eINSTANCE.createState();
		return newState;
	}

	@Override
	public void addState(Set<org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange> changes) {

		if (lastState == null) {
			addInitialState();
		}

		if (!changes.isEmpty()) {

			boolean stateChanged = false;

			// We start by a (shallow) copy of the last state
			// But we will have to rollback a little by replacing values that changed
			videoGenTrace.States.State newState = copyState(lastState);

			for (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange modelChange : changes) {
				EObject o = modelChange.getChangedObject();

			}
			if (stateChanged) {
				final videoGenTrace.Steps.Step currentStep = context.peekFirst();
				if (currentStep != null && currentStep instanceof videoGenTrace.Steps.BigStep) {
					final videoGenTrace.States.State startingState = lastState;
					final videoGenTrace.States.State endingState = newState;
					addImplicitStep(currentStep, startingState, endingState);
				}

				lastState = newState;
				traceRoot.getStatesTrace().add(lastState);
			}
		}
	}

	@Override
	public void addStep(String stepRule, Map<String, Object> params) {
		addStep(stepRule, params, this.getTraceSize() - 1);
	}

	private void addStep(String stepRule, Map<String, Object> params, int stateIndex) {

		videoGenTrace.Steps.Step toPush = null;

		if (stateIndex >= 0) {

			videoGenTrace.States.State state = this.traceRoot.getStatesTrace().get(stateIndex);

			if (stepRule.equalsIgnoreCase("videoGen.Alternatives.execute")) {
				// First we create the step
				videoGenTrace.Steps.VideoGen_Alternatives_Execute videoGen_Alternatives_ExecuteInstance = videoGenTrace.Steps.StepsFactory.eINSTANCE
						.createVideoGen_Alternatives_Execute();
				videoGen_Alternatives_ExecuteInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", videoGen_Alternatives_ExecuteInstance);
				} else {
					traceRoot.getRootSteps().add(videoGen_Alternatives_ExecuteInstance);
				}
				toPush = videoGen_Alternatives_ExecuteInstance;

				// Then we add it to its trace
				this.traceRoot.getVideoGen_Alternatives_Execute_Sequence().add(videoGen_Alternatives_ExecuteInstance);
			} else

			if (stepRule.equalsIgnoreCase("videoGen.Delay.execute")) {
				// First we create the step
				videoGenTrace.Steps.VideoGen_Delay_Execute videoGen_Delay_ExecuteInstance = videoGenTrace.Steps.StepsFactory.eINSTANCE
						.createVideoGen_Delay_Execute();
				videoGen_Delay_ExecuteInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", videoGen_Delay_ExecuteInstance);
				} else {
					traceRoot.getRootSteps().add(videoGen_Delay_ExecuteInstance);
				}
				toPush = videoGen_Delay_ExecuteInstance;

				// Then we add it to its trace
				this.traceRoot.getVideoGen_Delay_Execute_Sequence().add(videoGen_Delay_ExecuteInstance);
			} else

			if (stepRule.equalsIgnoreCase("videoGen.Generate.compute")) {
				// First we create the step
				videoGenTrace.Steps.VideoGen_Generate_Compute videoGen_Generate_ComputeInstance = videoGenTrace.Steps.StepsFactory.eINSTANCE
						.createVideoGen_Generate_Compute();
				videoGen_Generate_ComputeInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", videoGen_Generate_ComputeInstance);
				} else {
					traceRoot.getRootSteps().add(videoGen_Generate_ComputeInstance);
				}
				toPush = videoGen_Generate_ComputeInstance;

				// Then we add it to its trace
				this.traceRoot.getVideoGen_Generate_Compute_Sequence().add(videoGen_Generate_ComputeInstance);
			} else

			if (stepRule.equalsIgnoreCase("videoGen.Generate.execute")) {
				// First we create the step
				videoGenTrace.Steps.VideoGen_Generate_Execute videoGen_Generate_ExecuteInstance = videoGenTrace.Steps.StepsFactory.eINSTANCE
						.createVideoGen_Generate_Execute();
				videoGen_Generate_ExecuteInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", videoGen_Generate_ExecuteInstance);
				} else {
					traceRoot.getRootSteps().add(videoGen_Generate_ExecuteInstance);
				}
				toPush = videoGen_Generate_ExecuteInstance;

				// Then we add it to its trace
				this.traceRoot.getVideoGen_Generate_Execute_Sequence().add(videoGen_Generate_ExecuteInstance);
			} else

			if (stepRule.equalsIgnoreCase("videoGen.Initialize.execute")) {
				// First we create the step
				videoGenTrace.Steps.VideoGen_Initialize_Execute videoGen_Initialize_ExecuteInstance = videoGenTrace.Steps.StepsFactory.eINSTANCE
						.createVideoGen_Initialize_Execute();
				videoGen_Initialize_ExecuteInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", videoGen_Initialize_ExecuteInstance);
				} else {
					traceRoot.getRootSteps().add(videoGen_Initialize_ExecuteInstance);
				}
				toPush = videoGen_Initialize_ExecuteInstance;

				// Then we add it to its trace
				this.traceRoot.getVideoGen_Initialize_Execute_Sequence().add(videoGen_Initialize_ExecuteInstance);
			} else

			if (stepRule.equalsIgnoreCase("videoGen.Mandatory.execute")) {
				// First we create the step
				videoGenTrace.Steps.VideoGen_Mandatory_Execute videoGen_Mandatory_ExecuteInstance = videoGenTrace.Steps.StepsFactory.eINSTANCE
						.createVideoGen_Mandatory_Execute();
				videoGen_Mandatory_ExecuteInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", videoGen_Mandatory_ExecuteInstance);
				} else {
					traceRoot.getRootSteps().add(videoGen_Mandatory_ExecuteInstance);
				}
				toPush = videoGen_Mandatory_ExecuteInstance;

				// Then we add it to its trace
				this.traceRoot.getVideoGen_Mandatory_Execute_Sequence().add(videoGen_Mandatory_ExecuteInstance);
			} else

			if (stepRule.equalsIgnoreCase("videoGen.Optional.execute")) {
				// First we create the step
				videoGenTrace.Steps.VideoGen_Optional_Execute videoGen_Optional_ExecuteInstance = videoGenTrace.Steps.StepsFactory.eINSTANCE
						.createVideoGen_Optional_Execute();
				videoGen_Optional_ExecuteInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", videoGen_Optional_ExecuteInstance);
				} else {
					traceRoot.getRootSteps().add(videoGen_Optional_ExecuteInstance);
				}
				toPush = videoGen_Optional_ExecuteInstance;

				// Then we add it to its trace
				this.traceRoot.getVideoGen_Optional_Execute_Sequence().add(videoGen_Optional_ExecuteInstance);
			} else

			if (stepRule.equalsIgnoreCase("videoGen.Alternatives.execute")
					|| stepRule.equalsIgnoreCase("videoGen.Mandatory.execute")
					|| stepRule.equalsIgnoreCase("videoGen.Optional.execute")
					|| stepRule.equalsIgnoreCase("videoGen.Sequence.execute")) {
				// First we create the step
				videoGenTrace.Steps.VideoGen_Sequence_Execute videoGen_Sequence_ExecuteInstance = videoGenTrace.Steps.StepsFactory.eINSTANCE
						.createVideoGen_Sequence_Execute();
				videoGen_Sequence_ExecuteInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", videoGen_Sequence_ExecuteInstance);
				} else {
					traceRoot.getRootSteps().add(videoGen_Sequence_ExecuteInstance);
				}
				toPush = videoGen_Sequence_ExecuteInstance;

				// Then we add it to its trace
				this.traceRoot.getVideoGen_Sequence_Execute_Sequence().add(videoGen_Sequence_ExecuteInstance);
			} else

			if (stepRule.equalsIgnoreCase("videoGen.Alternatives.execute")
					|| stepRule.equalsIgnoreCase("videoGen.Delay.execute")
					|| stepRule.equalsIgnoreCase("videoGen.Generate.execute")
					|| stepRule.equalsIgnoreCase("videoGen.Initialize.execute")
					|| stepRule.equalsIgnoreCase("videoGen.Mandatory.execute")
					|| stepRule.equalsIgnoreCase("videoGen.Optional.execute")
					|| stepRule.equalsIgnoreCase("videoGen.Sequence.execute")
					|| stepRule.equalsIgnoreCase("videoGen.Transition.execute")) {
				// First we create the step
				videoGenTrace.Steps.VideoGen_Transition_Execute videoGen_Transition_ExecuteInstance = videoGenTrace.Steps.StepsFactory.eINSTANCE
						.createVideoGen_Transition_Execute();
				videoGen_Transition_ExecuteInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", videoGen_Transition_ExecuteInstance);
				} else {
					traceRoot.getRootSteps().add(videoGen_Transition_ExecuteInstance);
				}
				toPush = videoGen_Transition_ExecuteInstance;

				// Then we add it to its trace
				this.traceRoot.getVideoGen_Transition_Execute_Sequence().add(videoGen_Transition_ExecuteInstance);
			} else

			if (stepRule.equalsIgnoreCase("videoGen.Video.select")) {
				// First we create the step
				videoGenTrace.Steps.VideoGen_Video_Select videoGen_Video_SelectInstance = videoGenTrace.Steps.StepsFactory.eINSTANCE
						.createVideoGen_Video_Select();
				videoGen_Video_SelectInstance.setStartingState(state);

				if (!context.isEmpty() && context.getFirst() != null) {
					emfAdd(context.getFirst(), "subSteps", videoGen_Video_SelectInstance);
				} else {
					traceRoot.getRootSteps().add(videoGen_Video_SelectInstance);
				}
				toPush = videoGen_Video_SelectInstance;

				// Then we add it to its trace
				this.traceRoot.getVideoGen_Video_Select_Sequence().add(videoGen_Video_SelectInstance);
			}

		}

		context.push(toPush);

	}

	private void addImplicitStep(videoGenTrace.Steps.Step currentStep, videoGenTrace.States.State startingState,
			videoGenTrace.States.State endingState) {

	}

	@Override
	public boolean addStep(org.gemoc.executionframework.engine.mse.MSEOccurrence mseOccurrence) {

		videoGenTrace.Steps.Step step = null;

		if (mseOccurrence != null && mseOccurrence instanceof videoGenTrace.Steps.Step) {

			step = (videoGenTrace.Steps.Step) mseOccurrence;

			if (mseModel == null) {
				mseModel = org.gemoc.executionframework.engine.mse.MseFactory.eINSTANCE.createMSEModel();
				traceResource.getContents().add(mseModel);
			}

			mseModel.getOwnedMSEs().add(step.getMse());

			// Creating generic (or almost generic) links
			videoGenTrace.States.State state = this.traceRoot.getStatesTrace().get(this.getTraceSize() - 1);
			step.setStartingState(state);
			if (!context.isEmpty() && context.getFirst() != null) {
				emfAdd(context.getFirst(), "subSteps", step);
			} else {
				traceRoot.getRootSteps().add(step);
			}

			// Adding step in its dedicated sequence/dimension
			if (step instanceof videoGenTrace.Steps.VideoGen_Alternatives_Execute) {
				videoGenTrace.Steps.VideoGen_Alternatives_Execute videoGen_Alternatives_ExecuteInstance = (videoGenTrace.Steps.VideoGen_Alternatives_Execute) step;
				this.traceRoot.getVideoGen_Alternatives_Execute_Sequence().add(videoGen_Alternatives_ExecuteInstance);
			} else if (step instanceof videoGenTrace.Steps.VideoGen_Delay_Execute) {
				videoGenTrace.Steps.VideoGen_Delay_Execute videoGen_Delay_ExecuteInstance = (videoGenTrace.Steps.VideoGen_Delay_Execute) step;
				this.traceRoot.getVideoGen_Delay_Execute_Sequence().add(videoGen_Delay_ExecuteInstance);
			} else if (step instanceof videoGenTrace.Steps.VideoGen_Generate_Compute) {
				videoGenTrace.Steps.VideoGen_Generate_Compute videoGen_Generate_ComputeInstance = (videoGenTrace.Steps.VideoGen_Generate_Compute) step;
				this.traceRoot.getVideoGen_Generate_Compute_Sequence().add(videoGen_Generate_ComputeInstance);
			} else if (step instanceof videoGenTrace.Steps.VideoGen_Generate_Execute) {
				videoGenTrace.Steps.VideoGen_Generate_Execute videoGen_Generate_ExecuteInstance = (videoGenTrace.Steps.VideoGen_Generate_Execute) step;
				this.traceRoot.getVideoGen_Generate_Execute_Sequence().add(videoGen_Generate_ExecuteInstance);
			} else if (step instanceof videoGenTrace.Steps.VideoGen_Initialize_Execute) {
				videoGenTrace.Steps.VideoGen_Initialize_Execute videoGen_Initialize_ExecuteInstance = (videoGenTrace.Steps.VideoGen_Initialize_Execute) step;
				this.traceRoot.getVideoGen_Initialize_Execute_Sequence().add(videoGen_Initialize_ExecuteInstance);
			} else if (step instanceof videoGenTrace.Steps.VideoGen_Mandatory_Execute) {
				videoGenTrace.Steps.VideoGen_Mandatory_Execute videoGen_Mandatory_ExecuteInstance = (videoGenTrace.Steps.VideoGen_Mandatory_Execute) step;
				this.traceRoot.getVideoGen_Mandatory_Execute_Sequence().add(videoGen_Mandatory_ExecuteInstance);
			} else if (step instanceof videoGenTrace.Steps.VideoGen_Optional_Execute) {
				videoGenTrace.Steps.VideoGen_Optional_Execute videoGen_Optional_ExecuteInstance = (videoGenTrace.Steps.VideoGen_Optional_Execute) step;
				this.traceRoot.getVideoGen_Optional_Execute_Sequence().add(videoGen_Optional_ExecuteInstance);
			} else if (step instanceof videoGenTrace.Steps.VideoGen_Sequence_Execute) {
				videoGenTrace.Steps.VideoGen_Sequence_Execute videoGen_Sequence_ExecuteInstance = (videoGenTrace.Steps.VideoGen_Sequence_Execute) step;
				this.traceRoot.getVideoGen_Sequence_Execute_Sequence().add(videoGen_Sequence_ExecuteInstance);
			} else if (step instanceof videoGenTrace.Steps.VideoGen_Transition_Execute) {
				videoGenTrace.Steps.VideoGen_Transition_Execute videoGen_Transition_ExecuteInstance = (videoGenTrace.Steps.VideoGen_Transition_Execute) step;
				this.traceRoot.getVideoGen_Transition_Execute_Sequence().add(videoGen_Transition_ExecuteInstance);
			} else if (step instanceof videoGenTrace.Steps.VideoGen_Video_Select) {
				videoGenTrace.Steps.VideoGen_Video_Select videoGen_Video_SelectInstance = (videoGenTrace.Steps.VideoGen_Video_Select) step;
				this.traceRoot.getVideoGen_Video_Select_Sequence().add(videoGen_Video_SelectInstance);
			}
		}
		context.push(step);

		return (step != null);
	}

	@Override
	public void endStep(String stepRule, Object returnValue) {
		videoGenTrace.Steps.Step popped = context.pop();
		if (popped != null)
			popped.setEndingState(lastState);
	}

	@Override
	public void goTo(EObject state) {

		if (state instanceof videoGenTrace.States.State) {
			videoGenTrace.States.State stateToGo = (videoGenTrace.States.State) state;

		} else {
			goToValue(state);
		}
	}

	@Override
	public void goTo(int stepNumber) {
		videoGenTrace.States.State stateToGo = traceRoot.getStatesTrace().get(stepNumber);
		goTo(stateToGo);
	}

	private void goToValue(EObject value) {
		Object states = emfGet(value, "states");
		if (states != null) {
			if (states instanceof List<?>) {
				// We get the first state in which this value existed
				Object state = ((List<?>) states).get(0);
				if (state instanceof videoGenTrace.States.State) {
					goTo((videoGenTrace.States.State) state);
				}
			}
		}
	}

	@Override
	public void initTrace() {
		// Create root
		this.traceRoot = videoGenTrace.VideoGenTraceFactory.eINSTANCE.createTrace();

		// Put in the resource
		traceResource.getContents().add(traceRoot);

		// Initializing the map exeobject -> tracedobject
		this.exeToTraced = new HashMap<EObject, EObject>();
	}

	public void loadTrace(videoGenTrace.Trace traceRoot) {
		this.traceRoot = traceRoot;
		this.exeToTraced = new HashMap<EObject, EObject>();
	}

	@Override
	public void save() {
		try {
			traceResource.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getDescriptionOfExecutionState(int index) {
		StringBuilder result = new StringBuilder();
		videoGenTrace.States.State gs = traceRoot.getStatesTrace().get(index);

		if (!gs.getStartedSteps().isEmpty()) {
			result.append("\n\nStarting steps: ");
			for (videoGenTrace.Steps.Step m : gs.getStartedSteps()) {
				result.append("\n\t" + m.eClass().getName());
				if (m.getEndingState() != null) {
					result.append(" (ends at state " + traceRoot.getStatesTrace().indexOf(m.getEndingState()) + ")");
				}
			}
		}

		result.deleteCharAt(0);
		return result.toString();
	}

	@Override
	public String getDescriptionOfValue(EObject value) {
		return "ERROR";
	}

	@Override
	public Object getContainedValue(EObject value) {
		return null;
	}

	@SuppressWarnings("unchecked")
	private static void emfAdd(EObject o, String property, Object value) {
		for (EReference r : o.eClass().getEAllReferences()) {
			if (r.getName().equalsIgnoreCase(property)) {
				Object coll = o.eGet(r);
				if (coll instanceof Collection) {
					((Collection<Object>) coll).add(value);
					return;
				}
			}
		}
	}

	private static Object emfGet(EObject o, String property) {
		for (EReference r : o.eClass().getEAllReferences()) {
			if (r.getName().equalsIgnoreCase(property)) {
				return o.eGet(r);
			}
		}
		return null;
	}

	@Override
	public EObject getExecutionState(int index) {
		return traceRoot.getStatesTrace().get(index);
	}

	@Override
	public int getTraceSize() {
		return traceRoot.getStatesTrace().size();
	}

	@Override
	public int getNumberOfValueTraces() {
		return traces.size();
	}

	@Override
	public Set<EObject> getAllCurrentValues(int stateIndex) {
		videoGenTrace.States.State currentState = this.traceRoot.getStatesTrace().get(stateIndex);
		// We find all current values
		Set<EObject> currentValues = new HashSet<EObject>();
		if (currentState != null) {
		}
		return currentValues;
	}

	public List<IValueTrace> getAllValueTraces() {
		return traces;
	}

	@Override
	public int getStateOrValueIndex(EObject stateOrValue) {
		int idx = traceRoot.getStatesTrace().indexOf(stateOrValue);
		if (idx == -1) {
			final Object states = emfGet(stateOrValue, "states");
			if (states != null) {
				if (states instanceof List<?>) {
					// We get the first state in which this value existed
					Object valueState = ((List<?>) states).get(0);
					if (valueState instanceof videoGenTrace.States.State) {
						idx = traceRoot.getStatesTrace().indexOf(valueState);
					}
				}
			}
		}
		return idx;
	}

	@Override
	public String currentBigStep() {
		if (!context.isEmpty() && context.getFirst() != null)
			return context.getFirst().eClass().getName();
		else
			return null;
	}

	@Override
	public List<fr.inria.diverse.trace.api.IStep> getStepsForStates(int startingState, int endingState) {
		Predicate<fr.inria.diverse.trace.api.IStep> predicate = (s) -> {
			final int stepStartingState = s.getStartingIndex();
			final int stepEndingState = s.getEndingIndex();
			return (stepEndingState == -1 || stepEndingState >= startingState) && stepStartingState <= endingState;
		};
		return traceRoot.getRootSteps().stream().map(s -> createLazyGenericStep(s, null, predicate)).filter(predicate)
				.collect(Collectors.toList());
	}

	@SuppressWarnings("unchecked")
	private List<fr.inria.diverse.trace.api.IStep> generateSubSteps(videoGenTrace.Steps.Step step,
			fr.inria.diverse.trace.api.IStep parent) {

		final List<videoGenTrace.Steps.Step> subSteps = (List<videoGenTrace.Steps.Step>) emfGet(step, "subSteps");
		final List<fr.inria.diverse.trace.api.IStep> result = new ArrayList<>();

		if (subSteps != null && !subSteps.isEmpty()) {
			for (videoGenTrace.Steps.Step subStep : subSteps) {
				result.add(createLazyGenericStep(subStep, parent));
			}
		}

		return result;
	}

	private fr.inria.diverse.trace.api.IStep createLazyGenericStep(videoGenTrace.Steps.Step step,
			fr.inria.diverse.trace.api.IStep parent) {
		return createLazyGenericStep(step, parent, null);
	}

	private fr.inria.diverse.trace.api.IStep createLazyGenericStep(videoGenTrace.Steps.Step step,
			fr.inria.diverse.trace.api.IStep parent, Predicate<fr.inria.diverse.trace.api.IStep> predicate) {
		fr.inria.diverse.trace.api.IStep result = null;

		if (step instanceof videoGenTrace.Steps.VideoGen_Alternatives_Execute) {
			videoGenTrace.Steps.VideoGen_Alternatives_Execute step_cast = (videoGenTrace.Steps.VideoGen_Alternatives_Execute) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.PartiallyLazyGenericStep(
					"org.irisa.diverse.videogen.videoGen.Alternatives", "execute", startIndex, endIndex, parent,
					(s) -> generateSubSteps(step_cast, s), predicate);
			result.addParameter("caller", (step_cast.getCaller()));
			result.addParameter("this", step);

		} else if (step instanceof videoGenTrace.Steps.VideoGen_Delay_Execute) {
			videoGenTrace.Steps.VideoGen_Delay_Execute step_cast = (videoGenTrace.Steps.VideoGen_Delay_Execute) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.PartiallyLazyGenericStep(
					"org.irisa.diverse.videogen.videoGen.Delay", "execute", startIndex, endIndex, parent,
					(s) -> generateSubSteps(step_cast, s), predicate);
			result.addParameter("caller", (step_cast.getCaller()));
			result.addParameter("this", step);

		} else if (step instanceof videoGenTrace.Steps.VideoGen_Generate_Compute) {
			videoGenTrace.Steps.VideoGen_Generate_Compute step_cast = (videoGenTrace.Steps.VideoGen_Generate_Compute) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.PartiallyLazyGenericStep(
					"org.irisa.diverse.videogen.videoGen.Generate", "compute", startIndex, endIndex, parent,
					(s) -> generateSubSteps(step_cast, s), predicate);
			result.addParameter("caller", (step_cast.getCaller()));
			result.addParameter("this", step);

		} else if (step instanceof videoGenTrace.Steps.VideoGen_Generate_Execute) {
			videoGenTrace.Steps.VideoGen_Generate_Execute step_cast = (videoGenTrace.Steps.VideoGen_Generate_Execute) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.PartiallyLazyGenericStep(
					"org.irisa.diverse.videogen.videoGen.Generate", "execute", startIndex, endIndex, parent,
					(s) -> generateSubSteps(step_cast, s), predicate);
			result.addParameter("caller", (step_cast.getCaller()));
			result.addParameter("this", step);

		} else if (step instanceof videoGenTrace.Steps.VideoGen_Initialize_Execute) {
			videoGenTrace.Steps.VideoGen_Initialize_Execute step_cast = (videoGenTrace.Steps.VideoGen_Initialize_Execute) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.PartiallyLazyGenericStep(
					"org.irisa.diverse.videogen.videoGen.Initialize", "execute", startIndex, endIndex, parent,
					(s) -> generateSubSteps(step_cast, s), predicate);
			result.addParameter("caller", (step_cast.getCaller()));
			result.addParameter("this", step);

		} else if (step instanceof videoGenTrace.Steps.VideoGen_Mandatory_Execute) {
			videoGenTrace.Steps.VideoGen_Mandatory_Execute step_cast = (videoGenTrace.Steps.VideoGen_Mandatory_Execute) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.PartiallyLazyGenericStep(
					"org.irisa.diverse.videogen.videoGen.Mandatory", "execute", startIndex, endIndex, parent,
					(s) -> generateSubSteps(step_cast, s), predicate);
			result.addParameter("caller", (step_cast.getCaller()));
			result.addParameter("this", step);

		} else if (step instanceof videoGenTrace.Steps.VideoGen_Optional_Execute) {
			videoGenTrace.Steps.VideoGen_Optional_Execute step_cast = (videoGenTrace.Steps.VideoGen_Optional_Execute) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.PartiallyLazyGenericStep(
					"org.irisa.diverse.videogen.videoGen.Optional", "execute", startIndex, endIndex, parent,
					(s) -> generateSubSteps(step_cast, s), predicate);
			result.addParameter("caller", (step_cast.getCaller()));
			result.addParameter("this", step);

		} else if (step instanceof videoGenTrace.Steps.VideoGen_Sequence_Execute) {
			videoGenTrace.Steps.VideoGen_Sequence_Execute step_cast = (videoGenTrace.Steps.VideoGen_Sequence_Execute) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.PartiallyLazyGenericStep(
					"org.irisa.diverse.videogen.videoGen.Sequence", "execute", startIndex, endIndex, parent,
					(s) -> generateSubSteps(step_cast, s), predicate);
			result.addParameter("caller", (step_cast.getCaller()));
			result.addParameter("this", step);

		} else if (step instanceof videoGenTrace.Steps.VideoGen_Transition_Execute) {
			videoGenTrace.Steps.VideoGen_Transition_Execute step_cast = (videoGenTrace.Steps.VideoGen_Transition_Execute) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.PartiallyLazyGenericStep(
					"org.irisa.diverse.videogen.videoGen.Transition", "execute", startIndex, endIndex, parent,
					(s) -> generateSubSteps(step_cast, s), predicate);
			result.addParameter("caller", (step_cast.getCaller()));
			result.addParameter("this", step);

		} else if (step instanceof videoGenTrace.Steps.VideoGen_Video_Select) {
			videoGenTrace.Steps.VideoGen_Video_Select step_cast = (videoGenTrace.Steps.VideoGen_Video_Select) step;
			int startIndex = this.traceRoot.getStatesTrace().indexOf(step.getStartingState());
			int endIndex = this.traceRoot.getStatesTrace().indexOf(step.getEndingState());

			result = new fr.inria.diverse.trace.api.impl.PartiallyLazyGenericStep(
					"org.irisa.diverse.videogen.videoGen.Video", "select", startIndex, endIndex, parent,
					(s) -> generateSubSteps(step_cast, s), predicate);
			result.addParameter("caller", (step_cast.getCaller()));
			result.addParameter("this", step);

		}

		return result;
	}

	private Set<Resource> getAllExecutedModelResources() {
		Set<Resource> allResources = new HashSet<>();
		allResources.add(executedModel);
		allResources.addAll(org.gemoc.commons.eclipse.emf.EMFResource.getRelatedResources(executedModel));
		return allResources;
	}

	@Override
	public boolean isPartialTraceManager() {
		return false;
	}
}

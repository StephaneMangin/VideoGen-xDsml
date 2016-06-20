package org.irisa.diverse.videogen.videogenl.trace.tracemanager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.diff.DefaultDiffEngine;
import org.eclipse.emf.compare.diff.DiffBuilder;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.compare.diff.IDiffEngine;
import org.eclipse.emf.compare.diff.IDiffProcessor;
import org.eclipse.emf.compare.internal.spec.MatchSpec;
import org.eclipse.emf.compare.postprocessor.BasicPostProcessorDescriptorImpl;
import org.eclipse.emf.compare.postprocessor.IPostProcessor;
import org.eclipse.emf.compare.postprocessor.IPostProcessor.Descriptor.Registry;
import org.eclipse.emf.compare.postprocessor.PostProcessorDescriptorRegistryImpl;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.gemoc.executionframework.engine.core.CommandExecution;

import fr.inria.diverse.trace.commons.model.trace.LaunchConfiguration;
import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.Step;
import fr.inria.diverse.trace.gemoc.api.ITraceExplorer;
import fr.inria.diverse.trace.gemoc.api.ITraceListener;

public class VideoGenTraceExplorer implements ITraceExplorer {

	private videoGenTrace.SpecificTrace traceRoot;
	private Resource modelResource;
	private final Map<EObject, EObject> tracedToExe;

	private int lastJumpIndex = -1;
	private videoGenTrace.States.State currentState = null;
	final private List<Step> callStack = new ArrayList<>();

	final private List<List<? extends videoGenTrace.States.Value>> valueTraces = new ArrayList<>();

	private List<videoGenTrace.States.State> statesTrace;

	private videoGenTrace.Steps.SpecificStep stepIntoResult;
	private videoGenTrace.Steps.SpecificStep stepOverResult;
	private videoGenTrace.Steps.SpecificStep stepReturnResult;

	private videoGenTrace.Steps.SpecificStep stepBackIntoResult;
	private videoGenTrace.Steps.SpecificStep stepBackOverResult;
	private videoGenTrace.Steps.SpecificStep stepBackOutResult;

	final private Map<videoGenTrace.Steps.SpecificStep, Integer> stepToStartingIndex = new HashMap<>();
	final private Map<videoGenTrace.Steps.SpecificStep, Integer> stepToEndingIndex = new HashMap<>();

	private final HashMap<Integer, Boolean> canBackValueCache = new HashMap<>();

	final private List<ITraceListener> listeners = new ArrayList<>();

	final private DefaultDeclarativeQualifiedNameProvider nameProvider = new DefaultDeclarativeQualifiedNameProvider();

	public VideoGenTraceExplorer(Map<EObject, EObject> tracedToExe) {
		this.tracedToExe = tracedToExe;
		configureDiffEngine();
	}

	public VideoGenTraceExplorer() {
		this.tracedToExe = null;
		configureDiffEngine();
	}

	private IDiffEngine diffEngine = null;

	private void configureDiffEngine() {
		IDiffProcessor diffProcessor = new DiffBuilder();
		diffEngine = new DefaultDiffEngine(diffProcessor) {
			@Override
			protected FeatureFilter createFeatureFilter() {
				return new FeatureFilter() {
					@Override
					protected boolean isIgnoredReference(Match match, EReference reference) {
						return true;
					}
				};
			}
		};
	}

	private List<List<? extends videoGenTrace.States.Value>> getAllValueTraces() {
		final List<List<? extends videoGenTrace.States.Value>> result = new ArrayList<>();
		for (videoGenTrace.States.videoGen.TracedAlternatives tracedObject : traceRoot
				.getVideoGen_tracedAlternativess()) {
			result.add(tracedObject.getCallnextTransitionSequence());
			result.add(tracedObject.getExecutedSequence());
			result.add(tracedObject.getVideoGenSequence());
		}
		for (videoGenTrace.States.videoGen.TracedDelay tracedObject : traceRoot.getVideoGen_tracedDelays()) {
			result.add(tracedObject.getCallnextTransitionSequence());
			result.add(tracedObject.getExecutedSequence());
			result.add(tracedObject.getVideoGenSequence());
		}
		for (videoGenTrace.States.videoGen.TracedGenerate tracedObject : traceRoot.getVideoGen_tracedGenerates()) {
			result.add(tracedObject.getCallnextTransitionSequence());
			result.add(tracedObject.getExecutedSequence());
			result.add(tracedObject.getVideoGenSequence());
		}
		for (videoGenTrace.States.videoGen.TracedInitialize tracedObject : traceRoot.getVideoGen_tracedInitializes()) {
			result.add(tracedObject.getCallnextTransitionSequence());
			result.add(tracedObject.getExecutedSequence());
			result.add(tracedObject.getVideoGenSequence());
		}
		for (videoGenTrace.States.videoGen.TracedMandatory tracedObject : traceRoot.getVideoGen_tracedMandatorys()) {
			result.add(tracedObject.getCallnextTransitionSequence());
			result.add(tracedObject.getExecutedSequence());
			result.add(tracedObject.getVideoGenSequence());
		}
		for (videoGenTrace.States.videoGen.TracedOptional tracedObject : traceRoot.getVideoGen_tracedOptionals()) {
			result.add(tracedObject.getCallnextTransitionSequence());
			result.add(tracedObject.getExecutedSequence());
			result.add(tracedObject.getVideoGenSequence());
		}
		for (videoGenTrace.States.videoGen.TracedVideo tracedObject : traceRoot.getVideoGen_tracedVideos()) {
		}
		for (videoGenTrace.States.videoGen.TracedVideoGen tracedObject : traceRoot.getVideoGen_tracedVideoGens()) {
		}
		return result;
	}

	private videoGenTrace.States.Value getActiveValue(List<? extends videoGenTrace.States.Value> valueTrace,
			videoGenTrace.States.State state) {
		videoGenTrace.States.Value result = null;
		for (videoGenTrace.States.Value value : valueTrace) {
			if (value.getStatesNoOpposite().contains(state)) {
				result = value;
				break;
			}
		}
		return result;
	}

	private int getPreviousValueIndex(final List<? extends videoGenTrace.States.Value> valueTrace) {
		videoGenTrace.States.Value value = getActiveValue(valueTrace, currentState);
		if (value != null) {
			return valueTrace.indexOf(value) - 1;
		} else {
			int i = getCurrentStateIndex() - 1;
			while (i > -1 && value == null) {
				value = getActiveValue(valueTrace, statesTrace.get(i));
				i--;
			}
			if (value == null) {
				return -1;
			} else {
				return valueTrace.indexOf(value) - 1;
			}
		}
	}

	private int getNextValueIndex(List<? extends videoGenTrace.States.Value> valueTrace) {
		videoGenTrace.States.Value value = getActiveValue(valueTrace, currentState);
		if (value != null) {
			final int idx = valueTrace.indexOf(value) + 1;
			if (idx < valueTrace.size()) {
				return idx;
			}
			return -1;
		} else {
			int i = getCurrentStateIndex() + 1;
			final int traceLength = valueTrace.size();
			while (i < traceLength && value == null) {
				value = getActiveValue(valueTrace, statesTrace.get(i));
				i++;
			}
			if (value == null) {
				return -1;
			} else {
				final int idx = valueTrace.indexOf(value) + 1;
				if (idx < valueTrace.size()) {
					return idx;
				}
				return -1;
			}
		}
	}

	private ValueWrapper getValueWrapper(videoGenTrace.States.Value value, int valueIndex) {
		List<videoGenTrace.States.State> states = value.getStatesNoOpposite();
		videoGenTrace.States.State firstState = states.get(0);
		final int firstStateIndex = statesTrace.indexOf(firstState);
		final int lastStateIndex = (int) (firstStateIndex + states.stream().distinct().count() - 1);
		return new ValueWrapper(value, firstStateIndex, lastStateIndex, valueIndex);
	}

	private final IPostProcessor customPostProcessor = new IPostProcessor() {

		private final Function<EObject, String> getIdFunction = e -> e.eClass().getName();

		@Override
		public void postMatch(Comparison comparison, Monitor monitor) {
			final List<Match> matches = new ArrayList<>(comparison.getMatches());
			final List<Match> treatedMatches = new ArrayList<>();
			matches.forEach(m1 -> {
				matches.forEach(m2 -> {
					if (m1 != m2 && !treatedMatches.contains(m2)) {
						final EObject left;
						final EObject right;
						if (m1.getLeft() != null && m1.getRight() == null && m2.getLeft() == null
								&& m2.getRight() != null) {
							left = m1.getLeft();
							right = m2.getRight();
						} else if (m2.getLeft() != null && m2.getRight() == null && m1.getLeft() == null
								&& m1.getRight() != null) {
							left = m2.getLeft();
							right = m1.getRight();
						} else {
							return;
						}
						final String leftId = getIdFunction.apply(left);
						final String rightId = getIdFunction.apply(right);
						if (leftId.equals(rightId)) {
							comparison.getMatches().remove(m1);
							comparison.getMatches().remove(m2);
							final Match match = new MatchSpec();
							match.setLeft(left);
							match.setRight(right);
							comparison.getMatches().add(match);
						}
					}
				});
				treatedMatches.add(m1);
			});
		}

		@Override
		public void postDiff(Comparison comparison, Monitor monitor) {
		}

		@Override
		public void postRequirements(Comparison comparison, Monitor monitor) {
		}

		@Override
		public void postEquivalences(Comparison comparison, Monitor monitor) {
		}

		@Override
		public void postConflicts(Comparison comparison, Monitor monitor) {
		}

		@Override
		public void postComparison(Comparison comparison, Monitor monitor) {
		}
	};

	private List<Diff> compareEObjects(EObject e1, EObject e2) {
		IPostProcessor.Descriptor descriptor = new BasicPostProcessorDescriptorImpl(customPostProcessor,
				Pattern.compile(".*"), null);

		Registry registry = new PostProcessorDescriptorRegistryImpl();
		registry.put(customPostProcessor.getClass().getName(), descriptor);

		final EMFCompare compare;

		compare = EMFCompare.builder().setPostProcessorRegistry(registry).setDiffEngine(diffEngine).build();

		final IComparisonScope scope = new DefaultComparisonScope(e1, e2, null);
		final Comparison comparison = compare.compare(scope);
		return comparison.getDifferences();
	}

	@Override
	public boolean compareStates(EObject eObject1, EObject eObject2, List<Integer> hiddenValues) {
		final videoGenTrace.States.State state1;
		final videoGenTrace.States.State state2;

		if (eObject1 instanceof videoGenTrace.States.State) {
			state1 = (videoGenTrace.States.State) eObject1;
		} else {
			return false;
		}

		if (eObject2 instanceof videoGenTrace.States.State) {
			state2 = (videoGenTrace.States.State) eObject2;
		} else {
			return false;
		}

		final List<videoGenTrace.States.Value> values1 = getAllStateValues(state1);
		final List<videoGenTrace.States.Value> values2 = getAllStateValues(state2);

		if (values1.size() != values2.size()) {
			return false;
		} else {
			final List<Diff> result = new ArrayList<>();
			for (int i = 0; i < values1.size(); i++) {
				if (!hiddenValues.contains(i)) {
					result.addAll(compareEObjects(values1.get(i), values2.get(i)));
				}
			}
			return result.isEmpty();
		}
	}

	private List<videoGenTrace.States.Value> getAllStateValues(videoGenTrace.States.State state) {
		final List<List<? extends videoGenTrace.States.Value>> traces = new ArrayList<>();
		final List<videoGenTrace.States.Value> result = new ArrayList<>();
		for (videoGenTrace.States.videoGen.TracedAlternatives tracedObject : ((videoGenTrace.SpecificTrace) state
				.eContainer()).getVideoGen_tracedAlternativess()) {
			traces.add(tracedObject.getCallnextTransitionSequence());
			traces.add(tracedObject.getExecutedSequence());
			traces.add(tracedObject.getVideoGenSequence());
		}
		for (videoGenTrace.States.videoGen.TracedDelay tracedObject : ((videoGenTrace.SpecificTrace) state.eContainer())
				.getVideoGen_tracedDelays()) {
			traces.add(tracedObject.getCallnextTransitionSequence());
			traces.add(tracedObject.getExecutedSequence());
			traces.add(tracedObject.getVideoGenSequence());
		}
		for (videoGenTrace.States.videoGen.TracedGenerate tracedObject : ((videoGenTrace.SpecificTrace) state
				.eContainer()).getVideoGen_tracedGenerates()) {
			traces.add(tracedObject.getCallnextTransitionSequence());
			traces.add(tracedObject.getExecutedSequence());
			traces.add(tracedObject.getVideoGenSequence());
		}
		for (videoGenTrace.States.videoGen.TracedInitialize tracedObject : ((videoGenTrace.SpecificTrace) state
				.eContainer()).getVideoGen_tracedInitializes()) {
			traces.add(tracedObject.getCallnextTransitionSequence());
			traces.add(tracedObject.getExecutedSequence());
			traces.add(tracedObject.getVideoGenSequence());
		}
		for (videoGenTrace.States.videoGen.TracedMandatory tracedObject : ((videoGenTrace.SpecificTrace) state
				.eContainer()).getVideoGen_tracedMandatorys()) {
			traces.add(tracedObject.getCallnextTransitionSequence());
			traces.add(tracedObject.getExecutedSequence());
			traces.add(tracedObject.getVideoGenSequence());
		}
		for (videoGenTrace.States.videoGen.TracedOptional tracedObject : ((videoGenTrace.SpecificTrace) state
				.eContainer()).getVideoGen_tracedOptionals()) {
			traces.add(tracedObject.getCallnextTransitionSequence());
			traces.add(tracedObject.getExecutedSequence());
			traces.add(tracedObject.getVideoGenSequence());
		}
		for (videoGenTrace.States.videoGen.TracedVideo tracedObject : ((videoGenTrace.SpecificTrace) state.eContainer())
				.getVideoGen_tracedVideos()) {
		}
		for (videoGenTrace.States.videoGen.TracedVideoGen tracedObject : ((videoGenTrace.SpecificTrace) state
				.eContainer()).getVideoGen_tracedVideoGens()) {
		}
		for (List<? extends videoGenTrace.States.Value> trace : traces) {
			for (videoGenTrace.States.Value value : trace) {
				if (value.getStatesNoOpposite().contains(state)) {
					result.add(value);
					break;
				}
			}
		}
		return result;
	}

	private int getStartingIndex(videoGenTrace.Steps.SpecificStep step) {
		return stepToStartingIndex.computeIfAbsent(step, s -> {
			return statesTrace.indexOf(s.getStartingState());
		});
	}

	private int getEndingIndex(videoGenTrace.Steps.SpecificStep step) {
		if (stepToEndingIndex.containsKey(step)) {
			return stepToEndingIndex.get(step);
		} else {
			if (step.getEndingState() != null) {
				final int i = statesTrace.indexOf(step.getEndingState());
				stepToEndingIndex.put(step, i);
				return i;
			}
		}
		return -1;
	}

	@SuppressWarnings("unchecked")
	private videoGenTrace.Steps.SpecificStep findNextStep(final List<videoGenTrace.Steps.SpecificStep> stepPath,
			final videoGenTrace.Steps.SpecificStep previousStep, final int start) {
		final List<videoGenTrace.Steps.SpecificStep> rootSteps = traceRoot.getRootStep().getSubSteps();
		videoGenTrace.Steps.SpecificStep result = null;
		int i = start;
		int depth = stepPath.size();
		videoGenTrace.Steps.SpecificStep previous = previousStep;
		while (result == null && i < depth) {
			final videoGenTrace.Steps.SpecificStep currentStep = stepPath.get(depth - i - 1);
			final List<videoGenTrace.Steps.SpecificStep> currentSubSteps = new ArrayList<>();
			if (currentStep instanceof SequentialStep<?>) {
				currentSubSteps.addAll(((SequentialStep<videoGenTrace.Steps.SpecificStep>) currentStep).getSubSteps());
			}
			if (currentSubSteps.isEmpty()) {
				// No substep to step into, we thus have to explore the substeps
				// of the parent step
				previous = currentStep;
			} else {
				if (previous == null) {
					// First time we step into
					result = currentSubSteps.get(0);
				} else {
					final int idx = currentSubSteps.indexOf(previous) + 1;
					if (idx < currentSubSteps.size()) {
						// We step into the next step
						result = currentSubSteps.get(idx);
					} else {
						previous = currentStep;
					}
				}
			}
			i++;
		}
		if (result == null) {
			final int idx = rootSteps.indexOf(previous) + 1;
			if (idx < rootSteps.size()) {
				result = rootSteps.get(idx);
			}
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	private videoGenTrace.Steps.SpecificStep computeBackInto(List<videoGenTrace.Steps.SpecificStep> stepPath) {
		final List<videoGenTrace.Steps.SpecificStep> rootSteps = traceRoot.getRootStep().getSubSteps();
		final int depth = stepPath.size();
		videoGenTrace.Steps.SpecificStep result = null;
		if (depth > 1) {
			final videoGenTrace.Steps.SpecificStep currentStep = stepPath.get(depth - 1);
			final videoGenTrace.Steps.SpecificStep parentStep = stepPath.get(depth - 2);
			final SequentialStep<videoGenTrace.Steps.SpecificStep> parentStep_cast = (SequentialStep<videoGenTrace.Steps.SpecificStep>) parentStep;
			final List<? extends videoGenTrace.Steps.SpecificStep> parentSubSteps = parentStep_cast.getSubSteps();
			final int idx = parentSubSteps.indexOf(currentStep);
			if (idx == 0) {
				// If the current step is the first in its parents substeps,
				// return parent step
				result = parentStep;
			} else if (idx > 0) {
				// Otherwise, return the deepest substep in the previous sibling
				// step
				final videoGenTrace.Steps.SpecificStep previousSiblingStep = parentSubSteps.get(idx - 1);
				videoGenTrace.Steps.SpecificStep tmpStep = previousSiblingStep;
				final List<videoGenTrace.Steps.SpecificStep> tmpSubSteps = new ArrayList<>();
				tmpSubSteps.clear();
				if (tmpStep instanceof SequentialStep<?>) {
					SequentialStep<videoGenTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<videoGenTrace.Steps.SpecificStep>) tmpStep;
					tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
				}
				while (!tmpSubSteps.isEmpty()) {
					tmpStep = tmpSubSteps.get(tmpSubSteps.size() - 1);
					tmpSubSteps.clear();
					if (tmpStep instanceof SequentialStep<?>) {
						SequentialStep<videoGenTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<videoGenTrace.Steps.SpecificStep>) tmpStep;
						tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
					}
				}
				result = tmpStep;
			}
		} else if (depth == 1) {
			final videoGenTrace.Steps.SpecificStep currentStep = stepPath.get(0);
			final int idx = rootSteps.indexOf(currentStep);
			if (idx > 0) {
				videoGenTrace.Steps.SpecificStep tmpStep = rootSteps.get(idx - 1);
				final List<videoGenTrace.Steps.SpecificStep> tmpSubSteps = new ArrayList<>();
				tmpSubSteps.clear();
				if (tmpStep instanceof SequentialStep<?>) {
					SequentialStep<videoGenTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<videoGenTrace.Steps.SpecificStep>) tmpStep;
					tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
				}
				while (!tmpSubSteps.isEmpty()) {
					tmpStep = tmpSubSteps.get(tmpSubSteps.size() - 1);
					tmpSubSteps.clear();
					if (tmpStep instanceof SequentialStep<?>) {
						SequentialStep<videoGenTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<videoGenTrace.Steps.SpecificStep>) tmpStep;
						tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
					}
				}
				result = tmpStep;
			}
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	private videoGenTrace.Steps.SpecificStep computeBackOver(List<videoGenTrace.Steps.SpecificStep> stepPath) {
		final List<videoGenTrace.Steps.SpecificStep> rootSteps = traceRoot.getRootStep().getSubSteps();
		final int depth = stepPath.size();
		videoGenTrace.Steps.SpecificStep result = null;
		if (depth > 1) {
			final videoGenTrace.Steps.SpecificStep currentStep = stepPath.get(depth - 1);
			final videoGenTrace.Steps.SpecificStep parentStep = stepPath.get(depth - 2);
			final SequentialStep<videoGenTrace.Steps.SpecificStep> parentStep_cast = (SequentialStep<videoGenTrace.Steps.SpecificStep>) parentStep;
			final List<videoGenTrace.Steps.SpecificStep> parentSubSteps = parentStep_cast.getSubSteps();
			final int idx = parentSubSteps.indexOf(currentStep);
			if (idx == 0) {
				// If the current step is the first in its parents substeps,
				// return parent step
				result = parentStep;
			} else {
				// Otherwise, return the previous sibling step
				result = parentSubSteps.get(idx - 1);
			}
		} else if (depth == 1) {
			final videoGenTrace.Steps.SpecificStep currentStep = stepPath.get(0);
			final int idx = rootSteps.indexOf(currentStep);
			if (idx > 0) {
				result = rootSteps.get(idx - 1);
			}
		}
		return result;
	}

	private videoGenTrace.Steps.SpecificStep computeBackOut(List<videoGenTrace.Steps.SpecificStep> stepPath) {
		if (stepPath.size() > 1) {
			return stepPath.get(stepPath.size() - 2);
		}
		return null;
	}

	private videoGenTrace.Steps.SpecificStep computeStepInto(List<videoGenTrace.Steps.SpecificStep> stepPath,
			List<videoGenTrace.Steps.SpecificStep> rootSteps) {
		return findNextStep(stepPath, null, 0);
	}

	private videoGenTrace.Steps.SpecificStep computeStepOver(List<videoGenTrace.Steps.SpecificStep> stepPath,
			List<videoGenTrace.Steps.SpecificStep> rootSteps) {
		if (!stepPath.isEmpty()) {
			return findNextStep(stepPath, stepPath.get(stepPath.size() - 1), 1);
		}
		return null;
	}

	private videoGenTrace.Steps.SpecificStep computeStepReturn(List<videoGenTrace.Steps.SpecificStep> stepPath,
			List<videoGenTrace.Steps.SpecificStep> rootSteps) {
		if (stepPath.size() > 1) {
			return findNextStep(stepPath, stepPath.get(stepPath.size() - 2), 2);
		}
		return null;
	}

	private void computeExplorerState(List<videoGenTrace.Steps.SpecificStep> stepPath) {
		final List<videoGenTrace.Steps.SpecificStep> rootSteps = getStepsForStates(0, statesTrace.size());

		final List<videoGenTrace.Steps.SpecificStep> stepPathUnmodifiable = Collections.unmodifiableList(stepPath);

		stepIntoResult = computeStepInto(stepPathUnmodifiable, rootSteps);
		stepOverResult = computeStepOver(stepPathUnmodifiable, rootSteps);
		stepReturnResult = computeStepReturn(stepPathUnmodifiable, rootSteps);

		stepBackIntoResult = computeBackInto(stepPathUnmodifiable);
		stepBackOverResult = computeBackOver(stepPathUnmodifiable);
		stepBackOutResult = computeBackOut(stepPathUnmodifiable);

		callStack.clear();
		callStack.addAll(stepPathUnmodifiable.stream().map(s -> (Step) s).collect(Collectors.toList()));
	}

	@SuppressWarnings("unchecked")
	private void goTo(EObject eObject) {
		if (eObject instanceof videoGenTrace.States.State) {
			videoGenTrace.States.State stateToGo = (videoGenTrace.States.State) eObject;
			for (videoGenTrace.States.Transition_callnextTransition_Value value : stateToGo
					.getTransition_callnextTransition_Values()) {
				if (value.getParent() instanceof videoGenTrace.States.videoGen.TracedAlternatives) {
					videoGenTrace.States.videoGen.TracedAlternatives parent_cast = (videoGenTrace.States.videoGen.TracedAlternatives) value
							.getParent();
					java.lang.Boolean toset = value.getCallnextTransition();
					java.lang.Boolean current = ((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast
							.getOriginalObject()).getCallnextTransition();
					if (current != toset) {
						((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast.getOriginalObject())
								.setCallnextTransition((java.lang.Boolean) toset);
					}
				}
				if (value.getParent() instanceof videoGenTrace.States.videoGen.TracedDelay) {
					videoGenTrace.States.videoGen.TracedDelay parent_cast = (videoGenTrace.States.videoGen.TracedDelay) value
							.getParent();
					java.lang.Boolean toset = value.getCallnextTransition();
					java.lang.Boolean current = ((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast
							.getOriginalObject()).getCallnextTransition();
					if (current != toset) {
						((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast.getOriginalObject())
								.setCallnextTransition((java.lang.Boolean) toset);
					}
				}
				if (value.getParent() instanceof videoGenTrace.States.videoGen.TracedGenerate) {
					videoGenTrace.States.videoGen.TracedGenerate parent_cast = (videoGenTrace.States.videoGen.TracedGenerate) value
							.getParent();
					java.lang.Boolean toset = value.getCallnextTransition();
					java.lang.Boolean current = ((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast
							.getOriginalObject()).getCallnextTransition();
					if (current != toset) {
						((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast.getOriginalObject())
								.setCallnextTransition((java.lang.Boolean) toset);
					}
				}
				if (value.getParent() instanceof videoGenTrace.States.videoGen.TracedInitialize) {
					videoGenTrace.States.videoGen.TracedInitialize parent_cast = (videoGenTrace.States.videoGen.TracedInitialize) value
							.getParent();
					java.lang.Boolean toset = value.getCallnextTransition();
					java.lang.Boolean current = ((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast
							.getOriginalObject()).getCallnextTransition();
					if (current != toset) {
						((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast.getOriginalObject())
								.setCallnextTransition((java.lang.Boolean) toset);
					}
				}
				if (value.getParent() instanceof videoGenTrace.States.videoGen.TracedMandatory) {
					videoGenTrace.States.videoGen.TracedMandatory parent_cast = (videoGenTrace.States.videoGen.TracedMandatory) value
							.getParent();
					java.lang.Boolean toset = value.getCallnextTransition();
					java.lang.Boolean current = ((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast
							.getOriginalObject()).getCallnextTransition();
					if (current != toset) {
						((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast.getOriginalObject())
								.setCallnextTransition((java.lang.Boolean) toset);
					}
				}
				if (value.getParent() instanceof videoGenTrace.States.videoGen.TracedOptional) {
					videoGenTrace.States.videoGen.TracedOptional parent_cast = (videoGenTrace.States.videoGen.TracedOptional) value
							.getParent();
					java.lang.Boolean toset = value.getCallnextTransition();
					java.lang.Boolean current = ((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast
							.getOriginalObject()).getCallnextTransition();
					if (current != toset) {
						((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast.getOriginalObject())
								.setCallnextTransition((java.lang.Boolean) toset);
					}
				}
			}
			for (videoGenTrace.States.Transition_executed_Value value : stateToGo.getTransition_executed_Values()) {
				if (value.getParent() instanceof videoGenTrace.States.videoGen.TracedAlternatives) {
					videoGenTrace.States.videoGen.TracedAlternatives parent_cast = (videoGenTrace.States.videoGen.TracedAlternatives) value
							.getParent();
					java.lang.Boolean toset = value.getExecuted();
					java.lang.Boolean current = ((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast
							.getOriginalObject()).getExecuted();
					if (current != toset) {
						((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast.getOriginalObject())
								.setExecuted((java.lang.Boolean) toset);
					}
				}
				if (value.getParent() instanceof videoGenTrace.States.videoGen.TracedDelay) {
					videoGenTrace.States.videoGen.TracedDelay parent_cast = (videoGenTrace.States.videoGen.TracedDelay) value
							.getParent();
					java.lang.Boolean toset = value.getExecuted();
					java.lang.Boolean current = ((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast
							.getOriginalObject()).getExecuted();
					if (current != toset) {
						((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast.getOriginalObject())
								.setExecuted((java.lang.Boolean) toset);
					}
				}
				if (value.getParent() instanceof videoGenTrace.States.videoGen.TracedGenerate) {
					videoGenTrace.States.videoGen.TracedGenerate parent_cast = (videoGenTrace.States.videoGen.TracedGenerate) value
							.getParent();
					java.lang.Boolean toset = value.getExecuted();
					java.lang.Boolean current = ((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast
							.getOriginalObject()).getExecuted();
					if (current != toset) {
						((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast.getOriginalObject())
								.setExecuted((java.lang.Boolean) toset);
					}
				}
				if (value.getParent() instanceof videoGenTrace.States.videoGen.TracedInitialize) {
					videoGenTrace.States.videoGen.TracedInitialize parent_cast = (videoGenTrace.States.videoGen.TracedInitialize) value
							.getParent();
					java.lang.Boolean toset = value.getExecuted();
					java.lang.Boolean current = ((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast
							.getOriginalObject()).getExecuted();
					if (current != toset) {
						((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast.getOriginalObject())
								.setExecuted((java.lang.Boolean) toset);
					}
				}
				if (value.getParent() instanceof videoGenTrace.States.videoGen.TracedMandatory) {
					videoGenTrace.States.videoGen.TracedMandatory parent_cast = (videoGenTrace.States.videoGen.TracedMandatory) value
							.getParent();
					java.lang.Boolean toset = value.getExecuted();
					java.lang.Boolean current = ((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast
							.getOriginalObject()).getExecuted();
					if (current != toset) {
						((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast.getOriginalObject())
								.setExecuted((java.lang.Boolean) toset);
					}
				}
				if (value.getParent() instanceof videoGenTrace.States.videoGen.TracedOptional) {
					videoGenTrace.States.videoGen.TracedOptional parent_cast = (videoGenTrace.States.videoGen.TracedOptional) value
							.getParent();
					java.lang.Boolean toset = value.getExecuted();
					java.lang.Boolean current = ((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast
							.getOriginalObject()).getExecuted();
					if (current != toset) {
						((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast.getOriginalObject())
								.setExecuted((java.lang.Boolean) toset);
					}
				}
			}
			for (videoGenTrace.States.Transition_videoGen_Value value : stateToGo.getTransition_videoGen_Values()) {
				if (value.getParent() instanceof videoGenTrace.States.videoGen.TracedAlternatives) {
					videoGenTrace.States.videoGen.TracedAlternatives parent_cast = (videoGenTrace.States.videoGen.TracedAlternatives) value
							.getParent();
					org.irisa.diverse.videogen.videogenl.videoGen.VideoGen toset = (org.irisa.diverse.videogen.videogenl.videoGen.VideoGen) getTracedToExe(
							value.getVideoGen());
					org.irisa.diverse.videogen.videogenl.videoGen.VideoGen current = ((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast
							.getOriginalObject()).getVideoGen();
					if (current != toset) {
						((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast.getOriginalObject())
								.setVideoGen((org.irisa.diverse.videogen.videogenl.videoGen.VideoGen) toset);
					}
				}
				if (value.getParent() instanceof videoGenTrace.States.videoGen.TracedDelay) {
					videoGenTrace.States.videoGen.TracedDelay parent_cast = (videoGenTrace.States.videoGen.TracedDelay) value
							.getParent();
					org.irisa.diverse.videogen.videogenl.videoGen.VideoGen toset = (org.irisa.diverse.videogen.videogenl.videoGen.VideoGen) getTracedToExe(
							value.getVideoGen());
					org.irisa.diverse.videogen.videogenl.videoGen.VideoGen current = ((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast
							.getOriginalObject()).getVideoGen();
					if (current != toset) {
						((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast.getOriginalObject())
								.setVideoGen((org.irisa.diverse.videogen.videogenl.videoGen.VideoGen) toset);
					}
				}
				if (value.getParent() instanceof videoGenTrace.States.videoGen.TracedGenerate) {
					videoGenTrace.States.videoGen.TracedGenerate parent_cast = (videoGenTrace.States.videoGen.TracedGenerate) value
							.getParent();
					org.irisa.diverse.videogen.videogenl.videoGen.VideoGen toset = (org.irisa.diverse.videogen.videogenl.videoGen.VideoGen) getTracedToExe(
							value.getVideoGen());
					org.irisa.diverse.videogen.videogenl.videoGen.VideoGen current = ((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast
							.getOriginalObject()).getVideoGen();
					if (current != toset) {
						((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast.getOriginalObject())
								.setVideoGen((org.irisa.diverse.videogen.videogenl.videoGen.VideoGen) toset);
					}
				}
				if (value.getParent() instanceof videoGenTrace.States.videoGen.TracedInitialize) {
					videoGenTrace.States.videoGen.TracedInitialize parent_cast = (videoGenTrace.States.videoGen.TracedInitialize) value
							.getParent();
					org.irisa.diverse.videogen.videogenl.videoGen.VideoGen toset = (org.irisa.diverse.videogen.videogenl.videoGen.VideoGen) getTracedToExe(
							value.getVideoGen());
					org.irisa.diverse.videogen.videogenl.videoGen.VideoGen current = ((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast
							.getOriginalObject()).getVideoGen();
					if (current != toset) {
						((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast.getOriginalObject())
								.setVideoGen((org.irisa.diverse.videogen.videogenl.videoGen.VideoGen) toset);
					}
				}
				if (value.getParent() instanceof videoGenTrace.States.videoGen.TracedMandatory) {
					videoGenTrace.States.videoGen.TracedMandatory parent_cast = (videoGenTrace.States.videoGen.TracedMandatory) value
							.getParent();
					org.irisa.diverse.videogen.videogenl.videoGen.VideoGen toset = (org.irisa.diverse.videogen.videogenl.videoGen.VideoGen) getTracedToExe(
							value.getVideoGen());
					org.irisa.diverse.videogen.videogenl.videoGen.VideoGen current = ((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast
							.getOriginalObject()).getVideoGen();
					if (current != toset) {
						((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast.getOriginalObject())
								.setVideoGen((org.irisa.diverse.videogen.videogenl.videoGen.VideoGen) toset);
					}
				}
				if (value.getParent() instanceof videoGenTrace.States.videoGen.TracedOptional) {
					videoGenTrace.States.videoGen.TracedOptional parent_cast = (videoGenTrace.States.videoGen.TracedOptional) value
							.getParent();
					org.irisa.diverse.videogen.videogenl.videoGen.VideoGen toset = (org.irisa.diverse.videogen.videogenl.videoGen.VideoGen) getTracedToExe(
							value.getVideoGen());
					org.irisa.diverse.videogen.videogenl.videoGen.VideoGen current = ((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast
							.getOriginalObject()).getVideoGen();
					if (current != toset) {
						((org.irisa.diverse.videogen.videogenl.videoGen.Transition) parent_cast.getOriginalObject())
								.setVideoGen((org.irisa.diverse.videogen.videogenl.videoGen.VideoGen) toset);
					}
				}
			}
		} else if (eObject instanceof videoGenTrace.States.Value) {
			goTo(((videoGenTrace.States.Value) eObject).getStatesNoOpposite().get(0));
		}
	}

	private void goTo(int stateNumber) {
		if (modelResource != null) {
			try {
				final TransactionalEditingDomain ed = TransactionUtil.getEditingDomain(modelResource);
				final RecordingCommand command = new RecordingCommand(ed, "") {
					protected void doExecute() {
						goTo(statesTrace.get(stateNumber));
					}
				};
				CommandExecution.execute(ed, command);
			} catch (Exception e) {
				throw e;
			}
		}
	}

	private Collection<? extends EObject> getTracedToExe(Collection<? extends EObject> tracedObjects) {
		Collection<EObject> result = new ArrayList<EObject>();
		for (EObject tracedObject : tracedObjects) {
			result.add(getTracedToExe(tracedObject));
		}
		return result;
	}

	private EObject getTracedToExe(EObject tracedObject) {
		return tracedToExe.get(tracedObject);
	}

	private void jumpBeforeStep(videoGenTrace.Steps.SpecificStep step) {
		if (step != null) {
			final int i = getStartingIndex(step);
			if (i == statesTrace.size() - 1) {
				lastJumpIndex = -1;
				currentState = statesTrace.get(statesTrace.size() - 1);
			} else {
				lastJumpIndex = i;
				currentState = statesTrace.get(i);
			}
			if (tracedToExe != null) {
				goTo(i);
			}
			updateCallStack(step);
		}
	}

	public void loadTrace(videoGenTrace.SpecificTrace root) {
		traceRoot = root;
		statesTrace = traceRoot.getStatesTrace();
		if (!statesTrace.isEmpty()) {
			currentState = statesTrace.get(0);
		}
		valueTraces.addAll(getAllValueTraces());
	}

	public void loadTrace(Resource modelResource, videoGenTrace.SpecificTrace root) {
		loadTrace(root);
		this.modelResource = modelResource;
	}

	@Override
	public boolean canBackValue(int traceIndex) {
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			return canBackValueCache.computeIfAbsent(traceIndex, i -> {
				final List<? extends videoGenTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
				final int previousValueIndex = getPreviousValueIndex(valueTrace);
				return previousValueIndex > -1;
			});
		}
		return false;
	}

	@Override
	public boolean canStepValue(int traceIndex) {
		return true;
	}

	@Override
	public void backValue(int traceIndex) {
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			final List<? extends videoGenTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
			final int previousValueIndex = getPreviousValueIndex(valueTrace);
			if (previousValueIndex > -1) {
				jump(valueTrace.get(previousValueIndex));
			}
		}
	}

	@Override
	public void stepValue(int traceIndex) {
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			final List<? extends videoGenTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
			final int nextValueIndex = getNextValueIndex(valueTrace);
			if (nextValueIndex > -1) {
				jump(valueTrace.get(nextValueIndex));
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void jump(int i) {
		final List<videoGenTrace.States.State> states = statesTrace;
		if (i < states.size()) {
			final List<videoGenTrace.Steps.SpecificStep> rootSteps = getStepsForStates(i, i);
			final List<videoGenTrace.Steps.SpecificStep> searchPath = new ArrayList<>();
			videoGenTrace.Steps.SpecificStep firstStepOfState = null;
			if (!rootSteps.isEmpty()) {
				final Predicate<videoGenTrace.Steps.SpecificStep> p = s -> {
					final int stepStartingState = getStartingIndex(s);
					final int stepEndingState = getEndingIndex(s);
					return (stepEndingState == -1 || stepEndingState >= i) && stepStartingState <= i;
				};
				videoGenTrace.Steps.SpecificStep currentStep = rootSteps.get(0);
				final List<videoGenTrace.Steps.SpecificStep> siblingSteps = new ArrayList<>(rootSteps);
				final List<videoGenTrace.Steps.SpecificStep> currentSubSteps = new ArrayList<>();
				if (currentStep instanceof SequentialStep<?>) {
					final SequentialStep<videoGenTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<videoGenTrace.Steps.SpecificStep>) currentStep;
					currentSubSteps
							.addAll(currentStep_cast.getSubSteps().stream().filter(p).collect(Collectors.toList()));
				}
				while (firstStepOfState == null) {
					final int startingIndex = getStartingIndex(currentStep);
					final int endingIndex = getEndingIndex(currentStep);
					if (startingIndex < i && (endingIndex > i || endingIndex == -1)) {
						if (currentSubSteps.isEmpty()) {
							throw new IllegalStateException("Unreachable state");
						} else {
							searchPath.add(0, currentStep);
							siblingSteps.clear();
							siblingSteps.addAll(currentSubSteps);
							currentStep = siblingSteps.get(0);
							currentSubSteps.clear();
							if (currentStep instanceof SequentialStep<?>) {
								final SequentialStep<videoGenTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<videoGenTrace.Steps.SpecificStep>) currentStep;
								currentSubSteps.addAll(
										currentStep_cast.getSubSteps().stream().filter(p).collect(Collectors.toList()));
							}
						}
					} else if (endingIndex == i && startingIndex != i) {
						if (currentSubSteps.isEmpty()) {
							// We need to explore the next sibling step
							videoGenTrace.Steps.SpecificStep tmp = currentStep;
							currentStep = null;
							while (currentStep == null) {
								final int idx = siblingSteps.indexOf(tmp) + 1;
								if (idx < siblingSteps.size()) {
									currentStep = siblingSteps.get(idx);
									if (currentStep instanceof SequentialStep<?>) {
										final SequentialStep<videoGenTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<videoGenTrace.Steps.SpecificStep>) currentStep;
										currentSubSteps.addAll(currentStep_cast.getSubSteps().stream().filter(p)
												.collect(Collectors.toList()));
									}
								} else {
									if (searchPath.isEmpty()) {
										throw new IllegalStateException("Unreachable state");
									} else {
										tmp = searchPath.remove(0);
										siblingSteps.clear();
										if (searchPath.isEmpty()) {
											siblingSteps.addAll(rootSteps);
										} else {
											final videoGenTrace.Steps.SpecificStep s = searchPath.get(0);
											if (s instanceof SequentialStep<?>) {
												final SequentialStep<videoGenTrace.Steps.SpecificStep> s_cast = (SequentialStep<videoGenTrace.Steps.SpecificStep>) s;
												siblingSteps.addAll((s_cast).getSubSteps().stream().filter(p)
														.collect(Collectors.toList()));
											}
										}
									}
								}
							}
						} else {
							// We need to explore the substeps in case one of them starts on i
							searchPath.add(0, currentStep);
							siblingSteps.clear();
							siblingSteps.addAll(currentSubSteps);
							currentStep = siblingSteps.get(0);
							currentSubSteps.clear();
							if (currentStep instanceof SequentialStep<?>) {
								final SequentialStep<videoGenTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<videoGenTrace.Steps.SpecificStep>) currentStep;
								currentSubSteps.addAll(
										currentStep_cast.getSubSteps().stream().filter(p).collect(Collectors.toList()));
							}
						}
					} else if (startingIndex == i) {
						firstStepOfState = currentStep;
					}
				}
			}
			jumpBeforeStep(firstStepOfState);
		}
	}

	@Override
	public boolean canStepBackInto() {
		return stepBackIntoResult != null;
	}

	@Override
	public boolean canStepBackOver() {
		return stepBackOverResult != null;
	}

	@Override
	public boolean canStepBackOut() {
		return stepBackOutResult != null;
	}

	@Override
	public int getCurrentStateIndex() {
		if (lastJumpIndex != -1) {
			return lastJumpIndex;
		}
		return statesTrace.size() - 1;
	}

	@Override
	public List<Step> getCallStack() {
		return callStack;
	}

	@Override
	public List<videoGenTrace.Steps.SpecificStep> getStepsForStates(int startingState, int endingState) {
		Predicate<videoGenTrace.Steps.SpecificStep> predicate = s -> {
			final int stepStartingState = getStartingIndex(s);
			final int stepEndingState = getEndingIndex(s);
			return (stepEndingState == -1 || stepEndingState >= startingState) && stepStartingState <= endingState;
		};
		return traceRoot.getRootStep().getSubSteps().stream().filter(predicate).collect(Collectors.toList());
	}

	private boolean isStateBreakable(videoGenTrace.States.State state) {
		final boolean b = state.getStartedSteps().size() == 1;
		if (b) {
			videoGenTrace.Steps.SpecificStep s = state.getStartedSteps().get(0);
			return !(s instanceof videoGenTrace.Steps.VideoGen_Alternatives_Execute_ImplicitStep
					|| s instanceof videoGenTrace.Steps.VideoGen_Generate_Execute_ImplicitStep
					|| s instanceof videoGenTrace.Steps.VideoGen_Initialize_Execute_ImplicitStep
					|| s instanceof videoGenTrace.Steps.VideoGen_Mandatory_Execute_ImplicitStep
					|| s instanceof videoGenTrace.Steps.VideoGen_Optional_Execute_ImplicitStep
					|| s instanceof videoGenTrace.Steps.VideoGen_Transition_Execute_ImplicitStep
					|| s instanceof videoGenTrace.Steps.VideoGen_Transition_FinishExecute_ImplicitStep
					|| s instanceof videoGenTrace.Steps.VideoGen_VideoGen_Execute_ImplicitStep
					|| s instanceof videoGenTrace.Steps.VideoGen_VideoGen_InitializeModel_ImplicitStep
					|| s instanceof videoGenTrace.Steps.VideoGen_VideoGen_Setup_ImplicitStep);
		}
		return true;
	}

	@Override
	public StateWrapper getStateWrapper(int stateIndex) {
		if (stateIndex > -1 && stateIndex < statesTrace.size()) {
			final videoGenTrace.States.State state = statesTrace.get(stateIndex);
			return new StateWrapper(state, stateIndex, isStateBreakable(state));
		}
		return null;
	}

	@Override
	public List<StateWrapper> getStateWrappers(int start, int end) {
		final List<StateWrapper> result = new ArrayList<>();
		final int startStateIndex = Math.max(0, start);
		final int endStateIndex = Math.min(statesTrace.size() - 1, end);

		for (int i = startStateIndex; i < endStateIndex + 1; i++) {
			final videoGenTrace.States.State state = statesTrace.get(i);
			result.add(new StateWrapper(state, i, isStateBreakable(state)));
		}

		return result;
	}

	@Override
	public List<ValueWrapper> getValueWrappers(int valueTraceIndex, int start, int end) {
		final List<ValueWrapper> result = new ArrayList<>();

		if (valueTraceIndex < valueTraces.size()) {
			final List<? extends videoGenTrace.States.Value> valueTrace = valueTraces.get(valueTraceIndex);
			for (videoGenTrace.States.Value value : valueTrace) {
				final int currentValueIndex = valueTrace.indexOf(value);
				ValueWrapper wrapper = getValueWrapper(value, currentValueIndex);
				if (wrapper.firstStateIndex < end && wrapper.lastStateIndex > start) {
					result.add(wrapper);
				}
			}
		}

		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public StepWrapper getStepWrapper(Step step) {
		if (step instanceof videoGenTrace.Steps.SpecificStep) {
			final videoGenTrace.Steps.SpecificStep step_cast = (videoGenTrace.Steps.SpecificStep) step;
			final int startingIndex = getStartingIndex(step_cast);
			final int endingIndex = getEndingIndex(step_cast);
			final List<Step> subSteps = new ArrayList<>();
			if (step_cast instanceof SequentialStep<?>) {
				subSteps.addAll(((SequentialStep<videoGenTrace.Steps.SpecificStep>) step_cast).getSubSteps());
			}
			return new StepWrapper(step, startingIndex, endingIndex, subSteps);
		}
		return null;
	}

	@Override
	public void notifyListeners() {
		for (ITraceListener listener : listeners) {
			listener.update();
		}
	}

	@Override
	public void addListener(ITraceListener listener) {
		if (listener != null) {
			listeners.add(listener);
		}
	}

	@Override
	public void removeListener(ITraceListener listener) {
		if (listener != null) {
			listeners.remove(listener);
		}
	}

	@Override
	public void update() {
		valueTraces.clear();
		valueTraces.addAll(getAllValueTraces());
		canBackValueCache.clear();
		notifyListeners();
	}

	@Override
	public Step getCurrentForwardStep() {
		if (!callStack.isEmpty()) {
			return callStack.get(callStack.size() - 1);
		}
		return null;
	}

	@Override
	public Step getCurrentBackwardStep() {
		return stepBackOverResult;
	}

	@Override
	public Step getCurrentBigStep() {
		return stepBackOutResult;
	}

	@Override
	public int getNumberOfTraces() {
		return valueTraces.size();
	}

	@Override
	public int getStatesTraceLength() {
		return statesTrace.size();
	}

	@Override
	public int getValuesTraceLength(int traceIndex) {
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			List<? extends videoGenTrace.States.Value> trace = valueTraces.get(traceIndex);
			return trace.size();
		}
		return -1;
	}

	@Override
	public void jump(EObject o) {
		int idx = -1;
		if (o instanceof videoGenTrace.States.State) {
			idx = statesTrace.indexOf(o);
		} else if (o instanceof videoGenTrace.States.Value) {
			final videoGenTrace.States.State state = ((videoGenTrace.States.Value) o).getStatesNoOpposite().get(0);
			idx = statesTrace.indexOf(state);
		}
		if (idx != -1) {
			jump(idx);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void loadLastState() {
		final int idx = statesTrace.size() - 1;
		final List<videoGenTrace.Steps.SpecificStep> steps = getStepsForStates(idx, idx);
		videoGenTrace.Steps.SpecificStep lastStep = null;
		while (!steps.isEmpty()) {
			lastStep = steps.get(steps.size() - 1);
			steps.clear();
			if (lastStep instanceof SequentialStep<?>) {
				steps.addAll(((SequentialStep<videoGenTrace.Steps.SpecificStep>) lastStep).getSubSteps());
			}
		}
		final int endingIndex = getEndingIndex(lastStep);
		if (endingIndex == -1 || endingIndex == idx) {
			jumpBeforeStep(lastStep);
		}
	}

	@Override
	public boolean stepInto() {
		if (stepIntoResult != null) {
			jumpBeforeStep(stepIntoResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepOver() {
		if (stepOverResult != null) {
			jumpBeforeStep(stepOverResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepReturn() {
		if (stepReturnResult != null) {
			jumpBeforeStep(stepReturnResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepBackInto() {
		if (stepBackIntoResult != null) {
			jumpBeforeStep(stepBackIntoResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepBackOver() {
		if (stepBackOverResult != null) {
			jumpBeforeStep(stepBackOverResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepBackOut() {
		if (stepBackOutResult != null) {
			jumpBeforeStep(stepBackOutResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean isInReplayMode() {
		return stepIntoResult != null;
	}

	@Override
	public void updateCallStack(Step step) {
		if (step instanceof videoGenTrace.Steps.SpecificStep) {
			videoGenTrace.Steps.SpecificStep step_cast = (videoGenTrace.Steps.SpecificStep) step;
			final List<videoGenTrace.Steps.SpecificStep> newPath = new ArrayList<>();
			newPath.add(step_cast);
			EObject container = step.eContainer();
			while (container != null && container instanceof videoGenTrace.Steps.SpecificStep) {
				newPath.add(0, (videoGenTrace.Steps.SpecificStep) container);
				container = container.eContainer();
			}
			computeExplorerState(newPath);
			update();
		} else {
			throw new IllegalArgumentException(
					"VideoGenTraceExplorer expects specific steps and cannot handle this: " + step);
		}
	}

	@Override
	public String getValueLabel(int traceIndex) {
		String attributeName = "";
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			final List<? extends videoGenTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
			if (valueTrace.isEmpty()) {
				return "";
			}
			final videoGenTrace.States.Value value = valueTrace.get(0);
			final EObject container = value.eContainer();
			final List<String> attributes = container.eClass().getEAllReferences().stream()
					.filter(r -> r.getName().endsWith("Sequence"))
					.map(r -> r.getName().substring(0, r.getName().length() - 8)).collect(Collectors.toList());
			if (!attributes.isEmpty()) {
				attributes.removeIf(s -> !value.getClass().getName().contains("_" + s + "_"));
				attributeName = attributes.get(0);
			}
			final Optional<EReference> originalObject = container.eClass().getEAllReferences().stream()
					.filter(r -> r.getName().equals("originalObject")).findFirst();
			if (originalObject.isPresent()) {
				final Object o = container.eGet(originalObject.get());
				if (o instanceof EObject) {
					final EObject eObject = (EObject) o;
					final QualifiedName qname = nameProvider.getFullyQualifiedName(eObject);
					if (qname == null) {
						return attributeName + " (" + eObject.toString() + ")";
					} else {
						return attributeName + " (" + qname.toString() + " :" + eObject.eClass().getName() + ")";
					}
				}
			}
		}
		return attributeName;
	}

	@Override
	public String getStateDescription(int stateIndex) {
		String result = "State " + stateIndex + "\n";
		for (int i = 0; i < valueTraces.size(); i++) {
			result += "\n" + getValueDescription(i, stateIndex);
		}
		return result;
	}

	@Override
	public String getValueDescription(int traceIndex, int stateIndex) {
		return getValueLabel(traceIndex) + " : " + getValueAt(traceIndex, stateIndex);
	}

	@Override
	public Object getValueAt(int traceIndex, int stateIndex) {
		final List<? extends videoGenTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
		final videoGenTrace.States.State state = statesTrace.get(stateIndex);
		return getActiveValue(valueTrace, state);
	}

	@Override
	public LaunchConfiguration getLaunchConfiguration() {
		return traceRoot.getLaunchconfiguration();
	}
}

package org.irisa.diverse.videogen.videogenl.trace.tracemanager;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.diverse.trace.commons.model.trace.LaunchConfiguration;
import fr.inria.diverse.trace.commons.model.trace.MSEModel;
import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.gemoc.api.ITraceConstructor;

public class VideoGenTraceConstructor implements ITraceConstructor {
	private videoGenTrace.SpecificTrace traceRoot;
	private MSEModel mseModel;
	private Resource executedModel;
	private final Map<EObject, EObject> exeToTraced;

	private videoGenTrace.States.State lastState;

	private Resource traceResource;
	private final Deque<videoGenTrace.Steps.SpecificStep> context = new LinkedList<videoGenTrace.Steps.SpecificStep>();

	public VideoGenTraceConstructor(Resource exeModel, Resource traceResource, Map<EObject, EObject> exeToTraced) {
		this.traceResource = traceResource;
		this.executedModel = exeModel;
		this.exeToTraced = exeToTraced;
	}

	private void addInitialState() {
		if (lastState == null) {
			// Creation of the initial state
			Set<Resource> allResources = getAllExecutedModelResources();
			lastState = videoGenTrace.States.StatesFactory.eINSTANCE.createState();
			for (Resource r : allResources) {
				for (TreeIterator<EObject> i = r.getAllContents(); i.hasNext();) {
					EObject o = i.next();

					if (o instanceof org.irisa.diverse.videogen.videogenl.videoGen.NamedElement) {
						org.irisa.diverse.videogen.videogenl.videoGen.NamedElement o_cast = (org.irisa.diverse.videogen.videogenl.videoGen.NamedElement) o;
						addNewObjectToState(o_cast, lastState);
					}
				}
			}
			this.traceRoot.getStatesTrace().add(lastState);
		}
	}

	private void addNewObjectToState(org.irisa.diverse.videogen.videogenl.videoGen.Alternatives o_cast,
			videoGenTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			videoGenTrace.States.videoGen.TracedAlternatives tracedObject = videoGenTrace.States.videoGen.VideoGenFactory.eINSTANCE
					.createTracedAlternatives();
			tracedObject.setOriginalObject((org.irisa.diverse.videogen.videogenl.videoGen.Alternatives) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getVideoGen_tracedAlternativess().add(tracedObject);

			// Creation of the first value of the field callnextTransition
			videoGenTrace.States.Transition_callnextTransition_Value firstValue_callnextTransition = videoGenTrace.States.StatesFactory.eINSTANCE
					.createTransition_callnextTransition_Value();

			firstValue_callnextTransition.setCallnextTransition((java.lang.Boolean) o_cast.getCallnextTransition());
			tracedObject.getCallnextTransitionSequence().add(firstValue_callnextTransition);
			newState.getTransition_callnextTransition_Values().add(firstValue_callnextTransition);

			// Creation of the first value of the field executed
			videoGenTrace.States.Transition_executed_Value firstValue_executed = videoGenTrace.States.StatesFactory.eINSTANCE
					.createTransition_executed_Value();

			firstValue_executed.setExecuted((java.lang.Boolean) o_cast.getExecuted());
			tracedObject.getExecutedSequence().add(firstValue_executed);
			newState.getTransition_executed_Values().add(firstValue_executed);

			// Creation of the first value of the field videoGen
			videoGenTrace.States.Transition_videoGen_Value firstValue_videoGen = videoGenTrace.States.StatesFactory.eINSTANCE
					.createTransition_videoGen_Value();

			if (o_cast.getVideoGen() != null) {
				addNewObjectToState((org.irisa.diverse.videogen.videogenl.videoGen.VideoGen) o_cast.getVideoGen(),
						newState);
				firstValue_videoGen.setVideoGen(
						(videoGenTrace.States.videoGen.TracedVideoGen) ((videoGenTrace.States.videoGen.TracedVideoGen) exeToTraced
								.get(o_cast.getVideoGen())));
			} else {
				firstValue_videoGen.setVideoGen((videoGenTrace.States.videoGen.TracedVideoGen) null);
			}

			tracedObject.getVideoGenSequence().add(firstValue_videoGen);
			newState.getTransition_videoGen_Values().add(firstValue_videoGen);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(org.irisa.diverse.videogen.videogenl.videoGen.Delay o_cast,
			videoGenTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			videoGenTrace.States.videoGen.TracedDelay tracedObject = videoGenTrace.States.videoGen.VideoGenFactory.eINSTANCE
					.createTracedDelay();
			tracedObject.setOriginalObject((org.irisa.diverse.videogen.videogenl.videoGen.Delay) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getVideoGen_tracedDelays().add(tracedObject);

			// Creation of the first value of the field callnextTransition
			videoGenTrace.States.Transition_callnextTransition_Value firstValue_callnextTransition = videoGenTrace.States.StatesFactory.eINSTANCE
					.createTransition_callnextTransition_Value();

			firstValue_callnextTransition.setCallnextTransition((java.lang.Boolean) o_cast.getCallnextTransition());
			tracedObject.getCallnextTransitionSequence().add(firstValue_callnextTransition);
			newState.getTransition_callnextTransition_Values().add(firstValue_callnextTransition);

			// Creation of the first value of the field executed
			videoGenTrace.States.Transition_executed_Value firstValue_executed = videoGenTrace.States.StatesFactory.eINSTANCE
					.createTransition_executed_Value();

			firstValue_executed.setExecuted((java.lang.Boolean) o_cast.getExecuted());
			tracedObject.getExecutedSequence().add(firstValue_executed);
			newState.getTransition_executed_Values().add(firstValue_executed);

			// Creation of the first value of the field videoGen
			videoGenTrace.States.Transition_videoGen_Value firstValue_videoGen = videoGenTrace.States.StatesFactory.eINSTANCE
					.createTransition_videoGen_Value();

			if (o_cast.getVideoGen() != null) {
				addNewObjectToState((org.irisa.diverse.videogen.videogenl.videoGen.VideoGen) o_cast.getVideoGen(),
						newState);
				firstValue_videoGen.setVideoGen(
						(videoGenTrace.States.videoGen.TracedVideoGen) ((videoGenTrace.States.videoGen.TracedVideoGen) exeToTraced
								.get(o_cast.getVideoGen())));
			} else {
				firstValue_videoGen.setVideoGen((videoGenTrace.States.videoGen.TracedVideoGen) null);
			}

			tracedObject.getVideoGenSequence().add(firstValue_videoGen);
			newState.getTransition_videoGen_Values().add(firstValue_videoGen);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(org.irisa.diverse.videogen.videogenl.videoGen.Generate o_cast,
			videoGenTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			videoGenTrace.States.videoGen.TracedGenerate tracedObject = videoGenTrace.States.videoGen.VideoGenFactory.eINSTANCE
					.createTracedGenerate();
			tracedObject.setOriginalObject((org.irisa.diverse.videogen.videogenl.videoGen.Generate) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getVideoGen_tracedGenerates().add(tracedObject);

			// Creation of the first value of the field callnextTransition
			videoGenTrace.States.Transition_callnextTransition_Value firstValue_callnextTransition = videoGenTrace.States.StatesFactory.eINSTANCE
					.createTransition_callnextTransition_Value();

			firstValue_callnextTransition.setCallnextTransition((java.lang.Boolean) o_cast.getCallnextTransition());
			tracedObject.getCallnextTransitionSequence().add(firstValue_callnextTransition);
			newState.getTransition_callnextTransition_Values().add(firstValue_callnextTransition);

			// Creation of the first value of the field executed
			videoGenTrace.States.Transition_executed_Value firstValue_executed = videoGenTrace.States.StatesFactory.eINSTANCE
					.createTransition_executed_Value();

			firstValue_executed.setExecuted((java.lang.Boolean) o_cast.getExecuted());
			tracedObject.getExecutedSequence().add(firstValue_executed);
			newState.getTransition_executed_Values().add(firstValue_executed);

			// Creation of the first value of the field videoGen
			videoGenTrace.States.Transition_videoGen_Value firstValue_videoGen = videoGenTrace.States.StatesFactory.eINSTANCE
					.createTransition_videoGen_Value();

			if (o_cast.getVideoGen() != null) {
				addNewObjectToState((org.irisa.diverse.videogen.videogenl.videoGen.VideoGen) o_cast.getVideoGen(),
						newState);
				firstValue_videoGen.setVideoGen(
						(videoGenTrace.States.videoGen.TracedVideoGen) ((videoGenTrace.States.videoGen.TracedVideoGen) exeToTraced
								.get(o_cast.getVideoGen())));
			} else {
				firstValue_videoGen.setVideoGen((videoGenTrace.States.videoGen.TracedVideoGen) null);
			}

			tracedObject.getVideoGenSequence().add(firstValue_videoGen);
			newState.getTransition_videoGen_Values().add(firstValue_videoGen);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(org.irisa.diverse.videogen.videogenl.videoGen.Initialize o_cast,
			videoGenTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			videoGenTrace.States.videoGen.TracedInitialize tracedObject = videoGenTrace.States.videoGen.VideoGenFactory.eINSTANCE
					.createTracedInitialize();
			tracedObject.setOriginalObject((org.irisa.diverse.videogen.videogenl.videoGen.Initialize) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getVideoGen_tracedInitializes().add(tracedObject);

			// Creation of the first value of the field callnextTransition
			videoGenTrace.States.Transition_callnextTransition_Value firstValue_callnextTransition = videoGenTrace.States.StatesFactory.eINSTANCE
					.createTransition_callnextTransition_Value();

			firstValue_callnextTransition.setCallnextTransition((java.lang.Boolean) o_cast.getCallnextTransition());
			tracedObject.getCallnextTransitionSequence().add(firstValue_callnextTransition);
			newState.getTransition_callnextTransition_Values().add(firstValue_callnextTransition);

			// Creation of the first value of the field executed
			videoGenTrace.States.Transition_executed_Value firstValue_executed = videoGenTrace.States.StatesFactory.eINSTANCE
					.createTransition_executed_Value();

			firstValue_executed.setExecuted((java.lang.Boolean) o_cast.getExecuted());
			tracedObject.getExecutedSequence().add(firstValue_executed);
			newState.getTransition_executed_Values().add(firstValue_executed);

			// Creation of the first value of the field videoGen
			videoGenTrace.States.Transition_videoGen_Value firstValue_videoGen = videoGenTrace.States.StatesFactory.eINSTANCE
					.createTransition_videoGen_Value();

			if (o_cast.getVideoGen() != null) {
				addNewObjectToState((org.irisa.diverse.videogen.videogenl.videoGen.VideoGen) o_cast.getVideoGen(),
						newState);
				firstValue_videoGen.setVideoGen(
						(videoGenTrace.States.videoGen.TracedVideoGen) ((videoGenTrace.States.videoGen.TracedVideoGen) exeToTraced
								.get(o_cast.getVideoGen())));
			} else {
				firstValue_videoGen.setVideoGen((videoGenTrace.States.videoGen.TracedVideoGen) null);
			}

			tracedObject.getVideoGenSequence().add(firstValue_videoGen);
			newState.getTransition_videoGen_Values().add(firstValue_videoGen);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(org.irisa.diverse.videogen.videogenl.videoGen.Mandatory o_cast,
			videoGenTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			videoGenTrace.States.videoGen.TracedMandatory tracedObject = videoGenTrace.States.videoGen.VideoGenFactory.eINSTANCE
					.createTracedMandatory();
			tracedObject.setOriginalObject((org.irisa.diverse.videogen.videogenl.videoGen.Mandatory) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getVideoGen_tracedMandatorys().add(tracedObject);

			// Creation of the first value of the field callnextTransition
			videoGenTrace.States.Transition_callnextTransition_Value firstValue_callnextTransition = videoGenTrace.States.StatesFactory.eINSTANCE
					.createTransition_callnextTransition_Value();

			firstValue_callnextTransition.setCallnextTransition((java.lang.Boolean) o_cast.getCallnextTransition());
			tracedObject.getCallnextTransitionSequence().add(firstValue_callnextTransition);
			newState.getTransition_callnextTransition_Values().add(firstValue_callnextTransition);

			// Creation of the first value of the field executed
			videoGenTrace.States.Transition_executed_Value firstValue_executed = videoGenTrace.States.StatesFactory.eINSTANCE
					.createTransition_executed_Value();

			firstValue_executed.setExecuted((java.lang.Boolean) o_cast.getExecuted());
			tracedObject.getExecutedSequence().add(firstValue_executed);
			newState.getTransition_executed_Values().add(firstValue_executed);

			// Creation of the first value of the field videoGen
			videoGenTrace.States.Transition_videoGen_Value firstValue_videoGen = videoGenTrace.States.StatesFactory.eINSTANCE
					.createTransition_videoGen_Value();

			if (o_cast.getVideoGen() != null) {
				addNewObjectToState((org.irisa.diverse.videogen.videogenl.videoGen.VideoGen) o_cast.getVideoGen(),
						newState);
				firstValue_videoGen.setVideoGen(
						(videoGenTrace.States.videoGen.TracedVideoGen) ((videoGenTrace.States.videoGen.TracedVideoGen) exeToTraced
								.get(o_cast.getVideoGen())));
			} else {
				firstValue_videoGen.setVideoGen((videoGenTrace.States.videoGen.TracedVideoGen) null);
			}

			tracedObject.getVideoGenSequence().add(firstValue_videoGen);
			newState.getTransition_videoGen_Values().add(firstValue_videoGen);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(org.irisa.diverse.videogen.videogenl.videoGen.NamedElement o_cast,
			videoGenTrace.States.State newState) {

		if (o_cast instanceof org.irisa.diverse.videogen.videogenl.videoGen.Video) {
			addNewObjectToState((org.irisa.diverse.videogen.videogenl.videoGen.Video) o_cast, newState);
		} else if (o_cast instanceof org.irisa.diverse.videogen.videogenl.videoGen.Transition) {
			addNewObjectToState((org.irisa.diverse.videogen.videogenl.videoGen.Transition) o_cast, newState);
		} else if (o_cast instanceof org.irisa.diverse.videogen.videogenl.videoGen.VideoGen) {
			addNewObjectToState((org.irisa.diverse.videogen.videogenl.videoGen.VideoGen) o_cast, newState);
		}

	}// end addNewObjectToState

	private void addNewObjectToState(org.irisa.diverse.videogen.videogenl.videoGen.Optional o_cast,
			videoGenTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			videoGenTrace.States.videoGen.TracedOptional tracedObject = videoGenTrace.States.videoGen.VideoGenFactory.eINSTANCE
					.createTracedOptional();
			tracedObject.setOriginalObject((org.irisa.diverse.videogen.videogenl.videoGen.Optional) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getVideoGen_tracedOptionals().add(tracedObject);

			// Creation of the first value of the field callnextTransition
			videoGenTrace.States.Transition_callnextTransition_Value firstValue_callnextTransition = videoGenTrace.States.StatesFactory.eINSTANCE
					.createTransition_callnextTransition_Value();

			firstValue_callnextTransition.setCallnextTransition((java.lang.Boolean) o_cast.getCallnextTransition());
			tracedObject.getCallnextTransitionSequence().add(firstValue_callnextTransition);
			newState.getTransition_callnextTransition_Values().add(firstValue_callnextTransition);

			// Creation of the first value of the field executed
			videoGenTrace.States.Transition_executed_Value firstValue_executed = videoGenTrace.States.StatesFactory.eINSTANCE
					.createTransition_executed_Value();

			firstValue_executed.setExecuted((java.lang.Boolean) o_cast.getExecuted());
			tracedObject.getExecutedSequence().add(firstValue_executed);
			newState.getTransition_executed_Values().add(firstValue_executed);

			// Creation of the first value of the field videoGen
			videoGenTrace.States.Transition_videoGen_Value firstValue_videoGen = videoGenTrace.States.StatesFactory.eINSTANCE
					.createTransition_videoGen_Value();

			if (o_cast.getVideoGen() != null) {
				addNewObjectToState((org.irisa.diverse.videogen.videogenl.videoGen.VideoGen) o_cast.getVideoGen(),
						newState);
				firstValue_videoGen.setVideoGen(
						(videoGenTrace.States.videoGen.TracedVideoGen) ((videoGenTrace.States.videoGen.TracedVideoGen) exeToTraced
								.get(o_cast.getVideoGen())));
			} else {
				firstValue_videoGen.setVideoGen((videoGenTrace.States.videoGen.TracedVideoGen) null);
			}

			tracedObject.getVideoGenSequence().add(firstValue_videoGen);
			newState.getTransition_videoGen_Values().add(firstValue_videoGen);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(org.irisa.diverse.videogen.videogenl.videoGen.Sequence o_cast,
			videoGenTrace.States.State newState) {

		if (o_cast instanceof org.irisa.diverse.videogen.videogenl.videoGen.Optional) {
			addNewObjectToState((org.irisa.diverse.videogen.videogenl.videoGen.Optional) o_cast, newState);
		} else if (o_cast instanceof org.irisa.diverse.videogen.videogenl.videoGen.Mandatory) {
			addNewObjectToState((org.irisa.diverse.videogen.videogenl.videoGen.Mandatory) o_cast, newState);
		} else if (o_cast instanceof org.irisa.diverse.videogen.videogenl.videoGen.Alternatives) {
			addNewObjectToState((org.irisa.diverse.videogen.videogenl.videoGen.Alternatives) o_cast, newState);
		}

	}// end addNewObjectToState

	private void addNewObjectToState(org.irisa.diverse.videogen.videogenl.videoGen.Transition o_cast,
			videoGenTrace.States.State newState) {

		if (o_cast instanceof org.irisa.diverse.videogen.videogenl.videoGen.Initialize) {
			addNewObjectToState((org.irisa.diverse.videogen.videogenl.videoGen.Initialize) o_cast, newState);
		} else if (o_cast instanceof org.irisa.diverse.videogen.videogenl.videoGen.Sequence) {
			addNewObjectToState((org.irisa.diverse.videogen.videogenl.videoGen.Sequence) o_cast, newState);
		} else if (o_cast instanceof org.irisa.diverse.videogen.videogenl.videoGen.Generate) {
			addNewObjectToState((org.irisa.diverse.videogen.videogenl.videoGen.Generate) o_cast, newState);
		} else if (o_cast instanceof org.irisa.diverse.videogen.videogenl.videoGen.Delay) {
			addNewObjectToState((org.irisa.diverse.videogen.videogenl.videoGen.Delay) o_cast, newState);
		}

	}// end addNewObjectToState

	private void addNewObjectToState(org.irisa.diverse.videogen.videogenl.videoGen.Video o_cast,
			videoGenTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			videoGenTrace.States.videoGen.TracedVideo tracedObject = videoGenTrace.States.videoGen.VideoGenFactory.eINSTANCE
					.createTracedVideo();
			tracedObject.setOriginalObject((org.irisa.diverse.videogen.videogenl.videoGen.Video) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getVideoGen_tracedVideos().add(tracedObject);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private void addNewObjectToState(org.irisa.diverse.videogen.videogenl.videoGen.VideoGen o_cast,
			videoGenTrace.States.State newState) {

		if (!exeToTraced.containsKey(o_cast)) {
			videoGenTrace.States.videoGen.TracedVideoGen tracedObject = videoGenTrace.States.videoGen.VideoGenFactory.eINSTANCE
					.createTracedVideoGen();
			tracedObject.setOriginalObject((org.irisa.diverse.videogen.videogenl.videoGen.VideoGen) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getVideoGen_tracedVideoGens().add(tracedObject);

			// Creation of the first value of the field initialized
			videoGenTrace.States.VideoGen_initialized_Value firstValue_initialized = videoGenTrace.States.StatesFactory.eINSTANCE
					.createVideoGen_initialized_Value();

			firstValue_initialized.setInitialized((boolean) o_cast.isInitialized());
			tracedObject.getInitializedSequence().add(firstValue_initialized);
			newState.getVideoGen_initialized_Values().add(firstValue_initialized);

		} // end if (!exeToTraced.containsKey
	}// end addNewObjectToState

	private videoGenTrace.States.State copyState(videoGenTrace.States.State oldState) {
		videoGenTrace.States.State newState = videoGenTrace.States.StatesFactory.eINSTANCE.createState();
		newState.getTransition_callnextTransition_Values().addAll(oldState.getTransition_callnextTransition_Values());
		newState.getTransition_executed_Values().addAll(oldState.getTransition_executed_Values());
		newState.getVideoGen_initialized_Values().addAll(oldState.getVideoGen_initialized_Values());
		newState.getTransition_videoGen_Values().addAll(oldState.getTransition_videoGen_Values());
		return newState;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addState(List<org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange> changes) {
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
				// Here we must look at non-collection mutable fields
				// We must rollback the last values from the copied state, and add new values as well
				// ie. mix of remove and new
				if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) {
					stateChanged = true;

					org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange modelChange_cast = (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) modelChange;
					org.eclipse.emf.ecore.EStructuralFeature p = modelChange_cast.getChangedField();

					if (o instanceof org.irisa.diverse.videogen.videogenl.videoGen.Transition) {
						org.irisa.diverse.videogen.videogenl.videoGen.Transition o_cast = (org.irisa.diverse.videogen.videogenl.videoGen.Transition) o;

						if (p.getFeatureID() == org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage.eINSTANCE
								.getTransition_VideoGen().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							videoGenTrace.States.videoGen.TracedTransition traced = (videoGenTrace.States.videoGen.TracedTransition) exeToTraced
									.get(o);
							videoGenTrace.States.Transition_videoGen_Value lastValue = traced.getVideoGenSequence()
									.get(traced.getVideoGenSequence().size() - 1);
							newState.getTransition_videoGen_Values().remove(lastValue);

							// And we create a proper new value
							videoGenTrace.States.Transition_videoGen_Value newValue = videoGenTrace.States.StatesFactory.eINSTANCE
									.createTransition_videoGen_Value();

							videoGenTrace.States.videoGen.TracedVideoGen value = null;
							if (o_cast.getVideoGen() != null) {
								value = ((videoGenTrace.States.videoGen.TracedVideoGen) exeToTraced
										.get(o_cast.getVideoGen()));
							}

							newValue.setVideoGen((videoGenTrace.States.videoGen.TracedVideoGen) value);

							traced.getVideoGenSequence().add(newValue);
							newState.getTransition_videoGen_Values().add(newValue);
						} else

						if (p.getFeatureID() == org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage.eINSTANCE
								.getTransition_CallnextTransition().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							videoGenTrace.States.videoGen.TracedTransition traced = (videoGenTrace.States.videoGen.TracedTransition) exeToTraced
									.get(o);
							videoGenTrace.States.Transition_callnextTransition_Value lastValue = traced
									.getCallnextTransitionSequence()
									.get(traced.getCallnextTransitionSequence().size() - 1);
							newState.getTransition_callnextTransition_Values().remove(lastValue);

							// And we create a proper new value
							videoGenTrace.States.Transition_callnextTransition_Value newValue = videoGenTrace.States.StatesFactory.eINSTANCE
									.createTransition_callnextTransition_Value();

							java.lang.Boolean value = o_cast.getCallnextTransition();

							newValue.setCallnextTransition((java.lang.Boolean) value);

							traced.getCallnextTransitionSequence().add(newValue);
							newState.getTransition_callnextTransition_Values().add(newValue);
						} else

						if (p.getFeatureID() == org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage.eINSTANCE
								.getTransition_Executed().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							videoGenTrace.States.videoGen.TracedTransition traced = (videoGenTrace.States.videoGen.TracedTransition) exeToTraced
									.get(o);
							videoGenTrace.States.Transition_executed_Value lastValue = traced.getExecutedSequence()
									.get(traced.getExecutedSequence().size() - 1);
							newState.getTransition_executed_Values().remove(lastValue);

							// And we create a proper new value
							videoGenTrace.States.Transition_executed_Value newValue = videoGenTrace.States.StatesFactory.eINSTANCE
									.createTransition_executed_Value();

							java.lang.Boolean value = o_cast.getExecuted();

							newValue.setExecuted((java.lang.Boolean) value);

							traced.getExecutedSequence().add(newValue);
							newState.getTransition_executed_Values().add(newValue);
						}
					}

					if (o instanceof org.irisa.diverse.videogen.videogenl.videoGen.VideoGen) {
						org.irisa.diverse.videogen.videogenl.videoGen.VideoGen o_cast = (org.irisa.diverse.videogen.videogenl.videoGen.VideoGen) o;

						if (p.getFeatureID() == org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage.eINSTANCE
								.getVideoGen_Initialized().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							videoGenTrace.States.videoGen.TracedVideoGen traced = (videoGenTrace.States.videoGen.TracedVideoGen) exeToTraced
									.get(o);
							videoGenTrace.States.VideoGen_initialized_Value lastValue = traced.getInitializedSequence()
									.get(traced.getInitializedSequence().size() - 1);
							newState.getVideoGen_initialized_Values().remove(lastValue);

							// And we create a proper new value
							videoGenTrace.States.VideoGen_initialized_Value newValue = videoGenTrace.States.StatesFactory.eINSTANCE
									.createVideoGen_initialized_Value();

							boolean value = o_cast.isInitialized();

							newValue.setInitialized((boolean) value);

							traced.getInitializedSequence().add(newValue);
							newState.getVideoGen_initialized_Values().add(newValue);
						}
					}
				}
			}
			if (stateChanged) {
				final videoGenTrace.Steps.SpecificStep currentStep = context.peekFirst();
				if (currentStep != null && currentStep instanceof fr.inria.diverse.trace.commons.model.trace.BigStep) {
					final videoGenTrace.States.State startingState = lastState;
					final videoGenTrace.States.State endingState = newState;
					addImplicitStep(currentStep, startingState, endingState);
				}
				lastState = newState;
				traceRoot.getStatesTrace().add(lastState);
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addStep(fr.inria.diverse.trace.commons.model.trace.Step step) {
		videoGenTrace.Steps.SpecificStep step_cast = null;
		if (step != null && step instanceof videoGenTrace.Steps.SpecificStep) {
			step_cast = (videoGenTrace.Steps.SpecificStep) step;
			if (mseModel == null) {
				mseModel = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE.createMSEModel();
				traceResource.getContents().add(mseModel);
			}
			mseModel.getOwnedMSEs().add(step_cast.getMseoccurrence().getMse());

			// Creating generic (or almost generic) links
			videoGenTrace.States.State state = traceRoot.getStatesTrace().get(traceRoot.getStatesTrace().size() - 1);
			step_cast.setStartingState(state);
			if (!context.isEmpty() && context.getFirst() != null) {
				((SequentialStep<videoGenTrace.Steps.SpecificStep>) context.getFirst()).getSubSteps().add(step_cast);
			} else {
				traceRoot.getRootStep().getSubSteps().add(step_cast);
			}

			// Adding step in its dedicated sequence/dimension
			if (step_cast instanceof videoGenTrace.Steps.VideoGen_Alternatives_Execute) {
				videoGenTrace.Steps.VideoGen_Alternatives_Execute videoGen_Alternatives_ExecuteInstance = (videoGenTrace.Steps.VideoGen_Alternatives_Execute) step_cast;
				traceRoot.getVideoGen_Alternatives_Execute_Sequence().add(videoGen_Alternatives_ExecuteInstance);
			} else if (step_cast instanceof videoGenTrace.Steps.VideoGen_Generate_Execute) {
				videoGenTrace.Steps.VideoGen_Generate_Execute videoGen_Generate_ExecuteInstance = (videoGenTrace.Steps.VideoGen_Generate_Execute) step_cast;
				traceRoot.getVideoGen_Generate_Execute_Sequence().add(videoGen_Generate_ExecuteInstance);
			} else if (step_cast instanceof videoGenTrace.Steps.VideoGen_Initialize_Execute) {
				videoGenTrace.Steps.VideoGen_Initialize_Execute videoGen_Initialize_ExecuteInstance = (videoGenTrace.Steps.VideoGen_Initialize_Execute) step_cast;
				traceRoot.getVideoGen_Initialize_Execute_Sequence().add(videoGen_Initialize_ExecuteInstance);
			} else if (step_cast instanceof videoGenTrace.Steps.VideoGen_Mandatory_Execute) {
				videoGenTrace.Steps.VideoGen_Mandatory_Execute videoGen_Mandatory_ExecuteInstance = (videoGenTrace.Steps.VideoGen_Mandatory_Execute) step_cast;
				traceRoot.getVideoGen_Mandatory_Execute_Sequence().add(videoGen_Mandatory_ExecuteInstance);
			} else if (step_cast instanceof videoGenTrace.Steps.VideoGen_Optional_Execute) {
				videoGenTrace.Steps.VideoGen_Optional_Execute videoGen_Optional_ExecuteInstance = (videoGenTrace.Steps.VideoGen_Optional_Execute) step_cast;
				traceRoot.getVideoGen_Optional_Execute_Sequence().add(videoGen_Optional_ExecuteInstance);
			} else if (step_cast instanceof videoGenTrace.Steps.VideoGen_Video_Setup) {
				videoGenTrace.Steps.VideoGen_Video_Setup videoGen_Video_SetupInstance = (videoGenTrace.Steps.VideoGen_Video_Setup) step_cast;
				traceRoot.getVideoGen_Video_Setup_Sequence().add(videoGen_Video_SetupInstance);
			} else if (step_cast instanceof videoGenTrace.Steps.VideoGen_VideoGen_Setup) {
				videoGenTrace.Steps.VideoGen_VideoGen_Setup videoGen_VideoGen_SetupInstance = (videoGenTrace.Steps.VideoGen_VideoGen_Setup) step_cast;
				traceRoot.getVideoGen_VideoGen_Setup_Sequence().add(videoGen_VideoGen_SetupInstance);
			}
		}
		context.push(step_cast);
	}

	@SuppressWarnings("unchecked")
	private void addImplicitStep(videoGenTrace.Steps.SpecificStep currentStep, videoGenTrace.States.State startingState,
			videoGenTrace.States.State endingState) {

		videoGenTrace.Steps.SpecificStep implicitStep = null;
		if (currentStep instanceof videoGenTrace.Steps.VideoGen_Alternatives_Execute) {
			implicitStep = videoGenTrace.Steps.StepsFactory.eINSTANCE
					.createVideoGen_Alternatives_Execute_ImplicitStep();
		} else if (currentStep instanceof videoGenTrace.Steps.VideoGen_Generate_Execute) {
			implicitStep = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_Generate_Execute_ImplicitStep();
		} else if (currentStep instanceof videoGenTrace.Steps.VideoGen_Initialize_Execute) {
			implicitStep = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_Initialize_Execute_ImplicitStep();
		} else if (currentStep instanceof videoGenTrace.Steps.VideoGen_Mandatory_Execute) {
			implicitStep = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_Mandatory_Execute_ImplicitStep();
		} else if (currentStep instanceof videoGenTrace.Steps.VideoGen_Optional_Execute) {
			implicitStep = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_Optional_Execute_ImplicitStep();
		} else if (currentStep instanceof videoGenTrace.Steps.VideoGen_VideoGen_Setup) {
			implicitStep = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_VideoGen_Setup_ImplicitStep();
		}
		if (implicitStep != null) {
			implicitStep.setStartingState(startingState);
			implicitStep.setEndingState(endingState);
			((SequentialStep<videoGenTrace.Steps.SpecificStep>) currentStep).getSubSteps().add(implicitStep);

		}
	}

	@Override
	public void endStep(fr.inria.diverse.trace.commons.model.trace.Step step) {
		videoGenTrace.Steps.SpecificStep popped = context.pop();
		if (popped != null)
			popped.setEndingState(lastState);
	}

	@Override
	public EObject initTrace(LaunchConfiguration launchConfiguration) {
		// Create root
		traceRoot = videoGenTrace.VideoGenTraceFactory.eINSTANCE.createSpecificTrace();
		traceRoot.setLaunchconfiguration(launchConfiguration);

		// Create root sequential step
		fr.inria.diverse.trace.commons.model.trace.SequentialStep<videoGenTrace.Steps.SpecificStep> rootStep = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE
				.createSequentialStep();
		traceRoot.setRootStep(rootStep);

		// Put in the resource
		traceResource.getContents().add(traceRoot);

		return traceRoot;
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
	public void save(URI uri) {
		try {
			traceResource.setURI(uri);
			traceResource.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	private Set<Resource> getAllExecutedModelResources() {
		Set<Resource> allResources = new HashSet<>();
		allResources.add(executedModel);
		allResources.addAll(org.gemoc.commons.eclipse.emf.EMFResource.getRelatedResources(executedModel));
		return allResources;
	}

	@Override
	public boolean isPartialTraceConstructor() {
		return false;
	}
}

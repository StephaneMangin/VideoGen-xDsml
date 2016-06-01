package org.irisa.diverse.videogen.videogenl.trace.tracemanager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.gemoc.executionframework.engine.mse.LaunchConfiguration;
import org.gemoc.executionframework.engine.mse.MSEModel;
import org.gemoc.executionframework.engine.mse.SequentialStep;

import fr.inria.diverse.trace.gemoc.api.ITraceConstructor;

public class VideoGenTraceConstructor implements ITraceConstructor {
	private videoGenTrace.SpecificTrace traceRoot;
	private MSEModel mseModel;
	private Resource executedModel;
	private final Map<EObject, EObject> exeToTraced;

	private videoGenTrace.States.State lastState;

	private Resource traceResource;
	private Deque<videoGenTrace.Steps.SpecificStep> context = new LinkedList<videoGenTrace.Steps.SpecificStep>();

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
				}
			}
			this.traceRoot.getStatesTrace().add(lastState);
		}
	}

	private videoGenTrace.States.State copyState(videoGenTrace.States.State oldState) {
		videoGenTrace.States.State newState = videoGenTrace.States.StatesFactory.eINSTANCE.createState();
		return newState;
	}

	@SuppressWarnings("unchecked")
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
				final videoGenTrace.Steps.SpecificStep currentStep = context.peekFirst();
				if (currentStep != null && currentStep instanceof org.gemoc.executionframework.engine.mse.BigStep) {
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
	public void addStep(org.gemoc.executionframework.engine.mse.Step step) {
		videoGenTrace.Steps.SpecificStep step_cast = null;
		if (step != null && step instanceof videoGenTrace.Steps.SpecificStep) {
			step_cast = (videoGenTrace.Steps.SpecificStep) step;
			if (mseModel == null) {
				mseModel = org.gemoc.executionframework.engine.mse.MseFactory.eINSTANCE.createMSEModel();
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
			} else if (step_cast instanceof videoGenTrace.Steps.VideoGen_Sequence_Execute) {
				videoGenTrace.Steps.VideoGen_Sequence_Execute videoGen_Sequence_ExecuteInstance = (videoGenTrace.Steps.VideoGen_Sequence_Execute) step_cast;
				traceRoot.getVideoGen_Sequence_Execute_Sequence().add(videoGen_Sequence_ExecuteInstance);
			} else if (step_cast instanceof videoGenTrace.Steps.VideoGen_Transition_Execute) {
				videoGenTrace.Steps.VideoGen_Transition_Execute videoGen_Transition_ExecuteInstance = (videoGenTrace.Steps.VideoGen_Transition_Execute) step_cast;
				traceRoot.getVideoGen_Transition_Execute_Sequence().add(videoGen_Transition_ExecuteInstance);
			} else if (step_cast instanceof videoGenTrace.Steps.VideoGen_Transition_FinishExecute) {
				videoGenTrace.Steps.VideoGen_Transition_FinishExecute videoGen_Transition_FinishExecuteInstance = (videoGenTrace.Steps.VideoGen_Transition_FinishExecute) step_cast;
				traceRoot.getVideoGen_Transition_FinishExecute_Sequence()
						.add(videoGen_Transition_FinishExecuteInstance);
			} else if (step_cast instanceof videoGenTrace.Steps.VideoGen_Video_Select) {
				videoGenTrace.Steps.VideoGen_Video_Select videoGen_Video_SelectInstance = (videoGenTrace.Steps.VideoGen_Video_Select) step_cast;
				traceRoot.getVideoGen_Video_Select_Sequence().add(videoGen_Video_SelectInstance);
			} else if (step_cast instanceof videoGenTrace.Steps.VideoGen_VideoGen_Compute) {
				videoGenTrace.Steps.VideoGen_VideoGen_Compute videoGen_VideoGen_ComputeInstance = (videoGenTrace.Steps.VideoGen_VideoGen_Compute) step_cast;
				traceRoot.getVideoGen_VideoGen_Compute_Sequence().add(videoGen_VideoGen_ComputeInstance);
			} else if (step_cast instanceof videoGenTrace.Steps.VideoGen_VideoGen_Execute) {
				videoGenTrace.Steps.VideoGen_VideoGen_Execute videoGen_VideoGen_ExecuteInstance = (videoGenTrace.Steps.VideoGen_VideoGen_Execute) step_cast;
				traceRoot.getVideoGen_VideoGen_Execute_Sequence().add(videoGen_VideoGen_ExecuteInstance);
			} else if (step_cast instanceof videoGenTrace.Steps.VideoGen_VideoGen_InitializeModel) {
				videoGenTrace.Steps.VideoGen_VideoGen_InitializeModel videoGen_VideoGen_InitializeModelInstance = (videoGenTrace.Steps.VideoGen_VideoGen_InitializeModel) step_cast;
				traceRoot.getVideoGen_VideoGen_InitializeModel_Sequence()
						.add(videoGen_VideoGen_InitializeModelInstance);
			} else if (step_cast instanceof videoGenTrace.Steps.VideoGen_VideoGen_Setup) {
				videoGenTrace.Steps.VideoGen_VideoGen_Setup videoGen_VideoGen_SetupInstance = (videoGenTrace.Steps.VideoGen_VideoGen_Setup) step_cast;
				traceRoot.getVideoGen_VideoGen_Setup_Sequence().add(videoGen_VideoGen_SetupInstance);
			}
		}
		context.push(step_cast);
	}

	@SuppressWarnings("unchecked")
	private void addImplicitStep(videoGenTrace.Steps.SpecificStep currentStep,
			videoGenTrace.States.State startingState, videoGenTrace.States.State endingState) {

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
		} else if (currentStep instanceof videoGenTrace.Steps.VideoGen_Sequence_Execute) {
			implicitStep = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_Sequence_Execute_ImplicitStep();
		} else if (currentStep instanceof videoGenTrace.Steps.VideoGen_Transition_Execute) {
			implicitStep = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_Transition_Execute_ImplicitStep();
		} else if (currentStep instanceof videoGenTrace.Steps.VideoGen_Transition_FinishExecute) {
			implicitStep = videoGenTrace.Steps.StepsFactory.eINSTANCE
					.createVideoGen_Transition_FinishExecute_ImplicitStep();
		} else if (currentStep instanceof videoGenTrace.Steps.VideoGen_VideoGen_Execute) {
			implicitStep = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_VideoGen_Execute_ImplicitStep();
		} else if (currentStep instanceof videoGenTrace.Steps.VideoGen_VideoGen_InitializeModel) {
			implicitStep = videoGenTrace.Steps.StepsFactory.eINSTANCE
					.createVideoGen_VideoGen_InitializeModel_ImplicitStep();
		}
		if (implicitStep != null) {
			implicitStep.setStartingState(startingState);
			implicitStep.setEndingState(endingState);
			((SequentialStep<videoGenTrace.Steps.SpecificStep>) currentStep).getSubSteps().add(implicitStep);

		}
	}

	@Override
	public void endStep(org.gemoc.executionframework.engine.mse.Step step) {
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
		org.gemoc.executionframework.engine.mse.SequentialStep<videoGenTrace.Steps.SpecificStep> rootStep = org.gemoc.executionframework.engine.mse.MseFactory.eINSTANCE
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

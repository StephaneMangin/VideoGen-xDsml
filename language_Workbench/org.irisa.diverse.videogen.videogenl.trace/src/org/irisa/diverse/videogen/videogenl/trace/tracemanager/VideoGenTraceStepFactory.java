package org.irisa.diverse.videogen.videogenl.trace.tracemanager;

import java.util.List;
import fr.inria.diverse.trace.gemoc.api.IStepFactory;

public class VideoGenTraceStepFactory implements IStepFactory {

	@Override
	public org.gemoc.executionframework.engine.mse.Step createStep(org.gemoc.executionframework.engine.mse.MSE mse,
			List<Object> parameters, List<Object> result) {

		String stepRule = fr.inria.diverse.trace.commons.EcoreCraftingUtil.getFQN(mse.getCaller().eClass(), ".") + "."
				+ mse.getAction().getName();
		org.gemoc.executionframework.engine.mse.Step step = null;

		if (stepRule.equalsIgnoreCase("videoGen.Alternatives.execute")) {
			step = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_Alternatives_Execute();
		} else

		if (stepRule.equalsIgnoreCase("videoGen.Delay.execute")) {
			step = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_Delay_Execute();
		} else

		if (stepRule.equalsIgnoreCase("videoGen.Generate.compute")) {
			step = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_Generate_Compute();
		} else

		if (stepRule.equalsIgnoreCase("videoGen.Generate.execute")) {
			step = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_Generate_Execute();
		} else

		if (stepRule.equalsIgnoreCase("videoGen.Initialize.execute")) {
			step = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_Initialize_Execute();
		} else

		if (stepRule.equalsIgnoreCase("videoGen.Mandatory.execute")) {
			step = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_Mandatory_Execute();
		} else

		if (stepRule.equalsIgnoreCase("videoGen.Optional.execute")) {
			step = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_Optional_Execute();
		} else

		if (stepRule.equalsIgnoreCase("videoGen.Alternatives.execute")
				|| stepRule.equalsIgnoreCase("videoGen.Mandatory.execute")
				|| stepRule.equalsIgnoreCase("videoGen.Optional.execute")
				|| stepRule.equalsIgnoreCase("videoGen.Sequence.execute")) {
			step = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_Sequence_Execute();
		} else

		if (stepRule.equalsIgnoreCase("videoGen.Alternatives.execute")
				|| stepRule.equalsIgnoreCase("videoGen.Delay.execute")
				|| stepRule.equalsIgnoreCase("videoGen.Generate.execute")
				|| stepRule.equalsIgnoreCase("videoGen.Initialize.execute")
				|| stepRule.equalsIgnoreCase("videoGen.Mandatory.execute")
				|| stepRule.equalsIgnoreCase("videoGen.Optional.execute")
				|| stepRule.equalsIgnoreCase("videoGen.Sequence.execute")
				|| stepRule.equalsIgnoreCase("videoGen.Transition.execute")) {
			step = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_Transition_Execute();
		} else

		if (stepRule.equalsIgnoreCase("videoGen.Video.select")) {
			step = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_Video_Select();
		} else

		if (stepRule.equalsIgnoreCase("videoGen.VideoGen.compute")) {
			step = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_VideoGen_Compute();
		} else

		if (stepRule.equalsIgnoreCase("videoGen.VideoGen.execute")) {
			step = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_VideoGen_Execute();
		} else

		if (stepRule.equalsIgnoreCase("videoGen.VideoGen.setup")) {
			step = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_VideoGen_Setup();
		}

		else {
			step = org.gemoc.executionframework.engine.mse.MseFactory.eINSTANCE.createGenericSequentialStep();
		}

		org.gemoc.executionframework.engine.mse.MSEOccurrence mseocc = org.gemoc.executionframework.engine.mse.MseFactory.eINSTANCE
				.createMSEOccurrence();
		mseocc.setMse(mse);
		mseocc.getParameters().addAll(parameters);
		mseocc.getResult().addAll(result);
		step.setMseoccurrence(mseocc);

		return step;
	}
}

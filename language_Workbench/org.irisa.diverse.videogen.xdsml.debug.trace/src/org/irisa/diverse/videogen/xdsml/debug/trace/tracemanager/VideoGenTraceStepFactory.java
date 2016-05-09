
package org.irisa.diverse.videogen.xdsml.debug.trace.tracemanager;

import java.util.List;
import fr.inria.diverse.trace.gemoc.api.IStepFactory;

public class VideoGenTraceStepFactory implements IStepFactory {

	@Override
	public org.gemoc.executionframework.engine.mse.SequentialLogicalStep createSequentialLogicalStep(
			org.gemoc.executionframework.engine.mse.MSE mse, List<Object> parameters, List<Object> result) {

		String stepRule = fr.inria.diverse.trace.commons.EcoreCraftingUtil.getFQN(mse.getCaller().eClass(), ".") + "."
				+ mse.getAction().getName();
		org.gemoc.executionframework.engine.mse.SequentialLogicalStep mseocc = null;

		if (stepRule.equalsIgnoreCase("videoGen.Alternatives.execute")) {
			mseocc = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_Alternatives_Execute();
		} else

		if (stepRule.equalsIgnoreCase("videoGen.Delay.execute")) {
			mseocc = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_Delay_Execute();
		} else

		if (stepRule.equalsIgnoreCase("videoGen.Generate.compute")) {
			mseocc = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_Generate_Compute();
		} else

		if (stepRule.equalsIgnoreCase("videoGen.Generate.execute")) {
			mseocc = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_Generate_Execute();
		} else

		if (stepRule.equalsIgnoreCase("videoGen.Initialize.execute")) {
			mseocc = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_Initialize_Execute();
		} else

		if (stepRule.equalsIgnoreCase("videoGen.Mandatory.execute")) {
			mseocc = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_Mandatory_Execute();
		} else

		if (stepRule.equalsIgnoreCase("videoGen.Optional.execute")) {
			mseocc = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_Optional_Execute();
		} else

		if (stepRule.equalsIgnoreCase("videoGen.Alternatives.execute")
				|| stepRule.equalsIgnoreCase("videoGen.Mandatory.execute")
				|| stepRule.equalsIgnoreCase("videoGen.Optional.execute")
				|| stepRule.equalsIgnoreCase("videoGen.Sequence.execute")) {
			mseocc = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_Sequence_Execute();
		} else

		if (stepRule.equalsIgnoreCase("videoGen.Alternatives.execute")
				|| stepRule.equalsIgnoreCase("videoGen.Delay.execute")
				|| stepRule.equalsIgnoreCase("videoGen.Generate.execute")
				|| stepRule.equalsIgnoreCase("videoGen.Initialize.execute")
				|| stepRule.equalsIgnoreCase("videoGen.Mandatory.execute")
				|| stepRule.equalsIgnoreCase("videoGen.Optional.execute")
				|| stepRule.equalsIgnoreCase("videoGen.Sequence.execute")
				|| stepRule.equalsIgnoreCase("videoGen.Transition.execute")) {
			mseocc = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_Transition_Execute();
		} else

		if (stepRule.equalsIgnoreCase("videoGen.Video.select")) {
			mseocc = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_Video_Select();
		}

		else
			mseocc = org.gemoc.executionframework.engine.mse.MseFactory.eINSTANCE.createSequentialLogicalStep();

		if (mseocc != null) {
			mseocc.setMse(mse);
			mseocc.getParameters().addAll(parameters);
			mseocc.getResult().addAll(result);
		}
		return mseocc;
	}
}

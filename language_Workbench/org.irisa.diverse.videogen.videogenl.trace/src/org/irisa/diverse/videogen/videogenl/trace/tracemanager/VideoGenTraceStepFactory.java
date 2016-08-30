
package org.irisa.diverse.videogen.videogenl.trace.tracemanager;

import java.util.List;
import fr.inria.diverse.trace.gemoc.api.IStepFactory;

public class VideoGenTraceStepFactory implements IStepFactory {

	@Override
	public fr.inria.diverse.trace.commons.model.trace.Step createStep(
			fr.inria.diverse.trace.commons.model.trace.MSE mse, List<Object> parameters, List<Object> result) {

		fr.inria.diverse.trace.commons.model.trace.Step step = null;
		org.eclipse.emf.ecore.EClass ec = mse.getCaller().eClass();
		String stepRule = fr.inria.diverse.trace.commons.EcoreCraftingUtil.getFQN(ec, ".") + "."
				+ mse.getAction().getName();

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage.eINSTANCE
						.getAlternatives().getClassifierID()))

		{
			step = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_Alternatives_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage.eINSTANCE
						.getGenerate().getClassifierID()))

		{
			step = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_Generate_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage.eINSTANCE
						.getInitialize().getClassifierID()))

		{
			step = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_Initialize_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage.eINSTANCE
						.getMandatory().getClassifierID()))

		{
			step = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_Mandatory_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage.eINSTANCE
						.getOptional().getClassifierID()))

		{
			step = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_Optional_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("setup")
				&& (ec.getClassifierID() == org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage.eINSTANCE
						.getVideo().getClassifierID()))

		{
			step = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_Video_Setup();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("setup")
				&& (ec.getClassifierID() == org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage.eINSTANCE
						.getVideoGen().getClassifierID()))

		{
			step = videoGenTrace.Steps.StepsFactory.eINSTANCE.createVideoGen_VideoGen_Setup();
		}

		else {
			step = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE.createGenericSequentialStep();
		}

		fr.inria.diverse.trace.commons.model.trace.MSEOccurrence mseocc = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE
				.createMSEOccurrence();
		mseocc.setMse(mse);
		mseocc.getParameters().addAll(parameters);
		mseocc.getResult().addAll(result);
		step.setMseoccurrence(mseocc);

		return step;
	}
}

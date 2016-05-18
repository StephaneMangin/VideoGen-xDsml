/**
 */
package videoGenTrace.Steps.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.irisa.diverse.videogen.videoGen.Generate;

import videoGenTrace.Steps.StepsPackage;
import videoGenTrace.Steps.VideoGen_Generate_Compute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Video Gen Generate Compute</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class VideoGen_Generate_ComputeImpl extends SmallStepImpl implements VideoGen_Generate_Compute {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoGen_Generate_ComputeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.VIDEO_GEN_GENERATE_COMPUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generate getCaller() {
		return (org.irisa.diverse.videogen.videoGen.Generate) this.getMse().getCaller();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case StepsPackage.VIDEO_GEN_GENERATE_COMPUTE___GET_CALLER:
				return getCaller();
		}
		return super.eInvoke(operationID, arguments);
	}

} //VideoGen_Generate_ComputeImpl

/**
 */
package videoGenTrace.Steps.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.irisa.diverse.videogen.videoGen.Transition;

import videoGenTrace.Steps.StepsPackage;
import videoGenTrace.Steps.VideoGen_Transition_Execute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Video Gen Transition Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class VideoGen_Transition_ExecuteImpl extends SmallStepImpl implements VideoGen_Transition_Execute {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoGen_Transition_ExecuteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.VIDEO_GEN_TRANSITION_EXECUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getCaller() {
		return (org.irisa.diverse.videogen.videoGen.Transition) this.getMse().getCaller();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case StepsPackage.VIDEO_GEN_TRANSITION_EXECUTE___GET_CALLER:
				return getCaller();
		}
		return super.eInvoke(operationID, arguments);
	}

} //VideoGen_Transition_ExecuteImpl

/**
 */
package videoGenTrace.Steps.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.irisa.diverse.videogen.videoGen.Optional;

import videoGenTrace.Steps.StepsPackage;
import videoGenTrace.Steps.VideoGen_Optional_Execute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Video Gen Optional Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class VideoGen_Optional_ExecuteImpl extends SmallStepImpl implements VideoGen_Optional_Execute {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoGen_Optional_ExecuteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.VIDEO_GEN_OPTIONAL_EXECUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Optional getCaller() {
		return (org.irisa.diverse.videogen.videoGen.Optional) this.getMse().getCaller();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case StepsPackage.VIDEO_GEN_OPTIONAL_EXECUTE___GET_CALLER:
				return getCaller();
		}
		return super.eInvoke(operationID, arguments);
	}

} //VideoGen_Optional_ExecuteImpl

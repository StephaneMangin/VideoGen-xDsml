/**
 */
package videoGenTrace.Steps.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.irisa.diverse.videogen.videoGen.Alternatives;

import videoGenTrace.Steps.StepsPackage;
import videoGenTrace.Steps.VideoGen_Alternatives_Execute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Video Gen Alternatives Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class VideoGen_Alternatives_ExecuteImpl extends SmallStepImpl implements VideoGen_Alternatives_Execute {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoGen_Alternatives_ExecuteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.VIDEO_GEN_ALTERNATIVES_EXECUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alternatives getCaller() {
		return (org.irisa.diverse.videogen.videoGen.Alternatives) this.getMse().getCaller();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case StepsPackage.VIDEO_GEN_ALTERNATIVES_EXECUTE___GET_CALLER:
				return getCaller();
		}
		return super.eInvoke(operationID, arguments);
	}

} //VideoGen_Alternatives_ExecuteImpl

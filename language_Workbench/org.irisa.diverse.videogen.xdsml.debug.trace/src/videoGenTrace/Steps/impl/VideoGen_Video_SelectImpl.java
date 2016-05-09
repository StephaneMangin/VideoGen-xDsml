/**
 */
package videoGenTrace.Steps.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.irisa.diverse.videogen.videoGen.Video;

import videoGenTrace.Steps.StepsPackage;
import videoGenTrace.Steps.VideoGen_Video_Select;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Video Gen Video Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class VideoGen_Video_SelectImpl extends SmallStepImpl implements VideoGen_Video_Select {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoGen_Video_SelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.VIDEO_GEN_VIDEO_SELECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Video getCaller() {
		return (org.irisa.diverse.videogen.videoGen.Video) this.getMse().getCaller();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case StepsPackage.VIDEO_GEN_VIDEO_SELECT___GET_CALLER:
				return getCaller();
		}
		return super.eInvoke(operationID, arguments);
	}

} //VideoGen_Video_SelectImpl

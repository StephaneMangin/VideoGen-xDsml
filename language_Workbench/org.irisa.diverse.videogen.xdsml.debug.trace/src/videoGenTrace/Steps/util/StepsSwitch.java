/**
 */
package videoGenTrace.Steps.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gemoc.executionframework.engine.mse.LogicalStep;
import org.gemoc.executionframework.engine.mse.MSEOccurrence;
import org.gemoc.executionframework.engine.mse.SequentialLogicalStep;

import videoGenTrace.Steps.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see videoGenTrace.Steps.StepsPackage
 * @generated
 */
public class StepsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StepsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsSwitch() {
		if (modelPackage == null) {
			modelPackage = StepsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StepsPackage.BIG_STEP: {
				BigStep bigStep = (BigStep)theEObject;
				T result = caseBigStep(bigStep);
				if (result == null) result = caseStep(bigStep);
				if (result == null) result = caseSequentialLogicalStep(bigStep);
				if (result == null) result = caseMSEOccurrence(bigStep);
				if (result == null) result = caseLogicalStep(bigStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ROOT_IMPLICIT_STEP: {
				RootImplicitStep rootImplicitStep = (RootImplicitStep)theEObject;
				T result = caseRootImplicitStep(rootImplicitStep);
				if (result == null) result = caseSmallStep(rootImplicitStep);
				if (result == null) result = caseStep(rootImplicitStep);
				if (result == null) result = caseSequentialLogicalStep(rootImplicitStep);
				if (result == null) result = caseMSEOccurrence(rootImplicitStep);
				if (result == null) result = caseLogicalStep(rootImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.SMALL_STEP: {
				SmallStep smallStep = (SmallStep)theEObject;
				T result = caseSmallStep(smallStep);
				if (result == null) result = caseStep(smallStep);
				if (result == null) result = caseSequentialLogicalStep(smallStep);
				if (result == null) result = caseMSEOccurrence(smallStep);
				if (result == null) result = caseLogicalStep(smallStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.STEP: {
				Step step = (Step)theEObject;
				T result = caseStep(step);
				if (result == null) result = caseSequentialLogicalStep(step);
				if (result == null) result = caseMSEOccurrence(step);
				if (result == null) result = caseLogicalStep(step);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.VIDEO_GEN_ALTERNATIVES_EXECUTE: {
				VideoGen_Alternatives_Execute videoGen_Alternatives_Execute = (VideoGen_Alternatives_Execute)theEObject;
				T result = caseVideoGen_Alternatives_Execute(videoGen_Alternatives_Execute);
				if (result == null) result = caseSmallStep(videoGen_Alternatives_Execute);
				if (result == null) result = caseStep(videoGen_Alternatives_Execute);
				if (result == null) result = caseSequentialLogicalStep(videoGen_Alternatives_Execute);
				if (result == null) result = caseMSEOccurrence(videoGen_Alternatives_Execute);
				if (result == null) result = caseLogicalStep(videoGen_Alternatives_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.VIDEO_GEN_DELAY_EXECUTE: {
				VideoGen_Delay_Execute videoGen_Delay_Execute = (VideoGen_Delay_Execute)theEObject;
				T result = caseVideoGen_Delay_Execute(videoGen_Delay_Execute);
				if (result == null) result = caseSmallStep(videoGen_Delay_Execute);
				if (result == null) result = caseStep(videoGen_Delay_Execute);
				if (result == null) result = caseSequentialLogicalStep(videoGen_Delay_Execute);
				if (result == null) result = caseMSEOccurrence(videoGen_Delay_Execute);
				if (result == null) result = caseLogicalStep(videoGen_Delay_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.VIDEO_GEN_GENERATE_COMPUTE: {
				VideoGen_Generate_Compute videoGen_Generate_Compute = (VideoGen_Generate_Compute)theEObject;
				T result = caseVideoGen_Generate_Compute(videoGen_Generate_Compute);
				if (result == null) result = caseSmallStep(videoGen_Generate_Compute);
				if (result == null) result = caseStep(videoGen_Generate_Compute);
				if (result == null) result = caseSequentialLogicalStep(videoGen_Generate_Compute);
				if (result == null) result = caseMSEOccurrence(videoGen_Generate_Compute);
				if (result == null) result = caseLogicalStep(videoGen_Generate_Compute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.VIDEO_GEN_GENERATE_EXECUTE: {
				VideoGen_Generate_Execute videoGen_Generate_Execute = (VideoGen_Generate_Execute)theEObject;
				T result = caseVideoGen_Generate_Execute(videoGen_Generate_Execute);
				if (result == null) result = caseSmallStep(videoGen_Generate_Execute);
				if (result == null) result = caseStep(videoGen_Generate_Execute);
				if (result == null) result = caseSequentialLogicalStep(videoGen_Generate_Execute);
				if (result == null) result = caseMSEOccurrence(videoGen_Generate_Execute);
				if (result == null) result = caseLogicalStep(videoGen_Generate_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.VIDEO_GEN_INITIALIZE_EXECUTE: {
				VideoGen_Initialize_Execute videoGen_Initialize_Execute = (VideoGen_Initialize_Execute)theEObject;
				T result = caseVideoGen_Initialize_Execute(videoGen_Initialize_Execute);
				if (result == null) result = caseSmallStep(videoGen_Initialize_Execute);
				if (result == null) result = caseStep(videoGen_Initialize_Execute);
				if (result == null) result = caseSequentialLogicalStep(videoGen_Initialize_Execute);
				if (result == null) result = caseMSEOccurrence(videoGen_Initialize_Execute);
				if (result == null) result = caseLogicalStep(videoGen_Initialize_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.VIDEO_GEN_MANDATORY_EXECUTE: {
				VideoGen_Mandatory_Execute videoGen_Mandatory_Execute = (VideoGen_Mandatory_Execute)theEObject;
				T result = caseVideoGen_Mandatory_Execute(videoGen_Mandatory_Execute);
				if (result == null) result = caseSmallStep(videoGen_Mandatory_Execute);
				if (result == null) result = caseStep(videoGen_Mandatory_Execute);
				if (result == null) result = caseSequentialLogicalStep(videoGen_Mandatory_Execute);
				if (result == null) result = caseMSEOccurrence(videoGen_Mandatory_Execute);
				if (result == null) result = caseLogicalStep(videoGen_Mandatory_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.VIDEO_GEN_OPTIONAL_EXECUTE: {
				VideoGen_Optional_Execute videoGen_Optional_Execute = (VideoGen_Optional_Execute)theEObject;
				T result = caseVideoGen_Optional_Execute(videoGen_Optional_Execute);
				if (result == null) result = caseSmallStep(videoGen_Optional_Execute);
				if (result == null) result = caseStep(videoGen_Optional_Execute);
				if (result == null) result = caseSequentialLogicalStep(videoGen_Optional_Execute);
				if (result == null) result = caseMSEOccurrence(videoGen_Optional_Execute);
				if (result == null) result = caseLogicalStep(videoGen_Optional_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.VIDEO_GEN_SEQUENCE_EXECUTE: {
				VideoGen_Sequence_Execute videoGen_Sequence_Execute = (VideoGen_Sequence_Execute)theEObject;
				T result = caseVideoGen_Sequence_Execute(videoGen_Sequence_Execute);
				if (result == null) result = caseSmallStep(videoGen_Sequence_Execute);
				if (result == null) result = caseStep(videoGen_Sequence_Execute);
				if (result == null) result = caseSequentialLogicalStep(videoGen_Sequence_Execute);
				if (result == null) result = caseMSEOccurrence(videoGen_Sequence_Execute);
				if (result == null) result = caseLogicalStep(videoGen_Sequence_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.VIDEO_GEN_TRANSITION_EXECUTE: {
				VideoGen_Transition_Execute videoGen_Transition_Execute = (VideoGen_Transition_Execute)theEObject;
				T result = caseVideoGen_Transition_Execute(videoGen_Transition_Execute);
				if (result == null) result = caseSmallStep(videoGen_Transition_Execute);
				if (result == null) result = caseStep(videoGen_Transition_Execute);
				if (result == null) result = caseSequentialLogicalStep(videoGen_Transition_Execute);
				if (result == null) result = caseMSEOccurrence(videoGen_Transition_Execute);
				if (result == null) result = caseLogicalStep(videoGen_Transition_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.VIDEO_GEN_VIDEO_SELECT: {
				VideoGen_Video_Select videoGen_Video_Select = (VideoGen_Video_Select)theEObject;
				T result = caseVideoGen_Video_Select(videoGen_Video_Select);
				if (result == null) result = caseSmallStep(videoGen_Video_Select);
				if (result == null) result = caseStep(videoGen_Video_Select);
				if (result == null) result = caseSequentialLogicalStep(videoGen_Video_Select);
				if (result == null) result = caseMSEOccurrence(videoGen_Video_Select);
				if (result == null) result = caseLogicalStep(videoGen_Video_Select);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Big Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Big Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBigStep(BigStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootImplicitStep(RootImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Small Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Small Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmallStep(SmallStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video Gen Alternatives Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video Gen Alternatives Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoGen_Alternatives_Execute(VideoGen_Alternatives_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video Gen Delay Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video Gen Delay Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoGen_Delay_Execute(VideoGen_Delay_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video Gen Generate Compute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video Gen Generate Compute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoGen_Generate_Compute(VideoGen_Generate_Compute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video Gen Generate Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video Gen Generate Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoGen_Generate_Execute(VideoGen_Generate_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video Gen Initialize Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video Gen Initialize Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoGen_Initialize_Execute(VideoGen_Initialize_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video Gen Mandatory Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video Gen Mandatory Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoGen_Mandatory_Execute(VideoGen_Mandatory_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video Gen Optional Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video Gen Optional Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoGen_Optional_Execute(VideoGen_Optional_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video Gen Sequence Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video Gen Sequence Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoGen_Sequence_Execute(VideoGen_Sequence_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video Gen Transition Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video Gen Transition Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoGen_Transition_Execute(VideoGen_Transition_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video Gen Video Select</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video Gen Video Select</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoGen_Video_Select(VideoGen_Video_Select object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSE Occurrence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSE Occurrence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSEOccurrence(MSEOccurrence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalStep(LogicalStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequential Logical Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequential Logical Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequentialLogicalStep(SequentialLogicalStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StepsSwitch

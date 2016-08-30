/**
 */
package videoGenTrace.Steps.util;

import fr.inria.diverse.trace.commons.model.trace.BigStep;
import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.SmallStep;
import fr.inria.diverse.trace.commons.model.trace.Step;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
			case StepsPackage.ROOT_IMPLICIT_STEP: {
				RootImplicitStep rootImplicitStep = (RootImplicitStep)theEObject;
				T result = caseRootImplicitStep(rootImplicitStep);
				if (result == null) result = caseSmallStep(rootImplicitStep);
				if (result == null) result = caseStep(rootImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.SPECIFIC_STEP: {
				SpecificStep specificStep = (SpecificStep)theEObject;
				T result = caseSpecificStep(specificStep);
				if (result == null) result = caseStep(specificStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.VIDEO_GEN_ALTERNATIVES_EXECUTE: {
				VideoGen_Alternatives_Execute videoGen_Alternatives_Execute = (VideoGen_Alternatives_Execute)theEObject;
				T result = caseVideoGen_Alternatives_Execute(videoGen_Alternatives_Execute);
				if (result == null) result = caseSequentialStep(videoGen_Alternatives_Execute);
				if (result == null) result = caseVideoGen_Alternatives_Execute_AbstractSubStep(videoGen_Alternatives_Execute);
				if (result == null) result = caseVideoGen_Optional_Execute_AbstractSubStep(videoGen_Alternatives_Execute);
				if (result == null) result = caseVideoGen_Mandatory_Execute_AbstractSubStep(videoGen_Alternatives_Execute);
				if (result == null) result = caseVideoGen_Initialize_Execute_AbstractSubStep(videoGen_Alternatives_Execute);
				if (result == null) result = caseVideoGen_Generate_Execute_AbstractSubStep(videoGen_Alternatives_Execute);
				if (result == null) result = caseSpecificStep(videoGen_Alternatives_Execute);
				if (result == null) result = caseBigStep(videoGen_Alternatives_Execute);
				if (result == null) result = caseStep(videoGen_Alternatives_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.VIDEO_GEN_ALTERNATIVES_EXECUTE_ABSTRACT_SUB_STEP: {
				VideoGen_Alternatives_Execute_AbstractSubStep videoGen_Alternatives_Execute_AbstractSubStep = (VideoGen_Alternatives_Execute_AbstractSubStep)theEObject;
				T result = caseVideoGen_Alternatives_Execute_AbstractSubStep(videoGen_Alternatives_Execute_AbstractSubStep);
				if (result == null) result = caseSpecificStep(videoGen_Alternatives_Execute_AbstractSubStep);
				if (result == null) result = caseStep(videoGen_Alternatives_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.VIDEO_GEN_ALTERNATIVES_EXECUTE_IMPLICIT_STEP: {
				VideoGen_Alternatives_Execute_ImplicitStep videoGen_Alternatives_Execute_ImplicitStep = (VideoGen_Alternatives_Execute_ImplicitStep)theEObject;
				T result = caseVideoGen_Alternatives_Execute_ImplicitStep(videoGen_Alternatives_Execute_ImplicitStep);
				if (result == null) result = caseVideoGen_Alternatives_Execute_AbstractSubStep(videoGen_Alternatives_Execute_ImplicitStep);
				if (result == null) result = caseSmallStep(videoGen_Alternatives_Execute_ImplicitStep);
				if (result == null) result = caseSpecificStep(videoGen_Alternatives_Execute_ImplicitStep);
				if (result == null) result = caseStep(videoGen_Alternatives_Execute_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.VIDEO_GEN_GENERATE_EXECUTE: {
				VideoGen_Generate_Execute videoGen_Generate_Execute = (VideoGen_Generate_Execute)theEObject;
				T result = caseVideoGen_Generate_Execute(videoGen_Generate_Execute);
				if (result == null) result = caseVideoGen_Alternatives_Execute_AbstractSubStep(videoGen_Generate_Execute);
				if (result == null) result = caseVideoGen_Optional_Execute_AbstractSubStep(videoGen_Generate_Execute);
				if (result == null) result = caseVideoGen_Mandatory_Execute_AbstractSubStep(videoGen_Generate_Execute);
				if (result == null) result = caseVideoGen_Initialize_Execute_AbstractSubStep(videoGen_Generate_Execute);
				if (result == null) result = caseSequentialStep(videoGen_Generate_Execute);
				if (result == null) result = caseVideoGen_Generate_Execute_AbstractSubStep(videoGen_Generate_Execute);
				if (result == null) result = caseSpecificStep(videoGen_Generate_Execute);
				if (result == null) result = caseBigStep(videoGen_Generate_Execute);
				if (result == null) result = caseStep(videoGen_Generate_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.VIDEO_GEN_GENERATE_EXECUTE_ABSTRACT_SUB_STEP: {
				VideoGen_Generate_Execute_AbstractSubStep videoGen_Generate_Execute_AbstractSubStep = (VideoGen_Generate_Execute_AbstractSubStep)theEObject;
				T result = caseVideoGen_Generate_Execute_AbstractSubStep(videoGen_Generate_Execute_AbstractSubStep);
				if (result == null) result = caseSpecificStep(videoGen_Generate_Execute_AbstractSubStep);
				if (result == null) result = caseStep(videoGen_Generate_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.VIDEO_GEN_GENERATE_EXECUTE_IMPLICIT_STEP: {
				VideoGen_Generate_Execute_ImplicitStep videoGen_Generate_Execute_ImplicitStep = (VideoGen_Generate_Execute_ImplicitStep)theEObject;
				T result = caseVideoGen_Generate_Execute_ImplicitStep(videoGen_Generate_Execute_ImplicitStep);
				if (result == null) result = caseVideoGen_Generate_Execute_AbstractSubStep(videoGen_Generate_Execute_ImplicitStep);
				if (result == null) result = caseSmallStep(videoGen_Generate_Execute_ImplicitStep);
				if (result == null) result = caseSpecificStep(videoGen_Generate_Execute_ImplicitStep);
				if (result == null) result = caseStep(videoGen_Generate_Execute_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.VIDEO_GEN_INITIALIZE_EXECUTE: {
				VideoGen_Initialize_Execute videoGen_Initialize_Execute = (VideoGen_Initialize_Execute)theEObject;
				T result = caseVideoGen_Initialize_Execute(videoGen_Initialize_Execute);
				if (result == null) result = caseVideoGen_Alternatives_Execute_AbstractSubStep(videoGen_Initialize_Execute);
				if (result == null) result = caseVideoGen_Optional_Execute_AbstractSubStep(videoGen_Initialize_Execute);
				if (result == null) result = caseVideoGen_Mandatory_Execute_AbstractSubStep(videoGen_Initialize_Execute);
				if (result == null) result = caseSequentialStep(videoGen_Initialize_Execute);
				if (result == null) result = caseVideoGen_Initialize_Execute_AbstractSubStep(videoGen_Initialize_Execute);
				if (result == null) result = caseVideoGen_Generate_Execute_AbstractSubStep(videoGen_Initialize_Execute);
				if (result == null) result = caseSpecificStep(videoGen_Initialize_Execute);
				if (result == null) result = caseBigStep(videoGen_Initialize_Execute);
				if (result == null) result = caseStep(videoGen_Initialize_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.VIDEO_GEN_INITIALIZE_EXECUTE_ABSTRACT_SUB_STEP: {
				VideoGen_Initialize_Execute_AbstractSubStep videoGen_Initialize_Execute_AbstractSubStep = (VideoGen_Initialize_Execute_AbstractSubStep)theEObject;
				T result = caseVideoGen_Initialize_Execute_AbstractSubStep(videoGen_Initialize_Execute_AbstractSubStep);
				if (result == null) result = caseSpecificStep(videoGen_Initialize_Execute_AbstractSubStep);
				if (result == null) result = caseStep(videoGen_Initialize_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.VIDEO_GEN_INITIALIZE_EXECUTE_IMPLICIT_STEP: {
				VideoGen_Initialize_Execute_ImplicitStep videoGen_Initialize_Execute_ImplicitStep = (VideoGen_Initialize_Execute_ImplicitStep)theEObject;
				T result = caseVideoGen_Initialize_Execute_ImplicitStep(videoGen_Initialize_Execute_ImplicitStep);
				if (result == null) result = caseVideoGen_Initialize_Execute_AbstractSubStep(videoGen_Initialize_Execute_ImplicitStep);
				if (result == null) result = caseSmallStep(videoGen_Initialize_Execute_ImplicitStep);
				if (result == null) result = caseSpecificStep(videoGen_Initialize_Execute_ImplicitStep);
				if (result == null) result = caseStep(videoGen_Initialize_Execute_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.VIDEO_GEN_MANDATORY_EXECUTE: {
				VideoGen_Mandatory_Execute videoGen_Mandatory_Execute = (VideoGen_Mandatory_Execute)theEObject;
				T result = caseVideoGen_Mandatory_Execute(videoGen_Mandatory_Execute);
				if (result == null) result = caseVideoGen_Alternatives_Execute_AbstractSubStep(videoGen_Mandatory_Execute);
				if (result == null) result = caseVideoGen_Optional_Execute_AbstractSubStep(videoGen_Mandatory_Execute);
				if (result == null) result = caseSequentialStep(videoGen_Mandatory_Execute);
				if (result == null) result = caseVideoGen_Mandatory_Execute_AbstractSubStep(videoGen_Mandatory_Execute);
				if (result == null) result = caseVideoGen_Initialize_Execute_AbstractSubStep(videoGen_Mandatory_Execute);
				if (result == null) result = caseVideoGen_Generate_Execute_AbstractSubStep(videoGen_Mandatory_Execute);
				if (result == null) result = caseSpecificStep(videoGen_Mandatory_Execute);
				if (result == null) result = caseBigStep(videoGen_Mandatory_Execute);
				if (result == null) result = caseStep(videoGen_Mandatory_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.VIDEO_GEN_MANDATORY_EXECUTE_ABSTRACT_SUB_STEP: {
				VideoGen_Mandatory_Execute_AbstractSubStep videoGen_Mandatory_Execute_AbstractSubStep = (VideoGen_Mandatory_Execute_AbstractSubStep)theEObject;
				T result = caseVideoGen_Mandatory_Execute_AbstractSubStep(videoGen_Mandatory_Execute_AbstractSubStep);
				if (result == null) result = caseSpecificStep(videoGen_Mandatory_Execute_AbstractSubStep);
				if (result == null) result = caseStep(videoGen_Mandatory_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.VIDEO_GEN_MANDATORY_EXECUTE_IMPLICIT_STEP: {
				VideoGen_Mandatory_Execute_ImplicitStep videoGen_Mandatory_Execute_ImplicitStep = (VideoGen_Mandatory_Execute_ImplicitStep)theEObject;
				T result = caseVideoGen_Mandatory_Execute_ImplicitStep(videoGen_Mandatory_Execute_ImplicitStep);
				if (result == null) result = caseVideoGen_Mandatory_Execute_AbstractSubStep(videoGen_Mandatory_Execute_ImplicitStep);
				if (result == null) result = caseSmallStep(videoGen_Mandatory_Execute_ImplicitStep);
				if (result == null) result = caseSpecificStep(videoGen_Mandatory_Execute_ImplicitStep);
				if (result == null) result = caseStep(videoGen_Mandatory_Execute_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.VIDEO_GEN_OPTIONAL_EXECUTE: {
				VideoGen_Optional_Execute videoGen_Optional_Execute = (VideoGen_Optional_Execute)theEObject;
				T result = caseVideoGen_Optional_Execute(videoGen_Optional_Execute);
				if (result == null) result = caseVideoGen_Alternatives_Execute_AbstractSubStep(videoGen_Optional_Execute);
				if (result == null) result = caseSequentialStep(videoGen_Optional_Execute);
				if (result == null) result = caseVideoGen_Optional_Execute_AbstractSubStep(videoGen_Optional_Execute);
				if (result == null) result = caseVideoGen_Mandatory_Execute_AbstractSubStep(videoGen_Optional_Execute);
				if (result == null) result = caseVideoGen_Initialize_Execute_AbstractSubStep(videoGen_Optional_Execute);
				if (result == null) result = caseVideoGen_Generate_Execute_AbstractSubStep(videoGen_Optional_Execute);
				if (result == null) result = caseSpecificStep(videoGen_Optional_Execute);
				if (result == null) result = caseBigStep(videoGen_Optional_Execute);
				if (result == null) result = caseStep(videoGen_Optional_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.VIDEO_GEN_OPTIONAL_EXECUTE_ABSTRACT_SUB_STEP: {
				VideoGen_Optional_Execute_AbstractSubStep videoGen_Optional_Execute_AbstractSubStep = (VideoGen_Optional_Execute_AbstractSubStep)theEObject;
				T result = caseVideoGen_Optional_Execute_AbstractSubStep(videoGen_Optional_Execute_AbstractSubStep);
				if (result == null) result = caseSpecificStep(videoGen_Optional_Execute_AbstractSubStep);
				if (result == null) result = caseStep(videoGen_Optional_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.VIDEO_GEN_OPTIONAL_EXECUTE_IMPLICIT_STEP: {
				VideoGen_Optional_Execute_ImplicitStep videoGen_Optional_Execute_ImplicitStep = (VideoGen_Optional_Execute_ImplicitStep)theEObject;
				T result = caseVideoGen_Optional_Execute_ImplicitStep(videoGen_Optional_Execute_ImplicitStep);
				if (result == null) result = caseVideoGen_Optional_Execute_AbstractSubStep(videoGen_Optional_Execute_ImplicitStep);
				if (result == null) result = caseSmallStep(videoGen_Optional_Execute_ImplicitStep);
				if (result == null) result = caseSpecificStep(videoGen_Optional_Execute_ImplicitStep);
				if (result == null) result = caseStep(videoGen_Optional_Execute_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.VIDEO_GEN_VIDEO_GEN_SETUP: {
				VideoGen_VideoGen_Setup videoGen_VideoGen_Setup = (VideoGen_VideoGen_Setup)theEObject;
				T result = caseVideoGen_VideoGen_Setup(videoGen_VideoGen_Setup);
				if (result == null) result = caseSpecificStep(videoGen_VideoGen_Setup);
				if (result == null) result = caseSequentialStep(videoGen_VideoGen_Setup);
				if (result == null) result = caseBigStep(videoGen_VideoGen_Setup);
				if (result == null) result = caseStep(videoGen_VideoGen_Setup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.VIDEO_GEN_VIDEO_GEN_SETUP_ABSTRACT_SUB_STEP: {
				VideoGen_VideoGen_Setup_AbstractSubStep videoGen_VideoGen_Setup_AbstractSubStep = (VideoGen_VideoGen_Setup_AbstractSubStep)theEObject;
				T result = caseVideoGen_VideoGen_Setup_AbstractSubStep(videoGen_VideoGen_Setup_AbstractSubStep);
				if (result == null) result = caseSpecificStep(videoGen_VideoGen_Setup_AbstractSubStep);
				if (result == null) result = caseStep(videoGen_VideoGen_Setup_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.VIDEO_GEN_VIDEO_GEN_SETUP_IMPLICIT_STEP: {
				VideoGen_VideoGen_Setup_ImplicitStep videoGen_VideoGen_Setup_ImplicitStep = (VideoGen_VideoGen_Setup_ImplicitStep)theEObject;
				T result = caseVideoGen_VideoGen_Setup_ImplicitStep(videoGen_VideoGen_Setup_ImplicitStep);
				if (result == null) result = caseVideoGen_VideoGen_Setup_AbstractSubStep(videoGen_VideoGen_Setup_ImplicitStep);
				if (result == null) result = caseSmallStep(videoGen_VideoGen_Setup_ImplicitStep);
				if (result == null) result = caseSpecificStep(videoGen_VideoGen_Setup_ImplicitStep);
				if (result == null) result = caseStep(videoGen_VideoGen_Setup_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.VIDEO_GEN_VIDEO_SETUP: {
				VideoGen_Video_Setup videoGen_Video_Setup = (VideoGen_Video_Setup)theEObject;
				T result = caseVideoGen_Video_Setup(videoGen_Video_Setup);
				if (result == null) result = caseSmallStep(videoGen_Video_Setup);
				if (result == null) result = caseVideoGen_VideoGen_Setup_AbstractSubStep(videoGen_Video_Setup);
				if (result == null) result = caseSpecificStep(videoGen_Video_Setup);
				if (result == null) result = caseStep(videoGen_Video_Setup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Specific Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificStep(SpecificStep object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Video Gen Alternatives Execute Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video Gen Alternatives Execute Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoGen_Alternatives_Execute_AbstractSubStep(VideoGen_Alternatives_Execute_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video Gen Alternatives Execute Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video Gen Alternatives Execute Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoGen_Alternatives_Execute_ImplicitStep(VideoGen_Alternatives_Execute_ImplicitStep object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Video Gen Generate Execute Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video Gen Generate Execute Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoGen_Generate_Execute_AbstractSubStep(VideoGen_Generate_Execute_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video Gen Generate Execute Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video Gen Generate Execute Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoGen_Generate_Execute_ImplicitStep(VideoGen_Generate_Execute_ImplicitStep object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Video Gen Initialize Execute Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video Gen Initialize Execute Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoGen_Initialize_Execute_AbstractSubStep(VideoGen_Initialize_Execute_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video Gen Initialize Execute Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video Gen Initialize Execute Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoGen_Initialize_Execute_ImplicitStep(VideoGen_Initialize_Execute_ImplicitStep object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Video Gen Mandatory Execute Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video Gen Mandatory Execute Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoGen_Mandatory_Execute_AbstractSubStep(VideoGen_Mandatory_Execute_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video Gen Mandatory Execute Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video Gen Mandatory Execute Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoGen_Mandatory_Execute_ImplicitStep(VideoGen_Mandatory_Execute_ImplicitStep object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Video Gen Optional Execute Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video Gen Optional Execute Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoGen_Optional_Execute_AbstractSubStep(VideoGen_Optional_Execute_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video Gen Optional Execute Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video Gen Optional Execute Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoGen_Optional_Execute_ImplicitStep(VideoGen_Optional_Execute_ImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video Gen Video Gen Setup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video Gen Video Gen Setup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoGen_VideoGen_Setup(VideoGen_VideoGen_Setup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video Gen Video Gen Setup Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video Gen Video Gen Setup Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoGen_VideoGen_Setup_AbstractSubStep(VideoGen_VideoGen_Setup_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video Gen Video Gen Setup Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video Gen Video Gen Setup Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoGen_VideoGen_Setup_ImplicitStep(VideoGen_VideoGen_Setup_ImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video Gen Video Setup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video Gen Video Setup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoGen_Video_Setup(VideoGen_Video_Setup object) {
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
	public <StepSubtype extends Step> T caseBigStep(BigStep<StepSubtype> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequential Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequential Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StepSubtype extends Step> T caseSequentialStep(SequentialStep<StepSubtype> object) {
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

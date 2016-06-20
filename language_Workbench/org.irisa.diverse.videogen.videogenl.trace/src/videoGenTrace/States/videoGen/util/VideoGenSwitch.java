/**
 */
package videoGenTrace.States.videoGen.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import videoGenTrace.States.videoGen.*;

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
 * @see videoGenTrace.States.videoGen.VideoGenPackage
 * @generated
 */
public class VideoGenSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VideoGenPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGenSwitch() {
		if (modelPackage == null) {
			modelPackage = VideoGenPackage.eINSTANCE;
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
			case VideoGenPackage.TRACED_ALTERNATIVES: {
				TracedAlternatives tracedAlternatives = (TracedAlternatives)theEObject;
				T result = caseTracedAlternatives(tracedAlternatives);
				if (result == null) result = caseTracedSequence(tracedAlternatives);
				if (result == null) result = caseTracedTransition(tracedAlternatives);
				if (result == null) result = caseTracedNamedElement(tracedAlternatives);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideoGenPackage.TRACED_DELAY: {
				TracedDelay tracedDelay = (TracedDelay)theEObject;
				T result = caseTracedDelay(tracedDelay);
				if (result == null) result = caseTracedTransition(tracedDelay);
				if (result == null) result = caseTracedNamedElement(tracedDelay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideoGenPackage.TRACED_GENERATE: {
				TracedGenerate tracedGenerate = (TracedGenerate)theEObject;
				T result = caseTracedGenerate(tracedGenerate);
				if (result == null) result = caseTracedTransition(tracedGenerate);
				if (result == null) result = caseTracedNamedElement(tracedGenerate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideoGenPackage.TRACED_INITIALIZE: {
				TracedInitialize tracedInitialize = (TracedInitialize)theEObject;
				T result = caseTracedInitialize(tracedInitialize);
				if (result == null) result = caseTracedTransition(tracedInitialize);
				if (result == null) result = caseTracedNamedElement(tracedInitialize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideoGenPackage.TRACED_MANDATORY: {
				TracedMandatory tracedMandatory = (TracedMandatory)theEObject;
				T result = caseTracedMandatory(tracedMandatory);
				if (result == null) result = caseTracedSequence(tracedMandatory);
				if (result == null) result = caseTracedTransition(tracedMandatory);
				if (result == null) result = caseTracedNamedElement(tracedMandatory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideoGenPackage.TRACED_NAMED_ELEMENT: {
				TracedNamedElement tracedNamedElement = (TracedNamedElement)theEObject;
				T result = caseTracedNamedElement(tracedNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideoGenPackage.TRACED_OPTIONAL: {
				TracedOptional tracedOptional = (TracedOptional)theEObject;
				T result = caseTracedOptional(tracedOptional);
				if (result == null) result = caseTracedSequence(tracedOptional);
				if (result == null) result = caseTracedTransition(tracedOptional);
				if (result == null) result = caseTracedNamedElement(tracedOptional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideoGenPackage.TRACED_SEQUENCE: {
				TracedSequence tracedSequence = (TracedSequence)theEObject;
				T result = caseTracedSequence(tracedSequence);
				if (result == null) result = caseTracedTransition(tracedSequence);
				if (result == null) result = caseTracedNamedElement(tracedSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideoGenPackage.TRACED_TRANSITION: {
				TracedTransition tracedTransition = (TracedTransition)theEObject;
				T result = caseTracedTransition(tracedTransition);
				if (result == null) result = caseTracedNamedElement(tracedTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideoGenPackage.TRACED_VIDEO: {
				TracedVideo tracedVideo = (TracedVideo)theEObject;
				T result = caseTracedVideo(tracedVideo);
				if (result == null) result = caseTracedNamedElement(tracedVideo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideoGenPackage.TRACED_VIDEO_GEN: {
				TracedVideoGen tracedVideoGen = (TracedVideoGen)theEObject;
				T result = caseTracedVideoGen(tracedVideoGen);
				if (result == null) result = caseTracedNamedElement(tracedVideoGen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Alternatives</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Alternatives</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedAlternatives(TracedAlternatives object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Delay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Delay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedDelay(TracedDelay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Generate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Generate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedGenerate(TracedGenerate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Initialize</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Initialize</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedInitialize(TracedInitialize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Mandatory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Mandatory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedMandatory(TracedMandatory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedNamedElement(TracedNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedOptional(TracedOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedSequence(TracedSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedTransition(TracedTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Video</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Video</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedVideo(TracedVideo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Video Gen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Video Gen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedVideoGen(TracedVideoGen object) {
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

} //VideoGenSwitch

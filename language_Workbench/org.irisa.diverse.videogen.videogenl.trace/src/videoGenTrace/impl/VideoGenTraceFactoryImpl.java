/**
 */
package videoGenTrace.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import videoGenTrace.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VideoGenTraceFactoryImpl extends EFactoryImpl implements VideoGenTraceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VideoGenTraceFactory init() {
		try {
			VideoGenTraceFactory theVideoGenTraceFactory = (VideoGenTraceFactory)EPackage.Registry.INSTANCE.getEFactory(VideoGenTracePackage.eNS_URI);
			if (theVideoGenTraceFactory != null) {
				return theVideoGenTraceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VideoGenTraceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGenTraceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VideoGenTracePackage.SPECIFIC_TRACE: return createSpecificTrace();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificTrace createSpecificTrace() {
		SpecificTraceImpl specificTrace = new SpecificTraceImpl();
		return specificTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGenTracePackage getVideoGenTracePackage() {
		return (VideoGenTracePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VideoGenTracePackage getPackage() {
		return VideoGenTracePackage.eINSTANCE;
	}

} //VideoGenTraceFactoryImpl

/**
 */
package org.irisa.diverse.videogen.videoGen.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.irisa.diverse.videogen.videoGen.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VideoGenFactoryImpl extends EFactoryImpl implements VideoGenFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VideoGenFactory init() {
		try {
			VideoGenFactory theVideoGenFactory = (VideoGenFactory)EPackage.Registry.INSTANCE.getEFactory(VideoGenPackage.eNS_URI);
			if (theVideoGenFactory != null) {
				return theVideoGenFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VideoGenFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGenFactoryImpl() {
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
			case VideoGenPackage.MANDATORY: return createMandatory();
			case VideoGenPackage.INITIALIZE: return createInitialize();
			case VideoGenPackage.VIDEO_GEN: return createVideoGen();
			case VideoGenPackage.OPTIONAL: return createOptional();
			case VideoGenPackage.VIDEO: return createVideo();
			case VideoGenPackage.ALTERNATIVES: return createAlternatives();
			case VideoGenPackage.GENERATE: return createGenerate();
			case VideoGenPackage.DELAY: return createDelay();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case VideoGenPackage.MIMETYPES_ENUM:
				return createMimetypes_EnumFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case VideoGenPackage.MIMETYPES_ENUM:
				return convertMimetypes_EnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mandatory createMandatory() {
		MandatoryImpl mandatory = new MandatoryImpl();
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Initialize createInitialize() {
		InitializeImpl initialize = new InitializeImpl();
		return initialize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen createVideoGen() {
		VideoGenImpl videoGen = new VideoGenImpl();
		return videoGen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Optional createOptional() {
		OptionalImpl optional = new OptionalImpl();
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Video createVideo() {
		VideoImpl video = new VideoImpl();
		return video;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alternatives createAlternatives() {
		AlternativesImpl alternatives = new AlternativesImpl();
		return alternatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generate createGenerate() {
		GenerateImpl generate = new GenerateImpl();
		return generate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delay createDelay() {
		DelayImpl delay = new DelayImpl();
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mimetypes_Enum createMimetypes_EnumFromString(EDataType eDataType, String initialValue) {
		Mimetypes_Enum result = Mimetypes_Enum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMimetypes_EnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGenPackage getVideoGenPackage() {
		return (VideoGenPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VideoGenPackage getPackage() {
		return VideoGenPackage.eINSTANCE;
	}

} //VideoGenFactoryImpl

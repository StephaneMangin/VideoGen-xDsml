/**
 */
package org.irisa.diverse.videogen.videoGen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.irisa.diverse.videogen.videoGen.Introduction;
import org.irisa.diverse.videogen.videoGen.VideoGen;
import org.irisa.diverse.videogen.videoGen.VideoGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Introduction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.irisa.diverse.videogen.videoGen.impl.IntroductionImpl#getVideoGen <em>Video Gen</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntroductionImpl extends OptionalImpl implements Introduction {
	/**
	 * The cached value of the '{@link #getVideoGen() <em>Video Gen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoGen()
	 * @generated
	 * @ordered
	 */
	protected VideoGen videoGen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntroductionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideoGenPackage.Literals.INTRODUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen getVideoGen() {
		if (videoGen != null && videoGen.eIsProxy()) {
			InternalEObject oldVideoGen = (InternalEObject)videoGen;
			videoGen = (VideoGen)eResolveProxy(oldVideoGen);
			if (videoGen != oldVideoGen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VideoGenPackage.INTRODUCTION__VIDEO_GEN, oldVideoGen, videoGen));
			}
		}
		return videoGen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen basicGetVideoGen() {
		return videoGen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVideoGen(VideoGen newVideoGen) {
		VideoGen oldVideoGen = videoGen;
		videoGen = newVideoGen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.INTRODUCTION__VIDEO_GEN, oldVideoGen, videoGen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VideoGenPackage.INTRODUCTION__VIDEO_GEN:
				if (resolve) return getVideoGen();
				return basicGetVideoGen();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VideoGenPackage.INTRODUCTION__VIDEO_GEN:
				setVideoGen((VideoGen)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VideoGenPackage.INTRODUCTION__VIDEO_GEN:
				setVideoGen((VideoGen)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VideoGenPackage.INTRODUCTION__VIDEO_GEN:
				return videoGen != null;
		}
		return super.eIsSet(featureID);
	}

} //IntroductionImpl

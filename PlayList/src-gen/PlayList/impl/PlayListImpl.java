/**
 * Copyright (C) 2006 Free Software Foundation
 */
package PlayList.impl;

import PlayList.PlayList;
import PlayList.PlayListPackage;
import PlayList.Video;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Play List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PlayList.impl.PlayListImpl#getVideo <em>Video</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayListImpl extends EObjectImpl implements PlayList {
	/**
	 * The cached value of the '{@link #getVideo() <em>Video</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideo()
	 * @generated
	 * @ordered
	 */
	protected EList video;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PlayListPackage.Literals.PLAY_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getVideo() {
		if (video == null) {
			video = new EObjectContainmentEList(Video.class, this, PlayListPackage.PLAY_LIST__VIDEO);
		}
		return video;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlayListPackage.PLAY_LIST__VIDEO:
				return ((InternalEList)getVideo()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlayListPackage.PLAY_LIST__VIDEO:
				return getVideo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PlayListPackage.PLAY_LIST__VIDEO:
				getVideo().clear();
				getVideo().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case PlayListPackage.PLAY_LIST__VIDEO:
				getVideo().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PlayListPackage.PLAY_LIST__VIDEO:
				return video != null && !video.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlayListImpl

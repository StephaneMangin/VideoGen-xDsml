/**
 */
package videoGenTrace.States.videoGen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.irisa.diverse.videogen.videogenl.videoGen.VideoGen;

import videoGenTrace.States.StatesPackage;
import videoGenTrace.States.VideoGen_initialized_Value;

import videoGenTrace.States.videoGen.TracedVideoGen;
import videoGenTrace.States.videoGen.VideoGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Video Gen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link videoGenTrace.States.videoGen.impl.TracedVideoGenImpl#getInitializedSequence <em>Initialized Sequence</em>}</li>
 *   <li>{@link videoGenTrace.States.videoGen.impl.TracedVideoGenImpl#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedVideoGenImpl extends TracedNamedElementImpl implements TracedVideoGen {
	/**
	 * The cached value of the '{@link #getInitializedSequence() <em>Initialized Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializedSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<VideoGen_initialized_Value> initializedSequence;

	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected VideoGen originalObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedVideoGenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideoGenPackage.Literals.TRACED_VIDEO_GEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VideoGen_initialized_Value> getInitializedSequence() {
		if (initializedSequence == null) {
			initializedSequence = new EObjectContainmentWithInverseEList<VideoGen_initialized_Value>(VideoGen_initialized_Value.class, this, VideoGenPackage.TRACED_VIDEO_GEN__INITIALIZED_SEQUENCE, StatesPackage.VIDEO_GEN_INITIALIZED_VALUE__PARENT);
		}
		return initializedSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (VideoGen)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VideoGenPackage.TRACED_VIDEO_GEN__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(VideoGen newOriginalObject) {
		VideoGen oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.TRACED_VIDEO_GEN__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VideoGenPackage.TRACED_VIDEO_GEN__INITIALIZED_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInitializedSequence()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VideoGenPackage.TRACED_VIDEO_GEN__INITIALIZED_SEQUENCE:
				return ((InternalEList<?>)getInitializedSequence()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VideoGenPackage.TRACED_VIDEO_GEN__INITIALIZED_SEQUENCE:
				return getInitializedSequence();
			case VideoGenPackage.TRACED_VIDEO_GEN__ORIGINAL_OBJECT:
				if (resolve) return getOriginalObject();
				return basicGetOriginalObject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VideoGenPackage.TRACED_VIDEO_GEN__INITIALIZED_SEQUENCE:
				getInitializedSequence().clear();
				getInitializedSequence().addAll((Collection<? extends VideoGen_initialized_Value>)newValue);
				return;
			case VideoGenPackage.TRACED_VIDEO_GEN__ORIGINAL_OBJECT:
				setOriginalObject((VideoGen)newValue);
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
			case VideoGenPackage.TRACED_VIDEO_GEN__INITIALIZED_SEQUENCE:
				getInitializedSequence().clear();
				return;
			case VideoGenPackage.TRACED_VIDEO_GEN__ORIGINAL_OBJECT:
				setOriginalObject((VideoGen)null);
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
			case VideoGenPackage.TRACED_VIDEO_GEN__INITIALIZED_SEQUENCE:
				return initializedSequence != null && !initializedSequence.isEmpty();
			case VideoGenPackage.TRACED_VIDEO_GEN__ORIGINAL_OBJECT:
				return originalObject != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedVideoGenImpl

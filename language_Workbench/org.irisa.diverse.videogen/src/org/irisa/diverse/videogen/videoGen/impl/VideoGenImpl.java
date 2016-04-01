/**
 */
package org.irisa.diverse.videogen.videoGen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.irisa.diverse.videogen.videoGen.Conclusion;
import org.irisa.diverse.videogen.videoGen.Introduction;
import org.irisa.diverse.videogen.videoGen.Sequence;
import org.irisa.diverse.videogen.videoGen.Video;
import org.irisa.diverse.videogen.videoGen.VideoGen;
import org.irisa.diverse.videogen.videoGen.VideoGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Video Gen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.irisa.diverse.videogen.videoGen.impl.VideoGenImpl#getSequences <em>Sequences</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videoGen.impl.VideoGenImpl#getVideos <em>Videos</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videoGen.impl.VideoGenImpl#getIntroduction <em>Introduction</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videoGen.impl.VideoGenImpl#getConclusion <em>Conclusion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VideoGenImpl extends NamedElementImpl implements VideoGen {
	/**
	 * The cached value of the '{@link #getSequences() <em>Sequences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequences()
	 * @generated
	 * @ordered
	 */
	protected EList<Sequence> sequences;

	/**
	 * The cached value of the '{@link #getVideos() <em>Videos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideos()
	 * @generated
	 * @ordered
	 */
	protected EList<Video> videos;

	/**
	 * The cached value of the '{@link #getIntroduction() <em>Introduction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntroduction()
	 * @generated
	 * @ordered
	 */
	protected Introduction introduction;

	/**
	 * The cached value of the '{@link #getConclusion() <em>Conclusion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConclusion()
	 * @generated
	 * @ordered
	 */
	protected Conclusion conclusion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoGenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideoGenPackage.Literals.VIDEO_GEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sequence> getSequences() {
		if (sequences == null) {
			sequences = new EObjectContainmentEList<Sequence>(Sequence.class, this, VideoGenPackage.VIDEO_GEN__SEQUENCES);
		}
		return sequences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Video> getVideos() {
		if (videos == null) {
			videos = new EObjectContainmentEList<Video>(Video.class, this, VideoGenPackage.VIDEO_GEN__VIDEOS);
		}
		return videos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Introduction getIntroduction() {
		if (introduction != null && introduction.eIsProxy()) {
			InternalEObject oldIntroduction = (InternalEObject)introduction;
			introduction = (Introduction)eResolveProxy(oldIntroduction);
			if (introduction != oldIntroduction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VideoGenPackage.VIDEO_GEN__INTRODUCTION, oldIntroduction, introduction));
			}
		}
		return introduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Introduction basicGetIntroduction() {
		return introduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntroduction(Introduction newIntroduction, NotificationChain msgs) {
		Introduction oldIntroduction = introduction;
		introduction = newIntroduction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VideoGenPackage.VIDEO_GEN__INTRODUCTION, oldIntroduction, newIntroduction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntroduction(Introduction newIntroduction) {
		if (newIntroduction != introduction) {
			NotificationChain msgs = null;
			if (introduction != null)
				msgs = ((InternalEObject)introduction).eInverseRemove(this, VideoGenPackage.INTRODUCTION__VIDEOGEN, Introduction.class, msgs);
			if (newIntroduction != null)
				msgs = ((InternalEObject)newIntroduction).eInverseAdd(this, VideoGenPackage.INTRODUCTION__VIDEOGEN, Introduction.class, msgs);
			msgs = basicSetIntroduction(newIntroduction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.VIDEO_GEN__INTRODUCTION, newIntroduction, newIntroduction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conclusion getConclusion() {
		if (conclusion != null && conclusion.eIsProxy()) {
			InternalEObject oldConclusion = (InternalEObject)conclusion;
			conclusion = (Conclusion)eResolveProxy(oldConclusion);
			if (conclusion != oldConclusion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VideoGenPackage.VIDEO_GEN__CONCLUSION, oldConclusion, conclusion));
			}
		}
		return conclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conclusion basicGetConclusion() {
		return conclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConclusion(Conclusion newConclusion, NotificationChain msgs) {
		Conclusion oldConclusion = conclusion;
		conclusion = newConclusion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VideoGenPackage.VIDEO_GEN__CONCLUSION, oldConclusion, newConclusion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConclusion(Conclusion newConclusion) {
		if (newConclusion != conclusion) {
			NotificationChain msgs = null;
			if (conclusion != null)
				msgs = ((InternalEObject)conclusion).eInverseRemove(this, VideoGenPackage.CONCLUSION__VIDEOGEN, Conclusion.class, msgs);
			if (newConclusion != null)
				msgs = ((InternalEObject)newConclusion).eInverseAdd(this, VideoGenPackage.CONCLUSION__VIDEOGEN, Conclusion.class, msgs);
			msgs = basicSetConclusion(newConclusion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.VIDEO_GEN__CONCLUSION, newConclusion, newConclusion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VideoGenPackage.VIDEO_GEN__INTRODUCTION:
				if (introduction != null)
					msgs = ((InternalEObject)introduction).eInverseRemove(this, VideoGenPackage.INTRODUCTION__VIDEOGEN, Introduction.class, msgs);
				return basicSetIntroduction((Introduction)otherEnd, msgs);
			case VideoGenPackage.VIDEO_GEN__CONCLUSION:
				if (conclusion != null)
					msgs = ((InternalEObject)conclusion).eInverseRemove(this, VideoGenPackage.CONCLUSION__VIDEOGEN, Conclusion.class, msgs);
				return basicSetConclusion((Conclusion)otherEnd, msgs);
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
			case VideoGenPackage.VIDEO_GEN__SEQUENCES:
				return ((InternalEList<?>)getSequences()).basicRemove(otherEnd, msgs);
			case VideoGenPackage.VIDEO_GEN__VIDEOS:
				return ((InternalEList<?>)getVideos()).basicRemove(otherEnd, msgs);
			case VideoGenPackage.VIDEO_GEN__INTRODUCTION:
				return basicSetIntroduction(null, msgs);
			case VideoGenPackage.VIDEO_GEN__CONCLUSION:
				return basicSetConclusion(null, msgs);
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
			case VideoGenPackage.VIDEO_GEN__SEQUENCES:
				return getSequences();
			case VideoGenPackage.VIDEO_GEN__VIDEOS:
				return getVideos();
			case VideoGenPackage.VIDEO_GEN__INTRODUCTION:
				if (resolve) return getIntroduction();
				return basicGetIntroduction();
			case VideoGenPackage.VIDEO_GEN__CONCLUSION:
				if (resolve) return getConclusion();
				return basicGetConclusion();
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
			case VideoGenPackage.VIDEO_GEN__SEQUENCES:
				getSequences().clear();
				getSequences().addAll((Collection<? extends Sequence>)newValue);
				return;
			case VideoGenPackage.VIDEO_GEN__VIDEOS:
				getVideos().clear();
				getVideos().addAll((Collection<? extends Video>)newValue);
				return;
			case VideoGenPackage.VIDEO_GEN__INTRODUCTION:
				setIntroduction((Introduction)newValue);
				return;
			case VideoGenPackage.VIDEO_GEN__CONCLUSION:
				setConclusion((Conclusion)newValue);
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
			case VideoGenPackage.VIDEO_GEN__SEQUENCES:
				getSequences().clear();
				return;
			case VideoGenPackage.VIDEO_GEN__VIDEOS:
				getVideos().clear();
				return;
			case VideoGenPackage.VIDEO_GEN__INTRODUCTION:
				setIntroduction((Introduction)null);
				return;
			case VideoGenPackage.VIDEO_GEN__CONCLUSION:
				setConclusion((Conclusion)null);
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
			case VideoGenPackage.VIDEO_GEN__SEQUENCES:
				return sequences != null && !sequences.isEmpty();
			case VideoGenPackage.VIDEO_GEN__VIDEOS:
				return videos != null && !videos.isEmpty();
			case VideoGenPackage.VIDEO_GEN__INTRODUCTION:
				return introduction != null;
			case VideoGenPackage.VIDEO_GEN__CONCLUSION:
				return conclusion != null;
		}
		return super.eIsSet(featureID);
	}

} //VideoGenImpl

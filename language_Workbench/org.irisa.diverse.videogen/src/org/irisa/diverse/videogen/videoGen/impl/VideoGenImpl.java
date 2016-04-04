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
 *   <li>{@link org.irisa.diverse.videogen.videoGen.impl.VideoGenImpl#getMinDurationConstraint <em>Min Duration Constraint</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videoGen.impl.VideoGenImpl#getMaxDurationConstraint <em>Max Duration Constraint</em>}</li>
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
	 * The default value of the '{@link #getMinDurationConstraint() <em>Min Duration Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDurationConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_DURATION_CONSTRAINT_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getMinDurationConstraint() <em>Min Duration Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDurationConstraint()
	 * @generated
	 * @ordered
	 */
	protected Integer minDurationConstraint = MIN_DURATION_CONSTRAINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxDurationConstraint() <em>Max Duration Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDurationConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_DURATION_CONSTRAINT_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getMaxDurationConstraint() <em>Max Duration Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDurationConstraint()
	 * @generated
	 * @ordered
	 */
	protected Integer maxDurationConstraint = MAX_DURATION_CONSTRAINT_EDEFAULT;

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
	public Integer getMinDurationConstraint() {
		return minDurationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinDurationConstraint(Integer newMinDurationConstraint) {
		Integer oldMinDurationConstraint = minDurationConstraint;
		minDurationConstraint = newMinDurationConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.VIDEO_GEN__MIN_DURATION_CONSTRAINT, oldMinDurationConstraint, minDurationConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxDurationConstraint() {
		return maxDurationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxDurationConstraint(Integer newMaxDurationConstraint) {
		Integer oldMaxDurationConstraint = maxDurationConstraint;
		maxDurationConstraint = newMaxDurationConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.VIDEO_GEN__MAX_DURATION_CONSTRAINT, oldMaxDurationConstraint, maxDurationConstraint));
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
			case VideoGenPackage.VIDEO_GEN__MIN_DURATION_CONSTRAINT:
				return getMinDurationConstraint();
			case VideoGenPackage.VIDEO_GEN__MAX_DURATION_CONSTRAINT:
				return getMaxDurationConstraint();
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
			case VideoGenPackage.VIDEO_GEN__MIN_DURATION_CONSTRAINT:
				setMinDurationConstraint((Integer)newValue);
				return;
			case VideoGenPackage.VIDEO_GEN__MAX_DURATION_CONSTRAINT:
				setMaxDurationConstraint((Integer)newValue);
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
			case VideoGenPackage.VIDEO_GEN__MIN_DURATION_CONSTRAINT:
				setMinDurationConstraint(MIN_DURATION_CONSTRAINT_EDEFAULT);
				return;
			case VideoGenPackage.VIDEO_GEN__MAX_DURATION_CONSTRAINT:
				setMaxDurationConstraint(MAX_DURATION_CONSTRAINT_EDEFAULT);
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
			case VideoGenPackage.VIDEO_GEN__MIN_DURATION_CONSTRAINT:
				return MIN_DURATION_CONSTRAINT_EDEFAULT == null ? minDurationConstraint != null : !MIN_DURATION_CONSTRAINT_EDEFAULT.equals(minDurationConstraint);
			case VideoGenPackage.VIDEO_GEN__MAX_DURATION_CONSTRAINT:
				return MAX_DURATION_CONSTRAINT_EDEFAULT == null ? maxDurationConstraint != null : !MAX_DURATION_CONSTRAINT_EDEFAULT.equals(maxDurationConstraint);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (minDurationConstraint: ");
		result.append(minDurationConstraint);
		result.append(", maxDurationConstraint: ");
		result.append(maxDurationConstraint);
		result.append(')');
		return result.toString();
	}

} //VideoGenImpl

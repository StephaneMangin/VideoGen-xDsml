/**
 */
package org.irisa.diverse.videogen.videogenlmt.videoGen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Gen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGen#getSequences <em>Sequences</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGen#getVideos <em>Videos</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGen#getMinDurationConstraint <em>Min Duration Constraint</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGen#getMaxDurationConstraint <em>Max Duration Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage#getVideoGen()
 * @model
 * @generated
 */
public interface VideoGen extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sequences</b></em>' containment reference list.
	 * The list contents are of type {@link org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequences</em>' containment reference list.
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage#getVideoGen_Sequences()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sequence> getSequences();

	/**
	 * Returns the value of the '<em><b>Videos</b></em>' containment reference list.
	 * The list contents are of type {@link org.irisa.diverse.videogen.videogenlmt.videoGen.Video}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Videos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Videos</em>' containment reference list.
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage#getVideoGen_Videos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Video> getVideos();

	/**
	 * Returns the value of the '<em><b>Min Duration Constraint</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Duration Constraint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Duration Constraint</em>' attribute.
	 * @see #setMinDurationConstraint(Integer)
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage#getVideoGen_MinDurationConstraint()
	 * @model default="0"
	 * @generated
	 */
	Integer getMinDurationConstraint();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGen#getMinDurationConstraint <em>Min Duration Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Duration Constraint</em>' attribute.
	 * @see #getMinDurationConstraint()
	 * @generated
	 */
	void setMinDurationConstraint(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Duration Constraint</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Duration Constraint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Duration Constraint</em>' attribute.
	 * @see #setMaxDurationConstraint(Integer)
	 * @see org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage#getVideoGen_MaxDurationConstraint()
	 * @model default="0"
	 * @generated
	 */
	Integer getMaxDurationConstraint();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGen#getMaxDurationConstraint <em>Max Duration Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Duration Constraint</em>' attribute.
	 * @see #getMaxDurationConstraint()
	 * @generated
	 */
	void setMaxDurationConstraint(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initialize();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void process();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void compute();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Integer computeMaxDuration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Integer computeMinDuration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setConstraints(Integer minDuration, Integer maxDuration);

} // VideoGen

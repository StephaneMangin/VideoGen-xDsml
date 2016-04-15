/**
 */
package org.irisa.diverse.videogen.videoGen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Gen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.irisa.diverse.videogen.videoGen.VideoGen#getMinDurationConstraint <em>Min Duration Constraint</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videoGen.VideoGen#getMaxDurationConstraint <em>Max Duration Constraint</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videoGen.VideoGen#getVariantes <em>Variantes</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videoGen.VideoGen#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videoGen.VideoGen#getVideos <em>Videos</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.irisa.diverse.videogen.videoGen.VideoGenPackage#getVideoGen()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='minMaxNotEqual'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot minMaxNotEqual='\n\t\t\tself.minDurationConstraint <= self.maxDurationConstraint'"
 * @generated
 */
public interface VideoGen extends NamedElement {
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
	 * @see org.irisa.diverse.videogen.videoGen.VideoGenPackage#getVideoGen_MinDurationConstraint()
	 * @model default="0" required="true"
	 * @generated
	 */
	Integer getMinDurationConstraint();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videoGen.VideoGen#getMinDurationConstraint <em>Min Duration Constraint</em>}' attribute.
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
	 * @see org.irisa.diverse.videogen.videoGen.VideoGenPackage#getVideoGen_MaxDurationConstraint()
	 * @model default="0" required="true"
	 * @generated
	 */
	Integer getMaxDurationConstraint();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videoGen.VideoGen#getMaxDurationConstraint <em>Max Duration Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Duration Constraint</em>' attribute.
	 * @see #getMaxDurationConstraint()
	 * @generated
	 */
	void setMaxDurationConstraint(Integer value);

	/**
	 * Returns the value of the '<em><b>Variantes</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variantes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variantes</em>' attribute.
	 * @see #setVariantes(Integer)
	 * @see org.irisa.diverse.videogen.videoGen.VideoGenPackage#getVideoGen_Variantes()
	 * @model default="0" required="true"
	 * @generated
	 */
	Integer getVariantes();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videoGen.VideoGen#getVariantes <em>Variantes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variantes</em>' attribute.
	 * @see #getVariantes()
	 * @generated
	 */
	void setVariantes(Integer value);

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.irisa.diverse.videogen.videoGen.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see org.irisa.diverse.videogen.videoGen.VideoGenPackage#getVideoGen_Transitions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Videos</b></em>' containment reference list.
	 * The list contents are of type {@link org.irisa.diverse.videogen.videoGen.Video}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Videos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Videos</em>' containment reference list.
	 * @see org.irisa.diverse.videogen.videoGen.VideoGenPackage#getVideoGen_Videos()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Video> getVideos();

} // VideoGen

/**
 */
package org.irisa.diverse.videogen.videogenl.videoGen;

import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Gen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videoGen.VideoGen#getMinDurationConstraint <em>Min Duration Constraint</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videoGen.VideoGen#getMaxDurationConstraint <em>Max Duration Constraint</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videoGen.VideoGen#getVariantes <em>Variantes</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videoGen.VideoGen#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videoGen.VideoGen#getVideos <em>Videos</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videoGen.VideoGen#getMinUserConstraint <em>Min User Constraint</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videoGen.VideoGen#getMaxUserConstraint <em>Max User Constraint</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videoGen.VideoGen#isInitialized <em>Initialized</em>}</li>
 * </ul>
 *
 * @see org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage#getVideoGen()
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
	 * @see org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage#getVideoGen_MinDurationConstraint()
	 * @model default="0" required="true"
	 * @generated
	 */
	Integer getMinDurationConstraint();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videogenl.videoGen.VideoGen#getMinDurationConstraint <em>Min Duration Constraint</em>}' attribute.
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
	 * @see org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage#getVideoGen_MaxDurationConstraint()
	 * @model default="0" required="true"
	 * @generated
	 */
	Integer getMaxDurationConstraint();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videogenl.videoGen.VideoGen#getMaxDurationConstraint <em>Max Duration Constraint</em>}' attribute.
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
	 * @see org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage#getVideoGen_Variantes()
	 * @model default="0" required="true"
	 * @generated
	 */
	Integer getVariantes();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videogenl.videoGen.VideoGen#getVariantes <em>Variantes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variantes</em>' attribute.
	 * @see #getVariantes()
	 * @generated
	 */
	void setVariantes(Integer value);

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.irisa.diverse.videogen.videogenl.videoGen.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage#getVideoGen_Transitions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Videos</b></em>' containment reference list.
	 * The list contents are of type {@link org.irisa.diverse.videogen.videogenl.videoGen.Video}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Videos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Videos</em>' containment reference list.
	 * @see org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage#getVideoGen_Videos()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Video> getVideos();

	/**
	 * Returns the value of the '<em><b>Min User Constraint</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min User Constraint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min User Constraint</em>' attribute.
	 * @see #setMinUserConstraint(Integer)
	 * @see org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage#getVideoGen_MinUserConstraint()
	 * @model default="0"
	 * @generated
	 */
	Integer getMinUserConstraint();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videogenl.videoGen.VideoGen#getMinUserConstraint <em>Min User Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min User Constraint</em>' attribute.
	 * @see #getMinUserConstraint()
	 * @generated
	 */
	void setMinUserConstraint(Integer value);

	/**
	 * Returns the value of the '<em><b>Max User Constraint</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max User Constraint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max User Constraint</em>' attribute.
	 * @see #setMaxUserConstraint(Integer)
	 * @see org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage#getVideoGen_MaxUserConstraint()
	 * @model default="0"
	 * @generated
	 */
	Integer getMaxUserConstraint();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videogenl.videoGen.VideoGen#getMaxUserConstraint <em>Max User Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max User Constraint</em>' attribute.
	 * @see #getMaxUserConstraint()
	 * @generated
	 */
	void setMaxUserConstraint(Integer value);

	/**
	 * Returns the value of the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialized</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialized</em>' attribute.
	 * @see #setInitialized(boolean)
	 * @see org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage#getVideoGen_Initialized()
	 * @model
	 * @generated
	 */
	boolean isInitialized();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videogenl.videoGen.VideoGen#isInitialized <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialized</em>' attribute.
	 * @see #isInitialized()
	 * @generated
	 */
	void setInitialized(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void main();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.irisa.diverse.videogen.videogenl.videoGen.BasicEMap"
	 * @generated
	 */
	BasicEMap solve();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model argsMany="true"
	 * @generated
	 */
	void initializeModel(EList<String> args);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void compute();

} // VideoGen
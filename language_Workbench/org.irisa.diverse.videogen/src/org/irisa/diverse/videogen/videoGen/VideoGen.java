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
 *   <li>{@link org.irisa.diverse.videogen.videoGen.VideoGen#getSequences <em>Sequences</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videoGen.VideoGen#getVideos <em>Videos</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videoGen.VideoGen#getIntroduction <em>Introduction</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videoGen.VideoGen#getConclusion <em>Conclusion</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.irisa.diverse.videogen.videoGen.VideoGenPackage#getVideoGen()
 * @model
 * @generated
 */
public interface VideoGen extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sequences</b></em>' containment reference list.
	 * The list contents are of type {@link org.irisa.diverse.videogen.videoGen.Sequence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequences</em>' containment reference list.
	 * @see org.irisa.diverse.videogen.videoGen.VideoGenPackage#getVideoGen_Sequences()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sequence> getSequences();

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
	 * @model containment="true"
	 * @generated
	 */
	EList<Video> getVideos();

	/**
	 * Returns the value of the '<em><b>Introduction</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.irisa.diverse.videogen.videoGen.Introduction#getVideogen <em>Videogen</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Introduction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Introduction</em>' reference.
	 * @see #setIntroduction(Introduction)
	 * @see org.irisa.diverse.videogen.videoGen.VideoGenPackage#getVideoGen_Introduction()
	 * @see org.irisa.diverse.videogen.videoGen.Introduction#getVideogen
	 * @model opposite="videogen"
	 * @generated
	 */
	Introduction getIntroduction();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videoGen.VideoGen#getIntroduction <em>Introduction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Introduction</em>' reference.
	 * @see #getIntroduction()
	 * @generated
	 */
	void setIntroduction(Introduction value);

	/**
	 * Returns the value of the '<em><b>Conclusion</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.irisa.diverse.videogen.videoGen.Conclusion#getVideogen <em>Videogen</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conclusion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conclusion</em>' reference.
	 * @see #setConclusion(Conclusion)
	 * @see org.irisa.diverse.videogen.videoGen.VideoGenPackage#getVideoGen_Conclusion()
	 * @see org.irisa.diverse.videogen.videoGen.Conclusion#getVideogen
	 * @model opposite="videogen"
	 * @generated
	 */
	Conclusion getConclusion();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videoGen.VideoGen#getConclusion <em>Conclusion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conclusion</em>' reference.
	 * @see #getConclusion()
	 * @generated
	 */
	void setConclusion(Conclusion value);

} // VideoGen

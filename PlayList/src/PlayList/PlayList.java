/**
 */
package PlayList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Play List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PlayList.PlayList#getVideo <em>Video</em>}</li>
 * </ul>
 *
 * @see PlayList.PlayListPackage#getPlayList()
 * @model
 * @generated
 */
public interface PlayList extends EObject {
	/**
	 * Returns the value of the '<em><b>Video</b></em>' containment reference list.
	 * The list contents are of type {@link PlayList.Video}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video</em>' containment reference list.
	 * @see PlayList.PlayListPackage#getPlayList_Video()
	 * @model containment="true"
	 * @generated
	 */
	EList<Video> getVideo();

} // PlayList

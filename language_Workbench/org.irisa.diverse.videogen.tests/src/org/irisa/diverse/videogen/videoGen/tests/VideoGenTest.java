/**
 */
package org.irisa.diverse.videogen.videoGen.tests;

import junit.textui.TestRunner;

import org.irisa.diverse.videogen.videoGen.VideoGen;
import org.irisa.diverse.videogen.videoGen.VideoGenFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Video Gen</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VideoGenTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VideoGenTest.class);
	}

	/**
	 * Constructs a new Video Gen test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGenTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Video Gen test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VideoGen getFixture() {
		return (VideoGen)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VideoGenFactory.eINSTANCE.createVideoGen());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //VideoGenTest

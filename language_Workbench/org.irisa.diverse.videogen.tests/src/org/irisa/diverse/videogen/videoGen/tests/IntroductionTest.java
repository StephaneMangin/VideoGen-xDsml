/**
 */
package org.irisa.diverse.videogen.videoGen.tests;

import junit.textui.TestRunner;

import org.irisa.diverse.videogen.videoGen.Introduction;
import org.irisa.diverse.videogen.videoGen.VideoGenFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Introduction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntroductionTest extends OptionalTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntroductionTest.class);
	}

	/**
	 * Constructs a new Introduction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntroductionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Introduction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Introduction getFixture() {
		return (Introduction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VideoGenFactory.eINSTANCE.createIntroduction());
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

} //IntroductionTest

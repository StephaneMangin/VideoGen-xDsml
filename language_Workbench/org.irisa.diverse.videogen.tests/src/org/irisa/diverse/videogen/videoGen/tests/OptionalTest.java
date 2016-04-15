/**
 */
package org.irisa.diverse.videogen.videoGen.tests;

import junit.textui.TestRunner;

import org.irisa.diverse.videogen.videoGen.Optional;
import org.irisa.diverse.videogen.videoGen.VideoGenFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Optional</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OptionalTest extends SequenceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OptionalTest.class);
	}

	/**
	 * Constructs a new Optional test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionalTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Optional test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Optional getFixture() {
		return (Optional)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VideoGenFactory.eINSTANCE.createOptional());
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

} //OptionalTest

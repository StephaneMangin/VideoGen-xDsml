package org.irisa.diverse.videogen.utilities

import java.io.File
import java.nio.file.Paths
import org.junit.Test
import static org.junit.Assert.*

class SystemHelperTests {

	@Test
	def mkDirsTest() {
		val path = Paths.get("resources/oracleDir/oracleDir")
		SystemHelper.mkDirs(path)
		// toAbsolutePath is mandatory, not absolute which is insufficient
		assertTrue(new File(path.toAbsolutePath.toString).exists)
		assertTrue(new File(path.toAbsolutePath.toString).isDirectory)
	}

}

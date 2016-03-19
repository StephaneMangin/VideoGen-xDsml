package org.istic.idm.xtext.videogen.utils

import com.google.common.collect.Lists
import java.nio.file.Files
import java.nio.file.Paths
import java.util.HashMap
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.*
import org.istic.idm.xtext.videogen.videoGen.VideoGen
import org.istic.idm.xtext.videogen.VideoGenStandaloneSetup

class VideoGenHelperTests {

	var VideoGen videoGen;
	val oracle_file_list = Lists.newArrayList(
		"/tmp/Mass.mp4",
		"/tmp/TimsSuicide.mp4",
		"/tmp/EddyWally-Wow.mp4",
		"/tmp/haha.mp4"
	)
	val oracle_name_list = Lists.newArrayList(
		"mass",
		"tim",
		"wow_maybe",
		"haha_for_sure"
	)

	def loadVideoGen(URI uri) {
		VideoGenStandaloneSetup.doSetup
		var res = new ResourceSetImpl().getResource(uri, true);
		res.contents.get(0) as VideoGen
	}
	
	def saveVideoGen(URI uri, VideoGen pollS) {
		var Resource rs = new ResourceSetImpl().createResource(uri); 
		rs.getContents.add(pollS); 
		rs.save(new HashMap());
	}

	@Before
	def setUp() {
		// Copy all videos to temporary folder for absolute access
		Paths.get("resources/videos").toFile.listFiles.forEach[file |
			var abs = Paths.get(file.absolutePath)
			var newAbs = Paths.get("/tmp/" + abs.fileName)
			if (!newAbs.toFile.exists) {
				// Let the exception be thrown if atomic move is not possible
				Files.copy(abs, newAbs)
			}
		]
		val videoGenFile = Paths.get("resources/test.vg").toAbsolutePath.toString;
		// loading
		videoGen = loadVideoGen(URI.createURI(videoGenFile))
		assertNotNull(videoGen)
	}
	
	@Test
    def allSequences() {
		var allSequences = VideoGenHelper.allSequences(videoGen)
		assertEquals(
			oracle_file_list.size,
			allSequences.size
		)
		for (sequence: allSequences) {
			assertTrue(oracle_name_list.contains(sequence.name))
			assertTrue(oracle_file_list.contains(sequence.url))
		}
    }

}

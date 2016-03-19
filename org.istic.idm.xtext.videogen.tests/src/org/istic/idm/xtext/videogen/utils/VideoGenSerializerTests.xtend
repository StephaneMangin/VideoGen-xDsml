package org.istic.idm.xtext.videogen.utils

import java.io.File
import java.nio.file.Paths
import java.util.HashMap
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.istic.idm.xtext.videogen.VideoGenStandaloneSetup
import org.istic.idm.xtext.videogen.videoGen.VideoGen
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.*

class VideoGenSerializerTests {

	var VideoGen videoGen;

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
		val videoGenFile = Paths.get("resources/test.vg").toAbsolutePath.toString;
		// loading
		videoGen = loadVideoGen(URI.createURI(videoGenFile))
		assertNotNull(videoGen)
	}
	
	@Test
    def compile() {
		val out = new File(Paths.get("resources/test.json").absolute.toString)
		val result = new VideoGenSerializer().compile(videoGen)
		println(result.toString)
    }

}

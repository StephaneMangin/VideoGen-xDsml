package org.istic.idm.xtext.utils

import com.google.common.collect.Lists
import java.nio.file.Files
import java.nio.file.Paths
import java.util.HashMap
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.istic.idm.ecore.PlayList.PlayList
import org.istic.idm.ecore.PlayList.impl.PlayListFactoryImpl
import org.istic.idm.xtext.VideoGenStandaloneSetup
import org.istic.idm.xtext.videoGen.Mimetypes_Enum
import org.istic.idm.xtext.videoGen.VideoGen
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.*

class VideoGenTranformTest {

	var VideoGen videoGen
	var PlayList playList
	
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
	val oracle_duration_list = Lists.newArrayList(
		30,
		30,
		7,
		2
	)
	val oracle_mimeType = Mimetypes_Enum.MP4
	
	def loadPlayList(URI uri) {
		VideoGenStandaloneSetup.doSetup
		var res = new ResourceSetImpl().getResource(uri, true);
		res.contents.get(0) as VideoGen
	}
	
	def savePlayList(URI uri, PlayList playList) {
		var Resource rs = new ResourceSetImpl().createResource(uri); 
		rs.getContents.add(playList); 
		rs.save(new HashMap());
	}
	
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
		// Create the playlist instance from oracle
		val factory = new PlayListFactoryImpl()
		playList = factory.createPlayList
		for (url: oracle_file_list) {
			var indice = oracle_file_list.indexOf(url)
			var video = factory.createVideo
			video.path = url
			video.duration = oracle_duration_list.get(indice)	
			video.mimetype = oracle_mimeType.getName	
			playList.video.add(video)
		}
		
		// Copy all videos to temporary folder for absolute access
		Paths.get("resources/videos").toFile.listFiles.forEach[file |
			var abs = Paths.get(file.absolutePath)
			var newAbs = Paths.get("/tmp/" + abs.fileName)
			if (!newAbs.toFile.exists) {
				// Let the exception be thrown if atomic move is not possible
				Files.copy(abs, newAbs)
			}
		]
		
		// Create the VideGen instance
		val videoGenFile = Paths.get("resources/test.vg").toAbsolutePath.toString;
		// loading
		videoGen = loadVideoGen(URI.createURI(videoGenFile))
		assertNotNull(videoGen)
	}
		
	@Test
    def toVideoGen(){
    	assertTrue(true)
    }

	@Test
    def toPlayList(){
    	assertTrue(true)
    }

	@Test
    def createThumbnails(){
    	for (sequence: VideoGenHelper.allSequences(videoGen)) {
    		val path = VideoGenTransform.createThumbnails(sequence)
    		assertTrue(path.toAbsolutePath.toFile.exists)
    		assertTrue(path.toAbsolutePath.toFile.file)
    		assertNotEquals(0, path.toAbsolutePath.toFile.length)
    		assertTrue(path.fileName.toString.endsWith('png'))
    	}
    }

	@Test
    def ConvertTo(){
    	val pathes = VideoGenTransform.ConvertTo(Mimetypes_Enum.AVI, videoGen)
    	for (path: pathes) {
    		assertTrue(path.toAbsolutePath.toFile.exists)
    		assertTrue(path.toAbsolutePath.toFile.file)
    		assertNotEquals(0, path.toAbsolutePath.toFile.length)
    		assertTrue(path.fileName.toString.endsWith('avi'))
    	}
    }

	@Test
    def toConfigurator(){
    	assertTrue(true)
    }

	@Test
    def addMetadata(){
		VideoGenTransform.addMetadata(videoGen)
    	for (sequence: VideoGenHelper.allSequences(videoGen)) {
    		assertTrue(oracle_duration_list.contains(sequence.length))
    		assertEquals(oracle_mimeType, sequence.mimetype)
    	}
	}


}
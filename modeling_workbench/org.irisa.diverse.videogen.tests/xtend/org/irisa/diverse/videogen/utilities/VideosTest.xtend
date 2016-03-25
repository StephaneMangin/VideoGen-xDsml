package org.irisa.diverse.videogen.utilities

import com.google.common.collect.Lists
import java.nio.file.Paths
import java.util.List
import org.junit.Test

import static org.junit.Assert.*
import java.io.File

class VideosTest {

	val root = new File(VideosTest.classLoader.getResource("videos").toURI).absolutePath + "/"
	val List<String> oracle_file_list = Lists.newArrayList(
		"Mass.mp4",
		"TimsSuicide.mp4",
		"EddyWally-Wow.mp4",
		"haha.mp4"
	)
	val oracle_duration_list = Lists.newArrayList(
		30,
		30,
		7,
		2
	)
	val oracle_mimeType = VideoCodec.MP4
	
	@Test
	def void createThumbnailsTest() {
		for (fileName: oracle_file_list) {
			var newFile = Paths.get(root + "thumbnails/" + fileName.replace('.mp4', '.png'))
			SystemHelper.mkDirs(newFile.parent)
			Videos.createThumbnails(
				Paths.get(root + fileName),
				newFile
			)
			assertTrue(newFile.toFile.absoluteFile.exists)
			assertTrue(newFile.toFile.absoluteFile.canRead)
			assertNotEquals(0, newFile.toFile.absoluteFile.length)
		}
	}

	@Test
	def void convertTest() {
		val codec = VideoCodec.FLV
		for (fileName: oracle_file_list) {
			var newFile = Paths.get(root + "converted/" + fileName.replace('.mp4', '.' + codec.extention))
			SystemHelper.mkDirs(newFile.parent)
			Videos.convert(
				Paths.get(root + fileName),
				newFile,
				codec
			)
			assertTrue(newFile.toFile.absoluteFile.exists)
			assertTrue(newFile.toFile.absoluteFile.canRead)
			assertNotEquals(0, newFile.toFile.absoluteFile.length)
		}
	}

	@Test
	def void getMimeTypeTest() {
		for (fileName: oracle_file_list) {
			assertEquals(oracle_mimeType, Videos.getMimeType(Paths.get(root + fileName)))
		}
	}
	
	@Test
	def getDurationTest() {
		var i = 0;
		for (fileName: oracle_file_list) {
			val duration = Videos.getDuration(Paths.get(root + fileName))
			assertEquals(
				oracle_duration_list.get(oracle_file_list.indexOf(fileName)),
				duration
			)
			i++
		}
	}

}

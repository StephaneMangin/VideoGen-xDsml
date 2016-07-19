package org.irisa.diverse.videogen.k3dsa.dependencies.transformations.strategies

import java.nio.file.Path
import it.sauronsoftware.jave.AudioAttributes
import it.sauronsoftware.jave.VideoAttributes
import it.sauronsoftware.jave.EncodingAttributes
import it.sauronsoftware.jave.VideoSize
import it.sauronsoftware.jave.Encoder
import java.io.File
import org.irisa.diverse.videogen.k3dsa.dependencies.transformations.VideoCodec

/** 
 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 * 
 */
public class JaveStrategyImpl implements VideosStrategy {
  	 
	val static encoder = new Encoder()
		
	override void createThumbnails(Path fullPath, Path thumbFileName) {
		//TODO
	}

	override void convert(Path fullPath, Path newFullPathName, VideoCodec codec) {
		println(fullPath.toUri)
		println(newFullPathName.toUri)
		val fileIn = new File(fullPath.toUri)
		val fileOut = new File(newFullPathName.toUri)
		val audio = new AudioAttributes()
		audio.setCodec("libmp3lame")
		audio.setBitRate(new Integer(64000))
		audio.setChannels(new Integer(1))
		audio.setSamplingRate(new Integer(22050))
		
		val video = new VideoAttributes()
		video.setCodec(codec.format)
		video.setBitRate(new Integer(160000))
		video.setFrameRate(new Integer(15))
		video.setSize(new VideoSize(400, 300))
		
		val attrs = new EncodingAttributes()
		attrs.setFormat(codec.format)
		attrs.setAudioAttributes(audio)
		attrs.setVideoAttributes(video)
		
		encoder.encode(fileIn, fileOut, attrs)
	}

	override VideoCodec getMimeType(Path fullPath) {
		val info = encoder.getInfo(fullPath.toFile)
		if (VideoCodec.values.map[mte | mte.format].contains(info.format)) {
			return VideoCodec.getByFormat(info.format)
		}
		VideoCodec.NONE
	}
	
	override int getDuration(Path fullPath) {
		val info = encoder.getInfo(fullPath.toFile)
		info.duration.intValue()
	}
	
}

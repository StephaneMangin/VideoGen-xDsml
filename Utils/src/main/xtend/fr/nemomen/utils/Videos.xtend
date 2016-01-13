package fr.nemomen.utils

import io.humble.video.Decoder
import io.humble.video.Demuxer
import io.humble.video.Global
import io.humble.video.MediaDescriptor
import java.nio.file.Path

/** 
 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 * 
 */
public class Videos extends Executor {
  	
  	def private static Demuxer getDemuxer(Path path) {
  		// A Demuxer opens up media containers, parses  and de-multiplexes the streams
    	// of media data without those containers.
    	val demuxer = Demuxer.make
    	// We open the demuxer by pointing it at a URL.
    	demuxer.open(path.toAbsolutePath.toString, null, false, true, null, null)
    	demuxer
  	}
  	
  	def static private Decoder getDecoder(Path fullPath) {
  		val demuxer = getDemuxer(fullPath)
	
	    /*
	     * Query how many streams the call to open found
	     */
	    val numStreams = demuxer.getNumStreams();
	
	    /*
	     * Iterate through the streams to find the first video stream
	     */
	    var videoStreamId = -1
	    var streamStartTime = Global.NO_PTS
	    var Decoder videoDecoder = null
	    for(var i = 0; i < numStreams; i++)
	    {
	      val stream = demuxer.getStream(i)
	      streamStartTime = stream.startTime
	      var decoder = stream.decoder
	      if (decoder != null && decoder.getCodecType() == MediaDescriptor.Type.MEDIA_VIDEO) {
	        videoStreamId = i
	        videoDecoder = decoder
	      }
	    }
	    if (videoStreamId == -1)
	    	throw new RuntimeException("could not find video stream in container: " + fullPath);
	    videoDecoder
  	}
  
	/**
	 * Create a thumbnail from the given video to the given path
	 * 
	 * TODO: should return a file object to be processed by the caller
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 */
	def static void createThumbnails(Path fullPath, Path thumbFileName) {
		val cmd = '''avconv -i "«fullPath»" -r 1 -t 00:00:01 -ss 00:00:02 -f image2 "«thumbFileName»"'''
		var ExecResult result = execCmd(cmd, 1)
		for (String line : result.getLines()) {
			LOGGER.finest(line)
		}
	}

	/**
	 * Convert this video conform to the given mimeType
	 *
	 * TODO: add a mimeType instead of a string format parameter
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 */
	def static void convert(Path fullPath, Path newFullPathName, VideoCodec codec) {
		var cmd = '''avconv -i "«fullPath»" -strict -2 -vcodec h264 -acodec aac -f «codec.format» "«newFullPathName»"'''
		var ExecResult result = execCmd(cmd, 0)
		processResult(result)
	}

	/**
	 * Return the mimeType object for the given video
	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 */
	def static VideoCodec getMimeType(Path fullPath) {
		val demuxer = getDemuxer(fullPath)
    	for (mt: demuxer.format.toString.split(",")) {
			if (VideoCodec.values.map[mte | mte.format].contains(mt)) {
				return VideoCodec.getByFormat(mt)
			}
		}
		VideoCodec.NONE
	}
	
	/**
	 * Return the duration (in seconds) for the given video
	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 */
	def static int getDuration(Path fullPath) {
		val demuxer = getDemuxer(fullPath)
		(demuxer.duration as int) / 1000000
	}
	
}

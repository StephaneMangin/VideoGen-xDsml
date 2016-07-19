package org.irisa.diverse.videogen.k3dsa.dependencies.transformations.strategies

import java.nio.file.Path
import java.time.LocalTime
import org.irisa.diverse.videogen.k3dsa.dependencies.transformations.utils.Executor
import org.irisa.diverse.videogen.k3dsa.dependencies.transformations.VideoCodec

/** 
 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 * 
 */
public class AvconvStrategyImpl extends Executor implements VideosStrategy {
  	 
	override void createThumbnails(Path fullPath, Path thumbFileName) {
		if (!thumbFileName.toFile.exists) {
			val cmd = '''avconv -i "«fullPath»" -r 1 -t 00:00:01 -ss 00:00:02 -f image2 "«thumbFileName»"'''
			var ExecResult result = execCmd(cmd, 1)
			for (String line : result.getLines()) {
				LOGGER.finest(line)
			}
		}
	}

	override void convert(Path fullPath, Path newFullPathName, VideoCodec codec) {
		if (!newFullPathName.toFile.exists) {
			var cmd = '''avconv -i "«fullPath»" -strict -2 -vcodec h264 -acodec aac -f «codec.format» "«newFullPathName»"'''
			var ExecResult result = execCmd(cmd, 0)
			processResult(result)
		}
	}

	override VideoCodec getMimeType(Path fullPath) {
 		//var cmd = '''avconv -i "«fullPath»" 2>&1 | grep "«fullPath»"| cut -d ' ' -f 3'''
		var cmd = '''avconv -i "«fullPath»"'''
		var ExecResult result = execCmd(cmd, 0)
		processResult(result)
		val durationPattern = result.lines.filter[contains("'" + fullPath + "'")]
		if (durationPattern.size > 0) {
			var tmpResult = durationPattern.get(0).split(" ").get(2).split(",")
			for (mt: tmpResult) {
				if (VideoCodec.values.map[mte | mte.format].contains(mt)) {
					return VideoCodec.getByFormat(mt)
				}
			}
		}
		VideoCodec.NONE
	}
	
	override int getDuration(Path fullPath) {
		//var cmd = '''avconv -i "«fullPath»" 2>&1 | grep "Duration"| cut -d ' ' -f 4 | sed s/,// | sed 's@\..*@@g' | awk '{ split($1, A, ":"); split(A[3], B, "."); print 3600*A[1] + 60*A[2] + B[1] }' '''
		var cmd = '''avconv -i "«fullPath»" 2>&1'''
		var result = execCmd(cmd, 1)
		processResult(result)
		val durationPattern = result.lines.filter[contains("Duration")]
		var duration = 0
		if (durationPattern.size > 0) {
			var tmpResult = durationPattern.get(0).split(" ").get(3).replace(',', '')
			val repr = LocalTime.parse(tmpResult)
			duration = repr.minute * 60 + repr.second
		}
		duration
	}
	
}

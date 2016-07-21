package org.irisa.diverse.videogen.k3dsa.dependencies.transformations.strategies

import com.xuggle.mediatool.ToolFactory
import java.nio.file.Path
import java.util.ArrayList
import org.irisa.diverse.videogen.k3dsa.dependencies.transformations.VideoCodec

/** 
 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 * 
 */
public class XugglerStrategyImpl implements VideosStrategy {
  	 
	override void createThumbnails(Path fullPath, Path thumbFileName) {
		if (fullPath.toFile.exists) {
			val reader = ToolFactory.makeReader(thumbFileName.toAbsolutePath.toString)
			// TODO
		}
	}

	override void convert(Path fullPath, Path newFullPathName, VideoCodec codec) {
		if (newFullPathName.toFile.exists) {
			val reader = ToolFactory.makeReader(fullPath.toAbsolutePath.toString)
			reader.addListener(
				ToolFactory.makeWriter(newFullPathName.toAbsolutePath.toString, reader)
			)
			while (reader.readPacket() == null) {
				
			}
		}
	}

	override VideoCodec getMimeType(Path fullPath) {
		// TODO
		val durationPattern = new ArrayList<String>
		// TODO
		if (durationPattern.size > 0) {
			for (mt: durationPattern) {
				if (VideoCodec.values.map[mte | mte.format].contains(mt)) {
					return VideoCodec.getByFormat(mt)
				}
			}
		}
		VideoCodec.NONE
	}
	
	override int getDuration(Path fullPath) {
		// TODO
		var duration = 0
		// TODO
		duration
	}
	
}
package org.istic.idm.ecore.PlayList.util

import java.nio.file.Paths
import org.apache.commons.exec.CommandLine
import org.apache.commons.exec.DefaultExecutor
import org.istic.idm.ecore.PlayList.PlayList

class PlayListTransform{
  
	new() { }
   
    def static toPLS(PlayList playlist){
    	val content = new StringBuffer
        content.append("[playlist]\n")
       	var indice = 0
       	for (video: playlist.video) {
       		indice++
			content.append("File" + indice + "=" + video.path + "\n")
        	content.append("Title" + indice + "=" + video.description + "\n")
        	content.append("Length" + indice + "=" + video.duration + "\n")
		}
		content.append("NumberOfEntries=" + indice + "\n")
		content.append("Version=2\n")
        content.toString
    }
    
    def static toM3U(PlayList playlist){
    	return toM3U(playlist, false, false)
    }

    def static toM3U(PlayList playlist, Boolean extended){
    	return toM3U(playlist, extended, false)
    }

    def static toM3U(PlayList playlist, Boolean extended, Boolean discontinued){
    	val content = new StringBuffer
        if (extended) {
        	content.append("#EXTM3U" + "\n")
		}
        playlist.video.forEach[video | 
			if (extended) {
				if (discontinued) {
					content.append("#EXT-X-DISCONTINUITY" + "\n")
				}
				content.append("#EXTINF:" + video.duration + "," + video.description + "\n")
			}
        	content.append(video.path + "\n")
        ]
        if (extended) {
			content.append("#EXT-X-ENDLIST" + "\n")
		}
        content.toString
    }
    
    def static toFFMPEG(PlayList playlist){
    	val content = new StringBuffer
        playlist.video.forEach[video | 
        	content.append(video.path + "\n")
		]
        content.toString
    }
    
    def static toFlowPlayer(PlayList playList) {
		val indexPath = Paths.get("/resources/site/index.html").toAbsolutePath
		val cmd = "firefox " + indexPath;
		val commandLine = CommandLine.parse(cmd);
		val executor = new DefaultExecutor();
		executor.setExitValue(1);
		val exitValue = executor.execute(commandLine);
    }
    
}
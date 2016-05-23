package org.irisa.diverse.videogen.transformations

import java.io.FileWriter
import java.nio.file.Path
import java.util.Map
import java.util.HashMap
import com.google.common.collect.Lists
import org.irisa.diverse.playlist.PlayList.PlayList

/**
 * Define some PlayList transformation's specifications
 * 
 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 * FIXME: create classes per transformation types. Example M3U (with extended specification), PLS, ASX, WPL, etc
 * TODO: delegate to Lizzy library the managment of playlists tranformations (http://lizzy.sourceforge.net/)
 */
class PlayListTransform {
	
	/**
	 * Internal helper to write a content into a file
	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 */
	def static writeToFile(Path filename, String content) {
		val writer = new FileWriter(filename.toFile)
		writer.write(content)
		writer.flush()
		writer.close()
	}
	
	/**
	 * Return a textual representation of a PLS format
	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 * @see https://en.wikipedia.org/wiki/PLS_%28file_format%29
	 * @see http://schworak.com/blog/e41/extended-pls-plsv2/
	 */
    def static toPLS(PlayList playlist){
    	val content = new StringBuffer
        content.append("[playlist]\n")
       	var indice = 1
       	for (video: playlist.video) {
			content.append("File" + indice + "=" + video.path + "\n")
        	content.append("Title" + indice + "=" + video.description + "\n")
        	content.append("Length" + indice + "=" + video.duration + "\n")
       		indice++
		}
		content.append("NumberOfEntries=" + indice + "\n")
		content.append("Version=2\n")
        content.toString
    }
    
	/**
	 * Return a textual representation of a simple M3U model to text conversion
	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 * @see https://en.wikipedia.org/wiki/M3U
	 * @see http://schworak.com/blog/e39/m3u-play-list-specification/
	 * @see http://tools.ietf.org/html/draft-pantos-http-live-streaming
	 * 
	 * TODO: normalize option usability for each M3U methods
	 */
    def static toM3U(PlayList playlist){
    	toM3U(playlist, false, false, new HashMap)
    }

	/**
	 * Return a textual representation of a M3U model to text conversion with extended facility
	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 * @see https://en.wikipedia.org/wiki/M3U
	 * @see http://schworak.com/blog/e39/m3u-play-list-specification/
	 * @see http://tools.ietf.org/html/draft-pantos-http-live-streaming
	 * 
	 * TODO: normalize option usability for each M3U methods
	 */
    def static toM3U(PlayList playlist, Boolean extended){
    	toM3U(playlist, extended, false, new HashMap)
    }

	/**
	 * Return a textual representation of a M3U model to text convertion with extended and discontinuited facility
	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 * @see https://en.wikipedia.org/wiki/M3U
	 * @see http://schworak.com/blog/e39/m3u-play-list-specification/
	 * @see http://tools.ietf.org/html/draft-pantos-http-live-streaming
	 * 
	 * TODO: normalize option usability for each M3U methods
	 */
    def static toM3U(PlayList playlist, Boolean extended, Boolean discontinued){
    	toM3U(playlist, extended, false, new HashMap)
    }

	/**
	 * Return a textual representation of a M3U model to text convertion with extended, discontinuited and stream facility
	 * 
	 * Example : 
	 * 		result => http://schworak.com/blog/e41/extended-pls-plsv2/
	 * 		options => {
	 * 						"CODECS": "avc1.66.30,mp4a.40.2",
	 * 						"RESOLUTION": "640x360",
	 * 						"BANDWITH": "684383",
	 * 						...
	 * 					} 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 * @see https://en.wikipedia.org/wiki/M3U
	 * @see http://schworak.com/blog/e39/m3u-play-list-specification/
	 * @see http://tools.ietf.org/html/draft-pantos-http-live-streaming
	 * 
	 * TODO: normalize option usability for each M3U methods
	 */
    def static toM3U(PlayList playlist, Boolean extended, Boolean discontinued, Map<String, String> options){
    	val content = new StringBuffer
        if (extended) {
        	content.append("#EXTM3U" + "\n")
			content.append("#EXT-X-VERSION:3" + "\n")
			content.append("#EXT-X-MEDIA-SEQUENCE:44850" + "\n")
		}
		if (!options.empty) {
			val list = Lists.newArrayList
			options.forEach[key, value| list.add(key + "=" + value)]
			content.append("#EXT-X-STREAM-INF:" + list.join(",") + "\n")
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
    
	/**
	 * FFMEPG model to text convertion
	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 * @Deprecated
	 */
    def static toFFMPEG(PlayList playlist){
    	val content = new StringBuffer
        playlist.video.forEach[video | 
        	content.append(video.path + "\n")
		]
        content.toString
    }
    
}
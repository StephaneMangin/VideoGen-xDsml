package org.istic.idm.xtext.utils

import com.google.common.collect.Lists
import fr.nemomen.utils.System
import fr.nemomen.utils.VideoCodec
import fr.nemomen.utils.Videos
import fr.nemomen.utils.randomizers.DistributedRandomNumberGenerator
import java.nio.file.Path
import java.nio.file.Paths
import java.util.HashMap
import java.util.Map
import java.util.logging.Logger
import PlayList.PlayList
import PlayList.Video
import PlayList.impl.PlayListFactoryImpl
import org.istic.idm.xtext.videoGen.Alternatives
import org.istic.idm.xtext.videoGen.Mandatory
import org.istic.idm.xtext.videoGen.Mimetypes_Enum
import org.istic.idm.xtext.videoGen.Optional
import org.istic.idm.xtext.videoGen.Sequence
import org.istic.idm.xtext.videoGen.VideoGen
import org.istic.idm.xtext.videoGen.impl.VideoGenFactoryImpl

/**
 * Define some VideoGen transformation's specifications
 * 
 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 * 
 * FIXME: Is it a good idea to have only one class to manage tranformations ? Should it be better to split inside the xtext/ecore framework ?
 */
 public class VideoGenTransform {
 
	/**
	 * Local logger
	 * 
	 * @author <stephane.mangin@freesbee.fr>
	 * 
	 */	
	private static Logger LOGGER = Logger.getLogger("videoGen.transformations")
	
 	/**
 	 * Add a temporay system path
	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 * 
	 * TODO: could it be better to instanciate the class and allow the setting of a temporary path (local or remote) ?
 	 */
  	private static Path tmp = Paths.get(java.lang.System.getProperty("java.io.tmpdir") + "/VideoGenGenerated");
  
 	/**
 	 * Transfers (some) metadatas from a VideoGen Sequence instance to a PlayList Video instance (description, length, mime type and url)
 	 *  
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 	 */ 
   	def private static transferData(Video p_video, Sequence videoseq) {
		p_video.duration = videoseq.length
		p_video.path = videoseq.url
		p_video.description = ""
		if (videoseq.description != null) {
			p_video.description = videoseq.description
		}
		p_video.mimetype = videoseq.mimetype.getName
   	}
   
 	/**
 	 * Apply the given Optional instance's percentage to allow or not its selectability
 	 *  
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 	 */ 
    def private static isSelected(Optional video) {
        
        var drng = new DistributedRandomNumberGenerator()
        
        var float proba
        
        proba = 50
        if(video.probability != 0){
            proba = video.probability
        }
        
        drng.addNumber(1, proba)
        drng.addNumber(0, 100-proba)
        
        drng.getDistributedRandomNumber() > 0
    }
    
 	/**
 	 * Selects a sequence inside the given Alternatices instance accordingly to options' percentages.
 	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 	 */ 
    def private static selectSequence(Alternatives alternatives) {
        
        val drng = new DistributedRandomNumberGenerator()
        val proba = VideoGenHelper.checkProbabilities(alternatives)
        alternatives.options.map[sequence.name].forEach[name |
            drng.addNumber(proba.keySet.toList.indexOf(name), proba.get(name))
        ]
        alternatives.options.get(drng.getDistributedRandomNumber()).sequence
    }
    
 	/**
 	 * Tranform a VideoGen instance to a PlayList instance
 	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 	 */ 
    def static toVideoGen(PlayList playList){
        var videoGenFactory = VideoGenFactoryImpl.init()
        val videoGen = videoGenFactory.createVideoGen()
        videoGen
    }
     
 	/**
 	 * Return the file extention of the given file pathname
 	 *  
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 	 * 
 	 * FIXME: use of Optional should welcomed ! Or add a helper method to detect format with file headers
 	 */ 
    def private static String getFileExtension(String fileName) {
    	var extention = ""
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0) {
			extention = fileName.substring(fileName.lastIndexOf(".")+1);
        }
        extention
    }
   
 	/**
 	 * create thumbnails for a Sequence instance
 	 * Use of VideoGenHelper helper class
 	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 	 * @see VideoGenHelper#mkDirs(Path)
 	 * @see VideoGenHelper#createThumbnails(Path, Path)
 	 */ 
    def static createThumbnails(Sequence sequence){
	
		val dir = Paths.get(tmp + "/" + "thumbnails/")
		System.mkDirs(dir)
		val fullPath = Paths.get(sequence.url)
		val extention = getFileExtension(fullPath.fileName.toString)
		val thumbFileName = Paths.get(dir + "/" + fullPath.fileName.toString.replaceAll("." + extention, ".png"))
		Videos.createThumbnails(fullPath, thumbFileName)

		thumbFileName
    }
    
 	/**
 	 * Convert VideoGen Sequence url videos to the given mime type.
 	 * Use of VideoGenHelper helper class 
 	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 	 * @see VideoGenHelper#mkDirs(Path)
 	 * @see VideoGenHelper#convert(Path, Path, String)
	 * 
 	 * TODO: somethings should be done better... But what ?
 	 */ 
    def static ConvertTo(Mimetypes_Enum type, VideoGen videogen){
    	val codec = VideoCodec.getByFormat(type.getName)
		val pathes = Lists.newArrayList
		val dir = Paths.get(tmp + "/" + "converted" + "/" + type.getName + "/")
		System.mkDirs(dir)
        VideoGenHelper.allSequences(videogen).forEach[sequence |
			
			val fullPath = Paths.get(sequence.url)
			val extention = getFileExtension(fullPath.fileName.toString)
			val newFullPathName = Paths.get(dir + "/" + fullPath.fileName.toString.replaceAll("." + extention, "." + codec.extention))
			pathes.add(newFullPathName)
			Videos.convert(fullPath, newFullPathName, codec)
			sequence.url = newFullPathName.toAbsolutePath.toString
			sequence.mimetype = type
        ]
        pathes
    }
    
 	/**
 	 * Add some probably missing or misformatted metadatas into the VideoGen instance
 	 * For instance, videos duration and mime types.
 	 * Use of VideoGenHelper helper class 
 	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 	 * @see VideoGenHelper#getDuration(Path)
 	 * @see VideoGenHelper#getMimeType(Path)
	 * 
 	 * FIXME: should create a new VideoGen instance to not modify the given one.
 	 */ 
    def static addMetadata(VideoGen videogen){
        
        VideoGenHelper.allSequences(videogen).forEach[sequence |
        	val url = Paths.get(sequence.url)
			sequence.length = Videos.getDuration(url)
			sequence.mimetype = Mimetypes_Enum.getByName(Videos.getMimeType(url).name)
        ]
        videogen
    }
        
 	/**
 	 * Tranformation from VideoGen instance to Playlist instance
 	 *  
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 	 */ 
    def static toPlayList(VideoGen videogen, Boolean withThumbnail){
        val playlistFactory = PlayListFactoryImpl.init()
        val playlist = playlistFactory.createPlayList()
        
        videogen.statements.forEach[statement |
			var Sequence sequence
			
			if(statement instanceof Mandatory) {
				sequence = statement.sequence
			} else if(statement instanceof Optional) {
				if(isSelected(statement)){
					sequence = statement.sequence
				}
			} else if (statement instanceof Alternatives) {
				sequence = selectSequence(statement)
			}
			if (sequence != null) {
				val p_video = playlistFactory.createVideo()
				transferData(p_video, sequence)
				if (withThumbnail) {
					p_video.thumbnail = createThumbnails(sequence).toAbsolutePath.toString
				}
				playlist.video.add(p_video)
			}
        ]
        playlist
    }
    
 	/**
 	 * Tranformation from VideoGen instance to custom Playlist instance
 	 * 
 	 * Information on options:
 	 * 	Map<String, Boolean> options = {
 	 * 		"sequence_name1": false, // A Optional to remove (included by default)
 	 * 		"sequence_name2": true // A alternatives option to force (the first encountered one takes priority)
 	 * 	}
 	 *  
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 * @Param videogen VideoGen
	 * @Param withThumbnail Boolean - Include thumbnails
	 * @Param options Map<String, Boolean> - A Map of sequences name associated to a boolean
 	 */ 
    def static toCustomPlayList(VideoGen videogen, Boolean withThumbnail, Map<String, Boolean> options){
        val playlistFactory = PlayListFactoryImpl.init()
        val playlist = playlistFactory.createPlayList()
        
        videogen.statements.forEach[statement |
			var Sequence sequence
			
			if(statement instanceof Mandatory) {
				sequence = statement.sequence
			} else if(statement instanceof Optional) {
				val name = statement.sequence.name
				if(!options.containsKey(name) || !options.get(name) as Boolean){
					sequence = statement.sequence
				}
			} else if (statement instanceof Alternatives) {
				for (option: statement.options) {
					val name = option.sequence.name
					if(options.containsKey(name) && options.get(name) as Boolean){
						sequence = option.sequence
					}
				}
			}
			if (sequence != null) {
				val p_video = playlistFactory.createVideo()
				transferData(p_video, sequence)
				if (withThumbnail) {
					p_video.thumbnail = createThumbnails(sequence).toAbsolutePath.toString
				}
				playlist.video.add(p_video)
			}
        ]
        playlist
    }
    
 	/**
 	 * Transfert some data from a VideoGen Sequence instance to a PlayList Video instance
 	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 * 
 	 * FIXME: should find a better way to create this kind of ModelToText transformation. For instance, through multiples methods to get each portions of the resulting document.
 	 */ 
    def static toConfigurator(VideoGen videogen){
    	val thumbnails = new HashMap
    	for (sequence: VideoGenHelper.allSequences(videogen)) {
    		thumbnails.put(sequence.name, createThumbnails(sequence))
    	}
	    '''
<!-- Automatically generated by VideoGen -->
<!--style type="text/css">
	#configurator {
		background-color:rgba(72,72,72,0.4);
		padding-left:35px;
		padding-right:35px;
		padding-top:35px;
		padding-bottom:50px;
		width: auto;
		height: auto;
		min-height: 100%;
		overflow:auto;
		position: relative;
		margin-top:-130px;
		-moz-border-radius: 7px;
		-webkit-border-radius: 7px;
		border-radius: 7px;
		clear: both;
  	}

	#configurator .sequence {
		font-size: medium;	
		margin-top: 10px;
		margin-right: 10px;
		padding:10px;
		display: block;
		width : 120px;
		height: 120px;
		float: left;
		text-align: center;
		border: 2px solid #000;
		-webkit-border-radius: 5px;
		-moz-border-radius: 5px;
		border-radius: 5px;
	}
	#configurator .description {
		font-size: small;
		font-stretch: condensed;
		font-variant: small-caps;
		margin-bottom : 5px;
		height: 70px;
	}

	#configurator .sequence img, select, option {
		width: 80px;
		height: 80px;
		margin: 5px;
		max-width: 100%;
		-webkit-border-radius: 50px;
		-moz-border-radius: 50px;
		border-radius: 50px;
		background: transparent !important
	}
	
	#button_valid{
		float:left;
		width: 100%;
		height: 50px;
		color: #0493bd;
		border: #fbfbfb solid 4px;
		cursor:pointer;
		background-color: rgba(0,0,0,0);
		font-size:24px;
		-webkit-transition: all 0.3s;
		-moz-transition: all 0.3s;
		transition: all 0.3s;
		font-weight:700;
		border-radius: 5px;
	}

	#button_valid:hover{
		background-color: #3498db;
		color:white;
	}
		
	.submit:hover {
		color: #3498db;
	}
		
	.ease {
		width: 0px;
		height: 74px;
		background-color: #fbfbfb;
		-webkit-transition: .3s ease;
		-moz-transition: .3s ease;
		-o-transition: .3s ease;
		-ms-transition: .3s ease;
		transition: .3s ease;
	}

	.submit:hover .ease{
	  width:100%;
	  background-color:white;
	}

</style-->
<script type="application/javascript">
function showTitle(name, description) {
	document.getElementById(name).value = description;
}
</script>
<form name="configurator" id="configurator" action="%actionUrl%">
<input class="button" type="submit" value="Generate" id="button_valid"><br />
«FOR statement: videogen.statements»
	«IF statement instanceof Alternatives»
		<div id="«statement.name»" class="sequence">
			<span id="«statement.name»_title" class="description">«statement.options.get(0).sequence.description»</span><br />
				<div class="alternatives">
				«FOR option: statement.options»
						<input checked id="«option.sequence.name»" onchange="showTitle('«statement.name»_title', '«option.sequence.description»')" type="radio" name="«statement.name»" value="«option.sequence.name»" />
						<label for="«option.sequence.name»" style="background-image:url('«thumbnails.get(option.sequence.name)»');"></label>
				«ENDFOR»
				</div>
			</div>
	«ENDIF»
	«IF statement instanceof Mandatory»
		<div id="«statement.sequence.name»" class="sequence mandatory">
			<label class="description">«statement.sequence.description»</label><br />
			<img src="«thumbnails.get(statement.sequence.name)»"/><br />
			<input hidden name="«statement.sequence.name»" value="«statement.sequence.name»">
		</div>
	«ENDIF»
	«IF statement instanceof Optional»
		<div id="«statement.sequence.name»" class="sequence optional">
			<label class="description">«statement.sequence.description»</label><br />
			<input name="«statement.sequence.name»" type="checkbox" value="1" checked/><br />
			<img src="«thumbnails.get(statement.sequence.name)»"/>
		</div>
	«ENDIF»
«ENDFOR»
</form>'''
	}
    
}
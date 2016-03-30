package org.irisa.diverse.videogen.transformations

import com.google.common.collect.Lists
import java.nio.file.Path
import java.nio.file.Paths
import java.util.HashMap
import java.util.Map
import java.util.logging.Logger
import org.irisa.diverse.videogen.transformations.helpers.SystemHelper
import org.irisa.diverse.videogen.transformations.VideoCodec
import org.irisa.diverse.videogen.videoGen.VideoGen
import org.irisa.diverse.videogen.videoGen.Mandatory
import org.irisa.diverse.videogen.videoGen.Optional
import org.irisa.diverse.videogen.videoGen.Alternatives
import org.irisa.diverse.videogen.videoGen.Video
import org.irisa.diverse.videogen.transformations.utils.DistributedRandomNumberGenerator
import org.irisa.diverse.playlist.PlayList.PlayList
import org.irisa.diverse.playlist.PlayList.impl.PlayListFactoryImpl
import org.irisa.diverse.videogen.videoGen.impl.VideoGenFactoryImpl
import org.irisa.diverse.videogen.videoGen.Mimetypes_Enum
import org.irisa.diverse.videogen.transformations.helpers.VideoGenHelper
import org.irisa.diverse.videogen.transformations.helpers.VideosHelper

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
  	private static Path tmp = Paths.get(System.getProperty("java.io.tmpdir") + "/VideoGenGenerated");
  
 	/**
 	 * Transfers (some) metadatas from a VideoGen Sequence instance to a PlayList Video instance (description, length, mime type and url)
 	 *  
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 	 */ 
   	def private static transferData(org.irisa.diverse.playlist.PlayList.Video p_video, Video videoseq) {
   		LOGGER.info("Data transformation " + videoseq + "=>" + p_video)
		p_video.duration = videoseq.duration
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
        alternatives.options.map[video.name].forEach[name |
            drng.addNumber(proba.keySet.toList.indexOf(name), proba.get(name))
        ]
        alternatives.options.get(drng.getDistributedRandomNumber()).video
    }
    
 	/**
 	 * Tranform a VideoGen instance to a PlayList instance
 	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 	 */ 
    def static toVideoGen(PlayList playList){
   		LOGGER.info("Videogen transformation " + playList)
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
    def static createThumbnails(Video video){
   		LOGGER.info("Thumbnail generation " + video)
		val dir = Paths.get(tmp + "/" + "thumbnails/")
		SystemHelper.mkDirs(dir)
		val fullPath = Paths.get(video.url)
		val extention = getFileExtension(fullPath.fileName.toString)
		val thumbFileName = Paths.get(dir + "/" + fullPath.fileName.toString.replaceAll("." + extention, ".png"))
		VideosHelper.createThumbnails(fullPath, thumbFileName)

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
   		LOGGER.info("Convertion " + videogen + "=>" + type)
    	val codec = VideoCodec.getByFormat(type.getName)
		val pathes = Lists.newArrayList
		val dir = Paths.get(tmp + "/" + "converted" + "/" + type.getName + "/")
		SystemHelper.mkDirs(dir)
        VideoGenHelper.allVideos(videogen).forEach[video |
			
			val fullPath = Paths.get(video.url)
			val extention = getFileExtension(fullPath.fileName.toString)
			val newFullPathName = Paths.get(dir + "/" + fullPath.fileName.toString.replaceAll("." + extention, "." + codec.extention))
			pathes.add(newFullPathName)
			VideosHelper.convert(fullPath, newFullPathName, codec)
			video.url = newFullPathName.toAbsolutePath.toString
			video.mimetype = type
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
        
        VideoGenHelper.allVideos(videogen).forEach[video |
        	val url = Paths.get(video.url)
			video.duration = VideosHelper.getDuration(url)
			video.mimetype = Mimetypes_Enum.getByName(VideosHelper.getMimeType(url).name)
        ]
        videogen
    }
        
 	/**
 	 * Tranformation from VideoGen instance to Playlist instance
 	 *  
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 	 */ 
    def static toPlayList(VideoGen videogen, Boolean withThumbnail){
   		LOGGER.info("To playlist " + videogen + "=>" + withThumbnail)
        val playlistFactory = PlayListFactoryImpl.init()
        val playlist = playlistFactory.createPlayList()
        
        var sequence = videogen.sequences.get(0)
        while (sequence !== null) {
			var Video video = null
			
			if(sequence instanceof Mandatory) {
				video = sequence.video
			} else if(sequence instanceof Optional) {
				if(isSelected(sequence)){
					video = sequence.video
				}
			} else if (sequence instanceof Alternatives) {
				video = selectSequence(sequence)
			}
			if (video != null) {
				val p_video = playlistFactory.createVideo()
				transferData(p_video, video)
				if (withThumbnail) {
					p_video.thumbnail = createThumbnails(video).toAbsolutePath.toString
				}
				playlist.video.add(p_video)
			}
			sequence = sequence.nextSibling
        }
        playlist
    }
    
 	/**
 	 * Tranformation from VideoGen instance to custom Playlist instance
 	 * 
 	 * Information on options:
 	 * 	Map<String, Boolean> options = {
 	 * 		"sequence_name1": false, // A Optional to remove (included by default)
 	 * 		"sequence_name2": true // A alternatives option to force (if multiple choice exists, selectability is undeterministic)
 	 * 	}
 	 *  
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 * @Param videogen VideoGen
	 * @Param withThumbnail Boolean - Include thumbnails
	 * @Param options Map<String, Boolean> - A Map of sequences name associated to a boolean
 	 */ 
    def static toCustomPlayList(VideoGen videogen, Boolean withThumbnail, Map<String, Boolean> options){
   		LOGGER.info("To custom playlist " + videogen + "=>" + withThumbnail + ", options=>" + options)
        val playlistFactory = PlayListFactoryImpl.init()
        val playlist = playlistFactory.createPlayList()
        
        var sequence = videogen.sequences.get(0)
        while (sequence !== null) {
			var Video video = null
			
			if(sequence instanceof Mandatory) {
				video = sequence.video
			} else if(sequence instanceof Optional) {
				val name = sequence.video.name
				if(options.containsKey(name) && options.get(name)){
					video = sequence.video
				}
			} else if (sequence instanceof Alternatives) {
				for (option: sequence.options) {
					val name = option.video.name
					if(options.containsKey(name) && options.get(name)){
						video = option.video
					}
				}
			}
			if (video != null) {
				val p_video = playlistFactory.createVideo()
				transferData(p_video, video)
				if (withThumbnail) {
					p_video.thumbnail = createThumbnails(video).toAbsolutePath.toString
				}
				playlist.video.add(p_video)
			}
			sequence = sequence.nextSibling
        }
        playlist
    }
    
    /**
     * Convert a VideoGen into Json model
     * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 * @Param videogen VideoGen
     */
    def static toJson(VideoGen videogen){
   		LOGGER.info("To Json " + videogen)
    	new VideoGenSerializer().compile(videogen)
    }
    
    /**
     * Convert a VideoGen into a ExtM3U model
     * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 * @Param videogen VideoGen
     */
    def static toM3U(VideoGen videogen, Boolean withThumbnails, Map<String, Boolean> videos){
   		LOGGER.info("To M3U " + videogen)
   		val playlist = VideoGenTransform.toCustomPlayList(videogen, withThumbnails, videos)
    	PlayListTransform.toM3U(playlist, true, true)
    }
    
 	/**
 	 * Transfert some data from a VideoGen Sequence instance to a PlayList Video instance
 	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 * 
 	 * FIXME: should find a better way to create this kind of ModelToText transformation. For instance, through multiples methods to get each portions of the resulting document.
 	 */ 
    def static toConfigurator(VideoGen videogen){
   		LOGGER.info("To configuration " + videogen)
    	val thumbnails = new HashMap
    	for (video: VideoGenHelper.allVideos(videogen)) {
    		thumbnails.put(video.name, createThumbnails(video))
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
«FOR sequence: videogen.sequences»
	«IF sequence instanceof Alternatives»
		<div id="«sequence.name»" class="sequence">
			<span id="«sequence.name»_title" class="description">«sequence.options.get(0).video.description»</span><br />
				<div class="alternatives">
				«FOR option: sequence.options»
						<input checked id="«option.video.name»" onchange="showTitle('«sequence.name»_title', '«option.video.description»')" type="radio" name="«sequence.name»" value="«option.video.name»" />
						<label for="«option.video.name»" style="background-image:url('«thumbnails.get(option.video.name)»');"></label>
				«ENDFOR»
				</div>
			</div>
	«ENDIF»
	«IF sequence instanceof Mandatory»
		<div id="«sequence.video.name»" class="sequence mandatory">
			<label class="description">«sequence.video.description»</label><br />
			<img src="«thumbnails.get(sequence.video.name)»"/><br />
			<input hidden name="«sequence.video.name»" value="«sequence.video.name»">
		</div>
	«ENDIF»
	«IF sequence instanceof Optional»
		<div id="«sequence.video.name»" class="sequence optional">
			<label class="description">«sequence.video.description»</label><br />
			<input name="«sequence.video.name»" type="checkbox" value="1" checked/><br />
			<img src="«thumbnails.get(sequence.video.name)»"/>
		</div>
	«ENDIF»
«ENDFOR»
</form>'''
	}
    
}
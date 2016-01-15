package org.istic.idm.xtext.webservice.web.rest;

import PlayList.PlayList;
import PlayList.util.PlayListTransform;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.istic.idm.xtext.videogen.VideoGenStandaloneSetup;
import org.istic.idm.xtext.videogen.utils.VideoGenHelper;
import org.istic.idm.xtext.videogen.utils.VideoGenTransform;
import org.istic.idm.xtext.videogen.videoGen.Mimetypes_Enum;
import org.istic.idm.xtext.videogen.videoGen.Sequence;
import org.istic.idm.xtext.videogen.videoGen.VideoGen;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Controller for view and managing Flowplayer.
 */
@RestController
@RequestMapping("/static")
public class FlowplayerResource {

//    @RequestMapping(
//    		value = "/videogen",
//    		method = RequestMethod.GET,
//    		produces = MediaType.APPLICATION_JSON_VALUE
//    )
//    public @ResponseBody
//    ResponseEntity getVideoGen() {
//    	VideoGenStandaloneSetup.doSetup();
//		VideoGen videogen = (VideoGen) new ResourceSetImpl().getResource(
//			URI.createURI(this.getClass().getResource("/test.vg").toString()), true).getContents().get(0);
//		VideoGenTransform.addMetadata(videogen);
//		VideoGenTransform.ConvertTo(Mimetypes_Enum.MPEGTS, videogen);
//		return new ResponseEntity(VideoGenTransform.toJson(videogen), HttpStatus.OK);
//    }

	private String generateFormat(String ext, PlayList playList) {
		String result = "";
		switch (ext) {
			case "text":
				result = PlayListTransform.toFFMPEG(playList);
				break;
			case "m3u":
				result = PlayListTransform.toM3U(playList);
				break;
			case "m3u8":
				Map<String, String> m3uOptions = new HashMap<String, String>();
				m3uOptions.put("BANDWITH", "684383");
				m3uOptions.put("CODECS", "avc1.66.30,mp4a.40.2");
				m3uOptions.put("RESOLUTION", "640x360");
				result = PlayListTransform.toM3U(playList, true, true, m3uOptions);
				break;
			case "pls":
				result = PlayListTransform.toPLS(playList);
				break;
		}
		return result;
	}
	
     @RequestMapping(
    		value = "/custom.{ext}",
    		method = RequestMethod.POST,
    		produces = MediaType.TEXT_PLAIN_VALUE
    )
    public ResponseEntity<?> getCustomPlayList(@PathVariable String ext, @RequestBody Map<String, Boolean> options) {
    	VideoGenStandaloneSetup.doSetup();
		VideoGen videogen = (VideoGen) new ResourceSetImpl().getResource(
			URI.createURI(this.getClass().getResource("/test.vg").toString()), true).getContents().get(0);
		videogen = VideoGenTransform.addMetadata(videogen);
		VideoGenTransform.ConvertTo(Mimetypes_Enum.MPEGTS, videogen);

		
		PlayList playList = VideoGenTransform.toCustomPlayList(videogen, true, options);
		String result = generateFormat(ext, playList);

		// Replace all paths in the playlist by a server one
		for (Sequence seq: VideoGenHelper.allSequences(videogen)) {
			result = result.replaceAll(seq.getUrl(), "/static/videos/" + seq.getName() + ".ts");
		}
		if (result.equals("")) {
			return new ResponseEntity<>("Error when loading file.", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<String>(result, HttpStatus.OK);
    }

    @RequestMapping(
    		value = "/playlist.{ext}",
    		method = RequestMethod.GET
    )
    public HttpEntity<String> getPlayList(@PathVariable String ext) throws Exception {

    	VideoGenStandaloneSetup.doSetup();
		VideoGen videogen = (VideoGen) new ResourceSetImpl().getResource(
			URI.createURI(this.getClass().getResource("/test.vg").toString()), true).getContents().get(0);
		videogen = VideoGenTransform.addMetadata(videogen);
		VideoGenTransform.ConvertTo(Mimetypes_Enum.MPEGTS, videogen);
				
		PlayList playList = VideoGenTransform.toPlayList(videogen, true);
		String result = generateFormat(ext, playList);

		// Replace all paths in the playlist by a server one
		for (Sequence seq: VideoGenHelper.allSequences(videogen)) {
			result = result.replaceAll(seq.getUrl(), "/static/videos/" + seq.getName() + ".ts");
		}
		if (!result.equals("")) {
			HttpHeaders header = new HttpHeaders();
		    header.setContentType(new MediaType("application", "x-mpegurl"));
		    header.setContentLength(result.length());
			return new HttpEntity<String>(result, header);
		}
		return null;
    }

    @RequestMapping(
    		value = "/videos/{videoName}.ts",
    		method = RequestMethod.GET
    )
    public HttpEntity<FileSystemResource> getVideos(@PathVariable String videoName) throws IOException {
    	VideoGenStandaloneSetup.doSetup();
		VideoGen videogen = (VideoGen) new ResourceSetImpl().getResource(
			URI.createURI(this.getClass().getResource("/test.vg").toString()), true).getContents().get(0);
		VideoGenTransform.ConvertTo(Mimetypes_Enum.MPEGTS, videogen);

		for (Sequence sequence: VideoGenHelper.allSequences(videogen)) {
			if (sequence.getName().equals(videoName)) {
				FileSystemResource resource = new FileSystemResource(new File(sequence.getUrl()));
				HttpHeaders header = new HttpHeaders();
			    header.setContentType(new MediaType("video", "mp2t"));
			    header.setContentLength(resource.contentLength());
				return new HttpEntity<FileSystemResource>(resource, header);
			}
		}
		return null;
    }

    @RequestMapping(
    		value = "/thumbnails/{videoName}.png",
    		method = RequestMethod.GET
    )
    public HttpEntity<FileSystemResource> getThumbnail(@PathVariable String videoName) throws IOException {
    	
    	VideoGenStandaloneSetup.doSetup();
		VideoGen videogen = (VideoGen) new ResourceSetImpl().getResource(
			URI.createURI(this.getClass().getResource("/test.vg").toString()), true).getContents().get(0);

		for (Sequence sequence: VideoGenHelper.allSequences(videogen)) {
			if (sequence.getName().equals(videoName)) {
				FileSystemResource resource = new FileSystemResource(new File(
								VideoGenTransform.createThumbnails(sequence).toAbsolutePath().toString()));
				HttpHeaders header = new HttpHeaders();
			    header.setContentType(new MediaType("application", "x-mpegts"));
			    header.setContentType(MediaType.IMAGE_PNG);
			    header.setContentLength(resource.contentLength());
				return new HttpEntity<FileSystemResource>(resource, header);
			}
		}
		return null;
    }
    
}

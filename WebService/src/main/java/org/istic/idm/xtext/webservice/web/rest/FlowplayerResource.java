package org.istic.idm.xtext.webservice.web.rest;

import PlayList.PlayList;
import PlayList.Video;
import PlayList.util.PlayListTransform;

import org.apache.commons.io.IOUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.istic.idm.xtext.videogen.VideoGenStandaloneSetup;
import org.istic.idm.xtext.videogen.utils.VideoGenHelper;
import org.istic.idm.xtext.videogen.utils.VideoGenTransform;
import org.istic.idm.xtext.videogen.videoGen.Mimetypes_Enum;
import org.istic.idm.xtext.videogen.videoGen.Sequence;
import org.istic.idm.xtext.videogen.videoGen.VideoGen;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.websocket.server.PathParam;

import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
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

	private String switchFormat(String ext, PlayList playList, Map<String, String> options) {
		String result = "";
		switch (ext) {
			case "text":
				result = PlayListTransform.toFFMPEG(playList);
				break;
			case "m3u":
				result = PlayListTransform.toM3U(playList);
				break;
			case "m3u8":
				result = PlayListTransform.toM3U(playList, true, true, options);
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

		Map<String, String> m3uOptions = new HashMap<String, String>();
		m3uOptions.put("BANDWITH", "684383");
		m3uOptions.put("CODECS", "avc1.66.30,mp4a.40.2");
		m3uOptions.put("RESOLUTION", "640x360");
		
		PlayList playList = VideoGenTransform.toCustomPlayList(videogen, true, options);
		String result = switchFormat(ext, playList, m3uOptions);

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
    		method = RequestMethod.GET,
    		produces = MediaType.TEXT_PLAIN_VALUE
    )
    public ResponseEntity<?> getPlayList(@PathVariable String ext) throws Exception {
    	ResponseEntity<?> response = null;

    	VideoGenStandaloneSetup.doSetup();
		VideoGen videogen = (VideoGen) new ResourceSetImpl().getResource(
			URI.createURI(this.getClass().getResource("/test.vg").toString()), true).getContents().get(0);
		videogen = VideoGenTransform.addMetadata(videogen);
		VideoGenTransform.ConvertTo(Mimetypes_Enum.MPEGTS, videogen);
		
		Map<String, String> m3uOptions = new HashMap<String, String>();
		m3uOptions.put("BANDWITH", "684383");
		m3uOptions.put("CODECS", "avc1.66.30,mp4a.40.2");
		m3uOptions.put("RESOLUTION", "640x360");
		
		PlayList playList = VideoGenTransform.toPlayList(videogen, true);
		String result = switchFormat(ext, playList, m3uOptions);

		// Replace all paths in the playlist by a server one
		for (Sequence seq: VideoGenHelper.allSequences(videogen)) {
			result = result.replaceAll(seq.getUrl(), "/static/videos/" + seq.getName() + ".ts");
		}
		if (result.equals("")) {
			response = new ResponseEntity<>("Error when loading file.", HttpStatus.INTERNAL_SERVER_ERROR);
		} else {
			response = new ResponseEntity<String>(result, HttpStatus.OK);
		}
		return response;
    }

    @RequestMapping(
    		value = "/videos/{videoName}.ts",
    		method = RequestMethod.GET,
    		headers = "application/x-mpegts",
    		produces = MediaType.APPLICATION_OCTET_STREAM_VALUE
    )
    public FileSystemResource getVideos(@PathVariable String videoName) {
    	VideoGenStandaloneSetup.doSetup();
		VideoGen videogen = (VideoGen) new ResourceSetImpl().getResource(
			URI.createURI(this.getClass().getResource("/test.vg").toString()), true).getContents().get(0);
		VideoGenTransform.ConvertTo(Mimetypes_Enum.MPEGTS, videogen);

		for (Sequence sequence: VideoGenHelper.allSequences(videogen)) {
			if (sequence.getName().equals(videoName)) {
				return new FileSystemResource(new File(sequence.getUrl()));
			}
		}
		return null;
    }

    @RequestMapping(
    		value = "/thumbnails/{videoName}.png",
    		method = RequestMethod.GET,
    		produces = MediaType.IMAGE_PNG_VALUE
    )
    public FileSystemResource getThumbnail(@PathVariable String videoName) throws IOException {
    	
    	VideoGenStandaloneSetup.doSetup();
		VideoGen videogen = (VideoGen) new ResourceSetImpl().getResource(
			URI.createURI(this.getClass().getResource("/test.vg").toString()), true).getContents().get(0);

		for (Sequence sequence: VideoGenHelper.allSequences(videogen)) {
			if (sequence.getName().equals(videoName)) {
				return new FileSystemResource(new File(VideoGenTransform.createThumbnails(sequence).toAbsolutePath().toString()));
			}
		}
		return null;
    }
}

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
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
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
    public @ResponseBody ResponseEntity<?> getCustomPlayList(@PathVariable String ext, @RequestBody Map<String, Boolean> options) {
    	VideoGenStandaloneSetup.doSetup();
		VideoGen videogen = (VideoGen) new ResourceSetImpl().getResource(
			URI.createURI(this.getClass().getResource("/test.vg").toString()), true).getContents().get(0);
		VideoGenTransform.addMetadata(videogen);
		VideoGenTransform.ConvertTo(Mimetypes_Enum.MPEGTS, videogen);

		Map<String, String> m3uOptions = new HashMap<String, String>();
		m3uOptions.put("BANDWITH", "684383");
		m3uOptions.put("CODECS", "avc1.66.30,mp4a.40.2");
		m3uOptions.put("RESOLUTION", "640x360");
		
		PlayList playList = VideoGenTransform.toCustomPlayList(videogen, true, options);
		String result = switchFormat(ext, playList, m3uOptions);
		
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
    public @ResponseBody ResponseEntity<?> getPlayList(@PathVariable String ext) {
    	VideoGenStandaloneSetup.doSetup();
		VideoGen videogen = (VideoGen) new ResourceSetImpl().getResource(
			URI.createURI(this.getClass().getResource("/test.vg").toString()), true).getContents().get(0);
		VideoGenTransform.addMetadata(videogen);
		VideoGenTransform.ConvertTo(Mimetypes_Enum.MPEGTS, videogen);
		
		Map<String, String> m3uOptions = new HashMap<String, String>();
		m3uOptions.put("BANDWITH", "684383");
		m3uOptions.put("CODECS", "avc1.66.30,mp4a.40.2");
		m3uOptions.put("RESOLUTION", "640x360");
		
		PlayList playList = VideoGenTransform.toPlayList(videogen, true);
		String result = switchFormat(ext, playList, m3uOptions);
		
		if (result.equals("")) {
			return new ResponseEntity<>("Error when loading file.", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<String>(result, HttpStatus.OK);
    }

    @RequestMapping(
    		value = "/videos/{videoName}",
    		method = RequestMethod.GET,
    		headers = "application/x-mpegts",
    		produces = MediaType.APPLICATION_OCTET_STREAM_VALUE
    )
    public @ResponseBody ResponseEntity<?> getVideos(@PathVariable String videoName) {
    	VideoGenStandaloneSetup.doSetup();
		VideoGen videogen = (VideoGen) new ResourceSetImpl().getResource(
			URI.createURI(this.getClass().getResource("/test.vg").toString()), true).getContents().get(0);
		VideoGenTransform.ConvertTo(Mimetypes_Enum.MPEGTS, videogen);

		for (Sequence sequence: VideoGenHelper.allSequences(videogen)) {
			if (sequence.getName().equals(videoName)) {
				InputStream inputStream;
				try {
					inputStream = new FileInputStream(sequence.getUrl());
					byte[]out=org.apache.commons.io.IOUtils.toByteArray(inputStream);
					return new ResponseEntity<byte[]>(out, HttpStatus.OK);
				} catch (IOException e) {
					return new ResponseEntity<>("Error when loading file.", HttpStatus.INTERNAL_SERVER_ERROR);
				}
			}
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(
    		value = "/thumbnails/{videoName}",
    		method = RequestMethod.GET,
    		produces = MediaType.IMAGE_PNG_VALUE
    )
    public @ResponseBody ResponseEntity<?> getThumbnail(@PathVariable String videoName) {
    	VideoGenStandaloneSetup.doSetup();
		VideoGen videogen = (VideoGen) new ResourceSetImpl().getResource(
			URI.createURI(this.getClass().getResource("/test.vg").toString()), true).getContents().get(0);

		for (Sequence sequence: VideoGenHelper.allSequences(videogen)) {
			System.out.println(sequence.getName());
			if (sequence.getName().equals(videoName)) {
				System.out.println("OK");
				java.nio.file.Path image = VideoGenTransform.createThumbnails(sequence);
				InputStream inputStream = this.getClass().getResourceAsStream(image.toAbsolutePath().toString());
				try {
		            BufferedImage bufferedImage = ImageIO.read(inputStream);
		            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
					ImageIO.write( bufferedImage  , "png", byteArrayOutputStream);
					return new ResponseEntity<byte[]>(byteArrayOutputStream.toByteArray(), HttpStatus.OK);
				} catch (IOException e) {
					return new ResponseEntity<>("Error when loading file.", HttpStatus.INTERNAL_SERVER_ERROR);
				}
			}
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

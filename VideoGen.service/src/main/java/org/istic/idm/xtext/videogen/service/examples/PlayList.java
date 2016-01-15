package org.istic.idm.xtext.videogen.service.examples;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;

import org.istic.idm.ecore.PlayList.impl.PlayListImpl;
import org.istic.idm.ecore.PlayList.util.PlayListTransform;
import org.istic.idm.xtext.VideoGenStandaloneSetup;
import org.istic.idm.xtext.utils.VideoGenHelper;
import org.istic.idm.xtext.videoGen.VideoGen;

import org.istic.idm.xtext.utils.VideoGenTransform;


public class PlayList {

	static VideoGen videoGen;
	static PlayListImpl playlist;
	static String filename = Paths.get(FlowPlayer.class.getResource("/test.vg").getPath()).toAbsolutePath().toString();
	static Path path = Paths.get("generated/playlists-" + LocalDateTime.now() + "/").toAbsolutePath();
	
	public static File writeToFile(String filename, String content) {
		if (!path.toFile().exists()) {
			VideoGenHelper.mkDirs(path);
		}
		FileWriter writer;
		File file = new File(path  + "/" + filename);
		try {
			writer = new FileWriter(file);
			writer.write(content);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return file; 
	}
	
	public static void main(String[] args) throws IOException {

		if (args.length > 0) {
			filename = args[0];
		}
		System.out.println("Converting '" + filename + "' to playlists.");

		// Only transformation
		videoGen = VideoGenStandaloneSetup.loadVideoGen(filename);
		VideoGenTransform.addMetadata(videoGen);
		playlist = VideoGenTransform.toPlayList(videoGen, false);
		writeToFile("test.m3u", PlayListTransform.toM3U(playlist));
		writeToFile("test-extended.m3u", PlayListTransform.toM3U(playlist, true, true));
		writeToFile("test.ffmpeg", PlayListTransform.toFFMPEG(playlist));
		writeToFile("test.pls", PlayListTransform.toPLS(playlist));

	}

}

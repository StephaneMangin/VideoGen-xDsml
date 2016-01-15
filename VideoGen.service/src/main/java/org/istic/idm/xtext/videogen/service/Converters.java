package org.istic.idm.xtext.videogen.service;

import java.io.IOException;
import java.util.function.Consumer;

import org.istic.idm.xtext.videogen.service.examples.FlowPlayer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/converters")
public class Converters {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getFlowplayer() throws Exception {
		FlowPlayer flowplayer = new FlowPlayer();
		FlowPlayer.setConfigurator(true);
		try {
			flowplayer.generatePlayList();
		} catch (IOException e) {
			e.printStackTrace();
		}
		final StringBuilder content = new StringBuilder();
		FlowPlayer.getPageContent().lines().forEachOrdered(new Consumer<String>() {

			@Override
			public void accept(String line) {
				content.append(line + "\n");
			}
		});
		return content.toString();
	}

}

/*******************************************************************************
 * Copyright (c) 2016 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package org.irisa.diverse.livemodeling.views.mediaplayer;

import java.util.function.Consumer;

import org.irisa.diverse.livemodeling.views.api.IModelAdapter;
import org.irisa.diverse.livemodeling.views.api.IModelListener;

import javafx.application.Platform;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.geometry.Insets;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class FxListener extends Pane implements IModelListener {

	final private ScrollPane bodyScrollPane;

    //creating the chart
    private Media media;
    private MediaPlayer mediaPlayer;
	final private VBox headerPane;
	final private Pane bodyPane;

	private IModelAdapter model;
	
	private static final int H_MARGIN = 8;
	private static final int V_MARGIN = 2;
	private static final Insets MARGIN_INSETS = new Insets(V_MARGIN, H_MARGIN, V_MARGIN, H_MARGIN);
	private static final Insets HALF_MARGIN_INSETS = new Insets(V_MARGIN, H_MARGIN / 2, V_MARGIN, H_MARGIN / 2);
	private static final Background HEADER_BACKGROUND = new Background(new BackgroundFill(Color.LIGHTGRAY, null, null));
	private static final Background BODY_BACKGROUND = new Background(new BackgroundFill(Color.WHITE, null, null));
	private static final Background TRANSPARENT_BACKGROUND = new Background(new BackgroundFill(Color.TRANSPARENT, null, null));
	private static final Paint LINE_PAINT = new Color(
		Color.LIGHTGRAY.getRed(),
		Color.LIGHTGRAY.getGreen(),
		Color.LIGHTGRAY.getBlue(),
		0.5);
	private static final Background LINE_BACKGROUND = new Background(new BackgroundFill(LINE_PAINT, null, null));

	public FxListener() {
		headerPane = new VBox();
		bodyPane = new Pane();
		bodyScrollPane = new ScrollPane(bodyPane);

		bodyScrollPane.setFitToWidth(true);
		bodyScrollPane.setFitToHeight(true);
		bodyScrollPane.setBorder(Border.EMPTY);
		bodyScrollPane.setBackground(BODY_BACKGROUND);
		bodyPane.setBackground(BODY_BACKGROUND);
		headerPane.setBackground(HEADER_BACKGROUND);
		setBackground(BODY_BACKGROUND);
		Text title = new Text("VideoGen Time Duration Graph");
		title.setFont(Font.font(5));
		headerPane.getChildren().add(title);
		getChildren().add(headerPane);
		getChildren().add(bodyScrollPane);
		setVisible(true);
	}
	
	/**
	 * Constructor purpose method only
	 */
	private void createMediaPlayer() {
		if (media != null) {
			bodyPane.getChildren().remove(media);
		}

		// create media player
		media = new Media((String) model.getExecutionResult());
		mediaPlayer = new MediaPlayer(media);
		mediaPlayer.setAutoPlay(true);
		// create mediaView and add media player to the viewer
		MediaView mediaView = new MediaView(mediaPlayer);
		bodyPane.getChildren().add(mediaView);
	}
	
	public void scale() {
		headerPane.minWidthProperty().bind(widthProperty());
		headerPane.maxWidthProperty().bind(widthProperty());
		bodyScrollPane.translateYProperty().bind(headerPane.heightProperty());
		bodyScrollPane.maxHeightProperty().bind(heightProperty().subtract(headerPane.heightProperty()));
		minHeightProperty().bind(headerPane.heightProperty().add(bodyScrollPane.heightProperty()));
		prefHeightProperty().bind(headerPane.heightProperty().add(bodyScrollPane.heightProperty()));
		maxHeightProperty().bind(headerPane.heightProperty().add(bodyScrollPane.heightProperty()));
	}
	
	public void refresh() {
		Platform.runLater(() -> {
			createMediaPlayer();
		});
	}

	@Override
	public void update() {
		this.refresh();
	}

	public void setModel(IModelAdapter modelAdapter) {
		this.model = modelAdapter;
	}
}

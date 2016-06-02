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
package org.irisa.diverse.live_modeling.views.constraint;

import javafx.application.Platform;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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

public class FxListener extends Pane {

	final private ScrollPane bodyScrollPane;

    //creating the chart
    final private NumberAxis xAxis;
    final private NumberAxis yAxis;
    final private LineChart<Number,Number> lineChart;
    final private ObservableList<Series<Number, Number>> data;
	final private VBox headerPane;
	final private Pane bodyPane;
	final private BooleanProperty displayGrid;

	private BooleanBinding displayGridBinding;
	
	private static final int H_MARGIN = 8;
	private static final int V_MARGIN = 2;
	private static final int DIAMETER = 24;
	private static final int V_HEIGHT = 8;
	private static final int UNIT = DIAMETER + 2 * H_MARGIN;
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

	@SuppressWarnings("unchecked")
	public FxListener() {
		headerPane = new VBox();
		bodyPane = new Pane();
		bodyScrollPane = new ScrollPane(bodyPane);
		displayGrid = new SimpleBooleanProperty();
		xAxis = new NumberAxis("X axis", 0, 20, 0.1);
	    yAxis = new NumberAxis("Y axis", 0, 50, 0.1);
		data = (ObservableList<Series<Number, Number>>) FXCollections.emptyObservableMap();
	    lineChart = new LineChart<Number,Number>(xAxis, yAxis, data);

		bodyScrollPane.setFitToWidth(true);
		bodyScrollPane.setFitToHeight(true);
		bodyScrollPane.setBorder(Border.EMPTY);
		bodyScrollPane.setBackground(BODY_BACKGROUND);
		bodyScrollPane.setVisible(false);
		bodyPane.setBackground(BODY_BACKGROUND);
		headerPane.setBackground(HEADER_BACKGROUND);
		setBackground(BODY_BACKGROUND);
		headerPane.minWidthProperty().bind(widthProperty());
		headerPane.maxWidthProperty().bind(widthProperty());
		lineChart.setBackground(TRANSPARENT_BACKGROUND);
		lineChart.setVisible(true);
		
		//defining the axes
        lineChart.setTitle("VideoGen Fake Monitoring");
        
        updateSeries();

		
		bodyPane.getChildren().add(lineChart);
		bodyScrollPane.translateYProperty().bind(headerPane.heightProperty());
		bodyScrollPane.maxHeightProperty().bind(heightProperty().subtract(headerPane.heightProperty()));

		getChildren().add(headerPane);
		getChildren().add(bodyScrollPane);
		minHeightProperty().bind(headerPane.heightProperty().add(bodyScrollPane.heightProperty()));
		prefHeightProperty().bind(headerPane.heightProperty().add(bodyScrollPane.heightProperty()));
		maxHeightProperty().bind(headerPane.heightProperty().add(bodyScrollPane.heightProperty()));
		setVisible(true);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void updateSeries() {
        Series series = new Series();
        series.setName("Series " + data.size());
        series.getData().addAll(
        	new Data(1, 23),
        	new Data(2, 14),
		    new Data(3, 15),
		    new Data(4, 24),
		    new Data(5, 34),
		    new Data(6, 36),
		    new Data(7, 22),
		    new Data(8, 45),
		    new Data(9, 43),
		    new Data(10, 17),
		    new Data(11, 29),
		    new Data(12, 25));
        data.add(series);
	}
	
	@SuppressWarnings("unchecked")
	public void refresh() {
		Platform.runLater(() -> {
			displayGrid.unbind();

			displayGridBinding = new BooleanBinding() {
				@Override
				protected boolean computeValue() {
					return false;
				}
			};

			updateSeries();

			displayGrid.bind(displayGridBinding);
		});
	}
}

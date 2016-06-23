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
package org.irisa.diverse.livemodeling.views.constraint;

import java.util.function.BiConsumer;
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

public class FxListener extends Pane implements IModelListener {

	final private ScrollPane bodyScrollPane;

    //creating the chart
    final private NumberAxis xAxis;
    final private NumberAxis yAxis;
    private LineChart<Number,Number> lineChart;
    private Series<Number, Number> series;
	final private VBox headerPane;
	final private Pane bodyPane;
	final private BooleanProperty displayGrid;

	private BooleanBinding displayGridBinding;

	private IModelAdapter model;
	
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

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public FxListener() {
		headerPane = new VBox();
		bodyPane = new Pane();
		bodyScrollPane = new ScrollPane(bodyPane);
		displayGrid = new SimpleBooleanProperty();

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

		xAxis = new NumberAxis();
		xAxis.setLabel("Durations");
	    yAxis = new NumberAxis();
		yAxis.setLabel("");
		createLineChart("VideoGen Fake Monitoring");
		series = new Series();
        series.setName("Series");
        updateSeries(false);

		
		getChildren().add(headerPane);
		getChildren().add(bodyScrollPane);
		setVisible(true);
	}
	
	/**
	 * Update the data
	 * 
	 * @param flushBefore (purge all previous data if true)
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void updateSeries(Boolean flushBefore) {

		System.out.println("Update series");
        if (model != null) {
        	System.out.println(model.getValues());
	        if (flushBefore) {
	        	// Remove only previous series
	        	lineChart.getData().remove(series);
	        	series = new Series();
	        }
	        model.getValues().forEach(new BiConsumer<Object, Object>() {
				@Override
				public void accept(Object key, Object value) {
					series.getData().add(new Data((Number)key, (Number)value));
				}
			});
	        lineChart.getData().add(series);
        }
	}
	
	/**
	 * Constructor purpose method only
	 */
	private void createLineChart(String name) {
		if (lineChart != null) {
			bodyPane.getChildren().remove(lineChart);
		}
		lineChart = new LineChart<Number, Number>(xAxis, yAxis);
        lineChart.setTitle(name);
		lineChart.setBackground(TRANSPARENT_BACKGROUND);
		lineChart.setVisible(true);
		lineChart.setCreateSymbols(false);
		bodyPane.getChildren().add(lineChart);
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
			displayGrid.unbind();

			displayGridBinding = new BooleanBinding() {
				@Override
				protected boolean computeValue() {
					return false;
				}
			};

			updateSeries(true);

			displayGrid.bind(displayGridBinding);
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

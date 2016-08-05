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
package org.irisa.diverse.livemodeling.views.sequenceConstraint;

import java.util.List;

import org.irisa.diverse.livemodeling.api.IView;
import org.irisa.diverse.livemodeling.views.IConstraintListener;

import javafx.application.Platform;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class SequenceListener extends Pane implements IConstraintListener {

    //creating the chart
    final private NumberAxis xAxis;
    final private NumberAxis yAxis;
    private LineChartWithMarkers<Number,Number> lineChart;
    private Series<Number, Number> series;
	final private VBox headerPane;
	final private Pane bodyPane;
	final private BooleanProperty displayGrid;
	final private IView view;

	private BooleanBinding displayGridBinding;
	
//	private static final int H_MARGIN = 2;
//	private static final int V_MARGIN = 2;
//	private static final Insets MARGIN_INSETS = new Insets(V_MARGIN, H_MARGIN, V_MARGIN, H_MARGIN);
//	private static final Insets HALF_MARGIN_INSETS = new Insets(V_MARGIN, H_MARGIN / 2, V_MARGIN, H_MARGIN / 2);
	private static final Background HEADER_BACKGROUND = new Background(new BackgroundFill(Color.LIGHTGRAY, null, null));
	private static final Background BODY_BACKGROUND = new Background(new BackgroundFill(Color.WHITE, null, null));
	private static final Background TRANSPARENT_BACKGROUND = new Background(new BackgroundFill(Color.TRANSPARENT, null, null));
//	private static final Paint LINE_PAINT = new Color(
//		Color.LIGHTGRAY.getRed(),
//		Color.LIGHTGRAY.getGreen(),
//		Color.LIGHTGRAY.getBlue(),
//		0.5);
//	private static final Background LINE_BACKGROUND = new Background(new BackgroundFill(LINE_PAINT, null, null));

	public SequenceListener(IView view) {
		this.view = view;
		headerPane = new VBox();
		bodyPane = new Pane();
		displayGrid = new SimpleBooleanProperty();

		bodyPane.setBackground(BODY_BACKGROUND);
		headerPane.setBackground(HEADER_BACKGROUND);
		setBackground(BODY_BACKGROUND);
		Text title = new Text("VideoGen Video Number");
		title.setFont(Font.font(8));
		headerPane.getChildren().add(title);

		xAxis = new NumberAxis();
		xAxis.setLabel("Execution states");
	    yAxis = new NumberAxis();
		yAxis.setLabel("Video Number");
		createLineChart();
		series = new Series<Number, Number>();
        updateSeries(false);
        
		getChildren().add(headerPane);
		getChildren().add(bodyPane);
		setVisible(true);
	}
	
	/**
	 * Update the data
	 * 
	 * @param flushBefore (purge all previous data if true)
	 */
	public void updateSeries(Boolean flushBefore) {

		System.out.println("************************************************************************");
		System.out.println("************************************************************************");
		System.out.println(this + "Update series");
        if (view.getModelAdapters().length > 0) {
	        if (flushBefore) {
		       	// Remove only previous series
		       	lineChart.getData().clear();
		       	series = new Series<Number, Number>();
	        }
	        List<Integer> datas = view.getValues();
	        for (Integer yAxis: datas) {
	        	Integer index = datas.indexOf(yAxis);
	        	Data<Number, Number> data = new Data<Number, Number>(index, yAxis);
	        	data.setNode(new HoveredThresholdNode(yAxis));
	        	series.getData().add(data);	
			}
		    lineChart.getData().add(series);
		    //lineChart.setMin(xAxis.getLowerBound());
		    //lineChart.setMax(xAxis.getUpperBound());
        }
        System.out.println(lineChart.getData());
	}
	
	/**
	 * Constructor purpose method only
	 */
	public void createLineChart() {
		if (lineChart != null) {
			bodyPane.getChildren().remove(lineChart);
		}
		lineChart = new LineChartWithMarkers<Number, Number>(xAxis, yAxis);
		lineChart.autosize();
		lineChart.setLegendVisible(false);
		lineChart.setBackground(TRANSPARENT_BACKGROUND);
		lineChart.setVisible(true);
		lineChart.setCreateSymbols(false);
		Data<Number, Number> verticalRangeMarker = new Data<>(50, 320);
		lineChart.addVerticalRangeMarker(verticalRangeMarker);
		bodyPane.getChildren().add(lineChart);
	}
	
	public void scale() {
		headerPane.minWidthProperty().bind(widthProperty());
		headerPane.maxWidthProperty().bind(widthProperty());
		bodyPane.translateYProperty().bind(headerPane.heightProperty());
		bodyPane.maxWidthProperty().bind(widthProperty().subtract(headerPane.widthProperty()));
		lineChart.minHeightProperty().bind(heightProperty().subtract(headerPane.heightProperty()));
		lineChart.maxHeightProperty().bind(heightProperty().subtract(headerPane.heightProperty()));
		lineChart.minWidthProperty().bind(widthProperty());
		lineChart.prefWidthProperty().bind(widthProperty());
		lineChart.maxWidthProperty().bind(widthProperty());
	}
	
	private void refresh() {
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
		this.scale();
		this.refresh();
	}

	@Override
	public NumberAxis getxAxis() {
		return xAxis;
	}

	@Override
	public NumberAxis getyAxis() {
		return yAxis;
	}
}

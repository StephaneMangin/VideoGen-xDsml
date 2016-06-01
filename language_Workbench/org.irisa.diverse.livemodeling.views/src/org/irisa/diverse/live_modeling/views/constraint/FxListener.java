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
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Border;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class FxListener extends Pane {

	final private ScrollPane bodyScrollPane;

    //creating the chart
    final NumberAxis xAxis = new NumberAxis();
    final NumberAxis yAxis = new NumberAxis();
    final LineChart<Number,Number> lineChart = 
            new LineChart<Number,Number>(xAxis,yAxis);
    
	final private VBox headerPane;

	final private Pane bodyPane;

	final private BooleanProperty displayGrid;

	private BooleanBinding displayGridBinding;

	public FxListener() {
		headerPane = new VBox();
		bodyPane = new Pane();
		bodyScrollPane = new ScrollPane(bodyPane);
		displayGrid = new SimpleBooleanProperty();

		bodyScrollPane.setFitToWidth(true);
		bodyScrollPane.setBorder(Border.EMPTY);
		bodyScrollPane.setVisible(false);

		headerPane.minWidthProperty().bind(widthProperty());
		headerPane.maxWidthProperty().bind(widthProperty());

		//defining the axes
        xAxis.setLabel("Number of Month");
                
        lineChart.setTitle("Stock Monitoring, 2010");
        //defining a series
        //populating the series with data
        resetSeries();
		
		bodyPane.getChildren().add(lineChart);
		bodyScrollPane.translateYProperty().bind(headerPane.heightProperty());
		bodyScrollPane.maxHeightProperty().bind(heightProperty().subtract(headerPane.heightProperty()));

		getChildren().add(headerPane);
		getChildren().add(bodyScrollPane);
		minHeightProperty().bind(headerPane.heightProperty().add(bodyScrollPane.heightProperty()));
		prefHeightProperty().bind(headerPane.heightProperty().add(bodyScrollPane.heightProperty()));
		maxHeightProperty().bind(headerPane.heightProperty().add(bodyScrollPane.heightProperty()));
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void resetSeries() {
		lineChart.getData().clear();
        Series series = new Series();
        series.setName("Series");
        series.getData().add(new Data(1, 23));
        series.getData().add(new Data(2, 14));
        series.getData().add(new Data(3, 15));
        series.getData().add(new Data(4, 24));
        series.getData().add(new Data(5, 34));
        series.getData().add(new Data(6, 36));
        series.getData().add(new Data(7, 22));
        series.getData().add(new Data(8, 45));
        series.getData().add(new Data(9, 43));
        series.getData().add(new Data(10, 17));
        series.getData().add(new Data(11, 29));
        series.getData().add(new Data(12, 25));
        
        lineChart.getData().add(series);
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

			resetSeries();

			displayGrid.bind(displayGridBinding);
		});
	}
}

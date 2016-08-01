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

import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

import org.irisa.diverse.livemodeling.api.IModelListener;
import org.irisa.diverse.livemodeling.api.IView;

import javafx.application.Platform;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.Cursor;
import javafx.scene.chart.Axis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class ConstraintListener extends Pane implements IModelListener {

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

	public ConstraintListener(IView view) {
		this.view = view;
		headerPane = new VBox();
		bodyPane = new Pane();
		displayGrid = new SimpleBooleanProperty();

		bodyPane.setBackground(BODY_BACKGROUND);
		headerPane.setBackground(HEADER_BACKGROUND);
		setBackground(BODY_BACKGROUND);
		Text title = new Text("VideoGen Time Durations");
		title.setFont(Font.font(8));
		headerPane.getChildren().add(title);

		xAxis = new NumberAxis();
		xAxis.setLabel("Execution states");
	    yAxis = new NumberAxis();
		yAxis.setLabel("Durations");
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
	private void updateSeries(Boolean flushBefore) {

		System.out.println("Update series");
        if (view.getModelAdapters().length > 0) {
        	IModelConstraintAdapter model = (IModelConstraintAdapter) view.getModelAdapters()[0];
	        if (model != null) {
	        	if (flushBefore) {
		        	// Remove only previous series
		        	lineChart.getData().clear();
		        	series = new Series<Number, Number>();
		        }
	        	List<Integer> datas = model.getStatisticalValues(); 
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
        }
        System.out.println(lineChart.getData());
	}
	
	/**
	 * Constructor purpose method only
	 */
	private void createLineChart() {
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

	/**
	 * New Line Chart which allows a subset selection from values
	 * 
	 * @author stephane
	 *
	 * @param <X>
	 * @param <Y>
	 */
    private class LineChartWithMarkers<X, Y> extends LineChart<X, Y> {

        private ObservableList<Data<X, X>> verticalRangeMarkers;
        private Data<X, X> currentMarker;
        private X minValue;
        private X maxValue;

        public LineChartWithMarkers(Axis<X> xAxis, Axis<Y> yAxis) {
            super(xAxis, yAxis);
            setOnMouseClicked(new SymbolsHandler(this));
            setVisible(true);
            verticalRangeMarkers = FXCollections.observableArrayList(data -> new Observable[] {data.XValueProperty()});
            verticalRangeMarkers = FXCollections.observableArrayList(data -> new Observable[] {data.YValueProperty()}); // 2nd type of the range is X type as well
            verticalRangeMarkers.addListener((InvalidationListener)observable -> this.layoutPlotChildren());
        }
        
        public void addVerticalRangeMarker(Data<X, X> marker) {
            Objects.requireNonNull(marker, "the marker must not be null");
            if (verticalRangeMarkers.contains(marker)) return;

            Rectangle rectangle = new Rectangle(0,0,0,0);
            rectangle.setStroke(Color.TRANSPARENT);
            rectangle.setFill(Color.BLUE.deriveColor(1, 1, 1, 0.2));

            marker.setNode( rectangle);

            getPlotChildren().add(rectangle);
            verticalRangeMarkers.add(marker);
            currentMarker = marker;
        }

        public void removeVerticalRangeMarker() {
            if (currentMarker != null) {
            	if (currentMarker.getNode() != null) {
                    getPlotChildren().remove(currentMarker.getNode());
                    currentMarker.setNode(null);
                }
                verticalRangeMarkers.remove(currentMarker);	
            }
        }

        public void setMin(X x) {
        	removeVerticalRangeMarker();
        	addVerticalRangeMarker(new Data<X, X>(x, maxValue));
        	minValue = x;
        }
        
        public void setMax(X x) {
        	removeVerticalRangeMarker();
        	addVerticalRangeMarker(new Data<>(minValue, x));
        	maxValue = x;
        }
        
        @Override
        protected void layoutPlotChildren() {
            super.layoutPlotChildren();
            for (Data<X, X> verticalRangeMarker : verticalRangeMarkers) {
                Rectangle rectangle = (Rectangle) verticalRangeMarker.getNode();
                rectangle.setX( getXAxis().getDisplayPosition(verticalRangeMarker.getXValue()) + 0.5);  // 0.5 for crispness
                rectangle.setWidth( getXAxis().getDisplayPosition(verticalRangeMarker.getYValue()) - getXAxis().getDisplayPosition(verticalRangeMarker.getXValue()));
                rectangle.setY(0d);
                rectangle.setHeight(getBoundsInLocal().getHeight());
                rectangle.toBack();
            }   
        }

		private class SymbolsHandler implements EventHandler< MouseEvent > {
	    	private LineChartWithMarkers<X, Y> lineChart;

	    	public SymbolsHandler( LineChartWithMarkers<X, Y> lineChartWithMarkers ) {
	    		this.lineChart = lineChartWithMarkers;
	    	}    
	    	@Override
	    	public void handle( MouseEvent event ) {
	    		if( event.getEventType() == MouseEvent.MOUSE_CLICKED ) {
	    			//we want these in the axis coordinate frame
		    		Point2D pointInScene = new Point2D(event.getSceneX(), event.getSceneY());
	                double xAxisLoc = xAxis.sceneToLocal(pointInScene).getX();
    				@SuppressWarnings("unchecked")
					X x =  (X) xAxis.getValueForDisplay(xAxisLoc);
	    			if (event.getButton() == MouseButton.PRIMARY) {
	    				lineChart.setMin(x);
	    			} else if (event.getButton() == MouseButton.SECONDARY) {
	    				lineChart.setMax(x);
	    			}
	    		}
	    		event.consume();
	    	}
	    }
    }
    
    /** a node which displays a value on hover, but is otherwise empty
     * 
     * @author stephane
     *
     */
    class HoveredThresholdNode extends StackPane {
      HoveredThresholdNode(int value) {
        setPrefSize(3, 3);

        final Label label = createDataThresholdLabel(value);

        setOnMouseEntered(new EventHandler<MouseEvent>() {
          @Override public void handle(MouseEvent mouseEvent) {
            getChildren().setAll(label);
            setCursor(Cursor.NONE);
            toFront();
          }
        });
        setOnMouseExited(new EventHandler<MouseEvent>() {
          @Override public void handle(MouseEvent mouseEvent) {
            getChildren().clear();
            setCursor(Cursor.CROSSHAIR);
          }
        });
      }

      private Label createDataThresholdLabel(int value) {
        final Label label = new Label(value + "");
        label.getStyleClass().addAll("default-color0", "chart-line-symbol", "chart-series-line");
        label.setStyle("-fx-font-size: 10;");
        label.setTextFill(Color.DARKGRAY);
        label.setMinSize(Label.USE_PREF_SIZE, Label.USE_PREF_SIZE);
        return label;
      }
    }
}

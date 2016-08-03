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
package org.irisa.diverse.livemodeling.views;

import java.util.Objects;

import org.irisa.diverse.livemodeling.api.IModelListener;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.Cursor;
import javafx.scene.chart.Axis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public interface IConstraintListener extends IModelListener {
	
	/**
	 * Update the data
	 * 
	 * @param flushBefore (purge all previous data if true)
	 */
	void updateSeries(Boolean flushBefore);
	
	/**
	 * Constructor purpose method only
	 */
	void createLineChart();
	
	void scale();
	
	void update();

	NumberAxis getxAxis();
	NumberAxis getyAxis();

	/**
	 * New Line Chart which allows a subset selection from values
	 * 
	 * @author stephane
	 *
	 * @param <X>
	 * @param <Y>
	 */
    class LineChartWithMarkers<X, Y> extends LineChart<X, Y> {

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
	                double xAxisLoc = getXAxis().sceneToLocal(pointInScene).getX();
    				X x =  (X) getXAxis().getValueForDisplay(xAxisLoc);
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
      public HoveredThresholdNode(int value) {
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

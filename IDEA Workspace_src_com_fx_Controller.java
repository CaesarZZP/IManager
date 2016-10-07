package com.fx;

import com.pojo.DailyEvent;
import com.test.*;
import com.test.Main;
import com.util.Util;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.chart.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

import java.io.IOException;

public class Controller {
     @FXML Pane fxPane;

    @FXML
    public void goToPane1(ActionEvent event) throws IOException{
        fxPane.getChildren().clear();
        fxPane.getChildren().add((Pane)FXMLLoader.load(getClass().getResource("samplePane1.fxml")));
    }

    @FXML
    public void goToPane2(ActionEvent event) throws IOException{
        fxPane.getChildren().clear();
        fxPane.getChildren().add((Pane)FXMLLoader.load(getClass().getResource("samplePane2.fxml")));
    }

    @FXML
    public void goToPane3(ActionEvent event){
        final String sun = "Sun.";
        final String mon = "Mon.";
        final String tues = "Tues.";
        final String wed = "Wed.";
        final String thur = "Thur.";
        final String fri = "Fri.";
        final String sat = "Sat.";
        final NumberAxis xAxis = new NumberAxis();
        final CategoryAxis yAxis = new CategoryAxis();
        final BarChart<String,Number> bc =
                new BarChart(yAxis,xAxis);
        bc.setTitle("Week Analysis");
        xAxis.setLabel("Money");
        xAxis.setTickLabelRotation(90);
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Consume");
        series1.getData().add(new XYChart.Data(sun, 30));
        series1.getData().add(new XYChart.Data(mon,44.5));
        series1.getData().add(new XYChart.Data(tues,66.4));
        series1.getData().add(new XYChart.Data(thur,89));
        series1.getData().add(new XYChart.Data(fri,30.8));
        series1.getData().add(new XYChart.Data(sat,20.9));

        bc.setPrefSize(800,600);
        bc.setLayoutX(80);
        bc.setLayoutY(50);
        bc.getData().addAll(series1);
        fxPane.getChildren().clear();
        fxPane.getChildren().add(bc);

    }

    @FXML
    public void goToPane4(ActionEvent event){
        Button bn = new Button("  ");
        final CategoryAxis xAxis= new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final LineChart<String,Number> lineChart =
                new LineChart<String,Number>(xAxis,yAxis);
        lineChart.setTitle("Month  Analysis");
        XYChart.Series series = new XYChart.Series();
        series.setName("My Consume");

        series.getData().add(new XYChart.Data("Week1", 120.8));
        series.getData().add(new XYChart.Data("Week2", 150.3));
        series.getData().add(new XYChart.Data("Week3", 100));
        series.getData().add(new XYChart.Data("Week4", 99.8));

        lineChart.setPrefSize(800,600);
        lineChart.setLayoutX(80);
        lineChart.setLayoutY(50);
        bn.setLayoutX(900);
        bn.setLayoutY(50);
        lineChart.getData().add(series);
        fxPane.getChildren().clear();
        fxPane.getChildren().add(lineChart);
        fxPane.getChildren().add(bn);

    }




}

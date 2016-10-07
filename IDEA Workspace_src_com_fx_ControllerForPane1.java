package com.fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Caesar on 2016/9/10.
 */
public class ControllerForPane1 {
    @FXML
    Button fxButton1InPane1;
    @FXML
    Button fxButton2InPane1;

    @FXML
    public void action1(ActionEvent event) throws IOException{
       Stage window1 = new Stage();
        window1.initModality(Modality.NONE);
        window1.initModality(Modality.APPLICATION_MODAL);//不可关闭，永远在窗户最前面
//        window1.initStyle(StageStyle.TRANSPARENT);//无窗体-----无窗体之后无法为无法移动pane
        BorderPane borderPane = (BorderPane) FXMLLoader.load(getClass().getResource("samplePane1DialogA.fxml"));
        Scene scene = new Scene(borderPane,630,600);
        window1.setScene(scene);
        Image image = new Image("com/image/imageIcon.png");
        window1.getIcons().add(image);
        window1.show();

    }
@FXML
    public void action2() throws Exception{
    Stage window2 = new Stage();
    window2.initModality(Modality.APPLICATION_MODAL);
//    window2.initStyle(StageStyle.TRANSPARENT);
    FlowPane flowPane = (FlowPane)FXMLLoader.load(getClass().getResource("samplePane1DialogB.fxml"));
    Scene scene = new Scene(flowPane,636,680);
    window2.setScene(scene);
    Image image = new Image("com/image/imageIcon.png");
    window2.getIcons().add(image);
    window2.show();

}

}

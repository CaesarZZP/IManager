package com.fx;



import com.pojo.DailyCost;
import com.pojo.DailyEvent;
import  com.test.Main;
import com.util.Util;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.awt.*;
import java.io.IOException;

/**
 * Created by Caesar on 2016/9/13.
 */
public class ControllerForPane1DialogA {
    @FXML
    Button fxDialogAButtonTrue;
    @FXML
    Button fxDialogAButtonFalse;
    @FXML
    TextArea fxDialogAText1;
    @FXML
    TextField fxDialogAText2;

    DailyEvent dailyEvent = new DailyEvent();

    @FXML
    public void actionTrue() throws IOException {

                    if (fxDialogAText1.getText().trim().isEmpty() || fxDialogAText2.getText().trim().isEmpty()) {
                        Alert fail = new Alert(Alert.AlertType.ERROR);
                        fail.setHeaderText("错误");
                        fail.setContentText("输入框中内容不能为空 ！");
                        fail.showAndWait();
                    } else {
                        dailyEvent.setDetials(fxDialogAText1.getText());
                        dailyEvent.setDailycost(Double.parseDouble(fxDialogAText2.getText()));
                        dailyEvent.setDay(Util.day);
                        dailyEvent.setMonth(Util.month);
                        Main.dailyCostStack.push(dailyEvent);
                        com.util.Util.saveDate();
                        fxDialogAButtonTrue.getScene().getWindow().hide();
                    }
    }



    @FXML
    public void actionFalse() throws Exception {
           fxDialogAButtonFalse.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if(event.getClickCount()==1){
                fxDialogAButtonFalse.getScene().getWindow().hide();
                }
            }
        });
    }
}


package com.fx;

import com.btr.proxy.util.Logger;
import com.pojo.DailyEvent;
import com.test.*;
import com.test.Main;
import com.util.Util;
import groovy.util.logging.Log;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * Created by Caesar on 2016/9/13.
 */
public class ControllerForPane1DialogB {
    @FXML
    Button fxPane1DialogBButtonTrue;
    @FXML
    Button fxPane1DialogBButtonFalse;
    @FXML
    TextArea fxDialogBText1;
    @FXML
    TextField fxDialogBText2;
    @FXML
    TextArea fxDialogBText3;
    DailyEvent dailyEvent = new DailyEvent();
    @FXML
    public void actionTrue() throws  Exception{
//       fxPane1DialogBButtonTrue.setOnMouseClicked(new EventHandler<MouseEvent>() {
//           @Override
//           public void handle(MouseEvent event) {
//               if(event.getClickCount()==1){
//                   if (fxDialogBText1.getText().trim().isEmpty()||fxDialogBText2.getText().trim().isEmpty()){
//                       Alert fail = new Alert(Alert.AlertType.ERROR);
//                       fail.setHeaderText("错误");
//                       fail.setContentText("请输入相应的内容 ！");
//                       fail.showAndWait();
//                   }
//                   else {
//                       dailyEvent.setMonth(Util.month);
//                       dailyEvent.setDay(Util.day);
//                       dailyEvent.setEvent(fxDialogBText1.getText());
//                       dailyEvent.setEventCost(Double.parseDouble(fxDialogBText2.getText()));
//                       dailyEvent.setNote(fxDialogBText3.getText());
//                       new Thread(new Runnable() {
//                           @Override
//                           public void run() {
//                               try{
//                                   com.util.Util.readDate();
//                                   Main.dailyCostStack.push(dailyEvent);
//                                   com.util.Util.saveDate();
//                               }
//                               catch (Exception e){
//                                   e.printStackTrace();
//                               }
//
//                           }
//                       });
//
//                       System.out.println(dailyEvent.getMonth() + "月    " + dailyEvent.getDay() + "日   " + dailyEvent.getEvent()+ "   花费了 " + dailyEvent.getEventCost() + "   备注 ：" + dailyEvent.getNote());
//                       fxPane1DialogBButtonTrue.getScene().getWindow().hide();
//                   }
//               }
//           }
//       });
        if (fxDialogBText1.getText().trim().isEmpty()||fxDialogBText2.getText().trim().isEmpty()){
                       Alert fail = new Alert(Alert.AlertType.ERROR);
                       fail.setHeaderText("错误");
                       fail.setContentText("请输入相应的内容 ！");
                       fail.showAndWait();
                   }
                   else {
                       dailyEvent.setMonth(Util.month);
                       dailyEvent.setDay(Util.day);
                       dailyEvent.setEvent(fxDialogBText1.getText());
                       dailyEvent.setEventCost(Double.parseDouble(fxDialogBText2.getText()));
                       dailyEvent.setNote(fxDialogBText3.getText());
                       Main.dailyCostStack.push(dailyEvent);
                       com.util.Util.saveDate();
                       fxPane1DialogBButtonTrue.getScene().getWindow().hide();
                }
    }


    @FXML
    public void actionFalse(){
    fxPane1DialogBButtonFalse.setOnMouseClicked(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent event) {
            if(event.getClickCount()==1){
                fxPane1DialogBButtonFalse.getScene().getWindow().hide();
            }
        }
    });
    }
}

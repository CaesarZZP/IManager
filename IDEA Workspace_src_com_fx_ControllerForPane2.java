package com.fx;

import com.intellij.codeInsight.actions.FormatChangedTextUtil;
import com.intellij.codeInsight.navigation.BackgroundUpdaterTask;
import com.intellij.debugger.impl.descriptors.data.LocalData;
import com.intellij.util.text.DateFormatUtil;
import com.pojo.DailyEvent;
import com.test.*;
import com.util.Util;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * Created by Caesar on 2016/9/14.
 */
public class ControllerForPane2 {
    @FXML
    ListView fxPane2ListView;
    @FXML
    DatePicker fxPane2DateChooser;
    @FXML
    Button fxSearchButton;


    @FXML
    public String[] pickTime(){
        String timeFromPicker = fxPane2DateChooser.getEditor().getText().toString();
//        System.out.println(string);
        String[] array=timeFromPicker.split("-");
        String month=array[1];
        String day=array[2];
        return array;
    }
    @FXML
    public void search() throws Exception{
        ObservableList<String> items = FXCollections.observableArrayList();
        String[] time= pickTime();
       int searchMonth = Integer.parseInt(time[1]);
        int searchDay = Integer.parseInt(time[2]);
        Util.readDate();
        for (DailyEvent test:com.test.Main.dailyCostStack
             ) {
            if(test.getDay()==searchDay&&test.getMonth()==searchMonth){
                //该天只有日常消费
                if (test.getEvent()==null){
                    items.add("当天消费：   " + test.getDetials() +"      消费金额:   " + test.getDailycost());
                }
                //该天有活动消费
                else if(test.getDetials()==null){
                    items.add("活动：   "+test.getEvent()+"     活动消费：  "+test.getEventCost()+"    活动备注：  "+test.getNote());
                }
            }

        }
        fxPane2ListView.setItems(items);
    }


}

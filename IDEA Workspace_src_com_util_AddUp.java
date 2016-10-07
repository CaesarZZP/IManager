package com.util;


import java.util.Calendar;
import java.util.Stack;

import com.pojo.DailyCost;
import com.pojo.DailyEvent;
import com.pojo.FinalTotalAnalyse;
import com.pojo.TotalAnalyse;
import com.test.Main;

/**
 * Created by Caesar on 2016/9/11.
 */

/**
 * 这是一个计算数据的类
 * @author Caesar
 *
 */
public class AddUp {

    public static TotalAnalyse totalAnalyse = new TotalAnalyse();
    /**
     * add up每天的消费总额
     */
    public static void addUpDaily(){
        totalAnalyse.setInstantMonth(Util.month);
        totalAnalyse.setInstantDay(Util.day);
        double dailyTotal = 0;
        for (DailyEvent test:Main.dailyCostStack
             ) {
            if(test.getMonth()==totalAnalyse.getInstantMonth()&&test.getDay()==totalAnalyse.getInstantDay()){
                //日常消费的加法
                if(test.getEvent()==null){
                    dailyTotal+=test.getDailycost();
                }
                else {
                    dailyTotal+=test.getEventCost();
                }
            }
        }
        totalAnalyse.setDailyTotal(dailyTotal);
        }


    /**
     * 星期消费,星期六时自动添加到FinalTotalAnalyse类中
     */
    public static void addUpWeek()throws  Exception{
        totalAnalyse.setInstantDayOfWeek(Util.dayOfWeek);
        totalAnalyse.setInstantWeekOfMonth(Util.weekOfMonth);
        int dayOfWeek = Util.calendar.get(Calendar.DAY_OF_WEEK);
        Stack<TotalAnalyse> totalAnalyseStackTest = Main.totalAnalyseStack;
        double weekTotal = 0;
        while(dayOfWeek > 0)
        {
            weekTotal += totalAnalyseStackTest.pop().getDailyTotal();
            totalAnalyseStackTest.pop();
            dayOfWeek--;
        }
        totalAnalyse.setWeekTotal(weekTotal);
        if(isSaturday())
        {
            FinalTotalAnalyse finalTotalAnalyse = new FinalTotalAnalyse();
            finalTotalAnalyse.setMonthFlag(totalAnalyse.getInstantMonth());
            finalTotalAnalyse.setWeekOfMonthFlag(totalAnalyse.getInstantWeekOfMonth());
            finalTotalAnalyse.setWeekFinalTotal(weekTotal);
            Main.finalTotalAnalyseList.add(finalTotalAnalyse);
            com.util.Util.saveFinalTotalDate();
        }
        Main.totalAnalyseStack.add(totalAnalyse);
    }

    /**
     * 判断是不是星期六
     * @return
     */
    public static boolean isSaturday(){
        if(Util.calendar.get(Calendar.DAY_OF_WEEK)- 1 ==6)//判断是不是星期天
            return true;
        else
            return false;
    }
}

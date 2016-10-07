package com.pojo;

import java.io.Serializable;

/**
 * Created by Caesar on 2016/9/11.
 */
public class TotalAnalyse implements Serializable{
    private int instantDay;//用于加法当天的总消费
    private int instantMonth;//哪个月
    private int instantWeekOfMonth;//当天是属于这个月的哪个星期
    private int instantDayOfWeek;//当天是属于这个月的这个星期的星期几
    private double dailyTotal = 0;//日消费总额
    private double weekTotal = 0;//星期消费总额



    public int getInstantDay() {
        return instantDay;
    }
    public void setInstantDay(int instantDay) {
        this.instantDay = instantDay;
    }
    public int getInstantMonth() {
        return instantMonth;
    }
    public void setInstantMonth(int instantMonth) {
        this.instantMonth = instantMonth;
    }
    public int getInstantDayOfWeek() {
        return instantDayOfWeek;
    }
    public void setInstantDayOfWeek(int instantDayOfWeek) {
        this.instantDayOfWeek = instantDayOfWeek;
    }
    public int getInstantWeekOfMonth() {
        return instantWeekOfMonth;
    }
    public void setInstantWeekOfMonth(int instantWeekOfMonth) {
        this.instantWeekOfMonth = instantWeekOfMonth;
    }
    public double getDailyTotal() {
        return dailyTotal;
    }
    public void setDailyTotal(double dailyTotal) {
        this.dailyTotal = dailyTotal;
    }
    public double getWeekTotal() {
        return weekTotal;
    }
    public void setWeekTotal(double weekTotal) {
        this.weekTotal = weekTotal;
    }

}


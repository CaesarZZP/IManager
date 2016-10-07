package com.pojo;


import java.io.Serializable;

/**
 * Created by Caesar on 2016/9/11.
 */
public class FinalTotalAnalyse implements Serializable{
    private int monthFlag;//哪个月
    private int weekOfMonthFlag;//这个月的哪个星期
    private double weekFinalTotal = 0;

    public int getMonthFlag() {
        return monthFlag;
    }
    public void setMonthFlag(int monthFlag) {
        this.monthFlag = monthFlag;
    }
    public int getWeekOfMonthFlag() {
        return weekOfMonthFlag;
    }
    public void setWeekOfMonthFlag(int weekOfMonthFlag) {
        this.weekOfMonthFlag = weekOfMonthFlag;
    }
    public double getWeekFinalTotal() {
        return weekFinalTotal;
    }
    public void setWeekFinalTotal(double weekFinalTotal) {
        this.weekFinalTotal = weekFinalTotal;
    }
}


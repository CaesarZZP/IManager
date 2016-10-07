package com.pojo;


import java.io.Serializable;

/**
 * Created by Caesar on 2016/9/11.
 */
public class DailyCost implements Serializable{

    private int month;
    private int day;
    private String details;
    private double dailyCost;
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public String getDetials() {
        return details;
    }
    public void setDetials(String detials) {
        this.details = detials;
    }
    public double getDailycost() {
        return dailyCost;
    }
    public void setDailycost(double dailycost) {
        this.dailyCost = dailycost;
    }

}


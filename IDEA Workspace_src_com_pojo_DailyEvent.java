package com.pojo;


import java.io.Serializable;

/**
 * Created by Caesar on 2016/9/11.
 */
public class DailyEvent extends DailyCost implements Serializable{
        private String event;
        private double eventCost;
        private String note;
    public String getEvent() {
        return event;
    }
    public void setEvent(String event) {
        this.event = event;
    }
    public double getEventCost() {
        return eventCost;
    }
    public void setEventCost(double eventCost) {
        this.eventCost = eventCost;
    }
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }
}

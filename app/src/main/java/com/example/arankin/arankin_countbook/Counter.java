package com.example.arankin.arankin_countbook;

import org.joda.time.LocalDate;

import java.util.Date;



/**
 * Created by arankin on 9/8/17.
 */

public class Counter {
    public int initialValue;
    public int currentValue;
    //public org.joda.time.LocalDate lastModifyDate;

    public Date date;
    public String counterName;
    public String comment;

    public Counter(int initalValue,String counterName){
        this.initialValue = initalValue;
        this.currentValue = initalValue;
        this.counterName = counterName;
        //this.lastModifyDate = new org.joda.time.LocalDate();
    }

    public Counter(int value,String counterName, String comment){
        this.initialValue = value;
        this.currentValue = value;
        this.counterName = counterName;
        this.comment = comment;
        //this.lastModifyDate = new org.joda.time.LocalDate();

    }

    public void incrementValue(){
        currentValue++;
        //this.lastModifyDate = new org.joda.time.LocalDate();
    }

    public void decrementValue(){
        if (currentValue >= 1)
            currentValue--;
        //this.lastModifyDate = new org.joda.time.LocalDate();
    }

    public void setCurrentValue(int newValue){
        currentValue = newValue;
        //this.lastModifyDate = new org.joda.time.LocalDate();
    }

    public void resetCurrentValue(){
        currentValue = initialValue;
        //this.lastModifyDate = new org.joda.time.LocalDate();
    }

    public int getCurrentValue(){
        return currentValue;
    }

    public int getInitialValue() { return initialValue; }

    public void setInitialValue(int initialValue) {
        this.initialValue = initialValue;
        //this.lastModifyDate = new org.joda.time.LocalDate();
    }

    //public LocalDate getLastModifyDate(){
      //  return lastModifyDate;
    //}

    public void setCounterName(String newName){
        counterName = newName;
    }

    public String getCounterName() { return this.counterName; }

    public String getComment() { return this.comment; }

    public void setComment(String newComment){
        comment = newComment;
    }




}

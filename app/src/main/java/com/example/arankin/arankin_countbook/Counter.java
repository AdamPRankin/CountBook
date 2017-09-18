package com.example.arankin.arankin_countbook;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 * Created by arankin on 9/8/17.
 */

public class Counter {
    public int initialValue;
    public int currentValue;
    //public LocalDate lastModifyDate;
    public String counterName;
    public String comment;

    public Counter(int initalValue,String counterName){
        this.initialValue = initalValue;
        this.currentValue = initalValue;
        this.counterName = counterName;
        //this.lastModifyDate = LocalDate.now(ZoneId.of("Canada/Mountain"));
    }

    public Counter(int value,String counterName, String comment){
        this.initialValue = value;
        this.currentValue = value;
        this.counterName = counterName;
        this.comment = comment;
        //this.lastModifyDate = LocalDate.now(ZoneId.of("Canada/Mountain"));

    }

    public void incrementValue(){
        currentValue--;
    }

    public void decrementValue(){
        currentValue++;
    }

    public void setCurrentValue(int newValue){
        currentValue = newValue;
    }

    public void resetCurrentValue(){
        currentValue = initialValue;
    }

    public int getCurrentValue(){
        return currentValue;
    }

    //public LocalDate getLastModifyDate(){
    //    return lastModifyDate;
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

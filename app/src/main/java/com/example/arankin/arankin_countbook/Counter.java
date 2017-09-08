package com.example.arankin.arankin_countbook;

import java.time.LocalDate;
import java.util.Date;

/**
 * Created by arankin on 9/8/17.
 */

public class Counter {
    public int initialValue;
    public int currentValue;
    public Date lastModifyDate;
    public String counterName;
    public String comment;

    public Counter(int initalValue,String counterName){
        this.initialValue = initalValue;
        this.currentValue = initalValue;
        this.counterName = counterName;
    }

    public Counter(int initalValue,String counterName, String comment){
        this.initialValue = initialValue;
        this.currentValue = initialValue;
        this.counterName = counterName;
        this.comment = comment;
        this.lastModifyDate = lastModifyDate;

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

    public Date getLastModifyDate(){
        return lastModifyDate;
    }

    public void setCounterName(String newName){
        counterName = newName;
    }

    public void setComment(String newComment){
        comment = newComment;
    }




}

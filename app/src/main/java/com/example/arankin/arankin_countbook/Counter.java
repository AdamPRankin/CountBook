package com.example.arankin.arankin_countbook;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by arankin on 9/8/17.
 */

public class Counter {
    public int initialValue;
    public int currentValue;
    public String date;
    public String counterName;
    public String comment;

    public Counter(int initalValue,String counterName){
        this.initialValue = initalValue;
        this.currentValue = initalValue;
        this.counterName = counterName;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(new Date());
        this.date = date;
    }

    public Counter(int value,String counterName, String comment){
        this.initialValue = value;
        this.currentValue = value;
        this.counterName = counterName;
        this.comment = comment;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(new Date());
        this.date = date;

    }

    public void incrementValue(){
        currentValue++;
        setDate();
    }

    public void decrementValue(){
        if (currentValue >= 1)
            currentValue--;
        setDate();
    }

    public void setCurrentValue(int newValue){
        currentValue = newValue;
        setDate();
    }

    public void resetCurrentValue(){
        currentValue = initialValue;
        setDate();
    }

    public int getCurrentValue(){
        return currentValue;
    }

    public int getInitialValue() { return initialValue; }

    public void setInitialValue(int initialValue) {
        this.initialValue = initialValue;
        setDate();
    }

    public String getDate() {
        return date;
    }

    public void setDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(new Date());
        this.date = date;

    }

    public void setCounterName(String newName){
        counterName = newName;
    }

    public String getCounterName() { return this.counterName; }

    public String getComment() { return this.comment; }

    public void setComment(String newComment){
        comment = newComment;
    }





}

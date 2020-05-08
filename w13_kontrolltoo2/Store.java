package com.company.app;

public class Store {
    private String name;
    private int openingTime;
    private int closingTime;
    private int numberOfVisits;
    private boolean isOpened;

    public Store(String name, int openingTime, int closingTime){
        this.name = name;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        numberOfVisits = 0;
    }

    public String getName(){
        return name;
    }

    public boolean isOpened(int time){
        if(openingTime <= time && time <= closingTime){
            return true;
        } else{
            return false;
        }
    }

    public int getNumberOfVisits(){
        return numberOfVisits;
    }

    public void goToStore(){
        numberOfVisits++;
    }
}

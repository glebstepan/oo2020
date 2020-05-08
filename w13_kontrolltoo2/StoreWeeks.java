package com.company.app;


// Klass iga nädalapäeva lahtiolekuaja lisamiseks
public class StoreWeeks {

    String name;
    int monOpeningTime;
    int monClosingTime;
    int tueOpeningTime;
    int tueClosingTime;
    int wedOpeningTime;
    int wedClosingTime;
    int thuOpeningTime;
    int thuClosingTime;
    int friOpeningTime;
    int friClosingTime;
    int satOpeningTime;
    int satClosingTime;
    int sunOpeningTime;
    int sunClosingTime;

    public StoreWeeks (String name,
                       int monOpeningTime,
                       int monClosingTime,
                       int tueOpeningTime,
                       int tueClosingTime,
                       int wedOpeningTime,
                       int wedClosingTime,
                       int thuOpeningTime,
                       int thuClosingTime,
                       int friOpeningTime,
                       int friClosingTime,
                       int satOpeningTime,
                       int satClosingTime,
                       int sunOpeningTime,
                       int sunClosingTime){
        this.name = name;
        this.monOpeningTime = monOpeningTime;
        this.monClosingTime = monClosingTime;
        this.tueOpeningTime = tueOpeningTime;
        this.tueClosingTime = tueClosingTime;
        this.wedOpeningTime = wedOpeningTime;
        this.wedClosingTime = wedClosingTime;
        this.thuOpeningTime = thuOpeningTime;
        this.thuClosingTime = thuClosingTime;
        this.friOpeningTime = friOpeningTime;
        this.friClosingTime = friClosingTime;
        this.satOpeningTime = satOpeningTime;
        this.satClosingTime = satClosingTime;
        this.sunOpeningTime = sunOpeningTime;
        this.sunClosingTime = sunClosingTime;
    }

    public void isOpened(int dayOfWeek, int time){
        switch (dayOfWeek){
            case 1:
                if (monOpeningTime <= time && monClosingTime >= time){
                    System.out.println(name + " is open at this time!");
                } else {
                    System.out.println(name + " is closed at this time!");
                }
                break;
            case 2:
                if (tueOpeningTime <= time && tueClosingTime >= time){
                    System.out.println(name + " is open at this time!");
                } else {
                    System.out.println(name + " is closed at this time!");
                }
                break;
            case 3:
                if (wedOpeningTime <= time && wedClosingTime >= time){
                    System.out.println(name + " is open at this time!");
                } else {
                    System.out.println(name + " is closed at this time!");
                }
                break;
            case 4:
                if (thuOpeningTime <= time && thuClosingTime >= time){
                    System.out.println(name + " is open at this time!");
                } else {
                    System.out.println(name + " is closed at this time!");
                }
                break;
            case 5:
                if (friOpeningTime <= time && friClosingTime >= time){
                    System.out.println(name + " is open at this time!");
                } else {
                    System.out.println(name + " is closed at this time!");
                }
                break;
            case 6:
                if (satOpeningTime <= time && satClosingTime >= time){
                    System.out.println(name + " is open at this time!");
                } else {
                    System.out.println(name + " is closed at this time!");
                }
                break;
            case 7:
                if (sunOpeningTime <= time && sunClosingTime >= time){
                    System.out.println(name + " is open at this time!");
                } else {
                    System.out.println(name + " is closed at this time!");
                }
                break;
        }
    }


}

package com.company.app;

import java.util.ArrayList;

public class Race implements Runnable {

    ArrayList<String> list=new ArrayList<String>();

    private Thread thread;
    private String name;
    private int speed;
    private int location;
    private int lvl;
    public int sec;

    public Race (String name, int speed, int lvl){
        this.name = name;
        this.speed = speed;
        this.lvl = lvl;
        location = 0;
        sec = 0;
    }

    @Override
    public void run() {
        try {
            while (location < 1000){
                location += (speed + speed * lvl);
                sec += 1;
                System.out.println("Sec: " + sec + " Car name: " + name + " current location: " + location);
                Thread.sleep(1000);
            }
            System.out.println("!!!   Car " + name + " result: " + sec + " sec   !!!");

        } catch (InterruptedException e) {
            System.out.println("Thread " + name + " dead");
        }
    }

    public void start() {
        System.out.println("Car " + name + " starting");
        if (thread == null) {
            thread = new Thread(this, name);
            thread.start();
            //System.out.println(thread.isAlive());
        }
    }


}

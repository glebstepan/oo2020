package com.company.app;

public class RaceMain {
    public static void main(String[] args) throws Exception{
        Race race1 = new Race("Kamaz", 100, 1);
        Race race2 = new Race("BMW X12", 50, 2);
        Race race3 = new Race("Merc x4", 20, 5);
        race1.start();
        race2.start();
        race3.start();

    }
}

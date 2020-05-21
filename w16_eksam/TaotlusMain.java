package com.company.exam;

import java.util.Date;

public class TaotlusMain {

    public static void main(String[] args) {
        TaotlusBag bag = new TaotlusBag();

        Date date1 = new Date(1312421542121L);
        Date date2 = new Date(1512441545151L);
        Date date3 = new Date(1998721242111L);


        Taotlus test1 = new Taotlus(2, date1, "Nimi1", "Pnimi1", "39811270278", "avaldus.xlsx", "ariplaan.pdf", "fp.txt", "cv.cv");
        Taotlus test2 = new Taotlus(9, date2, "Nimi2", "Pnimi2", "98457345675", "avaldus.xlsx", "ariplaan.pdf", "fp.txt", "cv.cv");
        Taotlus test3 = new Taotlus(1, date3, "Nimi3", "Pnimi3", "16953456546", "avaldus.xlsx", "ariplaan.pdf", "fp.txt", "cv.cv");

        bag.addTaotlus(test1);
        bag.addTaotlus(test2);
        bag.addTaotlus(test3);

        bag.showAll();

        System.out.println();
        System.out.println("Find by user id: ");
        bag.findByUsedID("39811270278");

        System.out.println("Find by user name: ");
        bag.findByTautlejaName("Nimi2", "Pnimi2");

        System.out.println("Find by date: ");
        bag.findByDate(date2);

        System.out.println("Sort by taotlus ID");
        bag.sortByTaotlusID();

        System.out.println("Sort by date");
        bag.sortByDate();


    }
}

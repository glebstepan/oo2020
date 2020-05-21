package com.company.exam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class TaotlusBag {

    private List<Taotlus> bag = new ArrayList<>();

    public void addTaotlus (Taotlus taotlus){
        bag.add(taotlus);
    }

    // Kuva kõik avaldused
    public void showAll(){
        for (Taotlus taotlus : bag) {
            System.out.println(taotlus.getInfo());
        }
    }

    // Otsing taotleja ID järgi
    public void findByUsedID(String id){
        for (Taotlus taotlus : bag) {
            if(taotlus.getTaotlejaID().equals(id)){
                System.out.println(taotlus.getInfo());
            }
        }
    }

    // Otsing taotleja täisnime järgi
    public void findByTautlejaName(String name, String pName){
        for (Taotlus taotlus : bag) {
            if(taotlus.getTaotlejaNimi().equals(name) && taotlus.getTaotlejaPNimi().equals(pName)){
                System.out.println(taotlus.getInfo());
            }
        }
    }

    // Otsing ajavahemiku järgi
    public void findByDate(Date startDate){
        for (Taotlus taotlus : bag){
            if(taotlus.getEsitamiseKuupaev().getTime() > startDate.getTime()){
                System.out.println(taotlus.getInfo());
            }
        }
    }

    // Sorteerimine taotluse ID järgi
    public void sortByTaotlusID(){
        bag.sort(Comparator.comparing(Taotlus::getTaotlusID));
        for(Taotlus taotlus : bag){
            System.out.println(taotlus.getInfo());
        }
    }

    // Sorteerimine esitamise kuupöeva järgi
    public void sortByDate(){
        bag.sort(Comparator.comparing(Taotlus::getEsitamiseKuupaev).reversed());
        for(Taotlus taotlus : bag){
            System.out.println(taotlus.getInfo());
        }
    }





}

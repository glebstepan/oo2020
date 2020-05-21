package com.company.exam;

import java.util.Date;

public class Taotlus {

    private int taotlusID;
    private Date esitamiseKuupaev;
    private String taotlejaNimi;
    private String taotlejaPNimi;
    private String taotlejaID;

    private String avaldusFile;
    private String ariplaanFile;
    private String finantsprognoosidFile;
    private String cvFile;



    public Taotlus(int taotlusID, Date esitamiseKuupaev, String taotlejaNimi,
                   String taotlejaPNimi, String taotlejaID, String avaldusFile,
                   String ariplaanFile, String finantsprognoosidFile, String cvFile){

        this.taotlusID = taotlusID;
        this.esitamiseKuupaev = esitamiseKuupaev;
        this.taotlejaNimi = taotlejaNimi;
        this.taotlejaPNimi = taotlejaPNimi;
        this.taotlejaID = taotlejaID;
        this.avaldusFile = avaldusFile;
        this.ariplaanFile = ariplaanFile;
        this.finantsprognoosidFile = finantsprognoosidFile;
        this.cvFile = cvFile;
    }

    public int getTaotlusID() { return taotlusID; }

    public String getTaotlejaID(){
        return taotlejaID;
    }

    public String getTaotlejaNimi(){
        return taotlejaNimi;
    }

    public String getTaotlejaPNimi(){
        return taotlejaPNimi;
    }

    public Date getEsitamiseKuupaev(){
        return esitamiseKuupaev;
    }


    public String getInfo(){
        return ("Taotlus ID: " + taotlusID + "; esitamise kuupäev: " + esitamiseKuupaev + "; taotleja nimi: " + taotlejaNimi + " " + taotlejaPNimi + "; taotleja ID: " + taotlejaID);
    }


}

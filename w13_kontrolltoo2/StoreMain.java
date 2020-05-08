package com.company.app;

public class StoreMain {
    public static void main(String[] args) {

        int maximaNumberOfVisits = 0;
        int rimiNumberOfVisits = 0;

        Store store1 = new Store("Store 1", 8, 20);
        Store store2 = new Store("Store 2", 6, 18);
        Store store3 = new Store("Store 3", 9, 23);
        Store store4 = new Store("Store 4", 12, 17);
        Store store5 = new Store("Store 5", 9, 20);
        Store store6 = new Store("Store 6", 8, 20);
        Store store7 = new Store("Store 7", 11, 19);


        // Hoidla
        Store[] Maxima = {store1, store2, store3, store4};
        Store[] Rimi = {store5, store6, store7};

        // Kontrollime, millised kauplused on avatud kell 20 (1., 3. ul)
        for(int i = 0; i < Maxima.length; i++){
            if(Maxima[i].isOpened(20)){
                Maxima[i].goToStore(); // Kui pood on avatud, suureneb külastuste arv
                System.out.println(Maxima[i].getName() + " is open at this time!");
            } else{
                System.out.println(Maxima[i].getName() + " is closed at this time!");
            }
        }

        for(int i = 0; i < Rimi.length; i++){
            if(Rimi[i].isOpened(20)){
                Rimi[i].goToStore();
                System.out.println(Rimi[i].getName() + " is open at this time!");
            } else{
                System.out.println(Rimi[i].getName() + " is closed at this time!");
            }
        }

        // Ühte poodi külastati eraldi
        store1.goToStore();
        store1.goToStore();
        store1.goToStore();
        System.out.println(store1.getName() + " number of visits: " + store1.getNumberOfVisits());


        // Otsime kogu kauplusteketi külastuste arvu
        for(int i = 0; i < Maxima.length; i++){
            maximaNumberOfVisits += Maxima[i].getNumberOfVisits();
        }

        for(int i = 0; i < Rimi.length; i++){
            rimiNumberOfVisits += Rimi[i].getNumberOfVisits();
        }

        System.out.println("Maxima number of visits: " + maximaNumberOfVisits);
        System.out.println("Rimi number of visits: " + rimiNumberOfVisits);



        // 2. ül
        StoreWeeks storew1 = new StoreWeeks("StoreWeeks1", 8, 20, 8, 20, 8, 20, 8 ,20, 6, 22, 6, 22, 12, 18);

        storew1.isOpened(1, 22); // kontrollime, kas pood on avatud esmaspäeval kell 22
        storew1.isOpened(1, 19);
        storew1.isOpened(7, 19);

    }
}

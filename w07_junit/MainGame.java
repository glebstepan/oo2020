package com.company.app;

public class MainGame {
    public static void main(String[] args) {
        final Game game1 = new Game();
        game1.initMap();
        game1.printMap();

        while (true) {
            game1.playerAction();
            game1.printMap();

            if (game1.checkWinner('x')){
                System.out.println("Player won! ");
                break;
            }
            if(game1.isMapFull()){
                System.out.println("Draw! ");
                break;
            }

            game1.computerAction();
            game1.printMap();

            if (game1.checkWinner('o')){
                System.out.println("Computer won :( ");
                break;
            }
            if(game1.isMapFull()){
                System.out.println("Draw");
                break;
            }
        }
        System.out.println("Game over!");
    }
}

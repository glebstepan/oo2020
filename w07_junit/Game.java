package com.company.app;

import java.util.Random;
import java.util.Scanner;

public class Game implements TicTakToe {

    public static char[][] map = new char[3][3];
    public static Scanner sc = new Scanner(System.in);
    public static Random rn = new Random();

    @Override
    // Mänguvälja loomine
    public void initMap() {
        map = new char[][]{{'*', '*', '*'}, {'*', '*', '*'}, {'*', '*', '*'}};
    }

    @Override
    // Meetod, mis prindib massiivi ruudu kujul
    public void printMap() {
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    @Override
    // Meetod, mis kontrollib, kas valitud lahter on vaba
    public boolean isCellEmpty(int x, int y) {
        if (map[x][y] != '*') return false;
        return true;
    }


    @Override
    // Mängija käik
    public void playerAction() {
        int x;
        int y;
        do {
            System.out.println("Enter coordinates. ");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellEmpty(x, y));
        map[x][y] = 'x';

    }

    @Override
    // Arvuti käik
    public void computerAction() {
        int x;
        int y;
        do {
            x = rn.nextInt(3);
            y = rn.nextInt(3);

        } while (!isCellEmpty(x, y));
        map[x][y] = 'o';
    }

    @Override
    // Meetod võitja väljaselgitamiseks
    public boolean checkWinner(char sign) {
        if (map[0][0] == sign && map[0][1] == sign && map[0][2] == sign) return true;
        if (map[1][0] == sign && map[1][1] == sign && map[1][2] == sign) return true;
        if (map[2][0] == sign && map[2][1] == sign && map[2][2] == sign) return true;
        if (map[0][0] == sign && map[1][0] == sign && map[2][0] == sign) return true;
        if (map[0][1] == sign && map[1][1] == sign && map[2][1] == sign) return true;
        if (map[0][2] == sign && map[1][2] == sign && map[2][2] == sign) return true;
        if (map[0][0] == sign && map[1][1] == sign && map[2][2] == sign) return true;
        if (map[2][0] == sign && map[1][1] == sign && map[0][2] == sign) return true;
        return false;
    }


    @Override
    // Kontrollimine, kas kõik lahtrid on täis
    public boolean isMapFull() {
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(map[i][j] == '*') return false;
            }
        }
        return true;
    }
}

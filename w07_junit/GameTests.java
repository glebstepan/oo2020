package com.company.app;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameTests {

    final Game game2 = new Game();

    @Test
    public void test1(){
        game2.initMap();
        assertFalse(game2.isMapFull());
    }

    @Test
    public void test2(){
        game2.initMap();
        game2.map[0][0] = 'x';
        game2.printMap();
        assertFalse(game2.isCellEmpty(0,0));
    }

    @Test
    public void test3(){
        game2.initMap();
        assertTrue(game2.isCellEmpty(0,0));
    }

    @Test
    public void test4(){
        game2.initMap();
        game2.map[0][0] = 'x';
        game2.map[0][1] = 'x';
        game2.map[0][2] = 'x';
        game2.map[1][0] = 'x';
        game2.map[1][1] = 'x';
        game2.map[1][2] = 'x';
        game2.map[2][0] = 'x';
        game2.map[2][1] = 'x';
        game2.map[2][2] = 'x';
        game2.printMap();
        assertTrue(game2.isMapFull());

    }

    @Test
    public void test5(){
        game2.initMap();
        assertFalse(game2.checkWinner('x'));
    }

    @Test
    public void test6(){
        game2.initMap();
        assertFalse(game2.checkWinner('o'));
    }

    @Test
    public void test7(){
        game2.initMap();
        assertFalse(game2.checkWinner('x'));
    }

    @Test
    public void test8(){
        game2.initMap();
        game2.map[0][0] = 'x';
        game2.map[0][1] = 'x';
        game2.map[0][2] = 'x';
        assertTrue(game2.checkWinner('x'));
    }

    @Test
    public void test9(){
        game2.initMap();
        game2.map[0][0] = 'o';
        game2.map[1][1] = 'o';
        game2.map[2][2] = 'o';
        assertTrue(game2.checkWinner('o'));
    }

    @Test
    public void test10(){
        game2.initMap();
        game2.map[0][0] = 'o';
        game2.map[1][0] = 'o';
        game2.map[2][0] = 'o';
        assertTrue(game2.checkWinner('o'));
    }

    @Test
    public void test11(){
        game2.initMap();
        game2.map[0][1] = 'o';
        game2.map[1][1] = 'o';
        game2.map[2][1] = 'o';
        assertTrue(game2.checkWinner('o'));
    }

    @Test
    public void test12(){
        game2.initMap();
        game2.map[0][1] = 'o';
        game2.map[1][1] = 'o';
        game2.map[2][1] = 'o';
        assertTrue(game2.checkWinner('o'));
    }







}

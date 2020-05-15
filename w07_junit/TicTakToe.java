package com.company.app;

public interface TicTakToe {

    public void initMap();
    public void printMap();
    public void playerAction();
    public void computerAction();
    public boolean checkWinner(char ox);
    public boolean isCellEmpty(int x, int y);
    public boolean isMapFull();

}

package com.nerds4hire.ships.demo;

public class ShipMaker {

    private Ship MaW;
    private Ship Brig;
    private Ship SoL;

    public ShipMaker() {
        MaW = new ManAtWar();
        Brig = new Brig();
        SoL = new ShipOfTheLine();
    }

    public void displayMaW(){
        MaW.display();
    }

    public void displaySoL(){
        SoL.display();
    }

    public void displayBrig(){
        Brig.display();
    }

}

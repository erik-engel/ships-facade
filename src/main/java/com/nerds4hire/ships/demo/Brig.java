package com.nerds4hire.ships.demo;

public class Brig implements Ship {

    String name = "Brig";
    int lengthInFeet = 100;
    int deplacementInTons = 2000;
    int maxKnot = 20;

    @Override
    public void display() {
        System.out.println("Name: " + name + "\nShiplength in feet" + lengthInFeet + "\nDeplacement: " + deplacementInTons + "\nMax speed in knots: " + maxKnot);
    }
}


package com.nerds4hire.ships.demo;

public class ManAtWar implements Ship {


    String name = "Man At War";
    int lengthInFeet = 300;
    int deplacementInTons = 4000;
    int maxKnot = 30;

    @Override
    public void display() {
        System.out.println("Name: " + name + "\nShiplength in feet" + lengthInFeet + "\nDeplacement: " + deplacementInTons + "\nMax speed in knots: " + maxKnot);
    }
}

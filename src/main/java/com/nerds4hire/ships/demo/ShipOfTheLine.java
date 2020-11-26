package com.nerds4hire.ships.demo;

public class ShipOfTheLine implements Ship{


    String name = "Ship of the line";
    int lengthInFeet = 200;
    int deplacementInTons = 3000;
    int maxKnot = 70;

    @Override
    public void display() {
        System.out.println("Name: " + name + "\nShiplength in feet" + lengthInFeet + "\nDeplacement: " + deplacementInTons + "\nMax speed in knots: " + maxKnot);
    }
}

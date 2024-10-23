package com.Northcoders;

public class Aeroplane extends Vehicle implements Flyable {

    public void fly() {
        System.out.println("Aeroplane is flying..... .");
    }

    public void move() {
        fly();
    }
}

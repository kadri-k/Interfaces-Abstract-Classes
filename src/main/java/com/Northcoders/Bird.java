package com.Northcoders;

public abstract class Bird implements Flyable {

    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " is flying!");
    }

}

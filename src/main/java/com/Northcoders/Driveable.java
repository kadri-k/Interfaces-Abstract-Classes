package com.Northcoders;

public interface Driveable {

    default void drive() {
        System.out.println(this.getClass().getSimpleName() + " is driving!");
    }
}


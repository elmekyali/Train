package com.training.entities;

public class Passenger implements Compartment {

    public String print() {
        return "|OOOO|";
    }

    public boolean fill() {
        return false;
    }
}

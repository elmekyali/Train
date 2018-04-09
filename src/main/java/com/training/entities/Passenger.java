package com.training.entities;

public class Passenger extends Compartment {

    public String print() {
        return "|OOOO|";
    }

    public boolean fill() {
        return false;
    }
}

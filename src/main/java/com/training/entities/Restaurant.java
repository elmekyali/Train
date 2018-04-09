package com.training.entities;

public class Restaurant extends Compartment {
    @Override
    public String print() {
        return "|hThT|";
    }

    @Override
    public boolean fill() {
        return false;
    }
}

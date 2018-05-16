package com.training.entities;

public class Cargo implements Compartment {

    private boolean isFilling = false;

    @Override
    public String print() {
        return isFilling ? "|^^^^|" : "|____|";
    }

    @Override
    public boolean fill() {
       return !isFilling && (isFilling = true);
    }
}

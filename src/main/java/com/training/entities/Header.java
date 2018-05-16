package com.training.entities;

public class Header implements Compartment {
    @Override
    public String print() {
        return "<HHHH";
    }

    @Override
    public boolean fill() {
        return false;
    }
}

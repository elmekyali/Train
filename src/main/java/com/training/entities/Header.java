package com.training.entities;

public class Header extends Compartment {
    @Override
    public String print() {
        return "<HHHH";
    }

    @Override
    public boolean fill() {
        return false;
    }
}

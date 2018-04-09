package com.training.entities;

public class CompartmentFactory {
    public Compartment getCompartment(char type)
    {
        switch (type) {
            case 'H' : return new Header();
            case 'R' : return new Restaurant();
            case 'P' : return new Passenger();
            case 'C' : return new Cargo();
            default  : return null;
        }
    }
}

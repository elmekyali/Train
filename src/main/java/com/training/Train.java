package com.training;

import com.training.entities.Compartment;
import com.training.parsers.DefaultParser;
import com.training.parsers.Parser;
import com.training.presenter.DefaultPresenter;
import com.training.presenter.Presenter;

import java.util.*;

public class Train {

    private List<Compartment> compartments;
    private Presenter presenter;

    public Train(String train) {
        Parser parser = new DefaultParser();
        this.compartments = parser.trainParser(train);
        this.presenter = new DefaultPresenter();
    }

    public String print() {
        return presenter.trainPresenter(compartments, "::");
    }

    public boolean fill() {
        boolean isFilling = false;
        for (Compartment compartment : compartments) {
            isFilling = isFilling || compartment.fill();
        }
        return isFilling;
    }
}

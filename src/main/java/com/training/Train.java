package com.training;

import com.training.entities.Compartment;
import com.training.parsers.DefaultParser;
import com.training.parsers.Parser;
import com.training.presenter.DefaultPresenter;
import com.training.presenter.Presenter;

import java.util.*;

public class Train {

    List<Compartment> compartments ;
    Parser parser       = new DefaultParser();
    Presenter presenter = new DefaultPresenter();

    public Train(String train) {
        compartments = parser.trainParser(train);
    }

    public String print() {
        return presenter.trainPresenter(compartments , "::");
    }

    public boolean fill() {
        boolean isFilling = false;
        for (Compartment compartment : compartments) {
            isFilling = isFilling || compartment.fill();
        }
        return isFilling;
    }
}

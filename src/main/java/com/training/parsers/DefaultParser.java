package com.training.parsers;

import com.training.entities.Compartment;
import com.training.entities.CompartmentFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DefaultParser implements Parser {
    @Override
    public List<Compartment> trainParser(String train) {
        final CompartmentFactory compartmentFactory = new CompartmentFactory();
        return train.chars()
                .mapToObj(compartmentType ->compartmentFactory.getCompartment((char)compartmentType))
                .collect(Collectors.toList());
    }
}

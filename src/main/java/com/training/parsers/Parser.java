package com.training.parsers;

import com.training.entities.Compartment;

import java.util.List;

public interface Parser {
    List<Compartment> trainParser(String train);
}

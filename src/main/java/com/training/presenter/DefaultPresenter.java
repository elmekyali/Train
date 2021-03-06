package com.training.presenter;

import com.training.entities.Compartment;

import java.util.List;
import java.util.stream.Collectors;

public class DefaultPresenter implements Presenter {
    @Override
    public String trainPresenter(List<Compartment> compartments, String delimiter) {
        return compartments.stream().map(Compartment::print).collect(Collectors.joining(delimiter));
    }
}

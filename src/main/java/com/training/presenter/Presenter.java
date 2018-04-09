package com.training.presenter;

import com.training.entities.Compartment;

import java.util.List;

public interface Presenter {
    String trainPresenter (List<Compartment> compartments , String delimiter);
}

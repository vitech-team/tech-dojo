package com.vitech.playground.gofpatterns.creational.factorymethod.model;

import java.util.Collection;

public interface Candy {

    Collection<Candy> getCandyBox(int quantity);
}

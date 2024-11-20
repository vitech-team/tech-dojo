package com.vitech.playground.gofpatterns.creational.factorymethod.model;

public class Caramel implements Candy {

    private final String name = "Caramel";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Caramel { " +
                "name='" + name + '\'' +
                " }";
    }
}

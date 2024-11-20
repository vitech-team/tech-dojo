package com.vitech.playground.gofpatterns.creational.factorymethod.model;

final public class Chocolate implements Candy {

    private final String name = "Chocolate";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Chocolate { " +
                "name='" + name + '\'' +
                " }";
    }
}
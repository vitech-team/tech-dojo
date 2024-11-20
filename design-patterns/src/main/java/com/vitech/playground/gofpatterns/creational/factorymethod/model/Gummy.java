package com.vitech.playground.gofpatterns.creational.factorymethod.model;

final public class Gummy implements Candy {

    private final String name = "Gummy";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Gummy { " +
                "name='" + name + '\'' +
                " }";
    }
}

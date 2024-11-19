package com.vitech.playground.gofpatterns.behavioral.templatemethod.model;

public abstract class Pizza {

    protected abstract void makeBase();
    protected abstract void addToppings();
    protected abstract void cook();

    public void makePizza() {
        makeBase();
        addToppings();
        cook();
    }
}

package com.vitech.playground.gofpatterns.structural.decorator.exercise1;

public class Onions implements Pizza {
    private final Pizza pizza;

    public Onions(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription().equals("Margherita with no toppings")
                ? "Margherita with Onions" : pizza.getDescription() + ", Onions";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 0.80;
    }
}

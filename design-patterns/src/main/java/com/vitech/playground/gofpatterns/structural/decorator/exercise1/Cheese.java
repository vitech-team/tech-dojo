package com.vitech.playground.gofpatterns.structural.decorator.exercise1;

public class Cheese implements Pizza {
    private final Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription().equals("Margherita with no toppings")
                ? "Margherita with Cheese" : pizza.getDescription() + ", Cheese";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 1.50;
    }
}

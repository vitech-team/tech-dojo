package com.vitech.playground.gofpatterns.structural.decorator.exercise1;

public class Pepperoni implements Pizza {
    private final Pizza pizza;

    public Pepperoni(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription().equals("Margherita with no toppings")
                ? "Margherita with Pepperoni" : pizza.getDescription() + ", Pepperoni";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 2.00;
    }
}

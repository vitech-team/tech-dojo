package com.vitech.playground.gofpatterns.structural.decorator.exercise1;

public class Mushrooms implements Pizza {
    private final Pizza pizza;

    public Mushrooms(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription().equals("Margherita with no toppings")
                ? "Margherita with Mushrooms" : pizza.getDescription() + ", Mushrooms";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 1.00;
    }
}

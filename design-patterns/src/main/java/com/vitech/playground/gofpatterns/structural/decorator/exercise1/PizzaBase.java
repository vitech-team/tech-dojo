package com.vitech.playground.gofpatterns.structural.decorator.exercise1;

public class PizzaBase implements Pizza {

    @Override
    public String getDescription() {
        return "Margherita with no toppings";
    }

    @Override
    public double getPrice() {
        return 5.00;
    }
}

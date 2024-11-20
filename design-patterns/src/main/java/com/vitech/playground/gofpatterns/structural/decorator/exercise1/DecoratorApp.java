package com.vitech.playground.gofpatterns.structural.decorator.exercise1;

public class DecoratorApp {

    public static void main(String[] args) {
        // The program should build at least three pizzas of your choice, each with a different combination of toppings.
        // The program should then print the menu with the name and total price of each pizza.
        //
        // Example menu:
        // Pizza 1: Margherita with Cheese and Pepperoni - $8.50.
        // Pizza 2: Margherita with Mushrooms, Onions, and Cheese - $7.30.
        // Pizza 3: Margherita with Cheese and Mushrooms - $7.50.

        Pizza pizza1 = new Pepperoni(new Cheese(new PizzaBase()));
        Pizza pizza2 = new Cheese(new Onions(new Mushrooms(new PizzaBase())));
        Pizza pizza3 = new Mushrooms(new Cheese(new PizzaBase()));

        System.out.println(pizza1.getDescription() + " - $" + String.format("%.2f", pizza1.getPrice()));
        System.out.println(pizza2.getDescription() + " - $" + String.format("%.2f", pizza2.getPrice()));
        System.out.println(pizza3.getDescription() + " - $" + String.format("%.2f", pizza3.getPrice()));

        Pizza pizza4 = new PizzaBase();
        System.out.println(pizza4.getDescription() + " - $" + String.format("%.2f", pizza4.getPrice()));

    }
}

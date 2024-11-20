package com.vitech.playground.gofpatterns.behavioral.templatemethod.model;

public class MeatPizza extends Pizza {

    public void addToppings() {
        System.out.println("Add tomato");
        System.out.println("Add cheese");
        System.out.println("Add pepperoni");
        System.out.println("Add ham");
        System.out.println("Add chicken");
    }

    public void cook() {
        System.out.println("Cook in the oven for 20 minutes");
    }

    public void makeBase() {
        System.out.println("Mix flour, yeast and salt");
        System.out.println("Roll out the dough");
    }
}

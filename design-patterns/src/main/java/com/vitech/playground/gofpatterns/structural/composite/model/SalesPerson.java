package com.vitech.playground.gofpatterns.structural.composite.model;

public record SalesPerson(String name, Manager manager) {

    public void payExpenses(int amount) {
        System.out.println(name + " has been paid $" + amount);
    }

}


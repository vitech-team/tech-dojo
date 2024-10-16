package com.vitech.playground.gofpatterns.structural.composite.model;

public record Manager(String name) {
    public void payExpenses(int amount) {
        System.out.println(name + " has been paid $" + amount);
    }

}

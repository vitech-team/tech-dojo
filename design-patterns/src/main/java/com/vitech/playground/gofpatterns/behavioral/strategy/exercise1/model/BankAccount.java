package com.vitech.playground.gofpatterns.behavioral.strategy.exercise1.model;

public class BankAccount implements Account {

    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " made from bank account.");
    }
}

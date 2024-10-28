package com.vitech.playground.gofpatterns.behavioral.strategy.exercise1.model;

public class PayPalAccount implements Account {
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " made from PayPal account.");
    }
}

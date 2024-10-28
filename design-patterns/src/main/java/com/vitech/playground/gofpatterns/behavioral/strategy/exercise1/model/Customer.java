package com.vitech.playground.gofpatterns.behavioral.strategy.exercise1.model;

import lombok.Setter;

@Setter
public class Customer {

    private Account bankAccount;
    private Account payPalAccount;

    public void makeBankPayment(double amount) {
        bankAccount.makePayment(amount);
    }

    public void makePayPalPayment(double amount) {
        payPalAccount.makePayment(amount);
    }
}

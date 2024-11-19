package com.vitech.playground.gofpatterns.behavioral.strategy.exercise1.model;

import lombok.Setter;

@Setter
public class Customer {

    public void makePayment(double amount, Account account) {
        account.makePayment(amount);
    }
}

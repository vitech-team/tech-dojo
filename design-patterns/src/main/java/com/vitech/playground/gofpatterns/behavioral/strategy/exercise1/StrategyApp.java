package com.vitech.playground.gofpatterns.behavioral.strategy.exercise1;

import com.vitech.playground.gofpatterns.behavioral.strategy.exercise1.model.BankAccount;
import com.vitech.playground.gofpatterns.behavioral.strategy.exercise1.model.Customer;
import com.vitech.playground.gofpatterns.behavioral.strategy.exercise1.model.PayPalAccount;

public class StrategyApp {

    public static void main(String[] args) {

        // Refactor an application handling customer payments with various ways using strategy pattern.
        // Update payment system to accept payments from new type of account - crypto.

        Customer customer = new Customer();
        customer.setBankAccount(new BankAccount());
        customer.setPayPalAccount(new PayPalAccount());

        customer.makeBankPayment(100);
        customer.makePayPalPayment(2000);

    }
}

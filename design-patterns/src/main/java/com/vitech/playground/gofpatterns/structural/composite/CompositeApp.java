package com.vitech.playground.gofpatterns.structural.composite;

import com.vitech.playground.gofpatterns.structural.composite.model.Manager;
import com.vitech.playground.gofpatterns.structural.composite.model.SalesPerson;
import com.vitech.playground.gofpatterns.structural.composite.model.SalesTeam;

public class CompositeApp {

    public static void main(String[] args) {

        // We have an app managing a company's expenses:
        //
        // - Manager has a field name and a method payExpenses(int amount) which prints that the person with name has been paid amount in dollars.
        // - SalesPerson has a field Manager and a field name and a similar payExpenses() method
        // - SalesTeam has two lists, one of Managers and one for Salespersons and, again, the similar payExpenses() method.
        //
        // Refactor these classes in order to unify the identical payExpenses() methods and reduce duplicate code.
        // Use Composite pattern.

        Manager alice = new Manager("Alice");
        SalesPerson bob = new SalesPerson("Bob");
        SalesPerson sue = new SalesPerson("Sue");

        SalesTeam team = new SalesTeam();
        team.addSubordinate(alice);
        alice.addSubordinate(bob);
        alice.addSubordinate(sue);

        alice.payExpenses(100);
        bob.payExpenses(300);
        sue.payExpenses(200);

        for (SalesTeam manager : team.getSubordinates()) {
            System.out.println("Manager : " + manager.getName());
            for (SalesTeam seller : alice.getSubordinates()) {
                System.out.println("Seller : " + seller.getName());
            }
        }
    }
}

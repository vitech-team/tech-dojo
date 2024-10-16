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
        SalesPerson bob = new SalesPerson("Bob", alice);
        SalesPerson sue = new SalesPerson("Sue", alice);

        SalesTeam team = new SalesTeam();
        team.addManager(alice);
        team.addSalesPerson(bob);
        team.addSalesPerson(sue);

        alice.payExpenses(100);
        bob.payExpenses(300);
        team.payExpenses(200);
    }
}

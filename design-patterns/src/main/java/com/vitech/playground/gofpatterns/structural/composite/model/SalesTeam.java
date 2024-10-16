package com.vitech.playground.gofpatterns.structural.composite.model;

import java.util.ArrayList;
import java.util.List;

public class SalesTeam {
    private final List<Manager> managers = new ArrayList<>();
    private final List<SalesPerson> salesPeople = new ArrayList<>();

    public void payExpenses(int amount) {
        managers.forEach(payee -> payee.payExpenses(amount));
        salesPeople.forEach(payee -> payee.payExpenses(amount));
    }

    public void addManager(Manager manager) {
        managers.add(manager);
    }

    public void addSalesPerson(SalesPerson salesPerson) {
        salesPeople.add(salesPerson);
    }
}
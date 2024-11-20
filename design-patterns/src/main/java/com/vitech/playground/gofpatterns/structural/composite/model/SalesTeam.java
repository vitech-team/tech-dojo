package com.vitech.playground.gofpatterns.structural.composite.model;

import java.util.ArrayList;
import java.util.List;

public class SalesTeam {
    protected String name;
    private final List<SalesTeam> subordinates = new ArrayList<>();

    public void payExpenses(int amount) {
        System.out.println(name + " has been paid $" + amount);
    }

    public void addSubordinate(SalesTeam salesTeam) {
        subordinates.add(salesTeam);
    }

    public List<SalesTeam> getSubordinates() {
        return subordinates;
    }

    public String getName() {
        return name;
    }
}
package com.vitech.playground.gofpatterns.behavioral.visitor.model;

import com.vitech.playground.gofpatterns.behavioral.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class GroceryList implements Groceries {

    private final List<Groceries> groceries = new ArrayList<>();

    public GroceryList() {
        groceries.add(new Bread(20));
        groceries.add(new Bread(25));
        groceries.add(new Milk(48));
    }

    public void addGrocery(Groceries grocery) {
        groceries.add(grocery);
    }

    @Override
    public double getPrice() {
        return groceries.stream().mapToDouble(Groceries::getPrice).sum();
    }

    @Override
    public void setPrice(double price) {
        // Not Implemented
    }

    @Override
    public void accept(Visitor visitor) {
        for (Groceries grocery : groceries) {
            grocery.accept(visitor);
        }
    }
}

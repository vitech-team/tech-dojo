package com.vitech.playground.gofpatterns.behavioral.visitor.model;

import com.vitech.playground.gofpatterns.behavioral.visitor.Visitor;

public class Bread implements Groceries {

    private double price;

    public Bread(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

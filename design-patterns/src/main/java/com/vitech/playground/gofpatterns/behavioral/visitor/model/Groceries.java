package com.vitech.playground.gofpatterns.behavioral.visitor.model;

import com.vitech.playground.gofpatterns.behavioral.visitor.Visitor;

public interface Groceries {

    double getPrice();
    void setPrice(double price);
    void accept(Visitor visitor);
}

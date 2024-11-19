package com.vitech.playground.gofpatterns.behavioral.visitor;

import com.vitech.playground.gofpatterns.behavioral.visitor.model.Bread;
import com.vitech.playground.gofpatterns.behavioral.visitor.model.Milk;

class DiscountVisitor implements Visitor {

    @Override
    public void visit(Milk milk) {
        double discountedPrice = milk.getPrice() * 0.95;
        milk.setPrice(discountedPrice);
    }

    @Override
    public void visit(Bread bread) {
        double discountedPrice = bread.getPrice() * 0.95;
        bread.setPrice(discountedPrice);
    }
}

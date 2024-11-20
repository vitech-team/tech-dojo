package com.vitech.playground.gofpatterns.behavioral.visitor;

import com.vitech.playground.gofpatterns.behavioral.visitor.model.Bread;
import com.vitech.playground.gofpatterns.behavioral.visitor.model.Milk;

public interface Visitor {
    void visit(Milk milk);
    void visit(Bread bread);
}

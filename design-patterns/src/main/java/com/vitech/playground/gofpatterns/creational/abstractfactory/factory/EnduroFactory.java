package com.vitech.playground.gofpatterns.creational.abstractfactory.factory;

import com.vitech.playground.gofpatterns.creational.abstractfactory.model.enduro.EnduroHandlebar;
import com.vitech.playground.gofpatterns.creational.abstractfactory.model.enduro.EnduroTire;

public class EnduroFactory implements MotorcycleFactory {

    @Override
    public void createMotorcycle() {
        new EnduroHandlebar().printSpecification();
        new EnduroTire().printSpecification();
    }
}

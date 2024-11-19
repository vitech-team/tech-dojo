package com.vitech.playground.gofpatterns.creational.abstractfactory.factory;

import com.vitech.playground.gofpatterns.creational.abstractfactory.model.sport.SportHandlebar;
import com.vitech.playground.gofpatterns.creational.abstractfactory.model.sport.SportTire;

public class SportFactory implements MotorcycleFactory {

    @Override
    public void createMotorcycle() {
        new SportHandlebar().printSpecification();
        new SportTire().printSpecification();
    }
}

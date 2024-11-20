package com.vitech.playground.gofpatterns.creational.abstractfactory;

import com.vitech.playground.gofpatterns.creational.abstractfactory.factory.EnduroFactory;
import com.vitech.playground.gofpatterns.creational.abstractfactory.factory.SportFactory;
import com.vitech.playground.gofpatterns.creational.abstractfactory.model.MotorcycleType;

public class SimpleMotorcycleFactory {
    private final EnduroFactory enduroFactory;
    private final SportFactory sportFactory;

    public SimpleMotorcycleFactory() {
        this.enduroFactory = new EnduroFactory();
        this.sportFactory = new SportFactory();
    }

    public void createMotorcycleByType(MotorcycleType motorcycleType) {
        switch (motorcycleType) {
            case ENDURO -> enduroFactory.createMotorcycle();
            case SPORT -> sportFactory.createMotorcycle();
        }
    }
}

package com.vitech.playground.gofpatterns.creational.abstractfactory;

import com.vitech.playground.gofpatterns.creational.abstractfactory.model.MotorcycleType;

public class AbstractFactoryApp {

    public static void main(String[] args) {

        // Implement an abstract factory that would construct motorcycle by MotorcycleType(Enduro or Sport)
        // Create motorcycle using an abstract factory
        // Print its specifications

        SimpleMotorcycleFactory motorcycleFactory = new SimpleMotorcycleFactory();
        motorcycleFactory.createMotorcycleByType(MotorcycleType.ENDURO);
        motorcycleFactory.createMotorcycleByType(MotorcycleType.SPORT);

    }

}

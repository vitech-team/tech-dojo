package com.vitech.playground.gofpatterns.creational.abstractfactory.model.sport;

import com.vitech.playground.gofpatterns.creational.abstractfactory.model.Tire;

public class SportTire implements Tire {

    @Override
    public void printSpecification() {
        System.out.println("Sport tire. Width = 180mm, RIM diameter = 17, Aspect Ratio = 65, Speed Rating = W (270km/h)");

    }
}

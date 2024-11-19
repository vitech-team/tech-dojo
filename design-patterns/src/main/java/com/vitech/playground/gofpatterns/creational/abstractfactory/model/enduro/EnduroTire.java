package com.vitech.playground.gofpatterns.creational.abstractfactory.model.enduro;

import com.vitech.playground.gofpatterns.creational.abstractfactory.model.Tire;

public class EnduroTire implements Tire {

    @Override
    public void printSpecification() {
        System.out.println("Enduro tire. Width = 100mm, RIM diameter = 18, Aspect Ratio = 80, Speed Rating = L (120km/h)");
    }
}

package com.vitech.playground.gofpatterns.creational.abstractfactory.model.enduro;

import com.vitech.playground.gofpatterns.creational.abstractfactory.model.Tire;
import lombok.extern.slf4j.Slf4j;
@Slf4j
public class EnduroTire implements Tire {


    @Override
    public void printSpecification() {
        log.info("Enduro tire. Width = 100mm, RIM diameter = 18, Aspect Ratio = 80, Speed Rating = L (120km/h)");
    }
}

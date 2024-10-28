package com.vitech.playground.gofpatterns.creational.abstractfactory.model.sport;

import com.vitech.playground.gofpatterns.creational.abstractfactory.model.Tire;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SportTire implements Tire {

    @Override
    public void printSpecification() {
        log.info("Sport tire. Width = 180mm, RIM diameter = 17, Aspect Ratio = 65, Speed Rating = W (270km/h)");

    }
}

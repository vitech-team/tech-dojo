package com.vitech.playground.gofpatterns.creational.abstractfactory.model.sport;

import com.vitech.playground.gofpatterns.creational.abstractfactory.model.Handlebar;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SportHandlebar implements Handlebar {
    @Override
    public void printSpecification() {
        log.info("Sport motorcycle handlebar. Type: CLIP-ON");
    }
}

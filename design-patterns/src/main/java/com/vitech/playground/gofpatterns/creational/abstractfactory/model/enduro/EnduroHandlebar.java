package com.vitech.playground.gofpatterns.creational.abstractfactory.model.enduro;

import com.vitech.playground.gofpatterns.creational.abstractfactory.model.Handlebar;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EnduroHandlebar implements Handlebar {
    @Override
    public void printSpecification() {
        log.info("Enduro motorcycle handlebar. Type: FLAT");
    }
}

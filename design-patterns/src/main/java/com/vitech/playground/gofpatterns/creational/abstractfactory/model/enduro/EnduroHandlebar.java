package com.vitech.playground.gofpatterns.creational.abstractfactory.model.enduro;

import com.vitech.playground.gofpatterns.creational.abstractfactory.model.Handlebar;

public class EnduroHandlebar implements Handlebar {

    @Override
    public void printSpecification() {
        System.out.println("Enduro motorcycle handlebar. Type: FLAT");
    }
}

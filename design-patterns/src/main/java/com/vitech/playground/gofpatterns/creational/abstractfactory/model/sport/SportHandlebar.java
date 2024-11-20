package com.vitech.playground.gofpatterns.creational.abstractfactory.model.sport;

import com.vitech.playground.gofpatterns.creational.abstractfactory.model.Handlebar;

public class SportHandlebar implements Handlebar {

    @Override
    public void printSpecification() {
        System.out.println("Sport motorcycle handlebar. Type: CLIP-ON");
    }
}

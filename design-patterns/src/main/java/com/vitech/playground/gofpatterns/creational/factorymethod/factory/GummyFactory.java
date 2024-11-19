package com.vitech.playground.gofpatterns.creational.factorymethod.factory;

import com.vitech.playground.gofpatterns.creational.factorymethod.model.Candy;
import com.vitech.playground.gofpatterns.creational.factorymethod.model.Gummy;

public class GummyFactory implements CandyFactory {

    @Override
    public Candy createCandy() {
        return new Gummy();
    }
}

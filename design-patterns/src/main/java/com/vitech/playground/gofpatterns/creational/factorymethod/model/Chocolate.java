package com.vitech.playground.gofpatterns.creational.factorymethod.model;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Slf4j
public class Chocolate implements Candy {

    @Override
    public Collection<Candy> getCandyBox(int quantity) {

        List<Candy> chocolateCandyBox = new ArrayList<>();
        for (int i = 1; i <= quantity; i++) {
            Chocolate chocolate = new Chocolate();
            chocolateCandyBox.add(chocolate);
        }

        log.info("One box of {}} chocolates has been made!", quantity);

        return chocolateCandyBox;

    }

}
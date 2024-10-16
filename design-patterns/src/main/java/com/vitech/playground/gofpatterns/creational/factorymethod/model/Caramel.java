package com.vitech.playground.gofpatterns.creational.factorymethod.model;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Slf4j
public class Caramel implements Candy {


    @Override
    public Collection<Candy> getCandyBox(int quantity) {
        List<Candy> caramelCandyBox = new ArrayList<>();
        for (int i = 1; i <= quantity; i++) {
            Caramel caramel = new Caramel();
            caramelCandyBox.add(caramel);
        }

        log.info("One box of {}} chocolates has been made!", quantity);

        return caramelCandyBox;

    }
}

package com.vitech.playground.gofpatterns.creational.factorymethod;

import com.vitech.playground.gofpatterns.creational.factorymethod.factory.CaramelFactory;
import com.vitech.playground.gofpatterns.creational.factorymethod.factory.ChocolateFactory;
import com.vitech.playground.gofpatterns.creational.factorymethod.factory.GummyFactory;
import com.vitech.playground.gofpatterns.creational.factorymethod.model.Candy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SimpleCandyBoxFactory {

    private final CaramelFactory caramelFactory;
    private final ChocolateFactory chocolateFactory;
    private final GummyFactory gummyFactory;

    public SimpleCandyBoxFactory() {
        this.caramelFactory = new CaramelFactory();
        this.chocolateFactory = new ChocolateFactory();
        this.gummyFactory = new GummyFactory();
    }

    public Collection<Candy> createCandyBox(CandyType candyType, int quantity) {

        List<Candy> candyBox = new ArrayList<>();
        Candy candy = null;
        for (int i = 1; i <= quantity; i++) {
            switch (candyType) {
                case CARAMEL -> candy = caramelFactory.createCandy();
                case CHOCOLATE -> candy = chocolateFactory.createCandy();
                case GUMMY -> candy = gummyFactory.createCandy();
            }
            candyBox.add(candy);
        }
        if (candy != null) {
            System.out.println("One " + candy.getName() + " box has been made! (" + quantity + " pieces)");
        } else {
            System.out.println("The candy box is empty");
        }
        return candyBox;
    }
}

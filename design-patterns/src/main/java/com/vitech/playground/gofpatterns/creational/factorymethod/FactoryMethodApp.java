package com.vitech.playground.gofpatterns.creational.factorymethod;

import com.vitech.playground.gofpatterns.creational.factorymethod.model.Candy;

import java.util.Collection;

public class FactoryMethodApp {

    public static void main(String[] args) {

        // Develop a candy store application that utilizes the Factory Method design pattern to create different types of candies.

        // - Test that the correct candy object is returned based on the input provided to the factory.
        // - Verify that the candy objects remain immutable once created.
        // - Ensure that adding a new candy type only requires changes in the factory logic and does not impact other parts of the application.

        SimpleCandyBoxFactory candyBoxFactory = new SimpleCandyBoxFactory();
        Collection<Candy> caramelCandyBox = candyBoxFactory.createCandyBox(CandyType.CARAMEL, 20);
        Collection<Candy> chocolateCandyBox = candyBoxFactory.createCandyBox(CandyType.CHOCOLATE, 15);
        Collection<Candy> gummyCandyBox = candyBoxFactory.createCandyBox(CandyType.GUMMY, 25);

        System.out.println(caramelCandyBox);
        System.out.println(chocolateCandyBox);
        System.out.println(gummyCandyBox);

    }
}

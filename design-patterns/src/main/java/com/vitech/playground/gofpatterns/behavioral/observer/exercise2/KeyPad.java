package com.vitech.playground.gofpatterns.behavioral.observer.exercise2;

import java.util.Random;


public record KeyPad(PhoneModel model) {

    public void simulateKeyPresses(int numKeyPresses) {
        final int MAX_DIGIT = 10;
        Random rnd = new Random();
        for (int i = 0; i < numKeyPresses; i++) {
            int newDigit = rnd.nextInt(MAX_DIGIT);
            System.out.println("Pressing: " + newDigit);
            model.addDigit(newDigit);
        }
    }

}

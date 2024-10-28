package com.vitech.playground.gofpatterns.behavioral.observer.exercise2;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


public class PhoneModel {

    @Getter
    private final List<Integer> phoneNumber = new ArrayList<>();

    public void addDigit(int newDigit) {
        phoneNumber.add(newDigit);
    }
}

package com.vitech.playground.gofpatterns.structural.Bridge.color.impl;

import com.vitech.playground.gofpatterns.structural.Bridge.color.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("red fill.");
    }
}

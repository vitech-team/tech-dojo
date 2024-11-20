package com.vitech.playground.gofpatterns.structural.Bridge.shape.impl;

import com.vitech.playground.gofpatterns.structural.Bridge.color.Color;
import com.vitech.playground.gofpatterns.structural.Bridge.shape.Shape;

public class Square extends Shape {
    private double side;

    public Square(double side, Color color) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.print("The square with a ");
        color.fill();
    }
}

package com.vitech.playground.gofpatterns.structural.flyweight.model;

import lombok.ToString;

@ToString
public class Truck implements Vehicle {

    private final int[] location = new int[2];

    @Override
    public Type getType() {
        return Type.TRUCK;
    }

    @Override
    public void setLocation(int latitude, int longitude) {
        location[0] = latitude;
        location[1] = longitude;
    }

    @Override
    public int[] getLocation() {
        return location;
    }

}
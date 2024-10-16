package com.vitech.playground.gofpatterns.structural.flyweight.model;

public interface Vehicle {

    Type getType();

    int[] getLocation();

    void setLocation(int latitude, int longitude);
}

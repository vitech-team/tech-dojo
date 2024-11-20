package com.vitech.playground.gofpatterns.behavioral.mediator.model;

public class Runway {

    private boolean isTaken = false;

    public boolean isTaken() {
        return isTaken;
    }

    public void setTaken(boolean taken) {
        isTaken = taken;
    }
}

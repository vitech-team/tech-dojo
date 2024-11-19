package com.vitech.playground.gofpatterns.behavioral.mediator.model;

import com.vitech.playground.gofpatterns.behavioral.mediator.Airport;

public final class Plane {

    private final int id;
    private boolean inFlight;
    private final Airport mediator;

    public Plane(int id, Airport mediator) {
        this.id = id;
        this.mediator = mediator;
        this.mediator.addPlaneWaiting(this);
    }

    public int getId() {
        return id;
    }

    public boolean isInFlight() {
        return inFlight;
    }

    public void setInFlight(boolean inFlight) {
        this.inFlight = inFlight;
    }

    public void requestTakeOff() {
        mediator.requestTakeOff(this);
    }
}

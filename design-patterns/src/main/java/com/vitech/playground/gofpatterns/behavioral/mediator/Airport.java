package com.vitech.playground.gofpatterns.behavioral.mediator;

import com.vitech.playground.gofpatterns.behavioral.mediator.model.Plane;
import com.vitech.playground.gofpatterns.behavioral.mediator.model.Runway;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private final Runway runway;
    private final List<Plane> planesFlying = new ArrayList<>();
    private final List<Plane> planesWaiting = new ArrayList<>();

    public Airport(Runway runway) {
        this.runway = runway;
    }

    public List<Plane> getPlanesFlying() {
        return planesFlying;
    }

    public void addPlaneWaiting(Plane plane) {
        planesWaiting.add(plane);
    }

    public List<Plane> getPlanesWaiting() {
        return planesWaiting;
    }

    public void requestTakeOff(Plane plane) {
        if (!(plane.isInFlight() && runway.isTaken())) {
            System.out.println("Plane " + plane.getId() + " is taking off...");

            planesWaiting.remove(plane);
            planesFlying.add(plane);

            plane.setInFlight(true);
            runway.setTaken(true);
        }
    }
}

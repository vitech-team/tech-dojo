package com.vitech.playground.gofpatterns.behavioral.mediator;

import com.vitech.playground.gofpatterns.behavioral.mediator.model.Plane;
import com.vitech.playground.gofpatterns.behavioral.mediator.model.Runway;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class MediatorApp {

    public static void main(String[] args) {

        // Simplify the airport application using the Mediator Pattern
        // in order to decouple the objects and improve the code.

        Runway runway = new Runway();
        List<Plane> planesFlying = new ArrayList<>();
        List<Plane> planesWaiting = new ArrayList<>();

        Plane plane1 = new Plane(1);
        planesWaiting.add(plane1);

        if (!(plane1.isInFlight() && runway.isTaken())) {
            log.info("Plane {} is taking off...", plane1.getId());

            planesWaiting.remove(plane1);
            planesFlying.add(plane1);

            plane1.setInFlight(true);
            runway.setTaken(true);
        }

    }
}

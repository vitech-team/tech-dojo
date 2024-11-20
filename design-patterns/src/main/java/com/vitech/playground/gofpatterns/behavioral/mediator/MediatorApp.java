package com.vitech.playground.gofpatterns.behavioral.mediator;

import com.vitech.playground.gofpatterns.behavioral.mediator.model.Plane;
import com.vitech.playground.gofpatterns.behavioral.mediator.model.Runway;

public class MediatorApp {

    public static void main(String[] args) {

        // Simplify the airport application using the Mediator Pattern
        // in order to decouple the objects and improve the code.

        Runway runway = new Runway();
        Airport airport = new Airport(runway);

        Plane plane1 = new Plane(1, airport);
        Plane plane2 = new Plane(2, airport);
        Plane plane3 = new Plane(3, airport);

        System.out.println("Plains waiting : " + airport.getPlanesWaiting().size());
        System.out.println("Plains flying : " + airport.getPlanesFlying().size());

        plane1.requestTakeOff();
        System.out.println("Plains waiting : " + airport.getPlanesWaiting().size());
        System.out.println("Plains flying : " + airport.getPlanesFlying().size());

        plane2.requestTakeOff();
        System.out.println("Plains waiting : " + airport.getPlanesWaiting().size());
        System.out.println("Plains flying : " + airport.getPlanesFlying().size());

        plane3.requestTakeOff();
        System.out.println("Plains waiting : " + airport.getPlanesWaiting().size());
        System.out.println("Plains flying : " + airport.getPlanesFlying().size());
    }
}

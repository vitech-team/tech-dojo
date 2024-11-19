package com.vitech.playground.gofpatterns.behavioral.chainofresponsibility;

import com.vitech.playground.gofpatterns.behavioral.chainofresponsibility.model.*;

public class ChainOfResponsibilityApp {

    public static void main(String[] args) {

        // Example Scenario
        // 1. Create an employee request for a salary increase of 1.5%, which is handled by the Immediate Supervisor.
        // 2. Create a request for a 3% increase, handled by the Head of Unit.
        // 3. Create a request for a 6% increase, which reaches the CEO for approval.

        // Edge Cases:
        // 4. Handle scenarios where the requested increase is invalid (e.g., negative values or values that are too high).
        // 5. Ensure that requests without a defined handler (i.e., outside the responsibility chain) are appropriately rejected.

        Manager mike = new CEO();
        Manager john = new HeadOfUnit();
        Manager nick = new Supervisor();

        nick.nextManager(john);
        john.nextManager(mike);

        nick.processRequest(new RaiseRequest("Paul", 1500, 1.5));
        nick.processRequest(new RaiseRequest("Sara", 1500, 3.0));
        nick.processRequest(new RaiseRequest("Bill", 1500, 6.0));
    }
}

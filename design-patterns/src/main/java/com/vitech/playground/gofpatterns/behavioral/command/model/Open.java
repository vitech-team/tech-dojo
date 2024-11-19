package com.vitech.playground.gofpatterns.behavioral.command.model;

public class Open implements Button {

    private final Elevator elevator;

    public Open(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void push() {
        elevator.openDoor();
    }
}

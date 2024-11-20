package com.vitech.playground.gofpatterns.behavioral.command.model;

public class Close implements Button {

    private final Elevator elevator;

    public Close(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void push() {
        elevator.closeDoor();
    }
}

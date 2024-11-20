package com.vitech.playground.gofpatterns.behavioral.command.model;

public class Elevator {

    private boolean isOpen;

    public void openDoor() {
        if (!isOpen) {
            System.out.println("The door opens!");
            isOpen = true;
        } else {
            System.out.println("The door is already open.");
        }
    }

    public void closeDoor() {
        if (isOpen) {
            System.out.println("The door closes!");
            isOpen = false;
        } else {
            System.out.println("The door is already close.");
        }
    }
}

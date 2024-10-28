package com.vitech.playground.gofpatterns.behavioral.command.model;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Elevator {

    public void openDoor() {
        log.info("The door opens!");
    }

    public void closeDoor() {
        log.info("The door closes!");
    }
}

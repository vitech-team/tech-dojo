package com.vitech.playground.gofpatterns.behavioral.observer.exercise1.model;

import java.util.ArrayList;
import java.util.List;

public class Connection {

    private String status;
    private final List<StatusFeed> observers = new ArrayList<>();

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        for (StatusFeed observer : observers) {
            observer.update(status);
        }
    }

    public void addObserver(StatusFeed observer) {
        observers.add(observer);
    }
}

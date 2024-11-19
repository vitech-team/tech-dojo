package com.vitech.playground.gofpatterns.behavioral.observer.exercise1.model;

import java.util.ArrayList;
import java.util.List;

public class StatusFeed {

    private final List<String> statuses = new ArrayList<>();

    public void update(String status) {
      statuses.add(status);
    }

    public void printStatuses() {
        statuses.forEach(System.out::println);
    }
}

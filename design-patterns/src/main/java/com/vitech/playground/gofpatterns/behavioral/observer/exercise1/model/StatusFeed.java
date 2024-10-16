package com.vitech.playground.gofpatterns.behavioral.observer.exercise1.model;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class StatusFeed {

  private final List<String> statuses = new ArrayList<>();

  public void printStatuses() {
    statuses.forEach(log::info);
  }


}

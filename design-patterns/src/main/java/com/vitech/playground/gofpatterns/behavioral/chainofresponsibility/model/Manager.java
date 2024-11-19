package com.vitech.playground.gofpatterns.behavioral.chainofresponsibility.model;

public abstract class Manager {

    protected Manager nextManager;

    public void nextManager(Manager manager) {
        this.nextManager = manager;
    }

    public abstract void processRequest(RaiseRequest raiseRequest);
}

package com.vitech.playground.gofpatterns.behavioral.Memento.gamepad;

public interface Originator {
    Memento save();
    void restore(Memento memento);
}

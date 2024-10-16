package com.vitech.playground.gofpatterns.behavioral.mediator.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@RequiredArgsConstructor
public final class Plane {

    private final int id;
    @Setter
    private boolean inFlight;


}

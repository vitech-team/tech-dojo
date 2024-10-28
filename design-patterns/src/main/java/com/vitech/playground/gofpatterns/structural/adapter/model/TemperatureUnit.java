package com.vitech.playground.gofpatterns.structural.adapter.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum TemperatureUnit {

    CELSIUS("C"),
    FAHRENHEIT("F");

    private final String unit;

}

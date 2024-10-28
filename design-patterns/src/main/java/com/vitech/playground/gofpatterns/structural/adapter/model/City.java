package com.vitech.playground.gofpatterns.structural.adapter.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@RequiredArgsConstructor
public abstract class City {

    private final String name;
    private final double temperature;
    @Setter
    private boolean hasWeatherWarning;

    public abstract TemperatureUnit getTemperatureUnits();

}

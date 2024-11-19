package com.vitech.playground.gofpatterns.structural.adapter.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

public abstract class City {

    private final String name;
    private final double temperature;
    private boolean hasWeatherWarning;

    public City(String name, double temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    public abstract TemperatureUnit getTemperatureUnits();

    public String getName() {
        return name;
    }

    public double getTemperature() {
        return temperature;
    }

    public boolean isHasWeatherWarning() {
        return hasWeatherWarning;
    }

    public void setHasWeatherWarning(boolean hasWeatherWarning) {
        this.hasWeatherWarning = hasWeatherWarning;
    }
}

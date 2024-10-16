package com.vitech.playground.gofpatterns.structural.adapter.model;

public class EuropeCity extends City {

    public EuropeCity(String name, double temperature) {
        super(name, temperature);
    }

    @Override
    public TemperatureUnit getTemperatureUnits() {
        return TemperatureUnit.CELSIUS;
    }
}

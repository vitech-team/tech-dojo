package com.vitech.playground.gofpatterns.structural.adapter.model;

public class AmericanCity extends City {

    public AmericanCity(String name, double temperature) {
        super(name, temperature);
    }

    @Override
    public TemperatureUnit getTemperatureUnits() {
        return TemperatureUnit.FAHRENHEIT;
    }
}

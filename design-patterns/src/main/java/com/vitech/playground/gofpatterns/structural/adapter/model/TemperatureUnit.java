package com.vitech.playground.gofpatterns.structural.adapter.model;

public enum TemperatureUnit {

    CELSIUS("C"),
    FAHRENHEIT("F");

    private final String unit;

    TemperatureUnit(String unit) {
        this.unit = unit;
    }

    public String getUnit() {
        return this.unit;
    }
}

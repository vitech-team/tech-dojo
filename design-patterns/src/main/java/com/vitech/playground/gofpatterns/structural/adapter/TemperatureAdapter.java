package com.vitech.playground.gofpatterns.structural.adapter;

import com.vitech.playground.gofpatterns.structural.adapter.model.City;
import com.vitech.playground.gofpatterns.structural.adapter.model.TemperatureUnit;

public class TemperatureAdapter extends City {
    public TemperatureAdapter(City city) {
        super(city.getName(), city.getTemperatureUnits() != TemperatureUnit.CELSIUS
                ? (city.getTemperature() - 32) * 5 / 9
                : city.getTemperature());
    }

    @Override
    public TemperatureUnit getTemperatureUnits() {
        return TemperatureUnit.CELSIUS;
    }
}

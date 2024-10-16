package com.vitech.playground.gofpatterns.structural.adapter;

import com.vitech.playground.gofpatterns.structural.adapter.model.City;

import java.text.MessageFormat;

public class WeatherMonitor {

    public static double MAX_TEMPERATURE = 40;
    public static double MIN_TEMPERATURE = 0;

    public void postWarning(City city) {
        if (city.getTemperature() >= MAX_TEMPERATURE) {
            System.out.println(
                    MessageFormat.format(
                            "Attention! Extremely high temperature in {0}. Current temperature is {1} {2}",
                            city.getName(), city.getTemperature(), city.getTemperatureUnits().getUnit()
                    )
            );
            city.setHasWeatherWarning(true);
        } else if (city.getTemperature() <= MIN_TEMPERATURE) {
            System.out.println(
                    MessageFormat.format(
                            "Attention! Extremely low temperature in {0}. Current temperature is {1} {2}",
                            city.getName(), city.getTemperature(), city.getTemperatureUnits().getUnit()
                    )
            );
            city.setHasWeatherWarning(true);
        } else {
            System.out.println("Temperature in " + city.getName() + " is OK.");
        }
    }
}

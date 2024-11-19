package com.vitech.playground.gofpatterns.structural.adapter;

import com.vitech.playground.gofpatterns.structural.adapter.model.AmericanCity;
import com.vitech.playground.gofpatterns.structural.adapter.model.City;
import com.vitech.playground.gofpatterns.structural.adapter.model.EuropeCity;

public class AdapterApp {

    public static void main(String[] args) {
        WeatherMonitor weatherMonitor = new WeatherMonitor();

        EuropeCity london = new EuropeCity("London", 16);
        weatherMonitor.postWarning(london);

        EuropeCity milan = new EuropeCity("Milan", 42);
        weatherMonitor.postWarning(milan);

        EuropeCity spitsbergen = new EuropeCity("Spitsbergen", -15);
        weatherMonitor.postWarning(spitsbergen);

        AmericanCity tampa = new AmericanCity("Tampa", 122);

        // implement adapter to post warning for american city (temperature should be printed in Celsius)
        weatherMonitor.postWarning(new TemperatureAdapter(tampa));

    }
}

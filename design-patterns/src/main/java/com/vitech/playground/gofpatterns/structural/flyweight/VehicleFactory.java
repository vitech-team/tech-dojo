package com.vitech.playground.gofpatterns.structural.flyweight;

import com.vitech.playground.gofpatterns.structural.flyweight.model.Car;
import com.vitech.playground.gofpatterns.structural.flyweight.model.Truck;
import com.vitech.playground.gofpatterns.structural.flyweight.model.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {

    private final Map<Integer, Vehicle> vehicles = new HashMap<>();

    public Vehicle getVehicle(int type) {
        return vehicles.computeIfAbsent(type, key -> switch (key) {
            case 0 -> new Car();
            case 1 -> new Truck();
            default -> throw new IllegalArgumentException("Unknown vehicle type: " + key);
        });
    }
}

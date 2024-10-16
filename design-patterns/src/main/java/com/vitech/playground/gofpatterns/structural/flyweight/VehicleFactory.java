package com.vitech.playground.gofpatterns.structural.flyweight;

import com.vitech.playground.gofpatterns.structural.flyweight.model.Car;
import com.vitech.playground.gofpatterns.structural.flyweight.model.Truck;
import com.vitech.playground.gofpatterns.structural.flyweight.model.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {

    private final Map<Integer, Vehicle> vehicles = new HashMap<>();

    public Vehicle getVehicle(int type) {
        Vehicle vehicle = null;

        if (type == 0) {
            vehicle = new Car();
        } else if (type == 1) {
            vehicle = new Truck();
        }
        vehicles.put(type, vehicle);

        return vehicle;
    }
}

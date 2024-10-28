package com.vitech.playground.gofpatterns.structural.flyweight;

import com.vitech.playground.gofpatterns.structural.flyweight.model.Vehicle;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class FlyweightApp {

    private static final ArrayList<Vehicle> vehicles = new ArrayList<>();
    private static final VehicleFactory vehicleFactory = new VehicleFactory();

    public static void main(String[] args) {
        // We have an app which predicts traffic.
        //
        // Classes:
        // - Vehicle interface with getType(), getLocation(), setLocation() methods
        // - its implementations: Car, Truck
        // - FlyweightApp which holds the main process
        //
        // Flyweight objects allow to share the intrinsic states, so we reuse that,
        // and the extrinsic state's info can be passed to the flyweight object when it needs it.
        // Apply Flyweight pattern on VehicleFactory to optimize resource allocation.

        Runnable createVehicles = FlyweightApp::createRandomCar;
        Runnable removeVehicles = FlyweightApp::removeCar;

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
        executor.scheduleAtFixedRate(createVehicles, 0, 3, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(removeVehicles, 5, 5, TimeUnit.SECONDS);

    }

    private static void createRandomCar() {
        Random random = new Random();
        int randInt = random.nextInt(2);
        Vehicle vehicle = vehicleFactory.getVehicle(randInt);
        vehicle.setLocation(random.nextInt(1000), random.nextInt(1000));
        System.out.println("Creating vehicle " + vehicle);
        vehicles.add(vehicle);
    }

    private static void removeCar() {
        System.out.println("Removing " + vehicles.getFirst());
        vehicles.removeFirst();
    }
}

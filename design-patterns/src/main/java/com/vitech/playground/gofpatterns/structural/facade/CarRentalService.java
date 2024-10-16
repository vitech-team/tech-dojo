package com.vitech.playground.gofpatterns.structural.facade;

import java.time.LocalDate;

public class CarRentalService {

    public void rentCar(LocalDate start, LocalDate end) {
        System.out.println("Car rented for " + start + " to " + end);
    }

}

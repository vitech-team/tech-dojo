package com.vitech.playground.gofpatterns.structural.facade;

import java.time.LocalDate;

public class HotelService {

    public void bookApartment(LocalDate checkinDate, LocalDate checkoutDate) {
        System.out.println("Apartment booked for " + checkinDate + " to " + checkoutDate);
    }
}

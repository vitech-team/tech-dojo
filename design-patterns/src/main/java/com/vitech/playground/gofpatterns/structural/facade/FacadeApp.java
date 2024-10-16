package com.vitech.playground.gofpatterns.structural.facade;

import java.time.LocalDate;

public class FacadeApp {

    public static void main(String[] args) {
        // There's a functionality to manage vacations (car rentals, hotel bookings & flight arrangements).
        // Use the Facade pattern to unify the client's many calls of methods into one
        // which simply books the entire vacation's details for selected dates.

        LocalDate startDate = LocalDate.of(2024, 12, 1);
        LocalDate endDate = LocalDate.of(2024, 12, 15);

        FlightService flightService = new FlightService();
        flightService.buyOutwardTicket(startDate);
        flightService.buyReturnTicket(endDate);

        HotelService hotelService = new HotelService();
        hotelService.bookApartment(startDate, endDate);

        CarRentalService carRentalService = new CarRentalService();
        carRentalService.rentCar(startDate, endDate);
    }
}

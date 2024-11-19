package com.vitech.playground.gofpatterns.structural.facade;

import java.time.LocalDate;

public class VacationManager {
    private FlightService flightService;
    private HotelService hotelService;
    private CarRentalService carRentalService;

    public VacationManager() {
        this.flightService = new FlightService();
        this.hotelService = new HotelService();
        this.carRentalService = new CarRentalService();
    }

    public void happyVacation(LocalDate startDate, LocalDate endDate) {
        flightService.buyOutwardTicket(startDate);
        flightService.buyReturnTicket(endDate);
        hotelService.bookApartment(startDate, endDate);
        carRentalService.rentCar(startDate, endDate);
    }




}

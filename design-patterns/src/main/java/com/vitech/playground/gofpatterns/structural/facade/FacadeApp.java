package com.vitech.playground.gofpatterns.structural.facade;

import java.time.LocalDate;

public class FacadeApp {

    public static void main(String[] args) {
        // There's a functionality to manage vacations (car rentals, hotel bookings & flight arrangements).
        // Use the Facade pattern to unify the client's many calls of methods into one
        // which simply books the entire vacation's details for selected dates.

        LocalDate startDate = LocalDate.of(2024, 12, 1);
        LocalDate endDate = LocalDate.of(2024, 12, 15);

        VacationManager vacationManager = new VacationManager();
        vacationManager.happyVacation(startDate, endDate);
    }
}

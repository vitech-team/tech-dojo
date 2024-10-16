package com.vitech.playground.gofpatterns.structural.facade;

import java.time.LocalDate;

public class FlightService {


        public void buyOutwardTicket(LocalDate start) {
            System.out.println("Outbound flight booked for " + start);
        }

        public void buyReturnTicket(LocalDate end) {
            System.out.println("Return flight booked for " + end);
        }

}

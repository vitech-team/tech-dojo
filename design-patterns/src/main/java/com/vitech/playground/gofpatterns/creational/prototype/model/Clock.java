package com.vitech.playground.gofpatterns.creational.prototype.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Clock {

    private ClockHand hourHand;
    private ClockHand minuteHand;

    public Clock(int hour, int minute) {
        hourHand = new ClockHand(hour);
        minuteHand = new ClockHand(minute);
    }
}

package com.vitech.playground.gofpatterns.creational.prototype;

import com.vitech.playground.gofpatterns.creational.prototype.model.Clock;
import com.vitech.playground.gofpatterns.creational.prototype.model.ClockHand;

public class PrototypeApp {

    public static void main(String[] args) {

        // 1. Instantiate clock
        // 2. Clone clock
        // 3. Change the clone clock time
        // 4. Check original clock time (should be unchanged)
        // 5. Change original clock time
        // 6. Check the clone clock time (should be unchanged)

        Clock originalClock = new Clock(10, 15);
        Clock cloneClock = originalClock.clone();

        cloneClock.setHourHand(new ClockHand(15));
        cloneClock.setMinuteHand(new ClockHand(45));

        System.out.println(originalClock);
        System.out.println(cloneClock);

        originalClock.setHourHand(new ClockHand(19));
        originalClock.setMinuteHand(new ClockHand(30));

        System.out.println("=======================================");

        System.out.println(originalClock);
        System.out.println(cloneClock);

    }
}

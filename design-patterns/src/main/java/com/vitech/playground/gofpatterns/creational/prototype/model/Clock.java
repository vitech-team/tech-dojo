package com.vitech.playground.gofpatterns.creational.prototype.model;

public class Clock implements Cloneable {

    private ClockHand hourHand;
    private ClockHand minuteHand;

    public Clock(int hour, int minute) {
        hourHand = new ClockHand(hour);
        minuteHand = new ClockHand(minute);
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    public Clock clone() {
        return new Clock(hourHand.time(), minuteHand.time());
    }

    public ClockHand getHourHand() {
        return hourHand;
    }

    public void setHourHand(ClockHand hourHand) {
        this.hourHand = hourHand;
    }

    public ClockHand getMinuteHand() {
        return minuteHand;
    }

    public void setMinuteHand(ClockHand minuteHand) {
        this.minuteHand = minuteHand;
    }

    @Override
    public String toString() {
        return "Clock {" +
                "hourHand = " + hourHand.time() +
                ", minuteHand = " + minuteHand.time() +
                " }";
    }
}

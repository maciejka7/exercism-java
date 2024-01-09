package com.exercism.learning.ElonsToyCar;

public class ElonsToyCar {

    private final int distancePerDrive = 20;
    private final int batteryPerDrive = 1;
    private int batteryLeft = 100;
    private int drivenDistance = 0;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %s meters", this.drivenDistance);
    }

    public String batteryDisplay() {
        if (this.batteryLeft <= 0) {
            return "Battery empty";
        } else {
            return String.format("Battery at %s%%", this.batteryLeft);
        }
    }

    public void drive() {
        this.batteryLeft = this.batteryLeft - this.batteryPerDrive;
        if (this.batteryLeft >= 0) {
            this.drivenDistance = this.drivenDistance + this.distancePerDrive;
        }
    }
}
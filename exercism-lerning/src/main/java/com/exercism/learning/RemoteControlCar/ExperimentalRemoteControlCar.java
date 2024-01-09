package com.exercism.learning.RemoteControlCar;

public class ExperimentalRemoteControlCar implements RemoteControlCar {

    private final int DISTANCE = 20;
    private int distanceTravelled = 0;

    public void drive() {
        this.distanceTravelled += this.DISTANCE;
    }

    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }
}
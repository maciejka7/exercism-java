package com.exercism.learning.RemoteControlCar;

class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    private final int DISTANCE = 10;

    private int victories = 0;
    private int distanceTravelled = 0;

    public void drive() {
        this.distanceTravelled += this.DISTANCE;
    }choco install exercism-io-cli

    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }

    public int getNumberOfVictories() {
        return this.victories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.victories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        return Integer.compare(o.victories, this.victories);

    }

}
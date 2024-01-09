package com.exercism.learning.CarsAssemble;

public class CarsAssemble {
    private final double productionCapacityPerHour = 221;

    public double productionRatePerHour(int speed) {
        return (speed * this.productionCapacityPerHour) * this.getSuccedRate(speed);

    }

    public int workingItemsPerMinute(int speed) {
        return (int) this.productionRatePerHour(speed) / 60;
    }

    private double getSuccedRate(int speed) {
        if (speed == 0) {
            return 0;
        } else if (speed <= 4) {
            return 1;
        } else if (speed > 4 && speed <= 8) {
            return 0.9;
        } else if (speed == 9) {
            return 0.8;
        } else {
            return 0.77;
        }
    }
}
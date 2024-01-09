package com.exercism.learning.CookLasagna;

public class Lasagna {

    private int minutesPerLayer = 2;
    private int expectedMinutesInOven = 40;

    public int expectedMinutesInOven() {
        return this.expectedMinutesInOven;
    }

    public int remainingMinutesInOven(int remainingMin) {
        return this.expectedMinutesInOven() - remainingMin;
    }

    public int preparationTimeInMinutes(int numbersOfLayers) {
        return numbersOfLayers * this.minutesPerLayer;

    }

    public int totalTimeInMinutes(int numbersOfLayers, int minInOven) {
        return this.preparationTimeInMinutes(numbersOfLayers) + minInOven;
    }

}

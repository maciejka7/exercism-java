package com.exercism.learning.cookLasagna;

public class Lasagna {

    private final int minutesPerLayer = 2;
    private final int expectedMinutesInOven = 40;

    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return this.expectedMinutesInOven;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int remainingMin) {
        return this.expectedMinutesInOven() - remainingMin;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numbersOfLayers) {
        return numbersOfLayers * this.minutesPerLayer;
        
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numersOfLayers, int minInOven) {
            return this.preparationTimeInMinutes(numersOfLayers) + minInOven;
        }

}

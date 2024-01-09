package com.exercism.learning.cookLasagna;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LasagnaTest {

    private final Lasagna lasagna = new Lasagna();

    @Test
    void testPreparationTimeInMinutes() {

        assertEquals(4, lasagna.preparationTimeInMinutes(2));
    }

    @Test
    void testRemainingMinutesInOven() {

        assertEquals(10, lasagna.remainingMinutesInOven(30));
    }

    @Test
    void testTotalTimeInMinutes() {
        assertEquals(26, lasagna.totalTimeInMinutes(3, 20));
    }

    @Test
    void totalTimeInMinutesForMultipleLayers() {
        assertEquals(16, lasagna.totalTimeInMinutes(4, 8));
    }
}

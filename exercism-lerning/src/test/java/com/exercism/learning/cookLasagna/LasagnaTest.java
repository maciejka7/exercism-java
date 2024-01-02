package com.exercism.learning.cookLasagna;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LasagnaTest {

    private final Lasagna lasagna = new Lasagna();

    @Test
    public void testPreparationTimeInMinutes() {

        assertEquals(4, lasagna.preparationTimeInMinutes(2));
    }

    @Test
    public void testRemainingMinutesInOven() {

        assertEquals(10, lasagna.remainingMinutesInOven(30));
    }

    @Test
    public void testTotalTimeInMinutes() {
        assertEquals(26, lasagna.totalTimeInMinutes(3, 20));
    }

    @Test
    public void totalTimeInMinutesForMultipleLayers() {
        assertEquals(16, lasagna.totalTimeInMinutes(4, 8));
    }
}

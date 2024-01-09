package com.exercism.learning.BirdWatcher;

import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        return Arrays.stream(this.birdsPerDay).anyMatch(x -> x == 0);
    }

    public int getCountForFirstDays(int numberOfDays) {
        return Arrays.stream(this.birdsPerDay).limit(numberOfDays).sum();
    }

    public int getBusyDays() {
        int bussyDayStartFrom = 5;
        return (int) Arrays.stream(this.birdsPerDay).filter(x -> x >= bussyDayStartFrom).count();
    }
}
package com.leti2021_2.playingFieldObjects;

public class SeniorTester implements Tester {
    static final String DESCRIPTION = "Senior Tester Description";
    private double health = 100;
    private int stressTolerance = 4;
    private double efficiency = 20;

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
    @Override
    public double getHealth() { return health; }
    @Override
    public int getStressTolerance() { return stressTolerance; }
    @Override
    public double getEfficiency() { return efficiency; }

    @Override
    public void setHealth(double input) {
        if (input >= 0)
            health = input;
        else
            throw new IllegalArgumentException("Health cannot be less then zero.");
    }

    @Override
    public void setStressTolerance(int input) {
        if (input >= 1)
            stressTolerance = input;
        else
            throw new IllegalArgumentException("Stress Tolerance cannot be less then one.");
    }

    @Override
    public void setEfficiency(double input) {
        if (input >= 0)
            efficiency = input;
        else
            throw new IllegalArgumentException("Efficiency cannot be less then zero.");
    }
}

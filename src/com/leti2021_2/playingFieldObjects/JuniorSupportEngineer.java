package com.leti2021_2.playingFieldObjects;

public class JuniorSupportEngineer implements SupportEngineer {
    static final String DESCRIPTION = "Junior Support Engineer Description";
    private double health = 50;
    private int stressTolerance = 3;
    private double efficiency = 8;

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

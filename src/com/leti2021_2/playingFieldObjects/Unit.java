package com.leti2021_2.playingFieldObjects;

public class Unit extends PlayingFieldObject {

    private double health;
    private int stressTolerance;
    private double efficiency;

    public double getHealth() { return health; }
    public int getStressTolerance() { return stressTolerance; }
    public double getEfficiency() { return efficiency; }

    public void setHealth(double input) {
        if (input >= 0)
            health = input;
        else
            throw new IllegalArgumentException("Health cannot be less then zero.");
    }

    public void setStressTolerance(int input) {
        if (input >= 1)
            stressTolerance = input;
        else
            throw new IllegalArgumentException("Stress Tolerance cannot be less then one.");
    }

    public void setEfficiency(double input) {
        if (input >= 0)
            efficiency = input;
        else
            throw new IllegalArgumentException("Efficiency cannot be less then zero.");
    }


    public static class FactoryMaker {
        public enum UnitType {
            JUNIOR, SENIOR
        }

        public static UnitFactory makeFactory(UnitType type) {
            switch (type) {
                case JUNIOR:
                    return new JuniorUnitFactory();
                case SENIOR:
                    return new SeniorUnitFactory();
                default:
                    throw new IllegalArgumentException("UnitType not supported.");
            }
        }
    }
}

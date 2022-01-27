package com.leti2021_2.FieldObjects.Units;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.BLACK_BACK;
import static com.diogonunes.jcolor.Attribute.BRIGHT_BLUE_TEXT;

public class JuniorTester extends Tester {
    static final String DESCRIPTION = "Junior Tester Description";
    private double health = 50;
    private double stressTolerance = 2;
    private double skillLvl = 10;

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
    @Override
    public double getHealth() { return health; }
    @Override
    public double getStressTolerance() { return stressTolerance; }
    @Override
    public double getSkillLvl() { return skillLvl; }

    @Override
    public void setHealth(double input) {
        if (input > 0)
            health = input;
        else {
            health = input;
            super.notifyUniversity();
        }
    }

    @Override
    public void setStressTolerance(double input) {
        if (input >= 1)
            stressTolerance = input;
        else
            throw new IllegalArgumentException("Stress Tolerance cannot be less then one.");
    }

    @Override
    public void setSkillLvl(double input) {
        if (input >= 0)
            skillLvl = input;
        else
            throw new IllegalArgumentException("Efficiency cannot be less then zero.");
    }

    @Override
    public void display() {
        System.out.print(colorize("t", BRIGHT_BLUE_TEXT(), BLACK_BACK()));
    }
}

package com.leti2021_2.FieldObjects.Units;

import com.leti2021_2.FieldObjects.FieldObject;
import com.leti2021_2.FieldObjects.Programmer;

public class JuniorProgrammer implements Programmer, FieldObject {
    static final String DESCRIPTION = "Junior Programmer Description";
    private double health = 50;
    private int stressTolerance = 1;
    private double skillLvl = 15;

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
    @Override
    public double getHealth() { return health; }
    @Override
    public int getStressTolerance() { return stressTolerance; }
    @Override
    public double getSkillLvl() { return skillLvl; }

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
    public void setSkillLvl(double input) {
        if (input >= 0)
            skillLvl = input;
        else
            throw new IllegalArgumentException("Efficiency cannot be less then zero.");
    }
}
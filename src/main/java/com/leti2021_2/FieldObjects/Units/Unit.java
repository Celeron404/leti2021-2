package com.leti2021_2.FieldObjects.Units;

import com.leti2021_2.FieldObjects.FieldObject;

public abstract class Unit implements FieldObject {
    //abstract public String getDescription();
    abstract public double getHealth();
    abstract public int getStressTolerance();
    abstract public double getSkillLvl();

    abstract public void setHealth(double input);
    abstract public void setStressTolerance(int input);
    abstract public void setSkillLvl(double input);

    //abstract public void display();

    @Override
    public boolean isPassable() { return false; }
}

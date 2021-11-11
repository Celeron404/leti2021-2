package com.leti2021_2.FieldObjects.Units;

public interface Programmer extends Unit {
    double getHealth();
    int getStressTolerance();
    double getSkillLvl();

    void setHealth(double input);
    void setStressTolerance(int input);
    void setSkillLvl(double input);
}

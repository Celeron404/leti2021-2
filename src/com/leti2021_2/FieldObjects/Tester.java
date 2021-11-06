package com.leti2021_2.FieldObjects;

public interface Tester {
    String getDescription();
    double getHealth();
    int getStressTolerance();
    double getSkillLvl();

    void setHealth(double input);
    void setStressTolerance(int input);
    void setSkillLvl(double input);
}

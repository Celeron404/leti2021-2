package com.leti2021_2.playingFieldObjects;

public interface Programmer {
    String getDescription();
    double getHealth();
    int getStressTolerance();
    double getSkillLvl();

    void setHealth(double input);
    void setStressTolerance(int input);
    void setSkillLvl(double input);
}

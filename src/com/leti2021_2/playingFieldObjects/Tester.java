package com.leti2021_2.playingFieldObjects;

public interface Tester {
    String getDescription();
    public double getHealth();
    public int getStressTolerance();
    public double getEfficiency();

    public void setHealth(double input);
    public void setStressTolerance(int input);
    public void setEfficiency(double input);
}

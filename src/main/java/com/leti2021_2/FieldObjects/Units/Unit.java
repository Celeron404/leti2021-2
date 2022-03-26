package com.leti2021_2.FieldObjects.Units;

import com.leti2021_2.FieldObjects.FieldObject;
import com.leti2021_2.FieldObjects.University;
import com.leti2021_2.ObjectType;

import java.io.IOException;

public abstract class Unit implements FieldObject {
    private boolean isAlive = true;
    private double health, stressTolerance = 1, skillLvl = 15;
    private String DESCRIPTION = "Default Unit Description";
    private boolean isNewSubject = true; // if University didn't check the Unit
    private University ownUniversity = null;

    public Unit() { }

    public String getDescription() { return DESCRIPTION; }

    abstract public UnitType getUnitType();

    @Override
    public ObjectType getType() {
        return ObjectType.UNIT;
    }

    public double getHealth() { return health; }

    public double getStressTolerance() { return stressTolerance; }

    public double getSkillLvl() { return skillLvl; }

    public University getOwnUniversity() { return ownUniversity; }

    public void setDESCRIPTION(String input) {
        if (input != null) DESCRIPTION = input;
        else throw new IllegalArgumentException("Unit Description cannot be null");
    }

    public void setHealth(double input) {
        if (input > 0)
            health = input;
        else {
            health = input;
            isAlive = false;
            notifyUniversity();
        }
    }

    public void setStressTolerance(double input) {
        if (input >= 1)
            stressTolerance = input;
        else
            throw new IllegalArgumentException("Stress Tolerance cannot be less then one.");
    }

    public void setSkillLvl(double input) {
        if (input >= 0)
            skillLvl = input;
        else
            throw new IllegalArgumentException("Efficiency cannot be less then zero.");
    }

    @Override
    public boolean isPassable() { return false; }

    public boolean isAlive() { return isAlive; }

    public void notifyUniversity() {
        if (ownUniversity != null) {
            ownUniversity.update(this);
            isNewSubject = false;
        } else
            throw new IllegalCallerException("A Unit has not yet any university!");
    }

    public boolean getIsNewSubject() {
        return isNewSubject;
    }

    public void setOwnUniversity(University university) {
        if (ownUniversity == null) {
            ownUniversity = university;
            notifyUniversity();
        } else throw new IllegalCallerException("Unit can only have one university.");
    }

}

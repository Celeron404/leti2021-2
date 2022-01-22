package com.leti2021_2.FieldObjects.Units;

import com.leti2021_2.FieldObjects.FieldObject;
import com.leti2021_2.FieldObjects.University;

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
        } else throw new IllegalCallerException("A Unit can only have one university.");
    }

    private boolean isNewSubject = true; // if University didn't check the Unit
    private University ownUniversity = null;

}

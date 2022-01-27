package com.leti2021_2.FieldObjects;

import com.leti2021_2.FieldObjects.TemporaryObjectsStrategies.BeerStrategy;
import com.leti2021_2.FieldObjects.Units.Unit;

public abstract class TemporaryObject implements FieldObject {
    public enum TemporaryObjectType {
        BEER, EASYTASK, HARDTASK
    }

    public boolean isPassable() { return true; }

    abstract public TemporaryObjectType getType();

    public abstract void interactWithUnit(Unit unit);
}

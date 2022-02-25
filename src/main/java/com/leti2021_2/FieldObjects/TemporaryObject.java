package com.leti2021_2.FieldObjects;

import com.leti2021_2.FieldObjects.TemporaryObjectsStrategies.BeerStrategy;
import com.leti2021_2.FieldObjects.Units.Unit;
import com.leti2021_2.ObjectType;

public abstract class TemporaryObject implements FieldObject {
    public enum TemporaryObjectType {
        BEER, EASYTASK, HARDTASK
    }

    public boolean isPassable() { return true; }

    @Override
    public ObjectType getType() {
        return ObjectType.TEMPORARYOBJECT;
    }

    abstract public TemporaryObjectType getTemporaryObjectType();

    public abstract void interactWithUnit(Unit unit);
}

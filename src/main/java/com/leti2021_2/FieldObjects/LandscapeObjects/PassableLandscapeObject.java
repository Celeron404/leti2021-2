package com.leti2021_2.FieldObjects.LandscapeObjects;

import com.leti2021_2.FieldObjects.FieldObject;
import com.leti2021_2.ObjectType;

public abstract class PassableLandscapeObject implements FieldObject {
    public abstract int getPassability();

    @Override
    public boolean isPassable() { return true; }

    @Override
    public ObjectType getType() {
        return ObjectType.PASSABLELANDSCAPEOBJECT;
    }
}

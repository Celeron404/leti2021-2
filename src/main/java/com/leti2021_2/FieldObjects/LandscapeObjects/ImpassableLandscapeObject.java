package com.leti2021_2.FieldObjects.LandscapeObjects;

import com.leti2021_2.FieldObjects.FieldObject;
import com.leti2021_2.ObjectType;

public abstract class ImpassableLandscapeObject implements FieldObject {
    @Override
    public boolean isPassable() { return false; }

    @Override
    public ObjectType getType() {
        return ObjectType.IMPASSABLELANDSCAPEOBJECT;
    }
}

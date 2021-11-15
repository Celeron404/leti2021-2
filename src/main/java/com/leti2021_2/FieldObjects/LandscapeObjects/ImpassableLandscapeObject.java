package com.leti2021_2.FieldObjects.LandscapeObjects;

import com.leti2021_2.FieldObjects.FieldObject;

public abstract class ImpassableLandscapeObject implements FieldObject {
    @Override
    public boolean isPassable() { return false; }
}

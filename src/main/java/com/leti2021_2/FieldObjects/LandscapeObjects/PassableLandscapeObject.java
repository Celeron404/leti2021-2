package com.leti2021_2.FieldObjects.LandscapeObjects;

import com.leti2021_2.FieldObjects.FieldObject;

public abstract class PassableLandscapeObject implements FieldObject {
    public static int getPassability() {
        return 0;
    }

    @Override
    public boolean isPassable() { return true; }
}

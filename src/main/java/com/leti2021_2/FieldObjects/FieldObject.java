package com.leti2021_2.FieldObjects;

import com.leti2021_2.ObjectType;

public interface FieldObject {
    String getDescription();
    boolean isPassable();
    void display();
    ObjectType getType();
}

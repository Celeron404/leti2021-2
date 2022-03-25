package com.leti2021_2;

import com.leti2021_2.FieldObjects.Direction;
import com.leti2021_2.FieldObjects.Units.Unit;
import com.leti2021_2.FieldObjects.Units.UnitType;
import com.leti2021_2.FieldObjects.University;

public class UserData {
    // Unit's data
    public Coords unitCoords;
    public Unit currentUnit;
    public Direction.type lookDirection, moveDirection;
    public int stepsToMove;

    // University's data
    public University currentUniversity;
    public UnitType newUnitType;
}

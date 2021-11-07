package com.leti2021_2;

import com.leti2021_2.FieldObjects.FieldObject;

import java.util.HashMap;
import java.util.Map;

public class PlayingField {
    private static int sideSize;
    private static int square;
    private static Map<Coords, FieldObject> fieldObjectMap = new HashMap<>();

    private PlayingField() { }
    public PlayingField(int sideSize) {
        setSideSize(sideSize);
        setSquare(sideSize);
        // ...
    }

    public static int getSideSize() { return sideSize; }
    public static int getSquare() { return square; }

    private void setSideSize(int sideSize) {
        if ((sideSize >= 3) && (sideSize <= 50))
            PlayingField.sideSize = sideSize;
        else
            throw new IllegalArgumentException("Side size cannot be less than 3 and more than 50");
    }

    private void setSquare(int sideSize) {
        square = sideSize * sideSize;
    }

    public static FieldObject getObject(Coords coords) {
        if (coords.getX() >= 0 && coords.getY() >= 0)
            return fieldObjectMap.get(coords);
        else throw new IllegalArgumentException("Coordinates cannot be less than zero.");
    }

    public static void addObject(FieldObject object, Coords coords) {
        if (coords.getX() >= 0 && coords.getY() >= 0)
            fieldObjectMap.put(coords, object);
        else throw new IllegalArgumentException("Coordinates cannot be less than zero.");
    }
}

package com.leti2021_2.FieldObjects;

import com.leti2021_2.Coords;
import com.leti2021_2.FieldObjects.FieldObject;

import java.util.HashMap;
import java.util.Map;

public class TemporaryObjectsMap {
    private static Map<Coords, FieldObject> temporaryObjectsMap = new HashMap<>();

    public static FieldObject getObject(Coords coords) {
        for (Map.Entry<Coords, FieldObject> entry : temporaryObjectsMap.entrySet()) {
            if (Coords.isEqual(entry.getKey(), coords))
                return entry.getValue();
        }
        return null;
    }

    public static void addObject(Coords coords, FieldObject object) {
        for (Map.Entry<Coords, FieldObject> entry : temporaryObjectsMap.entrySet()) {
            if (Coords.isEqual(entry.getKey(), coords))
                throw new IllegalArgumentException(coords.getX() + " " + coords.getX() + " : these coordinates are occupied by another object.");
        }
        temporaryObjectsMap.put(coords, object);
    }

    private static void removeObject(Coords coords) {
        for (Map.Entry<Coords, FieldObject> entry : temporaryObjectsMap.entrySet()) {
            if (Coords.isEqual(entry.getKey(), coords))
                temporaryObjectsMap.remove(entry.getKey());
        }
        throw new IllegalArgumentException(coords.getX() + " " + coords.getX() + " : there no object on these coordinates.");
    }

    public static Map<Coords, FieldObject> getTemporaryObjectsMap() { return temporaryObjectsMap; }
}

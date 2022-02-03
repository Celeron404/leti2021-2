package com.leti2021_2.FieldObjects;

import com.leti2021_2.Coords;

import java.util.HashMap;
import java.util.Iterator;
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

    public static void removeObject(Coords coords) {
        for (Map.Entry<Coords, FieldObject> item : temporaryObjectsMap.entrySet()) {
            if (Coords.isEqual(item.getKey(), coords)) {
                temporaryObjectsMap.remove(item.getKey());
                return;
            }
        }
        throw new IllegalArgumentException(coords.getX() + " " + coords.getX() + " : there no object on these coordinates.");
    }

    public static Map<Coords, FieldObject> getTemporaryObjectsMap() { return temporaryObjectsMap; }
}

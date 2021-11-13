package com.leti2021_2;

import com.leti2021_2.FieldObjects.FieldObject;

import java.util.HashMap;
import java.util.Map;

public class TemporaryObjects {
    private static Map<Coords, FieldObject> TemporaryObjectsMap = new HashMap<>();

    public static FieldObject getObject(Coords coords) {
        for (Map.Entry<Coords, FieldObject> entry : TemporaryObjectsMap.entrySet()) {
            if (Coords.isEqual(entry.getKey(), coords))
                return entry.getValue();
        }
        return null;
    }

    public static void addObject(Coords coords, FieldObject object) {
        for (Map.Entry<Coords, FieldObject> entry : TemporaryObjectsMap.entrySet()) {
            if (Coords.isEqual(entry.getKey(), coords))
                throw new IllegalArgumentException("These coordinates are occupied by another object.");
        }
        TemporaryObjectsMap.put(coords, object);
    }
}

package com.leti2021_2.FieldObjects;

import com.leti2021_2.Coords;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class FieldObjectMap<K,V> extends HashMap<K,V> {

    @Override
    public V put(K key, V value) {
        return super.put(K key, V value);
    }
    public static void addObject(Coords coords, FieldObject object) {
        for (Map.Entry<Coords, FieldObject> entry : fieldObjectMap.entrySet()) {
            if (Coords.isEqual(entry.getKey(), coords))
                throw new IllegalArgumentException("These coordinates are occupied by another object.");
        }
        fieldObjectMap.put(coords, object);
    }

    @Override
    public FieldObject getObject(Coords coords) {
        for (Map.Entry<Coords, FieldObject> entry : fieldObjectMap.entrySet()) {
            if (Coords.isEqual(entry.getKey(), coords))
                return entry.getValue();
        }
        return null;
    }
}

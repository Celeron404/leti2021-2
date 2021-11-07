package com.leti2021_2;

import com.leti2021_2.FieldObjects.FieldObject;

import java.util.Map;

public interface ObjectsGenerator {
    void GenerateFieldObjects(Map<Coords, FieldObject> fieldObjectMap, int numberOfObjects);
}

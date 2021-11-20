package com.leti2021_2;

import com.leti2021_2.FieldObjects.FieldObject;

import java.util.Map;

public class MapCopier {
    public static void run(Map<Coords, FieldObject> newLandscapeObjectsMap, Map<Coords, FieldObject> newTemporaryObjectsMap) {
        newLandscapeObjectsMap = PlayingField.getPlayingFieldMap();
        newTemporaryObjectsMap = TemporaryObjects.getTemporaryObjectsMap();
    }
}

package com.leti2021_2;

import com.leti2021_2.FieldObjects.Border;
import com.leti2021_2.FieldObjects.FieldObject;

import java.util.Map;

public class BorderGenerator implements ObjectsGenerator {

    @Override
    public void GenerateFieldObjects(Map<Coords, FieldObject> fieldObjectMap, int numberOfObjects) {
        int sideSize = PlayingField.getSideSize();

        for (int i = 0; i < sideSize; i++) {
            Coords coords = new Coords(0, i);
            PlayingField.addObject(new Border(), coords);
            coords.setX(i);
            coords.setY(0);
            PlayingField.addObject(new Border(), coords);
        }

        for (int i = sideSize; i > 0; i--) {
            Coords coords = new Coords(sideSize, i);
            PlayingField.addObject(new Border(), coords);
            coords.setX(i);
            coords.setY(sideSize);
            PlayingField.addObject(new Border(), coords);
        }
    }
}

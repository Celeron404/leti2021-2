package com.leti2021_2;

import com.leti2021_2.FieldObjects.LandscapeObjects.Border;
import com.leti2021_2.FieldObjects.FieldObject;

import java.util.Map;

public class BorderGenerator implements ObjectsGenerator {
    @Override
    public void generateFieldObjects(int numberOfObjects) {
        // value numberOfObjects cannot be use in this method
        int sideSize = PlayingField.getSideSize();

        for (int i = 0; i < sideSize; i++) {
            Coords coords = new Coords(0, i);
            PlayingField.addObject(new Border(), coords);
            Coords coords1 = new Coords(sideSize - 1, i);
            PlayingField.addObject(new Border(), coords1);
        }

        for (int i = 1; i < sideSize - 1; i++) {
            Coords coords = new Coords(i, 0);
            PlayingField.addObject(new Border(), coords);
            Coords coords1 = new Coords(i, sideSize - 1);
            PlayingField.addObject(new Border(), coords1);
        }
    }
}

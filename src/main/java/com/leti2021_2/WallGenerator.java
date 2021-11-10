package com.leti2021_2;

import com.leti2021_2.FieldObjects.LandscapeObjects.Wall;

public class WallGenerator implements ObjectsGenerator { //generates a border
    @Override
    public void generateFieldObjects(int numberOfObjects) {
        // value numberOfObjects is not used in this method
        int sideSize = PlayingField.getSideSize();

        for (int i = 0; i < sideSize; i++) {
            Coords coords = new Coords(0, i);
            PlayingField.addObject(new Wall(), coords);
            Coords coords1 = new Coords(sideSize - 1, i);
            PlayingField.addObject(new Wall(), coords1);
        }

        for (int i = 1; i < sideSize - 1; i++) {
            Coords coords = new Coords(i, 0);
            PlayingField.addObject(new Wall(), coords);
            Coords coords1 = new Coords(i, sideSize - 1);
            PlayingField.addObject(new Wall(), coords1);
        }
    }
}

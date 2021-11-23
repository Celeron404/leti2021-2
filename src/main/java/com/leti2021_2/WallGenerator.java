package com.leti2021_2;

import com.leti2021_2.FieldObjects.LandscapeObjects.Impassable.Wall;

public class WallGenerator implements ObjectsGenerator { //generates a border
    @Override
    public void generateFieldObjects() {
        int sideSize = PlayingField.getSideSize();

        for (int i = 0; i < sideSize; i++) {
            Coords coords = new Coords(0, i);
            PlayingField.addObject(coords, new Wall());
            Coords coords1 = new Coords(sideSize - 1, i);
            PlayingField.addObject(coords1, new Wall());
        }

        for (int i = 1; i < sideSize - 1; i++) {
            Coords coords = new Coords(i, 0);
            PlayingField.addObject(coords, new Wall());
            Coords coords1 = new Coords(i, sideSize - 1);
            PlayingField.addObject(coords1, new Wall());
        }
    }
}

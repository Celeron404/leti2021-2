package com.leti2021_2;

import com.leti2021_2.FieldObjects.LandscapeObjects.Impassable.Wall;
import com.leti2021_2.FieldObjects.LandscapeObjects.Passable.Floor;

public class FloorGenerator implements ObjectsGenerator { //generates a border
    @Override
    public void generateFieldObjects() {
        int sideSize = PlayingField.getSideSize();

        for (int i = 1; i < sideSize - 1; i++) {
            for (int j = 1; j < sideSize - 1; j++) {
                if (PlayingField.getObject(new Coords(i, j)) == null)
                    PlayingField.addObject(new Coords(i, j), new Floor());
            }
        }
    }
}

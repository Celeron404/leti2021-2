package com.leti2021_2;

import com.leti2021_2.FieldObjects.FieldObject;

import java.util.HashMap;
import java.util.Map;

import static com.diogonunes.jcolor.Ansi.colorize;

public class PlayingField implements Displayable {
    private static final int MAX_SIDE_SIZE = 40;
    private static int sideSize;
    private static int square;
    private static boolean isFieldExists = false;
    private static Map<Coords, FieldObject> LandscapeObjectsMap = new HashMap<>();

    private PlayingField() { }
    public PlayingField(int sideSize) {
        if (!isFieldExists) {
            setSideSize(sideSize);
            setSquare(sideSize);
            var wallGenerator = new WallGenerator();
            wallGenerator.generateFieldObjects(0);
            isFieldExists = true;
        }
        else
            throw new IllegalArgumentException("There can be only one Playing Field.");
    }

    public static int getSideSize() { return sideSize; }
    public static int getSquare() { return square; }

    private void setSideSize(int sideSize) {
        if ((sideSize >= 3) && (sideSize <= MAX_SIDE_SIZE))
            PlayingField.sideSize = sideSize;
        else
            throw new IllegalArgumentException("Side size cannot be less than 3 and more than " + MAX_SIDE_SIZE);
    }

    private void setSquare(int sideSize) {
        square = sideSize * sideSize;
    }

    public FieldObject getObject(Coords coords) {
        for (Map.Entry<Coords, FieldObject> entry : LandscapeObjectsMap.entrySet()) {
            if (Coords.isEqual(entry.getKey(), coords))
                return entry.getValue();
        }
        return null;
    }

    public static void addObject(Coords coords, FieldObject object) {
        for (Map.Entry<Coords, FieldObject> entry : LandscapeObjectsMap.entrySet()) {
            if (Coords.isEqual(entry.getKey(), coords))
                throw new IllegalArgumentException("These coordinates are occupied by another object.");
        }
        LandscapeObjectsMap.put(coords, object);
    }
}

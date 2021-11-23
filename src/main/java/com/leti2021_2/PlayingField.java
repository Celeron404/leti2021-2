package com.leti2021_2;

import com.leti2021_2.FieldObjects.FieldObject;
import com.leti2021_2.Generators.WallGenerator;

import java.util.HashMap;
import java.util.Map;

import static com.diogonunes.jcolor.Ansi.colorize;

public class PlayingField {
    private static final int MAX_SIDE_SIZE = 40;
    private static int sideSize;
    private static int square;
    private static boolean isFieldExists = false;
    private static Map<Coords, FieldObject> landscapeObjectsMap = new HashMap<>();

    private PlayingField() { }
    public PlayingField(int sideSize) {
        if (!isFieldExists) {
            setSideSize(sideSize);
            setSquare(sideSize);
            var wallGenerator = new WallGenerator();
            wallGenerator.generateFieldObjects();
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

    public static FieldObject getObject(Coords coords) {
        for (Map.Entry<Coords, FieldObject> entry : landscapeObjectsMap.entrySet()) {
            if (Coords.isEqual(entry.getKey(), coords))
                return entry.getValue();
        }
        return null;
    }

    public static void addObject(Coords coords, FieldObject object) {
        for (Map.Entry<Coords, FieldObject> entry : landscapeObjectsMap.entrySet()) {
            if (Coords.isEqual(entry.getKey(), coords))
                throw new IllegalArgumentException(coords.getX() + " " + coords.getX() + " : these coordinates are occupied by another object.");
        }
        landscapeObjectsMap.put(coords, object);
    }

    public static void replaceObject(Coords coords, FieldObject newObject) {
        for (Map.Entry<Coords, FieldObject> entry : landscapeObjectsMap.entrySet()) {
            if (Coords.isEqual(entry.getKey(), coords)) {
                landscapeObjectsMap.remove(entry.getKey());
                addObject(coords, newObject);
                return;
            }
        }
        throw new IllegalArgumentException(coords.getX() + " " + coords.getX() + " : there no object on these coordinates.");
    }

    public static int numberOfObjects() { return landscapeObjectsMap.size(); }

    public static Map<Coords, FieldObject> getPlayingFieldMap() { return landscapeObjectsMap; }

    private static void removeObject(Coords coords, FieldObject newObject) {
        for (Map.Entry<Coords, FieldObject> entry : landscapeObjectsMap.entrySet()) {
            if (Coords.isEqual(entry.getKey(), coords))
                landscapeObjectsMap.remove(entry.getKey());
        }
        throw new IllegalArgumentException(coords.getX() + " " + coords.getX() + " : there no object on these coordinates.");
    }
}

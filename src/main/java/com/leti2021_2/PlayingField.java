package com.leti2021_2;

import com.leti2021_2.FieldObjects.FieldObject;

import java.util.HashMap;
import java.util.Map;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.BLACK_BACK;
import static com.diogonunes.jcolor.Attribute.BLACK_TEXT;

public class PlayingField {
    private static final int MAX_SIDE_SIZE = 40;
    private static int sideSize;
    private static int square;
    private static Map<Coords, FieldObject> fieldObjectMap = new HashMap<>();
    private static boolean isFieldExixts = false;

    private PlayingField() { }
    public PlayingField(int sideSize) {
        if (!isFieldExixts) {
            setSideSize(sideSize);
            setSquare(sideSize);
            var wallGenerator = new WallGenerator();
            wallGenerator.generateFieldObjects(0);
            isFieldExixts = true;
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
        if (coords.getX() >= 0 && coords.getY() >= 0) {

            for (Map.Entry<Coords, FieldObject> entry : fieldObjectMap.entrySet()) {
                if (Coords.isEqual(entry.getKey(), coords))
                    return entry.getValue();
            }
        }
        else throw new IllegalArgumentException("Coordinates cannot be less than zero.");

        return null;
    }

    public static void addObject(Coords coords, FieldObject object) {
        if (coords.getX() >= 0 && coords.getY() >= 0) {
            for (Map.Entry<Coords, FieldObject> entry : fieldObjectMap.entrySet()) {
                if (Coords.isEqual(entry.getKey(), coords))
                    throw new IllegalArgumentException("These coordinates are occupied by another object.");
            }
            fieldObjectMap.put(coords, object);
        }
        else throw new IllegalArgumentException("Coordinates cannot be less than zero.");
    }

    public static void display() {
        for (int x = sideSize - 1; x >= 0; x--) {
            for (int y = 0; y < sideSize; y++) {
                System.out.print(colorize(" ", BLACK_TEXT(), BLACK_BACK()));

                Coords coords = new Coords(x, y);
                FieldObject currentObject = getObject(coords);
                if (currentObject != null) {
                    currentObject.display();
                }
                else System.out.print(colorize(" ", BLACK_TEXT(), BLACK_BACK()));

                System.out.print(colorize(" ", BLACK_TEXT(), BLACK_BACK()));
            }
            System.out.println();
        }
        System.out.println();
    }
}

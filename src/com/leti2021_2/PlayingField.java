package com.leti2021_2;

import com.leti2021_2.playingFieldObjects.Coordinates;
import com.leti2021_2.playingFieldObjects.PlayingFieldObject;

public class PlayingField {
    private static int sideSize;
    private static int square;

    private PlayingField() { }
    public PlayingField(int sideSize) {
        setSideSize(sideSize);
        setSquare(sideSize);

    }

    public static int getSideSize() { return sideSize; }
    public static int getSquare() { return square; }

    private void setSideSize(int sideSize) {
        if ((sideSize >= 3) && (sideSize <= 50))
            this.sideSize = sideSize;
        else
            throw new IllegalArgumentException("Side size cannot be less than 3 and more than 50");
    }

    private void setSquare(int sideSize) {
        square = sideSize * sideSize;
    }

    public static void addObject(Coordinates coordinates, PlayingFieldObject object) {

    }
}

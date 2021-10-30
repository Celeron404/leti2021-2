package com.leti2021_2.playingFieldObjects;

import com.leti2021_2.PlayingField;

public class PlayingFieldObject {
    private static int numberOfObjects = 0;

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public static void increaseNumberOfObjects() {
        if (numberOfObjects < PlayingField.getSquare())
            numberOfObjects++;
        else
            throw new IllegalArgumentException("Number of Objects cannot be more than " + PlayingField.getSquare() + ".");
    }

    public static void decreaseNumberOfObjects() {
        if (numberOfObjects > 0)
            numberOfObjects--;
        else
            throw new IllegalArgumentException("Number of Objects cannot be less than 0.");
    }
}

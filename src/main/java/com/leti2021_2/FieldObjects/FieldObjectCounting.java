/*
package com.leti2021_2.FieldObjects;

import com.leti2021_2.PlayingField;

public class FieldObjectCounting {
    private static int numberOfObjects = 0;

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public void increaseNumberOfObjects() {
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
*/

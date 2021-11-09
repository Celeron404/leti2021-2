package com.leti2021_2;

import com.leti2021_2.PlayingField;

public class Coords {
    private int x;
    private int y;

    Coords() {}
    Coords(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public void setX(int input) {
        if ((input >= 0) && (input <= PlayingField.getSideSize()))
            x = input;
    }

    public void setY(int input) {
        if ((input >= 0) && (input <= PlayingField.getSideSize()))
            y = input;
    }

    public static boolean isEqual(Coords coordsA, Coords coordsB) {
        return (coordsA.x == coordsB.x)
                && (coordsA.y == coordsB.y);
    }
}

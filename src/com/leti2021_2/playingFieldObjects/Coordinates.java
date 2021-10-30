package com.leti2021_2.playingFieldObjects;

import com.leti2021_2.PlayingField;

public class Coordinates {
    private int x;
    private int y;

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
}

package com.leti2021_2.FieldObjects.LandscapeObjects.Passable;

import com.leti2021_2.FieldObjects.LandscapeObjects.PassableLandscapeObject;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.BLACK_BACK;
import static com.diogonunes.jcolor.Attribute.BRIGHT_BLACK_TEXT;

public class Floor extends PassableLandscapeObject {
    static final String DESCRIPTION = "A simple floor. What does to say anymore?";
    static final int PASSABILITY = 1;

    @Override
    public void display() {
        System.out.print(colorize("@", BRIGHT_BLACK_TEXT(), BLACK_BACK()));
    }

    @Override
    public String getDescription() { return DESCRIPTION; }

    public static int getPassability() { return PASSABILITY; }
}

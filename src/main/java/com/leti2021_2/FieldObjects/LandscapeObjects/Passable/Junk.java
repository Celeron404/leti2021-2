package com.leti2021_2.FieldObjects.LandscapeObjects.Passable;

import com.leti2021_2.FieldObjects.LandscapeObjects.PassableLandscapeObject;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.BLACK_BACK;
import static com.diogonunes.jcolor.Attribute.BRIGHT_BLACK_TEXT;

public class Junk implements PassableLandscapeObject {
    static final String DESCRIPTION = "A huge pile of rubbish. It's looks very difficult to getting over.";
    static final int PASSABILITY = 3;

    @Override
    public void display() {
        System.out.print(colorize("@", BRIGHT_BLACK_TEXT(), BLACK_BACK()));
    }



    @Override
    public String getDescription() { return DESCRIPTION; }

    @Override
    public int getPassability() {
        return PASSABILITY;
    }
}

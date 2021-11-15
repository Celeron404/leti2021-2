package com.leti2021_2.FieldObjects.LandscapeObjects.Passable;

import com.leti2021_2.FieldObjects.LandscapeObjects.PassableLandscapeObject;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.BLACK_BACK;
import static com.diogonunes.jcolor.Attribute.WHITE_TEXT;

public class Junk extends PassableLandscapeObject {
    static final String DESCRIPTION = "A huge pile of rubbish. It's looks very difficult to getting over.";
    static final int PASSABILITY = 3;

    @Override
    public void display() {
        System.out.print(colorize("@", WHITE_TEXT(), BLACK_BACK()));
    }



    @Override
    public String getDescription() { return DESCRIPTION; }

    public static int getPassability() { return PASSABILITY; }
}

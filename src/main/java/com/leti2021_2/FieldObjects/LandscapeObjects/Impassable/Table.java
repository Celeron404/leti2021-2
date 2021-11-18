package com.leti2021_2.FieldObjects.LandscapeObjects.Impassable;

import com.leti2021_2.FieldObjects.LandscapeObjects.ImpassableLandscapeObject;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.BLACK_BACK;
import static com.diogonunes.jcolor.Attribute.BRIGHT_BLACK_TEXT;

public class Table extends ImpassableLandscapeObject {
    static final String DESCRIPTION = "The empty table - sounds boring already, right?";

    @Override
    public String getDescription() { return DESCRIPTION; }

    @Override
    public void display() {
        System.out.print(colorize("D", BRIGHT_BLACK_TEXT(), BLACK_BACK()));
    }
}

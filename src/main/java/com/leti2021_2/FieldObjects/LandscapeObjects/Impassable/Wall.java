package com.leti2021_2.FieldObjects.LandscapeObjects.Impassable;

import com.leti2021_2.FieldObjects.LandscapeObjects.ImpassableLandscapeObject;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.*;

public class Wall extends ImpassableLandscapeObject {
    static final String DESCRIPTION = "The wall. You shall not pass!!!";

    @Override
    public String getDescription() { return DESCRIPTION; }

    @Override
    public void display() {
        System.out.print(colorize("#", BRIGHT_BLACK_TEXT(), BLACK_BACK()));
    }
}

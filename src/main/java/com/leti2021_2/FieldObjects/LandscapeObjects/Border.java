package com.leti2021_2.FieldObjects.LandscapeObjects;

import com.leti2021_2.FieldObjects.Landscape;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.*;

public class Border implements Landscape {
    static final String DESCRIPTION = "You shall not pass!!!";

    @Override
    public String getDescription() { return DESCRIPTION; }

    @Override
    public void display() {
        System.out.print(colorize("#", BRIGHT_BLACK_TEXT(), BLACK_BACK()));
    }
}

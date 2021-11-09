package com.leti2021_2.FieldObjects;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.*;

public class Border implements Landscape {
    static final String DESCRIPTION = "You shall not pass!!!";

    @Override
    public String getDescription() { return DESCRIPTION; }

    @Override
    public void display() {
        System.out.println(colorize("#", BRIGHT_BLACK_TEXT()));
    }
}

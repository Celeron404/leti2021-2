package com.leti2021_2.FieldObjects;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.BRIGHT_WHITE_TEXT;

public class University implements FieldObject {
    static final String DESCRIPTION = "This is university. We make more workers!";

    @Override
    public String getDescription() { return DESCRIPTION; }

    @Override
    public void display() {
        System.out.println(colorize("U", BRIGHT_WHITE_TEXT()));
    }
}

package com.leti2021_2.FieldObjects.LandscapeObjects.Passable;

import com.leti2021_2.FieldObjects.LandscapeObjects.PassableLandscapeObject;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.BLACK_BACK;
import static com.diogonunes.jcolor.Attribute.GREEN_TEXT;

public class Tree extends PassableLandscapeObject {
    static final String DESCRIPTION = "A magnificent tree. It's a pity, with poor eyesight, you won't be able to see it. Or is it possible?";
    static final int PASSABILITY = 2;

    @Override
    public void display() {
        System.out.print(colorize("*", GREEN_TEXT(), BLACK_BACK()));
    }

    @Override
    public String getDescription() { return DESCRIPTION; }

    public int getPassability() { return PASSABILITY; }
}

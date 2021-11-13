package com.leti2021_2.FieldObjects.TemporaryObjects;

import com.leti2021_2.FieldObjects.TemporaryObject;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.BLACK_TEXT;
import static com.diogonunes.jcolor.Attribute.CYAN_BACK;

public class Beer implements TemporaryObject {

    @Override
    public String getDescription() {
        return "Wow! You found the beer! That increase your Stress Tolerance on 2, but decrease Skill Level on 5.";
    }

    @Override
    public void display() {
        System.out.println(colorize("t", BLACK_TEXT(), CYAN_BACK()));
    }
}

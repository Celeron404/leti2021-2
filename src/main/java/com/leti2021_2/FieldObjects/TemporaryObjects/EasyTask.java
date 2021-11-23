package com.leti2021_2.FieldObjects.TemporaryObjects;

import com.leti2021_2.FieldObjects.TemporaryObject;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.BLACK_TEXT;
import static com.diogonunes.jcolor.Attribute.CYAN_BACK;

public class EasyTask extends TemporaryObject {

    private final String description = "You are faced with a challenge. It was pretty easy to solve.";

    @Override
    public String getDescription() {
        return description + " That increase your Skill Lvl on 5, but decrease Health on 15.";
    }

    @Override
    public void display() {
        System.out.print(colorize("t", BLACK_TEXT(), CYAN_BACK()));
    }
}
package com.leti2021_2.FieldObjects.TemporaryObjects;

import com.leti2021_2.FieldObjects.TemporaryObject;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.BLACK_TEXT;
import static com.diogonunes.jcolor.Attribute.CYAN_BACK;

public class HardTask implements TemporaryObject {

    private final String description = "You are faced with a daunting task. It took a lot of effort to complete it!";

    @Override
    public String getDescription() {
        return description + " That increase your SkillLvl on 10 but decrease Health on 25.";
    }

    @Override
    public void display() {
        System.out.print(colorize("T", BLACK_TEXT(), CYAN_BACK()));
    }
}

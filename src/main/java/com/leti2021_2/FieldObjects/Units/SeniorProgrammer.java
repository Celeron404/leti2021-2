package com.leti2021_2.FieldObjects.Units;

import com.leti2021_2.FieldObjects.FieldObject;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.BLACK_BACK;
import static com.diogonunes.jcolor.Attribute.BRIGHT_BLUE_TEXT;

public class SeniorProgrammer extends Programmer {

    public SeniorProgrammer() {
        super.setHealth(100);
        super.setStressTolerance(2);
        super.setSkillLvl(30);
        super.setDESCRIPTION("Senior Programmer Description");
    }

    @Override
    public void display() {
        System.out.print(colorize("P", BRIGHT_BLUE_TEXT(), BLACK_BACK()));
    }
}

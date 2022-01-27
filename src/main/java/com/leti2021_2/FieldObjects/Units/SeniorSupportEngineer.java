package com.leti2021_2.FieldObjects.Units;

import com.leti2021_2.FieldObjects.FieldObject;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.BLACK_BACK;
import static com.diogonunes.jcolor.Attribute.BRIGHT_BLUE_TEXT;

public class SeniorSupportEngineer extends SupportEngineer {

    public SeniorSupportEngineer() {
        super.setHealth(100);
        super.setStressTolerance(6);
        super.setSkillLvl(16);
        super.setDESCRIPTION("Senior Support Engineer Description");
    }

    @Override
    public void display() {
        System.out.print(colorize("S", BRIGHT_BLUE_TEXT(), BLACK_BACK()));
    }
}

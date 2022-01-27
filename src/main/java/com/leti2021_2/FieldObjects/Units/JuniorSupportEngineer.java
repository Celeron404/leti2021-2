package com.leti2021_2.FieldObjects.Units;

import com.leti2021_2.FieldObjects.FieldObject;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.BLACK_BACK;
import static com.diogonunes.jcolor.Attribute.BRIGHT_BLUE_TEXT;

public class JuniorSupportEngineer extends SupportEngineer {

    public JuniorSupportEngineer() {
        super.setHealth(50);
        super.setStressTolerance(3);
        super.setSkillLvl(8);
        super.setDESCRIPTION("Junior Support Engineer Description");
    }

    @Override
    public void display() {
        System.out.print(colorize("s", BRIGHT_BLUE_TEXT(), BLACK_BACK()));
    }
}

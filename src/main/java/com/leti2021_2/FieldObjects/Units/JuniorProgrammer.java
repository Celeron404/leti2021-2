package com.leti2021_2.FieldObjects.Units;

import com.leti2021_2.FieldObjects.FieldObject;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.BLACK_BACK;
import static com.diogonunes.jcolor.Attribute.BRIGHT_BLUE_TEXT;

public class JuniorProgrammer extends Programmer {

    public JuniorProgrammer() {
        super.setHealth(50);
        super.setStressTolerance(1);
        super.setSkillLvl(15);
        super.setDESCRIPTION("Junior Tester Description");
    }

    @Override
    public void display() {
        System.out.print(colorize("p", BRIGHT_BLUE_TEXT(), BLACK_BACK()));
    }
}

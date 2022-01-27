package com.leti2021_2.FieldObjects.Units;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.BLACK_BACK;
import static com.diogonunes.jcolor.Attribute.BRIGHT_BLUE_TEXT;

public class JuniorTester extends Tester {

    public JuniorTester() {
        super.setHealth(50);
        super.setStressTolerance(2);
        super.setSkillLvl(10);
        super.setDESCRIPTION("Junior Tester Description");
    }

    @Override
    public void display() {
        System.out.print(colorize("t", BRIGHT_BLUE_TEXT(), BLACK_BACK()));
    }
}

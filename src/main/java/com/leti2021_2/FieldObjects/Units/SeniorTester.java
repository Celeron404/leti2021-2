package com.leti2021_2.FieldObjects.Units;

import com.leti2021_2.FieldObjects.FieldObject;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.BLACK_BACK;
import static com.diogonunes.jcolor.Attribute.BRIGHT_BLUE_TEXT;

public class SeniorTester extends Tester {

    public SeniorTester() {
        super.setHealth(100);
        super.setStressTolerance(4);
        super.setSkillLvl(20);
        super.setDESCRIPTION("Senior Tester Description");
    }

    @Override
    public void display() {
        System.out.print(colorize("T", BRIGHT_BLUE_TEXT(), BLACK_BACK()));
    }
}

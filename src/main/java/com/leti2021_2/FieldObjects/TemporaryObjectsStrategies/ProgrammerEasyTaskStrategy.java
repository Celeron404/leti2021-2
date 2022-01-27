package com.leti2021_2.FieldObjects.TemporaryObjectsStrategies;

import com.leti2021_2.FieldObjects.Units.Unit;

public class ProgrammerEasyTaskStrategy extends EasyTaskStrategy {
    @Override
    public void interactWithUnit(Unit unit) {
        unit.setHealth(unit.getHealth()-4);
        unit.setStressTolerance(unit.getStressTolerance()-(0.5));
        unit.setSkillLvl(unit.getSkillLvl()+5);
    }
}

package com.leti2021_2.FieldObjects.TemporaryObjectsStrategies;

import com.leti2021_2.FieldObjects.Units.Unit;

public class SupportEngineerEasyTaskStrategy extends EasyTaskStrategy {
    @Override
    public void interactWithUnit(Unit unit) {
        unit.setHealth(unit.getHealth()-6);
        unit.setStressTolerance(unit.getStressTolerance()-(0.5));
        unit.setSkillLvl(unit.getSkillLvl()+5);
    }
}

package com.leti2021_2.FieldObjects.TemporaryObjectsStrategies;

import com.leti2021_2.FieldObjects.Units.Unit;

public class SupportEngineerBeerStrategy extends BeerStrategy {
    @Override
    public void interactWithUnit(Unit unit) {
        unit.setHealth(unit.getHealth()-10);
        unit.setStressTolerance(unit.getStressTolerance()+1);
        unit.setSkillLvl(unit.getSkillLvl()-0.5);
    }
}

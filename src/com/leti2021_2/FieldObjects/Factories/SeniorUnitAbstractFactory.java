package com.leti2021_2.FieldObjects.Factories;

import com.leti2021_2.FieldObjects.*;

public class SeniorUnitAbstractFactory implements UnitAbstractFactory {

    @Override
    public Programmer createProgrammer() {
        var programmer = new SeniorProgrammer();
        return programmer;
    }

    @Override
    public Tester createTester() {
        return new SeniorTester();
    }

    @Override
    public SupportEngineer createSupportEngineer() {
        return new SeniorSupportEngineer();
    }
}

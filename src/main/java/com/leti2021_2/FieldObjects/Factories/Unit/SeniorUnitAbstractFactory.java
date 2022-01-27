package com.leti2021_2.FieldObjects.Factories.Unit;

import com.leti2021_2.FieldObjects.Units.*;

public class SeniorUnitAbstractFactory implements UnitAbstractFactory {

    @Override
    public Programmer createProgrammer() {
        return new SeniorProgrammer();
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

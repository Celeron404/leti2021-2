package com.leti2021_2.FieldObjects.Factories.Unit;

import com.leti2021_2.FieldObjects.Units.*;

public class JuniorUnitAbstractFactory implements UnitAbstractFactory {

    @Override
    public Programmer createProgrammer() {
        return new JuniorProgrammer();
    }

    @Override
    public Tester createTester() {
        return new JuniorTester();
    }

    @Override
    public SupportEngineer createSupportEngineer() {
        return new JuniorSupportEngineer();
    }
}

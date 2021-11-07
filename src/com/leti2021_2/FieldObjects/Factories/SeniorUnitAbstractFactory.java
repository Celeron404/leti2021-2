package com.leti2021_2.FieldObjects.Factories;

import com.leti2021_2.FieldObjects.*;
import com.leti2021_2.FieldObjects.Units.SeniorProgrammer;
import com.leti2021_2.FieldObjects.Units.SeniorSupportEngineer;
import com.leti2021_2.FieldObjects.Units.SeniorTester;

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

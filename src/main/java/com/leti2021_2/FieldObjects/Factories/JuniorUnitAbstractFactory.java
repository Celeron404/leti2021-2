package com.leti2021_2.FieldObjects.Factories;

import com.leti2021_2.FieldObjects.*;
import com.leti2021_2.FieldObjects.Units.JuniorProgrammer;
import com.leti2021_2.FieldObjects.Units.JuniorSupportEngineer;
import com.leti2021_2.FieldObjects.Units.JuniorTester;

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
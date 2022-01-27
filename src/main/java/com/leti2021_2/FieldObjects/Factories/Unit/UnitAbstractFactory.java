package com.leti2021_2.FieldObjects.Factories.Unit;

import com.leti2021_2.FieldObjects.Units.Programmer;
import com.leti2021_2.FieldObjects.Units.SupportEngineer;
import com.leti2021_2.FieldObjects.Units.Tester;

public interface UnitAbstractFactory {
    Programmer createProgrammer();
    Tester createTester();
    SupportEngineer createSupportEngineer();
}
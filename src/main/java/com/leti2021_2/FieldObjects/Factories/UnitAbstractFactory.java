package com.leti2021_2.FieldObjects.Factories;

import com.leti2021_2.FieldObjects.Programmer;
import com.leti2021_2.FieldObjects.SupportEngineer;
import com.leti2021_2.FieldObjects.Tester;

public interface UnitAbstractFactory {
    Programmer createProgrammer();
    Tester createTester();
    SupportEngineer createSupportEngineer();
}
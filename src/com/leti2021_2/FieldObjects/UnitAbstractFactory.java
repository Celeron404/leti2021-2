package com.leti2021_2.FieldObjects;

public interface UnitAbstractFactory {
    Programmer createProgrammer();
    Tester createTester();
    SupportEngineer createSupportEngineer();
}
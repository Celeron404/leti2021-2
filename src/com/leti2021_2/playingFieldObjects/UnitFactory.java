package com.leti2021_2.playingFieldObjects;

public interface UnitFactory {
    Programmer createProgrammer();
    Tester createTester();
    SupportEngineer createSupportEngineer();
}
package com.leti2021_2.playingFieldObjects;

public class SeniorUnitFactory implements UnitFactory {

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

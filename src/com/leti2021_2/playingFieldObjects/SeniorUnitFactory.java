package com.leti2021_2.playingFieldObjects;

public class SeniorUnitFactory implements UnitFactory {

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

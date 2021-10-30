package com.leti2021_2.playingFieldObjects;

public class JuniorUnitFactory implements UnitFactory {

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

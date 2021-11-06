package com.leti2021_2.FieldObjects;

public class Unit implements FieldObject {

    @Override
    public void getDescription() {
        System.out.println("This is Unit");
    }

    public static class FactoryMaker {
        public enum UnitType {
            JUNIOR, SENIOR
        }

        public static UnitAbstractFactory makeFactory(UnitType type) {
            switch (type) {
                case JUNIOR:
                    return new JuniorUnitAbstractFactory();
                case SENIOR:
                    return new SeniorUnitAbstractFactory();
                default:
                    throw new IllegalArgumentException("UnitType not supported.");
            }
        }
    }
}

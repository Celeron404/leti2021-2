package com.leti2021_2.FieldObjects.Factories.Unit;

public class UnitFactoryMaker {

    public static class FactoryMaker {
        public enum UnitQualification {
            JUNIOR, SENIOR
        }

        public static UnitAbstractFactory makeFactory(UnitQualification type) {
            return switch (type) {
                case JUNIOR -> new JuniorUnitAbstractFactory();
                case SENIOR -> new SeniorUnitAbstractFactory();
                default -> throw new IllegalArgumentException("UnitType is not supported.");
            };
        }
    }
}

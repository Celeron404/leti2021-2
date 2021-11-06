package com.leti2021_2.playingFieldObjects;

public class Unit extends PlayingFieldObject {

    public static class FactoryMaker {
        public enum UnitType {
            JUNIOR, SENIOR
        }

        public static UnitFactory makeFactory(UnitType type) {
            switch (type) {
                case JUNIOR:
                    return new JuniorUnitFactory();
                case SENIOR:
                    return new SeniorUnitFactory();
                default:
                    throw new IllegalArgumentException("UnitType not supported.");
            }
        }
    }
}

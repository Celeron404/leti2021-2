package com.leti2021_2.FieldObjects;

import com.leti2021_2.FieldObjects.Factories.JuniorUnitAbstractFactory;
import com.leti2021_2.FieldObjects.Factories.SeniorUnitAbstractFactory;
import com.leti2021_2.FieldObjects.Factories.UnitAbstractFactory;

public class Unit {

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

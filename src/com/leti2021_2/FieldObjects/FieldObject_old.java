package com.leti2021_2.FieldObjects;

import com.leti2021_2.PlayingField;

public class FieldObject_old {
    private static int numberOfObjects = 0;

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public static void increaseNumberOfObjects() {
        if (numberOfObjects < PlayingField.getSquare())
            numberOfObjects++;
        else
            throw new IllegalArgumentException("Number of Objects cannot be more than " + PlayingField.getSquare() + ".");
    }

    public static void decreaseNumberOfObjects() {
        if (numberOfObjects > 0)
            numberOfObjects--;
        else
            throw new IllegalArgumentException("Number of Objects cannot be less than 0.");
    }

    public static class FactoryMaker {
        public enum UnitType {
            University, NeutralObjects, Landscape
        }

        public static UnitAbstractFactory makeFactory(Unit.FactoryMaker.UnitType type) {
            switch (type) {
                case JUNIOR:
                    return new University();
                case SENIOR:
                    return new SeniorUnitAbstractFactory();
                default:
                    throw new IllegalArgumentException("UnitType not supported.");
            }
        }
    }
}

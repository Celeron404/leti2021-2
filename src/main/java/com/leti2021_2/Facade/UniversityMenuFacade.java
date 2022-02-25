package com.leti2021_2.Facade;

import com.leti2021_2.Coords;
import com.leti2021_2.FieldObjects.Factories.Unit.UnitFactoryMaker;
import com.leti2021_2.FieldObjects.Units.Unit;
import com.leti2021_2.FieldObjects.Units.UnitType;
import com.leti2021_2.FieldObjects.UniversitiesMap;
import com.leti2021_2.FieldObjects.University;
import com.leti2021_2.GUI.UserInput;

import java.io.IOException;

import static com.leti2021_2.FieldObjects.Factories.Unit.UnitFactoryMaker.FactoryMaker.UnitQualification.JUNIOR;

public class UniversityMenuFacade {

    public static University getUniversity(Coords coords) {
        return UniversitiesMap.universities.get(0);
    }

    public static void printStatus(University university) {
        System.out.println("University's description: " + university.getDescription());
    }

    public static void printUnits(University university) {
        university.printUnits();
    }

    public static void createUnit(University university, UnitType unitType) {
        var junFactory = UnitFactoryMaker.FactoryMaker.makeFactory(JUNIOR);
        switch (unitType) {
            case PROGRAMMER -> university.createUnit(junFactory.createProgrammer());
            case TESTER -> university.createUnit(junFactory.createTester());
            case SUPPORTENGINEER -> university.createUnit(junFactory.createSupportEngineer());
        }
    }

    public static boolean universityNotFull(University university) {
        return university.getNumberOfUnits() < University.maxUnits;
    }
}

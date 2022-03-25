package com.leti2021_2.GUI.Facade;

import com.leti2021_2.Commands.University.CreateUnit;
import com.leti2021_2.Commands.University.PrintStatus;
import com.leti2021_2.Commands.University.PrintUnits;
import com.leti2021_2.Coords;
import com.leti2021_2.FieldObjects.UniversitiesMap;
import com.leti2021_2.FieldObjects.University;
import com.leti2021_2.UserData;

public class UniversityMenuFacade {
    private static final CommandInvoker invoker = new CommandInvoker();

    public static University getUniversity(Coords coords) {
        return UniversitiesMap.universities.get(0);
    }

    public static boolean universityNotFull(University university) {
        return university.getNumberOfUnits() < University.maxUnits;
    }


    // commands
    public static void printStatus(UserData userData) {
        invoker.setCommand(new PrintStatus(userData));
        invoker.executeCommand();
    }

    public static void printUnits(UserData userData) {
        invoker.setCommand(new PrintUnits(userData));
        invoker.executeCommand();
    }

    public static void createUnit(UserData userData) {
        invoker.setCommand(new CreateUnit(userData));
        invoker.executeCommand();
    }
}

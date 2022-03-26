package com.leti2021_2.GUI.Facade;

import com.leti2021_2.Commands.University.CreateUnit;
import com.leti2021_2.Commands.University.PrintStatus;
import com.leti2021_2.Commands.University.PrintUnits;
import com.leti2021_2.Coords;
import com.leti2021_2.FieldObjects.Units.UnitType;
import com.leti2021_2.FieldObjects.UniversitiesMap;
import com.leti2021_2.FieldObjects.University;
import com.leti2021_2.GUI.Display;
import com.leti2021_2.GUI.UserInput;
import com.leti2021_2.UserData;

import java.io.IOException;

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

    public static void createUnit(UserData userData) throws IOException {
        System.out.println("Which type of unit you want to create?");
        System.out.println("1) Junior Programmer");
        System.out.println("2) Junior Support Engineer");
        System.out.println("3) Junior Tester");
        System.out.print(">> ");
        String input = UserInput.getString();
        System.out.println();
        boolean inputIsIncorrect = true;
        while (inputIsIncorrect) {
            switch (input) {
                case ("1") -> {
                    userData.newUnitType = UnitType.PROGRAMMER;
                    inputIsIncorrect = false;
                }
                case ("2") -> {
                    userData.newUnitType = UnitType.SUPPORTENGINEER;
                    inputIsIncorrect = false;
                }
                case ("3") -> {
                    userData.newUnitType = UnitType.TESTER;
                    inputIsIncorrect = false;
                }
                default -> {
                    System.out.println("Incorrect type! Please try again.");
                    System.out.println();
                }
            }
        }
        invoker.setCommand(new CreateUnit(userData));
        invoker.executeCommand();
        UserInput.waitForInput();
        Display.run();
    }
}

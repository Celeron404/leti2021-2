package com.leti2021_2.GUI;

import com.leti2021_2.Coords;
import com.leti2021_2.Facade.UniversityMenuFacade;
import com.leti2021_2.FieldObjects.UniversitiesMap;
import com.leti2021_2.FieldObjects.University;

import java.io.IOException;

import static com.leti2021_2.FieldObjects.Units.UnitType.*;

public class UniversityMenu {
    public static void run() throws IOException {
        University university;
        boolean inputIsIncorrect = true;
        while (inputIsIncorrect) {
            // while we have the only one university
            // If we need add another, we can remake this part, adding new dialog
            Coords coords = new Coords(1, 1);
            university = UniversityMenuFacade.getUniversity(coords);
            System.out.println();
            System.out.println("University's actions:");
            System.out.println("1) Unit's create");
            System.out.println("2) Units overview");
            System.out.println("3) University's status");
            System.out.print(">> ");
            String input = UserInput.getString();
            System.out.println();

            switch (input) {
                case "1" -> {
                    inputIsIncorrect = false;
                    createUnit(university);
                }
                case "2" -> {
                    inputIsIncorrect = false;
                    UniversityMenuFacade.printUnits(university);
                }
                case "3" -> {
                    inputIsIncorrect = false;
                    UniversityMenuFacade.printStatus(university);
                }
                default -> {
                }
            }
        }
    }

    private static void createUnit(University university) throws IOException {
        if (!UniversityMenuFacade.universityNotFull(university))
            throw new IllegalStateException("Error! University is full.");

        boolean inputIsIncorrect = true;
        while (inputIsIncorrect) {
            System.out.println("Which type of Unit do you want to create?");
            System.out.println("Unit's types:");
            System.out.println("1) Programmer");
            System.out.println("2) Quality Assurance Engineer");
            System.out.println("3) Support Engineer");
            System.out.print(">> ");
            String inputStr = UserInput.getString();
            int userTypeInt;
            try {
                userTypeInt = Integer.parseInt(inputStr);
            } catch (IllegalArgumentException e) {
                System.out.println("Error! Invalid input.");
                break;
            }
            switch (userTypeInt) {
                case 1 -> {
                    inputIsIncorrect = false;
                    UniversityMenuFacade.createUnit(university, PROGRAMMER);
                }
                case 2 -> {
                    inputIsIncorrect = false;
                    UniversityMenuFacade.createUnit(university, TESTER);
                }
                case 3 -> {
                    inputIsIncorrect = false;
                    UniversityMenuFacade.createUnit(university, SUPPORTENGINEER);
                }
                default ->
                    System.out.println("Error! Invalid input.");
            }
        }
    }
}

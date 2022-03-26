package com.leti2021_2.GUI;

import com.leti2021_2.Coords;
import com.leti2021_2.GUI.Facade.UniversityMenuFacade;
import com.leti2021_2.UserData;

import java.io.IOException;

import static com.leti2021_2.FieldObjects.Units.UnitType.*;

public class UniversityMenu {
    public static void run() throws IOException {
        UserData userData = new UserData();
        boolean inputIsIncorrect = true;
        while (inputIsIncorrect) {
            // while we have the only one university
            // If we need add another, we can remake this part, adding new dialog
            Coords coords = new Coords(1, 1);
            userData.currentUniversity = UniversityMenuFacade.getUniversity(coords);
            System.out.println("University's actions:");
            System.out.println("1) Unit's create");
            System.out.println("2) Units overview");
            System.out.println("3) University's status");
            System.out.println("0)    Back");
            System.out.print(">> ");
            String input = UserInput.getString();
            System.out.println();

            switch (input) {
                case "1" -> {
                    inputIsIncorrect = false;
                    UniversityMenuFacade.createUnit(userData);
                }
                case "2" -> {
                    inputIsIncorrect = false;
                    UniversityMenuFacade.printUnits(userData);
                }
                case "3" -> {
                    inputIsIncorrect = false;
                    UniversityMenuFacade.printStatus(userData);
                }
                case "0" -> {
                    inputIsIncorrect = false;
                    MainMenu.run();
                }
                default -> {
                }
            }
        }
    }
}

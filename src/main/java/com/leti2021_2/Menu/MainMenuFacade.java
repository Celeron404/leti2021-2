package com.leti2021_2.Menu;

import com.leti2021_2.Coords;
import com.leti2021_2.FieldObjects.FieldObject;
import com.leti2021_2.FieldObjects.Units.Unit;
import com.leti2021_2.FieldObjects.UniversitiesMap;
import com.leti2021_2.FieldObjects.University;
import com.leti2021_2.GUI.Display;
import com.leti2021_2.GUI.UserInput;

import java.io.IOException;

public class MainMenuFacade {
    public static void run() throws IOException {
        boolean inputIsIncorrect = true;
        while (inputIsIncorrect) {
            System.out.println();
            System.out.println("Main actions:");
            System.out.println("1) University management");
            System.out.println("2) Character control");
            System.out.print(">> ");
            String input = UserInput.getString();
            System.out.println();
            switch (input) {
                case "1" -> {
                    inputIsIncorrect = false;
                    UniversityMenuFacade.run();
                }
                case "2" -> {
                    inputIsIncorrect = false;
                    try {
                        System.out.println("Enter the coordinates of the Unit (x, y, for example \"10 3\"):");
                        System.out.print(">> ");
                        String coordsStr = UserInput.getString();
                        System.out.println();
                        Coords coords = Coords.parseCoords(coordsStr);
                        System.out.println("");
                        UnitsControlFacade.run(coords);
                    }
                    catch (IllegalArgumentException e) {
                        inputIsIncorrect = true;
                        System.out.println(e);
                    }
                }
                default -> {
                }
            }
        }
    }
}

package com.leti2021_2.Menu;

import com.leti2021_2.Coords;
import com.leti2021_2.FieldObjects.FieldObject;
import com.leti2021_2.FieldObjects.Units.Unit;
import com.leti2021_2.FieldObjects.UniversitiesMap;
import com.leti2021_2.GUI.Display;
import com.leti2021_2.GUI.UserInput;

import java.io.IOException;

public class UnitsControlFacade {
    private static Unit unit = null;

    public static void run(Coords coords) throws IOException {
        unit = UniversitiesMap.unitSearch(coords);
        if (unit == null)
            throw new IllegalArgumentException("The unit with the current coordinates does not exist.");

        boolean inputIsIncorrect = true;
        while (inputIsIncorrect) {
            System.out.println();
            System.out.println("Unit's actions:");
            System.out.println("1) Look around ");
            System.out.println("2) Move");
            System.out.print(">> ");
            String input = UserInput.getString();
            System.out.println();
            switch (input) {
                case "1" -> {
                    inputIsIncorrect = false;
                    lookAround(coords);
                }
                case "2" -> {
                    inputIsIncorrect = false;
                    // here move
                }
                default -> {
                }
            }
        }
    }

    private static void lookAround(Coords coords) throws IOException {
        boolean inputIsIncorrect = true;
        while (inputIsIncorrect) {
            System.out.println("Which direction you want to look? (u - up, l - left, d - down, r - right)");
            System.out.print(">> ");
            String direction = UserInput.getString();
            Coords displayCoords = coords;
            FieldObject object = null;
            switch (direction) {
                case "u" -> {
                    inputIsIncorrect = false;
                    displayCoords.setY(displayCoords.getY() + 1);
                }
                case "l" -> {
                    inputIsIncorrect = false;
                    displayCoords.setX(displayCoords.getX() - 1);
                }
                case "d" -> {
                    inputIsIncorrect = false;
                    displayCoords.setY(displayCoords.getY() - 1);
                }
                case "r" -> {
                    inputIsIncorrect = false;
                    displayCoords.setX(displayCoords.getX() + 1);
                }
                default -> {
                }
            }
            if (!inputIsIncorrect && object != null) {
                object = Display.getObjectByPriority(displayCoords);
                System.out.println(object.getDescription());
            }
        }
    }

    // here we can add "use spell" functional
}

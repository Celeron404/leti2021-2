package com.leti2021_2.GUI;

import com.leti2021_2.Coords;
import com.leti2021_2.Facade.UnitsControlFacade;
import com.leti2021_2.FieldObjects.Units.Unit;
import com.leti2021_2.FieldObjects.UniversitiesMap;

import java.io.IOException;

public class UnitsControlMenu {

    public static void run() throws IOException {
        Coords coords = null;
        boolean inputIsIncorrect = true;
        while (inputIsIncorrect) {
            try {
                System.out.println("Enter the coordinates of the Unit (x, y, for example \"10 3\"):");
                System.out.print(">> ");
                String coordsStr = UserInput.getString();
                System.out.println();
                coords = UnitsControlFacade.parseCoords(coordsStr);
                System.out.println();
                inputIsIncorrect = false;
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }

        Unit unit = UnitsControlFacade.unitSearch(coords);
        if (unit == null)
            throw new IllegalArgumentException("The unit with the current coordinates does not exist.");

        inputIsIncorrect = true;
        while (inputIsIncorrect) {
            System.out.println();
            System.out.println("Unit's actions:");
            System.out.println("1) Look around ");
            System.out.println("2) Move");
            System.out.println("3) Get status");
            System.out.print(">> ");
            String input = UserInput.getString();
            System.out.println();
            switch (input) {
                case "1" -> {
                    inputIsIncorrect = false;
                    UnitsControlFacade.lookAround(coords);
                }
                case "2" -> {
                    inputIsIncorrect = false;
                    UnitsControlFacade.move(coords, unit);
                }
                case "3" -> {
                    inputIsIncorrect = false;
                    UnitsControlFacade.printStatus(unit);
                }
                default -> {
                }
            }
        }
    }

}

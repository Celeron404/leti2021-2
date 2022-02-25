package com.leti2021_2.Facade;

import com.leti2021_2.Coords;
import com.leti2021_2.FieldObjects.Direction;
import com.leti2021_2.FieldObjects.FieldObject;
import com.leti2021_2.FieldObjects.UnitMover;
import com.leti2021_2.FieldObjects.Units.Unit;
import com.leti2021_2.FieldObjects.UniversitiesMap;
import com.leti2021_2.GUI.Display;
import com.leti2021_2.GUI.UserInput;

import java.io.IOException;

public class UnitsControlFacade {

    public static Coords parseCoords(String input) {
        return Coords.parseCoords(input);
    }

    public static Unit unitSearch(Coords coords) {
        return UniversitiesMap.unitSearch(coords);
    }

    public static void lookAround(final Coords coords) throws IOException {
        boolean inputIsIncorrect = true;
        while (inputIsIncorrect) {
            System.out.println("Which direction you want to look? (u - up, l - left, d - down, r - right)");
            System.out.print(">> ");
            String direction = UserInput.getString();
            Coords displayCoords = new Coords(coords);
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

    public static void move(final Coords coords, Unit unit) throws IOException {
        boolean inputIsIncorrect = true;
        while (inputIsIncorrect) {
            System.out.println("Which direction you want to move? (u - up, l - left, d - down, r - right)");
            System.out.print(">> ");
            String directionStr = UserInput.getString();
            try {
                Direction.type direction = Direction.parseDirection(directionStr);
                System.out.println("How much steps you want to do?");
                System.out.print(">> ");
                int steps = Integer.parseInt(UserInput.getString());

                var mover = new UnitMover();
                mover.move(unit, coords, direction, steps);
                inputIsIncorrect = false;
            }
            catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printStatus(Unit unit) {
        System.out.println();
        System.out.println("Unit's description: " + unit.getDescription());
        System.out.println("Unit's health: " + unit.getHealth() + ", stress tolerance: " + unit.getStressTolerance() + ", skill lvl: " + unit.getSkillLvl());
        System.out.println();
    }
    
    // here we can add "use spell" functional
}

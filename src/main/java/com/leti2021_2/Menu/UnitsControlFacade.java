package com.leti2021_2.Menu;

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
                    move(coords, unit);
                }
                default -> {
                }
            }
        }
    }

    private static void lookAround(final Coords coords) throws IOException {
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

    private static void move(final Coords coords, Unit unit) throws IOException {
        boolean inputIsIncorrect = true;
        while (inputIsIncorrect) {
            System.out.println("Which direction you want to move? (u - up, l - left, d - down, r - right)");
            System.out.print(">> ");
            String directionStr = UserInput.getString();
            Direction direction = null;
            switch (directionStr) {
                case "u" -> {
                    inputIsIncorrect = false;
                    direction = Direction.UP;
                }
                case "l" -> {
                    inputIsIncorrect = false;
                    direction = Direction.LEFT;
                }
                case "d" -> {
                    inputIsIncorrect = false;
                    direction = Direction.DOWN;
                }
                case "r" -> {
                    inputIsIncorrect = false;
                    direction = Direction.RIGHT;
                }
                default -> {
                }
            }
            if (inputIsIncorrect)
                break;

            inputIsIncorrect = true;
            try {
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
            // тут можно сказать, что фасад использован прям по канонам,
            // т. к. вызываются существующий алгоритм, а клиент об этом даже не знает.
        }
    }

    // here we can add "use spell" functional
}

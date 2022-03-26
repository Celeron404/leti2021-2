package com.leti2021_2.GUI.Facade;

import com.leti2021_2.Commands.Units.LookAt;
import com.leti2021_2.Commands.Units.Move;
import com.leti2021_2.Commands.Units.PrintStatus;
import com.leti2021_2.Commands.Units.UnitSearch;
import com.leti2021_2.Coords;
import com.leti2021_2.FieldObjects.Direction;
import com.leti2021_2.FieldObjects.FieldObject;
import com.leti2021_2.GUI.UserInput;
import com.leti2021_2.Main;
import com.leti2021_2.UserData;

import java.io.IOException;

public class UnitMenuFacade {
    private static final CommandInvoker invoker = new CommandInvoker();

    public static Coords parseCoords(String input) {
        return Coords.parseCoords(input);
    }


    // commands
    public static void unitSearch(UserData userData) {
        invoker.setCommand(new UnitSearch(userData));
        invoker.executeCommand();
    }

    public static void lookAt(UserData userData) throws IOException {
        boolean inputIsIncorrect = true;
        while (inputIsIncorrect) {
            System.out.println("Which direction you want to look? (u - up, l - left, d - down, r - right)");
            System.out.print(">> ");
            try {
                String directionStr = UserInput.getString();
                System.out.println();
                Coords displayCoords = new Coords(userData.unitCoords);
                FieldObject object = null;
                userData.lookDirection = Direction.parseDirection(directionStr);

                invoker.setCommand(new LookAt(userData));
                invoker.executeCommand();
                inputIsIncorrect = false;
            }
            catch (IllegalArgumentException e) {
                if (Main.DEBUG) {
                    e.printStackTrace();
                }
                else System.out.println(e);
                System.out.println();
               break;
            }
        }
    }

    public static void move(UserData userData) throws IOException {
        boolean inputIsIncorrect = true;
        while (inputIsIncorrect) {
            System.out.println("Which direction you want to move? (u - up, l - left, d - down, r - right)");
            System.out.print(">> ");
            String directionStr = UserInput.getString();
            System.out.println();
            try {
                userData.moveDirection = Direction.parseDirection(directionStr);
                System.out.println("How much steps you want to do?");
                System.out.print(">> ");
                userData.stepsToMove = Integer.parseInt(UserInput.getString());
                System.out.println();

                invoker.setCommand(new Move(userData));
                invoker.executeCommand();
                inputIsIncorrect = false;
            }
            catch (IllegalArgumentException e) {
                if (Main.DEBUG) {
                    e.printStackTrace();
                }
                else System.out.println(e);
                System.out.println();
            }
        }
    }

    public static void printStatus(UserData userData) {
        invoker.setCommand(new PrintStatus(userData));
        invoker.executeCommand();
    }
    
    // here we can add "use spell" functional
}

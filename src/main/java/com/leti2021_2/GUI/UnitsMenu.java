package com.leti2021_2.GUI;

import com.leti2021_2.GUI.Facade.UnitMenuFacade;
import com.leti2021_2.UserData;

import java.io.IOException;

public class UnitsMenu {

    public static void run() throws IOException {
        UserData userData = new UserData();
        boolean inputIsIncorrect = true;
        while (inputIsIncorrect) {
            try {
                System.out.println("Enter the coordinates of the Unit (x, y, for example \"10 3\"):");
                System.out.print(">> ");
                String coordsStr = UserInput.getString();
                System.out.println();
                userData.unitCoords = UnitMenuFacade.parseCoords(coordsStr);
                System.out.println();
                inputIsIncorrect = false;
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }

        UnitMenuFacade.unitSearch(userData);

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
                    UnitMenuFacade.lookAt(userData);
                }
                case "2" -> {
                    inputIsIncorrect = false;
                    UnitMenuFacade.move(userData);
                }
                case "3" -> {
                    inputIsIncorrect = false;
                    UnitMenuFacade.printStatus(userData);
                }
                default -> {
                }
            }
        }
    }

}

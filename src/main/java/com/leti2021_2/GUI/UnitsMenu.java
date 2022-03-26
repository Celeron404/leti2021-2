package com.leti2021_2.GUI;

import com.leti2021_2.GUI.Facade.UnitMenuFacade;
import com.leti2021_2.Main;
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
                userData.unitCoords = UnitMenuFacade.parseCoords(coordsStr);
                System.out.println();
                inputIsIncorrect = false;
            } catch (IllegalArgumentException e) {
                if (Main.DEBUG) {
                    e.printStackTrace();
                }
                else System.out.println(e);
                System.out.println();
            }
        }

        UnitMenuFacade.unitSearch(userData);

        while (true) {
            System.out.println("Unit's actions:");
            System.out.println("1) Look around ");
            System.out.println("2) Move");
            System.out.println("3) Get status");
            System.out.println("0)    Back");
            System.out.print(">> ");
            String input = UserInput.getString();
            System.out.println();
            switch (input) {
                case "1" -> UnitMenuFacade.lookAt(userData);
                case "2" -> UnitMenuFacade.move(userData);
                case "3" -> UnitMenuFacade.printStatus(userData);
                case "0" -> MainMenu.run();
                default -> System.out.println("");
            }
        }
    }
}

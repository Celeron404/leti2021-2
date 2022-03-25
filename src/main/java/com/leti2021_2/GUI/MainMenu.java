package com.leti2021_2.GUI;

import java.io.IOException;

public class MainMenu {
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
                    UniversityMenu.run();
                }
                case "2" -> {
                    inputIsIncorrect = false;
                    try {
                        UnitsMenu.run();
                    }
                    catch (IllegalArgumentException e) {
                        inputIsIncorrect = true;
                        e.printStackTrace();
                    }
                }
                default -> {
                }
            }
        }
    }
}

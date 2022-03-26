package com.leti2021_2.GUI;

import com.leti2021_2.Main;

import java.io.IOException;

public class MainMenu {
    public static void run() throws IOException {
        while (true) {
            boolean inputIsIncorrect = true;
            while (inputIsIncorrect) {
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
                        } catch (IllegalArgumentException e) {
                            inputIsIncorrect = true;
                            if (Main.DEBUG) {
                                e.printStackTrace();
                            }
                            else System.out.println(e);
                            System.out.println();
                        }
                    }
                    default -> {
                    }
                }
            }
        }
    }
}

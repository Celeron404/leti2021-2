package com.leti2021_2.GUI.Facade;

import com.leti2021_2.GUI.Display;
import com.leti2021_2.GUI.MainMenu;
import com.leti2021_2.GUI.UserInput;
import com.leti2021_2.Main;
import com.leti2021_2.MapFillingChecker;
import com.leti2021_2.PlayingFieldPresets.DebugPreset15x15;
import com.leti2021_2.PlayingFieldPresets.DemoPreset10x10;
import com.leti2021_2.PlayingFieldPresets.DemoPreset15x15;

import java.io.IOException;

public class ProgramInitialization {
    public static void run() throws IOException {
        String presetChoise = null;
        boolean inputIsCorrect = false;
        while (!inputIsCorrect) {
            System.out.println("1) DemoPreset 10x10");
            System.out.println("2) DemoPreset 15x15");
            System.out.println("9) DebugPreset 15x15");
            System.out.println("Choose the preset:");
            presetChoise = UserInput.getString();

            switch (presetChoise) {
                case "1" -> {
                    inputIsCorrect = true;
                    DemoPreset10x10.fill();
                }
                case "2" -> {
                    inputIsCorrect = true;
                    DemoPreset15x15.fill();
                }
                case "9" -> {
                    inputIsCorrect = true;
                    DebugPreset15x15.fill();
                }
            }
        }

        if (Main.DEBUG) {
            inputIsCorrect = false;
            while (!inputIsCorrect) {
                System.out.println("Need to check the filling of the map? y/n");

                String input = UserInput.getString();
                if (input.equals("y")) {
                    inputIsCorrect = true;
                    MapFillingChecker.run();
                    UserInput.waitForInput();
                } else if (input.equals("n")) {
                    inputIsCorrect = true;
                } else {
                    System.out.println("Please, try again.");
                }
            }
        }

        Display.run();

        inputIsCorrect = false;
        while (!inputIsCorrect) {
            switch (presetChoise) {
                case "1" -> {
                    inputIsCorrect = true;
                    DemoPreset10x10.run();
                }
                case "2" -> {
                    inputIsCorrect = true;
                    DemoPreset15x15.run();
                }
                case "9" -> {
                    inputIsCorrect = true;
                    DebugPreset15x15.run();
                }
            }
        }
        MainMenu.run();
        UserInput.waitForInput();
    }
}

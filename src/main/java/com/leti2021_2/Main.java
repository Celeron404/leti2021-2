package com.leti2021_2;

import com.leti2021_2.PlayingFieldPresets.DebugPreset15x15;
import com.leti2021_2.PlayingFieldPresets.DemoPreset15x15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean DEBUG = true;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String presetChoise = null;
        boolean inputIsCorrect = false;
        while (!inputIsCorrect) {
            System.out.println("1) DebugPreset 15x15");
            System.out.println("2) DemoPreset 15x15");
            System.out.println("3) DemoPreset 10x10");
            System.out.println("Choose the preset:");
            presetChoise = reader.readLine();

            if (presetChoise.equals("1")) {
                inputIsCorrect = true;
                DebugPreset15x15.fill();
            } else if (presetChoise.equals("2")) {
                inputIsCorrect = true;
                DemoPreset15x15.fill();
            }
        }

        if (DEBUG) {
            inputIsCorrect = false;
            while (!inputIsCorrect) {
                System.out.println("Need to check the filling of the map? y/n");

                String input = reader.readLine();
                if (input.equals("y")) {
                    inputIsCorrect = true;
                    MapFillingChecker.run();
                    WaitForUserInput.run();
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
            if (presetChoise.equals("1")) {
                inputIsCorrect = true;
                DebugPreset15x15.run();
            } else if (presetChoise.equals("2")) {
                inputIsCorrect = true;
                DemoPreset15x15.run();
            }
        }
        WaitForUserInput.run();


    }
}

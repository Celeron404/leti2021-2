package com.leti2021_2;

import com.leti2021_2.PlayingFieldPresets.DebugPreset15x15;
import com.leti2021_2.PlayingFieldPresets.DemoPreset15x15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean DEBUG = true;

    public static void main(String[] args) throws IOException {
        DebugPreset15x15.run();
        //DemoPreset15x15.run();
        if (DEBUG) {
            boolean inputIsCorrect = false;
            while (!inputIsCorrect) {
                System.out.println("Need to check the filling of the map? y/n");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                if (input.equals("y")) {
                    inputIsCorrect = true;
                    MapFillingChecker.run();
                    System.in.read();
                } else if (input.equals("n")) {
                    inputIsCorrect = true;
                } else {
                    System.out.println("Please, try again.");
                    }
            }
        }
        Display.run();
    }
}

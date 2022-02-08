package com.leti2021_2.GUI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String getString() throws IOException {
        return reader.readLine();
    }

    public static void waitForInput() throws IOException {
        reader.readLine();
    }
}

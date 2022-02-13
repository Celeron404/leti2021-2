package com.leti2021_2;

import com.leti2021_2.GUI.Display;
import com.leti2021_2.GUI.UserInput;
import com.leti2021_2.Menu.ProgramInitialization;
import com.leti2021_2.PlayingFieldPresets.DebugPreset15x15;
import com.leti2021_2.PlayingFieldPresets.DemoPreset10x10;
import com.leti2021_2.PlayingFieldPresets.DemoPreset15x15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean DEBUG = true;

    public static void main(String[] args) throws IOException {
        ProgramInitialization.run();
    }
}

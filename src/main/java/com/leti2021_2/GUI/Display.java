package com.leti2021_2.GUI;

import com.leti2021_2.Coords;
import com.leti2021_2.FieldObjects.FieldObject;
import com.leti2021_2.FieldObjects.TemporaryObjectsMap;
import com.leti2021_2.FieldObjects.Units.Unit;
import com.leti2021_2.FieldObjects.UniversitiesMap;
import com.leti2021_2.FieldObjects.University;
import com.leti2021_2.Main;
import com.leti2021_2.PlayingField;

import java.io.IOException;


import java.util.ArrayList;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.*;

public class Display {
    public static void run() {
        // instead of console clear
        for (int i = 0; i < 50; i++) { System.out.println(); }

        /*
        if (!Main.DEBUG) {
            for (int y = PlayingField.getSideSize() - 1; y >= 0; y--) {
                for (int x = 0; x < PlayingField.getSideSize(); x++) {
                    System.out.print(colorize(" ", BLACK_TEXT(), BLACK_BACK()));

                    Coords coords = new Coords(x, y);
                    FieldObject currentObject = getObjectByPriority(coords);
                    if (currentObject != null) {
                        currentObject.display();
                    } else System.out.print(colorize(" ", BLACK_TEXT(), BLACK_BACK()));

                    System.out.print(colorize(" ", BLACK_TEXT(), BLACK_BACK()));
                }
                System.out.println();
            }
        }

        // FOR DEBUG MODE (PlayingField coordinates display)
        else {

         */
            drawDebugColumns();

            for (int y = PlayingField.getSideSize() - 1; y >= 0; y--) {
                // for debug
                if (y == 2) {
                    Boolean test = true;
                }

                drawDebugRow(y);

                for (int x = 0; x < PlayingField.getSideSize(); x++) {
                    System.out.print(colorize(" ", BLACK_TEXT(), BLACK_BACK()));

                    Coords coords = new Coords(x, y);
                    FieldObject currentObject = getObjectByPriority(coords);
                    if (currentObject != null) {
                        currentObject.display();
                    } else System.out.print(colorize(" ", BLACK_TEXT(), BLACK_BACK()));

                    System.out.print(colorize(" ", BLACK_TEXT(), BLACK_BACK()));
                }

                drawDebugRow(y);
                System.out.println();
            }

            drawDebugColumns();
        //}




        System.out.println();
    }

    public static FieldObject getObjectByPriority(Coords coords) {
        FieldObject result;

        result = UniversitiesMap.unitSearch(coords);
        if (result != null)
            return result;

        result = TemporaryObjectsMap.getObject(coords);
        if (result != null)
            return result;
        else
            result = PlayingField.getObject(coords);

        return result;
    }

    // for DEBUG mode
    private static void drawDebugColumns() { // only for DEBUG = true
        System.out.print(colorize("  ", BLACK_TEXT(), BRIGHT_BLACK_BACK()));

        for (int i = 0; i < PlayingField.getSideSize(); i++) {
            System.out.print(colorize(" ", BLACK_TEXT(), BRIGHT_BLACK_BACK()));
            if (i < 10)
                System.out.print(colorize(i + " ", BRIGHT_WHITE_TEXT(), BRIGHT_BLACK_BACK()));
            else
                System.out.print(colorize(String.valueOf(i), BRIGHT_WHITE_TEXT(), BRIGHT_BLACK_BACK()));
        }

        System.out.print(colorize("  ", BLACK_TEXT(), BRIGHT_BLACK_BACK()));
        System.out.println();
    }

    private static void drawDebugRow(int row) {
        if (row >= 10)
            System.out.print(colorize(String.valueOf(row), BRIGHT_WHITE_TEXT(), BRIGHT_BLACK_BACK()));
        else
            System.out.print(colorize(row + " ", BRIGHT_WHITE_TEXT(), BRIGHT_BLACK_BACK()));
    }
}

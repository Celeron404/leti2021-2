package com.leti2021_2;

import com.leti2021_2.FieldObjects.FieldObject;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.*;

public class MapFillingChecker {
    public static void run() {
        drawDebugColumns();

        for (int y = PlayingField.getSideSize() - 1; y >= 0; y--) {
            drawDebugRow(y);

            for (int x = 0; x < PlayingField.getSideSize(); x++) {
                System.out.print(colorize(" ", BLACK_TEXT(), BRIGHT_RED_BACK()));

                Coords coords = new Coords(x, y);
                FieldObject currentObject = PlayingField.getObject(coords);
                if (currentObject != null) {
                    System.out.print(colorize(" ", BLACK_TEXT(), BRIGHT_RED_BACK()));
                } else System.out.print(colorize(" ", BLACK_TEXT(), BLACK_BACK()));

                System.out.print(colorize(" ", BLACK_TEXT(), BRIGHT_RED_BACK()));
            }

            drawDebugRow(y);
            System.out.println();
        }

        drawDebugColumns();

        System.out.println("Red cell - cell is filled. Black cell - cell is not filled.");
        System.out.println("Side size: " + PlayingField.getSideSize());
        System.out.println("Number of objects on the map: " + PlayingField.numberOfObjects());

    }

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

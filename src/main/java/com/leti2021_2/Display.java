package com.leti2021_2;

import com.leti2021_2.FieldObjects.FieldObject;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.BLACK_BACK;
import static com.diogonunes.jcolor.Attribute.BLACK_TEXT;

public class Display {
    public static void display(Displayable displayable) {
        for (int x = PlayingField.getSideSize() - 1; x >= 0; x--) {
            for (int y = 0; y < PlayingField.getSideSize(); y++) {
                System.out.print(colorize(" ", BLACK_TEXT(), BLACK_BACK()));

                Coords coords = new Coords(x, y);
                FieldObject currentObject = displayable.getObject(coords);
                if (currentObject != null) {
                    currentObject.display();
                }
                else System.out.print(colorize(" ", BLACK_TEXT(), BLACK_BACK()));

                System.out.print(colorize(" ", BLACK_TEXT(), BLACK_BACK()));
            }
            System.out.println();
        }
        System.out.println();
    }
}

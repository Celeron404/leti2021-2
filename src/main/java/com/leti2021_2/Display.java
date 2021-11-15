package com.leti2021_2;

import com.leti2021_2.FieldObjects.FieldObject;
import com.leti2021_2.FieldObjects.UniversitiesMap;
import com.leti2021_2.FieldObjects.University;
import java.io.IOException;


import java.util.ArrayList;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.BLACK_BACK;
import static com.diogonunes.jcolor.Attribute.BLACK_TEXT;

public class Display {
    public static void display() {
        // instead of console clear
        for (int i = 0; i < 50; i++) { System.out.println(); }


        for (int y = PlayingField.getSideSize() - 1; y >= 0; y--) {
            for (int x = 0; x < PlayingField.getSideSize(); x++) {
                System.out.print(colorize(" ", BLACK_TEXT(), BLACK_BACK()));

                Coords coords = new Coords(x, y);
                FieldObject currentObject = getObjectByPriority(coords);
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

    private static FieldObject getObjectByPriority(Coords coords) {
        FieldObject result;


        for (University university : UniversitiesMap.universities) {
            result = university.getObject(coords);
            if (university.getObject(coords) != null)
                return result;
        }

        result = TemporaryObjects.getObject(coords);
        if (result != null)
            return result;
        else
            result = PlayingField.getObject(coords);

        return result;
    }
}

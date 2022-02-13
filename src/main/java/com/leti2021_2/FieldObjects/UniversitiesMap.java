package com.leti2021_2.FieldObjects;

import com.leti2021_2.Coords;
import com.leti2021_2.FieldObjects.Units.Unit;

import java.util.ArrayList;

public class UniversitiesMap {
    public static ArrayList<University> universities = new ArrayList<University>();

    public static Unit unitSearch(Coords coords) {
        for (University university : UniversitiesMap.universities) {
            if (university.getObject(coords) != null) {
                return university.getObject(coords);
            }
        }
        return null;
    }
}

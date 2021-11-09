package com.leti2021_2.FieldObjects.Factories;

import com.leti2021_2.FieldObjects.FieldObject;
import com.leti2021_2.FieldObjects.University;

public class UniversityFactory implements FieldObjectFactory {
    @Override
    public FieldObject createObject() {
        return new University();
    }
}

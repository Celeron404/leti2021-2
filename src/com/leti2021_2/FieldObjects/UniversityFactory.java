package com.leti2021_2.FieldObjects;

public class UniversityFactory implements FieldObjectFactory {
    @Override
    public FieldObject addObject() {
        return new University();
    }
}

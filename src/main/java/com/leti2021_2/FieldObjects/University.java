package com.leti2021_2.FieldObjects;

public class University implements FieldObject {
    static final String DESCRIPTION = "This is university. We make more workers!";

    @Override
    public String getDescription() { return DESCRIPTION; }
}

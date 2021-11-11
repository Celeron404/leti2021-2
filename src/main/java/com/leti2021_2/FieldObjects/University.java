package com.leti2021_2.FieldObjects;

import com.leti2021_2.Coords;
import com.leti2021_2.Displayable;
import com.leti2021_2.FieldObjects.Units.Unit;

import java.util.HashMap;
import java.util.Map;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.BLACK_BACK;
import static com.diogonunes.jcolor.Attribute.BRIGHT_WHITE_TEXT;

public class University implements FieldObject, Displayable {
    static final String DESCRIPTION = "This is university. We make more workers!";
    private static Map<Coords, FieldObject> unitsMap = new HashMap<>();

    private Unit[] units;

    @Override
    public String getDescription() { return DESCRIPTION; }

    public FieldObject getObject(Coords coords) {
        for (Map.Entry<Coords, FieldObject> entry : unitsMap.entrySet()) {
            if (Coords.isEqual(entry.getKey(), coords))
                return entry.getValue();
        }
        return null;
    }

    @Override
    public void display() {
        System.out.print(colorize("U", BRIGHT_WHITE_TEXT(), BLACK_BACK()));
    }
}

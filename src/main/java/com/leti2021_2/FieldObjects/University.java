package com.leti2021_2.FieldObjects;

import com.leti2021_2.Coords;
import com.leti2021_2.Displayable;
import com.leti2021_2.FieldObjects.LandscapeObjects.PassableLandscapeObject;
import com.leti2021_2.FieldObjects.Units.Unit;
import com.leti2021_2.PlayingField;
import com.leti2021_2.TemporaryObjects;

import java.util.HashMap;
import java.util.Map;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.BLACK_BACK;
import static com.diogonunes.jcolor.Attribute.BRIGHT_WHITE_TEXT;

public class University implements FieldObject {
    static final String DESCRIPTION = "This is university. We make more workers!";
    boolean isPassable = false;
    private Map<Coords, Unit> unitsMap = new HashMap<>();

    @Override
    public String getDescription() { return DESCRIPTION; }

    @Override
    public boolean isPassable() { return false; }

    @Override
    public void display() {
        System.out.print(colorize("U", BRIGHT_WHITE_TEXT(), BLACK_BACK()));
    }

    public Unit getObject(Coords coords) {
        for (Map.Entry<Coords, Unit> entry : unitsMap.entrySet()) {
            if (Coords.isEqual(entry.getKey(), coords))
                return entry.getValue();
        }
        return null;
    }

    public void addObject(Coords coords, Unit unit) {
        for (Map.Entry<Coords, Unit> entry : unitsMap.entrySet()) {
            if (Coords.isEqual(entry.getKey(), coords))
                throw new IllegalArgumentException(coords.getX() + " " + coords.getX() + " : these coordinates are occupied by another object.");
        }
        unitsMap.put(coords, unit);
    }
}

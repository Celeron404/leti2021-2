package com.leti2021_2.FieldObjects;

import com.leti2021_2.Coords;
import com.leti2021_2.Displayable;
import com.leti2021_2.FieldObjects.Units.Unit;

import java.util.HashMap;
import java.util.Map;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.BLACK_BACK;
import static com.diogonunes.jcolor.Attribute.BRIGHT_WHITE_TEXT;

public class University implements FieldObject {
    static final String DESCRIPTION = "This is university. We make more workers!";
    private Map<Coords, FieldObject> unitsMap = new HashMap<>();

    @Override
    public String getDescription() { return DESCRIPTION; }

    @Override
    public void display() {
        System.out.print(colorize("U", BRIGHT_WHITE_TEXT(), BLACK_BACK()));
    }

    public FieldObject getObject(Coords coords) {
        for (Map.Entry<Coords, FieldObject> entry : unitsMap.entrySet()) {
            if (Coords.isEqual(entry.getKey(), coords))
                return entry.getValue();
        }
        return null;
    }

    public void addObject(Coords coords, FieldObject object) {
        for (Map.Entry<Coords, FieldObject> entry : unitsMap.entrySet()) {
            if (Coords.isEqual(entry.getKey(), coords))
                throw new IllegalArgumentException("These coordinates are occupied by another object.");
        }
        unitsMap.put(coords, object);
    }

    public void moveObject(Coords objectCoords, Direction direction, int numberOfSteps) {
        FieldObject object = getObject(objectCoords);
        // проверить все Map
        // передвинуть в нужном направлении
        // отрисовать c учётом всех Map
    }
}

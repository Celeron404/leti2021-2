package com.leti2021_2.FieldObjects;

import com.leti2021_2.Coords;
import com.leti2021_2.FieldObjects.Units.Unit;
import com.leti2021_2.Observer.Observer;
import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.BLACK_BACK;
import static com.diogonunes.jcolor.Attribute.BRIGHT_WHITE_TEXT;

public class University implements FieldObject, Observer {
    static final String DESCRIPTION = "This is university. We make more workers!";
    boolean isPassable = false;
    private double health = 200;
    private int maxUnits = 10; // max units under control (at the same time)
    private int numberOfUnits = 0;
    private Map<Coords, Unit> unitsMap = new HashMap<>();

    @Override
    public String getDescription() { return DESCRIPTION; }

    @Override
    public boolean isPassable() { return false; }

    @Override
    public void display() {
        System.out.print(colorize("U", BRIGHT_WHITE_TEXT(), BLACK_BACK()));
    }

    @Override
    public void update(Unit unit) {
        if (unit.getIsNewSubject() && unit.getHealth() > 0) {
            if (numberOfUnits < maxUnits) {
                numberOfUnits++;
                System.out.println("The " + unit.getDescription() + " went on it's own way.");
            } else {
                System.out.println("We can't produce more units than " + maxUnits + "!");
            }
        } else if (unit.getHealth() <= 0) {
            if (numberOfUnits > 0) {
                System.out.println("The " + unit.getDescription() + " went to eternal rest.");
                removeObject(unit);
                numberOfUnits--;
            } else
                throw new ArrayIndexOutOfBoundsException("Unit's number cannot be less than zero!");
        }
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
        unit.setOwnUniversity(this);
        unitsMap.put(coords, unit);
    }

    public void removeObject(Unit unit) {
        for (Map.Entry<Coords, Unit> entry : unitsMap.entrySet()) {
            if (entry.getValue() == unit) {
                var key = entry.getKey();
                unitsMap.remove(key);
            } else
                throw new IllegalArgumentException("This university can not contain this Unit.");
        }
    }
}

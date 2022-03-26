package com.leti2021_2.FieldObjects;

import com.leti2021_2.Coords;
import com.leti2021_2.FieldObjects.Units.Unit;
import com.leti2021_2.GUI.UserInput;
import com.leti2021_2.ObjectType;
import com.leti2021_2.Observer.Observer;
import com.leti2021_2.PlayingField;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.BLACK_BACK;
import static com.diogonunes.jcolor.Attribute.BRIGHT_WHITE_TEXT;

public class University implements FieldObject, Observer {
    static final String DESCRIPTION = "This is university. We make more workers!";
    boolean isPassable = false;
    private int health = 200;
    public static final int maxUnits = 10; // max units under control (at the same time)
    private int numberOfUnits = 0;
    private final Map<Coords, Unit> unitsMap = new HashMap<>();

    @Override
    public String getDescription() { return DESCRIPTION; }

    @Override
    public boolean isPassable() { return false; }

    @Override
    public void display() {
        System.out.print(colorize("U", BRIGHT_WHITE_TEXT(), BLACK_BACK()));
    }

    @Override
    public ObjectType getType() {
        return ObjectType.UNIVERSITY;
    }

    @Override
    public void update(Unit unit) {
        if (unit.getIsNewSubject() && unit.isAlive()) {
            if (numberOfUnits < maxUnits) {
                numberOfUnits++;
                System.out.println("The " + unit.getDescription() + " went on it's own way.");
            } else {
                System.out.println("We can't produce more units than " + maxUnits + "!");
            }
        } else if (!unit.isAlive()) {
            if (numberOfUnits > 0) {
                System.out.println("The " + unit.getDescription() + " went to eternal rest.");
                removeObject(unit);
                numberOfUnits--;
            } else
                throw new IllegalArgumentException("Unit's number cannot be less than zero!");
        }

    }

    public Unit getObject(Coords coords) {
        for (Map.Entry<Coords, Unit> entry : unitsMap.entrySet()) {
            if (Coords.isEqual(entry.getKey(), coords))
                return entry.getValue();
        }
        return null;
    }

    public Coords getObject(Unit unit) {
        for (Map.Entry<Coords, Unit> entry : unitsMap.entrySet()) {
            if (entry.getValue() == unit)
                return entry.getKey();
        }
        return null;
    }

    public int getNumberOfUnits() {
        return numberOfUnits;
    }

    public void createUnit(Unit unit) {
        this.setHealth(health - 10);

        // in default situation, we create unit to the right of the University.
        // If we need more flexibility, we can fix it here.
        Coords coords = new Coords(PlayingField.getCoordsOfObject(this));
        coords.setX(coords.getX() + 1); // to the right of the University
        addObject(coords, unit);
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
        for (Map.Entry<Coords, Unit> item : unitsMap.entrySet()) {
            if (item.getValue() == unit) {
                unitsMap.remove(item.getKey());
                return;
            }
        }
        throw new IllegalArgumentException("This university can not contain this Unit.");
    }

    public void printUnits() {
        System.out.println("Units: " + getNumberOfUnits());

        int programmers = 0, testers = 0, supportEngineers = 0;
        for (Map.Entry<Coords, Unit> item : unitsMap.entrySet()) {
            switch(item.getValue().getUnitType()) {
                case TESTER -> testers++;
                case PROGRAMMER -> programmers++;
                case SUPPORTENGINEER -> supportEngineers++;
            }
        }

        if (programmers > 0)
            System.out.println("\tProgrammers: " + programmers);
        if (testers > 0)
            System.out.println("\tTesters: " + testers);
        if (supportEngineers > 0)
            System.out.println("\tSupport Engineers: " + supportEngineers);
        System.out.println();
    }

    public void setHealth(int health) {
        if (health <= 0)
            throw new IllegalArgumentException("The strength of the university is less than possible. Improving Units, you can increase it.");
        else this.health = health;
    }

    public int getHealth() { return health; }
}

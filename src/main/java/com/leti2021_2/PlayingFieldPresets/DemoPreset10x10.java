package com.leti2021_2.PlayingFieldPresets;

import com.leti2021_2.Coords;
import com.leti2021_2.FieldObjects.Direction;
import com.leti2021_2.FieldObjects.Factories.JuniorUnitAbstractFactory;
import com.leti2021_2.FieldObjects.Factories.SeniorUnitAbstractFactory;
import com.leti2021_2.FieldObjects.LandscapeObjects.Impassable.Wall;
import com.leti2021_2.FieldObjects.LandscapeObjects.Passable.Floor;
import com.leti2021_2.FieldObjects.LandscapeObjects.Passable.Junk;
import com.leti2021_2.FieldObjects.LandscapeObjects.Passable.Table;
import com.leti2021_2.FieldObjects.LandscapeObjects.Passable.Tree;
import com.leti2021_2.FieldObjects.UnitMover;
import com.leti2021_2.FieldObjects.UniversitiesMap;
import com.leti2021_2.FieldObjects.University;
import com.leti2021_2.FloorGenerator;
import com.leti2021_2.PlayingField;
import com.leti2021_2.WaitForUserInput;

import java.io.IOException;

public class DemoPreset10x10 {
    public static void fill() {
        int sideSize = 10;
        var playingField = new PlayingField(sideSize);

        //house
        PlayingField.addObject(new Coords(7, 1), new Wall());
        PlayingField.addObject(new Coords(7, 2), new Wall());
        PlayingField.addObject(new Coords(6, 3), new Wall());
        PlayingField.addObject(new Coords(5, 3), new Wall());
        PlayingField.addObject(new Coords(4, 3), new Wall());
        PlayingField.addObject(new Coords(3, 2), new Wall());
        PlayingField.addObject(new Coords(4, 2), new Table());
        PlayingField.addObject(new Coords(6, 2), new Table());

        //forest
        PlayingField.addObject(new Coords(8, 1), new Tree());
        PlayingField.addObject(new Coords(8, 3), new Tree());
        PlayingField.addObject(new Coords(7, 3), new Tree());
        PlayingField.addObject(new Coords(3, 3), new Tree());
        PlayingField.addObject(new Coords(1, 4), new Tree());
        PlayingField.addObject(new Coords(3, 4), new Tree());
        PlayingField.addObject(new Coords(7, 4), new Tree());
        PlayingField.addObject(new Coords(1, 5), new Tree());
        PlayingField.addObject(new Coords(2, 5), new Tree());
        PlayingField.addObject(new Coords(4, 5), new Tree());
        PlayingField.addObject(new Coords(5, 5), new Tree());
        PlayingField.addObject(new Coords(6, 5), new Tree());
        PlayingField.addObject(new Coords(7, 5), new Tree());
        PlayingField.addObject(new Coords(8, 5), new Tree());
        PlayingField.addObject(new Coords(1, 6), new Tree());
        PlayingField.addObject(new Coords(2, 6), new Tree());
        PlayingField.addObject(new Coords(3, 6), new Tree());
        PlayingField.addObject(new Coords(5, 6), new Tree());
        PlayingField.addObject(new Coords(7, 6), new Tree());
        PlayingField.addObject(new Coords(3, 7), new Tree());
        PlayingField.addObject(new Coords(6, 7), new Tree());

        //junkyard
        PlayingField.addObject(new Coords(8, 6), new Junk());
        PlayingField.addObject(new Coords(8, 7), new Junk());
        PlayingField.addObject(new Coords(7, 7), new Junk());
        PlayingField.addObject(new Coords(8, 8), new Junk());
        PlayingField.addObject(new Coords(7, 8), new Junk());

        var floorGenerator = new FloorGenerator();
        floorGenerator.generateFieldObjects(0);
    }

    public static void run() {
        var university = new University();
        UniversitiesMap.universities.add(university);
        PlayingField.replaceObject(new Coords(2, 8), university);

        var seniorFactory = new SeniorUnitAbstractFactory();
        var seniorProgrammer = seniorFactory.createProgrammer();
        var coords = new Coords(3, 8);
        university.addObject(coords, seniorProgrammer);

        var mover = new UnitMover();
        mover.move(seniorProgrammer, coords, Direction.RIGHT, 6);
        mover.move(seniorProgrammer, coords, Direction.DOWN, 2);
        mover.move(seniorProgrammer, coords, Direction.LEFT, 4);
        mover.move(seniorProgrammer, coords, Direction.DOWN, 1);
        mover.move(seniorProgrammer, coords, Direction.LEFT, 1);
        mover.move(seniorProgrammer, coords, Direction.DOWN, 1);
        mover.move(seniorProgrammer, coords, Direction.LEFT, 1);
        mover.move(seniorProgrammer, coords, Direction.DOWN, 3);
        mover.move(seniorProgrammer, coords, Direction.RIGHT, 2);
        mover.move(seniorProgrammer, coords, Direction.UP, 1);
        System.out.println("Unit coords: " + coords);
    }
}

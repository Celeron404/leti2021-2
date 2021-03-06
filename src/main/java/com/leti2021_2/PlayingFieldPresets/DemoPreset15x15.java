package com.leti2021_2.PlayingFieldPresets;

import com.leti2021_2.*;
import com.leti2021_2.FieldObjects.*;
import com.leti2021_2.FieldObjects.Factories.Unit.JuniorUnitAbstractFactory;
import com.leti2021_2.FieldObjects.LandscapeObjects.Impassable.Wall;
import com.leti2021_2.FieldObjects.LandscapeObjects.Passable.Table;
import com.leti2021_2.FieldObjects.LandscapeObjects.Passable.Tree;
import com.leti2021_2.FieldObjects.TemporaryObjects.Beer;
import com.leti2021_2.FieldObjects.TemporaryObjects.EasyTask;
import com.leti2021_2.FieldObjects.TemporaryObjects.HardTask;
import com.leti2021_2.GUI.UserInput;
import com.leti2021_2.FieldObjects.Generators.FloorGenerator;

import java.io.IOException;

public class DemoPreset15x15 {
    public static void fill() {
        int sideSize = 15;
        var playingField = new PlayingField(sideSize);

        //office
        PlayingField.addObject(new Coords(6, 13), new Wall());
        PlayingField.addObject(new Coords(6, 12), new Wall());
        PlayingField.addObject(new Coords(6, 11), new Wall());
        PlayingField.addObject(new Coords(6, 10), new Wall());
        PlayingField.addObject(new Coords(6, 9), new Wall());
        PlayingField.addObject(new Coords(6, 8), new Wall());
        PlayingField.addObject(new Coords(7, 8), new Wall());
        PlayingField.addObject(new Coords(7, 7), new Wall());
        PlayingField.addObject(new Coords(8, 7), new Wall());
        PlayingField.addObject(new Coords(9, 7), new Wall());
        PlayingField.addObject(new Coords(11, 7), new Wall());
        PlayingField.addObject(new Coords(12, 7), new Wall());
        PlayingField.addObject(new Coords(13, 7), new Wall());
        PlayingField.addObject(new Coords(8, 13), new Table());
        PlayingField.addObject(new Coords(10, 13), new Table());
        PlayingField.addObject(new Coords(12, 13), new Table());
        PlayingField.addObject(new Coords(7, 11), new Table());
        PlayingField.addObject(new Coords(9, 10), new Table());
        PlayingField.addObject(new Coords(9, 9), new Table());
        PlayingField.addObject(new Coords(10, 9), new Table());
        PlayingField.addObject(new Coords(11, 9), new Table());
        PlayingField.addObject(new Coords(13, 10), new Table());
        PlayingField.addObject(new Coords(13, 9), new Table());
        PlayingField.addObject(new Coords(7, 13), new Tree());
        PlayingField.addObject(new Coords(13, 13), new Tree());

        //bar
        PlayingField.addObject(new Coords(8, 4), new Wall());
        PlayingField.addObject(new Coords(9, 4), new Wall());
        PlayingField.addObject(new Coords(10, 4), new Wall());
        PlayingField.addObject(new Coords(11, 4), new Wall());
        PlayingField.addObject(new Coords(12, 4), new Wall());
        PlayingField.addObject(new Coords(13, 4), new Wall());
        PlayingField.addObject(new Coords(8, 2), new Wall());
        PlayingField.addObject(new Coords(8, 1), new Wall());
        PlayingField.addObject(new Coords(10, 1), new Table());
        PlayingField.addObject(new Coords(12, 1), new Table());
        PlayingField.addObject(new Coords(13, 3), new Tree());

        //outdoor
        var university = new University();
        UniversitiesMap.universities.add(university);
        PlayingField.addObject(new Coords(2, 2), university);
        PlayingField.addObject(new Coords(1, 6), new Tree());
        PlayingField.addObject(new Coords(1, 5), new Tree());
        PlayingField.addObject(new Coords(1, 4), new Tree());
        PlayingField.addObject(new Coords(2, 5), new Tree());
        PlayingField.addObject(new Coords(4, 1), new Tree());
        PlayingField.addObject(new Coords(5, 1), new Tree());
        PlayingField.addObject(new Coords(6, 1), new Tree());
        PlayingField.addObject(new Coords(5, 2), new Tree());

        var floorGenerator = new FloorGenerator();
        floorGenerator.generateFieldObjects();

        //temporary objects
        TemporaryObjectsMap.addObject(new Coords(10, 1), new Beer());
        TemporaryObjectsMap.addObject(new Coords(12, 1), new Beer());
        TemporaryObjectsMap.addObject(new Coords(10, 9), new EasyTask());
        TemporaryObjectsMap.addObject(new Coords(11, 9), new EasyTask());
        TemporaryObjectsMap.addObject(new Coords(8, 13), new HardTask());
        TemporaryObjectsMap.addObject(new Coords(10, 13), new HardTask());
        TemporaryObjectsMap.addObject(new Coords(12, 13), new HardTask());
    }

    public static void run() throws IOException {
        /*
        var university = new University();
        UniversitiesMap.universities.add(university);
        PlayingField.replaceObject(new Coords(2, 2), university);

        var juniorFactory = new JuniorUnitAbstractFactory();
        var juniorTester = juniorFactory.createTester();
        var coords = new Coords(3, 3);
        university.addObject(coords, juniorTester);

        var mover = new UnitMover();
        mover.move(juniorTester, coords, Direction.type.DOWN, 3);
        UserInput.waitForInput();
        mover.move(juniorTester, coords, Direction.type.RIGHT, 3);
        mover.move(juniorTester, coords, Direction.type.UP, 4);
        mover.move(juniorTester, coords, Direction.type.RIGHT, 4);
        mover.move(juniorTester, coords, Direction.type.UP, 3);
        mover.move(juniorTester, coords, Direction.type.RIGHT, 2);
        mover.move(juniorTester, coords, Direction.type.UP, 5);
        System.out.println("Unit coords: " + coords);

         */
    }
}

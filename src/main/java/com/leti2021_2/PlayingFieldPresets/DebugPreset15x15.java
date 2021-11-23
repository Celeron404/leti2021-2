package com.leti2021_2.PlayingFieldPresets;

import com.leti2021_2.*;
import com.leti2021_2.FieldObjects.*;
import com.leti2021_2.FieldObjects.Factories.JuniorUnitAbstractFactory;
import com.leti2021_2.FieldObjects.Factories.UniversityFactory;
import com.leti2021_2.FieldObjects.LandscapeObjects.Impassable.Wall;
import com.leti2021_2.FieldObjects.LandscapeObjects.Passable.Floor;
import com.leti2021_2.FieldObjects.LandscapeObjects.Passable.Tree;
import com.leti2021_2.FieldObjects.TemporaryObjects.Beer;
import com.leti2021_2.FieldObjects.TemporaryObjects.EasyTask;
import com.leti2021_2.FieldObjects.TemporaryObjects.HardTask;
import com.leti2021_2.FieldObjects.Units.JuniorProgrammer;

import java.io.IOException;

public class DebugPreset15x15 {
    static int sideSize = 15;

    public static void fill() throws IOException {
        var juniorFactory = new JuniorUnitAbstractFactory();
        var juniorTester = juniorFactory.createTester();
        var juniorProgrammer = juniorFactory.createProgrammer();
        var juniorSupportEngineer = juniorFactory.createSupportEngineer();
        System.out.println("junior units:");
        System.out.println(juniorTester.getDescription());
        juniorTester.setHealth(50);
        System.out.println(juniorProgrammer.getDescription());
        System.out.println(juniorSupportEngineer.getDescription());
        System.out.println();

        var universityFactory = new UniversityFactory();
        FieldObject university0 = universityFactory.createObject();
        System.out.println(university0.getDescription());
        System.out.println();
        WaitForUserInput.run();

        var playingField = new PlayingField(sideSize);

        TemporaryObjects.addObject(new Coords(1, 1), new Beer());
        TemporaryObjects.addObject(new Coords(1, 2), new Beer());
        TemporaryObjects.addObject(new Coords(1, 3), new Beer());
        TemporaryObjects.addObject(new Coords(2, 1), new EasyTask());
        TemporaryObjects.addObject(new Coords(3, 1), new HardTask());

        PlayingField.addObject(new Coords(1, 13), new Floor());
        PlayingField.addObject(new Coords(2, 13), new Floor());
        PlayingField.addObject(new Coords(3, 13), new Tree());
        PlayingField.addObject(new Coords(4, 13), new Tree());
        PlayingField.addObject(new Coords(5, 13), new Tree());
        PlayingField.addObject(new Coords(6, 13), new Floor());
        PlayingField.addObject(new Coords(7, 13), new Floor());
        PlayingField.addObject(new Coords(8, 13), new Floor());
        PlayingField.addObject(new Coords(9, 13), new Floor());
        PlayingField.addObject(new Coords(10, 13), new Floor());
        PlayingField.addObject(new Coords(11, 13), new Floor());
        PlayingField.addObject(new Coords(12, 13), new Floor());
        PlayingField.addObject(new Coords(13, 13), new Floor());
        PlayingField.addObject(new Coords(1, 12), new Floor());
        PlayingField.addObject(new Coords(2, 12), new Floor());
        PlayingField.addObject(new Coords(3, 12), new Tree());
        PlayingField.addObject(new Coords(4, 12), new Tree());
        PlayingField.addObject(new Coords(5, 12), new Tree());
        PlayingField.addObject(new Coords(6, 12), new Floor());
        PlayingField.addObject(new Coords(7, 12), new Floor());
        PlayingField.addObject(new Coords(8, 12), new Floor());
        PlayingField.addObject(new Coords(9, 12), new Floor());
        PlayingField.addObject(new Coords(10, 12), new Floor());
        PlayingField.addObject(new Coords(11, 12), new Floor());
        //PlayingField.addObject(new Coords(12, 12), new Floor());
        PlayingField.addObject(new Coords(13, 12), new Floor());
        PlayingField.addObject(new Coords(1, 11), new Floor());
        PlayingField.addObject(new Coords(2, 11), new Floor());
        PlayingField.addObject(new Coords(3, 11), new Tree());
        PlayingField.addObject(new Coords(4, 11), new Tree());
        PlayingField.addObject(new Coords(5, 11), new Tree());
        PlayingField.addObject(new Coords(6, 11), new Floor());
        PlayingField.addObject(new Coords(7, 11), new Floor());
        PlayingField.addObject(new Coords(8, 11), new Floor());
        PlayingField.addObject(new Coords(9, 11), new Floor());
        PlayingField.addObject(new Coords(10, 11), new Floor());
        //PlayingField.addObject(new Coords(11, 11), new Floor());
        PlayingField.addObject(new Coords(12, 11), new Floor());
        PlayingField.addObject(new Coords(13, 11), new Floor());
        PlayingField.replaceObject(new Coords(13, 11), new Wall());

        //System.out.println(colorize("Temporary object - beer: ", BRIGHT_BLACK_TEXT(), BLACK_BACK()) + colorize("B", BLACK_TEXT(), CYAN_BACK()));

        /*
        System.out.println();
        int objects = FieldObjectCounting.getNumberOfObjects();
        System.out.println("objects: " + objects);
        */
    }


    public static void run() {
        var university = new University();
        UniversitiesMap.universities.add(university);
        for (int i = 1; i < sideSize - 2; i++) {
            PlayingField.addObject(new Coords(i, i), university);
        }

        var jun = new JuniorProgrammer();
        var coords = new Coords(1, 13);
        university.addObject(coords, jun);

        var mover = new UnitMover();
        mover.move(jun, coords, Direction.RIGHT, 20);
        mover.move(jun, coords, Direction.RIGHT, 2);
        mover.move(jun, coords, Direction.DOWN, 2);
        mover.move(jun, coords, Direction.RIGHT, 2);
        System.out.println("Unit coords: " + coords);
    }
}

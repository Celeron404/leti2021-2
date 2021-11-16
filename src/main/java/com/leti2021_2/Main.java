package com.leti2021_2;

import com.leti2021_2.FieldObjects.*;
import com.leti2021_2.FieldObjects.Factories.JuniorUnitAbstractFactory;
import com.leti2021_2.FieldObjects.Factories.UniversityFactory;
import com.leti2021_2.FieldObjects.LandscapeObjects.Passable.Floor;
import com.leti2021_2.FieldObjects.LandscapeObjects.Passable.Junk;
import com.leti2021_2.FieldObjects.TemporaryObjects.Beer;
import com.leti2021_2.FieldObjects.TemporaryObjects.EasyTask;
import com.leti2021_2.FieldObjects.TemporaryObjects.HardTask;
import com.leti2021_2.FieldObjects.Units.JuniorProgrammer;
import com.leti2021_2.FieldObjects.Units.Unit;

import java.io.IOException;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.*;

public class Main {

    public static void main(String[] args) {

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

        int sideSize = 15;
        var playingField = new PlayingField(sideSize);

        var university = new University();
        UniversitiesMap.universities.add(university);
        for (int i = 1; i < sideSize - 1; i++) {
            PlayingField.addObject(new Coords(i, i), university);
        }

        TemporaryObjects.addObject(new Coords(1, 1), new Beer());
        TemporaryObjects.addObject(new Coords(1, 2), new Beer());
        TemporaryObjects.addObject(new Coords(1, 3), new Beer());
        TemporaryObjects.addObject(new Coords(2, 1), new EasyTask());
        TemporaryObjects.addObject(new Coords(3, 1), new HardTask());

        Display.display();

        PlayingField.addObject(new Coords(1, 13), new Floor());
        PlayingField.addObject(new Coords(2, 13), new Floor());
        PlayingField.addObject(new Coords(3, 13), new Junk());
        PlayingField.addObject(new Coords(4, 13), new Junk());
        PlayingField.addObject(new Coords(5, 13), new Junk());
        PlayingField.addObject(new Coords(6, 13), new Floor());
        PlayingField.addObject(new Coords(7, 13), new Floor());
        PlayingField.addObject(new Coords(8, 13), new Floor());
        PlayingField.addObject(new Coords(9, 13), new Floor());
        PlayingField.addObject(new Coords(10, 13), new Floor());
        PlayingField.addObject(new Coords(11, 13), new Floor());
        PlayingField.addObject(new Coords(12, 13), new Floor());
        //PlayingField.addObject(new Coords(13, 13), new Floor());

        var jun = new JuniorProgrammer();
        var coords = new Coords(1, 13);
        university.addObject(coords, jun);

        Display.display();

        var mover = new UnitMover();
        mover.move(jun, coords, Direction.RIGHT, 13);

        //System.out.println(colorize("Temporary object - beer: ", BRIGHT_BLACK_TEXT(), BLACK_BACK()) + colorize("B", BLACK_TEXT(), CYAN_BACK()));

        /*
        System.out.println();
        int objects = FieldObjectCounting.getNumberOfObjects();
        System.out.println("objects: " + objects);
        */
    }
}

package com.leti2021_2.PlayingFieldPresets;

import com.leti2021_2.*;
import com.leti2021_2.FieldObjects.*;
import com.leti2021_2.FieldObjects.Factories.Unit.JuniorUnitAbstractFactory;
import com.leti2021_2.FieldObjects.Factories.Unit.UnitFactoryMaker;
import com.leti2021_2.FieldObjects.Factories.UniversityFactory;
import com.leti2021_2.FieldObjects.LandscapeObjects.Impassable.Wall;
import com.leti2021_2.FieldObjects.LandscapeObjects.Passable.Tree;
import com.leti2021_2.FieldObjects.TemporaryObjects.Beer;
import com.leti2021_2.FieldObjects.TemporaryObjects.EasyTask;
import com.leti2021_2.FieldObjects.TemporaryObjects.HardTask;
import com.leti2021_2.FieldObjects.Units.Unit;
import com.leti2021_2.GUI.Display;
import com.leti2021_2.GUI.UserInput;
import com.leti2021_2.FieldObjects.Generators.FloorGenerator;

import java.io.IOException;

import static com.leti2021_2.FieldObjects.Factories.Unit.UnitFactoryMaker.FactoryMaker.UnitQualification.JUNIOR;

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
        UserInput.waitForInput();

        var playingField = new PlayingField(sideSize);

        TemporaryObjectsMap.addObject(new Coords(1, 1), new Beer());
        TemporaryObjectsMap.addObject(new Coords(1, 2), new Beer());
        TemporaryObjectsMap.addObject(new Coords(1, 3), new Beer());
        TemporaryObjectsMap.addObject(new Coords(2, 1), new EasyTask());
        TemporaryObjectsMap.addObject(new Coords(3, 1), new HardTask());

        PlayingField.addObject(new Coords(3, 13), new Tree());
        PlayingField.addObject(new Coords(4, 13), new Tree());
        PlayingField.addObject(new Coords(5, 13), new Tree());
        PlayingField.addObject(new Coords(3, 12), new Tree());
        PlayingField.addObject(new Coords(4, 12), new Tree());
        PlayingField.addObject(new Coords(5, 12), new Tree());
        PlayingField.addObject(new Coords(3, 11), new Tree());
        PlayingField.addObject(new Coords(4, 11), new Tree());
        PlayingField.addObject(new Coords(5, 11), new Tree());
        PlayingField.addObject(new Coords(13, 11), new Wall());
        PlayingField.replaceObject(new Coords(13, 11), new Wall());

        var floorGenerator = new FloorGenerator();
        floorGenerator.generateFieldObjects();
    }


    public static void run() throws IOException {
        var university = new University();
        UniversitiesMap.universities.add(university);
        PlayingField.replaceObject(new Coords(2, 5), university);

        var junFactory = UnitFactoryMaker.FactoryMaker.makeFactory(JUNIOR);
        Unit junTester = junFactory.createTester();
        var coordsOfJunTester = new Coords(2, 4);
        university.addObject(coordsOfJunTester, junTester);

        Unit junProger = junFactory.createProgrammer();
        var coordsOfJunProger = new Coords(3, 4);
        university.addObject(coordsOfJunProger, junProger);
        Unit junSupportEngineer = junFactory.createSupportEngineer();
        var coordsOfJunSE = new Coords(4, 4);
        university.addObject(coordsOfJunSE, junSupportEngineer);

        Display.run();

        UserInput.waitForInput();

        var mover = new UnitMover();
        mover.move(junTester, coordsOfJunTester, Direction.DOWN, 2);
        System.out.println("Unit stats: " + junTester.getHealth() + " hp, " + junTester.getStressTolerance() + " stressTolerance, " + junTester.getSkillLvl() + " skillLvl.");
        UserInput.waitForInput();
        mover.move(junTester, coordsOfJunTester, Direction.LEFT, 1);
        System.out.println("Unit stats: " + junTester.getHealth() + " hp, " + junTester.getStressTolerance() + " stressTolerance, " + junTester.getSkillLvl() + " skillLvl.");
        UserInput.waitForInput();
        mover.move(junTester, coordsOfJunTester, Direction.RIGHT, 1);
        mover.move(junTester, coordsOfJunTester, Direction.DOWN, 1);
        System.out.println("Unit stats: " + junTester.getHealth() + " hp, " + junTester.getStressTolerance() + " stressTolerance, " + junTester.getSkillLvl() + " skillLvl.");
        UserInput.waitForInput();
        mover.move(junTester, coordsOfJunTester, Direction.DOWN, 1);
        System.out.println("Unit stats: " + junTester.getHealth() + " hp, " + junTester.getStressTolerance() + " stressTolerance, " + junTester.getSkillLvl() + " skillLvl.");
        UserInput.waitForInput();
        mover.move(junTester, coordsOfJunTester, Direction.RIGHT, 1);
        System.out.println("Unit stats: " + junTester.getHealth() + " hp, " + junTester.getStressTolerance() + " stressTolerance, " + junTester.getSkillLvl() + " skillLvl.");
        System.out.println("Unit coords: " + coordsOfJunTester);
        UserInput.waitForInput();

        junTester.setHealth(50);
        System.out.println("Unit's health: " + junTester.getHealth());
        System.out.println("-50");
        junTester.setHealth(junTester.getHealth() - 50);
        UserInput.waitForInput();
        Display.run();

        //Unit junTester2 = junFactory.createTester();
        //university.addObject(coordsOfJunTester, junTester2);
        //Display.run();
        UserInput.waitForInput();
    }
}

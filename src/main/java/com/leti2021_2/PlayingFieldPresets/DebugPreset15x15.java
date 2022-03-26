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
import com.leti2021_2.GUI.MainMenu;
import com.leti2021_2.GUI.UserInput;
import com.leti2021_2.FieldObjects.Generators.FloorGenerator;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        String testStr = UserInput.getString();
        Coords testCrds = parseCoords(testStr);

        /*
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
        mover.move(junTester, coordsOfJunTester, Direction.type.DOWN, 2);
        System.out.println("Unit stats: " + junTester.getHealth() + " hp, " + junTester.getStressTolerance() + " stressTolerance, " + junTester.getSkillLvl() + " skillLvl.");
        UserInput.waitForInput();
        mover.move(junTester, coordsOfJunTester, Direction.type.LEFT, 1);
        System.out.println("Unit stats: " + junTester.getHealth() + " hp, " + junTester.getStressTolerance() + " stressTolerance, " + junTester.getSkillLvl() + " skillLvl.");
        UserInput.waitForInput();
        mover.move(junTester, coordsOfJunTester, Direction.type.RIGHT, 1);
        mover.move(junTester, coordsOfJunTester, Direction.type.DOWN, 1);
        System.out.println("Unit stats: " + junTester.getHealth() + " hp, " + junTester.getStressTolerance() + " stressTolerance, " + junTester.getSkillLvl() + " skillLvl.");
        UserInput.waitForInput();
        mover.move(junTester, coordsOfJunTester, Direction.type.DOWN, 1);
        System.out.println("Unit stats: " + junTester.getHealth() + " hp, " + junTester.getStressTolerance() + " stressTolerance, " + junTester.getSkillLvl() + " skillLvl.");
        UserInput.waitForInput();
        mover.move(junTester, coordsOfJunTester, Direction.type.RIGHT, 1);
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
        */
    }

    public static Coords parseCoords(String input) throws IOException {
        Pattern regexPattern = Pattern.compile("^\\d+"); // (^\d+,\d+$)|(^\d+ \d+$) - pair of numbers with separator " " or ",", for example: 13 14 or 0,25
        Matcher regexMatcher = regexPattern.matcher(input);
        //boolean matchFound = regexMatcher.find();
        if (!regexMatcher.find())
            throw new IllegalArgumentException("Error! Coordinates only can be pair of number with separator \" \" or \",\", for example\"13 14\" or \"0,25\"");
        // if input is correct then parse
        String xStr = input.substring(regexMatcher.start(), regexMatcher.end());
        System.out.println(xStr);
        UserInput.waitForInput();

        regexPattern = Pattern.compile("^\\d+"); // ^\d+ - first number
        regexMatcher = regexPattern.matcher(input);
        if (!regexMatcher.find())
            throw new IllegalArgumentException("Error! Coordinates only can be pair of number with separator \" \" or \",\", for example\"13 14\" or \"0,25\"");
        xStr = input.substring(regexMatcher.start(), regexMatcher.end());
        int x = Integer.parseInt(xStr);

        regexPattern = Pattern.compile("^\\d+$"); // \d+$ - second number
        regexMatcher = regexPattern.matcher(input);
        String yStr = input.substring(regexMatcher.start(), regexMatcher.end());
        int y = Integer.parseInt(xStr);

        return new Coords(x, y);
    }
}

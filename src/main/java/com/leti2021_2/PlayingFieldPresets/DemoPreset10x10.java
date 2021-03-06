package com.leti2021_2.PlayingFieldPresets;

import com.leti2021_2.*;
import com.leti2021_2.FieldObjects.*;
import com.leti2021_2.FieldObjects.Factories.Unit.SeniorUnitAbstractFactory;
import com.leti2021_2.FieldObjects.LandscapeObjects.Impassable.Wall;
import com.leti2021_2.FieldObjects.LandscapeObjects.Passable.Junk;
import com.leti2021_2.FieldObjects.LandscapeObjects.Passable.Table;
import com.leti2021_2.FieldObjects.LandscapeObjects.Passable.Tree;
import com.leti2021_2.FieldObjects.TemporaryObjects.Beer;
import com.leti2021_2.FieldObjects.TemporaryObjects.EasyTask;
import com.leti2021_2.FieldObjects.TemporaryObjects.HardTask;
import com.leti2021_2.FieldObjects.Generators.FloorGenerator;

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

        var university = new University();
        UniversitiesMap.universities.add(university);
        PlayingField.addObject(new Coords(2, 8), university);

        var floorGenerator = new FloorGenerator();
        floorGenerator.generateFieldObjects();

        //temporary objects
        TemporaryObjectsMap.addObject(new Coords(6, 1), new Beer());
        TemporaryObjectsMap.addObject(new Coords(8, 8), new HardTask());
        TemporaryObjectsMap.addObject(new Coords(4, 2), new EasyTask());
    }

    public static void run() {
    }
}

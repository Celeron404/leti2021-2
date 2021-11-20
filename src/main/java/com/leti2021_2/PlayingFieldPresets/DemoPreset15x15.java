package com.leti2021_2.PlayingFieldPresets;

import com.leti2021_2.Coords;
import com.leti2021_2.FieldObjects.LandscapeObjects.Impassable.Wall;
import com.leti2021_2.FieldObjects.LandscapeObjects.Passable.Floor;
import com.leti2021_2.FieldObjects.LandscapeObjects.Passable.Table;
import com.leti2021_2.FieldObjects.LandscapeObjects.Passable.Tree;
import com.leti2021_2.FieldObjects.UniversitiesMap;
import com.leti2021_2.FieldObjects.University;
import com.leti2021_2.PlayingField;

public class DemoPreset15x15 {
    public static void run() {
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

        //floor
        for (int i = 1; i < sideSize - 1; i++) {
            for (int j = 1; j < sideSize - 1; j++) {
                if (PlayingField.getObject(new Coords(i, j)) == null)
                    PlayingField.addObject(new Coords(i, j), new Floor());
            }
        }
    }
}

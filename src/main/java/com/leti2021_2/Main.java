package com.leti2021_2;

import com.leti2021_2.FieldObjects.Factories.JuniorUnitAbstractFactory;
import com.leti2021_2.FieldObjects.Factories.UniversityFactory;
import com.leti2021_2.FieldObjects.FieldObject;
import com.leti2021_2.FieldObjects.TemporaryObjects.Beer;
import com.leti2021_2.FieldObjects.TemporaryObjects.EasyTask;
import com.leti2021_2.FieldObjects.TemporaryObjects.HardTask;
import com.leti2021_2.FieldObjects.University;

import java.util.ArrayList;

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

        var universities = new ArrayList<University>();
        universities.add(new University());
        for (int i = 1; i < sideSize - 1; i++) {
            PlayingField.addObject(new Coords(i, i), universities.get(0));
        }

        TemporaryObjects.addObject(new Coords(1, 1), new Beer());
        TemporaryObjects.addObject(new Coords(1, 2), new Beer());
        TemporaryObjects.addObject(new Coords(1, 3), new Beer());
        TemporaryObjects.addObject(new Coords(2, 1), new EasyTask());
        TemporaryObjects.addObject(new Coords(3, 1), new HardTask());

        Display.display(universities);

        //System.out.println(colorize("Temporary object - beer: ", BRIGHT_BLACK_TEXT(), BLACK_BACK()) + colorize("B", BLACK_TEXT(), CYAN_BACK()));

        /*
        System.out.println();
        int objects = FieldObjectCounting.getNumberOfObjects();
        System.out.println("objects: " + objects);
        */
    }
}

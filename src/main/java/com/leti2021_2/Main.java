package com.leti2021_2;

import com.leti2021_2.FieldObjects.Factories.JuniorUnitAbstractFactory;
import com.leti2021_2.FieldObjects.Factories.UniversityFactory;
import com.leti2021_2.FieldObjects.University;

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
        var university = universityFactory.createObject();
        System.out.println(university.getDescription());

        int sidesize = 15;
        var playingField = new PlayingField(sidesize);

        var univercity = new University();
        for (int i = 1; i < sidesize - 1; i++) {
            PlayingField.addObject(new Coords(i, i), univercity);
        }

        Display.display(playingField);

        /*
        System.out.println();
        int objects = FieldObjectCounting.getNumberOfObjects();
        System.out.println("objects: " + objects);
        */
    }
}

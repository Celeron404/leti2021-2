package com.leti2021_2;

import com.leti2021_2.playingFieldObjects.*;

public class Main {

    public static void main(String[] args) {

        var juniorFactory = new JuniorUnitFactory();
        var juniorTester = juniorFactory.createTester();
        var juniorProgrammer = juniorFactory.createProgrammer();
        var juniorSupportEngineer = juniorFactory.createSupportEngineer();
        System.out.println("junior units:");
        System.out.println(juniorTester.getDescription());
        juniorTester.setHealth(50);
        System.out.println(juniorProgrammer.getDescription());
        System.out.println(juniorSupportEngineer.getDescription());
        System.out.println();

        var seniorFactory = new SeniorUnitFactory();
        var seniorTester = seniorFactory.createTester();
        var seniorProgrammer = seniorFactory.createProgrammer();
        var seniorSupportEngineer = seniorFactory.createSupportEngineer();
        System.out.println("senior units:");
        System.out.println(seniorTester.getDescription());
        System.out.println(seniorProgrammer.getDescription());
        System.out.println(seniorSupportEngineer.getDescription());
    }
}

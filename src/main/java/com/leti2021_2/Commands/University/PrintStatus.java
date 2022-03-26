package com.leti2021_2.Commands.University;

import com.leti2021_2.Commands.Command;
import com.leti2021_2.FieldObjects.University;
import com.leti2021_2.UserData;

public class PrintStatus extends Command {
    public PrintStatus(UserData userData) {
        super(userData);
    }

    public void execute() {
        University university = userData.currentUniversity;
        System.out.println(university.getDescription());
        System.out.println("University's health: " + university.getHealth());
        System.out.println("Number of units: " + university.getNumberOfUnits());
        System.out.println("Maximum possible number of units: " + University.maxUnits);
        System.out.println();
    }
}

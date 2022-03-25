package com.leti2021_2.Commands.Units;

import com.leti2021_2.Commands.Command;
import com.leti2021_2.UserData;

public class PrintStatus extends Command {

    public PrintStatus(UserData userData) {
        super(userData);
    }

    public void execute() {
        System.out.println();
        System.out.println("Unit's description: " + userData.currentUnit.getDescription());
        System.out.println("Unit's health: " + userData.currentUnit.getHealth() +
                ", stress tolerance: " + userData.currentUnit.getStressTolerance() +
                ", skill lvl: " + userData.currentUnit.getSkillLvl());
        System.out.println();
    }
}

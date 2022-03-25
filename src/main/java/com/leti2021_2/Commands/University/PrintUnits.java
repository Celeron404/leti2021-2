package com.leti2021_2.Commands.University;

import com.leti2021_2.Commands.Command;
import com.leti2021_2.UserData;

public class PrintUnits extends Command {
    public PrintUnits(UserData userData) {
        super(userData);
    }

    public void execute() {
        userData.currentUniversity.printUnits();
    }
}

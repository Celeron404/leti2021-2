package com.leti2021_2.Commands.Units;

import com.leti2021_2.Commands.Command;
import com.leti2021_2.FieldObjects.UnitMover;
import com.leti2021_2.UserData;

public class Move extends Command {

    public Move(UserData userData) {
        super(userData);
    }

    public void execute() {
        var mover = new UnitMover();
        mover.move(userData.currentUnit, userData.unitCoords,
                userData.moveDirection, userData.stepsToMove);
    }
}

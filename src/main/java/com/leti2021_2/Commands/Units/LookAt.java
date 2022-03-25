package com.leti2021_2.Commands.Units;

import com.leti2021_2.Commands.Command;
import com.leti2021_2.Coords;
import com.leti2021_2.FieldObjects.FieldObject;
import com.leti2021_2.GUI.Display;
import com.leti2021_2.UserData;

public class LookAt extends Command {

    public LookAt(UserData userData) {
        super(userData);
    }

    public void execute() {
        Coords displayCoords = new Coords(userData.unitCoords);
        switch(super.userData.lookDirection) {
            case UP -> displayCoords.setY(displayCoords.getY() + 1);
            case LEFT -> displayCoords.setX(displayCoords.getX() - 1);
            case DOWN -> displayCoords.setY(displayCoords.getY() - 1);
            case RIGHT -> displayCoords.setX(displayCoords.getX() + 1);
        }
        FieldObject object = Display.getObjectByPriority(displayCoords);
        System.out.println(object.getDescription());
    }
}

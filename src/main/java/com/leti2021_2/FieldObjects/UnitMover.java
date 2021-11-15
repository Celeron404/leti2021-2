package com.leti2021_2.FieldObjects;

import com.leti2021_2.Coords;
import com.leti2021_2.Display;
import com.leti2021_2.FieldObjects.LandscapeObjects.PassableLandscapeObject;
import com.leti2021_2.FieldObjects.Units.Unit;
import com.leti2021_2.PlayingField;
import com.leti2021_2.TemporaryObjects;

import java.lang.reflect.Field;

public class UnitMover {
    public void move(Unit unit, Coords unitCoords, Direction direction, int numberOfSteps) {

        Coords directionCoords = stepCoords(unitCoords, direction);

        for (int i = 0; i < numberOfSteps; i++) {
            var stepper = new DoStepperWithPossibilityChecking();
            stepper.doStep(unit, unitCoords, direction);
        }

        // учесть модификаторы движения от ландшафта

        // передвинуть в нужном направлении

        // отрисовать c учётом всех Map


    }

    // proxy
    interface DoStep {
        void doStep(Unit unit, Coords unitCoords, Direction direction);
    }

    class DoStepper implements DoStep {
        @Override
        public void doStep(Unit unit, Coords unitCoords, Direction direction) {
            Coords targetCoords = stepCoords(unitCoords, direction);

            unitCoords.setX(targetCoords.getX());
            unitCoords.setY(targetCoords.getY());

            Display.display();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    class DoStepperWithPossibilityChecking implements DoStep {
        @Override
        public void doStep(Unit unit, Coords unitCoords, Direction direction) {
            Coords targetCoords = stepCoords(unitCoords, direction);

            // debugging
            FieldObject v = PlayingField.getObject(targetCoords);
            boolean v1 = v.isPassable();
            if (PlayingField.getObject(targetCoords).isPassable()) {
                var temporaryObject = (PassableLandscapeObject) PlayingField.getObject(targetCoords);
                int p = temporaryObject.getPassability();

                try {
                    Thread.sleep(500 * p - 500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                var doStepper = new DoStepper();
                doStepper.doStep(unit, unitCoords, direction);
            } else
                System.out.println(PlayingField.getObject(targetCoords).getDescription());
        }
    }


    private Coords stepCoords(Coords currentCoords, Direction direction) {
        var targetCoords = new Coords(currentCoords.getX(), currentCoords.getY());
        switch (direction) {
            case UP:
                targetCoords.setY(currentCoords.getY() + 1);
                return targetCoords;
            case DOWN:
                targetCoords.setY(currentCoords.getY() - 1);
                return targetCoords;
            case LEFT:
                targetCoords.setX(currentCoords.getX() - 1);
                return targetCoords;
            case RIGHT:
                targetCoords.setX(currentCoords.getX() + 1);
                return targetCoords;
        }
        return null;
    }
}

package com.leti2021_2.FieldObjects;

import com.leti2021_2.Coords;
import com.leti2021_2.Display;
import com.leti2021_2.FieldObjects.LandscapeObjects.PassableLandscapeObject;
import com.leti2021_2.FieldObjects.TemporaryObjectsStrategies.TemporaryObjectStrategySetter;
import com.leti2021_2.FieldObjects.Units.Unit;
import com.leti2021_2.PlayingField;

public class UnitMover {
    public void move(Unit unit, Coords unitCoords, Direction direction, int numberOfSteps) {

        Coords directionCoords = stepCoords(unitCoords, direction);

        for (int i = 0; i < numberOfSteps; i++) {
            boolean isStepComplete;
            var stepper = new DoStepperWithPossibilityChecking();
            isStepComplete = stepper.doStep(unit, unitCoords, direction);
            if (!isStepComplete)
                break;
        }
    }

    // proxy
    interface DoStep {
        boolean doStep(Unit unit, Coords unitCoords, Direction direction);
    }

    class DoStepper implements DoStep {
        @Override
        public boolean doStep(Unit unit, Coords unitCoords, Direction direction) {
            Coords targetCoords = stepCoords(unitCoords, direction);

            unitCoords.setX(targetCoords.getX());
            unitCoords.setY(targetCoords.getY());

            Display.run();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return true;
        }
    }

    class DoStepperWithPossibilityChecking implements DoStep {
        @Override
        public boolean doStep(Unit unit, Coords unitCoords, Direction direction) {
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
            } else {
                System.out.println(PlayingField.getObject(targetCoords).getDescription());
                return false;
            }
            if (TemporaryObjectsMap.getObject(targetCoords) != null) {
                TemporaryObject currentObject = (TemporaryObject) TemporaryObjectsMap.getObject(targetCoords);
                new TemporaryObjectStrategySetter().set(unit.getType(), currentObject);
                currentObject.interactWithUnit(unit);
                TemporaryObjectsMap.removeObject(targetCoords);
            }
            var doStepper = new DoStepper();
            return doStepper.doStep(unit, unitCoords, direction);
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
